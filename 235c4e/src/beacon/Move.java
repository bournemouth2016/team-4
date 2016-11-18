/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beacon;


public class Move {
   private String direction; 
   private int angle; 
    
  public Move(String direction, int angle){
      this.direction = direction;
      this.angle = angle; 
  }
    
     public int getAngle(){
         return angle; 
     }
     public String getDirection(){
         return direction;
     }
}
