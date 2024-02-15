package com.ghost.leapiinterface.controller;

import com.ghost.leapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

/**
 * name 接口
 * @author 乐小鑫
 * @version 1.0
 * @Date 2024-02-01-16:29
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是：" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getNameByJSON(@RequestBody User user, HttpServletRequest request) {
        // 获取请求头中携带的参数，校验调用接口的权限
//        String accessKey = request.getHeader("accessKey");
//        String secretKey = request.getHeader("secretKey");
//        String nonce = request.getHeader("nonce");
//        String body = request.getHeader("body");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
        // TODO 实际上要从数据库查是否已分配给用户
//        if (!accessKey.equals("ghost")) {
//            throw new RuntimeException("无权限");
//        }
        // 校验随机数
//        if (nonce.length() > 5) {
//            throw new RuntimeException("无权限");
//        }

        // 和客户端使用同一套加密算法进行校验
//        String serverSign = SignUtil.genSign(body, "abcdefg");// 实际上要从数据库中取出数据进行校验
//        if (!serverSign.equals(sign)) {
//            throw new RuntimeException("无权限");
//        }
//        System.out.println("getNameByJSON 被调用，accessKey: " + accessKey + "; secretKey:" +secretKey);
        return "POST 你的名字是：" + user.getUsername();
    }
}
