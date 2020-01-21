import java.util.Random;

public class SimpleSpeakBehavior implements TalkBehavior {
  Random r = new Random();
  
  public String talk() {
    int i = r.nextInt(5)+1;
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