package com.lxs.iterator_pattern;

public class Women implements IWomen{

    private int type =0;
    private String request="";

    @Override
    public int getTye() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }

    public Women(int type, String request) {
        this.type = type;
        switch (type){
            case 1:
                this.request = "女儿的请求是: " + request;
                break;
            case 2:
                this.request = "母亲的请求是: " + request;
                break;
            case 3:
                break;
        }
    }

}
