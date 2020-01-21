public abstract class Robot {
  
  protected String name;
  MoveBehavior moveBehavior;
  TalkBehavior talkBehavior;
  
  public Robot(String aName) {
    this.name = aName;
  }
  
  public void setMoveBehavior(MoveBehavior aMoveBehavior) {
    this.moveBehavior = aMoveBehavior;
  }
  
  public void setTalkBehavior(TalkBehavior aTalkBehavior) {
    this.talkBehavior = aTalkBehavior;
  }
  
  public String move() {
    return moveBehavior.move();
  }
  
  public String talk() {
    return talkBehavior.talk();
  }
  
  public abstract String toString();
}