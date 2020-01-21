public class WallERobot extends Robot {
  
  public WallERobot(String aName) {
    super(aName);
    moveBehavior = new WalkBehavior();
    talkBehavior = new SimpleSpeakBehavior();
  }
  
  public String toString() {
    return name+" is an environmentally friendly Wall-E Robot";
  }
}