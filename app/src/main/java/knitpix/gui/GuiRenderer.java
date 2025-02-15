package knitpix.gui;

import org.lwjgl.opengl.GL11;

import knitpix.core.Window;

public class GuiRenderer {
    private final Window window;

    public GuiRenderer(Window window) {
        this.window = window;
    }

    // This method is called once per frame
    public void render() {
        // Clear the screen
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

        // Draw a rectangle
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(-0.5f, -0.5f);
        GL11.glVertex2f(0.5f, -0.5f);
        GL11.glVertex2f(0.5f, 0.5f);
        GL11.glVertex2f(-0.5f, 0.5f);
        GL11.glEnd();
    }
}
