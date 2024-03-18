package S8;

import Z.AbstractC1725n;
import Z.C1737t0;
import id.AbstractC3557B;

/* renamed from: S8.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369m extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1369m f16341Z = new C1369m(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1369m f16342h0 = new C1369m(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16343Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1369m(int i10) {
        super(4);
        this.f16343Y = i10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        jf.y yVar = jf.y.f36177a;
        int i12 = 16;
        int i13 = 2;
        switch (this.f16343Y) {
            case 0:
                N0.E e10 = (N0.E) obj;
                wf.n nVar = (wf.n) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                AbstractC3557B.c0("newTextStyle", e10);
                AbstractC3557B.c0("content", nVar);
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(e10)) {
                        i13 = 4;
                    }
                    i10 = i13 | intValue;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i12 = 32;
                    }
                    i10 |= i12;
                }
                if ((i10 & 731) == 146) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                A7.b.l(new C1737t0[]{L.f16245a.b(e10)}, R4.b.X(abstractC1725n, -1859815124, new C1368l(nVar, 0)), abstractC1725n, 56);
                return yVar;
            default:
                long j6 = ((r0.r) obj).f44265a;
                wf.n nVar2 = (wf.n) obj2;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue2 = ((Number) obj4).intValue();
                AbstractC3557B.c0("content", nVar2);
                if ((intValue2 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).f(j6)) {
                        i13 = 4;
                    }
                    i11 = i13 | intValue2;
                } else {
                    i11 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((Z.r) abstractC1725n2).i(nVar2)) {
                        i12 = 32;
                    }
                    i11 |= i12;
                }
                if ((i11 & 731) == 146) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                A7.b.l(new C1737t0[]{R.a.q(j6, L.f16246b)}, R4.b.X(abstractC1725n2, 863828729, new C1368l(nVar2, 1)), abstractC1725n2, 56);
                return yVar;
        }
    }
}
