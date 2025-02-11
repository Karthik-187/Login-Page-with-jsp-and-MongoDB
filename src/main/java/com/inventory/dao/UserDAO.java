package com.inventory.dao;

import com.inventory.model.User;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.model.Filters;

public class UserDAO {
    private final MongoCollection<Document> collection;

    public UserDAO(MongoClient mongoClient) {
        try {
            MongoDatabase database = mongoClient.getDatabase("inventory_db");
            this.collection = database.getCollection("users");
            System.out.println("Connected to collection: users");
            
            // Print total users
            long userCount = collection.countDocuments();
            System.out.println("Total users in database: " + userCount);
        } catch (Exception e) {
            System.err.println("Failed to initialize UserDAO: " + e.getMessage());
            throw new RuntimeException("Database initialization failed", e);
        }
    }

    public boolean validateUser(String username, String password) {
        try {
            System.out.println("Validating user: " + username);
            Document query = new Document()
                .append("username", username)
                .append("password", password);
            
            Document user = collection.find(query).first();
            boolean isValid = user != null;
            System.out.println("User validation result: " + isValid);
            return isValid;
        } catch (Exception e) {
            System.err.println("Error validating user: " + e.getMessage());
            return false;
        }
    }

    public boolean registerUser(User user) {
        try {
            // Check if username already exists
            if (collection.find(Filters.eq("username", user.getUsername())).first() != null) {
                System.out.println("Username already exists: " + user.getUsername());
                return false;
            }

            Document doc = new Document()
                .append("username", user.getUsername())
                .append("password", user.getPassword())
                .append("email", user.getEmail());
            
            collection.insertOne(doc);
            System.out.println("User registered successfully: " + user.getUsername());
            return true;
        } catch (Exception e) {
            System.err.println("Error registering user: " + e.getMessage());
            return false;
        }
    }
} 