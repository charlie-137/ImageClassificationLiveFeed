package com.example.imageclassificationlivefeed.RoomDB;


    public class FacialEmbeddingRepository {

        private FacialEmbeddingDao dao;

        public FacialEmbeddingRepository(FacialEmbeddingDao dao) {
            this.dao = dao;
        }

        public void addFacialEmbedding(FacialEmbedding embedding) {
            dao.insertFacialEmbedding(embedding);
        }

        public FacialEmbedding getFacialEmbeddingByName(String name) {
            return dao.getFacialEmbeddingByName(name);
        }

        public void deleteFacialEmbeddingByName(String name) {
            dao.deleteFacialEmbeddingByName(name);
        }
    }
