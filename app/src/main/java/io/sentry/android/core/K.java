package io.sentry.android.core;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import i8.C3493k;
import io.sentry.C3640e;
import io.sentry.C3658k;
import io.sentry.EnumC3642e1;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class K implements DefaultLifecycleObserver {

    /* renamed from: Z  reason: collision with root package name */
    public final long f33984Z;

    /* renamed from: h0  reason: collision with root package name */
    public C3658k f33985h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Timer f33986i0;

    /* renamed from: k0  reason: collision with root package name */
    public final io.sentry.G f33988k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f33989l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f33990m0;

    /* renamed from: n0  reason: collision with root package name */
    public final io.sentry.transport.g f33991n0;

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicLong f33983Y = new AtomicLong(0);

    /* renamed from: j0  reason: collision with root package name */
    public final Object f33987j0 = new Object();

    public K(io.sentry.G g10, long j6, boolean z10, boolean z11) {
        io.sentry.transport.e eVar = io.sentry.transport.e.f34741Y;
        this.f33984Z = j6;
        this.f33989l0 = z10;
        this.f33990m0 = z11;
        this.f33988k0 = g10;
        this.f33991n0 = eVar;
        if (z10) {
            this.f33986i0 = new Timer(true);
        } else {
            this.f33986i0 = null;
        }
    }

    public final void a(String str) {
        if (this.f33990m0) {
            C3640e c3640e = new C3640e();
            c3640e.f34320h0 = "navigation";
            c3640e.a("state", str);
            c3640e.f34322j0 = "app.lifecycle";
            c3640e.f34323k0 = EnumC3642e1.INFO;
            this.f33988k0.i(c3640e);
        }
    }

    public final void c() {
        synchronized (this.f33987j0) {
            try {
                C3658k c3658k = this.f33985h0;
                if (c3658k != null) {
                    c3658k.cancel();
                    this.f33985h0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC2072g.b(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(AbstractC2086v abstractC2086v) {
        AbstractC2072g.c(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(AbstractC2086v abstractC2086v) {
        AbstractC2072g.d(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(AbstractC2086v abstractC2086v) {
        if (this.f33989l0) {
            c();
            long currentTimeMillis = this.f33991n0.getCurrentTimeMillis();
            C3493k c3493k = new C3493k(4, this);
            io.sentry.G g10 = this.f33988k0;
            g10.p(c3493k);
            AtomicLong atomicLong = this.f33983Y;
            long j6 = atomicLong.get();
            if (j6 == 0 || j6 + this.f33984Z <= currentTimeMillis) {
                C3640e c3640e = new C3640e();
                c3640e.f34320h0 = ParameterNames.SESSION;
                c3640e.a("state", "start");
                c3640e.f34322j0 = "app.lifecycle";
                c3640e.f34323k0 = EnumC3642e1.INFO;
                g10.i(c3640e);
                g10.B();
            }
            atomicLong.set(currentTimeMillis);
        }
        a("foreground");
        A.f33913b.a(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(AbstractC2086v abstractC2086v) {
        if (this.f33989l0) {
            this.f33983Y.set(this.f33991n0.getCurrentTimeMillis());
            synchronized (this.f33987j0) {
                try {
                    c();
                    if (this.f33986i0 != null) {
                        C3658k c3658k = new C3658k(2, this);
                        this.f33985h0 = c3658k;
                        this.f33986i0.schedule(c3658k, this.f33984Z);
                    }
                } finally {
                }
            }
        }
        A.f33913b.a(true);
        a("background");
    }
}
