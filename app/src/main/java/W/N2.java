package W;

import D1.C0373t;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class N2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E0.o0 f19404Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f19405Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19406h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19407i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19408j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19409k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19410l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f19411m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19412n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19413o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f19414p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(E0.o0 o0Var, wf.n nVar, wf.n nVar2, wf.n nVar3, int i10, int i11, E.A0 a02, long j6, wf.n nVar4, wf.o oVar, int i12) {
        super(1);
        this.f19404Y = o0Var;
        this.f19405Z = nVar;
        this.f19406h0 = nVar2;
        this.f19407i0 = nVar3;
        this.f19408j0 = i10;
        this.f19409k0 = i11;
        this.f19410l0 = a02;
        this.f19411m0 = j6;
        this.f19412n0 = nVar4;
        this.f19413o0 = oVar;
        this.f19414p0 = i12;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        Object obj2;
        int i10;
        E.A0 a02;
        Object obj3;
        int i11;
        Object obj4;
        int i12;
        ArrayList arrayList;
        C0373t c0373t;
        Object obj5;
        Integer num;
        Integer num2;
        int i13;
        int i14;
        int i15;
        int i16;
        int intValue;
        int a03;
        Object obj6;
        Object obj7;
        int i17;
        int a04;
        E0.c0 c0Var = (E0.c0) obj;
        T2 t22 = T2.f19698Y;
        wf.n nVar = this.f19405Z;
        E0.o0 o0Var = this.f19404Y;
        List z10 = o0Var.z(t22, nVar);
        ArrayList arrayList2 = new ArrayList(z10.size());
        int size = z10.size();
        int i18 = 0;
        while (true) {
            j6 = this.f19411m0;
            if (i18 >= size) {
                break;
            }
            arrayList2.add(((E0.M) z10.get(i18)).o(j6));
            i18++;
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int i19 = ((E0.d0) obj2).f4054Z;
            int u02 = AbstractC4344b.u0(arrayList2);
            if (1 <= u02) {
                int i20 = 1;
                while (true) {
                    Object obj8 = arrayList2.get(i20);
                    int i21 = ((E0.d0) obj8).f4054Z;
                    if (i19 < i21) {
                        obj2 = obj8;
                        i19 = i21;
                    }
                    if (i20 == u02) {
                        break;
                    }
                    i20++;
                }
            }
        }
        E0.d0 d0Var = (E0.d0) obj2;
        if (d0Var != null) {
            i10 = d0Var.f4054Z;
        } else {
            i10 = 0;
        }
        List z11 = o0Var.z(T2.f19700h0, this.f19406h0);
        ArrayList arrayList3 = new ArrayList(z11.size());
        int size2 = z11.size();
        int i22 = 0;
        while (true) {
            a02 = this.f19410l0;
            if (i22 >= size2) {
                break;
            }
            arrayList3.add(((E0.M) z11.get(i22)).o(A7.b.n1(j6, (-a02.a(o0Var, o0Var.getLayoutDirection())) - a02.b(o0Var, o0Var.getLayoutDirection()), -a02.d(o0Var))));
            i22++;
        }
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i23 = ((E0.d0) obj3).f4054Z;
            int u03 = AbstractC4344b.u0(arrayList3);
            if (1 <= u03) {
                int i24 = 1;
                while (true) {
                    Object obj9 = arrayList3.get(i24);
                    int i25 = ((E0.d0) obj9).f4054Z;
                    if (i23 < i25) {
                        obj3 = obj9;
                        i23 = i25;
                    }
                    if (i24 == u03) {
                        break;
                    }
                    i24++;
                }
            }
        }
        E0.d0 d0Var2 = (E0.d0) obj3;
        if (d0Var2 != null) {
            i11 = d0Var2.f4054Z;
        } else {
            i11 = 0;
        }
        if (arrayList3.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList3.get(0);
            int i26 = ((E0.d0) obj4).f4053Y;
            int u04 = AbstractC4344b.u0(arrayList3);
            if (1 <= u04) {
                int i27 = 1;
                while (true) {
                    Object obj10 = arrayList3.get(i27);
                    int i28 = ((E0.d0) obj10).f4053Y;
                    if (i26 < i28) {
                        obj4 = obj10;
                        i26 = i28;
                    }
                    if (i27 == u04) {
                        break;
                    }
                    i27++;
                }
            }
        }
        E0.d0 d0Var3 = (E0.d0) obj4;
        if (d0Var3 != null) {
            i12 = d0Var3.f4053Y;
        } else {
            i12 = 0;
        }
        List z12 = o0Var.z(T2.f19701i0, this.f19407i0);
        ArrayList arrayList4 = new ArrayList(z12.size());
        int size3 = z12.size();
        int i29 = 0;
        while (i29 < size3) {
            List list = z12;
            int i30 = size3;
            ArrayList arrayList5 = arrayList3;
            E0.d0 o10 = ((E0.M) z12.get(i29)).o(A7.b.n1(j6, (-a02.a(o0Var, o0Var.getLayoutDirection())) - a02.b(o0Var, o0Var.getLayoutDirection()), -a02.d(o0Var)));
            if (o10.f4054Z == 0 || o10.f4053Y == 0) {
                o10 = null;
            }
            if (o10 != null) {
                arrayList4.add(o10);
            }
            i29++;
            z12 = list;
            size3 = i30;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = arrayList3;
        boolean z13 = !arrayList4.isEmpty();
        int i31 = this.f19409k0;
        if (z13) {
            if (arrayList4.isEmpty()) {
                obj6 = null;
            } else {
                obj6 = arrayList4.get(0);
                int i32 = ((E0.d0) obj6).f4053Y;
                int u05 = AbstractC4344b.u0(arrayList4);
                if (1 <= u05) {
                    int i33 = 1;
                    while (true) {
                        Object obj11 = arrayList4.get(i33);
                        Object obj12 = obj6;
                        int i34 = ((E0.d0) obj11).f4053Y;
                        if (i32 < i34) {
                            i32 = i34;
                            obj6 = obj11;
                        } else {
                            obj6 = obj12;
                        }
                        if (i33 == u05) {
                            break;
                        }
                        i33++;
                    }
                }
            }
            AbstractC3557B.Z(obj6);
            int i35 = ((E0.d0) obj6).f4053Y;
            if (arrayList4.isEmpty()) {
                arrayList = arrayList4;
                obj7 = null;
            } else {
                obj7 = arrayList4.get(0);
                int i36 = ((E0.d0) obj7).f4054Z;
                int u06 = AbstractC4344b.u0(arrayList4);
                if (1 <= u06) {
                    int i37 = i36;
                    Object obj13 = obj7;
                    int i38 = 1;
                    while (true) {
                        Object obj14 = arrayList4.get(i38);
                        arrayList = arrayList4;
                        int i39 = ((E0.d0) obj14).f4054Z;
                        if (i37 < i39) {
                            i37 = i39;
                            obj13 = obj14;
                        }
                        if (i38 == u06) {
                            break;
                        }
                        i38++;
                        arrayList4 = arrayList;
                    }
                    obj7 = obj13;
                } else {
                    arrayList = arrayList4;
                }
            }
            AbstractC3557B.Z(obj7);
            int i40 = ((E0.d0) obj7).f4054Z;
            int i41 = this.f19408j0;
            boolean c10 = AbstractC1523a1.c(i41, 0);
            Z0.l lVar = Z0.l.f22805Y;
            if (c10) {
                if (o0Var.getLayoutDirection() == lVar) {
                    i17 = o0Var.a0(S2.f19674c);
                    c0373t = new C0373t(i17, i40);
                } else {
                    a04 = o0Var.a0(S2.f19674c);
                    i17 = (i31 - a04) - i35;
                    c0373t = new C0373t(i17, i40);
                }
            } else if (AbstractC1523a1.c(i41, 2)) {
                if (o0Var.getLayoutDirection() == lVar) {
                    a04 = o0Var.a0(S2.f19674c);
                    i17 = (i31 - a04) - i35;
                    c0373t = new C0373t(i17, i40);
                } else {
                    i17 = o0Var.a0(S2.f19674c);
                    c0373t = new C0373t(i17, i40);
                }
            } else {
                i17 = (i31 - i35) / 2;
                c0373t = new C0373t(i17, i40);
            }
        } else {
            arrayList = arrayList4;
            c0373t = null;
        }
        List z14 = o0Var.z(T2.f19702j0, new C3288a(new M2(c0373t, this.f19412n0, 0), true, -791102355));
        ArrayList arrayList7 = new ArrayList(z14.size());
        int size4 = z14.size();
        for (int i42 = 0; i42 < size4; i42++) {
            arrayList7.add(((E0.M) z14.get(i42)).o(j6));
        }
        if (arrayList7.isEmpty()) {
            obj5 = null;
        } else {
            obj5 = arrayList7.get(0);
            int i43 = ((E0.d0) obj5).f4054Z;
            int u07 = AbstractC4344b.u0(arrayList7);
            if (1 <= u07) {
                int i44 = 1;
                while (true) {
                    Object obj15 = arrayList7.get(i44);
                    Object obj16 = obj5;
                    int i45 = ((E0.d0) obj15).f4054Z;
                    if (i43 < i45) {
                        i43 = i45;
                        obj5 = obj15;
                    } else {
                        obj5 = obj16;
                    }
                    if (i44 == u07) {
                        break;
                    }
                    i44++;
                }
            }
        }
        E0.d0 d0Var4 = (E0.d0) obj5;
        if (d0Var4 != null) {
            num = Integer.valueOf(d0Var4.f4054Z);
        } else {
            num = null;
        }
        if (c0373t != null) {
            int i46 = c0373t.f3303b;
            if (num == null) {
                intValue = o0Var.a0(S2.f19674c) + i46;
                a03 = a02.d(o0Var);
            } else {
                intValue = num.intValue() + i46;
                a03 = o0Var.a0(S2.f19674c);
            }
            num2 = Integer.valueOf(a03 + intValue);
        } else {
            num2 = null;
        }
        if (i11 != 0) {
            if (num2 != null) {
                i16 = num2.intValue();
            } else if (num != null) {
                i16 = num.intValue();
            } else {
                i16 = a02.d(o0Var);
            }
            i13 = i11 + i16;
        } else {
            i13 = 0;
        }
        T2 t23 = T2.f19699Z;
        wf.o oVar = this.f19413o0;
        E.A0 a05 = this.f19410l0;
        E0.o0 o0Var2 = this.f19404Y;
        ArrayList arrayList8 = arrayList7;
        int i47 = i12;
        C0373t c0373t2 = c0373t;
        int i48 = i13;
        List z15 = o0Var2.z(t23, new C3288a(new L2(a05, o0Var2, arrayList2, i10, arrayList7, num, oVar, 0), true, 495329982));
        ArrayList arrayList9 = new ArrayList(z15.size());
        int size5 = z15.size();
        for (int i49 = 0; i49 < size5; i49++) {
            arrayList9.add(((E0.M) z15.get(i49)).o(j6));
        }
        int size6 = arrayList9.size();
        for (int i50 = 0; i50 < size6; i50++) {
            E0.c0.d(c0Var, (E0.d0) arrayList9.get(i50), 0, 0);
        }
        int i51 = 0;
        int size7 = arrayList2.size();
        int i52 = 0;
        while (i52 < size7) {
            E0.c0.d(c0Var, (E0.d0) arrayList2.get(i52), i51, i51);
            i52++;
            i51 = 0;
        }
        int size8 = arrayList6.size();
        int i53 = 0;
        while (true) {
            i14 = this.f19414p0;
            if (i53 >= size8) {
                break;
            }
            E0.c0.d(c0Var, (E0.d0) arrayList6.get(i53), a02.a(o0Var, o0Var.getLayoutDirection()) + ((i31 - i47) / 2), i14 - i48);
            i53++;
        }
        int size9 = arrayList8.size();
        int i54 = 0;
        while (i54 < size9) {
            ArrayList arrayList10 = arrayList8;
            E0.d0 d0Var5 = (E0.d0) arrayList10.get(i54);
            if (num != null) {
                i15 = num.intValue();
            } else {
                i15 = 0;
            }
            E0.c0.d(c0Var, d0Var5, 0, i14 - i15);
            i54++;
            arrayList8 = arrayList10;
        }
        if (c0373t2 != null) {
            int size10 = arrayList.size();
            int i55 = 0;
            while (i55 < size10) {
                ArrayList arrayList11 = arrayList;
                AbstractC3557B.Z(num2);
                E0.c0.d(c0Var, (E0.d0) arrayList11.get(i55), c0373t2.f3302a, i14 - num2.intValue());
                i55++;
                arrayList = arrayList11;
            }
        }
        return jf.y.f36177a;
    }
}
