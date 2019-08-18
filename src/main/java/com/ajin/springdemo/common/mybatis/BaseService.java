package com.ajin.springdemo.common.mybatis;

import java.util.List;

/**
 * @author zgk
 * @version V1.0
 * @ClassName BaseService
 * @Description 通用Service接口
 * @Date 2019/2/19 11:02
 */
public interface BaseService<T>{

    int deleteByPrimaryKey(Object key);


    int delete(T record);


    int insert(T record);


    int insertSelective(T record);


    boolean existsWithPrimaryKey(Object key);

    List<T> selectAll();


    T selectByPrimaryKey(Object key);


    int selectCount(T record);


    List<T> select(T record);


    T selectOne(T record);

    int updateByPrimaryKey(T record);


    int updateByPrimaryKeySelective(T record);


    int deleteByCondition(Object condition);


    List<T> selectByCondition(Object condition);


    int selectCountByCondition(Object condition);


    int updateByCondition(T record, Object condition);


    int updateByConditionSelective(T record, Object condition);


    int deleteByIds(String ids);


    List<T> selectByIds(String ids);


    int insertList(List<? extends T> recordList);


    int insertUseGeneratedKeys(T record);


}
