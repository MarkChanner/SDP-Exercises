package decoupledwithspring;

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}