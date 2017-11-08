package com.huangq.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by hq on 17/10/23.
 */
@Data
@Component
@PropertySource("classpath:/config/application.properties")
@ConfigurationProperties(prefix = "server")
public class HQProperties {

    private String port;
    private String contextPath;

}
