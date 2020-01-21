public class HumanRobot extends Robot {
  
  public HumanRobot(String aName) {  //Constructs HumanRobot
    super(aName);  //Calls constructor from Robot
    moveBehavior = new WalkBehavior();
    talkBehavior = new SpeakBehavior();
  }
  
  public String toString() {  //implements the abstract method toString from the class Robot
    return name+" is a typical human robot";
  }
}
