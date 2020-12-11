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
public class LastnameWorkerException extends Exception{
    private final String inncorrect_lastnameWorker;

    public LastnameWorkerException(String inncorrect_lastnameWorker) {
        this.inncorrect_lastnameWorker = inncorrect_lastnameWorker;
    }
    
    public String getInncorrect_lastnameWorker() {
        return inncorrect_lastnameWorker;
    }
    
    @Override
    public String toString() {
        return "LastnameWorkerException{" + "inncorrect_lastnameWorker=" + inncorrect_lastnameWorker + '}';
    }
}
