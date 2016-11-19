/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beacon;

import java.util.ArrayList;

/**
 *
 * @author youse_000
 */
public class Beacon {

   private String beaconId; 
   //add more attributes i.e. stairs, lifts, emergency etc. 
   
   public Beacon(String beaconId){
       this.beaconId = beaconId; 
      
   } 
   public String getBeaconId(){
       return beaconId;
   }
 
   
    public static void main(String[] args) {
    //Building Spec
    Beacon reception = new Beacon("0");
    Beacon corridor_A  = new Beacon("1");  
    Beacon corridor_B = new Beacon("2"); 
    Beacon toilet  = new Beacon("3");
    
    ArrayList<Move> directionAB = new ArrayList<Move>();
    ArrayList<Move> directionBD = new ArrayList<Move>();
    ArrayList<Move> directionAC = new ArrayList<Move>();
    ArrayList<Move> directionCD = new ArrayList<Move>();
    
    Move ab = new Move("Forward", 0, 10);
    Move ab1 = new Move("Right", 90, 5);
    Move ab2 = new Move("Left", 90, 5); 
    directionAB.add(ab);
    directionAB.add(ab1);
    directionAB.add(ab2);
    
    Move bd = new Move("Right", 90, 5); 
    directionBD.add(bd);
    
    Move ac = new Move("Right", 90, 10); 
    directionAC.add(ac);
    
    Move cd = new Move("Left", 90, 10); 
    directionCD.add(cd); 
     
    BeaconToBeacon receptionToCorridorA = new BeaconToBeacon(reception, corridor_A, directionAB);
    BeaconToBeacon corridorAToToilet = new BeaconToBeacon(corridor_A, toilet, directionBD);
    BeaconToBeacon receptionToCorridorB = new BeaconToBeacon(reception , corridor_B, directionAC);
    BeaconToBeacon corridorBToToilet = new BeaconToBeacon(corridor_B, toilet, directionCD);
    ArrayList<BeaconToBeacon> routes = new ArrayList<BeaconToBeacon>();
    routes.add(receptionToCorridorA); 
    routes.add(corridorAToToilet);
    routes.add(receptionToCorridorB); 
    routes.add(corridorBToToilet);
    BeaconToBeacon[] path1 = {receptionToCorridorA, corridorAToToilet};
    BeaconToBeacon[] path2 = {receptionToCorridorB, corridorBToToilet};
    ArrayList<BeaconToBeacon[]> paths = new ArrayList<BeaconToBeacon[]>();
    paths.add(path1);
    paths.add(path2);
    //Building Spec End 
    
    BeaconToBeacon[] best = bestRoute(paths);
    System.out.println(best.length);
    for(int i =0; i < best.length; i++){
        BeaconToBeacon test = best[i];
        ArrayList<Move> test2 = test.getDirections();
        for(int j = 0; j < test2.size(); j++){
            Move test3 = test2.get(j);
            System.out.println("Move " + test3.getDirection() + " at angle " + test3.getAngle() + " " + test3.getSteps() + " steps.");
        }
    
    }
    
    
    
    
    
    }
    
    
   
    public static BeaconToBeacon[] bestRoute (ArrayList<BeaconToBeacon[]> paths){
        double[] distances = new double[paths.size()];
        double value = 0;
        for(int i = 0; i < paths.size(); i++){
            distances[i] = value;
            BeaconToBeacon[] subjectPath  = paths.get(i);
            value = 0;
            for(int j = 0; j < subjectPath.length; j++){
                BeaconToBeacon b2b = subjectPath[j];
                double distance = b2b.getDistance();
                value = value + distance;
            } 
        }
        
        for(int z =0; z < distances.length; z++){
            
        }
        return paths.get(index);
        
    }
    
    
    
}
