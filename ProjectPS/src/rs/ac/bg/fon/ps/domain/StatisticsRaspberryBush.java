/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

/**
 *
 * @author Nemanja
 */
public class StatisticsRaspberryBush {
    private RaspberryBush raspberryBush;
    private Picking picking;
    private int numberOfCratesRaspberryBush;

    public StatisticsRaspberryBush() {
    }

    public StatisticsRaspberryBush(RaspberryBush raspberryBush, Picking picking, int numberOfCratesRaspberryBush) {
        this.raspberryBush = raspberryBush;
        this.picking = picking;
        this.numberOfCratesRaspberryBush = numberOfCratesRaspberryBush;
    }

    public int getNumberOfCratesRaspberryBush() {
        return numberOfCratesRaspberryBush;
    }

    public void setNumberOfCratesRaspberryBush(int numberOfCratesRaspberryBush) {
        this.numberOfCratesRaspberryBush = numberOfCratesRaspberryBush;
    }

    public RaspberryBush getRaspberryBush() {
        return raspberryBush;
    }

    public void setRaspberryBush(RaspberryBush raspberryBush) {
        this.raspberryBush = raspberryBush;
    }

    public Picking getPicking() {
        return picking;
    }

    public void setPicking(Picking picking) {
        this.picking = picking;
    }
    
}
