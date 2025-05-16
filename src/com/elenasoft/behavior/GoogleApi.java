package com.elenasoft.behavior;

public class GoogleApi {

    public static GoogleUser[] getGoogleUser(){
        GoogleUser[] googlers = {
            new GoogleUser ("Juan", "j@gmail"),
            new GoogleUser ("Pedro", "p.@gmail.com")
        };
        return googlers;
    }
}
