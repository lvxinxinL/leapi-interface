package com.ghost.leapiinterface;

import com.ghost.leapiclientsdk.client.LeAPIClient;
import com.ghost.leapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LeapiInterfaceApplicationTests {

    @Resource
    private LeAPIClient leAPIClient;// 注入客户端实例

    @Test
    void testClientSDK() {
        // 调用接口
        String result = leAPIClient.getNameByGet("ghost");
        User user = new User();
        user.setUsername("ghost");
        String nameByJSON = leAPIClient.getNameByJSON(user);
        System.out.println(result);
        System.out.println(nameByJSON);
    }
}
