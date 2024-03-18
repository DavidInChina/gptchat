package com.google.android.gms.common.api.internal;

import A7.b;
import Df.H;
import H0.C0672c0;
import H7.d;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import u7.k;
import u7.m;
import v7.v;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends m> extends H {

    /* renamed from: o  reason: collision with root package name */
    public static final C0672c0 f26811o = new C0672c0(5);

    /* renamed from: j  reason: collision with root package name */
    public m f26816j;

    /* renamed from: k  reason: collision with root package name */
    public Status f26817k;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f26818l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26819m;

    /* renamed from: f  reason: collision with root package name */
    public final Object f26812f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final CountDownLatch f26813g = new CountDownLatch(1);

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f26814h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference f26815i = new AtomicReference();

    /* renamed from: n  reason: collision with root package name */
    public boolean f26820n = false;

    public BasePendingResult(v vVar) {
        Looper looper;
        if (vVar != null) {
            looper = vVar.f47349b.f46461f;
        } else {
            looper = Looper.getMainLooper();
        }
        new d(looper, 0);
        new WeakReference(vVar);
    }

    public final void F0(k kVar) {
        synchronized (this.f26812f) {
            try {
                if (I0()) {
                    kVar.a(this.f26817k);
                } else {
                    this.f26814h.add(kVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract m G0(Status status);

    public final void H0(Status status) {
        synchronized (this.f26812f) {
            try {
                if (!I0()) {
                    J0(G0(status));
                    this.f26819m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean I0() {
        if (this.f26813g.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void J0(m mVar) {
        synchronized (this.f26812f) {
            try {
                if (!this.f26819m) {
                    I0();
                    b.m0("Results have already been set", !I0());
                    b.m0("Result has already been consumed", !this.f26818l);
                    this.f26816j = mVar;
                    this.f26817k = mVar.a();
                    this.f26813g.countDown();
                    ArrayList arrayList = this.f26814h;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((k) arrayList.get(i10)).a(this.f26817k);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Df.H
    public final m o(TimeUnit timeUnit) {
        m mVar;
        b.m0("Result has already been consumed.", !this.f26818l);
        try {
            if (!this.f26813g.await(0L, timeUnit)) {
                H0(Status.f26805m0);
            }
        } catch (InterruptedException unused) {
            H0(Status.f26803k0);
        }
        b.m0("Result is not ready.", I0());
        synchronized (this.f26812f) {
            b.m0("Result has already been consumed.", !this.f26818l);
            b.m0("Result is not ready.", I0());
            mVar = this.f26816j;
            this.f26816j = null;
            this.f26818l = true;
        }
        AbstractC2469q0.p(this.f26815i.getAndSet(null));
        b.k0(mVar);
        return mVar;
    }
}
