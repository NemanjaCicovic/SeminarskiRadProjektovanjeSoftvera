/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.repository;

import java.util.*;
import rs.ac.bg.fon.ps.domain.User;

/**
 *
 * @author Nemanja
 */
public class RepositoryUser {
    private final List<User> users;
    
    public RepositoryUser(){
        users = new ArrayList<>();
        users.add(new User(1l, "Nemanja", "Cicovic", "admin", "admin"));
        users.add(new User(2l, "Ilija", "Antovic", "ilija", "ilija"));
    }
    
    public List<User> getAll(){
        return users;
    }
}
