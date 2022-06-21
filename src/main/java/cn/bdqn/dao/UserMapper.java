package cn.bdqn.dao;

import cn.bdqn.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    List<Users> list(@Param("username") String username, @Param("currPageNo") int currPageNo, @Param("pageSize") int pageSize);

    int getuserid(@Param("username") String username);

    void add(Users u);

    void delete(Integer id);

    void update(Users users);
    @Select("select * from User where id=#{id}")
    Users getUserById(int id);
}
