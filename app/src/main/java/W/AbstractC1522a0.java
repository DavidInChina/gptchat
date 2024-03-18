package W;

import E.AbstractC0425i;
import E.AbstractC0427k;
import E.AbstractC0434s;
import E.C0412a0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1718j0;
import Z.C1723m;
import Z.C1741v0;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import h.C3281g;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5156c;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.AbstractC6714o;
import z.C6716p;
import z.C6732x;
import z.C6736z;

/* renamed from: W.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1522a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C6732x f19885a = new C6732x(0.8f, 0.8f, 0.15f);

    /* renamed from: b  reason: collision with root package name */
    public static final float f19886b = 28;

    /* renamed from: c  reason: collision with root package name */
    public static final float f19887c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f19888d;

    static {
        float f6 = 4;
        f19887c = f6;
        f19888d = 16 - f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wf.n nVar, AbstractC4326r abstractC4326r, wf.n nVar2, wf.o oVar, E.A0 a02, k4 k4Var, n4 n4Var, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        C3288a c3288a;
        int i14;
        C3288a c3288a2;
        E.A0 a03;
        k4 k4Var2;
        int i15;
        n4 n4Var2;
        n4 n4Var3;
        k4 k4Var3;
        E.A0 a04;
        wf.o oVar2;
        wf.n nVar3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i16;
        n4 n4Var4;
        E.A0 a05;
        AbstractC4326r abstractC4326r4;
        wf.o oVar3;
        E.A0 a06;
        boolean z10;
        long d10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2139286460);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(nVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                c3288a = nVar2;
                if (rVar.i(c3288a)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i12 |= i21;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    c3288a2 = oVar;
                    if (rVar.i(c3288a2)) {
                        i20 = 2048;
                    } else {
                        i20 = 1024;
                    }
                    i12 |= i20;
                    if ((i10 & 24576) != 0) {
                        if ((i11 & 16) == 0) {
                            a03 = a02;
                            if (rVar.g(a03)) {
                                i19 = 16384;
                                i12 |= i19;
                            }
                        } else {
                            a03 = a02;
                        }
                        i19 = 8192;
                        i12 |= i19;
                    } else {
                        a03 = a02;
                    }
                    if ((196608 & i10) != 0) {
                        if ((i11 & 32) == 0) {
                            k4Var2 = k4Var;
                            if (rVar.g(k4Var2)) {
                                i18 = 131072;
                                i12 |= i18;
                            }
                        } else {
                            k4Var2 = k4Var;
                        }
                        i18 = 65536;
                        i12 |= i18;
                    } else {
                        k4Var2 = k4Var;
                    }
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        n4Var2 = n4Var;
                        if (rVar.g(n4Var2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                        if ((599187 & i12) != 599186 && rVar.B()) {
                            rVar.P();
                            abstractC4326r3 = abstractC4326r2;
                            nVar3 = c3288a;
                            oVar2 = c3288a2;
                            a04 = a03;
                            k4Var3 = k4Var2;
                            n4Var3 = n4Var2;
                        } else {
                            rVar.R();
                            if ((i10 & 1) == 0 && !rVar.A()) {
                                rVar.P();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                i16 = i12;
                                abstractC4326r4 = abstractC4326r2;
                                oVar3 = c3288a2;
                                a05 = a03;
                                k4Var3 = k4Var2;
                                n4Var4 = n4Var2;
                            } else {
                                if (i24 != 0) {
                                    abstractC4326r4 = C4323o.f37719b;
                                } else {
                                    abstractC4326r4 = abstractC4326r2;
                                }
                                if (i13 != 0) {
                                    c3288a = T0.f19690c;
                                }
                                if (i14 != 0) {
                                    c3288a2 = T0.f19691d;
                                }
                                if ((i11 & 16) != 0) {
                                    rVar.W(2143182847);
                                    a06 = new C0412a0(Df.H.U(rVar), r9.y.f44625e | 16);
                                    rVar.t(false);
                                    i12 &= -57345;
                                } else {
                                    a06 = a03;
                                }
                                if ((i11 & 32) != 0) {
                                    rVar.W(513940029);
                                    P0 p02 = (P0) rVar.m(R0.f19593a);
                                    k4Var3 = p02.T;
                                    if (k4Var3 == null) {
                                        int i25 = X.F.f21369a;
                                        long d11 = R0.d(p02, 35);
                                        if (r0.r.c(R0.d(p02, 35), p02.f19532p)) {
                                            d10 = R0.g(p02, X.G.f21376e);
                                        } else {
                                            d10 = R0.d(p02, 35);
                                        }
                                        k4 k4Var4 = new k4(d11, d10, R0.d(p02, X.F.f21370b), R0.d(p02, X.F.f21369a), R0.d(p02, X.F.f21371c));
                                        p02.T = k4Var4;
                                        k4Var3 = k4Var4;
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    rVar.t(z10);
                                    i12 &= -458753;
                                } else {
                                    k4Var3 = k4Var2;
                                }
                                if (i15 != 0) {
                                    n4Var4 = null;
                                    a05 = a06;
                                } else {
                                    a05 = a06;
                                    n4Var4 = n4Var2;
                                }
                                i16 = i12;
                                oVar3 = c3288a2;
                            }
                            rVar.u();
                            int i26 = i16 << 6;
                            c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), true, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (i26 & 234881024), 0);
                            E.A0 a07 = a05;
                            oVar2 = oVar3;
                            abstractC4326r3 = abstractC4326r4;
                            nVar3 = c3288a;
                            n4Var3 = n4Var4;
                            a04 = a07;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new L(nVar, abstractC4326r3, nVar3, oVar2, a04, k4Var3, n4Var3, i10, i11, 0);
                            return;
                        }
                        return;
                    }
                    n4Var2 = n4Var;
                    if ((599187 & i12) != 599186) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i11 & 16) != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    i16 = i12;
                    oVar3 = c3288a2;
                    rVar.u();
                    int i262 = i16 << 6;
                    c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), true, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i262) | (458752 & i262) | (3670016 & i262) | (29360128 & i262) | (i262 & 234881024), 0);
                    E.A0 a072 = a05;
                    oVar2 = oVar3;
                    abstractC4326r3 = abstractC4326r4;
                    nVar3 = c3288a;
                    n4Var3 = n4Var4;
                    a04 = a072;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                c3288a2 = oVar;
                if ((i10 & 24576) != 0) {
                }
                if ((196608 & i10) != 0) {
                }
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                n4Var2 = n4Var;
                if ((599187 & i12) != 599186) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i24 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if (i15 != 0) {
                }
                i16 = i12;
                oVar3 = c3288a2;
                rVar.u();
                int i2622 = i16 << 6;
                c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), true, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i2622) | (458752 & i2622) | (3670016 & i2622) | (29360128 & i2622) | (i2622 & 234881024), 0);
                E.A0 a0722 = a05;
                oVar2 = oVar3;
                abstractC4326r3 = abstractC4326r4;
                nVar3 = c3288a;
                n4Var3 = n4Var4;
                a04 = a0722;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            c3288a = nVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            c3288a2 = oVar;
            if ((i10 & 24576) != 0) {
            }
            if ((196608 & i10) != 0) {
            }
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            n4Var2 = n4Var;
            if ((599187 & i12) != 599186) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i24 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if (i15 != 0) {
            }
            i16 = i12;
            oVar3 = c3288a2;
            rVar.u();
            int i26222 = i16 << 6;
            c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), true, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i26222) | (458752 & i26222) | (3670016 & i26222) | (29360128 & i26222) | (i26222 & 234881024), 0);
            E.A0 a07222 = a05;
            oVar2 = oVar3;
            abstractC4326r3 = abstractC4326r4;
            nVar3 = c3288a;
            n4Var3 = n4Var4;
            a04 = a07222;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        c3288a = nVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        c3288a2 = oVar;
        if ((i10 & 24576) != 0) {
        }
        if ((196608 & i10) != 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        n4Var2 = n4Var;
        if ((599187 & i12) != 599186) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i24 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if (i15 != 0) {
        }
        i16 = i12;
        oVar3 = c3288a2;
        rVar.u();
        int i262222 = i16 << 6;
        c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), true, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i262222) | (458752 & i262222) | (3670016 & i262222) | (29360128 & i262222) | (i262222 & 234881024), 0);
        E.A0 a072222 = a05;
        oVar2 = oVar3;
        abstractC4326r3 = abstractC4326r4;
        nVar3 = c3288a;
        n4Var3 = n4Var4;
        a04 = a072222;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(wf.n nVar, AbstractC4326r abstractC4326r, wf.n nVar2, wf.o oVar, E.A0 a02, k4 k4Var, n4 n4Var, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        C3288a c3288a;
        int i14;
        C3288a c3288a2;
        E.A0 a03;
        k4 k4Var2;
        int i15;
        n4 n4Var2;
        n4 n4Var3;
        k4 k4Var3;
        E.A0 a04;
        wf.o oVar2;
        wf.n nVar3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i16;
        n4 n4Var4;
        E.A0 a05;
        AbstractC4326r abstractC4326r4;
        wf.o oVar3;
        E.A0 a06;
        boolean z10;
        long d10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-474540752);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(nVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                c3288a = nVar2;
                if (rVar.i(c3288a)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i12 |= i21;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    c3288a2 = oVar;
                    if (rVar.i(c3288a2)) {
                        i20 = 2048;
                    } else {
                        i20 = 1024;
                    }
                    i12 |= i20;
                    if ((i10 & 24576) != 0) {
                        if ((i11 & 16) == 0) {
                            a03 = a02;
                            if (rVar.g(a03)) {
                                i19 = 16384;
                                i12 |= i19;
                            }
                        } else {
                            a03 = a02;
                        }
                        i19 = 8192;
                        i12 |= i19;
                    } else {
                        a03 = a02;
                    }
                    if ((196608 & i10) != 0) {
                        if ((i11 & 32) == 0) {
                            k4Var2 = k4Var;
                            if (rVar.g(k4Var2)) {
                                i18 = 131072;
                                i12 |= i18;
                            }
                        } else {
                            k4Var2 = k4Var;
                        }
                        i18 = 65536;
                        i12 |= i18;
                    } else {
                        k4Var2 = k4Var;
                    }
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        n4Var2 = n4Var;
                        if (rVar.g(n4Var2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                        if ((599187 & i12) != 599186 && rVar.B()) {
                            rVar.P();
                            abstractC4326r3 = abstractC4326r2;
                            nVar3 = c3288a;
                            oVar2 = c3288a2;
                            a04 = a03;
                            k4Var3 = k4Var2;
                            n4Var3 = n4Var2;
                        } else {
                            rVar.R();
                            if ((i10 & 1) == 0 && !rVar.A()) {
                                rVar.P();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                i16 = i12;
                                abstractC4326r4 = abstractC4326r2;
                                oVar3 = c3288a2;
                                a05 = a03;
                                k4Var3 = k4Var2;
                                n4Var4 = n4Var2;
                            } else {
                                if (i24 != 0) {
                                    abstractC4326r4 = C4323o.f37719b;
                                } else {
                                    abstractC4326r4 = abstractC4326r2;
                                }
                                if (i13 != 0) {
                                    c3288a = T0.f19692e;
                                }
                                if (i14 != 0) {
                                    c3288a2 = T0.f19693f;
                                }
                                if ((i11 & 16) != 0) {
                                    rVar.W(2143182847);
                                    a06 = new C0412a0(Df.H.U(rVar), r9.y.f44625e | 16);
                                    rVar.t(false);
                                    i12 &= -57345;
                                } else {
                                    a06 = a03;
                                }
                                if ((i11 & 32) != 0) {
                                    rVar.W(1744932393);
                                    P0 p02 = (P0) rVar.m(R0.f19593a);
                                    k4Var3 = p02.f19509U;
                                    if (k4Var3 == null) {
                                        float f6 = X.E.f21364a;
                                        long d11 = R0.d(p02, 35);
                                        if (r0.r.c(R0.d(p02, 35), p02.f19532p)) {
                                            d10 = R0.g(p02, X.G.f21376e);
                                        } else {
                                            d10 = R0.d(p02, 35);
                                        }
                                        k4 k4Var4 = new k4(d11, d10, R0.d(p02, X.E.f21367d), R0.d(p02, X.E.f21365b), R0.d(p02, X.E.f21368e));
                                        p02.f19509U = k4Var4;
                                        k4Var3 = k4Var4;
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    rVar.t(z10);
                                    i12 &= -458753;
                                } else {
                                    k4Var3 = k4Var2;
                                }
                                if (i15 != 0) {
                                    n4Var4 = null;
                                    a05 = a06;
                                } else {
                                    a05 = a06;
                                    n4Var4 = n4Var2;
                                }
                                i16 = i12;
                                oVar3 = c3288a2;
                            }
                            rVar.u();
                            Z.m1 m1Var = q4.f20361a;
                            int i25 = i16 << 12;
                            int i26 = ((i16 >> 12) & 896) | 54;
                            e(abstractC4326r4, nVar, q4.a((p4) rVar.m(m1Var), X.E.f21366c), f19886b, nVar, q4.a((p4) rVar.m(m1Var), X.G.f21374c), c3288a, oVar3, a05, k4Var3, X.E.f21364a, X.G.f21372a, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i25) | (3670016 & i25) | (29360128 & i25) | (234881024 & i25) | (i25 & 1879048192), i26, 0);
                            E.A0 a07 = a05;
                            oVar2 = oVar3;
                            abstractC4326r3 = abstractC4326r4;
                            nVar3 = c3288a;
                            n4Var3 = n4Var4;
                            a04 = a07;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new L(nVar, abstractC4326r3, nVar3, oVar2, a04, k4Var3, n4Var3, i10, i11, 1);
                            return;
                        }
                        return;
                    }
                    n4Var2 = n4Var;
                    if ((599187 & i12) != 599186) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i11 & 16) != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    i16 = i12;
                    oVar3 = c3288a2;
                    rVar.u();
                    Z.m1 m1Var2 = q4.f20361a;
                    int i252 = i16 << 12;
                    int i262 = ((i16 >> 12) & 896) | 54;
                    e(abstractC4326r4, nVar, q4.a((p4) rVar.m(m1Var2), X.E.f21366c), f19886b, nVar, q4.a((p4) rVar.m(m1Var2), X.G.f21374c), c3288a, oVar3, a05, k4Var3, X.E.f21364a, X.G.f21372a, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i252) | (3670016 & i252) | (29360128 & i252) | (234881024 & i252) | (i252 & 1879048192), i262, 0);
                    E.A0 a072 = a05;
                    oVar2 = oVar3;
                    abstractC4326r3 = abstractC4326r4;
                    nVar3 = c3288a;
                    n4Var3 = n4Var4;
                    a04 = a072;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                c3288a2 = oVar;
                if ((i10 & 24576) != 0) {
                }
                if ((196608 & i10) != 0) {
                }
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                n4Var2 = n4Var;
                if ((599187 & i12) != 599186) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i24 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if (i15 != 0) {
                }
                i16 = i12;
                oVar3 = c3288a2;
                rVar.u();
                Z.m1 m1Var22 = q4.f20361a;
                int i2522 = i16 << 12;
                int i2622 = ((i16 >> 12) & 896) | 54;
                e(abstractC4326r4, nVar, q4.a((p4) rVar.m(m1Var22), X.E.f21366c), f19886b, nVar, q4.a((p4) rVar.m(m1Var22), X.G.f21374c), c3288a, oVar3, a05, k4Var3, X.E.f21364a, X.G.f21372a, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i2522) | (3670016 & i2522) | (29360128 & i2522) | (234881024 & i2522) | (i2522 & 1879048192), i2622, 0);
                E.A0 a0722 = a05;
                oVar2 = oVar3;
                abstractC4326r3 = abstractC4326r4;
                nVar3 = c3288a;
                n4Var3 = n4Var4;
                a04 = a0722;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            c3288a = nVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            c3288a2 = oVar;
            if ((i10 & 24576) != 0) {
            }
            if ((196608 & i10) != 0) {
            }
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            n4Var2 = n4Var;
            if ((599187 & i12) != 599186) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i24 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if (i15 != 0) {
            }
            i16 = i12;
            oVar3 = c3288a2;
            rVar.u();
            Z.m1 m1Var222 = q4.f20361a;
            int i25222 = i16 << 12;
            int i26222 = ((i16 >> 12) & 896) | 54;
            e(abstractC4326r4, nVar, q4.a((p4) rVar.m(m1Var222), X.E.f21366c), f19886b, nVar, q4.a((p4) rVar.m(m1Var222), X.G.f21374c), c3288a, oVar3, a05, k4Var3, X.E.f21364a, X.G.f21372a, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i25222) | (3670016 & i25222) | (29360128 & i25222) | (234881024 & i25222) | (i25222 & 1879048192), i26222, 0);
            E.A0 a07222 = a05;
            oVar2 = oVar3;
            abstractC4326r3 = abstractC4326r4;
            nVar3 = c3288a;
            n4Var3 = n4Var4;
            a04 = a07222;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        c3288a = nVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        c3288a2 = oVar;
        if ((i10 & 24576) != 0) {
        }
        if ((196608 & i10) != 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        n4Var2 = n4Var;
        if ((599187 & i12) != 599186) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i24 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if (i15 != 0) {
        }
        i16 = i12;
        oVar3 = c3288a2;
        rVar.u();
        Z.m1 m1Var2222 = q4.f20361a;
        int i252222 = i16 << 12;
        int i262222 = ((i16 >> 12) & 896) | 54;
        e(abstractC4326r4, nVar, q4.a((p4) rVar.m(m1Var2222), X.E.f21366c), f19886b, nVar, q4.a((p4) rVar.m(m1Var2222), X.G.f21374c), c3288a, oVar3, a05, k4Var3, X.E.f21364a, X.G.f21372a, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i252222) | (3670016 & i252222) | (29360128 & i252222) | (234881024 & i252222) | (i252222 & 1879048192), i262222, 0);
        E.A0 a072222 = a05;
        oVar2 = oVar3;
        abstractC4326r3 = abstractC4326r4;
        nVar3 = c3288a;
        n4Var3 = n4Var4;
        a04 = a072222;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void c(AbstractC4326r abstractC4326r, wf.n nVar, N0.E e10, boolean z10, wf.n nVar2, wf.o oVar, E.A0 a02, k4 k4Var, n4 n4Var, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        boolean z11;
        float f6;
        float f10;
        boolean z12;
        boolean z13;
        o4 o4Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1841601619);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.i(nVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.g(e10)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (rVar.h(z10)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i12 |= i18;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (rVar.i(nVar2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (rVar.i(oVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (rVar.g(a02)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (rVar.g(k4Var)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (rVar.g(n4Var)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        }
        if ((38347923 & i12) == 38347922 && rVar.B()) {
            rVar.P();
            abstractC4326r3 = abstractC4326r2;
        } else {
            AbstractC4326r abstractC4326r4 = C4323o.f37719b;
            if (i22 != 0) {
                abstractC4326r3 = abstractC4326r4;
            } else {
                abstractC4326r3 = abstractC4326r2;
            }
            float f11 = -((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(X.G.f21372a);
            rVar.W(-1008351447);
            int i23 = i12 & 234881024;
            if (i23 == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean d10 = z11 | rVar.d(f11);
            Object K10 = rVar.K();
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (d10 || K10 == iVar) {
                K10 = new M(f11, 0, n4Var);
                rVar.h0(K10);
            }
            rVar.t(false);
            AbstractC1734s.g((AbstractC6216a) K10, rVar);
            if (n4Var != null && (o4Var = ((C1568j1) n4Var).f20169b) != null) {
                C1718j0 c1718j0 = o4Var.f20266a;
                if (c1718j0.h() == 0.0f) {
                    f6 = 0.0f;
                } else {
                    f6 = 1 - (com.google.android.gms.internal.play_billing.N.o(c1718j0.h() - o4Var.f20267b.h(), c1718j0.h(), 0.0f) / c1718j0.h());
                }
            } else {
                f6 = 0.0f;
            }
            if (f6 > 0.01f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            k4Var.getClass();
            Z.l1 a5 = y.l0.a(androidx.compose.ui.graphics.a.n(AbstractC6657D.f51127c.a(f10), k4Var.f20197a, k4Var.f20198b), AbstractC6696f.u(0.0f, 400.0f, null, 5), null, rVar, 48, 12);
            C3288a X10 = R4.b.X(rVar, 1520880938, new O(oVar, 0));
            rVar.W(-1008350212);
            if (n4Var != null && !((C1568j1) n4Var).f20171d) {
                B.W0 w02 = B.W0.f1213Y;
                rVar.W(-1008350035);
                if (i23 == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object K11 = rVar.K();
                if (z12 || K11 == iVar) {
                    K11 = new P(0, n4Var);
                    rVar.h0(K11);
                }
                rVar.t(false);
                B.K0 f12 = B.G0.f((wf.k) K11, rVar);
                rVar.W(-1008349887);
                if (i23 == 67108864) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object K12 = rVar.K();
                if (z13 || K12 == iVar) {
                    K12 = new Q(n4Var, null, 0);
                    rVar.h0(K12);
                }
                rVar.t(false);
                abstractC4326r4 = B.G0.c(abstractC4326r4, f12, w02, false, null, false, (wf.o) K12, false, 188);
            }
            rVar.t(false);
            G3.a(abstractC4326r3.g(abstractC4326r4), null, ((r0.r) a5.getValue()).f44265a, 0L, 0.0f, 0.0f, null, R4.b.X(rVar, 376925230, new N(a02, k4Var, nVar, e10, z10, nVar2, X10, n4Var)), rVar, 12582912, 122);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new K(abstractC4326r3, nVar, e10, z10, nVar2, oVar, a02, k4Var, n4Var, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(wf.n nVar, AbstractC4326r abstractC4326r, wf.n nVar2, wf.o oVar, E.A0 a02, k4 k4Var, n4 n4Var, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        C3288a c3288a;
        int i14;
        C3288a c3288a2;
        E.A0 a03;
        k4 k4Var2;
        int i15;
        n4 n4Var2;
        n4 n4Var3;
        k4 k4Var3;
        E.A0 a04;
        wf.o oVar2;
        wf.n nVar3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i16;
        n4 n4Var4;
        E.A0 a05;
        AbstractC4326r abstractC4326r4;
        wf.o oVar3;
        E.A0 a06;
        boolean z10;
        long d10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1906353009);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(nVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                c3288a = nVar2;
                if (rVar.i(c3288a)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i12 |= i21;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    c3288a2 = oVar;
                    if (rVar.i(c3288a2)) {
                        i20 = 2048;
                    } else {
                        i20 = 1024;
                    }
                    i12 |= i20;
                    if ((i10 & 24576) != 0) {
                        if ((i11 & 16) == 0) {
                            a03 = a02;
                            if (rVar.g(a03)) {
                                i19 = 16384;
                                i12 |= i19;
                            }
                        } else {
                            a03 = a02;
                        }
                        i19 = 8192;
                        i12 |= i19;
                    } else {
                        a03 = a02;
                    }
                    if ((196608 & i10) != 0) {
                        if ((i11 & 32) == 0) {
                            k4Var2 = k4Var;
                            if (rVar.g(k4Var2)) {
                                i18 = 131072;
                                i12 |= i18;
                            }
                        } else {
                            k4Var2 = k4Var;
                        }
                        i18 = 65536;
                        i12 |= i18;
                    } else {
                        k4Var2 = k4Var;
                    }
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        n4Var2 = n4Var;
                        if (rVar.g(n4Var2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                        if ((599187 & i12) != 599186 && rVar.B()) {
                            rVar.P();
                            abstractC4326r3 = abstractC4326r2;
                            nVar3 = c3288a;
                            oVar2 = c3288a2;
                            a04 = a03;
                            k4Var3 = k4Var2;
                            n4Var3 = n4Var2;
                        } else {
                            rVar.R();
                            if ((i10 & 1) == 0 && !rVar.A()) {
                                rVar.P();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                i16 = i12;
                                abstractC4326r4 = abstractC4326r2;
                                oVar3 = c3288a2;
                                a05 = a03;
                                k4Var3 = k4Var2;
                                n4Var4 = n4Var2;
                            } else {
                                if (i24 != 0) {
                                    abstractC4326r4 = C4323o.f37719b;
                                } else {
                                    abstractC4326r4 = abstractC4326r2;
                                }
                                if (i13 != 0) {
                                    c3288a = T0.f19688a;
                                }
                                if (i14 != 0) {
                                    c3288a2 = T0.f19689b;
                                }
                                if ((i11 & 16) != 0) {
                                    rVar.W(2143182847);
                                    a06 = new C0412a0(Df.H.U(rVar), r9.y.f44625e | 16);
                                    rVar.t(false);
                                    i12 &= -57345;
                                } else {
                                    a06 = a03;
                                }
                                if ((i11 & 32) != 0) {
                                    rVar.W(-1388520854);
                                    P0 p02 = (P0) rVar.m(R0.f19593a);
                                    k4Var3 = p02.S;
                                    if (k4Var3 == null) {
                                        float f6 = X.G.f21372a;
                                        long d11 = R0.d(p02, 35);
                                        if (r0.r.c(R0.d(p02, 35), p02.f19532p)) {
                                            d10 = R0.g(p02, X.G.f21376e);
                                        } else {
                                            d10 = R0.d(p02, 35);
                                        }
                                        k4 k4Var4 = new k4(d11, d10, R0.d(p02, X.G.f21375d), R0.d(p02, X.G.f21373b), R0.d(p02, X.G.f21377f));
                                        p02.S = k4Var4;
                                        k4Var3 = k4Var4;
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    rVar.t(z10);
                                    i12 &= -458753;
                                } else {
                                    k4Var3 = k4Var2;
                                }
                                if (i15 != 0) {
                                    n4Var4 = null;
                                    a05 = a06;
                                } else {
                                    a05 = a06;
                                    n4Var4 = n4Var2;
                                }
                                i16 = i12;
                                oVar3 = c3288a2;
                            }
                            rVar.u();
                            int i25 = i16 << 6;
                            c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), false, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25) | (i25 & 234881024), 0);
                            E.A0 a07 = a05;
                            oVar2 = oVar3;
                            abstractC4326r3 = abstractC4326r4;
                            nVar3 = c3288a;
                            n4Var3 = n4Var4;
                            a04 = a07;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new L(nVar, abstractC4326r3, nVar3, oVar2, a04, k4Var3, n4Var3, i10, i11, 2);
                            return;
                        }
                        return;
                    }
                    n4Var2 = n4Var;
                    if ((599187 & i12) != 599186) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i11 & 16) != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    i16 = i12;
                    oVar3 = c3288a2;
                    rVar.u();
                    int i252 = i16 << 6;
                    c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), false, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i252) | (458752 & i252) | (3670016 & i252) | (29360128 & i252) | (i252 & 234881024), 0);
                    E.A0 a072 = a05;
                    oVar2 = oVar3;
                    abstractC4326r3 = abstractC4326r4;
                    nVar3 = c3288a;
                    n4Var3 = n4Var4;
                    a04 = a072;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                c3288a2 = oVar;
                if ((i10 & 24576) != 0) {
                }
                if ((196608 & i10) != 0) {
                }
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                n4Var2 = n4Var;
                if ((599187 & i12) != 599186) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i24 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if (i15 != 0) {
                }
                i16 = i12;
                oVar3 = c3288a2;
                rVar.u();
                int i2522 = i16 << 6;
                c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), false, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i2522) | (458752 & i2522) | (3670016 & i2522) | (29360128 & i2522) | (i2522 & 234881024), 0);
                E.A0 a0722 = a05;
                oVar2 = oVar3;
                abstractC4326r3 = abstractC4326r4;
                nVar3 = c3288a;
                n4Var3 = n4Var4;
                a04 = a0722;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            c3288a = nVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            c3288a2 = oVar;
            if ((i10 & 24576) != 0) {
            }
            if ((196608 & i10) != 0) {
            }
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            n4Var2 = n4Var;
            if ((599187 & i12) != 599186) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i24 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if (i15 != 0) {
            }
            i16 = i12;
            oVar3 = c3288a2;
            rVar.u();
            int i25222 = i16 << 6;
            c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), false, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i25222) | (458752 & i25222) | (3670016 & i25222) | (29360128 & i25222) | (i25222 & 234881024), 0);
            E.A0 a07222 = a05;
            oVar2 = oVar3;
            abstractC4326r3 = abstractC4326r4;
            nVar3 = c3288a;
            n4Var3 = n4Var4;
            a04 = a07222;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        c3288a = nVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        c3288a2 = oVar;
        if ((i10 & 24576) != 0) {
        }
        if ((196608 & i10) != 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        n4Var2 = n4Var;
        if ((599187 & i12) != 599186) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i24 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if (i15 != 0) {
        }
        i16 = i12;
        oVar3 = c3288a2;
        rVar.u();
        int i252222 = i16 << 6;
        c(abstractC4326r4, nVar, q4.a((p4) rVar.m(q4.f20361a), X.G.f21374c), false, c3288a, oVar3, a05, k4Var3, n4Var4, rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112) | (57344 & i252222) | (458752 & i252222) | (3670016 & i252222) | (29360128 & i252222) | (i252222 & 234881024), 0);
        E.A0 a072222 = a05;
        oVar2 = oVar3;
        abstractC4326r3 = abstractC4326r4;
        nVar3 = c3288a;
        n4Var3 = n4Var4;
        a04 = a072222;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(AbstractC4326r abstractC4326r, wf.n nVar, N0.E e10, float f6, wf.n nVar2, N0.E e11, wf.n nVar3, wf.o oVar, E.A0 a02, k4 k4Var, float f10, float f11, n4 n4Var, AbstractC1725n abstractC1725n, int i10, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        int i14;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        boolean z10;
        float f12;
        boolean z11;
        boolean z12;
        boolean z13;
        o4 o4Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(210227552);
        int i26 = i12 & 1;
        if (i26 != 0) {
            i13 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i13 = i25 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i13 = i10;
        }
        int i27 = 32;
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar2.i(nVar)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i13 |= i24;
            int i28 = 128;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                if (rVar2.g(e10)) {
                    i23 = 256;
                } else {
                    i23 = 128;
                }
                i13 |= i23;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (rVar2.d(f6)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i13 |= i22;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (rVar2.i(nVar2)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i13 |= i21;
                    if ((i12 & 32) == 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (rVar2.g(e11)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 64) == 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (rVar2.i(nVar3)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 128) == 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (rVar2.i(oVar)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 256) == 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (rVar2.g(a02)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i13 |= i17;
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (rVar2.g(k4Var)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i13 |= i16;
                        }
                        if ((i12 & 1024) != 0) {
                            i14 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (rVar2.d(f10)) {
                                i15 = 4;
                            } else {
                                i15 = 2;
                            }
                            i14 = i15 | i11;
                        } else {
                            i14 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            i14 |= 48;
                        } else if ((i11 & 48) == 0) {
                            if (!rVar2.d(f11)) {
                                i27 = 16;
                            }
                            i14 |= i27;
                        }
                        if ((i12 & 4096) != 0) {
                            i14 |= 384;
                        } else if ((i11 & 384) == 0) {
                            if (rVar2.g(n4Var)) {
                                i28 = 256;
                            }
                            i14 |= i28;
                        }
                        if ((306783379 & i13) != 306783378 && (i14 & 147) == 146 && rVar2.B()) {
                            rVar2.P();
                            abstractC4326r3 = abstractC4326r2;
                            rVar = rVar2;
                        } else {
                            AbstractC4326r abstractC4326r5 = C4323o.f37719b;
                            if (i26 != 0) {
                                abstractC4326r4 = abstractC4326r5;
                            } else {
                                abstractC4326r4 = abstractC4326r2;
                            }
                            if (Float.compare(f10, f11) > 0) {
                                ?? obj = new Object();
                                ?? obj2 = new Object();
                                ?? obj3 = new Object();
                                Z0.b bVar = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
                                obj.f37646Y = bVar.R(f11);
                                obj2.f37646Y = bVar.R(f10);
                                obj3.f37647Y = bVar.a0(f6);
                                rVar2.W(-1609641260);
                                int i29 = i14 & 896;
                                if (i29 == 256) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                boolean d10 = z10 | rVar2.d(obj.f37646Y) | rVar2.d(obj2.f37646Y);
                                Object K10 = rVar2.K();
                                io.sentry.hints.i iVar = C1723m.f22654Y;
                                if (d10 || K10 == iVar) {
                                    K10 = new F.s(n4Var, obj, obj2, 3);
                                    rVar2.h0(K10);
                                }
                                rVar2.t(false);
                                AbstractC1734s.g((AbstractC6216a) K10, rVar2);
                                if (n4Var != null && (o4Var = ((C1568j1) n4Var).f20169b) != null) {
                                    f12 = o4Var.a();
                                } else {
                                    f12 = 0.0f;
                                }
                                k4Var.getClass();
                                long n10 = androidx.compose.ui.graphics.a.n(AbstractC6657D.f51127c.a(f12), k4Var.f20197a, k4Var.f20198b);
                                C3288a X10 = R4.b.X(rVar2, -1048401111, new O(oVar, 1));
                                float a5 = f19885a.a(f12);
                                float f13 = 1.0f - f12;
                                if (f12 < 0.5f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                boolean z14 = !z11;
                                rVar2.W(-1609639731);
                                if (n4Var != null && !((C1568j1) n4Var).f20171d) {
                                    B.W0 w02 = B.W0.f1213Y;
                                    rVar2.W(-1609639554);
                                    if (i29 == 256) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    Object K11 = rVar2.K();
                                    if (z12 || K11 == iVar) {
                                        K11 = new P(1, n4Var);
                                        rVar2.h0(K11);
                                    }
                                    rVar2.t(false);
                                    B.K0 f14 = B.G0.f((wf.k) K11, rVar2);
                                    rVar2.W(-1609639406);
                                    if (i29 == 256) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    Object K12 = rVar2.K();
                                    if (z13 || K12 == iVar) {
                                        K12 = new Q(n4Var, null, 1);
                                        rVar2.h0(K12);
                                    }
                                    rVar2.t(false);
                                    abstractC4326r5 = B.G0.c(abstractC4326r5, f14, w02, false, null, false, (wf.o) K12, false, 188);
                                }
                                rVar2.t(false);
                                AbstractC4326r g10 = abstractC4326r4.g(abstractC4326r5);
                                AbstractC4326r abstractC4326r6 = abstractC4326r4;
                                rVar = rVar2;
                                G3.a(g10, null, n10, 0L, 0.0f, 0.0f, null, R4.b.X(rVar, 1985938853, new W(a02, obj, k4Var, nVar2, e11, a5, z11, nVar3, X10, obj2, n4Var, nVar, e10, f13, obj3, z14)), rVar, 12582912, 122);
                                abstractC4326r3 = abstractC4326r6;
                            } else {
                                throw new IllegalArgumentException("A TwoRowsTopAppBar max height should be greater than its pinned height");
                            }
                        }
                        C1741v0 v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new X(abstractC4326r3, nVar, e10, f6, nVar2, e11, nVar3, oVar, a02, k4Var, f10, f11, n4Var, i10, i11, i12);
                            return;
                        }
                        return;
                    }
                    if ((i12 & 512) != 0) {
                    }
                    if ((i12 & 1024) != 0) {
                    }
                    if ((i12 & 2048) != 0) {
                    }
                    if ((i12 & 4096) != 0) {
                    }
                    if ((306783379 & i13) != 306783378) {
                    }
                    AbstractC4326r abstractC4326r52 = C4323o.f37719b;
                    if (i26 != 0) {
                    }
                    if (Float.compare(f10, f11) > 0) {
                    }
                }
                if ((i12 & 32) == 0) {
                }
                if ((i12 & 64) == 0) {
                }
                if ((i12 & 128) == 0) {
                }
                if ((i12 & 256) == 0) {
                }
                if ((i12 & 512) != 0) {
                }
                if ((i12 & 1024) != 0) {
                }
                if ((i12 & 2048) != 0) {
                }
                if ((i12 & 4096) != 0) {
                }
                if ((306783379 & i13) != 306783378) {
                }
                AbstractC4326r abstractC4326r522 = C4323o.f37719b;
                if (i26 != 0) {
                }
                if (Float.compare(f10, f11) > 0) {
                }
            }
            if ((i12 & 8) != 0) {
            }
            if ((i12 & 16) != 0) {
            }
            if ((i12 & 32) == 0) {
            }
            if ((i12 & 64) == 0) {
            }
            if ((i12 & 128) == 0) {
            }
            if ((i12 & 256) == 0) {
            }
            if ((i12 & 512) != 0) {
            }
            if ((i12 & 1024) != 0) {
            }
            if ((i12 & 2048) != 0) {
            }
            if ((i12 & 4096) != 0) {
            }
            if ((306783379 & i13) != 306783378) {
            }
            AbstractC4326r abstractC4326r5222 = C4323o.f37719b;
            if (i26 != 0) {
            }
            if (Float.compare(f10, f11) > 0) {
            }
        }
        int i282 = 128;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if ((i12 & 16) != 0) {
        }
        if ((i12 & 32) == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i12 & 128) == 0) {
        }
        if ((i12 & 256) == 0) {
        }
        if ((i12 & 512) != 0) {
        }
        if ((i12 & 1024) != 0) {
        }
        if ((i12 & 2048) != 0) {
        }
        if ((i12 & 4096) != 0) {
        }
        if ((306783379 & i13) != 306783378) {
        }
        AbstractC4326r abstractC4326r52222 = C4323o.f37719b;
        if (i26 != 0) {
        }
        if (Float.compare(f10, f11) > 0) {
        }
    }

    public static final void f(AbstractC4326r abstractC4326r, float f6, long j6, long j10, long j11, wf.n nVar, N0.E e10, float f10, AbstractC0427k abstractC0427k, AbstractC0425i abstractC0425i, int i10, boolean z10, wf.n nVar2, wf.n nVar3, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC4326r abstractC4326r2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-6794037);
        if ((i11 & 6) == 0) {
            if (rVar.g(abstractC4326r)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i13 = i11 | i25;
        } else {
            i13 = i11;
        }
        int i26 = 16;
        if ((i11 & 48) == 0) {
            if (rVar.d(f6)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i13 |= i24;
        }
        int i27 = 128;
        if ((i11 & 384) == 0) {
            if (rVar.f(j6)) {
                i23 = 256;
            } else {
                i23 = 128;
            }
            i13 |= i23;
        }
        int i28 = 1024;
        if ((i11 & 3072) == 0) {
            if (rVar.f(j10)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i13 |= i22;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.f(j11)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i13 |= i21;
        }
        if ((196608 & i11) == 0) {
            if (rVar.i(nVar)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i13 |= i20;
        }
        if ((i11 & 1572864) == 0) {
            if (rVar.g(e10)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        if ((i11 & 12582912) == 0) {
            if (rVar.d(f10)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i13 |= i18;
        }
        if ((i11 & 100663296) == 0) {
            if (rVar.g(abstractC0427k)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i13 |= i17;
        }
        if ((i11 & 805306368) == 0) {
            if (rVar.g(abstractC0425i)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i13 |= i16;
        }
        if ((i12 & 6) == 0) {
            if (rVar.e(i10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i12 | i15;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (rVar.h(z10)) {
                i26 = 32;
            }
            i14 |= i26;
        }
        if ((i12 & 384) == 0) {
            if (rVar.i(nVar2)) {
                i27 = 256;
            }
            i14 |= i27;
        }
        if ((i12 & 3072) == 0) {
            if (rVar.i(nVar3)) {
                i28 = 2048;
            }
            i14 |= i28;
        }
        int i29 = i14;
        if ((i13 & 306783379) == 306783378 && (i29 & 1171) == 1170 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(1019460550);
            if ((i13 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i13 & 1879048192) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = z11 | z12;
            if ((i13 & 234881024) == 67108864) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = z15 | z13;
            if ((i29 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z17 = z16 | z14;
            Object K10 = rVar.K();
            if (z17 || K10 == C1723m.f22654Y) {
                K10 = new U(f6, abstractC0425i, abstractC0427k, i10);
                rVar.h0(K10);
            }
            E0.N n10 = (E0.N) K10;
            rVar.t(false);
            rVar.W(-1323940314);
            int i30 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i31 = androidx.compose.ui.layout.a.i(abstractC4326r);
            boolean z18 = rVar.f22696a instanceof AbstractC1707e;
            if (z18) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                C0581j c0581j = C0583l.f5808f;
                U3.f.n0(rVar, n10, c0581j);
                C0581j c0581j2 = C0583l.f5807e;
                U3.f.n0(rVar, p10, c0581j2);
                C0581j c0581j3 = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i30))) {
                    AbstractC6463a.q(i30, rVar, i30, c0581j3);
                }
                AbstractC6463a.r(0, i31, new Z.L0(rVar), rVar, 2058660585);
                C4323o c4323o = C4323o.f37719b;
                AbstractC4326r h10 = androidx.compose.ui.layout.a.h(c4323o, "navigationIcon");
                float f11 = f19887c;
                AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(h10, f11, 0.0f, 0.0f, 0.0f, 14);
                rVar.W(733328855);
                C4318j c4318j = C4310b.f37693Y;
                E0.N c10 = AbstractC0434s.c(c4318j, false, rVar);
                rVar.W(-1323940314);
                int i32 = rVar.P;
                AbstractC1732q0 p11 = rVar.p();
                C3288a i33 = androidx.compose.ui.layout.a.i(v10);
                if (z18) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, c10, c0581j);
                    U3.f.n0(rVar, p11, c0581j2);
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i32))) {
                        AbstractC6463a.q(i32, rVar, i32, c0581j3);
                    }
                    AbstractC6463a.r(0, i33, new Z.L0(rVar), rVar, 2058660585);
                    Z.O o10 = Z0.f19875a;
                    A7.b.k(R.a.q(j6, o10), nVar2, rVar, (i29 >> 3) & 112);
                    AbstractC6463a.v(rVar, false, true, false, false);
                    AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(androidx.compose.ui.layout.a.h(c4323o, "title"), f11, 0.0f, 2);
                    if (z10) {
                        S s10 = S.f19622Z;
                        AtomicInteger atomicInteger = L0.l.f10412a;
                        abstractC4326r2 = new ClearAndSetSemanticsElement(s10);
                    } else {
                        abstractC4326r2 = c4323o;
                    }
                    AbstractC4326r m10 = androidx.compose.ui.graphics.a.m(t10.g(abstractC4326r2), 0.0f, 0.0f, f10, 0.0f, 0.0f, 0L, null, false, 131067);
                    rVar.W(733328855);
                    E0.N c11 = AbstractC0434s.c(c4318j, false, rVar);
                    rVar.W(-1323940314);
                    int i34 = rVar.P;
                    AbstractC1732q0 p12 = rVar.p();
                    C3288a i35 = androidx.compose.ui.layout.a.i(m10);
                    if (z18) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, c11, c0581j);
                        U3.f.n0(rVar, p12, c0581j2);
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i34))) {
                            AbstractC6463a.q(i34, rVar, i34, c0581j3);
                        }
                        AbstractC6463a.r(0, i35, new Z.L0(rVar), rVar, 2058660585);
                        int i36 = i13 >> 9;
                        r9.y.s(j10, e10, nVar, rVar, (i36 & 14) | ((i13 >> 15) & 112) | (i36 & 896));
                        AbstractC6463a.v(rVar, false, true, false, false);
                        AbstractC4326r v11 = androidx.compose.foundation.layout.a.v(androidx.compose.ui.layout.a.h(c4323o, "actionIcons"), 0.0f, 0.0f, f11, 0.0f, 11);
                        rVar.W(733328855);
                        E0.N c12 = AbstractC0434s.c(c4318j, false, rVar);
                        rVar.W(-1323940314);
                        int i37 = rVar.P;
                        AbstractC1732q0 p13 = rVar.p();
                        C3288a i38 = androidx.compose.ui.layout.a.i(v11);
                        if (z18) {
                            rVar.Z();
                            if (rVar.f22695O) {
                                rVar.o(c0582k);
                            } else {
                                rVar.k0();
                            }
                            U3.f.n0(rVar, c12, c0581j);
                            U3.f.n0(rVar, p13, c0581j2);
                            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i37))) {
                                AbstractC6463a.q(i37, rVar, i37, c0581j3);
                            }
                            i38.invoke(new Z.L0(rVar), rVar, 0);
                            rVar.W(2058660585);
                            A7.b.k(R.a.q(j11, o10), nVar3, rVar, (i29 >> 6) & 112);
                            AbstractC6463a.v(rVar, false, true, false, false);
                            AbstractC6463a.u(rVar, false, true, false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v12 = rVar.v();
        if (v12 != null) {
            v12.f22739d = new V(abstractC4326r, f6, j6, j10, j11, nVar, e10, f10, abstractC0427k, abstractC0425i, i10, z10, nVar2, nVar3, i11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(o4 o4Var, float f6, C6736z c6736z, AbstractC6714o abstractC6714o, AbstractC4825e abstractC4825e) {
        Z z10;
        int i10;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        float h10;
        C1718j0 c1718j0;
        float f10;
        if (abstractC4825e instanceof Z) {
            Z z11 = (Z) abstractC4825e;
            int i11 = z11.f19874j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z11.f19874j0 = i11 - Integer.MIN_VALUE;
                z10 = z11;
                Z z12 = z10;
                Object obj = z12.f19873i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = z12.f19874j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            yVar2 = (kotlin.jvm.internal.y) z12.f19870Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            yVar = yVar2;
                            return new Z0.p(AbstractC4828h.l(0.0f, yVar.f37646Y));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.y yVar3 = z12.f19872h0;
                    abstractC6714o = z12.f19871Z;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    yVar = yVar3;
                    o4Var = (o4) z12.f19870Y;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (o4Var.a() >= 0.01f && o4Var.a() != 1.0f) {
                        ?? obj2 = new Object();
                        obj2.f37646Y = f6;
                        yVar = obj2;
                        if (c6736z != null) {
                            yVar = obj2;
                            if (Math.abs(f6) > 1.0f) {
                                Object obj3 = new Object();
                                C6716p b10 = AbstractC6696f.b(0.0f, f6, 28);
                                C3281g c3281g = new C3281g(obj3, o4Var, obj2, 16);
                                z12.f19870Y = o4Var;
                                z12.f19871Z = abstractC6714o;
                                z12.f19872h0 = obj2;
                                z12.f19874j0 = 1;
                                yVar = obj2;
                                if (AbstractC6696f.e(b10, c6736z, false, c3281g, z12) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                        }
                    } else {
                        return new Z0.p(Z0.p.f22813b);
                    }
                }
                if (abstractC6714o != null && o4Var.f20268c.h() < 0.0f) {
                    h10 = o4Var.f20268c.h();
                    c1718j0 = o4Var.f20266a;
                    if (h10 > c1718j0.h()) {
                        C6716p b11 = AbstractC6696f.b(o4Var.f20268c.h(), 0.0f, 30);
                        if (o4Var.a() < 0.5f) {
                            f10 = 0.0f;
                        } else {
                            f10 = c1718j0.h();
                        }
                        Float f11 = new Float(f10);
                        P p10 = new P(2, o4Var);
                        z12.f19870Y = yVar;
                        z12.f19871Z = null;
                        z12.f19872h0 = null;
                        z12.f19874j0 = 2;
                        if (AbstractC6696f.h(b11, f11, abstractC6714o, false, p10, z12, 4) != enumC5000a) {
                            yVar2 = yVar;
                            yVar = yVar2;
                        } else {
                            return enumC5000a;
                        }
                    }
                }
                return new Z0.p(AbstractC4828h.l(0.0f, yVar.f37646Y));
            }
        }
        z10 = new AbstractC5156c(abstractC4825e);
        Z z122 = z10;
        Object obj4 = z122.f19873i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = z122.f19874j0;
        if (i10 == 0) {
        }
        if (abstractC6714o != null) {
            h10 = o4Var.f20268c.h();
            c1718j0 = o4Var.f20266a;
            if (h10 > c1718j0.h()) {
            }
        }
        return new Z0.p(AbstractC4828h.l(0.0f, yVar.f37646Y));
    }

    public static final o4 h(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1801969826);
        Object[] objArr = new Object[0];
        i0.r rVar2 = o4.f20265d;
        rVar.W(1171243704);
        boolean d10 = rVar.d(-3.4028235E38f) | rVar.d(0.0f) | rVar.d(0.0f);
        Object K10 = rVar.K();
        if (d10 || K10 == C1723m.f22654Y) {
            K10 = new Y(-3.4028235E38f, 0.0f, 0.0f);
            rVar.h0(K10);
        }
        rVar.t(false);
        o4 o4Var = (o4) Ad.l.Y0(objArr, rVar2, (AbstractC6216a) K10, rVar, 4);
        rVar.t(false);
        return o4Var;
    }
}
