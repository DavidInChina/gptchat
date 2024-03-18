package J2;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import h.C3276b;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class q implements o, DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f8802a;

    /* renamed from: b  reason: collision with root package name */
    public C3276b f8803b;

    public q(DisplayManager displayManager) {
        this.f8802a = displayManager;
    }

    @Override // J2.o
    public final void a(C3276b c3276b) {
        this.f8803b = c3276b;
        Handler l10 = AbstractC5530A.l(null);
        DisplayManager displayManager = this.f8802a;
        displayManager.registerDisplayListener(this, l10);
        c3276b.h(displayManager.getDisplay(0));
    }

    @Override // J2.o
    public final void b() {
        this.f8802a.unregisterDisplayListener(this);
        this.f8803b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        C3276b c3276b = this.f8803b;
        if (c3276b != null && i10 == 0) {
            c3276b.h(this.f8802a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
