package com.elenasoft.behavior;

public class GoogleUserIterator implements Iterator{

    private int position;
    private GoogleUser[] googleUsers;
 
    public  GoogleUserIterator() {
        this.position = 0;
        this.googleUsers = GoogleApi.getGoogleUser();
    }

    @Override
    public boolean isDone() {
        return this.position >= this.googleUsers.length ;
    }

    @Override
    public String currentItem() {

        return this.googleUsers[this.position ++].toString();
    }

}
