package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients 	//开启feign
public class ConsumerFeighApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeighApplication.class, args);
	}

}
