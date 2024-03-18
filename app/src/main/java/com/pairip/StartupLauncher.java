package com.pairip;

/* loaded from: classes.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "DfdxecQgB1eIjbdv";

    public static synchronized void launch() {
        synchronized (StartupLauncher.class) {
            if (launchCalled) {
                return;
            }
            launchCalled = true;
            VMRunner.invoke(startupProgramName, null);
        }
    }

    private StartupLauncher() {
    }
}
