package net.runelite.client.plugins.fishing;

import com.google.inject.Inject;

public class Testing {
    @Inject
    Fisharound fisharound;

    public static void main(String[] args) {
        System.out.println("Trying to run multiple instances");
    }
}
