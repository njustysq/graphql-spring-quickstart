package io.graphql.quickstart.autoconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author phy
 * @version 1.0
 * @date 2021/1/24 16:37
 */
@Slf4j
@Configuration
@ConditionalOnWebApplication
@ComponentScan(basePackages = {"io.graphql.quickstart"})
public class QuickStartAutoConfiguration {

    @Autowired
    private ApplicationContext ctx;

    @PostConstruct
    public void init() {
        log.info(">>>QuickStartAutoConfiguration|init|success. ctx={}", ctx);
    }
}
