package ec;

import h9.C3338c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;

/* renamed from: ec.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2832B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f29124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29125Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2832B(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29125Z = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2832B c2832b = new C2832B(this.f29125Z, abstractC4825e);
        c2832b.f29124Y = obj;
        return c2832b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C2832B) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f29125Z.l(new C3338c((C6205s) this.f29124Y, 2));
        return jf.y.f36177a;
    }
}
