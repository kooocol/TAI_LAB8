package com.pwsz.post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String image;
    private String content;

    public Post(long id, String title, String image, String content) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public String getContent() {
        return content;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setContent(String content) {
        this.content = content;
    }


}
