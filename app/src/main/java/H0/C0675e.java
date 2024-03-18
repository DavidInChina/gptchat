package H0;

import id.AbstractC3557B;
import l8.AbstractC4344b;

/* renamed from: H0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0675e extends AbstractC0669b {

    /* renamed from: e  reason: collision with root package name */
    public static C0675e f6934e;

    /* renamed from: c  reason: collision with root package name */
    public N0.C f6935c;

    /* renamed from: d  reason: collision with root package name */
    public L0.o f6936d;

    @Override // H0.AbstractC0679g
    public final int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            L0.o oVar = this.f6936d;
            if (oVar != null) {
                int Y02 = AbstractC4344b.Y0(oVar.e().c());
                if (i10 <= 0) {
                    i10 = 0;
                }
                N0.C c10 = this.f6935c;
                if (c10 != null) {
                    int g10 = c10.g(i10);
                    N0.C c11 = this.f6935c;
                    if (c11 != null) {
                        float l10 = c11.l(g10) + Y02;
                        N0.C c12 = this.f6935c;
                        if (c12 != null) {
                            if (l10 < c12.l(c12.f12478b.f12529f - 1)) {
                                N0.C c13 = this.f6935c;
                                if (c13 != null) {
                                    i11 = c13.h(l10);
                                } else {
                                    AbstractC3557B.C2("layoutResult");
                                    throw null;
                                }
                            } else {
                                N0.C c14 = this.f6935c;
                                if (c14 != null) {
                                    i11 = c14.f12478b.f12529f;
                                } else {
                                    AbstractC3557B.C2("layoutResult");
                                    throw null;
                                }
                            }
                            return c(i10, e(i11 - 1, Y0.h.f22027Y) + 1);
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
            AbstractC3557B.C2("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // H0.AbstractC0679g
    public final int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            L0.o oVar = this.f6936d;
            if (oVar != null) {
                int Y02 = AbstractC4344b.Y0(oVar.e().c());
                int length = d().length();
                if (length <= i10) {
                    i10 = length;
                }
                N0.C c10 = this.f6935c;
                if (c10 != null) {
                    int g10 = c10.g(i10);
                    N0.C c11 = this.f6935c;
                    if (c11 != null) {
                        float l10 = c11.l(g10) - Y02;
                        if (l10 > 0.0f) {
                            N0.C c12 = this.f6935c;
                            if (c12 != null) {
                                i11 = c12.h(l10);
                            } else {
                                AbstractC3557B.C2("layoutResult");
                                throw null;
                            }
                        } else {
                            i11 = 0;
                        }
                        if (i10 == d().length() && i11 < g10) {
                            i11++;
                        }
                        return c(e(i11, Y0.h.f22028Z), i10);
                    }
                    AbstractC3557B.C2("layoutResult");
                    throw null;
                }
                AbstractC3557B.C2("layoutResult");
                throw null;
            }
            AbstractC3557B.C2("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i10, Y0.h hVar) {
        N0.C c10 = this.f6935c;
        if (c10 != null) {
            int k10 = c10.k(i10);
            N0.C c11 = this.f6935c;
            if (c11 != null) {
                if (hVar != c11.n(k10)) {
                    N0.C c12 = this.f6935c;
                    if (c12 != null) {
                        return c12.k(i10);
                    }
                    AbstractC3557B.C2("layoutResult");
                    throw null;
                }
                N0.C c13 = this.f6935c;
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
