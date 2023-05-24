package com.example.dema.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.dema.entity.Carousel;
import com.example.dema.entity.UserInfo;
import com.example.dema.entity.View;
import com.example.dema.service.CarouselService;
import com.example.dema.service.UserService;
import com.example.dema.service.impl.ViewServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class SpringSecurityController {

    @Resource
    private CarouselService carouselService;
//
//    @Resource
//    private RouteService routeService;

    @Resource
    private ViewServiceImpl viewService;

//    @Resource
//    private FoodService foodService;
//
    @Resource
    private UserService userService;

    //1.进入网站首页;查询5个背景，2条热门路线，6个热门目的地，10道美食
    @RequestMapping(value = "/travel",method = RequestMethod.GET)
    public String travel(Model model) throws Exception{
        List<Carousel> carousels = carouselService.findFiveBackground();
//        List<Route> routes = routeService.findTwoHeat();
        List<View> views =  viewService.findSixDestination();
//        List<Food> foods = foodService.findTenFood();
        //对热门路线做一个动态热门图片的插入
//        for (int i = 0; i < routes.size(); i++) {
//            Route route = routes.get(i);
//            route.setUrl("../../images/top" + i + ".jpg");
//        }
        model.addAttribute("carousels",carousels);
//        model.addAttribute("routes",routes);
        model.addAttribute("view",views);
//        model.addAttribute("foods",foods);
        return "user/travel";
    }

    //3.用户执行登录操作
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    @ResponseBody
    public Object doLogin(@RequestParam("account") String username,
                          @RequestParam("password") String password,
                          HttpSession session) throws Exception{
        HashMap<String,String> loginResult = new HashMap<String, String>();
        UserInfo userI = userService.findUser(username,password);
        if (userI != null){
                //用户名密码正确

            session.setAttribute("userI",userI);
                loginResult.put("loginResult","true");
            System.err.println("登陆成功");
            }else {
                //账号不可用
                loginResult.put("loginResult","forbid");
            }
        return JSONArray.toJSONString(loginResult);
    }

    //3.用户退出旅游网站
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.removeAttribute("userInfo");
        return "redirect:travel";
    }

    //4.进入后台管理系统登录页面
    @RequestMapping(value = "/loginManage")
    public String loginManage(){
        return "loginManage";
    }

    //登录后台失败信息处理
    @RequestMapping("/loginManage/error")
    public String loginManageError(@RequestParam("message") String message, HttpSession session){
        session.setAttribute("message",message);
        return "loginManage";
    }

    //5.登录成功由SpringSecurity转发/manage进入后台管理界面
    @RequestMapping(value = "/manage")
    public String manage(){
        return "admin/manage";
    }

}
