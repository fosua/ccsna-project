package com.ccsna.safetynet.model;
// Generated Oct 20, 2015 4:22:25 PM by Hibernate Tools 4.3.1



/**
 * Links generated by hbm2java
 */
public class Links  implements java.io.Serializable {


     private Integer linkId;
     private String title;
     private String url;

    public Links() {
    }

    public Links(String title, String url) {
       this.title = title;
       this.url = url;
    }
   
    public Integer getLinkId() {
        return this.linkId;
    }
    
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


