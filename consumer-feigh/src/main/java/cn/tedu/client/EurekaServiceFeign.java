package cn.tedu.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//这个接口相当于把原来的服务提供者项目当成一个Service类
@FeignClient(value="provider-user")
public interface EurekaServiceFeign {

	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
	public String hello(@PathVariable String name);
}
