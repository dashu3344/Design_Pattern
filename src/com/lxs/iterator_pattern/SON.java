package com.lxs.iterator_pattern;

public class SON  extends Handler{
    public SON() {
        super(Handler.SON_LEVEL_REQUST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲向儿子请示,儿子同意!!!");
    }
}
