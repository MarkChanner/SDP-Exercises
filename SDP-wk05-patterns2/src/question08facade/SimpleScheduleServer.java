package question08facade;

/**
 * SDP Design Patterns II
 * Question 8 - Facade Pattern
 * Mark Channer
 */
public class SimpleScheduleServer {

    private ScheduleServer server;

    public SimpleScheduleServer(ScheduleServer server) {
        this.server = server;
    }

    public void startServer() {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    public void stopServer() {
        server.releaseProcesses();
        server.destroy();
        server.destroySystemObjects();
        server.destroyListeners();
        server.destroyContext();
        server.shutdown();
    }

}
