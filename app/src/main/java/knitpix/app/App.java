package knitpix.app;

import knitpix.core.Window;
import knitpix.core.inputManagers.InputHandler;
import knitpix.core.inputManagers.InputManager;
import knitpix.gui.GuiRenderer;

/*
 * The main application class
 * This class is responsible for initializing the application and running the main loop
 * It also handles cleanup when the application is closed
 */
public class App {
    private static Window window;
    private static GuiRenderer guiRenderer;
    private static InputHandler inputHandler;

    public static void main(String[] args) {
        // Initialize the application
        init();

        // Main loop
        while (!window.shouldClose()) {
            // Process input
            inputHandler.processInput();

            // Render the GUI
            guiRenderer.render();

            // Swap buffers and poll events
            window.swapBuffers();
            window.pollEvents();
        }

        // Cleanup
        cleanup();
    }

    /*
     * Initialize the application
     * This method creates the window, initializes the GUI renderer and input handler
     */
    public static void init() {
        window = new Window(800, 600, "KnitPix");
        guiRenderer = new GuiRenderer(window);
        inputHandler = new InputHandler(guiRenderer);
        InputManager.init(window.getWindowHandle());
    }

    /*
     * Cleanup the application
     * This method destroys the window
     */
    public static void cleanup() {
        window.destroy();
    }
}
