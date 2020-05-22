package com.lxs.iterator_pattern;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUST = 1;

    public final static int FUSEBAND_LEVEL_REQUST = 2;

    public final static int SON_LEVEL_REQUST = 3;

    private int level = 0;

    private Handler nextHanler;

    public Handler(int _level) {
        this.level = _level;
    }

    public final void HandlMessage(IWomen women) {
        if (women.getTye() == this.level) {
            this.response(women);
        } else {
            if (this.nextHanler != null) {
                this.nextHanler.HandlMessage(women);
            } else {
                System.out.println("没有人处理了");
            }
        }
    }

    protected abstract void response(IWomen women);

    public void setNextHanler(Handler _handler) {
        this.nextHanler = _handler;
    }
}
