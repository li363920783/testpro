package cn.itcast.mapepr;

import cn.itcast.annotation.Select;
import cn.itcast.pojo.User;

import java.util.List;

/**
 * UserDao class
 *  userDao代理接口
 * @author 李茂林
 * @date 2018/7/27
 */

public interface UserDao {
    /**
     * 查询全部
     * @return 全部用户
     * @throws Exception 就是异常嘛
     */
    @Select(value = "select * from user")
    List<User> findAll()throws Exception;

}
