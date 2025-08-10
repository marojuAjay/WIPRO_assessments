package five_solid_prin;
interface MessageService {
    void sendMessage();
}

class WhatsAppService implements MessageService {
    public void sendMessage() {
        System.out.println("Sending message via WhatsApp");
    }
}

class EmailService implements MessageService {
    public void sendMessage() {
        System.out.println("Sending message via Email");
    }
}

class NotificationSender {
    private MessageService service;

    public NotificationSender(MessageService service) {
        this.service = service;
    }

    public void notifyUser() {
        service.sendMessage();
    }
}

public class dependencyInv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageService whatsapp = new WhatsAppService();
        NotificationSender sender1 = new NotificationSender(whatsapp);
        sender1.notifyUser();

        MessageService email = new EmailService();
        NotificationSender sender2 = new NotificationSender(email);
        sender2.notifyUser();
    }
}

	