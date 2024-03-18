package y6;

import M3.H;
import android.app.Activity;
import id.AbstractC3557B;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jf.C3963m;
import kf.w;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.C5089a;
import p5.EnumC5090b;
import s3.C5551a;
import u5.RunnableC5841a;
import z6.C6775a;

/* loaded from: classes.dex */
public final class d extends c implements j {

    /* renamed from: h0  reason: collision with root package name */
    public final e f50828h0;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f50827Z = false;

    /* renamed from: i0  reason: collision with root package name */
    public final C3963m f50829i0 = R4.b.D1(new X0.b(26, this));

    public d(e eVar) {
        AbstractC3557B.c0("componentPredicate", eVar);
        this.f50828h0 = eVar;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(d.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.rum.tracking.ActivityViewTrackingStrategy", obj);
        d dVar = (d) obj;
        if (this.f50827Z == dVar.f50827Z && AbstractC3557B.K(this.f50828h0, dVar.f50828h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f50827Z) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f50828h0.hashCode() + (i10 * 31);
    }

    @Override // y6.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String str;
        Map map;
        i6.f fVar;
        AbstractC3557B.c0("activity", activity);
        super.onActivityResumed(activity);
        AbstractC5091c d10 = d();
        e eVar = this.f50828h0;
        int i10 = ((C6545a) eVar).f50822a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        break;
                    default:
                        return;
                }
            default:
                switch (i10) {
                    case 0:
                        break;
                    default:
                        return;
                }
        }
        try {
            int i11 = ((C6545a) eVar).f50822a;
            if (activity instanceof C5551a) {
                C5551a c5551a = (C5551a) activity;
                str = "Unknown";
            } else if (activity instanceof String) {
                str = (String) activity;
            } else {
                str = activity.getClass().getCanonicalName();
                if (str == null) {
                    str = activity.getClass().getSimpleName();
                }
            }
            if (this.f50827Z) {
                map = c.c(activity.getIntent());
            } else {
                map = w.f37484Y;
            }
            r5.d dVar = this.f50826Y;
            if (dVar != null) {
                fVar = i6.b.a(dVar);
            } else {
                AbstractC5091c.f42742a.getClass();
                P4.a.m0(C5089a.f42737b, 3, EnumC5090b.f42738Y, b.f50824h0, null, false, 56);
                fVar = null;
            }
            if (fVar != null) {
                fVar.k(str, activity, map);
            }
        } catch (Exception e10) {
            P4.a.l0(d10, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), C6775a.f51741Z, e10, 48);
        }
    }

    @Override // y6.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        super.onActivityStopped(activity);
        H.n0((ScheduledExecutorService) this.f50829i0.getValue(), "Delayed view stop", 200L, TimeUnit.MILLISECONDS, d(), new RunnableC5841a(this, 5, activity));
    }
}
