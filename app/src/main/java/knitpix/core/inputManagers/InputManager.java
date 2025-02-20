package knitpix.core.inputManagers;

/*
 * InputManager class is responsible for pulling raw input data from the operating system and
 * storing / passing it to the input handler.
 */
public class InputManager {
    private static MouseInput mouseManager = new MouseInput();

    public static void init(long window) {
        mouseManager.init(window);
    }

    public static MouseInput getMouseManager() {
        return mouseManager;
    }
}
