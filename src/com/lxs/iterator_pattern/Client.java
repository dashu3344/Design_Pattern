package com.lxs.iterator_pattern;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> list = new ArrayList();

        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        Handler father = new Father();
        Handler son = new SON();
        father.setNextHanler(son);

        for (IWomen women : list) {
            father.HandlMessage(women);
        }
    }
}
