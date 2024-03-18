package E1;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: E1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0468b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
