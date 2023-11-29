package com.example.imageclassificationlivefeed.RoomDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

    @Dao
    public interface FacialEmbeddingDao {

        @Insert
        void insertFacialEmbedding(FacialEmbedding embedding);

        @Query("SELECT * FROM facial_embeddings WHERE name = :name")
        FacialEmbedding getFacialEmbeddingByName(String name);

        @Query("DELETE FROM facial_embeddings WHERE name = :name")
        void deleteFacialEmbeddingByName(String name);
    }

