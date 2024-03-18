package m7;

import android.os.SystemClock;

/* renamed from: m7.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4567c implements AbstractC4565a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38965a;

    public final long a() {
        switch (this.f38965a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
