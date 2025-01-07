package fp.spring.kafkaIntegration.producer;

import fp.spring.kafkaIntegration.config.ApplicationConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import javax.annotation.PostConstruct;
import java.util.Date;

@Slf4j
@Component
public class ProducerComponent {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(applicationConfig.getTopicName(), msg);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                log.error("Unable to send message:" + ex.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("Sent message:" + result.getProducerRecord().value() +
                        ",  offset:" + result.getRecordMetadata().offset() );
            }
        });
    }

    @Scheduled(fixedDelay = 5000)
    public void test(){
        sendMessage("Message - " + new Date());
        log.info("Test Message sent");
    }

}
