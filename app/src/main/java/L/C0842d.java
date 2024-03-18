package L;

import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: L.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0842d extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0842d f10109Z = new C0842d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0842d f10110h0 = new C0842d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0842d f10111i0 = new C0842d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0842d f10112j0 = new C0842d(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10113Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0842d(int i10) {
        super(3);
        this.f10113Y = i10;
    }

    public final void a(wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11 = 2;
        switch (this.f10113Y) {
            case 1:
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
            case 2:
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
            case 3:
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
            case 4:
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
            default:
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f10113Y) {
            case 0:
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
                rVar.W(-2126899193);
                long j6 = ((N.y0) rVar.m(N.z0.f12460a)).f12455a;
                C4323o c4323o = C4323o.f37719b;
                rVar.W(2068318685);
                boolean f6 = rVar.f(j6);
                Object K10 = rVar.K();
                if (f6 || K10 == C1723m.f22654Y) {
                    K10 = new C0840c(j6, 0);
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC4326r g10 = abstractC4326r.g(androidx.compose.ui.draw.a.e(c4323o, (wf.k) K10));
                rVar.t(false);
                return g10;
            case 1:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
