import java.util.Random;  //Imports the java class Random to allow the program to create a RNG

public class SpeakBehavior implements TalkBehavior {
  Random r = new Random();  //initializes the type Random
  
  public String talk() {  //Implements the talk method from the TalkBehavior interface
    int i = r.nextInt(3)+1;  //Generates a number between 1-3 in order to randomly select a phrase
    if(i == 1)
      return "Hello";
    else if(i == 2)
      return "How are you?";
    else
      return "Good day";
  }
}
