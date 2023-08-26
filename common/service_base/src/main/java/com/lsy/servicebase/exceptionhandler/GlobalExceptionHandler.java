package com.lsy.servicebase.exceptionhandler;

import com.lsy.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author liusy
 * @Date 2023/8/26 14:24
 * @Description 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //指定出现什么异常执行该方法
    @ExceptionHandler(Exception.class)
    @ResponseBody //返回数据
    public R error(Exception e) {
        e.printStackTrace();
        return R.error().message("有点小问题，请联系渝哥！");
    }
}