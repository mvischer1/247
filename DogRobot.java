public class DogRobot extends Robot {
  
  public DogRobot(String aName) {  //Constructor for a DogRobot object
    super(aName);  //Calls constructor from Robot
    moveBehavior = new CrawlBehavior();  //Assigns moveBehavior attribute to the specific type
    talkBehavior = new BarkBehavior();  //Assigns talkBehavior attribute to the specific type
  }
  
  public String toString() {  //Implements the abstract method toString from Robot class, and returns unique String
    return name+" is a happy dog robot";
  }
}
