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
public class TotalWorkerException extends Exception {
    private final String inncorrect_totalWorker;

    public TotalWorkerException(String inncorrect_totalWorker) {
        this.inncorrect_totalWorker = inncorrect_totalWorker;
    }
    
    public String getInncorrect_totalWorker() {
        return inncorrect_totalWorker;
    }
    
    @Override
    public String toString() {
        return "TotalWorkerException{" + "inncorrect_totalWorker=" + inncorrect_totalWorker + '}';
    }
}
