package lh;

import N.W;
import Qg.C1196d;
import Qg.C1209l;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lh.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4490i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f38481Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f38482Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f38483h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4490i(q qVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38483h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4490i c4490i = new C4490i(this.f38483h0, abstractC4825e);
        c4490i.f38482Z = obj;
        return c4490i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4490i) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38481Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            q qVar = this.f38483h0;
            C1209l c1209l = new C1209l(new p(qVar.f38500b, null, L4.a.X(L4.a.i0(new C1196d(qVar.f38501c, true)), -1)));
            W w10 = new W(qVar, 15, (Ng.F) this.f38482Z);
            this.f38481Y = 1;
            if (c1209l.b(w10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
