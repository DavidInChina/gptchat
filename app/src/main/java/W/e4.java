package W;

import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import s0.AbstractC5502d;
import y.C6481t;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.C6721r0;
import z.C6729v0;
import z.C6737z0;

/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a  reason: collision with root package name */
    public static final e4 f20037a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
        if (r30 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015c, code lost:
        if (r30 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0186, code lost:
        if (r30 != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0327 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(EnumC1612s1 enumC1612s1, long j6, long j10, wf.o oVar, boolean z10, wf.s sVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        float f6;
        C1724m0 c1724m0;
        int ordinal;
        float f10;
        int ordinal2;
        float f11;
        int ordinal3;
        float f12;
        int ordinal4;
        float f13;
        int ordinal5;
        int[] iArr;
        long j11;
        boolean g10;
        Object K10;
        long j12;
        long j13;
        boolean g11;
        Object K11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-995111872);
        if ((i10 & 6) == 0) {
            if (rVar.g(enumC1612s1)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.f(j6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (rVar.f(j10)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.i(oVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.h(z10)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (rVar.i(sVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) == 74898 && rVar.B()) {
            rVar.P();
        } else {
            C6729v0 x10 = AbstractC6696f.x(enumC1612s1, "TextFieldInputState", rVar, (i11 & 14) | 48, 0);
            C1641y0 c1641y0 = C1641y0.f20625q0;
            rVar.W(-1338768149);
            C6737z0 c6737z0 = AbstractC6652A0.f51116a;
            rVar.W(-142660079);
            rVar.W(240378898);
            int ordinal6 = ((EnumC1612s1) x10.b()).ordinal();
            float f14 = 0.0f;
            if (ordinal6 != 0) {
                if (ordinal6 != 1) {
                    if (ordinal6 != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    f6 = 0.0f;
                    rVar.t(false);
                    Float valueOf = Float.valueOf(f6);
                    c1724m0 = x10.f51386c;
                    rVar.W(240378898);
                    ordinal = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new RuntimeException();
                            }
                        } else {
                            f10 = 0.0f;
                            rVar.t(false);
                            C6721r0 n10 = AbstractC6696f.n(x10, valueOf, Float.valueOf(f10), (AbstractC6659E) c1641y0.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            C1641y0 c1641y02 = C1641y0.f20627s0;
                            rVar.W(-1338768149);
                            rVar.W(-142660079);
                            rVar.W(2067512179);
                            ordinal2 = ((EnumC1612s1) x10.b()).ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                f11 = 0.0f;
                                rVar.t(false);
                                Float valueOf2 = Float.valueOf(f11);
                                rVar.W(2067512179);
                                ordinal3 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            throw new RuntimeException();
                                        }
                                    }
                                    f12 = 0.0f;
                                    rVar.t(false);
                                    C6721r0 n11 = AbstractC6696f.n(x10, valueOf2, Float.valueOf(f12), (AbstractC6659E) c1641y02.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                                    rVar.t(false);
                                    rVar.t(false);
                                    C1641y0 c1641y03 = C1641y0.f20628t0;
                                    rVar.W(-1338768149);
                                    rVar.W(-142660079);
                                    rVar.W(5829913);
                                    ordinal4 = ((EnumC1612s1) x10.b()).ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                throw new RuntimeException();
                                            }
                                        } else if (z10) {
                                            f13 = 0.0f;
                                            rVar.t(false);
                                            Float valueOf3 = Float.valueOf(f13);
                                            rVar.W(5829913);
                                            ordinal5 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                            f14 = 1.0f;
                                            rVar.t(false);
                                            C6721r0 n12 = AbstractC6696f.n(x10, valueOf3, Float.valueOf(f14), (AbstractC6659E) c1641y03.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                                            rVar.t(false);
                                            rVar.t(false);
                                            C1641y0 c1641y04 = C1641y0.f20626r0;
                                            rVar.W(-1939694975);
                                            rVar.W(-1468066062);
                                            iArr = d4.f20023a;
                                            if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                                                j11 = j6;
                                            } else {
                                                j11 = j10;
                                            }
                                            rVar.t(false);
                                            AbstractC5502d f15 = r0.r.f(j11);
                                            rVar.W(1157296644);
                                            g10 = rVar.g(f15);
                                            K10 = rVar.K();
                                            C6481t c6481t = C6481t.f50288l0;
                                            io.sentry.hints.i iVar = C1723m.f22654Y;
                                            if (!g10 || K10 == iVar) {
                                                K10 = (C6737z0) c6481t.invoke(f15);
                                                rVar.h0(K10);
                                            }
                                            rVar.t(false);
                                            C6737z0 c6737z02 = (C6737z0) K10;
                                            rVar.W(-142660079);
                                            rVar.W(-1468066062);
                                            if (iArr[((EnumC1612s1) x10.b()).ordinal()] != 1) {
                                                j12 = j6;
                                            } else {
                                                j12 = j10;
                                            }
                                            rVar.t(false);
                                            r0.r rVar2 = new r0.r(j12);
                                            rVar.W(-1468066062);
                                            if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                                                j13 = j6;
                                            } else {
                                                j13 = j10;
                                            }
                                            rVar.t(false);
                                            C6721r0 n13 = AbstractC6696f.n(x10, rVar2, new r0.r(j13), (AbstractC6659E) c1641y04.invoke(x10.c(), rVar, 0), c6737z02, rVar);
                                            rVar.t(false);
                                            rVar.t(false);
                                            C1641y0 c1641y05 = C1641y0.f20624p0;
                                            int i18 = (i11 & 7168) | 384;
                                            rVar.W(-1939694975);
                                            AbstractC5502d f16 = r0.r.f(((r0.r) oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf((i18 >> 6) & 112))).f44265a);
                                            rVar.W(1157296644);
                                            g11 = rVar.g(f16);
                                            K11 = rVar.K();
                                            if (!g11 || K11 == iVar) {
                                                K11 = (C6737z0) c6481t.invoke(f16);
                                                rVar.h0(K11);
                                            }
                                            rVar.t(false);
                                            rVar.W(-142660079);
                                            int i19 = ((((i18 << 3) & 57344) | 3136) >> 9) & 112;
                                            C6721r0 n14 = AbstractC6696f.n(x10, oVar.invoke(x10.b(), rVar, Integer.valueOf(i19)), oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf(i19)), (AbstractC6659E) c1641y05.invoke(x10.c(), rVar, 0), (C6737z0) K11, rVar);
                                            rVar.t(false);
                                            rVar.t(false);
                                            sVar.l(Float.valueOf(((Number) n10.f51363m0.getValue()).floatValue()), new r0.r(((r0.r) n13.f51363m0.getValue()).f44265a), new r0.r(((r0.r) n14.f51363m0.getValue()).f44265a), Float.valueOf(((Number) n11.f51363m0.getValue()).floatValue()), Float.valueOf(((Number) n12.f51363m0.getValue()).floatValue()), rVar, Integer.valueOf(i11 & 458752));
                                        }
                                    }
                                    f13 = 1.0f;
                                    rVar.t(false);
                                    Float valueOf32 = Float.valueOf(f13);
                                    rVar.W(5829913);
                                    ordinal5 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f14 = 1.0f;
                                    rVar.t(false);
                                    C6721r0 n122 = AbstractC6696f.n(x10, valueOf32, Float.valueOf(f14), (AbstractC6659E) c1641y03.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                                    rVar.t(false);
                                    rVar.t(false);
                                    C1641y0 c1641y042 = C1641y0.f20626r0;
                                    rVar.W(-1939694975);
                                    rVar.W(-1468066062);
                                    iArr = d4.f20023a;
                                    if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                                    }
                                    rVar.t(false);
                                    AbstractC5502d f152 = r0.r.f(j11);
                                    rVar.W(1157296644);
                                    g10 = rVar.g(f152);
                                    K10 = rVar.K();
                                    C6481t c6481t2 = C6481t.f50288l0;
                                    io.sentry.hints.i iVar2 = C1723m.f22654Y;
                                    if (!g10) {
                                    }
                                    K10 = (C6737z0) c6481t2.invoke(f152);
                                    rVar.h0(K10);
                                    rVar.t(false);
                                    C6737z0 c6737z022 = (C6737z0) K10;
                                    rVar.W(-142660079);
                                    rVar.W(-1468066062);
                                    if (iArr[((EnumC1612s1) x10.b()).ordinal()] != 1) {
                                    }
                                    rVar.t(false);
                                    r0.r rVar22 = new r0.r(j12);
                                    rVar.W(-1468066062);
                                    if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                                    }
                                    rVar.t(false);
                                    C6721r0 n132 = AbstractC6696f.n(x10, rVar22, new r0.r(j13), (AbstractC6659E) c1641y042.invoke(x10.c(), rVar, 0), c6737z022, rVar);
                                    rVar.t(false);
                                    rVar.t(false);
                                    C1641y0 c1641y052 = C1641y0.f20624p0;
                                    int i182 = (i11 & 7168) | 384;
                                    rVar.W(-1939694975);
                                    AbstractC5502d f162 = r0.r.f(((r0.r) oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf((i182 >> 6) & 112))).f44265a);
                                    rVar.W(1157296644);
                                    g11 = rVar.g(f162);
                                    K11 = rVar.K();
                                    if (!g11) {
                                    }
                                    K11 = (C6737z0) c6481t2.invoke(f162);
                                    rVar.h0(K11);
                                    rVar.t(false);
                                    rVar.W(-142660079);
                                    int i192 = ((((i182 << 3) & 57344) | 3136) >> 9) & 112;
                                    C6721r0 n142 = AbstractC6696f.n(x10, oVar.invoke(x10.b(), rVar, Integer.valueOf(i192)), oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf(i192)), (AbstractC6659E) c1641y052.invoke(x10.c(), rVar, 0), (C6737z0) K11, rVar);
                                    rVar.t(false);
                                    rVar.t(false);
                                    sVar.l(Float.valueOf(((Number) n10.f51363m0.getValue()).floatValue()), new r0.r(((r0.r) n132.f51363m0.getValue()).f44265a), new r0.r(((r0.r) n142.f51363m0.getValue()).f44265a), Float.valueOf(((Number) n11.f51363m0.getValue()).floatValue()), Float.valueOf(((Number) n122.f51363m0.getValue()).floatValue()), rVar, Integer.valueOf(i11 & 458752));
                                }
                                f12 = 1.0f;
                                rVar.t(false);
                                C6721r0 n112 = AbstractC6696f.n(x10, valueOf2, Float.valueOf(f12), (AbstractC6659E) c1641y02.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                                rVar.t(false);
                                rVar.t(false);
                                C1641y0 c1641y032 = C1641y0.f20628t0;
                                rVar.W(-1338768149);
                                rVar.W(-142660079);
                                rVar.W(5829913);
                                ordinal4 = ((EnumC1612s1) x10.b()).ordinal();
                                if (ordinal4 != 0) {
                                }
                                f13 = 1.0f;
                                rVar.t(false);
                                Float valueOf322 = Float.valueOf(f13);
                                rVar.W(5829913);
                                ordinal5 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                                if (ordinal5 != 0) {
                                }
                                f14 = 1.0f;
                                rVar.t(false);
                                C6721r0 n1222 = AbstractC6696f.n(x10, valueOf322, Float.valueOf(f14), (AbstractC6659E) c1641y032.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                                rVar.t(false);
                                rVar.t(false);
                                C1641y0 c1641y0422 = C1641y0.f20626r0;
                                rVar.W(-1939694975);
                                rVar.W(-1468066062);
                                iArr = d4.f20023a;
                                if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                                }
                                rVar.t(false);
                                AbstractC5502d f1522 = r0.r.f(j11);
                                rVar.W(1157296644);
                                g10 = rVar.g(f1522);
                                K10 = rVar.K();
                                C6481t c6481t22 = C6481t.f50288l0;
                                io.sentry.hints.i iVar22 = C1723m.f22654Y;
                                if (!g10) {
                                }
                                K10 = (C6737z0) c6481t22.invoke(f1522);
                                rVar.h0(K10);
                                rVar.t(false);
                                C6737z0 c6737z0222 = (C6737z0) K10;
                                rVar.W(-142660079);
                                rVar.W(-1468066062);
                                if (iArr[((EnumC1612s1) x10.b()).ordinal()] != 1) {
                                }
                                rVar.t(false);
                                r0.r rVar222 = new r0.r(j12);
                                rVar.W(-1468066062);
                                if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                                }
                                rVar.t(false);
                                C6721r0 n1322 = AbstractC6696f.n(x10, rVar222, new r0.r(j13), (AbstractC6659E) c1641y0422.invoke(x10.c(), rVar, 0), c6737z0222, rVar);
                                rVar.t(false);
                                rVar.t(false);
                                C1641y0 c1641y0522 = C1641y0.f20624p0;
                                int i1822 = (i11 & 7168) | 384;
                                rVar.W(-1939694975);
                                AbstractC5502d f1622 = r0.r.f(((r0.r) oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf((i1822 >> 6) & 112))).f44265a);
                                rVar.W(1157296644);
                                g11 = rVar.g(f1622);
                                K11 = rVar.K();
                                if (!g11) {
                                }
                                K11 = (C6737z0) c6481t22.invoke(f1622);
                                rVar.h0(K11);
                                rVar.t(false);
                                rVar.W(-142660079);
                                int i1922 = ((((i1822 << 3) & 57344) | 3136) >> 9) & 112;
                                C6721r0 n1422 = AbstractC6696f.n(x10, oVar.invoke(x10.b(), rVar, Integer.valueOf(i1922)), oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf(i1922)), (AbstractC6659E) c1641y0522.invoke(x10.c(), rVar, 0), (C6737z0) K11, rVar);
                                rVar.t(false);
                                rVar.t(false);
                                sVar.l(Float.valueOf(((Number) n10.f51363m0.getValue()).floatValue()), new r0.r(((r0.r) n1322.f51363m0.getValue()).f44265a), new r0.r(((r0.r) n1422.f51363m0.getValue()).f44265a), Float.valueOf(((Number) n112.f51363m0.getValue()).floatValue()), Float.valueOf(((Number) n1222.f51363m0.getValue()).floatValue()), rVar, Integer.valueOf(i11 & 458752));
                            }
                            f11 = 1.0f;
                            rVar.t(false);
                            Float valueOf22 = Float.valueOf(f11);
                            rVar.W(2067512179);
                            ordinal3 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                            if (ordinal3 != 0) {
                            }
                            f12 = 1.0f;
                            rVar.t(false);
                            C6721r0 n1122 = AbstractC6696f.n(x10, valueOf22, Float.valueOf(f12), (AbstractC6659E) c1641y02.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            C1641y0 c1641y0322 = C1641y0.f20628t0;
                            rVar.W(-1338768149);
                            rVar.W(-142660079);
                            rVar.W(5829913);
                            ordinal4 = ((EnumC1612s1) x10.b()).ordinal();
                            if (ordinal4 != 0) {
                            }
                            f13 = 1.0f;
                            rVar.t(false);
                            Float valueOf3222 = Float.valueOf(f13);
                            rVar.W(5829913);
                            ordinal5 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                            if (ordinal5 != 0) {
                            }
                            f14 = 1.0f;
                            rVar.t(false);
                            C6721r0 n12222 = AbstractC6696f.n(x10, valueOf3222, Float.valueOf(f14), (AbstractC6659E) c1641y0322.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            C1641y0 c1641y04222 = C1641y0.f20626r0;
                            rVar.W(-1939694975);
                            rVar.W(-1468066062);
                            iArr = d4.f20023a;
                            if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                            }
                            rVar.t(false);
                            AbstractC5502d f15222 = r0.r.f(j11);
                            rVar.W(1157296644);
                            g10 = rVar.g(f15222);
                            K10 = rVar.K();
                            C6481t c6481t222 = C6481t.f50288l0;
                            io.sentry.hints.i iVar222 = C1723m.f22654Y;
                            if (!g10) {
                            }
                            K10 = (C6737z0) c6481t222.invoke(f15222);
                            rVar.h0(K10);
                            rVar.t(false);
                            C6737z0 c6737z02222 = (C6737z0) K10;
                            rVar.W(-142660079);
                            rVar.W(-1468066062);
                            if (iArr[((EnumC1612s1) x10.b()).ordinal()] != 1) {
                            }
                            rVar.t(false);
                            r0.r rVar2222 = new r0.r(j12);
                            rVar.W(-1468066062);
                            if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                            }
                            rVar.t(false);
                            C6721r0 n13222 = AbstractC6696f.n(x10, rVar2222, new r0.r(j13), (AbstractC6659E) c1641y04222.invoke(x10.c(), rVar, 0), c6737z02222, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            C1641y0 c1641y05222 = C1641y0.f20624p0;
                            int i18222 = (i11 & 7168) | 384;
                            rVar.W(-1939694975);
                            AbstractC5502d f16222 = r0.r.f(((r0.r) oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf((i18222 >> 6) & 112))).f44265a);
                            rVar.W(1157296644);
                            g11 = rVar.g(f16222);
                            K11 = rVar.K();
                            if (!g11) {
                            }
                            K11 = (C6737z0) c6481t222.invoke(f16222);
                            rVar.h0(K11);
                            rVar.t(false);
                            rVar.W(-142660079);
                            int i19222 = ((((i18222 << 3) & 57344) | 3136) >> 9) & 112;
                            C6721r0 n14222 = AbstractC6696f.n(x10, oVar.invoke(x10.b(), rVar, Integer.valueOf(i19222)), oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf(i19222)), (AbstractC6659E) c1641y05222.invoke(x10.c(), rVar, 0), (C6737z0) K11, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            sVar.l(Float.valueOf(((Number) n10.f51363m0.getValue()).floatValue()), new r0.r(((r0.r) n13222.f51363m0.getValue()).f44265a), new r0.r(((r0.r) n14222.f51363m0.getValue()).f44265a), Float.valueOf(((Number) n1122.f51363m0.getValue()).floatValue()), Float.valueOf(((Number) n12222.f51363m0.getValue()).floatValue()), rVar, Integer.valueOf(i11 & 458752));
                        }
                    }
                    f10 = 1.0f;
                    rVar.t(false);
                    C6721r0 n102 = AbstractC6696f.n(x10, valueOf, Float.valueOf(f10), (AbstractC6659E) c1641y0.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    C1641y0 c1641y022 = C1641y0.f20627s0;
                    rVar.W(-1338768149);
                    rVar.W(-142660079);
                    rVar.W(2067512179);
                    ordinal2 = ((EnumC1612s1) x10.b()).ordinal();
                    if (ordinal2 != 0) {
                    }
                    f11 = 1.0f;
                    rVar.t(false);
                    Float valueOf222 = Float.valueOf(f11);
                    rVar.W(2067512179);
                    ordinal3 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                    if (ordinal3 != 0) {
                    }
                    f12 = 1.0f;
                    rVar.t(false);
                    C6721r0 n11222 = AbstractC6696f.n(x10, valueOf222, Float.valueOf(f12), (AbstractC6659E) c1641y022.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    C1641y0 c1641y03222 = C1641y0.f20628t0;
                    rVar.W(-1338768149);
                    rVar.W(-142660079);
                    rVar.W(5829913);
                    ordinal4 = ((EnumC1612s1) x10.b()).ordinal();
                    if (ordinal4 != 0) {
                    }
                    f13 = 1.0f;
                    rVar.t(false);
                    Float valueOf32222 = Float.valueOf(f13);
                    rVar.W(5829913);
                    ordinal5 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
                    if (ordinal5 != 0) {
                    }
                    f14 = 1.0f;
                    rVar.t(false);
                    C6721r0 n122222 = AbstractC6696f.n(x10, valueOf32222, Float.valueOf(f14), (AbstractC6659E) c1641y03222.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    C1641y0 c1641y042222 = C1641y0.f20626r0;
                    rVar.W(-1939694975);
                    rVar.W(-1468066062);
                    iArr = d4.f20023a;
                    if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                    }
                    rVar.t(false);
                    AbstractC5502d f152222 = r0.r.f(j11);
                    rVar.W(1157296644);
                    g10 = rVar.g(f152222);
                    K10 = rVar.K();
                    C6481t c6481t2222 = C6481t.f50288l0;
                    io.sentry.hints.i iVar2222 = C1723m.f22654Y;
                    if (!g10) {
                    }
                    K10 = (C6737z0) c6481t2222.invoke(f152222);
                    rVar.h0(K10);
                    rVar.t(false);
                    C6737z0 c6737z022222 = (C6737z0) K10;
                    rVar.W(-142660079);
                    rVar.W(-1468066062);
                    if (iArr[((EnumC1612s1) x10.b()).ordinal()] != 1) {
                    }
                    rVar.t(false);
                    r0.r rVar22222 = new r0.r(j12);
                    rVar.W(-1468066062);
                    if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
                    }
                    rVar.t(false);
                    C6721r0 n132222 = AbstractC6696f.n(x10, rVar22222, new r0.r(j13), (AbstractC6659E) c1641y042222.invoke(x10.c(), rVar, 0), c6737z022222, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    C1641y0 c1641y052222 = C1641y0.f20624p0;
                    int i182222 = (i11 & 7168) | 384;
                    rVar.W(-1939694975);
                    AbstractC5502d f162222 = r0.r.f(((r0.r) oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf((i182222 >> 6) & 112))).f44265a);
                    rVar.W(1157296644);
                    g11 = rVar.g(f162222);
                    K11 = rVar.K();
                    if (!g11) {
                    }
                    K11 = (C6737z0) c6481t2222.invoke(f162222);
                    rVar.h0(K11);
                    rVar.t(false);
                    rVar.W(-142660079);
                    int i192222 = ((((i182222 << 3) & 57344) | 3136) >> 9) & 112;
                    C6721r0 n142222 = AbstractC6696f.n(x10, oVar.invoke(x10.b(), rVar, Integer.valueOf(i192222)), oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf(i192222)), (AbstractC6659E) c1641y052222.invoke(x10.c(), rVar, 0), (C6737z0) K11, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    sVar.l(Float.valueOf(((Number) n102.f51363m0.getValue()).floatValue()), new r0.r(((r0.r) n132222.f51363m0.getValue()).f44265a), new r0.r(((r0.r) n142222.f51363m0.getValue()).f44265a), Float.valueOf(((Number) n11222.f51363m0.getValue()).floatValue()), Float.valueOf(((Number) n122222.f51363m0.getValue()).floatValue()), rVar, Integer.valueOf(i11 & 458752));
                }
            }
            f6 = 1.0f;
            rVar.t(false);
            Float valueOf4 = Float.valueOf(f6);
            c1724m0 = x10.f51386c;
            rVar.W(240378898);
            ordinal = ((EnumC1612s1) c1724m0.getValue()).ordinal();
            if (ordinal != 0) {
            }
            f10 = 1.0f;
            rVar.t(false);
            C6721r0 n1022 = AbstractC6696f.n(x10, valueOf4, Float.valueOf(f10), (AbstractC6659E) c1641y0.invoke(x10.c(), rVar, 0), c6737z0, rVar);
            rVar.t(false);
            rVar.t(false);
            C1641y0 c1641y0222 = C1641y0.f20627s0;
            rVar.W(-1338768149);
            rVar.W(-142660079);
            rVar.W(2067512179);
            ordinal2 = ((EnumC1612s1) x10.b()).ordinal();
            if (ordinal2 != 0) {
            }
            f11 = 1.0f;
            rVar.t(false);
            Float valueOf2222 = Float.valueOf(f11);
            rVar.W(2067512179);
            ordinal3 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
            if (ordinal3 != 0) {
            }
            f12 = 1.0f;
            rVar.t(false);
            C6721r0 n112222 = AbstractC6696f.n(x10, valueOf2222, Float.valueOf(f12), (AbstractC6659E) c1641y0222.invoke(x10.c(), rVar, 0), c6737z0, rVar);
            rVar.t(false);
            rVar.t(false);
            C1641y0 c1641y032222 = C1641y0.f20628t0;
            rVar.W(-1338768149);
            rVar.W(-142660079);
            rVar.W(5829913);
            ordinal4 = ((EnumC1612s1) x10.b()).ordinal();
            if (ordinal4 != 0) {
            }
            f13 = 1.0f;
            rVar.t(false);
            Float valueOf322222 = Float.valueOf(f13);
            rVar.W(5829913);
            ordinal5 = ((EnumC1612s1) c1724m0.getValue()).ordinal();
            if (ordinal5 != 0) {
            }
            f14 = 1.0f;
            rVar.t(false);
            C6721r0 n1222222 = AbstractC6696f.n(x10, valueOf322222, Float.valueOf(f14), (AbstractC6659E) c1641y032222.invoke(x10.c(), rVar, 0), c6737z0, rVar);
            rVar.t(false);
            rVar.t(false);
            C1641y0 c1641y0422222 = C1641y0.f20626r0;
            rVar.W(-1939694975);
            rVar.W(-1468066062);
            iArr = d4.f20023a;
            if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
            }
            rVar.t(false);
            AbstractC5502d f1522222 = r0.r.f(j11);
            rVar.W(1157296644);
            g10 = rVar.g(f1522222);
            K10 = rVar.K();
            C6481t c6481t22222 = C6481t.f50288l0;
            io.sentry.hints.i iVar22222 = C1723m.f22654Y;
            if (!g10) {
            }
            K10 = (C6737z0) c6481t22222.invoke(f1522222);
            rVar.h0(K10);
            rVar.t(false);
            C6737z0 c6737z0222222 = (C6737z0) K10;
            rVar.W(-142660079);
            rVar.W(-1468066062);
            if (iArr[((EnumC1612s1) x10.b()).ordinal()] != 1) {
            }
            rVar.t(false);
            r0.r rVar222222 = new r0.r(j12);
            rVar.W(-1468066062);
            if (iArr[((EnumC1612s1) c1724m0.getValue()).ordinal()] != 1) {
            }
            rVar.t(false);
            C6721r0 n1322222 = AbstractC6696f.n(x10, rVar222222, new r0.r(j13), (AbstractC6659E) c1641y0422222.invoke(x10.c(), rVar, 0), c6737z0222222, rVar);
            rVar.t(false);
            rVar.t(false);
            C1641y0 c1641y0522222 = C1641y0.f20624p0;
            int i1822222 = (i11 & 7168) | 384;
            rVar.W(-1939694975);
            AbstractC5502d f1622222 = r0.r.f(((r0.r) oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf((i1822222 >> 6) & 112))).f44265a);
            rVar.W(1157296644);
            g11 = rVar.g(f1622222);
            K11 = rVar.K();
            if (!g11) {
            }
            K11 = (C6737z0) c6481t22222.invoke(f1622222);
            rVar.h0(K11);
            rVar.t(false);
            rVar.W(-142660079);
            int i1922222 = ((((i1822222 << 3) & 57344) | 3136) >> 9) & 112;
            C6721r0 n1422222 = AbstractC6696f.n(x10, oVar.invoke(x10.b(), rVar, Integer.valueOf(i1922222)), oVar.invoke(c1724m0.getValue(), rVar, Integer.valueOf(i1922222)), (AbstractC6659E) c1641y0522222.invoke(x10.c(), rVar, 0), (C6737z0) K11, rVar);
            rVar.t(false);
            rVar.t(false);
            sVar.l(Float.valueOf(((Number) n1022.f51363m0.getValue()).floatValue()), new r0.r(((r0.r) n1322222.f51363m0.getValue()).f44265a), new r0.r(((r0.r) n1422222.f51363m0.getValue()).f44265a), Float.valueOf(((Number) n112222.f51363m0.getValue()).floatValue()), Float.valueOf(((Number) n1222222.f51363m0.getValue()).floatValue()), rVar, Integer.valueOf(i11 & 458752));
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new c4(this, enumC1612s1, j6, j10, oVar, z10, sVar, i10);
        }
    }
}
