package com.mrchen.dockerdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: seataDemo
 * @Package: com.didispace.alibaba.nacos.discovery.server.common.aop
 * @ClassName: AopUser
 * @Author: Administrator
 * @Description:
 * @Date: 2021/8/30 14:37
 * @Version: 1.0
 */

@Component
@Aspect
public class AopUser {

    //申明一个切点 里面是excution表达式
    @Pointcut("execution(* com.mrchen.dockerdemo.controller.*.*(..))")
    private void aopTest() {
    }


    @Around(value = "aopTest()")
    public Integer run1(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取方法参数值数组
        Object[] args = joinPoint.getArgs();
        System.out.println("方法参数为:"+ args);
        System.out.println("方法环绕");
        //这个就是让将参数给目标方法的,获取结果在通过这里做处理返回给前端
        Object result = joinPoint.proceed(args);
        System.out.println("方法返回结果：" + result);
        return Integer.parseInt(result.toString());
    }
}
