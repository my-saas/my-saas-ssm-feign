package com.stef.ssm.feign.fallback;

import com.stef.common.RespBean;
import com.stef.ssm.feign.SSMFeignClient;
import org.springframework.stereotype.Component;

@Component
public class SSMClientFallback implements SSMFeignClient {

    @Override
    public RespBean echo(String msg) {
        return RespBean.error("服务降级返回，此时可以使用兜底数据.");
    }
}
