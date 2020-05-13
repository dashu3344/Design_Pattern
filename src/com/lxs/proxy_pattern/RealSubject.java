package com.lxs.proxy_pattern;

public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("真实主题");
    }
}
