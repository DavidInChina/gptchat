package V1;

import android.view.View;
import androidx.lifecycle.AbstractC2076k;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.HashMap;

/* renamed from: V1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478t implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18244Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f18245Z;

    public C1478t(AbstractC2076k[] abstractC2076kArr) {
        this.f18245Z = abstractC2076kArr;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        View view;
        int i10 = this.f18244Y;
        Object obj = this.f18245Z;
        switch (i10) {
            case 0:
                if (enumC2081p == EnumC2081p.ON_STOP && (view = ((AbstractComponentCallbacksC1480v) obj).f18269J0) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                new HashMap();
                AbstractC2076k[] abstractC2076kArr = (AbstractC2076k[]) obj;
                if (abstractC2076kArr.length <= 0) {
                    if (abstractC2076kArr.length <= 0) {
                        return;
                    }
                    AbstractC2076k abstractC2076k = abstractC2076kArr[0];
                    throw null;
                }
                AbstractC2076k abstractC2076k2 = abstractC2076kArr[0];
                throw null;
            case 2:
                if (enumC2081p == EnumC2081p.ON_CREATE) {
                    abstractC2086v.h().g(this);
                    ((androidx.lifecycle.T) obj).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC2081p).toString());
            default:
                AbstractC2469q0.p(obj);
                throw null;
        }
    }

    public C1478t(androidx.lifecycle.T t10) {
        this.f18245Z = t10;
    }

    public C1478t(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        this.f18245Z = abstractComponentCallbacksC1480v;
    }
}
