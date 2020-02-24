package com.godfunc.websocket.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @RequestMapping(value = "/ws/{eid}",method = RequestMethod.GET)
    public String toStompWebSocket(HttpSession session,
                                   HttpServletRequest request,
                                   Model model, @PathVariable("eid") String eid)
    {
        // 这里封装一个登录的用户组参数，模拟进入通讯后的简单初始化
        model.addAttribute("groupId","user_groupId");
        model.addAttribute("eid", eid);
        System.out.println("跳转：" + session.getId());
        session.setAttribute("eid", eid);
        return "/index";

    }
}
