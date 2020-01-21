import java.util.Random;

public class SpeakBehavior implements TalkBehavior {
  Random r = new Random();
  public String talk() {
    int i = r.nextInt(3)+1;
    if(i == 1)
      return "Hello";
    else if(i == 2)
      return "How are you?";
    else
      return "Good day";
  }
}