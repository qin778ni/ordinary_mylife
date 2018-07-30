package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author:ms.y
 * @create 2018/7/30-11:14
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login.do")
    public void login(HttpServletRequest request, HttpServletResponse response) {

        boolean tag = userService.findUserById(request.getParameter("id"));

        if (tag) {
            System.out.println("ok");
        }else {
            System.out.println("false");
        }
    }

}
