public class iRobot extends Robot {
  
  public iRobot(String aName) {
    super(aName);
    moveBehavior = new RunBehavior();
    talkBehavior = new SpeakBehavior();
  }
  
  public String toString() {
    return name+" is a scary iRobot";
  }
}