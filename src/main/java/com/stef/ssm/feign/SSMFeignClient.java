package com.stef.ssm.feign;


import com.stef.common.RespBean;
import com.stef.ssm.feign.fallback.SSMClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "my-saas-ssm", fallback= SSMClientFallback.class)
public interface SSMFeignClient {

    /**
     * echo接口
     * @param msg 消息
     * @return RespBean
     */
    @RequestMapping(value = "/echo/{msg}",method= RequestMethod.GET)
    RespBean echo(@PathVariable("msg") String msg);


}
