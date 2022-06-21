package cn.bdqn.service.impl;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.Users;
import cn.bdqn.service.UserService;
import cn.bdqn.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public PageBean<Users> list(String username, int currPageNo, int pageSize) {
        PageBean<Users> page = new PageBean<Users>();
        page.setCurrPageNo(currPageNo);
        page.setPageSize(pageSize);
        int totalcount = userMapper.getuserid(username);
        page.setTotalCount(totalcount);
        int totalpagecount = totalcount%pageSize == 0?totalcount/pageSize:totalcount/pageSize+1;
        page.setTotalPageCount(totalcount);
        List<Users> list = userMapper.list(username,(currPageNo-1)*pageSize,pageSize);
        page.setLists(list);
        return page;
    }

    @Override
    public int getuserid(String username) {
        return userMapper.getuserid(username);
    }
//添加
    @Override
    public void add(Users u) {
        userMapper.add(u);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public Users getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void update(Users users) {
        userMapper.update(users);
    }
}
