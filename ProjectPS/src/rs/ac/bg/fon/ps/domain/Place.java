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
public class Place {
    private Long placeId;
    private String ptt;
    private String name;

    public Place() {
    }

    public Place(Long placeId, String ptt, String name) {
        this.placeId = placeId;
        this.ptt = ptt;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public String getPtt() {
        return ptt;
    }

    public void setPtt(String ptt) {
        this.ptt = ptt;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
