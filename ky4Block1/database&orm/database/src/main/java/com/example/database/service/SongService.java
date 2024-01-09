package com.example.database.service;

import com.example.database.model.Song;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Service
public class SongService implements ISongService{
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    private final List<Song> songList;

    static{
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public SongService() {
        this.songList = new ArrayList<>();
    }

    @Override
    public List<Song> getSongList() {
        String query = "SELECT s FROM Song AS s";
        TypedQuery<Song> songTypedQuery = entityManager.createQuery(query, Song.class);
        return songTypedQuery.getResultList();
    }

    @Override
    public Song getSongById(String id) {
        return null;
    }

    @Override
    public void uploadSong(Song song) {

    }

    @Override
    public void deleteSongById(int id) {

    }

    @Override
    public void editSongById(int id) {

    }

    @Override
    public void save(Song song) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(song);
            transaction.commit();
        }catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        songList.add(song);
    }
}
