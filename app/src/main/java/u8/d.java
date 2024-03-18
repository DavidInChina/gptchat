package U8;

import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f17519Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f17520Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ a f17521h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Z0.b f17522i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j6, AbstractC1710f0 abstractC1710f0, a aVar, Z0.b bVar) {
        super(3);
        this.f17519Y = j6;
        this.f17520Z = abstractC1710f0;
        this.f17521h0 = aVar;
        this.f17522i0 = bVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        String str = (String) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("alternateText", str);
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(str)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 91) == 18) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(969483583);
        long j6 = this.f17519Y;
        boolean f6 = rVar2.f(j6);
        AbstractC1710f0 abstractC1710f0 = this.f17520Z;
        boolean g10 = f6 | rVar2.g(abstractC1710f0);
        Object K10 = rVar2.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = new c(j6, abstractC1710f0);
            rVar2.h0(K10);
        }
        N n10 = (N) K10;
        rVar2.t(false);
        rVar2.W(-1323940314);
        C4323o c4323o = C4323o.f37719b;
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, n10, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j);
            }
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            this.f17521h0.f17513c.h(this.f17522i0, str, rVar2, Integer.valueOf((intValue << 3) & 112));
            AbstractC6463a.u(rVar2, false, true, false);
            return y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
