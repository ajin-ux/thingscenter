package com.ajin.springdemo.common.mybatis;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author yhw
 * @version V1.0
 * @ClassName BaseService
 * @Description 继承4个tk的mapper
 * @Date 2019/2/19 11:02
 */
public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>, MySqlMapper<T>, IdsMapper<T>, ConditionMapper<T> {

}
