package com.ajin.springdemo.common.mybatis;

import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @ClassName BaseEntity
 * @Description TODO
 * @Author yhw
 * @Date 2019/2/19 14:39
 * @Version V1.0
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2393269568666085258L;
    @Transient
    private Integer pageNum;
    @Transient
    private Integer pageSize;
}
