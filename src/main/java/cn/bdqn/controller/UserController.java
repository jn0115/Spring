package cn.bdqn.controller;

import cn.bdqn.pojo.Users;
import cn.bdqn.service.UserService;
import cn.bdqn.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
//查询所有加分页
    @RequestMapping("list")
    public String list(Model model, @RequestParam(value = "currPageNo", defaultValue = "3", required = false) int currPageNo,
                       @RequestParam(value = "username", required = false) String username) {
        PageBean<Users> userlist = userService.list(username, currPageNo, 3);
        model.addAttribute("userlist", userlist);
        return "list";
    }
    //添加跳转
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }
    //添加方法
    @RequestMapping("add")
    public String add(Users u){
        userService.add(u);
        return "redirect:/list";
    }
    //删除
    @RequestMapping("delete")
    public String delete(Integer id){
        userService.delete(id);
        return "redirect:/list";
    }
    //修改跳转
    @RequestMapping("toUpdate")
    public String list(Model model,int id){
        Users user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "update";
    }
    //修改方法
    @RequestMapping("update")
    public String update(Users users){
        userService.update(users);
        return "redirect:/list";
    }
}