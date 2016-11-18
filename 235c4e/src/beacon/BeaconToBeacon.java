/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beacon; 
//This is the beacon to beacon relation class

import java.util.ArrayList;


public class BeaconToBeacon {
        
private double theoryDistance;  
private ArrayList<Move> directions = new ArrayList<Move>(); 
private Beacon beaconDest; 
private Beacon beaconStart; 
    
    public BeaconToBeacon(Beacon start, Beacon destination, double distance, String directions){
        this.theoryDistance = distance;
        this.directions = directions; 
        this.beaconDest = destination; 
        this.beaconStart = start; 
    }
    
    public String getDirections(){
        return directions; 
    }
    
    public double getDistance(){
        return theoryDistance;
    }
    

}
