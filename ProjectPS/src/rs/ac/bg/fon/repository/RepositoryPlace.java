/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.repository;

import java.util.*;
import rs.ac.bg.fon.ps.domain.Place;

/**
 *
 * @author Nemanja
 */
public class RepositoryPlace {
    private final List<Place> places;
    
    public RepositoryPlace(){
        places = new ArrayList<>();
        places.add(new Place(1l, "31213", "Duskovci"));
        places.add(new Place(2l, "31213", "Jezevica"));
        places.add(new Place(3l, "32300", "Bogdanica"));
        places.add(new Place(4l, "32000", "Kamenica"));
    }
    
    public List<Place> getAll(){
        return places;
    }
}
