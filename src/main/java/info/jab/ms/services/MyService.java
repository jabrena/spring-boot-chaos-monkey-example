package info.jab.ms.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);


    public List<String> getData() {
        logger.info("Processing data");
        return List.of("Hello", "World");
    }

}
