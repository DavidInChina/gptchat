package W;

import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: W.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1567j0 f20165a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final float f20166b = X.B.f21349c;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20167c = 640;

    /* JADX WARN: Type inference failed for: r0v0, types: [W.j0, java.lang.Object] */
    static {
        float f6 = X.B.f21347a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC4326r abstractC4326r, float f6, float f10, r0.L l10, long j6, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        float f11;
        int i13;
        float f12;
        K.a aVar;
        long j10;
        long j11;
        r0.L l11;
        float f13;
        float f14;
        int i14;
        long j12;
        r0.L l12;
        float f15;
        AbstractC4326r abstractC4326r3;
        boolean g10;
        Object K10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1364277227);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            f11 = f6;
            if (rVar.d(f11)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                f12 = f10;
                if (rVar.d(f12)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i12 |= i17;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        aVar = l10;
                        if (rVar.g(aVar)) {
                            i16 = 2048;
                            i12 |= i16;
                        }
                    } else {
                        aVar = l10;
                    }
                    i16 = 1024;
                    i12 |= i16;
                } else {
                    aVar = l10;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j10 = j6;
                        if (rVar.f(j10)) {
                            i15 = 16384;
                            i12 |= i15;
                        }
                    } else {
                        j10 = j6;
                    }
                    i15 = 8192;
                    i12 |= i15;
                } else {
                    j10 = j6;
                }
                if ((i12 & 9363) != 9362 && rVar.B()) {
                    rVar.P();
                    f14 = f11;
                    f13 = f12;
                    l11 = aVar;
                    j11 = j10;
                } else {
                    rVar.R();
                    if ((i10 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        abstractC4326r3 = abstractC4326r2;
                        i14 = i12;
                        f15 = f11;
                    } else {
                        if (i20 != 0) {
                            abstractC4326r3 = C4323o.f37719b;
                        } else {
                            abstractC4326r3 = abstractC4326r2;
                        }
                        if (i21 != 0) {
                            f15 = X.B.f21348b;
                        } else {
                            f15 = f11;
                        }
                        if (i13 != 0) {
                            f12 = X.B.f21347a;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            aVar = ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19908e;
                        }
                        if ((i11 & 16) != 0) {
                            float f16 = X.B.f21347a;
                            j12 = r0.r.b(R0.e(19, rVar), 0.4f);
                            i14 = i12 & (-57345);
                            l12 = aVar;
                            rVar.u();
                            String w10 = kotlin.jvm.internal.m.w(R.string.m3c_bottom_sheet_drag_handle_description, rVar);
                            AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(abstractC4326r3, 0.0f, AbstractC1545e3.f20036a, 1);
                            rVar.W(-363350248);
                            g10 = rVar.g(w10);
                            K10 = rVar.K();
                            if (!g10 || K10 == C1723m.f22654Y) {
                                K10 = new G(w10, 1);
                                rVar.h0(K10);
                            }
                            rVar.t(false);
                            int i22 = i14 >> 6;
                            G3.a(L0.l.a(t10, false, (wf.k) K10), l12, j12, 0L, 0.0f, 0.0f, null, R4.b.X(rVar, -1039573072, new C1557h0(f15, f12)), rVar, (i22 & 112) | 12582912 | (i22 & 896), 120);
                            float f17 = f15;
                            abstractC4326r2 = abstractC4326r3;
                            r0.L l13 = l12;
                            f14 = f17;
                            long j13 = j12;
                            l11 = l13;
                            f13 = f12;
                            j11 = j13;
                        } else {
                            i14 = i12;
                        }
                    }
                    l12 = aVar;
                    j12 = j10;
                    rVar.u();
                    String w102 = kotlin.jvm.internal.m.w(R.string.m3c_bottom_sheet_drag_handle_description, rVar);
                    AbstractC4326r t102 = androidx.compose.foundation.layout.a.t(abstractC4326r3, 0.0f, AbstractC1545e3.f20036a, 1);
                    rVar.W(-363350248);
                    g10 = rVar.g(w102);
                    K10 = rVar.K();
                    if (!g10) {
                    }
                    K10 = new G(w102, 1);
                    rVar.h0(K10);
                    rVar.t(false);
                    int i222 = i14 >> 6;
                    G3.a(L0.l.a(t102, false, (wf.k) K10), l12, j12, 0L, 0.0f, 0.0f, null, R4.b.X(rVar, -1039573072, new C1557h0(f15, f12)), rVar, (i222 & 112) | 12582912 | (i222 & 896), 120);
                    float f172 = f15;
                    abstractC4326r2 = abstractC4326r3;
                    r0.L l132 = l12;
                    f14 = f172;
                    long j132 = j12;
                    l11 = l132;
                    f13 = f12;
                    j11 = j132;
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C1562i0(this, abstractC4326r2, f14, f13, l11, j11, i10, i11);
                    return;
                }
                return;
            }
            f12 = f10;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            if ((i12 & 9363) != 9362) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 8) != 0) {
            }
            if ((i11 & 16) != 0) {
            }
        }
        f11 = f6;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        f12 = f10;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        if ((i11 & 16) != 0) {
        }
    }
}
