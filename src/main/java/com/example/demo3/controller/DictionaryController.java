package com.example.demo3.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo3.bean.Dictionary;
import com.example.demo3.common.AjaxResult;
import com.example.demo3.mapper.DictionaryMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("all")
@RequestMapping("/dict")
@RestController
public class DictionaryController  {

    private Gson gson = new Gson();

    @Autowired
    DictionaryMapper dictionaryMapper;

    @PostMapping("/index")
    public AjaxResult index(@RequestBody Dictionary dict){
        QueryWrapper<Dictionary> dictionaryQueryWrapper = new QueryWrapper<Dictionary>();
        if(dict.getType() !=null){
            dictionaryQueryWrapper.eq("type",dict.getType());
        }

        List<Dictionary> dictionaries = dictionaryMapper.selectList(dictionaryQueryWrapper);
        AjaxResult success = new AjaxResult(200, "SUCCESS", dictionaries);
        return success;

    }
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Dictionary dict){
        System.out.println(dict);
        int result = dictionaryMapper.insert(dict);

        return  result>0?AjaxResult.success():AjaxResult.error();
    }

    @PostMapping("/update")
    public AjaxResult update(@RequestBody Dictionary dict){
        System.out.println(dict);
        QueryWrapper<Dictionary> dictionaryQueryWrapper = new QueryWrapper<Dictionary>();
        dictionaryQueryWrapper.eq("id",dict.getId());
        int result = dictionaryMapper.update(dict,dictionaryQueryWrapper);
        return  result>0?AjaxResult.success():AjaxResult.error();
    }

    @PostMapping("/delete")
    public AjaxResult delete(@RequestParam int id){
        int result = dictionaryMapper.deleteById(id);
        return  result>0?AjaxResult.success():AjaxResult.error();
    }


}
