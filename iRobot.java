public class iRobot extends Robot {
  
  public iRobot(String aName) {  //Constructor for the iRobot object
    super(aName);  //Calls the constructor from the parent class robot
    moveBehavior = new RunBehavior();
    talkBehavior = new SpeakBehavior();
  }
  
  public String toString() {  //Implements the toString abstract method from the Robot class and returns a unique String
    return name+" is a scary iRobot";
  }
}
