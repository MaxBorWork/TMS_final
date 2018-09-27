package tests.service;

public class LongTimeRunningService {

    public boolean executeTask() {
        try {
            Thread.sleep(3_000);
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
