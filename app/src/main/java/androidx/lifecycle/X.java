package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import id.AbstractC3557B;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class X implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25340Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f25341Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f25342h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f25343i0;

    public X(C2088x c2088x, EnumC2081p enumC2081p) {
        AbstractC3557B.c0("registry", c2088x);
        AbstractC3557B.c0("event", enumC2081p);
        this.f25342h0 = c2088x;
        this.f25343i0 = enumC2081p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25340Y;
        Object obj = this.f25342h0;
        Object obj2 = this.f25343i0;
        switch (i10) {
            case 0:
                if (!this.f25341Z) {
                    ((C2088x) obj).k((EnumC2081p) obj2);
                    this.f25341Z = true;
                    return;
                }
                return;
            default:
                L1.e eVar = ((SwipeDismissBehavior) obj2).f27011a;
                if (eVar != null && eVar.f()) {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    D1.H.m((View) obj, this);
                    return;
                }
                return;
        }
    }

    public X(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f25343i0 = swipeDismissBehavior;
        this.f25342h0 = view;
        this.f25341Z = z10;
    }
}
