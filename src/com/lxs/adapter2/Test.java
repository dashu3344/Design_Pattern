package com.lxs.adapter2;

public class Test {
    public static void main(String[] args) {
        VolitAdapter adapter = new VolitAdapter(new Volit220());

        int volt5 = adapter.getVolt5();

        System.out.println(volt5);
    }
}
