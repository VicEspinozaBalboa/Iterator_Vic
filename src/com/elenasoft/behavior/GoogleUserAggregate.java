package com.elenasoft.behavior;

public class GoogleUserAggregate implements Aggregate{

    @Override
    public Iterator createIterator() {
        return new GoogleUserIterator();
    }

}
