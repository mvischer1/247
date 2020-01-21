public class HumanRobot extends Robot {
  
  public HumanRobot(String aName) {
    super(aName);
    moveBehavior = new WalkBehavior();
    talkBehavior = new SpeakBehavior();
  }
  
  public String toString() {
    return name+" is a typical human robot";
  }
}