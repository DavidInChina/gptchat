package ng;

import K4.J;
import Mf.AbstractC0994c;
import android.app.Activity;
import hh.C3443k;
import id.AbstractC3557B;
import ih.FragmentManager$FragmentLifecycleCallbacksC3584a;
import jf.y;

/* renamed from: ng.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4844k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40350Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f40351Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f40352h0;

    public C4844k(C3443k c3443k) {
        this.f40350Y = 1;
        this.f40352h0 = c3443k;
        this.f40351Z = new FragmentManager$FragmentLifecycleCallbacksC3584a(this);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f40350Y;
        Object obj2 = this.f40351Z;
        switch (i10) {
            case 0:
                AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
                J j6 = (J) obj2;
                AbstractC0994c abstractC0994c2 = (AbstractC0994c) this.f40352h0;
                j6.getClass();
                AbstractC3557B.c0("first", abstractC0994c2);
                AbstractC3557B.c0("second", abstractC0994c);
                j6.n(abstractC0994c2, abstractC0994c);
                return yVar;
            default:
                Activity activity = (Activity) obj;
                AbstractC3557B.d0("activity", activity);
                activity.getFragmentManager().registerFragmentLifecycleCallbacks((FragmentManager$FragmentLifecycleCallbacksC3584a) obj2, true);
                return yVar;
        }
    }

    public C4844k(J j6, AbstractC0994c abstractC0994c) {
        this.f40350Y = 0;
        this.f40351Z = j6;
        this.f40352h0 = abstractC0994c;
    }
}
