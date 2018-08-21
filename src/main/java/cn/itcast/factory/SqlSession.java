package cn.itcast.factory;

import java.util.List;

/**
 * SqlSession class
 *
 * @author 李茂林
 * @date 2018/7/27
 */
public interface SqlSession {

    public <T> List<T> selectList(String mapperId)throws Exception;

    public <T> T getMapper(Class clazz) throws Exception;

}
