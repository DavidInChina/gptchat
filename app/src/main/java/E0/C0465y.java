package E0;

import Cd.AbstractC0317b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0583l;
import Z.AbstractC1725n;
import Z.L0;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import y.AbstractC6463a;

/* renamed from: E0.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465y extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4094Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f4095Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0465y(AbstractC4326r abstractC4326r, int i10) {
        super(3);
        this.f4094Y = i10;
        this.f4095Z = abstractC4326r;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        jf.y yVar = jf.y.f36177a;
        switch (this.f4094Y) {
            case 0:
                AbstractC1725n abstractC1725n = ((L0) obj).f22507a;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                ((Number) obj3).intValue();
                int i11 = ((Z.r) abstractC1725n2).P;
                AbstractC4326r f02 = U3.f.f0(abstractC1725n2, this.f4095Z);
                Z.r rVar = (Z.r) abstractC1725n;
                rVar.W(509942095);
                AbstractC0584m.f5811i.getClass();
                U3.f.n0(rVar, f02, C0583l.f5806d);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i11))) {
                    AbstractC6463a.q(i11, rVar, i11, c0581j);
                }
                rVar.t(false);
                return yVar;
            default:
                int intValue = ((Number) obj).intValue();
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue2 & 14) == 0) {
                    if (((Z.r) abstractC1725n3).e(intValue)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n3;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                U3.f.a(Ng.H.v(intValue, abstractC1725n3), this.f4095Z, null, null, "VoiceModeHint", null, AbstractC0317b.f3041a, abstractC1725n3, 1597440, 44);
                return yVar;
        }
    }
}
