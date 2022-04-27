package fp.spring.kafkaIntegration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Data
@Configuration
@ConfigurationProperties(prefix = "fp.spring")
public class ApplicationConfig {

    private String bootstrapServers;
    private String topicName;
    private String consumerGroupId;

    @PostConstruct
    public void init(){
        System.out.println("bootstrapServers: " + bootstrapServers
            + "\r\n consumerGroupId: " + consumerGroupId);
    }

}
