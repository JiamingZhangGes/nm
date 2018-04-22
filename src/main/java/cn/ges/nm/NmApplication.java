package cn.ges.nm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//  项目中对应的mapper类的路径
@MapperScan("cn.ges.mapper")
@SpringBootApplication
public class NmApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmApplication.class, args);
    }
}
