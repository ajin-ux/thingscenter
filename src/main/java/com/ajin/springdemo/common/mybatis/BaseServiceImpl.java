package com.ajin.springdemo.common.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author zgk
 * @version V1.0
 * @ClassName BaseServiceImpl
 * @Description 通用Service接口的实现类
 * @Date 2019/2/19 11:02
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T> {


    @Autowired
    private Mapper<T> basesMapper;

    @Override
    public int deleteByPrimaryKey(Object key) {
        return basesMapper.deleteByPrimaryKey(key);
    }


    @Override
    public int delete(T record) {
        return basesMapper.delete(record);
    }


    @Override
    public int insert(T record) {
        return basesMapper.insert(record);
    }


    @Override
    public int insertSelective(T record) {
        return basesMapper.insertSelective(record);
    }

    @Override
    public boolean existsWithPrimaryKey(Object key) {
        return basesMapper.existsWithPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return basesMapper.selectAll();
    }


    @Override
    public T selectByPrimaryKey(Object key) {
        return basesMapper.selectByPrimaryKey(key);
    }


    @Override
    public int selectCount(T record) {
        return basesMapper.selectCount(record);
    }


    @Override
    public List<T> select(T record) {
        return basesMapper.select(record);
    }


    @Override
    public T selectOne(T record) {
        return basesMapper.selectOne(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return basesMapper.updateByPrimaryKey(record);
    }


    @Override
    public int updateByPrimaryKeySelective(T record) {
        return basesMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int deleteByCondition(Object condition) {
        return basesMapper.deleteByExample(condition);
    }


    @Override
    public List<T> selectByCondition(Object condition) {
        return basesMapper.selectByExample(condition);
    }


    @Override
    public int selectCountByCondition(Object condition) {
        return basesMapper.selectCountByExample(condition);
    }


    @Override
    public int updateByCondition(T record, Object condition) {
        return basesMapper.updateByExample(record,condition);
    }


    @Override
    public int updateByConditionSelective(T record, Object condition) {
        return basesMapper.updateByExampleSelective(record, condition);
    }

    @Override
    public int deleteByIds(String ids) {
        return 0;
    }

    @Override
    public List<T> selectByIds(String ids) {
        return null;
    }

    @Override
    public int insertList(List<? extends T> recordList) {
        return 0;
    }

    @Override
    public int insertUseGeneratedKeys(T record) {
        return 0;
    }


}
