package io.sentry.android.core;

import android.app.Activity;
import io.sentry.EnumC3642e1;
import io.sentry.K0;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: io.sentry.android.core.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3617h implements K0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f34105Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f34106Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f34107h0;

    public /* synthetic */ C3617h(Object obj, Object obj2, Object obj3) {
        this.f34105Y = obj;
        this.f34106Z = obj2;
        this.f34107h0 = obj3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:56:0x0183
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:92)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // io.sentry.K0
    public final void a(io.sentry.r1 r23) {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C3617h.a(io.sentry.r1):void");
    }

    public final void b(io.sentry.T t10) {
        int i10;
        C3613d b10;
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f34105Y;
        String str = (String) this.f34107h0;
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) ((WeakReference) this.f34106Z).get();
        if (activity != null) {
            C3614e c3614e = activityLifecycleIntegration.f33934v0;
            io.sentry.protocol.s n10 = t10.n();
            synchronized (c3614e) {
                if (c3614e.c()) {
                    C3613d c3613d = null;
                    c3614e.d(new RunnableC3611b(c3614e, activity, 1), null);
                    C3613d c3613d2 = (C3613d) c3614e.f34096d.remove(activity);
                    if (c3613d2 != null && (b10 = c3614e.b()) != null) {
                        c3613d = new C3613d(b10.f34090a - c3613d2.f34090a, b10.f34091b - c3613d2.f34091b, b10.f34092c - c3613d2.f34092c);
                    }
                    if (c3613d != null && ((i10 = c3613d.f34090a) != 0 || c3613d.f34091b != 0 || c3613d.f34092c != 0)) {
                        io.sentry.protocol.j jVar = new io.sentry.protocol.j(Integer.valueOf(i10), "none");
                        io.sentry.protocol.j jVar2 = new io.sentry.protocol.j(Integer.valueOf(c3613d.f34091b), "none");
                        io.sentry.protocol.j jVar3 = new io.sentry.protocol.j(Integer.valueOf(c3613d.f34092c), "none");
                        HashMap hashMap = new HashMap();
                        hashMap.put("frames_total", jVar);
                        hashMap.put("frames_slow", jVar2);
                        hashMap.put("frames_frozen", jVar3);
                        c3614e.f34095c.put(n10, hashMap);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f33921i0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }
}
