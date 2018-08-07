package cn.zxc.study.day01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class StartApplication {
    @Value("${envirment}")
    private String env;
    @RequestMapping("/")
    String home() {
        return "hello word,"+env;
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
//        SpringApplication app = new SpringApplication(MySpringConfiguration.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
    }
}
