package com.javanik.in.crudusingredis.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableRedisRepositories
public class RedisConfig {


    // we have to create a method that have Redis data like host , port ....
    @Bean
    public JedisConnectionFactory connectionFactory()
    {
        RedisStandaloneConfiguration standaloneConfiguration =new RedisStandaloneConfiguration();
         standaloneConfiguration.setHostName("localhost");
         standaloneConfiguration.setPort(6379);

         return  new JedisConnectionFactory(standaloneConfiguration);
    }

    @Bean
    public RedisTemplate<String,Object> redisTemplate()
    {
        RedisTemplate<String , Object> template =new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new JdkSerializationRedisSerializer());
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        template.setEnableTransactionSupport(true);
        template.afterPropertiesSet();
        return template;
    }




}
