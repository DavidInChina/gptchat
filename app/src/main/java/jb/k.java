package Jb;

import Mb.AbstractC0989y;
import Mb.C0985w;
import Mb.C0987x;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9000Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9001Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9001Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        k kVar = new k(this.f9001Z, abstractC4825e);
        kVar.f9000Y = obj;
        return kVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((k) create((AbstractC0989y) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC0989y abstractC0989y = (AbstractC0989y) this.f9000Y;
        boolean z10 = abstractC0989y instanceof C0985w;
        Tc.f fVar = this.f9001Z;
        if (z10) {
            Bi.c.r1(fVar.f17057b, ((C0985w) abstractC0989y).f11994a);
        } else if (abstractC0989y instanceof C0987x) {
            Tc.f.c(fVar, ((C0987x) abstractC0989y).f11999a, 0, 14);
        }
        return jf.y.f36177a;
    }
}
