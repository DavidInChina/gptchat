package T8;

import N0.E;
import S8.C1368l;
import W.Z0;
import W.j4;
import Z.AbstractC1725n;
import Z.C1737t0;
import Z.r;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import wf.n;
import wf.p;

/* loaded from: classes.dex */
public final class a extends o implements p {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f16954Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f16955h0 = new a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16956Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(4);
        this.f16956Y = i10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        y yVar = y.f36177a;
        int i12 = 16;
        int i13 = 2;
        switch (this.f16956Y) {
            case 0:
                E e10 = (E) obj;
                n nVar = (n) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                AbstractC3557B.c0("textStyle", e10);
                AbstractC3557B.c0("content", nVar);
                if ((intValue & 14) == 0) {
                    if (((r) abstractC1725n).g(e10)) {
                        i13 = 4;
                    }
                    i10 = intValue | i13;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((r) abstractC1725n).i(nVar)) {
                        i12 = 32;
                    }
                    i10 |= i12;
                }
                if ((i10 & 731) == 146) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                j4.a(e10, nVar, abstractC1725n, (i10 & 14) | (i10 & 112));
                return yVar;
            default:
                long j6 = ((r0.r) obj).f44265a;
                n nVar2 = (n) obj2;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue2 = ((Number) obj4).intValue();
                AbstractC3557B.c0("content", nVar2);
                if ((intValue2 & 14) == 0) {
                    if (((r) abstractC1725n2).f(j6)) {
                        i13 = 4;
                    }
                    i11 = intValue2 | i13;
                } else {
                    i11 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((r) abstractC1725n2).i(nVar2)) {
                        i12 = 32;
                    }
                    i11 |= i12;
                }
                if ((i11 & 731) == 146) {
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                A7.b.l(new C1737t0[]{R.a.q(j6, Z0.f19875a)}, R4.b.X(abstractC1725n2, -363713855, new C1368l(nVar2, 4)), abstractC1725n2, 56);
                return yVar;
        }
    }
}
