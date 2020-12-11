/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.*;

/**
 *
 * @author Nemanja
 */
public class Picking {
    private Long pickingID;
    private Date datePicking;
    private int totalNumberOfCrates;
    private Worker worker;
    private Plot plot;
    private List<StatisticsRaspberryBush> satisticsRaspberryBush;

    public Picking() {
        satisticsRaspberryBush = new ArrayList<>();
    }

    public Picking(Long pickingID, Date datePicking, int totalNumberOfCrates, Worker worker, Plot plot) {
        this.pickingID = pickingID;
        this.datePicking = datePicking;
        this.totalNumberOfCrates = totalNumberOfCrates;
        this.worker = worker;
        this.plot = plot;
        satisticsRaspberryBush = new ArrayList<>();
    }

    public Long getPickingID() {
        return pickingID;
    }

    public void setPickingID(Long pickingID) {
        this.pickingID = pickingID;
    }

    public Date getDatePicking() {
        return datePicking;
    }

    public void setDatePicking(Date datePicking) {
        this.datePicking = datePicking;
    }

    public int getTotalNumberOfCrates() {
        return totalNumberOfCrates;
    }

    public void setTotalNumberOfCrates(int totalNumberOfCrates) {
        this.totalNumberOfCrates = totalNumberOfCrates;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public List<StatisticsRaspberryBush> getSatisticsRaspberryBush() {
        return satisticsRaspberryBush;
    }

    public void setSatisticsRaspberryBush(List<StatisticsRaspberryBush> satisticsRaspberryBush) {
        this.satisticsRaspberryBush = satisticsRaspberryBush;
    }
    
    
}
