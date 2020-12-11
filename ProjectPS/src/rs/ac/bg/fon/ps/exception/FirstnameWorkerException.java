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
public class FirstnameWorkerException extends Exception{
    private final String inncorrect_firstnameWorker;

    public FirstnameWorkerException(String inncorrect_firstnameWorker) {
        this.inncorrect_firstnameWorker = inncorrect_firstnameWorker;
    }
    
    public String getInncorrect_firstnameWorker() {
        return inncorrect_firstnameWorker;
    }
    
    @Override
    public String toString() {
        return "FirstnameWorkerException{" + "inncorrect_firstnameWorker=" + inncorrect_firstnameWorker + '}';
    }
}
