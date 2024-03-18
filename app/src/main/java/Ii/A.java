package Ii;

import B.A0;
import G.X;
import L.N;
import ae.AbstractC1983i;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Window;
import id.AbstractC3557B;
import j7.RunnableC3921k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kf.AbstractC4268D;
import lc.C4385I;
import mh.C4678h;

/* loaded from: classes2.dex */
public final class A implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Z  reason: collision with root package name */
    public final wf.k f8611Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f8612h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f8613i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f8614j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8615k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8616l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8617m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f8618n0;

    /* renamed from: r0  reason: collision with root package name */
    public final io.sentry.android.core.z f8622r0;

    /* renamed from: Y  reason: collision with root package name */
    public final wf.k f8610Y = t.f8682Z;

    /* renamed from: o0  reason: collision with root package name */
    public final Handler f8619o0 = new Handler(Looper.getMainLooper());

    /* renamed from: p0  reason: collision with root package name */
    public final LinkedHashSet f8620p0 = new LinkedHashSet();

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashSet f8621q0 = new LinkedHashSet();

    /* renamed from: s0  reason: collision with root package name */
    public final LinkedHashMap f8623s0 = new LinkedHashMap();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f8624t0 = new ArrayList();

    public A(kh.j jVar, u uVar) {
        this.f8611Z = jVar;
        this.f8622r0 = new io.sentry.android.core.z(uVar);
    }

    public final void a(Activity activity, Bundle bundle) {
        boolean z10;
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashMap linkedHashMap = this.f8623s0;
        if (linkedHashMap.containsKey(hexString)) {
            return;
        }
        boolean isEmpty = this.f8621q0.isEmpty();
        io.sentry.android.core.z zVar = this.f8622r0;
        zVar.d();
        if (isEmpty) {
            AbstractC3557B.b0("identityHash", hexString);
            zVar.a(hexString);
        }
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC3557B.b0("identityHash", hexString);
        linkedHashMap.put(hexString, new w(true, z10));
        N n10 = new N(this, hexString, z10, 5);
        ArrayList arrayList = this.f8624t0;
        boolean z11 = !arrayList.isEmpty();
        arrayList.add(n10);
        if (!z11) {
            this.f8619o0.post(new RunnableC3921k(14, this));
        }
    }

    public final String b(Activity activity) {
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashSet linkedHashSet = this.f8620p0;
        if (linkedHashSet.contains(hexString)) {
            AbstractC3557B.b0("identityHash", hexString);
            return hexString;
        }
        linkedHashSet.add(hexString);
        this.f8622r0.d();
        AbstractC3557B.b0("identityHash", hexString);
        return hexString;
    }

    public final void c(Activity activity) {
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashSet linkedHashSet = this.f8621q0;
        if (linkedHashSet.contains(hexString)) {
            return;
        }
        boolean isEmpty = linkedHashSet.isEmpty();
        io.sentry.android.core.z zVar = this.f8622r0;
        zVar.d();
        if (isEmpty) {
            AbstractC3557B.b0("identityHash", hexString);
            zVar.a(hexString);
            this.f8611Z.invoke(Hi.i.f7878Y);
        }
        linkedHashSet.add(hexString);
    }

    public final void d(String str, x xVar) {
        this.f8610Y.invoke(new C4678h(str, 7, xVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z10;
        AbstractC3557B.c0("activity", activity);
        a(activity, bundle);
        if (!this.f8612h0) {
            this.f8612h0 = true;
            String name = activity.getClass().getName();
            if (bundle != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8610Y.invoke(new A0(activity, name, z10, 7));
        }
        if (!this.f8615k0) {
            y yVar = new y(this, activity, 0);
            q qVar = new q(0);
            Window window = activity.getWindow();
            AbstractC3557B.b0("window", window);
            AbstractC1983i.c(window, new X(new C4385I(window, qVar, yVar, 14), 14));
        }
        if (!this.f8616l0) {
            Window window2 = activity.getWindow();
            AbstractC3557B.b0("activity.window", window2);
            P4.a.t0(window2, new y(this, activity, 1));
        }
        if (!this.f8617m0) {
            Window window3 = activity.getWindow();
            AbstractC3557B.b0("activity.window", window3);
            AbstractC1983i.c(window3, new X(new y(this, activity, 2), 11));
        }
        if (!this.f8618n0) {
            C4678h c4678h = new C4678h(this, 6, activity);
            Window window4 = activity.getWindow();
            AbstractC3557B.b0("window", window4);
            AbstractC1983i.b(window4).add(new J(activity, c4678h));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        LinkedHashMap linkedHashMap = this.f8623s0;
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        AbstractC3557B.b0("toHexString(System.identityHashCode(activity))", hexString);
        linkedHashMap.remove(hexString);
        this.f8622r0.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.f8620p0.remove(Integer.toHexString(System.identityHashCode(activity)));
        this.f8622r0.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        a(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m mVar;
        AbstractC3557B.c0("activity", activity);
        String b10 = b(activity);
        if (!this.f8614j0) {
            this.f8614j0 = true;
            d(activity.getClass().getName(), x.f8704l0);
        }
        w wVar = (w) AbstractC4268D.Z0(b10, this.f8623s0);
        if (wVar.f8697a) {
            if (wVar.f8698b) {
                mVar = m.f8672Z;
            } else {
                mVar = m.f8671Y;
            }
        } else {
            mVar = m.f8673h0;
        }
        io.sentry.android.core.z zVar = this.f8622r0;
        zVar.getClass();
        if (((k) zVar.f34265h0) != null) {
            Window window = activity.getWindow();
            AbstractC3557B.b0("resumedActivity.window", window);
            P4.a.t0(window, new C4385I(zVar, b10, mVar, 13));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("outState", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        c(activity);
        if (!this.f8613i0) {
            this.f8613i0 = true;
            d(activity.getClass().getName(), x.f8705m0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        LinkedHashSet linkedHashSet = this.f8621q0;
        linkedHashSet.remove(Integer.toHexString(System.identityHashCode(activity)));
        boolean isEmpty = linkedHashSet.isEmpty();
        io.sentry.android.core.z zVar = this.f8622r0;
        if (isEmpty) {
            zVar.getClass();
            zVar.f34264Z = Long.valueOf(SystemClock.elapsedRealtime());
            this.f8611Z.invoke(Hi.i.f7879Z);
        }
        zVar.d();
    }
}
