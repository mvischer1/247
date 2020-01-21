public class DogRobot extends Robot {
  
  public DogRobot(String aName) {
    super(aName);
    moveBehavior = new CrawlBehavior();
    talkBehavior = new BarkBehavior();
  }
  
  public String toString() {
    return name+" is a happy dog robot";
  }
}