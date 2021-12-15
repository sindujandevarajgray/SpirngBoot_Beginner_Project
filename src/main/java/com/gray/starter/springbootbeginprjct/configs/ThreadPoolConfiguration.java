package com.gray.starter.springbootbeginprjct.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/15/2021
 * Time: 9:02 AM
 * SpringBoot-BeginPrjct
 */
@Configuration
public class ThreadPoolConfiguration {

    private final Environment environment;

    @Autowired
    public ThreadPoolConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean("ThreadPoolExecutor")
    public Executor sinkTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(Integer.parseInt(environment.getRequiredProperty("executor.core.pool.size")));
        executor.setMaxPoolSize(Integer.parseInt(environment.getRequiredProperty("executor.max.pool.size")));
        executor.setQueueCapacity(Integer.parseInt(environment.getRequiredProperty("executor.queue.size")));
        executor.setThreadNamePrefix("EXECUTOR-X");
        executor.initialize();
        return executor;
    }

}
