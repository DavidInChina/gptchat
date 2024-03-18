package W;

import A.AbstractC0044t0;
import E.AbstractC0425i;
import E.AbstractC0427k;
import E0.AbstractC0445d;
import E0.C0458q;
import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class U implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f19707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0425i f19708b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0427k f19709c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f19710d;

    public U(float f6, AbstractC0425i abstractC0425i, AbstractC0427k abstractC0427k, int i10) {
        this.f19707a = f6;
        this.f19708b = abstractC0425i;
        this.f19709c = abstractC0427k;
        this.f19710d = i10;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        int h10;
        int i10;
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            E0.M m10 = (E0.M) list.get(i12);
            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m10), "navigationIcon")) {
                E0.d0 o10 = m10.o(Z0.a.a(j6, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    E0.M m11 = (E0.M) list.get(i13);
                    if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m11), "actionIcons")) {
                        E0.d0 o11 = m11.o(Z0.a.a(j6, 0, 0, 0, 0, 14));
                        if (Z0.a.h(j6) == Integer.MAX_VALUE) {
                            h10 = Z0.a.h(j6);
                        } else {
                            h10 = (Z0.a.h(j6) - o10.f4053Y) - o11.f4053Y;
                            if (h10 < 0) {
                                h10 = 0;
                            }
                        }
                        int i14 = h10;
                        int size3 = list.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            E0.M m12 = (E0.M) list.get(i15);
                            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m12), "title")) {
                                E0.d0 o12 = m12.o(Z0.a.a(j6, 0, i14, 0, 0, 12));
                                C0458q c0458q = AbstractC0445d.f4052b;
                                if (o12.G(c0458q) != Integer.MIN_VALUE) {
                                    i10 = o12.G(c0458q);
                                } else {
                                    i10 = 0;
                                }
                                float f6 = this.f19707a;
                                if (!Float.isNaN(f6)) {
                                    i11 = AbstractC4344b.Y0(f6);
                                }
                                return p10.j0(Z0.a.h(j6), i11, kf.w.f37484Y, new T(o10, i11, o12, this.f19708b, j6, o11, p10, this.f19709c, this.f19710d, i10));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
