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
public class UsernameException extends Exception{
    private final String inncorrect_username;

    public UsernameException(String inncorrect_username) {
        this.inncorrect_username = inncorrect_username;
    }
    
    public String getInncorrect_username() {
        return inncorrect_username;
    }
    
    @Override
    public String toString() {
        return "UsernameException{" + "inncorrect_username=" + inncorrect_username + '}';
    }
}
