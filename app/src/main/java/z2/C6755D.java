package z2;

import android.media.metrics.LogSessionId;
import s2.AbstractC5530A;

/* renamed from: z2.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6755D {

    /* renamed from: a  reason: collision with root package name */
    public final C6754C f51490a;

    static {
        if (AbstractC5530A.f45131a < 31) {
            new C6755D();
        } else {
            int i10 = C6754C.f51488b;
        }
    }

    public C6755D() {
        Gi.e.n(AbstractC5530A.f45131a < 31);
        this.f51490a = null;
    }

    public C6755D(LogSessionId logSessionId) {
        this(new C6754C(logSessionId));
    }

    public C6755D(C6754C c6754c) {
        this.f51490a = c6754c;
    }
}
