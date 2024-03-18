package Z1;

import Z.C1724m0;
import Z.C1733r0;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import h2.C3309f;
import h2.C3311h;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Z1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C1724m0 f22981Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f22982Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22983h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1771m f22984i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f22985j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Context f22986k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768j(C1771m c1771m, AppWidgetManager appWidgetManager, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22984i0 = c1771m;
        this.f22985j0 = appWidgetManager;
        this.f22986k0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1768j c1768j = new C1768j(this.f22984i0, this.f22985j0, this.f22986k0, abstractC4825e);
        c1768j.f22983h0 = obj;
        return c1768j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1768j) create((C1733r0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C1733r0 c1733r0;
        C1724m0 c1724m0;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22982Z;
        if (i10 != 0) {
            if (i10 == 1) {
                c1724m0 = this.f22981Y;
                c1733r0 = (C1733r0) this.f22983h0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            c1733r0 = (C1733r0) this.f22983h0;
            C1771m c1771m = this.f22984i0;
            C1724m0 c1724m02 = c1771m.f23008h;
            Bundle bundle = c1771m.f23005e;
            if (bundle == null) {
                bundle = this.f22985j0.getAppWidgetOptions(c1771m.f23004d.f22945a);
            }
            c1724m02.setValue(bundle);
            C3311h c3311h = c1771m.f23003c.f22890d;
            if (c3311h != null) {
                this.f22983h0 = c1733r0;
                C1724m0 c1724m03 = c1771m.f23007g;
                this.f22981Y = c1724m03;
                this.f22982Z = 1;
                obj = ((C3309f) c1771m.f23006f).c(this.f22986k0, c3311h, c1771m.f31117a, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                c1724m0 = c1724m03;
            }
            c1733r0.setValue(Boolean.TRUE);
            return jf.y.f36177a;
        }
        c1724m0.setValue(obj);
        c1733r0.setValue(Boolean.TRUE);
        return jf.y.f36177a;
    }
}
