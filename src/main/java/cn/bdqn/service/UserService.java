package cn.bdqn.service;

import cn.bdqn.pojo.Users;
import cn.bdqn.util.PageBean;

public interface UserService {
    PageBean<Users> list(String username, int currPageNo, int pageSize);
    int getuserid(String username);
//添加
    void add(Users u);
//删除
    void delete(Integer id);

    Users getUserById(int id);
//修改
    void update(Users users);
}
