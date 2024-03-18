package W;

import A.AbstractC0044t0;
import E0.AbstractC0445d;
import E0.C0458q;
import Z.AbstractC1706d0;
import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;
import jf.C3959i;
import kf.AbstractC4268D;

/* renamed from: W.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542e0 implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f20029a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f20030b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f20031c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f20032d;

    public C1542e0(AbstractC1706d0 abstractC1706d0, AbstractC1706d0 abstractC1706d02, AbstractC1706d0 abstractC1706d03, AbstractC1706d0 abstractC1706d04) {
        this.f20029a = abstractC1706d0;
        this.f20030b = abstractC1706d02;
        this.f20031c = abstractC1706d03;
        this.f20032d = abstractC1706d04;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            E0.M m10 = (E0.M) list.get(i10);
            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m10), "badge")) {
                E0.d0 o10 = m10.o(Z0.a.a(j6, 0, 0, 0, 0, 11));
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    E0.M m11 = (E0.M) list.get(i11);
                    if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m11), "anchor")) {
                        E0.d0 o11 = m11.o(j6);
                        C0458q c0458q = AbstractC0445d.f4051a;
                        int G10 = o11.G(c0458q);
                        C0458q c0458q2 = AbstractC0445d.f4052b;
                        return p10.j0(o11.f4053Y, o11.f4054Z, AbstractC4268D.a1(new C3959i(c0458q, Integer.valueOf(G10)), new C3959i(c0458q2, Integer.valueOf(o11.G(c0458q2)))), new C1537d0(o10, p10, o11, this.f20029a, this.f20030b, this.f20031c, this.f20032d));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // E0.N
    public final /* synthetic */ int b(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
