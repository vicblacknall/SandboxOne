package com.app.SandboxTwo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Slf4j
public class FutureOptionsTest {

    @Mock
    private FutureOptions futureOptions = new FutureOptions();

    @Test
    public void getFutureNames() {
        CompletableFuture<List<String>> names = futureOptions.getListOfStrings();

        int listSize = 0;
        try {
            while (!names.isDone()) {
                Thread.sleep(200);
            }
            listSize = names.get().size();
        } catch (InterruptedException e) {
            log.info("thread was broken");
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("4 or so extraced names", 4, listSize);

    }

    @Test
    public void getFutureNamesAndThen() {
        CompletableFuture<List<String>> names = futureOptions.getListOfStrings();
        CompletableFuture<List<String>> namesTwo = names
                .thenApply(list -> {
                    list.add("Mary");
                    return list;
                });


        int listSize = 0;
        try {
            while (!namesTwo.isDone()) { Thread.sleep(200); }

            listSize = namesTwo.get().size();
        } catch (InterruptedException e) {
            log.info("thread was broken");
            e.printStackTrace();
        } catch (ExecutionException e) {
            log.info("bad times man");
            e.printStackTrace();
        }
        Assert.assertEquals("5 or so extraced names", 5, listSize);

    }

}
