package com.lxs.adapter2;

import com.lxs.adapter.FiveVolt;

public class VolitAdapter implements FiveVolt {
    Volit220 mVolit220;

    public VolitAdapter(Volit220 mVolit220) {
        this.mVolit220 = mVolit220;
    }

    public int getVolit220() {
        return mVolit220.getVolit220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
