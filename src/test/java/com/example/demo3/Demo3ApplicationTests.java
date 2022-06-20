package com.example.demo3;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.example.demo3.bean.Dictionary;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {



    @Test
    void contextLoads() {
        //1.全局配置
        GlobalConfig config = new GlobalConfig();
        
        //2.数据源配置
        //3.策略配置
        //4.包名策略配置
        //5.整合配置
    }

}
