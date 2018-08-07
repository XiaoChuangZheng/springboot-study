package cn.zxc.study.day01.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class MyServerConfig {
    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return this.list;
    }
}
