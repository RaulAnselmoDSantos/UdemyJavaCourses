package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date date;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){}
    public Post(Date date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComments(Comment comments) {
        this.comments.add(comments);
    }

    public void removeComments(Comment comment) {
        this.comments.remove(comment);
    }
}
