package question08facade;

/**
 * SDP Design Patterns II
 * Question 8 - Facade Pattern
 * Mark Channer
 */
public class TestFacadePattern {

    public static void main(String[] args) {
        ScheduleServer server = new ScheduleServerImpl();
        SimpleScheduleServer simpleServer = new SimpleScheduleServer(server);
        simpleServer.startServer();
        simpleServer.stopServer();
    }
}
