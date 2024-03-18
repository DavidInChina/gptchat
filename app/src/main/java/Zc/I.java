package zc;

import mc.C4616c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class I extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51834Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51835Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51835Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        I i10 = new I(this.f51835Z, abstractC4825e);
        i10.f51834Y = obj;
        return i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((I) create((C4616c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f51835Z.l(new C6821H(0, (C4616c) this.f51834Y));
        return jf.y.f36177a;
    }
}
