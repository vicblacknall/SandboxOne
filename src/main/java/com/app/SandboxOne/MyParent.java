package com.app.SandboxOne;

abstract class MyParent {
     int cal =90;

    abstract int abGetCall();

    int getCall(){
        return 0;
    }
    final int getCall2(){
        return cal;
    }
}
