package G0;

import android.gov.nist.core.Separators;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.HashSet;
import l0.AbstractC4324p;
import l0.AbstractC4325q;
import m.C4528h;

/* renamed from: G0.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0572a0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.node.a f5700a;

    /* renamed from: b  reason: collision with root package name */
    public final C0595y f5701b;

    /* renamed from: c  reason: collision with root package name */
    public g0 f5702c;

    /* renamed from: d  reason: collision with root package name */
    public final w0 f5703d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC4325q f5704e;

    /* renamed from: f  reason: collision with root package name */
    public C2104h f5705f;

    /* renamed from: g  reason: collision with root package name */
    public C2104h f5706g;

    /* renamed from: h  reason: collision with root package name */
    public Z f5707h;

    public C0572a0(androidx.compose.ui.node.a aVar) {
        this.f5700a = aVar;
        C0595y c0595y = new C0595y(aVar);
        this.f5701b = c0595y;
        this.f5702c = c0595y;
        w0 w0Var = c0595y.f5846L0;
        this.f5703d = w0Var;
        this.f5704e = w0Var;
    }

    public static final void a(C0572a0 c0572a0, AbstractC4325q abstractC4325q, g0 g0Var) {
        C0595y c0595y;
        c0572a0.getClass();
        for (AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37724j0) {
            if (abstractC4325q2 == androidx.compose.ui.node.b.f24863a) {
                androidx.compose.ui.node.a E10 = c0572a0.f5700a.E();
                if (E10 != null) {
                    c0595y = E10.f24831B0.f5701b;
                } else {
                    c0595y = null;
                }
                g0Var.f5772p0 = c0595y;
                c0572a0.f5702c = g0Var;
                return;
            } else if ((abstractC4325q2.f37722h0 & 2) == 0) {
                abstractC4325q2.z0(g0Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [G0.e, l0.q] */
    public static AbstractC4325q b(AbstractC4324p abstractC4324p, AbstractC4325q abstractC4325q) {
        AbstractC4325q abstractC4325q2;
        if (abstractC4324p instanceof X) {
            abstractC4325q2 = ((X) abstractC4324p).j();
            abstractC4325q2.f37722h0 = AbstractC0579h.n(abstractC4325q2);
        } else {
            ?? abstractC4325q3 = new AbstractC4325q();
            abstractC4325q3.f37722h0 = AbstractC0579h.l(abstractC4324p);
            abstractC4325q3.f5726s0 = abstractC4324p;
            abstractC4325q3.f5728u0 = new HashSet();
            abstractC4325q2 = abstractC4325q3;
        }
        if (!abstractC4325q2.f37732r0) {
            abstractC4325q2.f37728n0 = true;
            AbstractC4325q abstractC4325q4 = abstractC4325q.f37725k0;
            if (abstractC4325q4 != null) {
                abstractC4325q4.f37724j0 = abstractC4325q2;
                abstractC4325q2.f37725k0 = abstractC4325q4;
            }
            abstractC4325q.f37725k0 = abstractC4325q2;
            abstractC4325q2.f37724j0 = abstractC4325q;
            return abstractC4325q2;
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    public static AbstractC4325q c(AbstractC4325q abstractC4325q) {
        boolean z10 = abstractC4325q.f37732r0;
        if (z10) {
            if (z10) {
                AbstractC0579h.i(abstractC4325q, -1, 2);
                abstractC4325q.y0();
                abstractC4325q.s0();
            } else {
                throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
            }
        }
        AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
        AbstractC4325q abstractC4325q3 = abstractC4325q.f37724j0;
        if (abstractC4325q2 != null) {
            abstractC4325q2.f37724j0 = abstractC4325q3;
            abstractC4325q.f37725k0 = null;
        }
        if (abstractC4325q3 != null) {
            abstractC4325q3.f37725k0 = abstractC4325q2;
            abstractC4325q.f37724j0 = null;
        }
        AbstractC3557B.Z(abstractC4325q3);
        return abstractC4325q3;
    }

    public static void h(AbstractC4324p abstractC4324p, AbstractC4324p abstractC4324p2, AbstractC4325q abstractC4325q) {
        if ((abstractC4324p instanceof X) && (abstractC4324p2 instanceof X)) {
            b0 b0Var = androidx.compose.ui.node.b.f24863a;
            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe", abstractC4325q);
            ((X) abstractC4324p2).m(abstractC4325q);
            if (abstractC4325q.f37732r0) {
                AbstractC0579h.k(abstractC4325q);
            } else {
                abstractC4325q.f37729o0 = true;
            }
        } else if (abstractC4325q instanceof C0576e) {
            C0576e c0576e = (C0576e) abstractC4325q;
            if (c0576e.f37732r0) {
                c0576e.B0();
            }
            c0576e.f5726s0 = abstractC4324p2;
            c0576e.f37722h0 = AbstractC0579h.l(abstractC4324p2);
            if (c0576e.f37732r0) {
                c0576e.A0(false);
            }
            if (abstractC4325q.f37732r0) {
                AbstractC0579h.k(abstractC4325q);
            } else {
                abstractC4325q.f37729o0 = true;
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public final boolean d(int i10) {
        if ((i10 & this.f5704e.f37723i0) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        for (AbstractC4325q abstractC4325q = this.f5704e; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.x0();
            if (abstractC4325q.f37728n0) {
                AbstractC0579h.h(abstractC4325q);
            }
            if (abstractC4325q.f37729o0) {
                AbstractC0579h.k(abstractC4325q);
            }
            abstractC4325q.f37728n0 = false;
            abstractC4325q.f37729o0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023c, code lost:
        r6 = r27;
        r3 = r3 + 1;
        r5 = r18;
        r7 = r19;
        r1 = r23;
        r2 = r24;
        r8 = r22;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
        if (r10[(r7 + 1) + r16] > r10[(r7 - 1) + r16]) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
        r23 = r1;
        r24 = r2;
        r27 = r6;
        r22 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
        if ((r17 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
        if (r2 > r3) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
        if (r2 == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
        if (r2 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0161, code lost:
        if (r11[(r2 + 1) + r16] >= r11[(r2 - 1) + r16]) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
        r4 = r11[(r2 - 1) + r16];
        r6 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016d, code lost:
        r4 = r11[(r2 + 1) + r16];
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
        r7 = r13 - ((r14 - r6) - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
        if (r3 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017b, code lost:
        if (r6 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
        r8 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0181, code lost:
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0182, code lost:
        if (r6 <= r9) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
        if (r7 <= r15) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
        if (r0.a(r6 - 1, r7 - 1) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
        r6 = r6 - 1;
        r7 = r7 - 1;
        r13 = r25;
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
        r11[r16 + r2] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
        if (r1 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a7, code lost:
        r13 = r17 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
        if (r13 < r5) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ab, code lost:
        if (r13 > r3) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
        if (r10[r16 + r13] < r6) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b3, code lost:
        r12[0] = r6;
        r1 = 1;
        r12[1] = r7;
        r12[2] = r4;
        r2 = 3;
        r12[3] = r8;
        r12[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022a, code lost:
        r2 = r2 + 2;
        r22 = r22;
        r27 = r27;
        r13 = r25;
        r14 = r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, C2104h c2104h, C2104h c2104h2, AbstractC4325q abstractC4325q, boolean z10) {
        int i11;
        C0572a0 c0572a0;
        int i12;
        int i13;
        int i14;
        C4528h c4528h;
        boolean z11;
        C4528h c4528h2;
        C4528h c4528h3;
        int i15;
        int i16;
        char c10;
        char c11;
        int i17;
        int i18;
        int i19;
        Z z12 = this.f5707h;
        if (z12 == null) {
            z12 = new Z(this, abstractC4325q, i10, c2104h, c2104h2, z10);
            this.f5707h = z12;
        } else {
            z12.f5692a = abstractC4325q;
            z12.f5693b = i10;
            z12.f5694c = c2104h;
            z12.f5695d = c2104h2;
            z12.f5696e = z10;
        }
        int i20 = c2104h.f25569h0 - i10;
        int i21 = c2104h2.f25569h0 - i10;
        int i22 = 1;
        int i23 = ((i20 + i21) + 1) / 2;
        C4528h c4528h4 = new C4528h(i23 * 3, 1);
        C4528h c4528h5 = new C4528h(i23 * 4, 1);
        c4528h5.s(0, i20, 0, i21);
        int i24 = (i23 * 2) + 1;
        int[] iArr = new int[i24];
        int[] iArr2 = new int[i24];
        int[] iArr3 = new int[5];
        while (c4528h5.f38769Y != 0) {
            int q10 = c4528h5.q();
            int q11 = c4528h5.q();
            int q12 = c4528h5.q();
            int q13 = c4528h5.q();
            int i25 = q12 - q13;
            int i26 = q10 - q11;
            if (i25 < i22 || i26 < i22) {
                i14 = i20;
                i13 = i21;
                i12 = i24;
            } else {
                int i27 = ((i25 + i26) + 1) / 2;
                int i28 = i24 / 2;
                int i29 = i28 + 1;
                iArr[i29] = q13;
                iArr2[i29] = q12;
                i12 = i24;
                int i30 = 0;
                while (i30 < i27) {
                    int i31 = i25 - i26;
                    int i32 = i27;
                    int i33 = i25;
                    if (Math.abs(i31) % 2 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i34 = -i30;
                    int i35 = i26;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i30) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i30) {
                                i14 = i20;
                                i13 = i21;
                            } else {
                                i14 = i20;
                                i13 = i21;
                            }
                            i18 = iArr[(i36 - 1) + i28];
                            i17 = i18 + 1;
                            int i37 = ((i17 - q13) + q11) - i36;
                            int i38 = (i30 == 0 && i17 == i18) ? i37 - 1 : i37;
                            c4528h3 = c4528h5;
                            i19 = i37;
                            while (i17 < q12 && i19 < q10 && z12.a(i17, i19)) {
                                i17++;
                                i19++;
                            }
                            iArr[i28 + i36] = i17;
                            boolean z13 = z11;
                            if (!z11) {
                                int i39 = i31 - i36;
                                c4528h2 = c4528h4;
                                if (i39 >= i34 + 1 && i39 <= i30 - 1 && iArr2[i28 + i39] <= i17) {
                                    iArr3[0] = i18;
                                    iArr3[1] = i38;
                                    iArr3[2] = i17;
                                    iArr3[3] = i19;
                                    iArr3[4] = 0;
                                    i16 = q10;
                                    i15 = q12;
                                    c10 = 1;
                                    c11 = 3;
                                    break;
                                }
                            } else {
                                c4528h2 = c4528h4;
                            }
                            i36 += 2;
                            c4528h5 = c4528h3;
                            i20 = i14;
                            i21 = i13;
                            z11 = z13;
                            c4528h4 = c4528h2;
                        } else {
                            i14 = i20;
                            i13 = i21;
                        }
                        i18 = iArr[i36 + 1 + i28];
                        i17 = i18;
                        int i372 = ((i17 - q13) + q11) - i36;
                        if (i30 == 0) {
                        }
                        c4528h3 = c4528h5;
                        i19 = i372;
                        while (i17 < q12) {
                            i17++;
                            i19++;
                        }
                        iArr[i28 + i36] = i17;
                        boolean z132 = z11;
                        if (!z11) {
                        }
                        i36 += 2;
                        c4528h5 = c4528h3;
                        i20 = i14;
                        i21 = i13;
                        z11 = z132;
                        c4528h4 = c4528h2;
                    }
                    if (AbstractC0579h.r(iArr3) > 0) {
                        int i40 = iArr3[c11];
                        int i41 = iArr3[c10];
                        int i42 = i40 - i41;
                        int i43 = iArr3[2];
                        int i44 = iArr3[0];
                        int i45 = i43 - i44;
                        if (i42 != i45) {
                            if (iArr3[4] != 0) {
                                c4528h4 = c4528h2;
                                c4528h4.r(i44, i41, AbstractC0579h.r(iArr3));
                            } else {
                                c4528h4 = c4528h2;
                                if (i42 > i45) {
                                    c4528h4.r(i44, i41 + 1, AbstractC0579h.r(iArr3));
                                } else {
                                    c4528h4.r(i44 + 1, i41, AbstractC0579h.r(iArr3));
                                }
                            }
                        } else {
                            c4528h4 = c4528h2;
                            c4528h4.r(i44, i41, i45);
                        }
                    } else {
                        c4528h4 = c4528h2;
                    }
                    c4528h = c4528h3;
                    c4528h.s(q13, iArr3[0], q11, iArr3[1]);
                    c4528h.s(iArr3[2], i15, iArr3[3], i16);
                    i24 = i12;
                    c4528h5 = c4528h;
                    i20 = i14;
                    i21 = i13;
                    i22 = 1;
                }
                i14 = i20;
                i13 = i21;
            }
            c4528h = c4528h5;
            i24 = i12;
            c4528h5 = c4528h;
            i20 = i14;
            i21 = i13;
            i22 = 1;
        }
        int i46 = i20;
        int i47 = i21;
        int i48 = c4528h4.f38769Y;
        if (i48 % 3 == 0) {
            if (i48 > 3) {
                i11 = 0;
                c4528h4.t(0, i48 - 3);
            } else {
                i11 = 0;
            }
            c4528h4.r(i46, i47, i11);
            int i49 = i11;
            int i50 = i49;
            int i51 = i50;
            while (i49 < c4528h4.f38769Y) {
                Object obj = c4528h4.f38770Z;
                int i52 = i49 + 2;
                int i53 = ((int[]) obj)[i49] - ((int[]) obj)[i52];
                int i54 = ((int[]) obj)[i49 + 1] - ((int[]) obj)[i52];
                int i55 = ((int[]) obj)[i52];
                i49 += 3;
                while (true) {
                    c0572a0 = z12.f5697f;
                    if (i50 < i53) {
                        AbstractC4325q abstractC4325q2 = z12.f5692a.f37725k0;
                        AbstractC3557B.Z(abstractC4325q2);
                        c0572a0.getClass();
                        if ((abstractC4325q2.f37722h0 & 2) != 0) {
                            g0 g0Var = abstractC4325q2.f37727m0;
                            AbstractC3557B.Z(g0Var);
                            g0 g0Var2 = g0Var.f5772p0;
                            g0 g0Var3 = g0Var.f5771o0;
                            AbstractC3557B.Z(g0Var3);
                            if (g0Var2 != null) {
                                g0Var2.f5771o0 = g0Var3;
                            }
                            g0Var3.f5772p0 = g0Var2;
                            a(c0572a0, z12.f5692a, g0Var3);
                        }
                        z12.f5692a = c(abstractC4325q2);
                        i50++;
                    }
                }
                while (i51 < i54) {
                    AbstractC4325q abstractC4325q3 = z12.f5692a;
                    Object[] objArr = z12.f5695d.f25567Y;
                    c0572a0.getClass();
                    AbstractC4325q b10 = b((AbstractC4324p) objArr[z12.f5693b + i51], abstractC4325q3);
                    z12.f5692a = b10;
                    if (z12.f5696e) {
                        AbstractC4325q abstractC4325q4 = b10.f37725k0;
                        AbstractC3557B.Z(abstractC4325q4);
                        g0 g0Var4 = abstractC4325q4.f37727m0;
                        AbstractC3557B.Z(g0Var4);
                        C g10 = AbstractC0579h.g(z12.f5692a);
                        if (g10 != null) {
                            D d10 = new D(c0572a0.f5700a, g10);
                            z12.f5692a.z0(d10);
                            a(c0572a0, z12.f5692a, d10);
                            d10.f5772p0 = g0Var4.f5772p0;
                            d10.f5771o0 = g0Var4;
                            g0Var4.f5772p0 = d10;
                        } else {
                            z12.f5692a.z0(g0Var4);
                        }
                        z12.f5692a.r0();
                        z12.f5692a.x0();
                        AbstractC0579h.h(z12.f5692a);
                    } else {
                        b10.f37728n0 = true;
                    }
                    i51++;
                }
                while (true) {
                    int i56 = i55 - 1;
                    if (i55 > 0) {
                        AbstractC4325q abstractC4325q5 = z12.f5692a.f37725k0;
                        AbstractC3557B.Z(abstractC4325q5);
                        z12.f5692a = abstractC4325q5;
                        C2104h c2104h3 = z12.f5694c;
                        int i57 = z12.f5693b;
                        AbstractC4324p abstractC4324p = (AbstractC4324p) c2104h3.f25567Y[i57 + i50];
                        AbstractC4324p abstractC4324p2 = (AbstractC4324p) z12.f5695d.f25567Y[i57 + i51];
                        if (!AbstractC3557B.K(abstractC4324p, abstractC4324p2)) {
                            AbstractC4325q abstractC4325q6 = z12.f5692a;
                            c0572a0.getClass();
                            h(abstractC4324p, abstractC4324p2, abstractC4325q6);
                        } else {
                            c0572a0.getClass();
                        }
                        i50++;
                        i51++;
                        i55 = i56;
                    }
                }
            }
            int i58 = i11;
            for (AbstractC4325q abstractC4325q7 = this.f5703d.f37724j0; abstractC4325q7 != null && abstractC4325q7 != androidx.compose.ui.node.b.f24863a; abstractC4325q7 = abstractC4325q7.f37724j0) {
                i58 |= abstractC4325q7.f37722h0;
                abstractC4325q7.f37723i0 = i58;
            }
            return;
        }
        throw new IllegalStateException("Array size not a multiple of 3".toString());
    }

    public final void g() {
        androidx.compose.ui.node.a aVar;
        C0595y c0595y;
        D d10;
        AbstractC4325q abstractC4325q = this.f5703d.f37724j0;
        g0 g0Var = this.f5701b;
        AbstractC4325q abstractC4325q2 = abstractC4325q;
        while (true) {
            aVar = this.f5700a;
            if (abstractC4325q2 == null) {
                break;
            }
            C g10 = AbstractC0579h.g(abstractC4325q2);
            if (g10 != null) {
                g0 g0Var2 = abstractC4325q2.f37727m0;
                if (g0Var2 != null) {
                    D d11 = (D) g0Var2;
                    C c10 = d11.f5592L0;
                    d11.f5592L0 = g10;
                    d10 = d11;
                    if (c10 != abstractC4325q2) {
                        n0 n0Var = d11.f5769F0;
                        d10 = d11;
                        if (n0Var != null) {
                            n0Var.invalidate();
                            d10 = d11;
                        }
                    }
                } else {
                    D d12 = new D(aVar, g10);
                    abstractC4325q2.z0(d12);
                    d10 = d12;
                }
                g0Var.f5772p0 = d10;
                d10.f5771o0 = g0Var;
                g0Var = d10;
            } else {
                abstractC4325q2.z0(g0Var);
            }
            abstractC4325q2 = abstractC4325q2.f37724j0;
        }
        androidx.compose.ui.node.a E10 = aVar.E();
        if (E10 != null) {
            c0595y = E10.f24831B0.f5701b;
        } else {
            c0595y = null;
        }
        g0Var.f5772p0 = c0595y;
        this.f5702c = g0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        AbstractC4325q abstractC4325q = this.f5704e;
        w0 w0Var = this.f5703d;
        if (abstractC4325q != w0Var) {
            while (true) {
                if (abstractC4325q == null || abstractC4325q == w0Var) {
                    break;
                }
                sb2.append(String.valueOf(abstractC4325q));
                if (abstractC4325q.f37725k0 == w0Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(Separators.COMMA);
                abstractC4325q = abstractC4325q.f37725k0;
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
