package h3;

import g3.C3167j;

/* renamed from: h3.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3318g extends C3167j implements Comparable {

    /* renamed from: q0  reason: collision with root package name */
    public long f31859q0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3318g c3318g = (C3318g) obj;
        if (g(4) != c3318g.g(4)) {
            if (!g(4)) {
                return -1;
            }
        } else {
            long j6 = this.f48643l0 - c3318g.f48643l0;
            if (j6 == 0) {
                j6 = this.f31859q0 - c3318g.f31859q0;
                if (j6 == 0) {
                    return 0;
                }
            }
            if (j6 <= 0) {
                return -1;
            }
        }
        return 1;
    }
}
