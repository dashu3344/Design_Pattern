package com.lxs.iterator_pattern;

public class Father extends Handler{

    public Father() {
        super(Handler.FATHER_LEVEL_REQUST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("女儿向父亲请示,父亲同意");
    }
}
