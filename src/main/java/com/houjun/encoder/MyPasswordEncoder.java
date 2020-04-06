package com.houjun.encoder;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {
    //dui前台传来的密码进行加密
    @Override
    public String encode(CharSequence charSequence) {
        //不做任何加密操作
        return charSequence.toString();
    }

    //对比User中的密码和前台传来的密码
    @Override
    public boolean matches(CharSequence charSequence, String s) {
        if (s.equals(charSequence.toString())) {
            return true;
        }
        return false;
    }
}
