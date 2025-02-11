package com.inventory.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class DatabaseUtil {
    private static MongoClient mongoClient;
    
    public static MongoClient getConnection() {
        if (mongoClient == null) {
            try {
                mongoClient = MongoClients.create("mongodb://localhost:27017");
                System.out.println("MongoDB Connection Successful!");
                
                // Test the connection
                mongoClient.listDatabaseNames().first();
            } catch (Exception e) {
                System.err.println("MongoDB Connection Error: " + e.getMessage());
                e.printStackTrace();
                throw new RuntimeException("Failed to connect to MongoDB", e);
            }
        }
        return mongoClient;
    }
    
    public static void closeConnection() {
        if (mongoClient != null) {
            try {
                mongoClient.close();
                System.out.println("MongoDB Connection Closed");
            } catch (Exception e) {
                System.err.println("Error closing MongoDB connection: " + e.getMessage());
            }
        }
    }
} 