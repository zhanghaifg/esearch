package com.elastic.main.model;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.UUID;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.node.NodeBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.NodeClientFactoryBean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;



@Configuration
@EnableElasticsearchRepositories(basePackages = "com.elastic.main.repository")
public class ElasticsearchConfiguration {
	
	@Bean
	NodeBuilder nodeBuilder(){
		return new NodeBuilder();
	}
	
	@Bean
    public ElasticsearchOperations elasticsearchTemplate() throws IOException {
        File tmpDir = File.createTempFile("elastic", Long.toString(System.nanoTime()));
        System.out.println("Temp directory: " + tmpDir.getAbsolutePath());
        Settings.Builder elasticsearchSettings =
                Settings.settingsBuilder()
                        .put("http.enabled", "true") // 1
                        .put("index.number_of_shards", "1")
                        .put("path.data", new File(tmpDir, "data").getAbsolutePath()) // 2
                        .put("path.logs", new File(tmpDir, "logs").getAbsolutePath()) // 2
                        .put("path.work", new File(tmpDir, "work").getAbsolutePath()) // 2
                        .put("path.home", tmpDir); // 3



        return new ElasticsearchTemplate(nodeBuilder()
                .local(true)
                .settings(elasticsearchSettings.build())
                .node()
                .client());
    }
	
	/*@Bean
	public NodeClientFactoryBean client() {

		NodeClientFactoryBean bean = new NodeClientFactoryBean(true);
		bean.setClusterName(UUID.randomUUID().toString());
		bean.setEnableHttp(false);
		bean.setPathData("target/elasticsearchTestData");
		bean.setPathHome("src/test/resources/test-home-dir");

		return bean;
	}

	@Bean
	public ElasticsearchTemplate elasticsearchTemplate(Client client) throws Exception {
		return new ElasticsearchTemplate(client);
	}*/

}
