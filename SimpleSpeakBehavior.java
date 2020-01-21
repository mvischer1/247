import java.util.Random;  //Imports the Random class allowing program to implement a RNG

public class SimpleSpeakBehavior implements TalkBehavior {
  Random r = new Random();  //creates a type random to be used in the talk class
  
  public String talk() {  //Implementing the talk merthod from the TalkBehavior interface
    int i = r.nextInt(5)+1;  //Generates a random number between 1-5 to pick which phrase the robot will use
    if(i == 1)
      return "Wall-E";
    else if(i == 2)
      return "EVA!";
    else if(i == 3)
      return "Pop";
    else if(i == 4)
      return "Eva?";
    else
      return "Eee-va?";
  }
}
