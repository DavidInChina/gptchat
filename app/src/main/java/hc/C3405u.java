package hc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: hc.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3405u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y f32222Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3405u(y yVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32222Z = yVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3405u c3405u = new C3405u(this.f32222Z, abstractC4825e);
        c3405u.f32221Y = obj;
        return c3405u;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C3405u) create((Ba.c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f32222Z.l(new Ba.g((Ba.c) this.f32221Y, 2));
        return jf.y.f36177a;
    }
}
