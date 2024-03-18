package S8;

import L.C0871s;
import L.C0873t;
import N0.C1046e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import id.AbstractC3557B;
import java.util.Map;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.O f16245a = A7.b.o0(r.f16363i0);

    /* renamed from: b  reason: collision with root package name */
    public static final Z.O f16246b = A7.b.o0(r.f16362h0);

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(M m10, C1046e c1046e, AbstractC4326r abstractC4326r, boolean z10, int i10, int i11, wf.k kVar, Map map, wf.k kVar2, wf.k kVar3, AbstractC1725n abstractC1725n, int i12, int i13) {
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Z.r rVar;
        Map map2;
        wf.k kVar4;
        int i21;
        int i22;
        boolean z12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        C4323o c4323o;
        boolean z13;
        int i23;
        int i24;
        F f6;
        kf.w wVar;
        Object K10;
        io.sentry.hints.i iVar;
        boolean g10;
        Object K11;
        boolean i25;
        Object K12;
        boolean g11;
        Object K13;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        AbstractC3557B.c0("$this$ClickableText", m10);
        AbstractC3557B.c0(ParameterNames.TEXT, c1046e);
        AbstractC3557B.c0("isOffsetClickable", kVar2);
        AbstractC3557B.c0("onClick", kVar3);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(367449332);
        if ((Integer.MIN_VALUE & i13) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (rVar2.g(m10)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i14 = i34 | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 1) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (rVar2.g(c1046e)) {
                i33 = 32;
            } else {
                i33 = 16;
            }
            i14 |= i33;
        }
        int i35 = i13 & 2;
        if (i35 != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (rVar2.g(abstractC4326r)) {
                i32 = 256;
            } else {
                i32 = 128;
            }
            i14 |= i32;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                z11 = z10;
                if (rVar2.h(z11)) {
                    i31 = 2048;
                } else {
                    i31 = 1024;
                }
                i14 |= i31;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 24576;
                    i17 = i10;
                } else {
                    i17 = i10;
                    if ((i12 & 57344) == 0) {
                        if (rVar2.e(i17)) {
                            i30 = 16384;
                        } else {
                            i30 = 8192;
                        }
                        i14 |= i30;
                    }
                }
                i18 = i13 & 16;
                if (i18 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (rVar2.e(i11)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i14 |= i29;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (rVar2.i(kVar)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i14 |= i28;
                }
                i20 = i13 & 64;
                if (i20 != 0) {
                    i14 |= 4194304;
                }
                if ((i13 & 128) != 0) {
                    i27 = 100663296;
                } else {
                    if ((234881024 & i12) == 0) {
                        if (rVar2.i(kVar2)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                    }
                    if ((i13 & 256) == 0) {
                        i26 = 805306368;
                    } else {
                        if ((1879048192 & i12) == 0) {
                            if (rVar2.i(kVar3)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i20 != 64 && (1533916891 & i14) == 306783378 && rVar2.B()) {
                            rVar2.P();
                            abstractC4326r2 = abstractC4326r;
                            kVar4 = kVar;
                            z12 = z11;
                            i22 = i17;
                            rVar = rVar2;
                            i21 = i11;
                            map2 = map;
                        } else {
                            if (i35 != 0) {
                                c4323o = C4323o.f37719b;
                            } else {
                                c4323o = abstractC4326r;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            if (i16 != 0) {
                                i23 = 1;
                            } else {
                                i23 = i17;
                            }
                            if (i18 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i11;
                            }
                            if (i19 != 0) {
                                f6 = F.f16215Y;
                            } else {
                                f6 = kVar;
                            }
                            if (i20 != 0) {
                                wVar = kf.w.f37484Y;
                            } else {
                                wVar = map;
                            }
                            rVar2.W(-492369756);
                            K10 = rVar2.K();
                            iVar = C1723m.f22654Y;
                            if (K10 == iVar) {
                                K10 = AbstractC4828h.Z(null, o1.f22665a);
                                rVar2.h0(K10);
                            }
                            rVar2.t(false);
                            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                            rVar2.W(-760903724);
                            g10 = rVar2.g(abstractC1710f0) | rVar2.i(kVar2);
                            K11 = rVar2.K();
                            if (!g10 || K11 == iVar) {
                                K11 = new C0871s(abstractC1710f0, kVar2, 4);
                                rVar2.h0(K11);
                            }
                            wf.k kVar5 = (wf.k) K11;
                            rVar2.t(false);
                            rVar2.W(-760903559);
                            i25 = rVar2.i(kVar5) | rVar2.g(abstractC1710f0) | rVar2.i(kVar3);
                            K12 = rVar2.K();
                            if (!i25 || K12 == iVar) {
                                K12 = new H(kVar5, abstractC1710f0, kVar3, null);
                                rVar2.h0(K12);
                            }
                            rVar2.t(false);
                            AbstractC4326r g12 = c4323o.g(new SuspendPointerInputElement(kVar3, null, (wf.n) K12, 6));
                            rVar2.W(-760903210);
                            g11 = rVar2.g(abstractC1710f0) | rVar2.i(f6);
                            K13 = rVar2.K();
                            if (!g11 || K13 == iVar) {
                                K13 = new C0871s(abstractC1710f0, f6, 2);
                                rVar2.h0(K13);
                            }
                            rVar2.t(false);
                            wf.k kVar6 = f6;
                            rVar = rVar2;
                            b(m10, c1046e, g12, (wf.k) K13, i23, z13, i24, wVar, rVar2, 16777216 | (i14 & 14) | (i14 & 112) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 0);
                            i21 = i24;
                            map2 = wVar;
                            abstractC4326r2 = c4323o;
                            kVar4 = kVar6;
                            z12 = z13;
                            i22 = i23;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new G(m10, c1046e, abstractC4326r2, z12, i22, i21, kVar4, map2, kVar2, kVar3, i12, i13);
                            return;
                        }
                        return;
                    }
                    i14 |= i26;
                    if (i20 != 64) {
                    }
                    if (i35 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    rVar2.W(-492369756);
                    K10 = rVar2.K();
                    iVar = C1723m.f22654Y;
                    if (K10 == iVar) {
                    }
                    rVar2.t(false);
                    AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K10;
                    rVar2.W(-760903724);
                    g10 = rVar2.g(abstractC1710f02) | rVar2.i(kVar2);
                    K11 = rVar2.K();
                    if (!g10) {
                    }
                    K11 = new C0871s(abstractC1710f02, kVar2, 4);
                    rVar2.h0(K11);
                    wf.k kVar52 = (wf.k) K11;
                    rVar2.t(false);
                    rVar2.W(-760903559);
                    i25 = rVar2.i(kVar52) | rVar2.g(abstractC1710f02) | rVar2.i(kVar3);
                    K12 = rVar2.K();
                    if (!i25) {
                    }
                    K12 = new H(kVar52, abstractC1710f02, kVar3, null);
                    rVar2.h0(K12);
                    rVar2.t(false);
                    AbstractC4326r g122 = c4323o.g(new SuspendPointerInputElement(kVar3, null, (wf.n) K12, 6));
                    rVar2.W(-760903210);
                    g11 = rVar2.g(abstractC1710f02) | rVar2.i(f6);
                    K13 = rVar2.K();
                    if (!g11) {
                    }
                    K13 = new C0871s(abstractC1710f02, f6, 2);
                    rVar2.h0(K13);
                    rVar2.t(false);
                    wf.k kVar62 = f6;
                    rVar = rVar2;
                    b(m10, c1046e, g122, (wf.k) K13, i23, z13, i24, wVar, rVar2, 16777216 | (i14 & 14) | (i14 & 112) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 0);
                    i21 = i24;
                    map2 = wVar;
                    abstractC4326r2 = c4323o;
                    kVar4 = kVar62;
                    z12 = z13;
                    i22 = i23;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                i14 |= i27;
                if ((i13 & 256) == 0) {
                }
                i14 |= i26;
                if (i20 != 64) {
                }
                if (i35 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                rVar2.W(-492369756);
                K10 = rVar2.K();
                iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                }
                rVar2.t(false);
                AbstractC1710f0 abstractC1710f022 = (AbstractC1710f0) K10;
                rVar2.W(-760903724);
                g10 = rVar2.g(abstractC1710f022) | rVar2.i(kVar2);
                K11 = rVar2.K();
                if (!g10) {
                }
                K11 = new C0871s(abstractC1710f022, kVar2, 4);
                rVar2.h0(K11);
                wf.k kVar522 = (wf.k) K11;
                rVar2.t(false);
                rVar2.W(-760903559);
                i25 = rVar2.i(kVar522) | rVar2.g(abstractC1710f022) | rVar2.i(kVar3);
                K12 = rVar2.K();
                if (!i25) {
                }
                K12 = new H(kVar522, abstractC1710f022, kVar3, null);
                rVar2.h0(K12);
                rVar2.t(false);
                AbstractC4326r g1222 = c4323o.g(new SuspendPointerInputElement(kVar3, null, (wf.n) K12, 6));
                rVar2.W(-760903210);
                g11 = rVar2.g(abstractC1710f022) | rVar2.i(f6);
                K13 = rVar2.K();
                if (!g11) {
                }
                K13 = new C0871s(abstractC1710f022, f6, 2);
                rVar2.h0(K13);
                rVar2.t(false);
                wf.k kVar622 = f6;
                rVar = rVar2;
                b(m10, c1046e, g1222, (wf.k) K13, i23, z13, i24, wVar, rVar2, 16777216 | (i14 & 14) | (i14 & 112) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 0);
                i21 = i24;
                map2 = wVar;
                abstractC4326r2 = c4323o;
                kVar4 = kVar622;
                z12 = z13;
                i22 = i23;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            z11 = z10;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            i18 = i13 & 16;
            if (i18 != 0) {
            }
            i19 = i13 & 32;
            if (i19 != 0) {
            }
            i20 = i13 & 64;
            if (i20 != 0) {
            }
            if ((i13 & 128) != 0) {
            }
            i14 |= i27;
            if ((i13 & 256) == 0) {
            }
            i14 |= i26;
            if (i20 != 64) {
            }
            if (i35 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            rVar2.W(-492369756);
            K10 = rVar2.K();
            iVar = C1723m.f22654Y;
            if (K10 == iVar) {
            }
            rVar2.t(false);
            AbstractC1710f0 abstractC1710f0222 = (AbstractC1710f0) K10;
            rVar2.W(-760903724);
            g10 = rVar2.g(abstractC1710f0222) | rVar2.i(kVar2);
            K11 = rVar2.K();
            if (!g10) {
            }
            K11 = new C0871s(abstractC1710f0222, kVar2, 4);
            rVar2.h0(K11);
            wf.k kVar5222 = (wf.k) K11;
            rVar2.t(false);
            rVar2.W(-760903559);
            i25 = rVar2.i(kVar5222) | rVar2.g(abstractC1710f0222) | rVar2.i(kVar3);
            K12 = rVar2.K();
            if (!i25) {
            }
            K12 = new H(kVar5222, abstractC1710f0222, kVar3, null);
            rVar2.h0(K12);
            rVar2.t(false);
            AbstractC4326r g12222 = c4323o.g(new SuspendPointerInputElement(kVar3, null, (wf.n) K12, 6));
            rVar2.W(-760903210);
            g11 = rVar2.g(abstractC1710f0222) | rVar2.i(f6);
            K13 = rVar2.K();
            if (!g11) {
            }
            K13 = new C0871s(abstractC1710f0222, f6, 2);
            rVar2.h0(K13);
            rVar2.t(false);
            wf.k kVar6222 = f6;
            rVar = rVar2;
            b(m10, c1046e, g12222, (wf.k) K13, i23, z13, i24, wVar, rVar2, 16777216 | (i14 & 14) | (i14 & 112) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 0);
            i21 = i24;
            map2 = wVar;
            abstractC4326r2 = c4323o;
            kVar4 = kVar6222;
            z12 = z13;
            i22 = i23;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        z11 = z10;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        i18 = i13 & 16;
        if (i18 != 0) {
        }
        i19 = i13 & 32;
        if (i19 != 0) {
        }
        i20 = i13 & 64;
        if (i20 != 0) {
        }
        if ((i13 & 128) != 0) {
        }
        i14 |= i27;
        if ((i13 & 256) == 0) {
        }
        i14 |= i26;
        if (i20 != 64) {
        }
        if (i35 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        rVar2.W(-492369756);
        K10 = rVar2.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        rVar2.t(false);
        AbstractC1710f0 abstractC1710f02222 = (AbstractC1710f0) K10;
        rVar2.W(-760903724);
        g10 = rVar2.g(abstractC1710f02222) | rVar2.i(kVar2);
        K11 = rVar2.K();
        if (!g10) {
        }
        K11 = new C0871s(abstractC1710f02222, kVar2, 4);
        rVar2.h0(K11);
        wf.k kVar52222 = (wf.k) K11;
        rVar2.t(false);
        rVar2.W(-760903559);
        i25 = rVar2.i(kVar52222) | rVar2.g(abstractC1710f02222) | rVar2.i(kVar3);
        K12 = rVar2.K();
        if (!i25) {
        }
        K12 = new H(kVar52222, abstractC1710f02222, kVar3, null);
        rVar2.h0(K12);
        rVar2.t(false);
        AbstractC4326r g122222 = c4323o.g(new SuspendPointerInputElement(kVar3, null, (wf.n) K12, 6));
        rVar2.W(-760903210);
        g11 = rVar2.g(abstractC1710f02222) | rVar2.i(f6);
        K13 = rVar2.K();
        if (!g11) {
        }
        K13 = new C0871s(abstractC1710f02222, f6, 2);
        rVar2.h0(K13);
        rVar2.t(false);
        wf.k kVar62222 = f6;
        rVar = rVar2;
        b(m10, c1046e, g122222, (wf.k) K13, i23, z13, i24, wVar, rVar2, 16777216 | (i14 & 14) | (i14 & 112) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 0);
        i21 = i24;
        map2 = wVar;
        abstractC4326r2 = c4323o;
        kVar4 = kVar62222;
        z12 = z13;
        i22 = i23;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(M m10, C1046e c1046e, AbstractC4326r abstractC4326r, wf.k kVar, int i10, boolean z10, int i11, Map map, AbstractC1725n abstractC1725n, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        Map map2;
        int i22;
        boolean z12;
        int i23;
        wf.k kVar2;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        C4323o c4323o;
        K k10;
        int i24;
        boolean z13;
        int i25;
        kf.w wVar;
        long c10;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        AbstractC3557B.c0("$this$Text", m10);
        AbstractC3557B.c0(ParameterNames.TEXT, c1046e);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(559740240);
        if ((i13 & Integer.MIN_VALUE) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (rVar.g(m10)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i14 = i32 | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 1) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (rVar.g(c1046e)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i14 |= i31;
        }
        int i33 = i13 & 2;
        if (i33 != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (rVar.g(abstractC4326r)) {
                i30 = 256;
            } else {
                i30 = 128;
            }
            i14 |= i30;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (rVar.i(kVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i14 |= i29;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i17 = i10;
                    if (rVar.e(i17)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i14 |= i28;
                    i18 = i13 & 16;
                    if (i18 == 0) {
                        i14 |= 196608;
                    } else if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (rVar.h(z11)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i14 |= i27;
                        i19 = i13 & 32;
                        if (i19 != 0) {
                            i14 |= 1572864;
                            i20 = i11;
                        } else {
                            i20 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (rVar.e(i20)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        i21 = i13 & 64;
                        if (i21 != 0) {
                            i14 |= 4194304;
                        }
                        if (i21 != 64 && (23967451 & i14) == 4793490 && rVar.B()) {
                            rVar.P();
                            abstractC4326r2 = abstractC4326r;
                            kVar2 = kVar;
                            map2 = map;
                            i23 = i17;
                            i22 = i20;
                            z12 = z11;
                        } else {
                            if (i33 != 0) {
                                c4323o = C4323o.f37719b;
                            } else {
                                c4323o = abstractC4326r;
                            }
                            if (i15 != 0) {
                                k10 = K.f16244Y;
                            } else {
                                k10 = kVar;
                            }
                            if (i16 != 0) {
                                i24 = 1;
                            } else {
                                i24 = i17;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            if (i19 != 0) {
                                i25 = Integer.MAX_VALUE;
                            } else {
                                i25 = i20;
                            }
                            if (i21 != 0) {
                                wVar = kf.w.f37484Y;
                            } else {
                                wVar = map;
                            }
                            rVar.W(1561620891);
                            c10 = e(m10, rVar).c();
                            if (c10 == r0.r.f44263k) {
                                c10 = d(m10, rVar);
                            }
                            rVar.t(false);
                            N0.E b10 = N0.E.b(e(m10, rVar), c10);
                            int i34 = i14 >> 3;
                            A7.b.d(c1046e, c4323o, b10, k10, i24, z13, i25, 0, wVar, rVar, (i34 & 112) | (i34 & 14) | 134217728 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 640);
                            abstractC4326r2 = c4323o;
                            kVar2 = k10;
                            i23 = i24;
                            z12 = z13;
                            i22 = i25;
                            map2 = wVar;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new C0873t(m10, c1046e, abstractC4326r2, kVar2, i23, z12, i22, map2, i12, i13);
                            return;
                        }
                        return;
                    }
                    z11 = z10;
                    i19 = i13 & 32;
                    if (i19 != 0) {
                    }
                    i21 = i13 & 64;
                    if (i21 != 0) {
                    }
                    if (i21 != 64) {
                    }
                    if (i33 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    rVar.W(1561620891);
                    c10 = e(m10, rVar).c();
                    if (c10 == r0.r.f44263k) {
                    }
                    rVar.t(false);
                    N0.E b102 = N0.E.b(e(m10, rVar), c10);
                    int i342 = i14 >> 3;
                    A7.b.d(c1046e, c4323o, b102, k10, i24, z13, i25, 0, wVar, rVar, (i342 & 112) | (i342 & 14) | 134217728 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 640);
                    abstractC4326r2 = c4323o;
                    kVar2 = k10;
                    i23 = i24;
                    z12 = z13;
                    i22 = i25;
                    map2 = wVar;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                i17 = i10;
                i18 = i13 & 16;
                if (i18 == 0) {
                }
                z11 = z10;
                i19 = i13 & 32;
                if (i19 != 0) {
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                }
                if (i21 != 64) {
                }
                if (i33 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                rVar.W(1561620891);
                c10 = e(m10, rVar).c();
                if (c10 == r0.r.f44263k) {
                }
                rVar.t(false);
                N0.E b1022 = N0.E.b(e(m10, rVar), c10);
                int i3422 = i14 >> 3;
                A7.b.d(c1046e, c4323o, b1022, k10, i24, z13, i25, 0, wVar, rVar, (i3422 & 112) | (i3422 & 14) | 134217728 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 640);
                abstractC4326r2 = c4323o;
                kVar2 = k10;
                i23 = i24;
                z12 = z13;
                i22 = i25;
                map2 = wVar;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            i17 = i10;
            i18 = i13 & 16;
            if (i18 == 0) {
            }
            z11 = z10;
            i19 = i13 & 32;
            if (i19 != 0) {
            }
            i21 = i13 & 64;
            if (i21 != 0) {
            }
            if (i21 != 64) {
            }
            if (i33 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            rVar.W(1561620891);
            c10 = e(m10, rVar).c();
            if (c10 == r0.r.f44263k) {
            }
            rVar.t(false);
            N0.E b10222 = N0.E.b(e(m10, rVar), c10);
            int i34222 = i14 >> 3;
            A7.b.d(c1046e, c4323o, b10222, k10, i24, z13, i25, 0, wVar, rVar, (i34222 & 112) | (i34222 & 14) | 134217728 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 640);
            abstractC4326r2 = c4323o;
            kVar2 = k10;
            i23 = i24;
            z12 = z13;
            i22 = i25;
            map2 = wVar;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        i17 = i10;
        i18 = i13 & 16;
        if (i18 == 0) {
        }
        z11 = z10;
        i19 = i13 & 32;
        if (i19 != 0) {
        }
        i21 = i13 & 64;
        if (i21 != 0) {
        }
        if (i21 != 64) {
        }
        if (i33 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        rVar.W(1561620891);
        c10 = e(m10, rVar).c();
        if (c10 == r0.r.f44263k) {
        }
        rVar.t(false);
        N0.E b102222 = N0.E.b(e(m10, rVar), c10);
        int i342222 = i14 >> 3;
        A7.b.d(c1046e, c4323o, b102222, k10, i24, z13, i25, 0, wVar, rVar, (i342222 & 112) | (i342222 & 14) | 134217728 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 640);
        abstractC4326r2 = c4323o;
        kVar2 = k10;
        i23 = i24;
        z12 = z13;
        i22 = i25;
        map2 = wVar;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(M m10, String str, AbstractC4326r abstractC4326r, wf.k kVar, int i10, boolean z10, int i11, AbstractC1725n abstractC1725n, int i12, int i13) {
        int i14;
        int i15;
        wf.k kVar2;
        int i16;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        boolean z12;
        int i22;
        wf.k kVar3;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        C4323o c4323o;
        I i23;
        int i24;
        boolean z13;
        int i25;
        long c10;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        AbstractC3557B.c0("$this$Text", m10);
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1456639868);
        if ((i13 & Integer.MIN_VALUE) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (rVar.g(m10)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i14 = i32 | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 1) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (rVar.g(str)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i14 |= i31;
        }
        int i33 = i13 & 2;
        if (i33 != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (rVar.g(abstractC4326r)) {
                i30 = 256;
            } else {
                i30 = 128;
            }
            i14 |= i30;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                kVar2 = kVar;
                if (rVar.i(kVar2)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i14 |= i29;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    i17 = i10;
                    if (rVar.e(i17)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i14 |= i28;
                    i18 = i13 & 16;
                    if (i18 == 0) {
                        i14 |= 196608;
                    } else if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (rVar.h(z11)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i14 |= i27;
                        i19 = i13 & 32;
                        if (i19 != 0) {
                            i14 |= 1572864;
                            i20 = i11;
                        } else {
                            i20 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (rVar.e(i20)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        if ((i14 & 2995931) != 599186 && rVar.B()) {
                            rVar.P();
                            abstractC4326r2 = abstractC4326r;
                            kVar3 = kVar2;
                            i22 = i17;
                            i21 = i20;
                            z12 = z11;
                        } else {
                            if (i33 != 0) {
                                c4323o = C4323o.f37719b;
                            } else {
                                c4323o = abstractC4326r;
                            }
                            if (i15 != 0) {
                                i23 = I.f16233Y;
                            } else {
                                i23 = kVar2;
                            }
                            if (i16 != 0) {
                                i24 = 1;
                            } else {
                                i24 = i17;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            if (i19 != 0) {
                                i25 = Integer.MAX_VALUE;
                            } else {
                                i25 = i20;
                            }
                            rVar.W(1561620249);
                            c10 = e(m10, rVar).c();
                            if (c10 == r0.r.f44263k) {
                                c10 = d(m10, rVar);
                            }
                            rVar.t(false);
                            N0.E b10 = N0.E.b(e(m10, rVar), c10);
                            int i34 = i14 >> 3;
                            A7.b.e(str, c4323o, b10, i23, i24, z13, i25, 0, rVar, (i34 & 112) | (i34 & 14) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 384);
                            i21 = i25;
                            abstractC4326r2 = c4323o;
                            kVar3 = i23;
                            i22 = i24;
                            z12 = z13;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new J(m10, str, abstractC4326r2, kVar3, i22, z12, i21, i12, i13);
                            return;
                        }
                        return;
                    }
                    z11 = z10;
                    i19 = i13 & 32;
                    if (i19 != 0) {
                    }
                    if ((i14 & 2995931) != 599186) {
                    }
                    if (i33 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    rVar.W(1561620249);
                    c10 = e(m10, rVar).c();
                    if (c10 == r0.r.f44263k) {
                    }
                    rVar.t(false);
                    N0.E b102 = N0.E.b(e(m10, rVar), c10);
                    int i342 = i14 >> 3;
                    A7.b.e(str, c4323o, b102, i23, i24, z13, i25, 0, rVar, (i342 & 112) | (i342 & 14) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 384);
                    i21 = i25;
                    abstractC4326r2 = c4323o;
                    kVar3 = i23;
                    i22 = i24;
                    z12 = z13;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                i17 = i10;
                i18 = i13 & 16;
                if (i18 == 0) {
                }
                z11 = z10;
                i19 = i13 & 32;
                if (i19 != 0) {
                }
                if ((i14 & 2995931) != 599186) {
                }
                if (i33 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                rVar.W(1561620249);
                c10 = e(m10, rVar).c();
                if (c10 == r0.r.f44263k) {
                }
                rVar.t(false);
                N0.E b1022 = N0.E.b(e(m10, rVar), c10);
                int i3422 = i14 >> 3;
                A7.b.e(str, c4323o, b1022, i23, i24, z13, i25, 0, rVar, (i3422 & 112) | (i3422 & 14) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 384);
                i21 = i25;
                abstractC4326r2 = c4323o;
                kVar3 = i23;
                i22 = i24;
                z12 = z13;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            kVar2 = kVar;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            i17 = i10;
            i18 = i13 & 16;
            if (i18 == 0) {
            }
            z11 = z10;
            i19 = i13 & 32;
            if (i19 != 0) {
            }
            if ((i14 & 2995931) != 599186) {
            }
            if (i33 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            rVar.W(1561620249);
            c10 = e(m10, rVar).c();
            if (c10 == r0.r.f44263k) {
            }
            rVar.t(false);
            N0.E b10222 = N0.E.b(e(m10, rVar), c10);
            int i34222 = i14 >> 3;
            A7.b.e(str, c4323o, b10222, i23, i24, z13, i25, 0, rVar, (i34222 & 112) | (i34222 & 14) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 384);
            i21 = i25;
            abstractC4326r2 = c4323o;
            kVar3 = i23;
            i22 = i24;
            z12 = z13;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        kVar2 = kVar;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        i17 = i10;
        i18 = i13 & 16;
        if (i18 == 0) {
        }
        z11 = z10;
        i19 = i13 & 32;
        if (i19 != 0) {
        }
        if ((i14 & 2995931) != 599186) {
        }
        if (i33 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        rVar.W(1561620249);
        c10 = e(m10, rVar).c();
        if (c10 == r0.r.f44263k) {
        }
        rVar.t(false);
        N0.E b102222 = N0.E.b(e(m10, rVar), c10);
        int i342222 = i14 >> 3;
        A7.b.e(str, c4323o, b102222, i23, i24, z13, i25, 0, rVar, (i342222 & 112) | (i342222 & 14) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 384);
        i21 = i25;
        abstractC4326r2 = c4323o;
        kVar3 = i23;
        i22 = i24;
        z12 = z13;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final long d(M m10, AbstractC1725n abstractC1725n) {
        AbstractC3557B.c0("<this>", m10);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-401305534);
        Z.O o10 = Q.f16263a;
        rVar.W(26288398);
        wf.n nVar = ((P) rVar.m(Q.f16263a)).f16261c;
        rVar.t(false);
        long j6 = ((r0.r) nVar.invoke(rVar, 0)).f44265a;
        rVar.t(false);
        return j6;
    }

    public static final N0.E e(M m10, AbstractC1725n abstractC1725n) {
        AbstractC3557B.c0("<this>", m10);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1652167225);
        Z.O o10 = Q.f16263a;
        rVar.W(-402397962);
        wf.n nVar = ((P) rVar.m(Q.f16263a)).f16259a;
        rVar.t(false);
        N0.E e10 = (N0.E) nVar.invoke(rVar, 0);
        rVar.t(false);
        return e10;
    }
}
