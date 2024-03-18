package L;

import android.view.KeyEvent;
import z0.C6738a;

/* renamed from: L.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855j0 implements AbstractC0849g0 {
    @Override // L.AbstractC0849g0
    public final EnumC0847f0 c(KeyEvent keyEvent) {
        EnumC0847f0 enumC0847f0 = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long a5 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
            if (C6738a.a(a5, v0.f10322i)) {
                enumC0847f0 = EnumC0847f0.SELECT_LINE_LEFT;
            } else if (C6738a.a(a5, v0.f10323j)) {
                enumC0847f0 = EnumC0847f0.SELECT_LINE_RIGHT;
            } else if (C6738a.a(a5, v0.f10324k)) {
                enumC0847f0 = EnumC0847f0.SELECT_HOME;
            } else if (C6738a.a(a5, v0.f10325l)) {
                enumC0847f0 = EnumC0847f0.SELECT_END;
            }
        } else if (keyEvent.isAltPressed()) {
            long a10 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
            if (C6738a.a(a10, v0.f10322i)) {
                enumC0847f0 = EnumC0847f0.LINE_LEFT;
            } else if (C6738a.a(a10, v0.f10323j)) {
                enumC0847f0 = EnumC0847f0.LINE_RIGHT;
            } else if (C6738a.a(a10, v0.f10324k)) {
                enumC0847f0 = EnumC0847f0.HOME;
            } else if (C6738a.a(a10, v0.f10325l)) {
                enumC0847f0 = EnumC0847f0.END;
            }
        }
        if (enumC0847f0 == null) {
            return AbstractC0853i0.f10194a.c(keyEvent);
        }
        return enumC0847f0;
    }
}
