package F;

import B.W0;
import E.AbstractC0425i;
import E.AbstractC0427k;
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
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ J f4992Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f4993Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g0 f4994h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f4995i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f4996j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0427k f4997k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0425i f4998l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f4999m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4311c f5000n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4312d f5001o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(J j6, boolean z10, g0 g0Var, boolean z11, Df.q qVar, AbstractC0427k abstractC0427k, AbstractC0425i abstractC0425i, int i10, AbstractC4311c abstractC4311c, AbstractC4312d abstractC4312d) {
        super(2);
        this.f4992Y = j6;
        this.f4993Z = z10;
        this.f4994h0 = g0Var;
        this.f4995i0 = z11;
        this.f4996j0 = qVar;
        this.f4997k0 = abstractC0427k;
        this.f4998l0 = abstractC0425i;
        this.f4999m0 = i10;
        this.f5000n0 = abstractC4311c;
        this.f5001o0 = abstractC4312d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:280:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0636 A[LOOP:16: B:289:0x0634->B:290:0x0636, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0858  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [Cf.e] */
    @Override // wf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        W0 w02;
        int i10;
        int i11;
        int i12;
        float f6;
        int i13;
        long j6;
        float f10;
        J j10;
        z zVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c10;
        char c11;
        float f11;
        int i20;
        ArrayList arrayList;
        int i21;
        List list;
        int i22;
        int i23;
        ArrayList arrayList2;
        boolean z11;
        int i24;
        int i25;
        ArrayList arrayList3;
        int size;
        int i26;
        int size2;
        int i27;
        boolean z12;
        long j11;
        int i28;
        int t02;
        int s02;
        int i29;
        int i30;
        boolean z13;
        boolean z14;
        A a5;
        boolean z15;
        v vVar;
        int i31;
        int i32;
        ArrayList arrayList4;
        W0 w03;
        int[] iArr;
        n nVar;
        float f12;
        A a10;
        int i33;
        ?? r14;
        Object obj3;
        int min;
        int i34;
        A a11;
        Object obj4;
        int i35;
        int i36;
        W0 w04;
        int i37;
        G.J j12 = (G.J) obj;
        long j13 = ((Z0.a) obj2).f22782a;
        J j14 = this.f4992Y;
        boolean z16 = j14.f4871a;
        C c12 = j14.f4873c;
        boolean z17 = true;
        if (!z16 && !((G.K) j12).f5435Z.P()) {
            z10 = false;
        } else {
            z10 = true;
        }
        W0 w05 = W0.f1214Z;
        W0 w06 = W0.f1213Y;
        boolean z18 = this.f4993Z;
        if (z18) {
            w02 = w06;
        } else {
            w02 = w05;
        }
        androidx.compose.foundation.a.e(j13, w02);
        g0 g0Var = this.f4994h0;
        if (z18) {
            G.K k10 = (G.K) j12;
            i10 = k10.f5435Z.a0(g0Var.b(k10.f5435Z.getLayoutDirection()));
        } else {
            G.K k11 = (G.K) j12;
            i10 = k11.f5435Z.a0(androidx.compose.foundation.layout.a.h(g0Var, k11.f5435Z.getLayoutDirection()));
        }
        if (z18) {
            G.K k12 = (G.K) j12;
            i11 = k12.f5435Z.a0(g0Var.c(k12.f5435Z.getLayoutDirection()));
        } else {
            G.K k13 = (G.K) j12;
            i11 = k13.f5435Z.a0(androidx.compose.foundation.layout.a.g(g0Var, k13.f5435Z.getLayoutDirection()));
        }
        G.K k14 = (G.K) j12;
        int a02 = k14.f5435Z.a0(g0Var.d());
        float a12 = g0Var.a();
        o0 o0Var = k14.f5435Z;
        int a03 = o0Var.a0(a12);
        int i38 = a02 + a03;
        int i39 = i10 + i11;
        if (z18) {
            i12 = i38;
        } else {
            i12 = i39;
        }
        boolean z19 = this.f4995i0;
        if (z18 && !z19) {
            i11 = a02;
        } else if (z18 && z19) {
            i11 = a03;
        } else if (!z18 && !z19) {
            i11 = i10;
        }
        int i40 = i12 - i11;
        int i41 = i11;
        long n12 = A7.b.n1(j13, -i39, -i38);
        j14.f4878h = j12;
        p pVar = (p) this.f4996j0.mo122invoke();
        C0529c c0529c = pVar.f4949c;
        int h10 = Z0.a.h(n12);
        int g10 = Z0.a.g(n12);
        c0529c.f4916a.i(h10);
        c0529c.f4917b.i(g10);
        AbstractC0425i abstractC0425i = this.f4998l0;
        AbstractC0427k abstractC0427k = this.f4997k0;
        if (z18) {
            if (abstractC0427k != null) {
                f6 = abstractC0427k.a();
            } else {
                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
            }
        } else if (abstractC0425i != null) {
            f6 = abstractC0425i.a();
        } else {
            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
        }
        int a04 = o0Var.a0(f6);
        int i42 = pVar.f4948b.B().f5494b;
        if (z18) {
            i13 = Z0.a.g(j13) - i38;
        } else {
            i13 = Z0.a.h(j13) - i39;
        }
        if (z19 && i13 <= 0) {
            if (!z18) {
                i10 += i13;
            }
            if (z18) {
                i37 = a02 + i13;
            } else {
                i37 = a02;
            }
            j6 = kotlin.jvm.internal.m.c(i10, i37);
        } else {
            j6 = kotlin.jvm.internal.m.c(i10, a02);
        }
        int i43 = i13;
        v vVar2 = new v(n12, this.f4993Z, pVar, j12, i42, a04, this.f5000n0, this.f5001o0, this.f4995i0, i41, i40, j6, this.f4992Y);
        j14.f4889s = vVar2.f4980c;
        int i44 = AbstractC3893i.f35891e;
        AbstractC3893i d10 = io.sentry.hints.i.d();
        try {
            AbstractC3893i j15 = d10.j();
            int g11 = j14.g();
            int x10 = Gi.e.x(g11, pVar, c12.f4852d);
            if (g11 != x10) {
                c12.f4849a.i(x10);
                c12.f4853e.b(g11);
            }
            int h11 = c12.f4850b.h();
            AbstractC3893i.p(j15);
            d10.c();
            List i45 = Gi.e.i(pVar, j14.f4890t, j14.f4888r);
            if (!o0Var.P() && z10) {
                f10 = ((Number) j14.f4896z.f51346Z.getValue()).floatValue();
            } else {
                f10 = j14.f4877g;
            }
            float f13 = f10;
            boolean P = o0Var.P();
            z zVar2 = j14.f4872b;
            Ng.F f14 = j14.f4895y;
            if (f14 != null) {
                u uVar = new u(j12, j13, i39, i38, 0);
                if (i41 >= 0) {
                    if (i40 >= 0) {
                        kf.v vVar3 = kf.v.f37483Y;
                        C0538l c0538l = j14.f4887q;
                        boolean z20 = this.f4993Z;
                        if (i42 <= 0) {
                            int j16 = Z0.a.j(n12);
                            int i46 = Z0.a.i(n12);
                            c0538l.b(0, j16, i46, new ArrayList(), vVar2, z20, P, z10, f14);
                            O o10 = (O) uVar.invoke(Integer.valueOf(j16), Integer.valueOf(i46), y.f5002Z);
                            int i47 = -i41;
                            int i48 = i43 + i40;
                            if (z20) {
                                w04 = w06;
                            } else {
                                w04 = w05;
                            }
                            zVar = new z(null, 0, false, 0.0f, o10, 0.0f, false, vVar3, i47, i48, 0, w04, i40, a04);
                            j10 = j14;
                        } else {
                            if (x10 >= i42) {
                                x10 = i42 - 1;
                                h11 = 0;
                            }
                            int Y02 = AbstractC4344b.Y0(f13);
                            int i49 = h11 - Y02;
                            if (x10 == 0 && i49 < 0) {
                                Y02 += i49;
                                i14 = x10;
                                i49 = 0;
                            } else {
                                i14 = x10;
                            }
                            C4288m c4288m = new C4288m();
                            int i50 = -i41;
                            if (a04 < 0) {
                                i15 = a04;
                            } else {
                                i15 = 0;
                            }
                            int i51 = i50 + i15;
                            int i52 = i49 + i51;
                            int i53 = 0;
                            int i54 = i14;
                            while (i52 < 0 && i54 > 0) {
                                int i55 = i54 - 1;
                                C0538l c0538l2 = c0538l;
                                A a13 = vVar2.a(i55);
                                c4288m.add(0, a13);
                                i53 = Math.max(i53, a13.f4843r);
                                i52 += a13.f4842q;
                                i54 = i55;
                                c0538l = c0538l2;
                            }
                            C0538l c0538l3 = c0538l;
                            int i56 = i54;
                            if (i52 < i51) {
                                Y02 += i52;
                                i52 = i51;
                            }
                            int i57 = Y02;
                            int i58 = i52 - i51;
                            int i59 = i43 + i40;
                            int i60 = i56;
                            int i61 = i53;
                            if (i59 < 0) {
                                i16 = 0;
                            } else {
                                i16 = i59;
                            }
                            int i62 = i60;
                            int i63 = -i58;
                            int i64 = 0;
                            boolean z21 = false;
                            while (i64 < c4288m.f37476h0) {
                                if (i63 >= i16) {
                                    c4288m.s(i64);
                                    z21 = true;
                                } else {
                                    i62++;
                                    i63 += ((A) c4288m.get(i64)).f4842q;
                                    i64++;
                                }
                            }
                            int i65 = i58;
                            int i66 = i61;
                            boolean z22 = z21;
                            int i67 = i62;
                            while (i67 < i42 && (i63 < i16 || i63 <= 0 || c4288m.isEmpty())) {
                                int i68 = i16;
                                A a14 = vVar2.a(i67);
                                List list2 = i45;
                                int i69 = a14.f4842q;
                                i63 += i69;
                                if (i63 <= i51) {
                                    i35 = i51;
                                    if (i67 != i42 - 1) {
                                        i36 = i67 + 1;
                                        i65 -= i69;
                                        z22 = true;
                                        i67++;
                                        i45 = list2;
                                        i60 = i36;
                                        i16 = i68;
                                        i51 = i35;
                                    }
                                } else {
                                    i35 = i51;
                                }
                                int max = Math.max(i66, a14.f4843r);
                                c4288m.addLast(a14);
                                i66 = max;
                                i36 = i60;
                                i67++;
                                i45 = list2;
                                i60 = i36;
                                i16 = i68;
                                i51 = i35;
                            }
                            List list3 = i45;
                            if (i63 < i43) {
                                int i70 = i43 - i63;
                                i65 -= i70;
                                i63 += i70;
                                i18 = i66;
                                while (true) {
                                    i17 = i60;
                                    if (i65 >= i41 || i17 <= 0) {
                                        break;
                                    }
                                    int i71 = i17 - 1;
                                    A a15 = vVar2.a(i71);
                                    i60 = i71;
                                    c4288m.add(0, a15);
                                    i18 = Math.max(i18, a15.f4843r);
                                    i65 += a15.f4842q;
                                }
                                i19 = i70 + i57;
                                if (i65 < 0) {
                                    i19 += i65;
                                    i63 += i65;
                                    i65 = 0;
                                }
                            } else {
                                i19 = i57;
                                i18 = i66;
                                i17 = i60;
                            }
                            int Y03 = AbstractC4344b.Y0(f13);
                            int i72 = i18;
                            if (Y03 < 0) {
                                c10 = '\uffff';
                            } else if (Y03 > 0) {
                                c10 = 1;
                            } else {
                                c10 = 0;
                            }
                            if (i19 < 0) {
                                c11 = '\uffff';
                            } else if (i19 > 0) {
                                c11 = 1;
                            } else {
                                c11 = 0;
                            }
                            float f15 = (c10 == c11 && Math.abs(AbstractC4344b.Y0(f13)) >= Math.abs(i19)) ? i19 : f13;
                            float f16 = f13 - f15;
                            if (P && i19 > i57 && f16 <= 0.0f) {
                                f11 = (i19 - i57) + f16;
                            } else {
                                f11 = 0.0f;
                            }
                            if (i65 >= 0) {
                                int i73 = -i65;
                                A a16 = (A) c4288m.first();
                                if (i41 <= 0 && a04 >= 0) {
                                    i20 = i65;
                                } else {
                                    int i74 = c4288m.f37476h0;
                                    A a17 = a16;
                                    int i75 = 0;
                                    while (i75 < i74) {
                                        int i76 = ((A) c4288m.get(i75)).f4842q;
                                        if (i65 == 0 || i76 > i65) {
                                            break;
                                        }
                                        int i77 = i74;
                                        if (i75 == AbstractC4344b.u0(c4288m)) {
                                            break;
                                        }
                                        i65 -= i76;
                                        i75++;
                                        a17 = (A) c4288m.get(i75);
                                        i74 = i77;
                                    }
                                    i20 = i65;
                                    a16 = a17;
                                }
                                int i78 = this.f4999m0;
                                int max2 = Math.max(0, i17 - i78);
                                int i79 = i17 - 1;
                                if (max2 <= i79) {
                                    ArrayList arrayList5 = null;
                                    while (true) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList = arrayList5;
                                        arrayList.add(vVar2.a(i79));
                                        if (i79 == max2) {
                                            break;
                                        }
                                        i79--;
                                        arrayList5 = arrayList;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                int size3 = list3.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i80 = size3 - 1;
                                        i21 = i20;
                                        list = list3;
                                        int intValue = ((Number) list.get(size3)).intValue();
                                        if (intValue < max2) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(vVar2.a(intValue));
                                        }
                                        if (i80 < 0) {
                                            break;
                                        }
                                        list3 = list;
                                        size3 = i80;
                                        i20 = i21;
                                    }
                                } else {
                                    i21 = i20;
                                    list = list3;
                                }
                                if (arrayList == null) {
                                    arrayList = vVar3;
                                }
                                int i81 = i72;
                                int i82 = 0;
                                for (int size4 = arrayList.size(); i82 < size4; size4 = size4) {
                                    i81 = Math.max(i81, ((A) arrayList.get(i82)).f4843r);
                                    i82++;
                                }
                                int i83 = ((A) kf.t.o2(c4288m)).f4826a + i78;
                                int i84 = i42 - 1;
                                int min2 = Math.min(i83, i84);
                                int i85 = ((A) kf.t.o2(c4288m)).f4826a + 1;
                                if (i85 <= min2) {
                                    ArrayList arrayList6 = null;
                                    while (true) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        i23 = i81;
                                        i22 = i67;
                                        arrayList2 = arrayList6;
                                        arrayList2.add(vVar2.a(i85));
                                        if (i85 == min2) {
                                            break;
                                        }
                                        i85++;
                                        arrayList6 = arrayList2;
                                        i81 = i23;
                                        i67 = i22;
                                    }
                                } else {
                                    i23 = i81;
                                    i22 = i67;
                                    arrayList2 = null;
                                }
                                if (P && zVar2 != null) {
                                    List list4 = zVar2.f5012g;
                                    if (!list4.isEmpty()) {
                                        ArrayList arrayList7 = arrayList2;
                                        z11 = P;
                                        for (int size5 = list4.size() - 1; -1 < size5; size5--) {
                                            if (((A) ((n) list4.get(size5))).f4826a > min2 && (size5 == 0 || ((A) ((n) list4.get(size5 - 1))).f4826a <= min2)) {
                                                nVar = (n) list4.get(size5);
                                                break;
                                            }
                                        }
                                        nVar = null;
                                        n nVar2 = (n) kf.t.o2(list4);
                                        if (nVar != null && (i34 = ((A) nVar).f4826a) <= (min = Math.min(((A) nVar2).f4826a, i84))) {
                                            int i86 = i34;
                                            arrayList3 = arrayList7;
                                            while (true) {
                                                i25 = i73;
                                                if (arrayList3 != null) {
                                                    int size6 = arrayList3.size();
                                                    i24 = i63;
                                                    int i87 = 0;
                                                    while (true) {
                                                        if (i87 < size6) {
                                                            obj4 = arrayList3.get(i87);
                                                            int i88 = size6;
                                                            if (((A) obj4).f4826a == i86) {
                                                                break;
                                                            }
                                                            i87++;
                                                            size6 = i88;
                                                        } else {
                                                            obj4 = null;
                                                            break;
                                                        }
                                                    }
                                                    a11 = (A) obj4;
                                                } else {
                                                    i24 = i63;
                                                    a11 = null;
                                                }
                                                if (a11 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(vVar2.a(i86));
                                                }
                                                if (i86 == min) {
                                                    break;
                                                }
                                                i86++;
                                                i73 = i25;
                                                i63 = i24;
                                                arrayList3 = arrayList3;
                                            }
                                        } else {
                                            i25 = i73;
                                            i24 = i63;
                                            arrayList3 = arrayList7;
                                        }
                                        A a18 = (A) nVar2;
                                        float f17 = ((zVar2.f5014i - a18.f4840o) - a18.f4841p) - f15;
                                        if (f17 > 0.0f) {
                                            int i89 = a18.f4826a + 1;
                                            int i90 = 0;
                                            while (i89 < i42 && i90 < f17) {
                                                if (i89 <= min2) {
                                                    int r10 = c4288m.r();
                                                    int i91 = 0;
                                                    while (true) {
                                                        if (i91 < r10) {
                                                            obj3 = c4288m.get(i91);
                                                            f12 = f17;
                                                            if (((A) obj3).f4826a == i89) {
                                                                break;
                                                            }
                                                            i91++;
                                                            f17 = f12;
                                                        } else {
                                                            f12 = f17;
                                                            obj3 = null;
                                                            break;
                                                        }
                                                    }
                                                    a10 = (A) obj3;
                                                } else {
                                                    f12 = f17;
                                                    if (arrayList3 != null) {
                                                        int size7 = arrayList3.size();
                                                        int i92 = 0;
                                                        while (true) {
                                                            if (i92 < size7) {
                                                                r14 = arrayList3.get(i92);
                                                                if (((A) r14).f4826a == i89) {
                                                                    break;
                                                                }
                                                                i92++;
                                                            } else {
                                                                r14 = 0;
                                                                break;
                                                            }
                                                        }
                                                        a10 = r14;
                                                    } else {
                                                        a10 = null;
                                                    }
                                                }
                                                if (a10 != null) {
                                                    i89++;
                                                    i33 = a10.f4842q;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(vVar2.a(i89));
                                                    i89++;
                                                    i33 = ((A) kf.t.o2(arrayList3)).f4842q;
                                                }
                                                i90 += i33;
                                                f17 = f12;
                                            }
                                        }
                                        if (arrayList3 != null && ((A) kf.t.o2(arrayList3)).f4826a > min2) {
                                            min2 = ((A) kf.t.o2(arrayList3)).f4826a;
                                        }
                                        size = list.size();
                                        for (i26 = 0; i26 < size; i26++) {
                                            int intValue2 = ((Number) list.get(i26)).intValue();
                                            if (intValue2 > min2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(vVar2.a(intValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = vVar3;
                                        }
                                        size2 = arrayList3.size();
                                        int i93 = i23;
                                        for (i27 = 0; i27 < size2; i27++) {
                                            i93 = Math.max(i93, ((A) arrayList3.get(i27)).f4843r);
                                        }
                                        if (!AbstractC3557B.K(a16, c4288m.first()) && arrayList.isEmpty() && arrayList3.isEmpty()) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z20) {
                                            i28 = i93;
                                            j11 = n12;
                                        } else {
                                            j11 = n12;
                                            i28 = i24;
                                        }
                                        t02 = A7.b.t0(i28, j11);
                                        if (z20) {
                                            i93 = i24;
                                        }
                                        s02 = A7.b.s0(i93, j11);
                                        if (!z20) {
                                            i29 = s02;
                                        } else {
                                            i29 = t02;
                                        }
                                        i30 = i24;
                                        if (i30 >= Math.min(i29, i43)) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (!z13 && i25 != 0) {
                                            throw new IllegalStateException("non-zero itemsScrollOffset".toString());
                                        }
                                        ArrayList arrayList8 = new ArrayList(arrayList3.size() + arrayList.size() + c4288m.r());
                                        if (!z13) {
                                            if (arrayList.isEmpty() && arrayList3.isEmpty()) {
                                                int r11 = c4288m.r();
                                                int[] iArr2 = new int[r11];
                                                for (int i94 = 0; i94 < r11; i94++) {
                                                    iArr2[i94] = ((A) c4288m.get(!z19 ? i94 : (r11 - i94) - 1)).f4841p;
                                                }
                                                int[] iArr3 = new int[r11];
                                                for (int i95 = 0; i95 < r11; i95++) {
                                                    iArr3[i95] = 0;
                                                }
                                                if (z20) {
                                                    if (abstractC0427k != null) {
                                                        abstractC0427k.c(j12, i29, iArr2, iArr3);
                                                        z14 = z12;
                                                        vVar = vVar2;
                                                        iArr = iArr3;
                                                        a5 = a16;
                                                        z15 = z20;
                                                        i32 = i42;
                                                        i31 = i43;
                                                    } else {
                                                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                                    }
                                                } else if (abstractC0425i != null) {
                                                    a5 = a16;
                                                    i31 = i43;
                                                    z14 = z12;
                                                    i32 = i42;
                                                    z15 = z20;
                                                    vVar = vVar2;
                                                    iArr = iArr3;
                                                    abstractC0425i.b(j12, i29, iArr2, Z0.l.f22805Y, iArr3);
                                                } else {
                                                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                                                }
                                                Cf.g k32 = kf.q.k3(iArr);
                                                if (z19) {
                                                    k32 = new Cf.e(k32.f3107Z, k32.f3106Y, -k32.f3108h0);
                                                }
                                                int i96 = k32.f3106Y;
                                                int i97 = k32.f3107Z;
                                                int i98 = k32.f3108h0;
                                                if ((i98 > 0 && i96 <= i97) || (i98 < 0 && i97 <= i96)) {
                                                    while (true) {
                                                        int i99 = iArr[i96];
                                                        A a19 = (A) c4288m.get(!z19 ? i96 : (r11 - i96) - 1);
                                                        if (z19) {
                                                            i99 = (i29 - i99) - a19.f4841p;
                                                        }
                                                        a19.d(i99, t02, s02);
                                                        arrayList8.add(a19);
                                                        if (i96 == i97) {
                                                            break;
                                                        }
                                                        i96 += i98;
                                                    }
                                                }
                                            } else {
                                                throw new IllegalArgumentException("no extra items".toString());
                                            }
                                        } else {
                                            z14 = z12;
                                            i32 = i42;
                                            vVar = vVar2;
                                            a5 = a16;
                                            z15 = z20;
                                            i31 = i43;
                                            int size8 = arrayList.size();
                                            int i100 = i25;
                                            for (int i101 = 0; i101 < size8; i101++) {
                                                A a20 = (A) arrayList.get(i101);
                                                i100 -= a20.f4842q;
                                                a20.d(i100, t02, s02);
                                                arrayList8.add(a20);
                                            }
                                            int r12 = c4288m.r();
                                            int i102 = i25;
                                            for (int i103 = 0; i103 < r12; i103++) {
                                                A a21 = (A) c4288m.get(i103);
                                                a21.d(i102, t02, s02);
                                                arrayList8.add(a21);
                                                i102 += a21.f4842q;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i104 = 0; i104 < size9; i104++) {
                                                A a22 = (A) arrayList3.get(i104);
                                                a22.d(i102, t02, s02);
                                                arrayList8.add(a22);
                                                i102 += a22.f4842q;
                                            }
                                        }
                                        c0538l3.b((int) f15, t02, s02, arrayList8, vVar, z15, z11, z10, f14);
                                        if (i22 >= i32 && i30 <= i31) {
                                            z17 = false;
                                        }
                                        j10 = j14;
                                        O o11 = (O) uVar.invoke(Integer.valueOf(t02), Integer.valueOf(s02), new A.B(arrayList8, null, z11, j10.f4893w, 1));
                                        if (!z14) {
                                            arrayList4 = arrayList8;
                                        } else {
                                            ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                            int size10 = arrayList8.size();
                                            for (int i105 = 0; i105 < size10; i105++) {
                                                Object obj5 = arrayList8.get(i105);
                                                A a23 = (A) obj5;
                                                if (a23.f4826a >= ((A) c4288m.first()).f4826a) {
                                                    if (a23.f4826a <= ((A) c4288m.last()).f4826a) {
                                                        arrayList9.add(obj5);
                                                    }
                                                }
                                            }
                                            arrayList4 = arrayList9;
                                        }
                                        if (!z15) {
                                            w03 = w06;
                                        } else {
                                            w03 = w05;
                                        }
                                        zVar = new z(a5, i21, z17, f15, o11, f11, z22, arrayList4, i50, i59, i32, w03, i40, a04);
                                    }
                                }
                                i25 = i73;
                                i24 = i63;
                                z11 = P;
                                arrayList3 = arrayList2;
                                if (arrayList3 != null) {
                                    min2 = ((A) kf.t.o2(arrayList3)).f4826a;
                                }
                                size = list.size();
                                while (i26 < size) {
                                }
                                if (arrayList3 == null) {
                                }
                                size2 = arrayList3.size();
                                int i932 = i23;
                                while (i27 < size2) {
                                }
                                if (!AbstractC3557B.K(a16, c4288m.first())) {
                                }
                                z12 = false;
                                if (!z20) {
                                }
                                t02 = A7.b.t0(i28, j11);
                                if (z20) {
                                }
                                s02 = A7.b.s0(i932, j11);
                                if (!z20) {
                                }
                                i30 = i24;
                                if (i30 >= Math.min(i29, i43)) {
                                }
                                if (!z13) {
                                }
                                ArrayList arrayList82 = new ArrayList(arrayList3.size() + arrayList.size() + c4288m.r());
                                if (!z13) {
                                }
                                c0538l3.b((int) f15, t02, s02, arrayList82, vVar, z15, z11, z10, f14);
                                if (i22 >= i32) {
                                    z17 = false;
                                }
                                j10 = j14;
                                O o112 = (O) uVar.invoke(Integer.valueOf(t02), Integer.valueOf(s02), new A.B(arrayList82, null, z11, j10.f4893w, 1));
                                if (!z14) {
                                }
                                if (!z15) {
                                }
                                zVar = new z(a5, i21, z17, f15, o112, f11, z22, arrayList4, i50, i59, i32, w03, i40, a04);
                            } else {
                                throw new IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
                            }
                        }
                        j10.f(zVar, o0Var.P(), false);
                        return zVar;
                    }
                    throw new IllegalArgumentException("invalid afterContentPadding".toString());
                }
                throw new IllegalArgumentException("invalid beforeContentPadding".toString());
            }
            throw new IllegalArgumentException("coroutineScope should be not null".toString());
        } catch (Throwable th2) {
            d10.c();
            throw th2;
        }
    }
}
