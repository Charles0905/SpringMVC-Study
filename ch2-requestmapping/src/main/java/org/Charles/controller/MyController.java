package org.Charles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



/**
 * @author Charles
 * @date 2021-05-20 22:15
 */


/**
 * / @RequestMapping:
 *  value : 所有请求地址的公共部分，叫做模块名称
 *  位置 ： 放在类上面
 */

@Controller
@RequestMapping(value = "/user")
public class MyController {

    /**
     *  /@RequestMapping 请求映射
     *   属性 method， 表示请求方式。它的值RequestMethod类枚举值
     *   例如表示get请求方法， RequestMethod.GET
     *
     * @return
     */


    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome() { // doGet()
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Welcome to use SpringMVC!");
        mv.addObject("fun", "Execute doSome()");
        mv.setViewName("show");
        return mv;
    }

    // 指定other.do为post请求方式
    @RequestMapping(value = "other.do", method = RequestMethod.POST)
    public ModelAndView doOther() { // doGet()
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Welcome to use SpringMVC!");
        mv.addObject("fun", "Execute doOther()");
        mv.setViewName("other");
        return mv;
    }

    // 指定other.do为post请求方式
    @RequestMapping(value = "first.do")
    public ModelAndView doFirst() { // doGet()
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Welcome to use SpringMVC!");
        mv.addObject("fun", "Execute doFirst()");
        mv.setViewName("other");
        return mv;
    }
}
