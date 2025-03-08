 package chat;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyService = new LegacyChatService();
        ChatService adapter = new ChatServiceAdapter(legacyService);
        adapter.sendMessage("Hello world!");
    }
}
