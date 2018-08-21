package cn.itcast.pojo;

/**
 * Mapper class
 *
 * @author 李茂林
 * @date 2018/7/27
 */
public class Mapper {
    private String querySql;
    private String resultType;

    public String getQuerySql() {
        return querySql;
    }

    public void setQuerySql(String querySql) {
        this.querySql = querySql;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
