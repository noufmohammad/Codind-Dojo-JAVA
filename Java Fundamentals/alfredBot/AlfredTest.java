class AlfredTest{
    public static void main (String[]agrs){
        AlfredQuotes alfredBot = new AlfredQuotes();
        System.out.println(alfredBot.guestGreeting("Nouf"));
        
        System.out.println(alfredBot.dateAnnouncement());
        
        System.out.println(alfredBot.answeringBeforeAlexis("Alexis! Play some low-fi beats."));
        System.out.println(alfredBot.answeringBeforeAlexis( "I can't find my yo-yo. Maybe Alfred will know where it is."));
        System.out.println(alfredBot.answeringBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing.."));
    }
}

