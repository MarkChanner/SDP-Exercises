package question08facade;

/**
 * SDP Design Patterns II
 * Question 8 - Builder Pattern
 * Mark Channer
 */
public interface ScheduleServer {

    void startBooting();

    void readSystemConfigFile();

    void init();

    void initializeContext();

    void initializeListeners();

    void createSystemObjects();

    void releaseProcesses();

    void destory();

    void destroySystemObjects();

    void destoryListeners();

    void destoryContext();

    void shutdown();

}
