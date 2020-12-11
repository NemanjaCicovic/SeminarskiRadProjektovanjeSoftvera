/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.controller;

import java.util.List;
import rs.ac.bg.fon.ps.domain.Place;
import rs.ac.bg.fon.ps.domain.User;
import rs.ac.bg.fon.ps.domain.Worker;
import rs.ac.bg.fon.ps.exception.FirstnameWorkerException;
import rs.ac.bg.fon.ps.exception.LastnameWorkerException;
import rs.ac.bg.fon.repository.RepositoryUser;
import rs.ac.bg.fon.ps.exception.PasswordException;
import rs.ac.bg.fon.ps.exception.UsernameException;
import rs.ac.bg.fon.ps.exception.WorkerException;
import rs.ac.bg.fon.ps.exception.WorkerIdException;
import rs.ac.bg.fon.repository.RepositoryPlace;
import rs.ac.bg.fon.repository.RepositoryWorker;

/**
 *
 * @author Nemanja
 */
public class Controller {
    private static Controller instance;
    private RepositoryUser storageUser;
    private RepositoryPlace storagePlace;
    private RepositoryWorker storageWorker;
    private Controller(){
        storageUser = new RepositoryUser();
        storagePlace = new RepositoryPlace();
        storageWorker = new RepositoryWorker();
    }
    
    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
    
    public User login(String username, String password) throws Exception{
        
        List<User> users = storageUser.getAll();
        for(User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                if(user.getPassword().equals(password)){
                    return user;
                }else{
                    throw new PasswordException("Inncorrect password!");
                }
            }
        }
        throw new UsernameException("Incorrect username!");
    }
    
    public List<Place> getAllPlaces(){
        return storagePlace.getAll();
    }
    
    public void addWorker(Worker worker) throws Exception{
        storageWorker.add(worker);
    }
    
    public List<Worker> getAllWorkers(){
        return storageWorker.getAll();
    }
}
