package lb;

import aa.C1939b;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import gb.U;
import gb.k0;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class x extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38068Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38069Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f38070h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38069Z = k10;
        this.f38070h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new x(this.f38070h0, this.f38069Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((x) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38068Y;
        jf.y yVar = jf.y.f36177a;
        K k10 = this.f38069Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
            obj2 = obj;
        } else {
            N.B0(obj);
            Rg.o oVar = ((C4972C) k10.f37954j).f41058m;
            this.f38068Y = 1;
            obj2 = L4.a.m0(oVar, this);
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        C2311c c2311c = (C2311c) obj2;
        if (c2311c != null) {
            U u10 = (U) this.f38070h0;
            C1939b c1939b = u10.f31375a;
            ha.K k11 = u10.f31376b;
            Va.e eVar = k10.f37958n;
            w wVar = new w(k10, 0);
            w wVar2 = new w(k10, 1);
            w wVar3 = new w(k10, 2);
            this.f38068Y = 2;
            if (K8.d.w0(c1939b, k11, c2311c.f26374a, eVar, false, wVar, wVar2, wVar3, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
