package rc;

import Ng.AbstractC1073l0;
import Ng.D0;
import Qg.AbstractC1206i;
import Qg.F0;
import Qg.s0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rb.C5426p;

/* renamed from: rc.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5472v implements xd.b {

    /* renamed from: a  reason: collision with root package name */
    public final C5474x f44931a;

    /* renamed from: b  reason: collision with root package name */
    public final ld.p f44932b;

    /* renamed from: c  reason: collision with root package name */
    public final xd.j f44933c;

    /* renamed from: d  reason: collision with root package name */
    public final xd.a f44934d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1206i f44935e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC1206i f44936f;

    /* renamed from: g  reason: collision with root package name */
    public final F0 f44937g = s0.c(null);

    /* renamed from: h  reason: collision with root package name */
    public final F0 f44938h = s0.c(null);

    /* renamed from: i  reason: collision with root package name */
    public D0 f44939i;

    public C5472v(C5474x c5474x, ld.p pVar, xd.j jVar, xd.a aVar) {
        this.f44931a = c5474x;
        this.f44932b = pVar;
        this.f44933c = jVar;
        this.f44934d = aVar;
        AbstractC1206i i02 = L4.a.i0(new Ia.j(L4.a.l0(c5474x.f44961e), 3, this));
        this.f44935e = i02;
        this.f44936f = L4.a.i0(new C5426p(i02, 6));
        L4.a.E0(L4.a.I0(new C5468q(this, null), L4.a.q0(((h0) jVar).f44886e, ((C5463l) aVar).f44908e, C5467p.f44915m0)), pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        r rVar;
        int i10;
        C5472v c5472v;
        D0 O02;
        if (abstractC4825e instanceof r) {
            rVar = (r) abstractC4825e;
            int i11 = rVar.f44922i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f44922i0 = i11 - Integer.MIN_VALUE;
                Object obj = rVar.f44920Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = rVar.f44922i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) rVar.f44919Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c5472v = (C5472v) rVar.f44919Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            O02 = Ad.l.O0(c5472v.f44932b, null, null, new C5469s(c5472v, null), 3);
                            c5472v.f44939i = O02;
                            rVar.f44919Y = O02;
                            rVar.f44922i0 = 3;
                            if (O02.F(rVar) != enumC5000a) {
                                return enumC5000a;
                            }
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    D0 d02 = this.f44939i;
                    if (d02 != null && d02.a()) {
                        rVar.f44922i0 = 1;
                        if (d02.F(rVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                    rVar.f44919Y = this;
                    rVar.f44922i0 = 2;
                    this.f44937g.setValue(null);
                    if (yVar == enumC5000a) {
                        return enumC5000a;
                    }
                    c5472v = this;
                    O02 = Ad.l.O0(c5472v.f44932b, null, null, new C5469s(c5472v, null), 3);
                    c5472v.f44939i = O02;
                    rVar.f44919Y = O02;
                    rVar.f44922i0 = 3;
                    if (O02.F(rVar) != enumC5000a) {
                    }
                }
                return yVar;
            }
        }
        rVar = new r(this, abstractC4825e);
        Object obj2 = rVar.f44920Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = rVar.f44922i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        return yVar2;
    }

    public final Object b(String str, AbstractC4825e abstractC4825e) {
        Object b10 = this.f44931a.b(new Ra.l(this, 25, str), abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return jf.y.f36177a;
    }
}
