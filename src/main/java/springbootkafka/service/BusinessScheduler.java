package springbootkafka.service;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BusinessScheduler {
    private BusinessLogicService service = new BusinessLogicServiceImpl();

   @Scheduled(initialDelay = 1000L, fixedDelay = 5000L)
    void doWork() {
        service.sendMessage();
    }
}
