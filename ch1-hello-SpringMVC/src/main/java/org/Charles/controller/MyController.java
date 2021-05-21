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
 * @Controller创建处理器对象，对象放在SpringMVC容器中
 * 位置：在类的上面
 * 和spring中讲的@service， @Component
 */

@Controller
public class MyController {

    /**
     * 准备使用dosome处理some.do请求
     * @RequestMapping: 请求映射，把一个请求地址和一个方法绑定在一起，一个请求指定一个方法处理
     * 属性： 1.value是一个string，表示请求的URI地址
     *          value的值必须唯一，不能重复。在使用时，推荐地址以'/'
     * 位置： 1.在方法上 2.在类上
     *
     * 说明：使用RequestMapping修饰的方法叫做处理器方法或者控制器方法
     * 使用该注释修饰的方法可以处理请求，类似Servlet中的doGet(), doPost()
     *
     * 返回值： ModelAndView 表示本次请求的处理结果
     * Model ： 数据，请求处理完成后，要显示给用户的数据
     * view ：  视图，如jsp等
     *
     *
     * @return
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() { // doGet()
        //处理some.do请求，相当于service调用处理完成了
        ModelAndView mv = new ModelAndView();
        // 添加数据，框架在请求的最后把数据放入到request作用域中
        // request.setAttribute("msg", "Welcome to use SpringMVC")
        mv.addObject("msg", "Welcome to use SpringMVC!");
        mv.addObject("fun", "Execute doSome()");

        // 指定视图,指定视图的完整路径
        // 框架对视图执行的forward操作，request.getRequestDispatcher("/show.jsp").forward(...)
        //mv.setViewName("WEB-INF/view/show.jsp");

        //当配置了视图解析器后，可以使用逻辑名称（文件名），指定视图
        //框架会使用视图解析器的前缀 + 逻辑名称 + 后缀 组成完成路径
        mv.setViewName("show");

        return mv;
    }

    @RequestMapping(value = {"/other.do", "/first.do"})
    public ModelAndView doOther() { // doGet()
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Welcome to use SpringMVC!");
        mv.addObject("fun", "Execute doOther()");
        mv.setViewName("other");

        return mv;
    }
}
