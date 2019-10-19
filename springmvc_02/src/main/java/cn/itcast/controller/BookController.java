package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
    @RequestMapping(value = "/book/{bid}",method = RequestMethod.GET)
    public String getBook(@PathVariable("bid")Integer id){
        System.out.println("获取到"+id+"图书");
        return "success";
    }
    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public String postBook(){
        System.out.println("添加了图书");
        return "success";
    }
    @RequestMapping(value = "book/{bid}",method = RequestMethod.PUT)
    public String putBook(@PathVariable("bid") Integer id){
        System.out.println("更新了"+id+"图书");
        return "success";
    }
}
