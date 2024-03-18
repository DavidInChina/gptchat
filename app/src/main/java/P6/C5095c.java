package p6;

import android.app.Activity;
import android.gov.nist.core.Separators;
import android.view.Window;
import id.AbstractC3557B;
import q6.C5276a;
import q6.e;
import q6.g;
import s3.r;
import v6.AbstractC5979c;

/* renamed from: p6.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5095c extends y6.c implements AbstractC5979c {

    /* renamed from: Z  reason: collision with root package name */
    public final C5276a f42749Z;

    public C5095c(C5276a c5276a) {
        this.f42749Z = c5276a;
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
        if (!AbstractC3557B.K(C5095c.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy", obj);
        if (AbstractC3557B.K(this.f42749Z, ((C5095c) obj).f42749Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42749Z.hashCode();
    }

    @Override // y6.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        super.onActivityPaused(activity);
        Window window = activity.getWindow();
        this.f42749Z.getClass();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof g) {
                Window.Callback callback2 = ((g) callback).f43964Z;
                if (!(callback2 instanceof e)) {
                    window.setCallback(callback2);
                } else {
                    window.setCallback(null);
                }
            }
        }
    }

    @Override // y6.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        super.onActivityResumed(activity);
        e(new r(this, 7, activity));
    }

    public final String toString() {
        return "UserActionTrackingStrategyLegacy(" + this.f42749Z + Separators.RPAREN;
    }
}
