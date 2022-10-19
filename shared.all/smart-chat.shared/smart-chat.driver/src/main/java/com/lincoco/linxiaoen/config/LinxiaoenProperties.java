package com.lincoco.linxiaoen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author ：xys
 * @description：TODO
 * @date ：2022/10/19
 */
@Component
@PropertySource(value = "file:linxiaoen.config.yml",factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "linxiaoen")
@Data
public class LinxiaoenProperties {

    private String master;

}
