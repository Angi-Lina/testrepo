
/**
 * Write a description of class Lokomotive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lokomotive
{
  private int topSpeed;
  private int speed;
  
    Lokomotive (int vmax){
    topSpeed=vmax;
    speed=0;
    }
    
    public int getSpeed (){
    return speed;
    } 
    public void setSpeed(int speedNew){
    if (speedNew < 0 || speedNew > topSpeed ){
        System.out.println(speedNew + " ist unzulassig");
    }
    else speed = speedNew;
    }  
    public double slamOnTheBrakes(){
        int bremsweg = speed*2/25;
        speed = 0;
        return bremsweg;
    }
    
}
