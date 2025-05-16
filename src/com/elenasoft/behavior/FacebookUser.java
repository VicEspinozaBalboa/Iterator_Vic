package com.elenasoft.behavior;

public class FacebookUser {
    private String  fbname;
    private String fbUrl;
    
    public FacebookUser(String fbname) {
        this.fbname = fbname;
        this.fbUrl = "http://facebook.com/profile/" + fbname;
    }
    
    public String getFbname() {
        return fbname;
    }
    public void setFbname(String fbname) {
        this.fbname = fbname;
    }
    public String getFbUrl() {
        return fbUrl;
    }
    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    @Override
    public String toString() {
        return "FacebookUser [fbname=" + fbname + ", fbUrl=" + fbUrl + "]";
    }
}
