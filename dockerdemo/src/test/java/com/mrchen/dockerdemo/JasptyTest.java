package com.mrchen.dockerdemo;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.core.env.StandardEnvironment;

/**
 * @ProjectName: dockerdemo
 * @Package: com.mrchen.dockerdemo
 * @ClassName: JasptyTest
 * @Author: Administrator
 * @Description:
 * @Date: 2021/9/13 10:38
 * @Version: 1.0
 */
public class JasptyTest {
    public static void main(String[] args) {
        StringEncryptor stringEncryptor = new DefaultLazyEncryptor(new StandardEnvironment());

        //加密方法
        System.out.println(stringEncryptor.encrypt("aaa"));
        //解密方法
        System.out.println(stringEncryptor.decrypt("saRv7ZnXsNAfsl3AL9OpCQ=="));
    }
}
