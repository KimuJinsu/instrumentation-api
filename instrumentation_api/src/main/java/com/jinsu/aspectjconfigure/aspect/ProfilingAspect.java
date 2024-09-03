package com.jinsu.aspectjconfigure.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class ProfilingAspect {

    @Around("methodsToBeProfiled()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch(getClass().getSimpleName());
        try {
            sw.start(pjp.getSignature().getName());
            System.out.println("ProfilingAspect::profile: Starting method " + pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            System.out.println("ProfilingAspect::profile: Method " + pjp.getSignature().getName() + " executed in " + sw.getTotalTimeMillis() + "ms");
            System.out.println(sw.prettyPrint());
        }
    }

    @Pointcut("execution(public * com.jinsu.aspectjconfigure..*.*(..))")
    public void methodsToBeProfiled(){}
}