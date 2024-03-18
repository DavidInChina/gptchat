package a0;

import Z.AbstractC1707e;
import Z.AbstractC1734s;
import Z.C1705d;
import Z.C1742w;
import Z.Q0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class s extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final s f23836c = new AbstractC1901G(1, 0, 2);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        boolean z10;
        boolean z11;
        C1705d c1705d;
        int c10;
        int i10;
        int a5 = c1902h.a(0);
        if (q02.f22555m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (a5 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (a5 != 0) {
                    int i11 = q02.f22560r;
                    int i12 = q02.f22562t;
                    int i13 = q02.f22561s;
                    int i14 = i11;
                    while (a5 > 0) {
                        i14 += M3.H.m(q02.f22544b, q02.o(i14));
                        if (i14 > i13) {
                            AbstractC1734s.j("Parameter offset is out of bounds".toString());
                            throw null;
                        }
                        a5--;
                    }
                    int m10 = M3.H.m(q02.f22544b, q02.o(i14));
                    int i15 = q02.f22550h;
                    int f6 = q02.f(q02.f22544b, q02.o(i14));
                    int i16 = i14 + m10;
                    int f10 = q02.f(q02.f22544b, q02.o(i16));
                    int i17 = f10 - f6;
                    q02.s(i17, Math.max(q02.f22560r - 1, 0));
                    q02.r(m10);
                    int[] iArr = q02.f22544b;
                    int o10 = q02.o(i16) * 5;
                    kf.q.V2(q02.o(i11) * 5, o10, (m10 * 5) + o10, iArr, iArr);
                    if (i17 > 0) {
                        Object[] objArr = q02.f22545c;
                        kf.q.W2(i15, q02.g(f6 + i17), q02.g(f10 + i17), objArr, objArr);
                    }
                    int i18 = f6 + i17;
                    int i19 = i18 - i15;
                    int i20 = q02.f22552j;
                    int i21 = q02.f22553k;
                    int length = q02.f22545c.length;
                    int i22 = q02.f22554l;
                    int i23 = i11 + m10;
                    int i24 = i11;
                    while (i24 < i23) {
                        int o11 = q02.o(i24);
                        int i25 = i23;
                        int f11 = q02.f(iArr, o11) - i19;
                        int i26 = i19;
                        if (i22 < o11) {
                            i10 = 0;
                        } else {
                            i10 = i20;
                        }
                        iArr[(o11 * 5) + 4] = Q0.h(Q0.h(f11, i10, i21, length), q02.f22552j, q02.f22553k, q02.f22545c.length);
                        i24++;
                        i19 = i26;
                        i23 = i25;
                        i20 = i20;
                        i21 = i21;
                    }
                    int i27 = i16 + m10;
                    int n10 = q02.n();
                    int r10 = M3.H.r(q02.f22546d, i16, n10);
                    ArrayList arrayList = new ArrayList();
                    if (r10 >= 0) {
                        while (r10 < q02.f22546d.size() && (c10 = q02.c((c1705d = (C1705d) q02.f22546d.get(r10)))) >= i16 && c10 < i27) {
                            arrayList.add(c1705d);
                            q02.f22546d.remove(r10);
                        }
                    }
                    int i28 = i11 - i16;
                    int size = arrayList.size();
                    for (int i29 = 0; i29 < size; i29++) {
                        C1705d c1705d2 = (C1705d) arrayList.get(i29);
                        int c11 = q02.c(c1705d2) + i28;
                        if (c11 >= q02.f22548f) {
                            c1705d2.f22611a = -(n10 - c11);
                        } else {
                            c1705d2.f22611a = c11;
                        }
                        q02.f22546d.add(M3.H.r(q02.f22546d, c11, n10), c1705d2);
                    }
                    if (!q02.B(i16, m10)) {
                        q02.l(i12, q02.f22561s, i11);
                        if (i17 > 0) {
                            q02.C(i18, i17, i16 - 1);
                            return;
                        }
                        return;
                    }
                    AbstractC1734s.j("Unexpectedly removed anchors".toString());
                    throw null;
                }
                return;
            }
            AbstractC1734s.j("Parameter offset is out of bounds".toString());
            throw null;
        }
        AbstractC1734s.j("Cannot move a group while inserting".toString());
        throw null;
    }

    @Override // a0.AbstractC1901G
    public final String b(int i10) {
        if (R4.b.r0(i10, 0)) {
            return "offset";
        }
        return super.b(i10);
    }
}
