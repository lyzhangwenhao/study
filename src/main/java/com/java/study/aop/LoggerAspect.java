package com.java.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * AOP测试
 *
 * @author zhangwenhao
 * @date 2022-04-02 17:51
 */
@Aspect
@Component
public class LoggerAspect {

    private final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("execution(public String com.java.study.aop.service.impl.SendMessageImpl.send(..))")
    public void logger() {
    }

    @Before("logger()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        logger.info("方法执行前。。。。");
    }

    @AfterReturning(returning = "ret", pointcut = "logger()")
    public void doAfterReturning(JoinPoint joinPoint, Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("方法的返回值 : " + ret);
    }

    /**
     * description: 后置异常通知
     * @author zhangwenhao
     * @date 2022/4/6 15:40
     * @param jp --
     */
    @AfterThrowing("logger()")
    public void throwss(JoinPoint jp){
        System.out.println("方法异常时执行.....");
    }

    /**
     * description: 后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
     * @author zhangwenhao
     * @date 2022/4/6 15:40
     * @param jp --
     */
    @After("logger()")
    public void after(JoinPoint jp){
        System.out.println("方法最后执行.....");
    }

    /**
     * description: 环绕通知,环绕增强，相当于MethodInterceptor
     * @author zhangwenhao
     * @date 2022/4/6 15:39
     * @param pjp --
     * @return java.lang.Object
     */
    @Around("logger()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("方法环绕start.....");
        try {
            Object o =  pjp.proceed();
            System.out.println("方法环绕proceed，结果是 :" + o);
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}
