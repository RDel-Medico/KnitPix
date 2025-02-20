package knitpix.core.inputManagers;

import knitpix.gui.GuiRenderer;

/*
 * InputHandler take data from the input manager and decides what to do with it.
 */
public class InputHandler {
    private final GuiRenderer guiRenderer;
    private final MouseInput mouseManager = InputManager.getMouseManager();

    public InputHandler(GuiRenderer guiRenderer) {
        this.guiRenderer = guiRenderer;
    }

    public void processInput() {
        // Detect left mouse button press
        if (mouseManager.isButtonDown(0)) {
            guiRenderer.setLeftMouseButtonPressed(true);
        } else {
            guiRenderer.setLeftMouseButtonPressed(false);
        }
    }
}
