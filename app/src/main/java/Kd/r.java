package Kd;

import Dd.C0398t;
import Ng.Q;
import Qg.F0;
import We.EnumC1654e;
import Z8.Y0;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9761Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f9762Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ I f9763h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9763h0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        r rVar = new r(this.f9763h0, abstractC4825e);
        rVar.f9762Z = obj;
        return rVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Te.w) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Te.v vVar;
        F0 f02;
        Object value;
        Object obj2;
        boolean z10;
        F0 f03;
        Object value2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9761Y;
        jf.y yVar = jf.y.f36177a;
        I i11 = this.f9763h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    i11.f9699v.setValue(l.f9749a);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
            return yVar;
        }
        N.B0(obj);
        Te.w wVar = (Te.w) this.f9762Z;
        if (wVar instanceof Te.o) {
            K k10 = (K) i11.f9686i.getValue();
            if (k10 != null && k10.f9719g == null) {
                k10.a(Y0.f23305r, kf.w.f37484Y);
                Yg.p.Companion.getClass();
                Yg.p pVar = new Yg.p(AbstractC6463a.n("instant(...)"));
                k10.f9719g = pVar;
                long b10 = pVar.b(k10.f9718f);
                k10.a(Y0.f23295h, P4.a.o0(new C3959i("latency", Long.valueOf(Mg.b.e(b10)))));
                long e10 = Mg.b.e(b10);
                do {
                    f03 = k10.f9722j;
                    value2 = f03.getValue();
                } while (!f03.e(value2, AbstractC4268D.g1((Map) value2, new C3959i("Connection Latency", Long.valueOf(e10)))));
                i11.f9699v.setValue(new C0833i(false));
            } else {
                i11.f9699v.setValue(new C0833i(false));
            }
        } else if (wVar instanceof Te.r) {
            i11.f9699v.setValue(C0835k.f9748a);
        } else {
            boolean z11 = wVar instanceof Te.u;
            C0834j c0834j = C0834j.f9747a;
            if (z11) {
                i11.f9699v.setValue(c0834j);
            } else if (wVar instanceof Te.q) {
                byte[] bArr = ((Te.q) wVar).f17201b;
                this.f9761Y = 1;
                i11.f9685h.getClass();
                Object n12 = Ad.l.n1(this, Q.f12906c, new B(i11, null, bArr));
                if (n12 != enumC5000a) {
                    n12 = yVar;
                }
                if (n12 == enumC5000a) {
                    return enumC5000a;
                }
            } else if (wVar instanceof Te.p) {
                Te.p pVar2 = (Te.p) wVar;
                i11.f9697t.setValue(pVar2.f17200c.name());
                do {
                    f02 = i11.f9699v;
                    value = f02.getValue();
                    obj2 = (m) value;
                    if (obj2 instanceof C0833i) {
                        if (AbstractC3557B.K(pVar2.f17199b, wVar.f17206a.f18883v)) {
                            C0833i c0833i = (C0833i) obj2;
                            if (((Te.p) wVar).f17200c == EnumC1654e.f20992h0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c0833i.getClass();
                            obj2 = new C0833i(z10);
                        }
                    }
                } while (!f02.e(value, obj2));
            } else if (wVar instanceof Te.s) {
                W.F(i11.f9691n, "Remote participant disconnected: " + ((Te.s) wVar).f17202b, null, 6);
                m mVar = (m) i11.f9699v.getValue();
                if ((mVar instanceof C0833i) || AbstractC3557B.K(mVar, c0834j)) {
                    this.f9761Y = 2;
                    if (i11.d(this) == enumC5000a) {
                        return enumC5000a;
                    }
                    i11.f9699v.setValue(l.f9749a);
                }
            } else if (wVar instanceof Te.v) {
                if (((C0398t) i11.f9693p.getValue()).f3573a == Dd.N.f3525Z && ((Te.v) wVar).f17205d == 2) {
                    I.a(i11, new C0398t(Dd.N.f3526h0, null));
                }
                int i12 = ((Te.v) wVar).f17205d;
                W.F(i11.f9691n, "E2EE state changed: " + R.a.C(i12) + Separators.SP + vVar.f17204c + Separators.SP + vVar.f17203b, null, 6);
            }
        }
        return yVar;
    }
}
