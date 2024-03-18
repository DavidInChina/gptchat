package H;

import A.C0043t;
import B.W0;
import E.C0426j;
import E.g0;
import E0.O;
import E0.o0;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import java.util.ArrayList;
import java.util.List;
import kf.C4288m;
import l0.AbstractC4311c;
import l0.AbstractC4312d;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ W0 f6682Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f6683Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f6684h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F f6685i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f6686j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0662k f6687k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6688l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6689m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4312d f6690n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4311c f6691o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f6692p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ C.q f6693q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(W0 w02, g0 g0Var, boolean z10, F f6, float f10, AbstractC0662k abstractC0662k, Df.q qVar, AbstractC6216a abstractC6216a, AbstractC4312d abstractC4312d, AbstractC4311c abstractC4311c, int i10) {
        super(2);
        A9.a aVar = L.f6584d;
        this.f6682Y = w02;
        this.f6683Z = g0Var;
        this.f6684h0 = z10;
        this.f6685i0 = f6;
        this.f6686j0 = f10;
        this.f6687k0 = abstractC0662k;
        this.f6688l0 = qVar;
        this.f6689m0 = abstractC6216a;
        this.f6690n0 = abstractC4312d;
        this.f6691o0 = abstractC4311c;
        this.f6692p0 = i10;
        this.f6693q0 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v37, types: [Cf.e] */
    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        W0 w02;
        int i10;
        int i11;
        int i12;
        int h10;
        long j6;
        int i13;
        int i14;
        Throwable th2;
        int i15;
        F f6;
        x xVar;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC4312d abstractC4312d;
        AbstractC4311c abstractC4311c;
        boolean z12;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        AbstractC4311c abstractC4311c2;
        AbstractC4312d abstractC4312d2;
        C4288m c4288m;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        C4288m c4288m2;
        int i34;
        v vVar;
        List list;
        List list2;
        List list3;
        v vVar2;
        boolean z14;
        W0 w03;
        W0 w04;
        int i35;
        int i36;
        boolean z15;
        C0659h c0659h;
        int i37;
        int i38;
        int i39;
        ArrayList arrayList;
        int i40;
        ArrayList arrayList2;
        int i41;
        C0659h c0659h2;
        int i42;
        float o10;
        boolean z16;
        int i43;
        int i44;
        int i45;
        int i46;
        C4288m c4288m3;
        int i47;
        w wVar = this;
        G.J j10 = (G.J) obj;
        long j11 = ((Z0.a) obj2).f22782a;
        W0 w05 = W0.f1213Y;
        W0 w06 = wVar.f6682Y;
        if (w06 == w05) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            w02 = w05;
        } else {
            w02 = W0.f1214Z;
        }
        androidx.compose.foundation.a.e(j11, w02);
        g0 g0Var = wVar.f6683Z;
        if (z10) {
            G.K k10 = (G.K) j10;
            i10 = k10.f5435Z.a0(g0Var.b(k10.f5435Z.getLayoutDirection()));
        } else {
            G.K k11 = (G.K) j10;
            i10 = k11.f5435Z.a0(androidx.compose.foundation.layout.a.h(g0Var, k11.f5435Z.getLayoutDirection()));
        }
        if (z10) {
            G.K k12 = (G.K) j10;
            i11 = k12.f5435Z.a0(g0Var.c(k12.f5435Z.getLayoutDirection()));
        } else {
            G.K k13 = (G.K) j10;
            i11 = k13.f5435Z.a0(androidx.compose.foundation.layout.a.g(g0Var, k13.f5435Z.getLayoutDirection()));
        }
        G.K k14 = (G.K) j10;
        int a02 = k14.f5435Z.a0(g0Var.d());
        float a5 = g0Var.a();
        o0 o0Var = k14.f5435Z;
        int a03 = o0Var.a0(a5);
        int i48 = a02 + a03;
        int i49 = i10 + i11;
        if (z10) {
            i12 = i48;
        } else {
            i12 = i49;
        }
        boolean z17 = wVar.f6684h0;
        if (z10 && !z17) {
            i11 = a02;
        } else if (z10 && z17) {
            i11 = a03;
        } else if (!z10 && !z17) {
            i11 = i10;
        }
        int i50 = i12 - i11;
        int i51 = i11;
        long n12 = A7.b.n1(j11, -i49, -i48);
        F f10 = wVar.f6685i0;
        f10.f6561p = j10;
        A a10 = f10.f6549d;
        int a04 = o0Var.a0(wVar.f6686j0);
        if (z10) {
            h10 = Z0.a.g(j11) - i48;
        } else {
            h10 = Z0.a.h(j11) - i49;
        }
        int i52 = h10;
        if (z17 && i52 <= 0) {
            if (!z10) {
                i10 += i52;
            }
            if (z10) {
                i47 = a02 + i52;
            } else {
                i47 = a02;
            }
            j6 = kotlin.jvm.internal.m.c(i10, i47);
        } else {
            j6 = kotlin.jvm.internal.m.c(i10, a02);
        }
        ((C0661j) wVar.f6687k0).getClass();
        if (w06 == w05) {
            i13 = Z0.a.h(n12);
        } else {
            i13 = i52;
        }
        if (w06 != w05) {
            i14 = Z0.a.g(n12);
        } else {
            i14 = i52;
        }
        f10.f6570y = A7.b.n(0, i13, 0, i14, 5);
        t tVar = (t) wVar.f6688l0.mo122invoke();
        int i53 = i52 + a04;
        int i54 = AbstractC3893i.f35891e;
        AbstractC3893i d10 = io.sentry.hints.i.d();
        try {
            AbstractC3893i j12 = d10.j();
            try {
                int h11 = a10.f6527b.h();
                int x10 = Gi.e.x(h11, tVar, a10.f6530e);
                if (h11 != x10) {
                    a10.f6527b.i(x10);
                    a10.f6531f.b(h11);
                }
                int q10 = kotlin.jvm.internal.m.q(f10, i53);
                AbstractC3893i.p(j12);
                d10.c();
                List i55 = Gi.e.i(tVar, f10.f6571z, f10.f6566u);
                int intValue = ((Number) wVar.f6689m0.mo122invoke()).intValue();
                List list4 = i55;
                int i56 = i51;
                F.u uVar = new F.u(j10, j11, i49, i48, 1);
                if (i56 >= 0) {
                    if (i50 >= 0) {
                        if (i53 < 0) {
                            i15 = 0;
                        } else {
                            i15 = i53;
                        }
                        List list5 = kf.v.f37483Y;
                        W0 w07 = wVar.f6682Y;
                        int i57 = wVar.f6692p0;
                        int i58 = intValue;
                        if (i58 <= 0) {
                            xVar = new x(list5, i52, a04, i50, w07, -i56, i52 + i50, i57, null, null, 0.0f, 0, false, (O) uVar.invoke(Integer.valueOf(Z0.a.j(n12)), Integer.valueOf(Z0.a.i(n12)), u.f6669Z), false);
                            f6 = f10;
                            z11 = false;
                        } else {
                            F.u uVar2 = uVar;
                            if (w07 == w05) {
                                i16 = Z0.a.h(n12);
                            } else {
                                i16 = i52;
                            }
                            if (w07 != w05) {
                                i17 = Z0.a.g(n12);
                            } else {
                                i17 = i52;
                            }
                            F f11 = f10;
                            long n10 = A7.b.n(0, i16, 0, i17, 5);
                            int i59 = q10;
                            while (x10 > 0 && i59 > 0) {
                                x10--;
                                i59 -= i15;
                            }
                            int i60 = i59 * (-1);
                            if (x10 >= i58) {
                                x10 = i58 - 1;
                                i60 = 0;
                            }
                            C4288m c4288m4 = new C4288m();
                            int i61 = -i56;
                            if (a04 < 0) {
                                i19 = a04;
                                i18 = i19;
                            } else {
                                i18 = a04;
                                i19 = 0;
                            }
                            int i62 = i61 + i19;
                            int i63 = x10;
                            int i64 = i60 + i62;
                            int i65 = 0;
                            while (true) {
                                abstractC4312d = wVar.f6690n0;
                                abstractC4311c = wVar.f6691o0;
                                z12 = wVar.f6684h0;
                                if (i64 >= 0 || i63 <= 0) {
                                    break;
                                }
                                i63--;
                                int i66 = i65;
                                int i67 = i62;
                                C4288m c4288m5 = c4288m4;
                                int i68 = i15;
                                W0 w08 = w07;
                                int i69 = i52;
                                C0659h J10 = AbstractC4828h.J(j10, i63, n10, tVar, j6, w08, abstractC4311c, abstractC4312d, o0Var.getLayoutDirection(), z12, i69);
                                c4288m5.add(0, J10);
                                i65 = Math.max(i66, J10.f6633k);
                                i64 += i68;
                                c4288m4 = c4288m5;
                                i15 = i68;
                                i52 = i69;
                                i62 = i67;
                                i58 = i58;
                                uVar2 = uVar2;
                                i57 = i57;
                                w07 = w08;
                                list4 = list4;
                                i56 = i56;
                                f11 = f11;
                                wVar = this;
                            }
                            int i70 = i62;
                            C4288m c4288m6 = c4288m4;
                            int i71 = i58;
                            F.u uVar3 = uVar2;
                            int i72 = i57;
                            W0 w09 = w07;
                            int i73 = i64;
                            List list6 = list4;
                            int i74 = i56;
                            int i75 = i52;
                            F f12 = f11;
                            int i76 = i65;
                            int i77 = i15;
                            int i78 = i70;
                            if (i73 < i78) {
                                i20 = i78;
                            } else {
                                i20 = i73;
                            }
                            int i79 = i20 - i78;
                            int i80 = i75 + i50;
                            if (i80 < 0) {
                                i21 = 0;
                            } else {
                                i21 = i80;
                            }
                            int i81 = -i79;
                            int i82 = 0;
                            boolean z18 = false;
                            int i83 = i63;
                            while (i82 < c4288m6.f37476h0) {
                                if (i81 >= i21) {
                                    c4288m6.s(i82);
                                    z18 = true;
                                } else {
                                    i83++;
                                    i81 += i77;
                                    i82++;
                                }
                            }
                            int i84 = i76;
                            boolean z19 = z18;
                            int i85 = i63;
                            int i86 = i71;
                            int i87 = i79;
                            int i88 = i81;
                            while (true) {
                                if (i83 < i86) {
                                    if (i88 >= i21 && i88 > 0 && !c4288m6.isEmpty()) {
                                        i22 = i86;
                                        i23 = i84;
                                        i24 = i88;
                                        z13 = z12;
                                        abstractC4311c2 = abstractC4311c;
                                        abstractC4312d2 = abstractC4312d;
                                        c4288m = c4288m6;
                                        i25 = i83;
                                        i27 = i75;
                                        i26 = i77;
                                        break;
                                    }
                                    int i89 = i86;
                                    C4288m c4288m7 = c4288m6;
                                    int i90 = i83;
                                    int i91 = i21;
                                    int i92 = i84;
                                    int i93 = i88;
                                    int i94 = i78;
                                    int i95 = i75;
                                    AbstractC4312d abstractC4312d3 = abstractC4312d;
                                    AbstractC4312d abstractC4312d4 = abstractC4312d;
                                    int i96 = i77;
                                    boolean z20 = z12;
                                    AbstractC4311c abstractC4311c3 = abstractC4311c;
                                    C0659h J11 = AbstractC4828h.J(j10, i83, n10, tVar, j6, w09, abstractC4311c, abstractC4312d3, o0Var.getLayoutDirection(), z12, i95);
                                    int i97 = i89 - 1;
                                    if (i90 == i97) {
                                        i46 = i95;
                                    } else {
                                        i46 = i96;
                                    }
                                    i88 = i93 + i46;
                                    if (i88 <= i94 && i90 != i97) {
                                        i87 -= i96;
                                        i85 = i90 + 1;
                                        c4288m3 = c4288m7;
                                        i84 = i92;
                                        z19 = true;
                                    } else {
                                        int max = Math.max(i92, J11.f6633k);
                                        c4288m3 = c4288m7;
                                        c4288m3.addLast(J11);
                                        i84 = max;
                                    }
                                    i83 = i90 + 1;
                                    i75 = i95;
                                    i78 = i94;
                                    c4288m6 = c4288m3;
                                    i77 = i96;
                                    z12 = z20;
                                    i21 = i91;
                                    abstractC4312d = abstractC4312d4;
                                    abstractC4311c = abstractC4311c3;
                                    i86 = i89;
                                } else {
                                    i22 = i86;
                                    i23 = i84;
                                    i24 = i88;
                                    z13 = z12;
                                    abstractC4311c2 = abstractC4311c;
                                    abstractC4312d2 = abstractC4312d;
                                    c4288m = c4288m6;
                                    i25 = i83;
                                    i26 = i77;
                                    i27 = i75;
                                    break;
                                }
                            }
                            if (i24 < i27) {
                                int i98 = i27 - i24;
                                int i99 = i87 - i98;
                                int i100 = i24 + i98;
                                int i101 = i23;
                                int i102 = i99;
                                int i103 = i74;
                                while (i102 < i103 && i85 > 0) {
                                    i85--;
                                    int i104 = i27;
                                    int i105 = i22;
                                    C4288m c4288m8 = c4288m;
                                    C0659h J12 = AbstractC4828h.J(j10, i85, n10, tVar, j6, w09, abstractC4311c2, abstractC4312d2, o0Var.getLayoutDirection(), z13, i104);
                                    c4288m8.add(0, J12);
                                    i101 = Math.max(i101, J12.f6633k);
                                    i102 += i26;
                                    i27 = i104;
                                    c4288m = c4288m8;
                                    i103 = i103;
                                    i25 = i25;
                                    i22 = i105;
                                }
                                i30 = i25;
                                i29 = i22;
                                i31 = i103;
                                int i106 = i102;
                                i34 = i101;
                                i28 = i27;
                                c4288m2 = c4288m;
                                if (i106 < 0) {
                                    i32 = i100 + i106;
                                    i33 = 0;
                                } else {
                                    i32 = i100;
                                    i33 = i106;
                                }
                            } else {
                                i30 = i25;
                                i29 = i22;
                                i28 = i27;
                                c4288m2 = c4288m;
                                i31 = i74;
                                i32 = i24;
                                i34 = i23;
                                i33 = i87;
                            }
                            if (i33 >= 0) {
                                int i107 = -i33;
                                C0659h c0659h3 = (C0659h) c4288m2.first();
                                if (i31 > 0 || i18 < 0) {
                                    int i108 = c4288m2.f37476h0;
                                    int i109 = 0;
                                    while (i109 < i108 && i33 != 0 && i26 <= i33 && i109 != AbstractC4344b.u0(c4288m2)) {
                                        i33 -= i26;
                                        i109++;
                                        c0659h3 = (C0659h) c4288m2.get(i109);
                                    }
                                }
                                int i110 = i33;
                                C0659h c0659h4 = c0659h3;
                                v vVar3 = r11;
                                int i111 = i34;
                                int i112 = i26;
                                int i113 = i32;
                                v vVar4 = new v(j10, n10, tVar, j6, w09, abstractC4311c2, abstractC4312d2, z13, i28, 1);
                                int max2 = Math.max(0, i85 - i72);
                                int i114 = i85 - 1;
                                if (max2 <= i114) {
                                    list = null;
                                    while (true) {
                                        if (list == null) {
                                            list = new ArrayList();
                                        }
                                        vVar = vVar3;
                                        list.add(vVar.invoke(Integer.valueOf(i114)));
                                        if (i114 == max2) {
                                            break;
                                        }
                                        i114--;
                                        vVar3 = vVar;
                                    }
                                } else {
                                    vVar = vVar3;
                                    list = null;
                                }
                                int size = list6.size();
                                int i115 = 0;
                                while (i115 < size) {
                                    List list7 = list6;
                                    int intValue2 = ((Number) list7.get(i115)).intValue();
                                    if (intValue2 < max2) {
                                        if (list == null) {
                                            list = new ArrayList();
                                        }
                                        list.add(vVar.invoke(Integer.valueOf(intValue2)));
                                    }
                                    i115++;
                                    list6 = list7;
                                }
                                List list8 = list6;
                                if (list == null) {
                                    list2 = list5;
                                } else {
                                    list2 = list;
                                }
                                int size2 = list2.size();
                                int i116 = i111;
                                for (int i117 = 0; i117 < size2; i117++) {
                                    i116 = Math.max(i116, ((C0659h) list2.get(i117)).f6633k);
                                }
                                int i118 = ((C0659h) c4288m2.last()).f6623a;
                                v vVar5 = r7;
                                int i119 = i116;
                                List list9 = list2;
                                List list10 = list8;
                                v vVar6 = new v(j10, n10, tVar, j6, w09, abstractC4311c2, abstractC4312d2, z13, i28, 0);
                                int min = Math.min(i118 + i72, i29 - 1);
                                int i120 = i118 + 1;
                                if (i120 <= min) {
                                    list3 = null;
                                    while (true) {
                                        if (list3 == null) {
                                            list3 = new ArrayList();
                                        }
                                        vVar2 = vVar5;
                                        list3.add(vVar2.invoke(Integer.valueOf(i120)));
                                        if (i120 == min) {
                                            break;
                                        }
                                        i120++;
                                        vVar5 = vVar2;
                                        list3 = list3;
                                    }
                                } else {
                                    vVar2 = vVar5;
                                    list3 = null;
                                }
                                int size3 = list10.size();
                                int i121 = 0;
                                List list11 = list3;
                                while (i121 < size3) {
                                    List list12 = list10;
                                    int intValue3 = ((Number) list12.get(i121)).intValue();
                                    int i122 = i29;
                                    if (min + 1 <= intValue3 && intValue3 < i122) {
                                        if (list11 == null) {
                                            list11 = new ArrayList();
                                        }
                                        list11.add(vVar2.invoke(Integer.valueOf(intValue3)));
                                    }
                                    i121++;
                                    list10 = list12;
                                    i29 = i122;
                                    list11 = list11;
                                }
                                int i123 = i29;
                                List list13 = list11;
                                if (list11 == null) {
                                    list13 = list5;
                                }
                                int size4 = list13.size();
                                int i124 = i119;
                                for (int i125 = 0; i125 < size4; i125++) {
                                    i124 = Math.max(i124, ((C0659h) list13.get(i125)).f6633k);
                                }
                                if (AbstractC3557B.K(c0659h4, c4288m2.first()) && list9.isEmpty() && list13.isEmpty()) {
                                    w04 = w05;
                                    z14 = true;
                                    w03 = w09;
                                } else {
                                    w04 = w05;
                                    w03 = w09;
                                    z14 = false;
                                }
                                if (w03 == w04) {
                                    i35 = i124;
                                } else {
                                    i35 = i113;
                                }
                                int t02 = A7.b.t0(i35, n12);
                                if (w03 == w04) {
                                    i124 = i113;
                                }
                                int s02 = A7.b.s0(i124, n12);
                                int i126 = i28;
                                if (w03 == w04) {
                                    i36 = s02;
                                } else {
                                    i36 = t02;
                                }
                                if (i113 < Math.min(i36, i126)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (!z15 || i107 == 0) {
                                    int i127 = i107;
                                    ArrayList arrayList3 = new ArrayList(list13.size() + list9.size() + c4288m2.r());
                                    if (z15) {
                                        if (list9.isEmpty() && list13.isEmpty()) {
                                            int r10 = c4288m2.r();
                                            int[] iArr = new int[r10];
                                            for (int i128 = 0; i128 < r10; i128++) {
                                                iArr[i128] = i126;
                                            }
                                            int[] iArr2 = new int[r10];
                                            int i129 = 0;
                                            while (i129 < r10) {
                                                iArr2[i129] = 0;
                                                i129++;
                                                arrayList3 = arrayList3;
                                            }
                                            ArrayList arrayList4 = arrayList3;
                                            int i130 = i18;
                                            c0659h = c0659h4;
                                            C0426j c0426j = new C0426j(o0Var.J(i130), false, null);
                                            Z0.l lVar = Z0.l.f22805Y;
                                            if (w03 == w04) {
                                                arrayList = arrayList4;
                                                i38 = i130;
                                                i43 = i36;
                                                i44 = i126;
                                                i37 = i113;
                                                i39 = s02;
                                                c0426j.b(j10, i36, iArr, lVar, iArr2);
                                            } else {
                                                arrayList = arrayList4;
                                                i43 = i36;
                                                i37 = i113;
                                                i38 = i130;
                                                i39 = s02;
                                                i44 = i126;
                                                c0426j.b(j10, i43, iArr, lVar, iArr2);
                                            }
                                            Cf.g k32 = kf.q.k3(iArr2);
                                            if (z13) {
                                                k32 = new Cf.e(k32.f3107Z, k32.f3106Y, -k32.f3108h0);
                                            }
                                            int i131 = k32.f3106Y;
                                            int i132 = k32.f3107Z;
                                            int i133 = k32.f3108h0;
                                            if ((i133 > 0 && i131 <= i132) || (i133 < 0 && i132 <= i131)) {
                                                while (true) {
                                                    int i134 = iArr2[i131];
                                                    if (!z13) {
                                                        i45 = i131;
                                                    } else {
                                                        i45 = (r10 - i131) - 1;
                                                    }
                                                    C0659h c0659h5 = (C0659h) c4288m2.get(i45);
                                                    if (z13) {
                                                        i134 = (i43 - i134) - c0659h5.f6624b;
                                                    }
                                                    c0659h5.a(i134, t02, i39);
                                                    arrayList.add(c0659h5);
                                                    if (i131 == i132) {
                                                        break;
                                                    }
                                                    i131 += i133;
                                                }
                                            }
                                            i40 = i44;
                                        } else {
                                            throw new IllegalArgumentException("No extra pages".toString());
                                        }
                                    } else {
                                        i40 = i126;
                                        c0659h = c0659h4;
                                        i37 = i113;
                                        i38 = i18;
                                        arrayList = arrayList3;
                                        i39 = s02;
                                        int size5 = list9.size();
                                        int i135 = i127;
                                        for (int i136 = 0; i136 < size5; i136++) {
                                            C0659h c0659h6 = (C0659h) list9.get(i136);
                                            i135 -= i53;
                                            c0659h6.a(i135, t02, i39);
                                            arrayList.add(c0659h6);
                                        }
                                        int r11 = c4288m2.r();
                                        for (int i137 = 0; i137 < r11; i137++) {
                                            C0659h c0659h7 = (C0659h) c4288m2.get(i137);
                                            c0659h7.a(i127, t02, i39);
                                            arrayList.add(c0659h7);
                                            i127 += i53;
                                        }
                                        int size6 = list13.size();
                                        for (int i138 = 0; i138 < size6; i138++) {
                                            C0659h c0659h8 = (C0659h) list13.get(i138);
                                            c0659h8.a(i127, t02, i39);
                                            arrayList.add(c0659h8);
                                            i127 += i53;
                                        }
                                    }
                                    if (z14) {
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = new ArrayList(arrayList.size());
                                        int size7 = arrayList.size();
                                        for (int i139 = 0; i139 < size7; i139++) {
                                            Object obj3 = arrayList.get(i139);
                                            C0659h c0659h9 = (C0659h) obj3;
                                            if (c0659h9.f6623a >= ((C0659h) c4288m2.first()).f6623a) {
                                                if (c0659h9.f6623a <= ((C0659h) c4288m2.last()).f6623a) {
                                                    arrayList2.add(obj3);
                                                }
                                            }
                                        }
                                    }
                                    if (w03 == w04) {
                                        i41 = i39;
                                    } else {
                                        i41 = t02;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        c0659h2 = null;
                                    } else {
                                        Object obj4 = arrayList2.get(0);
                                        int i140 = ((C0659h) obj4).f6635m;
                                        C.q qVar = this.f6693q0;
                                        float f13 = -Math.abs(A7.b.f0(i41, i31, i50, i112, i140, qVar));
                                        int u02 = AbstractC4344b.u0(arrayList2);
                                        if (1 <= u02) {
                                            int i141 = 1;
                                            Object obj5 = obj4;
                                            while (true) {
                                                Object obj6 = arrayList2.get(i141);
                                                float f14 = -Math.abs(A7.b.f0(i41, i31, i50, i112, ((C0659h) obj6).f6635m, qVar));
                                                obj4 = obj5;
                                                if (Float.compare(f13, f14) < 0) {
                                                    f13 = f14;
                                                    obj4 = obj6;
                                                }
                                                if (i141 == u02) {
                                                    break;
                                                }
                                                i141++;
                                                obj5 = obj4;
                                            }
                                        }
                                        c0659h2 = obj4;
                                    }
                                    C0659h c0659h10 = c0659h2;
                                    if (c0659h10 != null) {
                                        i42 = c0659h10.f6635m;
                                    } else {
                                        i42 = 0;
                                    }
                                    if (i112 == 0) {
                                        o10 = 0.0f;
                                    } else {
                                        o10 = com.google.android.gms.internal.play_billing.N.o((-i42) / i112, -0.5f, 0.5f);
                                    }
                                    float f15 = o10;
                                    f6 = f12;
                                    O o11 = (O) uVar3.invoke(Integer.valueOf(t02), Integer.valueOf(i39), new C0043t(arrayList, 5, f6.f6543A));
                                    if (i30 >= i123 && i37 <= i40) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    xVar = new x(arrayList2, i40, i38, i50, w03, i61, i80, i72, c0659h, c0659h10, f15, i110, z16, o11, z19);
                                    z11 = false;
                                } else {
                                    throw new IllegalStateException(android.gov.nist.core.a.e("non-zero pagesScrollOffset=", i107).toString());
                                }
                            } else {
                                throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
                            }
                        }
                        f6.f(xVar, z11);
                        return xVar;
                    }
                    throw new IllegalArgumentException("negative afterContentPadding".toString());
                }
                throw new IllegalArgumentException("negative beforeContentPadding".toString());
            } catch (Throwable th3) {
                try {
                    AbstractC3893i.p(j12);
                    throw th3;
                } catch (Throwable th4) {
                    th2 = th4;
                    d10.c();
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }
}
