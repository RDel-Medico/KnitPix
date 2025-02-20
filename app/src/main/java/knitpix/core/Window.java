package knitpix.core;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

/*
 * This class is responsible for creating and managing the window.
 */
public class Window {
    private long window;

    public Window(int width, int height, String title) {
        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        window = GLFW.glfwCreateWindow(width, height, title, 0, 0);
        if (window == 0) {
            throw new RuntimeException("Failed to create GLFW window");
        }

        GLFW.glfwMakeContextCurrent(window);
        GL.createCapabilities();
        GLFW.glfwSwapInterval(1);
    }

    /*
     * Returns true if the window should close.
     */
    public boolean shouldClose() {
        return GLFW.glfwWindowShouldClose(window);
    }

    /*
     * Swaps the front and back buffers.
     */
    public void swapBuffers() {
        GLFW.glfwSwapBuffers(window);
    }

    /*
     * Polls for events.
     */
    public void pollEvents() {
        GLFW.glfwPollEvents();
    }

    /*
     * Destroys the window and terminates GLFW.
     */
    public void destroy() {
        GLFW.glfwDestroyWindow(window);
        GLFW.glfwTerminate();
    }

    public long getWindowHandle() {
        return window;
    }
}