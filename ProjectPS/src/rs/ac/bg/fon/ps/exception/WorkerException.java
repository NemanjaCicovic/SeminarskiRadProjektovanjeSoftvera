/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.exception;

/**
 *
 * @author Nemanja
 */
public class WorkerException extends Exception{
    private final String inncorrect_worker;

    public WorkerException(String inncorrect_worker) {
        this.inncorrect_worker = inncorrect_worker;
    }
    
    public String getInncorrect_worker() {
        return inncorrect_worker;
    }
    
    @Override
    public String toString() {
        return "WorkerException{" + "inncorrect_worker=" + inncorrect_worker + '}';
    }
}
