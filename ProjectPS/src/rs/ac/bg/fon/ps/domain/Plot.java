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
public class Plot {
    private Long plotId;
    private String plotSize;
    private String numberSize;

    public Plot() {
    }

    public Plot(Long plotId, String plotSize, String numberSize) {
        this.plotId = plotId;
        this.plotSize = plotSize;
        this.numberSize = numberSize;
    }

    public String getNumberSize() {
        return numberSize;
    }

    public void setNumberSize(String numberSize) {
        this.numberSize = numberSize;
    }

    public Long getPlotId() {
        return plotId;
    }

    public void setPlotId(Long plotId) {
        this.plotId = plotId;
    }

    public String getPlotSize() {
        return plotSize;
    }

    public void setPlotSize(String plotSize) {
        this.plotSize = plotSize;
    }
    
}
