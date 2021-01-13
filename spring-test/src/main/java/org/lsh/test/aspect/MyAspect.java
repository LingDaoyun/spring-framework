package org.lsh.test.aspect;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void BeforeAdvice1(){
		System.out.println(" before 1 ");
	}
	public void BeforeAdvice2(){
		System.out.println(" before 2 ");
	}

	public void AfterAdvice() {
		System.out.println(" after ");
	}

	public Object around(ProceedingJoinPoint call){
		try {
			System.out.println("调用around方法");
			return call.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return null;
	}

}
