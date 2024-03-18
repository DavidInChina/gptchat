package z0;

import android.view.KeyEvent;
import id.AbstractC3557B;

/* renamed from: z0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6739b {

    /* renamed from: a  reason: collision with root package name */
    public final KeyEvent f51432a;

    public /* synthetic */ C6739b(KeyEvent keyEvent) {
        this.f51432a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6739b)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f51432a, ((C6739b) obj).f51432a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f51432a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f51432a + ')';
    }
}
