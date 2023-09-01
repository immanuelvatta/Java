import java.util.Date;
import java.util.ArrayList;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here , this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String gusestGreeting(String name, int age) {

        return "Hello, " + name + ", you are " + age + "years old. How are you?";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        // YOUR CODE HERE
        return "It is currently " + date.toString() ;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if (conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
    public void guestList(ArrayList<String> guests){
        for (String guest : guests){
            System.out.println(guest);
        }
    }
}