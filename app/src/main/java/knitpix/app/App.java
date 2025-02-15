package knitpix.app;

import knitpix.core.Window;
import knitpix.gui.GuiRenderer;

public class App {
    public static void main(String[] args) {
        Window window = new Window(800, 600, "KnitPix");
        GuiRenderer guiRenderer = new GuiRenderer(window);

        // Main loop
        while (!window.shouldClose()) {
            guiRenderer.render();
            window.swapBuffers();
            window.pollEvents();
        }

        // Cleanup
        window.destroy();
    }
}
