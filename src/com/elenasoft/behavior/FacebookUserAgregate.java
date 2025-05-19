package com.elenasoft.behavior;

public class FacebookUserAgregate implements Aggregate{

    @Override
    public Iterator createIterator() {
        return new FacebookUserIterator();
    }

}
