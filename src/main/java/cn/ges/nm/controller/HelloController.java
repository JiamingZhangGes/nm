package cn.ges.nm.controller;


import cn.ges.nm.domain.User;
import cn.ges.nm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HttpServletRequest request;

//    @Autowired
//    private UserMapper mapper;

    @RequestMapping("/add")
    public String addUser() {
        User user = new User();
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
        user.setUserIp("192.1.2.3");
        user.setUserName("测试1");
        user.setUserMac("123");
//        mapper.addUser(user);
        return "yes";
    }
    @RequestMapping("/hello")
    public String hello() {
        // 获取访问地址

        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");

            // 获取请求的地址
            // remoteAddr = request.getHeader("Host");
            // System.out.println(remoteAddr);

            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

//        List<User> all = mapper.findAll();
//        System.out.println(all);
        // String macAddress = GetMacAddress.getMacAddress(remoteAddr);
        // System.out.println(macAddress);

        return "yes";
    }
}