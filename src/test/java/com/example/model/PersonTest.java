package com.example.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testSerialization() throws Exception {
        Person person = new Person("Jane Smith", 25, "jane.smith@example.com");
        ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(person);
        
        assertTrue(json.contains("\"full_name\":\"Jane Smith\""));
        assertTrue(json.contains("\"age\":25"));
        assertTrue(json.contains("\"email\":\"jane.smith@example.com\""));
    }
    
    @Test
    public void testDeserialization() throws Exception {
        String json = "{\"full_name\":\"Jane Smith\",\"age\":25,\"email\":\"jane.smith@example.com\"}";
        ObjectMapper mapper = new ObjectMapper();
        
        Person person = mapper.readValue(json, Person.class);
        
        assertEquals("Jane Smith", person.getName());
        assertEquals(25, person.getAge());
        assertEquals("jane.smith@example.com", person.getEmail());
    }
}