package W;

import D1.C0373t;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class O2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19461Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f19462Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19463h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19464i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19465j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19466k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19467l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19468m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O2(wf.n nVar, wf.n nVar2, wf.n nVar3, int i10, E.A0 a02, wf.n nVar4, wf.o oVar, int i11) {
        super(2);
        this.f19461Y = i11;
        this.f19462Z = nVar;
        this.f19463h0 = nVar2;
        this.f19464i0 = nVar3;
        this.f19465j0 = i10;
        this.f19466k0 = a02;
        this.f19467l0 = nVar4;
        this.f19468m0 = oVar;
    }

    public final E0.O a(E0.o0 o0Var, long j6) {
        Object obj;
        int i10;
        Object obj2;
        int i11;
        ArrayList arrayList;
        Object obj3;
        int i12;
        ArrayList arrayList2;
        C0373t c0373t;
        Object obj4;
        Integer num;
        Integer num2;
        int i13;
        int i14;
        int a02;
        int d10;
        Object obj5;
        Object obj6;
        int i15;
        int a03;
        int i16 = this.f19461Y;
        kf.w wVar = kf.w.f37484Y;
        switch (i16) {
            case 0:
                int h10 = Z0.a.h(j6);
                int g10 = Z0.a.g(j6);
                return o0Var.j0(h10, g10, wVar, new N2(o0Var, this.f19462Z, this.f19463h0, this.f19464i0, this.f19465j0, h10, this.f19466k0, Z0.a.a(j6, 0, 0, 0, 0, 10), this.f19467l0, this.f19468m0, g10));
            default:
                int h11 = Z0.a.h(j6);
                int g11 = Z0.a.g(j6);
                long a5 = Z0.a.a(j6, 0, 0, 0, 0, 10);
                List z10 = o0Var.z(T2.f19698Y, this.f19462Z);
                ArrayList arrayList3 = new ArrayList(z10.size());
                int size = z10.size();
                for (int i17 = 0; i17 < size; i17++) {
                    arrayList3.add(((E0.M) z10.get(i17)).o(a5));
                }
                if (arrayList3.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList3.get(0);
                    int i18 = ((E0.d0) obj).f4054Z;
                    int u02 = AbstractC4344b.u0(arrayList3);
                    if (1 <= u02) {
                        int i19 = 1;
                        while (true) {
                            Object obj7 = arrayList3.get(i19);
                            int i20 = ((E0.d0) obj7).f4054Z;
                            if (i18 < i20) {
                                i18 = i20;
                                obj = obj7;
                            }
                            if (i19 != u02) {
                                i19++;
                            }
                        }
                    }
                }
                E0.d0 d0Var = (E0.d0) obj;
                if (d0Var != null) {
                    i10 = d0Var.f4054Z;
                } else {
                    i10 = 0;
                }
                List z11 = o0Var.z(T2.f19700h0, this.f19463h0);
                ArrayList arrayList4 = new ArrayList(z11.size());
                int size2 = z11.size();
                int i21 = 0;
                while (true) {
                    E.A0 a04 = this.f19466k0;
                    if (i21 < size2) {
                        arrayList4.add(((E0.M) z11.get(i21)).o(A7.b.n1(a5, (-a04.a(o0Var, o0Var.getLayoutDirection())) - a04.b(o0Var, o0Var.getLayoutDirection()), -a04.d(o0Var))));
                        i21++;
                        z11 = z11;
                        size2 = size2;
                    } else {
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList4.get(0);
                            int i22 = ((E0.d0) obj2).f4054Z;
                            int u03 = AbstractC4344b.u0(arrayList4);
                            if (1 <= u03) {
                                Object obj8 = obj2;
                                int i23 = i22;
                                int i24 = 1;
                                while (true) {
                                    Object obj9 = arrayList4.get(i24);
                                    Object obj10 = obj8;
                                    int i25 = ((E0.d0) obj9).f4054Z;
                                    if (i23 < i25) {
                                        i23 = i25;
                                        obj8 = obj9;
                                    } else {
                                        obj8 = obj10;
                                    }
                                    if (i24 != u03) {
                                        i24++;
                                    } else {
                                        obj2 = obj8;
                                    }
                                }
                            }
                        }
                        E0.d0 d0Var2 = (E0.d0) obj2;
                        if (d0Var2 != null) {
                            i11 = d0Var2.f4054Z;
                        } else {
                            i11 = 0;
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int i26 = ((E0.d0) obj3).f4053Y;
                            int u04 = AbstractC4344b.u0(arrayList4);
                            if (1 <= u04) {
                                Object obj11 = obj3;
                                int i27 = i26;
                                int i28 = 1;
                                while (true) {
                                    Object obj12 = arrayList4.get(i28);
                                    arrayList = arrayList4;
                                    int i29 = ((E0.d0) obj12).f4053Y;
                                    if (i27 < i29) {
                                        i27 = i29;
                                        obj11 = obj12;
                                    }
                                    if (i28 != u04) {
                                        i28++;
                                        arrayList4 = arrayList;
                                    } else {
                                        obj3 = obj11;
                                    }
                                }
                            } else {
                                arrayList = arrayList4;
                            }
                        }
                        E0.d0 d0Var3 = (E0.d0) obj3;
                        if (d0Var3 != null) {
                            i12 = d0Var3.f4053Y;
                        } else {
                            i12 = 0;
                        }
                        List z12 = o0Var.z(T2.f19701i0, this.f19464i0);
                        ArrayList arrayList5 = new ArrayList(z12.size());
                        int size3 = z12.size();
                        int i30 = 0;
                        while (i30 < size3) {
                            List list = z12;
                            int i31 = size3;
                            kf.w wVar2 = wVar;
                            E0.d0 o10 = ((E0.M) z12.get(i30)).o(A7.b.n1(a5, (-a04.a(o0Var, o0Var.getLayoutDirection())) - a04.b(o0Var, o0Var.getLayoutDirection()), -a04.d(o0Var)));
                            if (o10.f4054Z == 0 || o10.f4053Y == 0) {
                                o10 = null;
                            }
                            if (o10 != null) {
                                arrayList5.add(o10);
                            }
                            i30++;
                            z12 = list;
                            size3 = i31;
                            wVar = wVar2;
                        }
                        kf.w wVar3 = wVar;
                        boolean z13 = !arrayList5.isEmpty();
                        int i32 = this.f19465j0;
                        if (z13) {
                            if (arrayList5.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList5.get(0);
                                int i33 = ((E0.d0) obj5).f4053Y;
                                int u05 = AbstractC4344b.u0(arrayList5);
                                if (1 <= u05) {
                                    int i34 = i33;
                                    int i35 = 1;
                                    while (true) {
                                        Object obj13 = arrayList5.get(i35);
                                        Object obj14 = obj5;
                                        int i36 = ((E0.d0) obj13).f4053Y;
                                        if (i34 < i36) {
                                            i34 = i36;
                                            obj5 = obj13;
                                        } else {
                                            obj5 = obj14;
                                        }
                                        if (i35 != u05) {
                                            i35++;
                                        }
                                    }
                                }
                            }
                            AbstractC3557B.Z(obj5);
                            int i37 = ((E0.d0) obj5).f4053Y;
                            if (arrayList5.isEmpty()) {
                                arrayList2 = arrayList5;
                                obj6 = null;
                            } else {
                                obj6 = arrayList5.get(0);
                                int i38 = ((E0.d0) obj6).f4054Z;
                                int u06 = AbstractC4344b.u0(arrayList5);
                                if (1 <= u06) {
                                    int i39 = 1;
                                    Object obj15 = obj6;
                                    int i40 = i38;
                                    while (true) {
                                        Object obj16 = arrayList5.get(i39);
                                        arrayList2 = arrayList5;
                                        int i41 = ((E0.d0) obj16).f4054Z;
                                        if (i40 < i41) {
                                            i40 = i41;
                                            obj15 = obj16;
                                        }
                                        if (i39 != u06) {
                                            i39++;
                                            arrayList5 = arrayList2;
                                        } else {
                                            obj6 = obj15;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                }
                            }
                            AbstractC3557B.Z(obj6);
                            int i42 = ((E0.d0) obj6).f4054Z;
                            boolean c10 = AbstractC1523a1.c(i32, 0);
                            Z0.l lVar = Z0.l.f22805Y;
                            if (c10) {
                                if (o0Var.getLayoutDirection() == lVar) {
                                    i15 = o0Var.a0(S2.f19674c);
                                    c0373t = new C0373t(i15, i42);
                                } else {
                                    a03 = o0Var.a0(S2.f19674c);
                                    i15 = (h11 - a03) - i37;
                                    c0373t = new C0373t(i15, i42);
                                }
                            } else {
                                if (AbstractC1523a1.c(i32, 2) || AbstractC1523a1.c(i32, 3)) {
                                    if (o0Var.getLayoutDirection() == lVar) {
                                        a03 = o0Var.a0(S2.f19674c);
                                        i15 = (h11 - a03) - i37;
                                    } else {
                                        i15 = o0Var.a0(S2.f19674c);
                                    }
                                } else {
                                    i15 = (h11 - i37) / 2;
                                }
                                c0373t = new C0373t(i15, i42);
                            }
                        } else {
                            arrayList2 = arrayList5;
                            c0373t = null;
                        }
                        List z14 = o0Var.z(T2.f19702j0, new C3288a(new M2(c0373t, this.f19467l0, 1), true, 1843374446));
                        ArrayList arrayList6 = new ArrayList(z14.size());
                        int size4 = z14.size();
                        for (int i43 = 0; i43 < size4; i43++) {
                            arrayList6.add(((E0.M) z14.get(i43)).o(a5));
                        }
                        if (arrayList6.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList6.get(0);
                            int i44 = ((E0.d0) obj4).f4054Z;
                            int u07 = AbstractC4344b.u0(arrayList6);
                            int i45 = 1;
                            if (1 <= u07) {
                                while (true) {
                                    Object obj17 = arrayList6.get(i45);
                                    Object obj18 = obj4;
                                    int i46 = ((E0.d0) obj17).f4054Z;
                                    if (i44 < i46) {
                                        i44 = i46;
                                        obj4 = obj17;
                                    } else {
                                        obj4 = obj18;
                                    }
                                    if (i45 != u07) {
                                        i45++;
                                    }
                                }
                            }
                        }
                        E0.d0 d0Var4 = (E0.d0) obj4;
                        if (d0Var4 != null) {
                            num = Integer.valueOf(d0Var4.f4054Z);
                        } else {
                            num = null;
                        }
                        if (c0373t != null) {
                            int i47 = c0373t.f3303b;
                            if (num != null && !AbstractC1523a1.c(i32, 3)) {
                                a02 = num.intValue() + i47;
                                d10 = o0Var.a0(S2.f19674c);
                            } else {
                                a02 = o0Var.a0(S2.f19674c) + i47;
                                d10 = a04.d(o0Var);
                            }
                            num2 = Integer.valueOf(d10 + a02);
                        } else {
                            num2 = null;
                        }
                        if (i11 != 0) {
                            if (num2 != null) {
                                i14 = num2.intValue();
                            } else if (num != null) {
                                i14 = num.intValue();
                            } else {
                                i14 = a04.d(o0Var);
                            }
                            i13 = i11 + i14;
                        } else {
                            i13 = 0;
                        }
                        List z15 = o0Var.z(T2.f19699Z, new C3288a(new L2(this.f19466k0, o0Var, arrayList3, i10, arrayList6, num, this.f19468m0, 1), true, 1655277373));
                        ArrayList arrayList7 = new ArrayList(z15.size());
                        int size5 = z15.size();
                        for (int i48 = 0; i48 < size5; i48++) {
                            arrayList7.add(((E0.M) z15.get(i48)).o(a5));
                        }
                        return o0Var.j0(h11, g11, wVar3, new R2(arrayList7, arrayList3, arrayList, arrayList6, c0373t, h11, i12, this.f19466k0, o0Var, g11, i13, num, arrayList2, num2));
                    }
                }
                break;
        }
    }

    @Override // wf.n
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f19461Y) {
            case 0:
                return a((E0.o0) obj, ((Z0.a) obj2).f22782a);
            default:
                return a((E0.o0) obj, ((Z0.a) obj2).f22782a);
        }
    }
}
