package com.houjun.security;

import com.houjun.exception.ImageCodeAuthenticationException;
import com.houjun.handler.MyAuthenticationFailureHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * m每次请求都会调用的过滤器
 * 我用来处理验证码对比，模拟  验证码固定0000
 */

public class ImageCodeFilter extends OncePerRequestFilter {
    @Autowired
    private MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String uri = httpServletRequest.getRequestURI();
        if (uri.contains("/login")) {
            String imageCode = httpServletRequest.getParameter("imageCode");
            try {
                if(StringUtils.isEmpty(imageCode)){
                    throw new ImageCodeAuthenticationException("验证码不能为空！");
                }
                if (!imageCode.trim().equals("0000")){
                    throw new ImageCodeAuthenticationException("验证码填写错误！");
                }
            } catch (ImageCodeAuthenticationException e) {
                myAuthenticationFailureHandler.onAuthenticationFailure(httpServletRequest,httpServletResponse,e);
                return;//不能在往下执行了，必须返回。
            }

        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);//调用下一个过滤器
    }
}
