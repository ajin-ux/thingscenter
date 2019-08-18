package com.ajin.springdemo.common.mybatis;


import com.ajin.springdemo.common.wrapper.WrapMapper;
import com.ajin.springdemo.common.wrapper.Wrapper;

import static com.ajin.springdemo.common.wrapper.WrapMapper.isFlag;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author yhw
 * @Date 2019/2/19 15:59
 * @Version V1.0
 */
public class BaseController {
    /**
     * @Description: TODO
     * @param result t
     * @return: com.zkhd.smartcenter.common.wrapper.Wrapper
     * @Version: V1.0
     * @Author: yhw
     * @Date: 2019/2/20 9:41
     */
    protected <T> Wrapper handleResult(T result) {
        boolean flag = isFlag(result);
        if (flag) {
            return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "操作成功", result);
        } else {
            return WrapMapper.wrap(Wrapper.ERROR_CODE, "操作失败", result);
        }
    }
}
