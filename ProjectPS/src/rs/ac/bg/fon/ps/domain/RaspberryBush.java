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
public class RaspberryBush {
    private Long raspberryBushId;
    private String name;
    private String raspberryBushSize;
    private int numberOfRows;
    private Worker worker;
    private Plot plot;

    public RaspberryBush() {
    }

    public RaspberryBush(Long raspberryBushId, String name, String raspberryBushSize, int numberOfRows, Worker worker, Plot plot) {
        this.raspberryBushId = raspberryBushId;
        this.name = name;
        this.raspberryBushSize = raspberryBushSize;
        this.numberOfRows = numberOfRows;
        this.worker = worker;
        this.plot = plot;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public Long getRaspberryBushId() {
        return raspberryBushId;
    }

    public void setRaspberryBushId(Long raspberryBushId) {
        this.raspberryBushId = raspberryBushId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaspberryBushSize() {
        return raspberryBushSize;
    }

    public void setRaspberryBushSize(String raspberryBushSize) {
        this.raspberryBushSize = raspberryBushSize;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
    
}
