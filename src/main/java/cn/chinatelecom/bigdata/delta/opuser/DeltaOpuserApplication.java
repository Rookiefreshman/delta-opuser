package cn.chinatelecom.bigdata.delta.opuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author dffuture
 */
//
//@SpringBootApplication(scanBasePackages = {
//		"cn.chinatelecom.bigdata.delta.cmdb",
//		"cn.chinatelecom.bigdata.delta.common"},
//		exclude = {MultipartAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = {
		"cn.chinatelecom.bigdata.delta.opuser",
		"cn.chinatelecom.bigdata.delta.common"} )
//@MapperScan("cn.chinatelecom.bigdata.delta.opuser.mapper")
public class DeltaOpuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeltaOpuserApplication.class, args);
	}

}
