package com.chenzhijun.exception.handler;

import com.chenzhijun.exception.entity.ResultData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ResultData<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ResultData<String> r = new ResultData<>();
        r.setSuccessed(false);
        r.setErrorMsg(e.getMessage());
        r.setErrorCode("100001");
        r.setUrl(req.getRequestURL().toString());
        return r;

    }
}