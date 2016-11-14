package cn.smile.springuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    /**
     * 
     * Description:
     * @author yacong_liu Email:2682505646@qq.com
     * @date 2016年11月11日
     * @return
     */
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(){
        return "home";
    }

}
