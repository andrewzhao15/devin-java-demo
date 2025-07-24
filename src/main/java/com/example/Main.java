package com.example;

import com.example.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * Main application class demonstrating Jackson Databind functionality.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Jackson Databind Demo");
        
        try {
            // Create an ObjectMapper instance
            ObjectMapper mapper = new ObjectMapper();
            
            // Create a Person object
            Person person = new Person("John Doe", 30, "john.doe@example.com");
            
            // Serialize Person to JSON
            String json = mapper.writeValueAsString(person);
            System.out.println("Serialized to JSON: " + json);
            
            // Deserialize JSON back to Person
            Person deserializedPerson = mapper.readValue(json, Person.class);
            System.out.println("Deserialized from JSON: " + deserializedPerson);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}