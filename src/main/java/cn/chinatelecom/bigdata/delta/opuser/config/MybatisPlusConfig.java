package cn.chinatelecom.bigdata.delta.opuser.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Schumiyi
 * @date 2020/1/14
 */
@Configuration
@MapperScan(basePackages = {"cn.chinatelecom.bigdata.delta.opuser.mapper"})
public class MybatisPlusConfig {

    /**
     * mybatis-plus分页插件
     * 文档：http://mp.baomidou.com
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}

