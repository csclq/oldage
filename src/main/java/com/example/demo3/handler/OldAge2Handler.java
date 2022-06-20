package com.example.demo3.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class OldAge2Handler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("insert-----------------");
        Long at =System.currentTimeMillis()/1000;
        Integer i = at.intValue();
        this.setFieldValByName("createdAt",i,metaObject);
        this.setFieldValByName("updatedAt",i,metaObject);
        System.out.println(metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("update-----------------");
        Long at =System.currentTimeMillis()/1000;
        Integer i = at.intValue();
        this.setFieldValByName("updatedAt",i,metaObject);
    }
}
