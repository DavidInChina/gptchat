package Cb;

import Mb.AbstractC0949d0;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes.dex */
public final class B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2862Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0949d0 f2863Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f2864h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f2865i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AbstractActivityC4532l abstractActivityC4532l, AbstractC0949d0 abstractC0949d0, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2863Z = abstractC0949d0;
        this.f2864h0 = fVar;
        this.f2865i0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B(this.f2865i0, this.f2863Z, this.f2864h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2862Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC0949d0 abstractC0949d0 = this.f2863Z;
            C5426p c5426p = abstractC0949d0.f812i;
            A a5 = new A(this.f2865i0, abstractC0949d0, this.f2864h0, null);
            this.f2862Y = 1;
            if (L4.a.b0(c5426p, a5, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
