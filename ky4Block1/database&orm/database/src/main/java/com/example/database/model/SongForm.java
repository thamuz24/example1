package com.example.database.model;

import org.springframework.web.multipart.MultipartFile;

public class SongForm {
    private int idSong;
    private String name;
    private String author;
    private String type;
    private String path;
    private MultipartFile song;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MultipartFile getSong() {
        return song;
    }

    public void setSong(MultipartFile song) {
        this.song = song;
    }

    public SongForm(String name, String author, String type, String path, MultipartFile song) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.path = path;
        this.song = song;
    }

    public SongForm() {
    }
}
