package knitpix.core.inputManagers;

import knitpix.gui.GuiRenderer;

/*
 * InputHandler take data from the input manager and decides what to do with it.
 */
public class InputHandler {
    private final GuiRenderer guiRenderer;
    private final MouseInput mouseManager;
    private final KeyboardInput keyboardManager;

    public InputHandler(GuiRenderer guiRenderer, long window) {
        this.guiRenderer = guiRenderer;
        this.mouseManager = new MouseInput();
        this.keyboardManager = new KeyboardInput();

        this.mouseManager.init(window);
        this.keyboardManager.init(window);
    }

    public void processInput() {
        // Detect left mouse button press
        guiRenderer.setLeftMouseButtonPressed(mouseManager.isButtonDown(0));

        // Process keyboard input
        guiRenderer.setKeyDown(keyboardManager.getKeyDownCount() > 0);
    }
}
