package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.X;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.r1;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    public static final long f34025a = SystemClock.uptimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f34026b = 0;

    public static void a(r1 r1Var, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (X x10 : r1Var.getIntegrations()) {
            if (z10 && (x10 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(x10);
            }
            if (z11 && (x10 instanceof SentryTimberIntegration)) {
                arrayList.add(x10);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                r1Var.getIntegrations().remove((X) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                r1Var.getIntegrations().remove((X) arrayList.get(i11));
            }
        }
    }
}
