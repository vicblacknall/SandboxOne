package com.app.SandboxTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FutureOptions {


    CompletableFuture<List<String>> getListOfStrings() {
        CompletableFuture<List<String>> futureList = new CompletableFuture<>();


        List<String> aList = null;

        try {
            aList = new ArrayList(Arrays.asList("Bob", "Bill", "Billiam", "Bufford"));

            Executors.newFixedThreadPool(6).submit(() -> {
                try {
                    Thread.sleep(2000);
//                    futureList.complete(aList);
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                    futureList.complete(new ArrayList<>());
                    return null;
                }


            });

            return futureList;
        } catch (Exception e) {
            System.out.println("oh well");
        }
        return CompletableFuture.completedFuture(new ArrayList<>());
    }
}
