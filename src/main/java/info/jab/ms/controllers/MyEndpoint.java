package info.jab.ms.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import info.jab.ms.services.MyService;

@RestController
public class MyEndpoint {
    
    private static final Logger logger = LoggerFactory.getLogger(MyEndpoint.class);

    @Autowired
    private MyService myService;

    @GetMapping("/v1/demo")
    public List<String> getData() {
        logger.info("Retrieving the information");
        return myService.getData();
    }

}
