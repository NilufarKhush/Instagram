package com.example.instagram;

public class Post {
    String name;
    String photo;
    String description;
    int amountOfLikes;
    int amountOfComments;

    public Post(String name, String photo, String description, int amountOfLikes, int amountOfComments){
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.amountOfLikes = amountOfLikes;
        this.amountOfComments = amountOfComments;
    }
}




