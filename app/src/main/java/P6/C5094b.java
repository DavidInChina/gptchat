package p6;

import android.app.Activity;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import id.AbstractC3557B;
import q6.C5276a;
import s3.r;
import v6.AbstractC5979c;

/* renamed from: p6.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5094b extends y6.c implements AbstractC5979c {

    /* renamed from: Z  reason: collision with root package name */
    public final C5276a f42748Z;

    public C5094b(C5276a c5276a) {
        this.f42748Z = c5276a;
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
        if (!AbstractC3557B.K(C5094b.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29", obj);
        if (AbstractC3557B.K(this.f42748Z, ((C5094b) obj).f42748Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42748Z.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        e(new r(this, 6, activity));
        super.onActivityPreCreated(activity, bundle);
    }

    public final String toString() {
        return "UserActionTrackingStrategyApi29(" + this.f42748Z + Separators.RPAREN;
    }
}
