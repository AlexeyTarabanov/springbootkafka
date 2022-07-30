package springbootkafka.service;

import org.apache.logging.log4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {
    private int count = 1;
    @Override
    public void sendMessage() {
        System.out.println(count + ". Hello, Bro! Thank you for your work!");
        count++;
    }

}
