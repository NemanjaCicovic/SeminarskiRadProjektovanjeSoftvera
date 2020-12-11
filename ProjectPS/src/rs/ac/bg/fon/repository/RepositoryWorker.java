/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.repository;

import java.util.*;
import rs.ac.bg.fon.ps.domain.Worker;
import rs.ac.bg.fon.ps.exception.WorkerException;

/**
 *
 * @author Nemanja
 */
public class RepositoryWorker {
    private final List<Worker> workers;
    
    public RepositoryWorker(){
        workers = new ArrayList<>();
    }
    
    public void add(Worker worker) throws WorkerException{
        if(!workers.contains(worker)){
            workers.add(worker);
        }else{
            throw new WorkerException("Error: Worker already exists!");
        }
    }
    
    public List<Worker> getAll(){
        return workers;
    }
}
