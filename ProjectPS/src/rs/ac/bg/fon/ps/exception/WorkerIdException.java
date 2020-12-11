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
public class WorkerIdException extends Exception{
    private final String inncorrect_workerId;

    public WorkerIdException(String inncorrect_workerId) {
        this.inncorrect_workerId = inncorrect_workerId;
    }
    
    public String getInncorrect_workerId() {
        return inncorrect_workerId;
    }
    
    @Override
    public String toString() {
        return "WorkerIdException{" + "inncorrect_workerId=" + inncorrect_workerId + '}';
    }
}
