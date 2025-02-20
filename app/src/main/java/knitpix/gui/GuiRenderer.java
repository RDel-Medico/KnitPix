package knitpix.gui;

import org.lwjgl.opengl.GL11;
import knitpix.core.Window;

/*
 * This class is responsible for rendering the GUI.
 */
public class GuiRenderer {
    private final Window window;
    private boolean leftMouseButtonPressed = false;

    public GuiRenderer(Window window) {
        this.window = window;
    }

    // This method is called once per frame
    public void render() {
        // Clear the screen
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

        // For now we simply draw a rectangle based on the state of the left mouse button
        if (this.leftMouseButtonPressed) {
            GL11.glColor3f(1.0f, 0.0f, 0.0f);
        } else {
            GL11.glColor3f(0.0f, 0.0f, 1.0f);
        }
        
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(-0.5f, -0.5f);
        GL11.glVertex2f(0.5f, -0.5f);
        GL11.glVertex2f(0.5f, 0.5f);
        GL11.glVertex2f(-0.5f, 0.5f);
        GL11.glEnd();
    }

    /*
     * 
     */
    public void setLeftMouseButtonPressed(boolean leftMouseButtonPressed) {
        this.leftMouseButtonPressed = leftMouseButtonPressed;
    }
}
