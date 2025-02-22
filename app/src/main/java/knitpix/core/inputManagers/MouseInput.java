package knitpix.core.inputManagers;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCursorPosCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallback;

public class MouseInput {
    private static double mouseX, mouseY;
    private static boolean[] mouseButtons = new boolean[GLFW.GLFW_MOUSE_BUTTON_LAST];

    private static GLFWCursorPosCallback cursorPosCallback;
    private static GLFWMouseButtonCallback mouseButtonCallback;

    public void init(long window) {
        cursorPosCallback = new GLFWCursorPosCallback() {
            @Override
            public void invoke(long window, double xpos, double ypos) {
                mouseX = xpos;
                mouseY = ypos;
            }
        };

        mouseButtonCallback = new GLFWMouseButtonCallback() {
            @Override
            public void invoke(long window, int button, int action, int mods) {
                mouseButtons[button] = action != GLFW.GLFW_RELEASE;
            }
        };

        GLFW.glfwSetCursorPosCallback(window, cursorPosCallback);
        GLFW.glfwSetMouseButtonCallback(window, mouseButtonCallback);
    }

    public double getMouseX() {
        return mouseX;
    }

    public double getMouseY() {
        return mouseY;
    }

    public boolean isButtonDown(int button) {
        return mouseButtons[button];
    }

    public void release() {
        cursorPosCallback.free();
        mouseButtonCallback.free();
    }
}
