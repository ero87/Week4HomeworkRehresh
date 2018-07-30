package com.example.ero.week4homework2;


public class ListModel {
    private String title;
    private String description;
    private String[] imageUrl;
    private String videoUrl;
    boolean isLiked;
    boolean isToBasked;
    private float rating;
    private String category;

    public ListModel(String title, String description, String[] imageUrl, String videoUrl, boolean isLiked, boolean isToBasked, int rating, String category) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.isLiked = isLiked;
        this.isToBasked = isToBasked;
        this.rating = rating;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String[] imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public boolean isToBasked() {
        return isToBasked;
    }

    public void setToBasked(boolean toBasked) {
        isToBasked = toBasked;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}