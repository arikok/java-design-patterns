package com.arikok.designpatterns.creationaldesignpatterns.singleton.innerstaticsingleton;

//thread safe
public class InnerStaticSingleton {

    private InnerStaticSingleton(){}

    private static class Impl{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance(){
        return Impl.INSTANCE;
    }
}
