package com.example.imageclassificationlivefeed.RoomDB;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


    @Entity(tableName = "facial_embeddings")
    public class FacialEmbedding {

        @PrimaryKey(autoGenerate = true)
        private long id;
        private String name;
        private float[] embedding;

        public FacialEmbedding(String name, float[] embedding) {
            this.name = name;
            this.embedding = embedding;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float[] getEmbedding() {
            return embedding;
        }
    }

