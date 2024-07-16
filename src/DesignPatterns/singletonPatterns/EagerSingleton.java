package DesignPatterns.singletonPatterns;

public class EagerSingleton {
    // The single instance, created immediately
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {}

    // Public method to get the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}


/*Summary
Eager initialization is simple and thread-safe but can be resource-intensive and inflexible.
 It's not suitable for all situations, particularly when:

The singleton is resource-heavy or requires runtime parameters.
You want to delay the instance creation until it's actually needed (lazy loading).
The application startup time is critical, and you want to avoid any unnecessary overhead during the startup phase.*/