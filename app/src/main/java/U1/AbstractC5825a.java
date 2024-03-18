package u1;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: u1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5825a {
    public static Display a(DisplayManager displayManager, int i10) {
        return displayManager.getDisplay(i10);
    }

    public static Display[] b(DisplayManager displayManager) {
        return displayManager.getDisplays();
    }
}
