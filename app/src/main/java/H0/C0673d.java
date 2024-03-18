package H0;

import id.AbstractC3557B;

/* renamed from: H0.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0673d extends AbstractC0669b {

    /* renamed from: d  reason: collision with root package name */
    public static C0673d f6931d;

    /* renamed from: c  reason: collision with root package name */
    public N0.C f6932c;

    @Override // H0.AbstractC0679g
    public final int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        Y0.h hVar = Y0.h.f22028Z;
        if (i10 < 0) {
            N0.C c10 = this.f6932c;
            if (c10 != null) {
                i11 = c10.g(0);
            } else {
                AbstractC3557B.C2("layoutResult");
                throw null;
            }
        } else {
            N0.C c11 = this.f6932c;
            if (c11 != null) {
                int g10 = c11.g(i10);
                if (e(g10, hVar) == i10) {
                    i11 = g10;
                } else {
                    i11 = g10 + 1;
                }
            } else {
                AbstractC3557B.C2("layoutResult");
                throw null;
            }
        }
        N0.C c12 = this.f6932c;
        if (c12 != null) {
            if (i11 >= c12.f12478b.f12529f) {
                return null;
            }
            return c(e(i11, hVar), e(i11, Y0.h.f22027Y) + 1);
        }
        AbstractC3557B.C2("layoutResult");
        throw null;
    }

    @Override // H0.AbstractC0679g
    public final int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = d().length();
        Y0.h hVar = Y0.h.f22027Y;
        if (i10 > length) {
            N0.C c10 = this.f6932c;
            if (c10 != null) {
                i11 = c10.g(d().length());
            } else {
                AbstractC3557B.C2("layoutResult");
                throw null;
            }
        } else {
            N0.C c11 = this.f6932c;
            if (c11 != null) {
                int g10 = c11.g(i10);
                if (e(g10, hVar) + 1 == i10) {
                    i11 = g10;
                } else {
                    i11 = g10 - 1;
                }
            } else {
                AbstractC3557B.C2("layoutResult");
                throw null;
            }
        }
        if (i11 < 0) {
            return null;
        }
        return c(e(i11, Y0.h.f22028Z), e(i11, hVar) + 1);
    }

    public final int e(int i10, Y0.h hVar) {
        N0.C c10 = this.f6932c;
        if (c10 != null) {
            int k10 = c10.k(i10);
            N0.C c11 = this.f6932c;
            if (c11 != null) {
                if (hVar != c11.n(k10)) {
                    N0.C c12 = this.f6932c;
                    if (c12 != null) {
                        return c12.k(i10);
                    }
                    AbstractC3557B.C2("layoutResult");
                    throw null;
                }
                N0.C c13 = this.f6932c;
                if (c13 != null) {
                    return c13.f(i10, false) - 1;
                }
                AbstractC3557B.C2("layoutResult");
                throw null;
            }
            AbstractC3557B.C2("layoutResult");
            throw null;
        }
        AbstractC3557B.C2("layoutResult");
        throw null;
    }
}
