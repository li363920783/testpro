package cn.itcast.pojo;

import java.util.Map;

/**
 * Configuration class
 * 核心配置类,数据库信息 和sql的map集合
 * @author 李茂林
 * @date 2018/7/27
 */
public class Configuration {
    /**
     * 数据库信息
     */
    private String username;
    private String password;
    private String url;
    private String driver;

    /**
     * sql语句和全限定名
     */
    private Map<String,Mapper> mapperMap;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Map<String, Mapper> getMapperMap() {
        return mapperMap;
    }

    public void setMapperMap(Map<String, Mapper> mapperMap) {
        this.mapperMap = mapperMap;
    }
}
