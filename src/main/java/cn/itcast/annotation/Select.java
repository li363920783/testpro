package cn.itcast.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Select class
 *
 * @author 李茂林
 * @date 2018/7/27
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Select {
    String value();

}
