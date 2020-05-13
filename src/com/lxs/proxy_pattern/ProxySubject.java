package com.lxs.proxy_pattern;

public class ProxySubject extends Subject {
   private RealSubject mRealSubject;

    public ProxySubject(RealSubject mRealSubject) {
        this.mRealSubject = mRealSubject;
    }

    @Override
    public void visit() {
        mRealSubject.visit();
        System.out.println("执行了代理主题");
    }
}
