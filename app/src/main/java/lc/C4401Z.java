package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC3642e1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import xe.C6431t;

/* renamed from: io.sentry.android.core.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3614e {

    /* renamed from: a  reason: collision with root package name */
    public final FrameMetricsAggregator f34093a;

    /* renamed from: b  reason: collision with root package name */
    public final SentryAndroidOptions f34094b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap f34095c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f34096d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final S4.o f34097e;

    public C3614e(SentryAndroidOptions sentryAndroidOptions) {
        S4.o oVar = new S4.o(17);
        this.f34093a = null;
        if (C6431t.m("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger()) != null) {
            this.f34093a = new FrameMetricsAggregator();
        }
        this.f34094b = sentryAndroidOptions;
        this.f34097e = oVar;
    }

    public final synchronized void a(Activity activity) {
        if (!c()) {
            return;
        }
        d(new RunnableC3611b(this, activity, 0), "FrameMetricsAggregator.add");
        C3613d b10 = b();
        if (b10 != null) {
            this.f34096d.put(activity, b10);
        }
    }

    public final C3613d b() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!c() || (frameMetricsAggregator = this.f34093a) == null) {
            return null;
        }
        SparseIntArray[] m10 = frameMetricsAggregator.f24909a.m();
        int i12 = 0;
        if (m10 != null && m10.length > 0 && (sparseIntArray = m10[0]) != null) {
            int i13 = 0;
            i11 = 0;
            i10 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i10 += valueAt;
                } else if (keyAt > 16) {
                    i11 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new C3613d(i12, i11, i10);
    }

    public final boolean c() {
        if (this.f34093a != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f34094b;
            if (sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2()) {
                return true;
            }
        }
        return false;
    }

    public final void d(Runnable runnable, String str) {
        try {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                runnable.run();
            } else {
                S4.o oVar = this.f34097e;
                ((Handler) oVar.f16184Z).post(new Q(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f34094b.getLogger().f(EnumC3642e1.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public final synchronized Map e(io.sentry.protocol.s sVar) {
        if (!c()) {
            return null;
        }
        Map map = (Map) this.f34095c.get(sVar);
        this.f34095c.remove(sVar);
        return map;
    }
}, C4421t.f38273a)) {
            n("https://openai.com/privacy/");
        } else if (AbstractC3557B.K(abstractC4380D, C4419r.f38271a)) {
            m(Uc.F.f17613k.o1());
        } else if (AbstractC3557B.K(abstractC4380D, C4379C.f38078a)) {
            m(Uc.W.f17633k.o1());
        } else if (AbstractC3557B.K(abstractC4380D, C4420s.f38272a)) {
            m(Uc.H.f17615k.o1());
        } else if (AbstractC3557B.K(abstractC4380D, C4413l.f38265a)) {
            m(C1420e.f17667k.o1());
        } else if (AbstractC3557B.K(abstractC4380D, C4417p.f38269a)) {
            m(C1434t.f17696k.o1());
        } else if (AbstractC3557B.K(abstractC4380D, C4416o.f38268a)) {
            m(C1431p.f17692k.o1());
        } else if (AbstractC3557B.K(abstractC4380D, C4422u.f38274a)) {
            h(new C4396U(this, null));
        } else if (abstractC4380D instanceof C4424w) {
            h(new C4397V(abstractC4380D, this, null));
        } else if (abstractC4380D instanceof C4425x) {
            h(new C4398W(abstractC4380D, this, null));
        } else if (abstractC4380D instanceof C4423v) {
            h(new C4399X(abstractC4380D, this, null));
        } else if (abstractC4380D instanceof C4427z) {
            h(new C4400Y(abstractC4380D, this, null));
        }
    }

    public final void m(String str) {
        f(new C4409h(str));
    }

    public final void n(String str) {
        Intent intent = new Intent();
        A7.b.G0(intent, str);
        f(new C4408g(intent));
    }
}
