package Jb;

import Mb.AbstractC0957h0;
import Mb.C0953f0;
import Mb.C0955g0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9007Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9008Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9008Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        n nVar = new n(this.f9008Z, abstractC4825e);
        nVar.f9007Y = obj;
        return nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((n) create((AbstractC0957h0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC0957h0 abstractC0957h0 = (AbstractC0957h0) this.f9007Y;
        boolean z10 = abstractC0957h0 instanceof C0953f0;
        Tc.f fVar = this.f9008Z;
        if (z10) {
            C0953f0 c0953f0 = (C0953f0) abstractC0957h0;
            if (c0953f0.f11932b) {
                fVar.f17057b.p();
            }
            Bi.c.r1(fVar.f17057b, c0953f0.f11931a);
        } else if (abstractC0957h0 instanceof C0955g0) {
            Tc.f.c(fVar, ((C0955g0) abstractC0957h0).f11941a, 0, 14);
        }
        return jf.y.f36177a;
    }
}
