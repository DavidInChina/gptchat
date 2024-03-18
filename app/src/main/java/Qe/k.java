package Qe;

import Ng.F;
import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14702Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f14703Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14703Z = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f14703Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [pf.j, wf.o] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14702Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            m mVar = this.f14703Z;
            AbstractC1206i i02 = L4.a.i0(L4.a.q0(mVar.f14705b, mVar.f14706c, new AbstractC5163j(3, null)));
            j jVar = new j(mVar, null);
            this.f14702Y = 1;
            if (L4.a.b0(i02, jVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
