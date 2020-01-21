public class WallERobot extends Robot {
  
  public WallERobot(String aName) {  //Constructor for the WallERobot, sets move and talk behaviors to correct type
    super(aName); //Calls the constructor from the base class Robot
    moveBehavior = new WalkBehavior();
    talkBehavior = new SimpleSpeakBehavior();
  }
  
  public String toString() {  //Implemtation of the abstract method toString from the Robot class, returns specific String
    return name+" is an environmentally friendly Wall-E Robot";
  }
}
