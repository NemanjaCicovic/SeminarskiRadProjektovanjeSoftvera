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
public class PasswordException extends Exception{
    private final String inncorrect_password;

    public PasswordException(String inncorrect_password) {
        this.inncorrect_password = inncorrect_password;
    }

    public String getInncorrect_password() {
        return inncorrect_password;
    }
    
    @Override
    public String toString() {
        return "PasswordException{" + "inncorrect_password=" + inncorrect_password + '}';
    }
}
