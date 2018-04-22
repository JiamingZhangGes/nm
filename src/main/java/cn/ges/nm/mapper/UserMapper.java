package cn.ges.nm.mapper;

import cn.ges.nm.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> findAll();

    /**
     * 增加一个用户
     */
    public void addUser(User user);

}
