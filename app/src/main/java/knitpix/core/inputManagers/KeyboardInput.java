package knitpix.core.inputManagers;

import static org.lwjgl.glfw.GLFW.glfwSetKeyCallback;

public class KeyboardInput {
    // Array to store the state of each key, we have 348 keys in total
    private static final boolean[] keys = new boolean[348];
    private static int keyDownCount = 0;

    public void init(long window) {
        glfwSetKeyCallback(window, KeyboardInput::keyCallback);
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods) {
        if (action != 0 && !keys[key]) {
            keyDownCount++;
        } else if (action == 0 && keys[key]) {
            keyDownCount--;
        }
        keys[key] = action != 0;
    }

    public boolean isKeyDown(int key) {
        return keys[key];
    }

    public int getKeyDownCount() {
        return keyDownCount;
    }
}
