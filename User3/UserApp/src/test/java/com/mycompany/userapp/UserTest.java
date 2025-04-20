/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userapp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author MSI
 */
public class UserTest extends TestCase {
    
    public void testGetEmail(){
        User user= new User("U001","test@example.com");
        assertEquals("test@example.com", user.getEmail());
    }
    public void testSetEmail(){
        User user= new User("U002","old@example.com");
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }
    public void testUpdateEmail(){
        User user = new User("U003", "update@example.com");
        user.updateEmail("update@example.com");
        assertEquals("update@example.com", user.getEmail());
    }
    
}
