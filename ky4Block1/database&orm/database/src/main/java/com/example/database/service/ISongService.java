package com.example.database.service;

import com.example.database.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> getSongList();
    Song getSongById(String id);
    void uploadSong(Song song);
    void deleteSongById(int id);
    void editSongById(int id);
    void save(Song song);

}
