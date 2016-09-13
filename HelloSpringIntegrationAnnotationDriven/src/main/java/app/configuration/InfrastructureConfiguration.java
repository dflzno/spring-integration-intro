package app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
@ComponentScan(basePackages = "app")
@IntegrationComponentScan(basePackages = "app")
public class InfrastructureConfiguration {
	
	@Bean
	public MessageChannel helloWorldChannel() {
		return new DirectChannel();
	}

	@Bean
	public MessageChannel helloWorldWithReplyChannel() {
		return new DirectChannel();
	}
}
 