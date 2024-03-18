package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC3642e1;

/* loaded from: classes2.dex */
public final class N implements I, io.sentry.H {

    /* renamed from: Y  reason: collision with root package name */
    public static final N f34004Y = new Object();

    @Override // io.sentry.H
    public void b(EnumC3642e1 enumC3642e1, Throwable th2, String str, Object... objArr) {
        d(enumC3642e1, String.format(str, objArr), th2);
    }

    @Override // io.sentry.H
    public void d(EnumC3642e1 enumC3642e1, String str, Throwable th2) {
        int i10 = AbstractC3620k.f34196a[enumC3642e1.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.d("Sentry", str, th2);
                        return;
                    } else {
                        Log.wtf("Sentry", str, th2);
                        return;
                    }
                }
                Log.e("Sentry", str, th2);
                return;
            }
            Log.w("Sentry", str, th2);
            return;
        }
        Log.i("Sentry", str, th2);
    }

    @Override // io.sentry.H
    public void f(EnumC3642e1 enumC3642e1, String str, Object... objArr) {
        int i10 = AbstractC3620k.f34196a[enumC3642e1.ordinal()];
        int i11 = 4;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    i11 = 3;
                } else {
                    i11 = 7;
                }
            } else {
                i11 = 5;
            }
        }
        Log.println(i11, "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.H
    public boolean g(EnumC3642e1 enumC3642e1) {
        return true;
    }
}
