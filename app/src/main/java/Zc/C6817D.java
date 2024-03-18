package zc;

import Cd.C0332q;
import Z8.AbstractC1809m0;
import Z8.Y0;
import aa.C1939b;
import ca.C2311c;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6817D extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51823Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51824Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Cd.y f51825h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6817D(Q q10, Cd.y yVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51824Z = q10;
        this.f51825h0 = yVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6817D(this.f51824Z, this.f51825h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C6817D) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51823Y;
        jf.y yVar = jf.y.f36177a;
        Q q10 = this.f51824Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
            obj2 = obj;
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1809m0.a().b(Y0.f23289b, kf.w.f37484Y);
            Rg.o oVar = ((C4972C) q10.f51858j).f41058m;
            this.f51823Y = 1;
            obj2 = L4.a.m0(oVar, this);
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        C2311c c2311c = (C2311c) obj2;
        if (c2311c != null) {
            C0332q c0332q = (C0332q) this.f51825h0;
            C1939b c1939b = c0332q.f3067a;
            ha.K k10 = c0332q.f3068b;
            Va.e eVar = (Va.e) q10.f51868t.getValue();
            AbstractC3557B.b0("access$getGizmosRepository(...)", eVar);
            C6826e c6826e = new C6826e(q10, 1);
            C6826e c6826e2 = new C6826e(q10, 2);
            C6826e c6826e3 = new C6826e(q10, 3);
            this.f51823Y = 2;
            if (K8.d.w0(c1939b, k10, c2311c.f26374a, eVar, true, c6826e, c6826e2, c6826e3, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
