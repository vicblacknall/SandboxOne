package com.app.SandboxTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FutureOptions {

    private CompletableFuture<List<String>> futureList = new CompletableFuture<>();


    CompletableFuture<List<String>> getListOfStrings() {

        List<String> aList = new ArrayList(Arrays.asList("Bob", "Bill", "Billiam", "Bufford"));

//        Executors.newCachedThreadPool().submit(() -> {
        try {

            Thread.sleep(2000);
            futureList.complete(aList);
//                return null;
        } catch (Exception e) {
            e.printStackTrace();
            futureList.complete(new ArrayList<>());
//                return null;
        }


//        });

        return futureList;
    }

}
