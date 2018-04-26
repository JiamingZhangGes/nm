package cn.ges.nm.mapper;

import cn.ges.nm.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author gespent@163.com
 */
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
     * @param user
     */
    public void addUser(User user);

}
