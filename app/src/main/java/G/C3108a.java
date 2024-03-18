package g;

import android.window.BackEvent;
import id.AbstractC3557B;

/* renamed from: g.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3108a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3108a f30940a = new Object();

    public final BackEvent a(float f6, float f10, float f11, int i10) {
        return new BackEvent(f6, f10, f11, i10);
    }

    public final float b(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
