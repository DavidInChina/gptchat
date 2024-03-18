package A;

import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.C0714y;
import L.AbstractC0848g;
import N0.C1046e;
import S8.AbstractC1362f;
import S8.C1359c;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1737t0;
import aa.C1939b;
import android.content.Context;
import fb.C2995n;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: A.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0053y extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f325Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f326Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f327h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f328i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053y(int i10, E.g0 g0Var, wf.o oVar) {
        super(2);
        this.f325Y = 11;
        this.f326Z = i10;
        this.f327h0 = g0Var;
        this.f328i0 = oVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f325Y;
        int i12 = this.f326Z;
        Object obj = this.f328i0;
        Object obj2 = this.f327h0;
        switch (i11) {
            case 0:
                androidx.compose.foundation.a.a((AbstractC4326r) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                ((G.F) obj2).e(i12, obj, abstractC1725n, 64);
                return;
            case 2:
                AbstractC0848g.a((C1046e) obj2, (List) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 3:
                j4.a((N0.E) obj2, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 4:
                C1737t0[] c1737t0Arr = (C1737t0[]) obj2;
                A7.b.l((C1737t0[]) Arrays.copyOf(c1737t0Arr, c1737t0Arr.length), (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 5:
                A7.b.k((C1737t0) obj2, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 6:
                ((C3288a) obj2).a(obj, abstractC1725n, AbstractC1734s.p(i12) | 1);
                return;
            case 7:
                H0.Z.a((C0714y) obj2, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 8:
                K4.J.e((List) obj2, (Collection) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 9:
                ((C1359c) obj2).a((S8.M) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 10:
                AbstractC1362f.a((S8.M) obj2, (wf.o) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 11:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(C4323o.f37719b, (E.g0) obj2);
                    wf.o oVar = (wf.o) obj;
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    rVar3.W(733328855);
                    E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
                    rVar3.W(-1323940314);
                    int i14 = rVar3.P;
                    AbstractC1732q0 p10 = rVar3.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i15 = androidx.compose.ui.layout.a.i(q10);
                    if (rVar3.f22696a instanceof AbstractC1707e) {
                        rVar3.Z();
                        if (rVar3.f22695O) {
                            rVar3.o(c0582k);
                        } else {
                            rVar3.k0();
                        }
                        U3.f.n0(rVar3, c10, C0583l.f5808f);
                        U3.f.n0(rVar3, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i14))) {
                            AbstractC6463a.q(i14, rVar3, i14, c0581j);
                        }
                        AbstractC6463a.r(0, i15, new Z.L0(rVar3), rVar3, 2058660585);
                        oVar.invoke(Integer.valueOf(i13), rVar3, 0);
                        rVar3.t(false);
                        rVar3.t(true);
                        rVar3.t(false);
                        rVar3.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                return;
            case 12:
                K8.d.v((AbstractC6216a) obj2, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 13:
                r9.y.c((Aa.e) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 14:
                r9.y.m((Aa.f) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 15:
                K8.d.d((C2995n) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 16:
                gb.D.l((fa.n) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 17:
                K8.d.h((List) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 18:
                K8.d.i((C1939b) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 19:
                ((Hc.c) obj2).f((Context) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                Object[] objArr = (Object[]) obj2;
                AbstractC3256b.a(Arrays.copyOf(objArr, objArr.length), (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f325Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 10:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 11:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 12:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 13:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 14:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 15:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 16:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 17:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 18:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 19:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053y(int i10, G.F f6, Object obj) {
        super(2);
        this.f325Y = 1;
        this.f327h0 = f6;
        this.f326Z = i10;
        this.f328i0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0053y(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f325Y = i11;
        this.f327h0 = obj;
        this.f328i0 = obj2;
        this.f326Z = i10;
    }
}
