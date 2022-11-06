
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message m = new Message("Aashi","hwu?");
        
        MessagingService message = new MessagingService();
        message.add(m);
        System.out.println(message.getMessages());
    }
}
