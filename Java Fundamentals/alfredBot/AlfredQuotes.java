import java.util.Date;
class AlfredQuotes{

    public String guestGreeting(String name){
        return  String.format("Hello %s Lovely to see you. " , name );
    }

    public   String dateAnnouncement(){
        Date date = new Date();
        return "It is currently "+date;
    }

    public String answeringBeforeAlexis(String  conversation){
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        if (a != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if(b != -1){
            return "At your service. As you wish, naturally";
        }

        else{
            return "Right. And with that I shall retire.";
        }
    }
}