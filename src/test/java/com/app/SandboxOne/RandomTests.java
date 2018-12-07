package com.app.SandboxOne;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomTests {

    private Supplier<Integer> integerProvider = ()->{return (int)Math.floor(Math.random()*8);};
int makeFive(String string){

    return string.length();
}


    @Test
   public void makeIntStream(){


        Stream<Integer> integerStream = Stream.generate(integerProvider).limit(30);
//        List<Integer> integers = integerStream.collect(Collectors.toList());
        Assert.assertEquals("get the right size",30,integerStream.count());
    }



    @Test
    public void anothaOne(){

    }
}
