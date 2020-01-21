public abstract class Robot {
  
  //Declare attributes each Robot will have
  protected String name;
  MoveBehavior moveBehavior;
  TalkBehavior talkBehavior;
  
  public Robot(String aName) {  //Construct Robot
    this.name = aName;
  }
  
  public void setMoveBehavior(MoveBehavior aMoveBehavior) {  //Mutator that provides a way to change how a robot moves
    this.moveBehavior = aMoveBehavior;
  }
  
  public void setTalkBehavior(TalkBehavior aTalkBehavior) {  //Mutator that provides a way to change how a robot talks
    this.talkBehavior = aTalkBehavior;
  }
  
  public String move() {  //returns the specific Strings that are established in the sub classes
    return moveBehavior.move();
  }
  
  public String talk() {  //returns the specific Strings that are established in the sub classes
    return talkBehavior.talk();
  }
  
  public abstract String toString();  //Abstract method that is to be implemented in each Robot sub class
}
