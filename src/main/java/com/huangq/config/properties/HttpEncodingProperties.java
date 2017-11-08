package com.huangq.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

/**
 * Created by hq on 17/10/24.
 */
@Data
@Component
@PropertySource("classpath:/config/application.properties")
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {

    private static final Charset DEFAULT_CHASET = Charset.forName("UTF-8");
    private Charset charset = DEFAULT_CHASET;
    private boolean force = true;
}
