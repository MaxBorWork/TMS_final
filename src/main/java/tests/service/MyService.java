package tests.service;

import tests.exception.MyServiceException;
import tests.model.Data;

public class MyService {

    public Data getData(long id) {
        if (id >=0) {
            return new Data();
        } else {
            throw new MyServiceException();
        }
    }
}
