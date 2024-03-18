package y;

import A.AbstractC0044t0;
import E0.C0455n;
import E0.C0460t;
import G0.AbstractC0579h;
import W.B1;
import java.util.ArrayList;
import java.util.List;
import jf.C3959i;
import l8.AbstractC4344b;
import q0.C5252d;
import wf.AbstractC6216a;

/* renamed from: y.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6462C implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f50086a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f50087b;

    public /* synthetic */ C6462C(int i10, Object obj) {
        this.f50086a = i10;
        this.f50087b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        Object obj;
        int i10;
        E0.d0 d0Var;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3959i c3959i;
        kf.w wVar = kf.w.f37484Y;
        int i12 = this.f50086a;
        Object obj2 = this.f50087b;
        switch (i12) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList3.add(((E0.M) list.get(i13)).o(j6));
                }
                int i14 = 1;
                if (arrayList3.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList3.get(0);
                    int i15 = ((E0.d0) obj).f4053Y;
                    int u02 = AbstractC4344b.u0(arrayList3);
                    if (1 <= u02) {
                        int i16 = 1;
                        while (true) {
                            Object obj3 = arrayList3.get(i16);
                            int i17 = ((E0.d0) obj3).f4053Y;
                            if (i15 < i17) {
                                obj = obj3;
                                i15 = i17;
                            }
                            if (i16 != u02) {
                                i16++;
                            }
                        }
                    }
                }
                E0.d0 d0Var2 = (E0.d0) obj;
                if (d0Var2 != null) {
                    i10 = d0Var2.f4053Y;
                } else {
                    i10 = 0;
                }
                if (arrayList3.isEmpty()) {
                    d0Var = null;
                } else {
                    Object obj4 = arrayList3.get(0);
                    int i18 = ((E0.d0) obj4).f4054Z;
                    int u03 = AbstractC4344b.u0(arrayList3);
                    Object obj5 = obj4;
                    if (1 <= u03) {
                        while (true) {
                            Object obj6 = arrayList3.get(i14);
                            int i19 = ((E0.d0) obj6).f4054Z;
                            obj4 = obj5;
                            if (i18 < i19) {
                                obj4 = obj6;
                                i18 = i19;
                            }
                            if (i14 != u03) {
                                i14++;
                                obj5 = obj4;
                            }
                        }
                    }
                    d0Var = obj4;
                }
                E0.d0 d0Var3 = d0Var;
                if (d0Var3 != null) {
                    i11 = d0Var3.f4054Z;
                } else {
                    i11 = 0;
                }
                ((M) obj2).f50129a.setValue(new Z0.k(Ng.H.c(i10, i11)));
                return p10.j0(i10, i11, wVar, new C6461B(0, arrayList3));
            case 1:
                List list2 = (List) ((AbstractC6216a) obj2).mo122invoke();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        C5252d c5252d = (C5252d) list2.get(i20);
                        if (c5252d != null) {
                            arrayList2 = arrayList4;
                            c3959i = new C3959i(((E0.M) list.get(i20)).o(A7.b.n(0, (int) Math.floor(c5252d.f()), 0, (int) Math.floor(c5252d.c()), 5)), new Z0.i(kotlin.jvm.internal.m.c(AbstractC4344b.Y0(c5252d.f43625a), AbstractC4344b.Y0(c5252d.f43626b))));
                        } else {
                            arrayList2 = arrayList4;
                            c3959i = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (c3959i != null) {
                            arrayList5.add(c3959i);
                        }
                        i20++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                return p10.j0(Z0.a.h(j6), Z0.a.g(j6), wVar, new C6461B(2, arrayList));
            default:
                return ((B1) obj2).a(p10, AbstractC0579h.q(p10), j6);
        }
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        Integer num;
        int i11;
        int i12 = 1;
        switch (this.f50086a) {
            case 0:
                if (list.isEmpty()) {
                    num = null;
                    i11 = 0;
                } else {
                    i11 = 0;
                    num = Integer.valueOf(((E0.r) list.get(0)).m(i10));
                    int u02 = AbstractC4344b.u0(list);
                    if (1 <= u02) {
                        while (true) {
                            Integer valueOf = Integer.valueOf(((E0.r) list.get(i12)).m(i10));
                            if (valueOf.compareTo(num) > 0) {
                                num = valueOf;
                            }
                            if (i12 != u02) {
                                i12++;
                            }
                        }
                    }
                }
                if (num != null) {
                    return num.intValue();
                }
                return i11;
            case 1:
                return AbstractC0044t0.d(this, g0Var, list, i10);
            default:
                B1 b1 = (B1) this.f50087b;
                ArrayList q10 = AbstractC0579h.q(g0Var);
                b1.getClass();
                ArrayList arrayList = new ArrayList(q10.size());
                int size = q10.size();
                for (int i13 = 0; i13 < size; i13++) {
                    List list2 = (List) q10.get(i13);
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        arrayList2.add(new C0455n((E0.r) list2.get(i14), 2, 1));
                    }
                    arrayList.add(arrayList2);
                }
                return b1.a(new C0460t(g0Var, g0Var.f5770n0.f24860x0), arrayList, A7.b.n(0, 0, 0, i10, 7)).getWidth();
        }
    }

    @Override // E0.N
    public final int c(G0.g0 g0Var, List list, int i10) {
        Integer num;
        int i11;
        int i12 = 1;
        switch (this.f50086a) {
            case 0:
                if (list.isEmpty()) {
                    num = null;
                    i11 = 0;
                } else {
                    i11 = 0;
                    num = Integer.valueOf(((E0.r) list.get(0)).S(i10));
                    int u02 = AbstractC4344b.u0(list);
                    if (1 <= u02) {
                        while (true) {
                            Integer valueOf = Integer.valueOf(((E0.r) list.get(i12)).S(i10));
                            if (valueOf.compareTo(num) > 0) {
                                num = valueOf;
                            }
                            if (i12 != u02) {
                                i12++;
                            }
                        }
                    }
                }
                if (num != null) {
                    return num.intValue();
                }
                return i11;
            case 1:
                return AbstractC0044t0.f(this, g0Var, list, i10);
            default:
                B1 b1 = (B1) this.f50087b;
                ArrayList q10 = AbstractC0579h.q(g0Var);
                b1.getClass();
                ArrayList arrayList = new ArrayList(q10.size());
                int size = q10.size();
                for (int i13 = 0; i13 < size; i13++) {
                    List list2 = (List) q10.get(i13);
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        arrayList2.add(new C0455n((E0.r) list2.get(i14), 1, 2));
                    }
                    arrayList.add(arrayList2);
                }
                return b1.a(new C0460t(g0Var, g0Var.f5770n0.f24860x0), arrayList, A7.b.n(0, i10, 0, 0, 13)).getHeight();
        }
    }

    @Override // E0.N
    public final int d(G0.g0 g0Var, List list, int i10) {
        Integer num;
        int i11 = 1;
        switch (this.f50086a) {
            case 0:
                if (list.isEmpty()) {
                    num = null;
                } else {
                    num = Integer.valueOf(((E0.r) list.get(0)).l(i10));
                    int u02 = AbstractC4344b.u0(list);
                    if (1 <= u02) {
                        while (true) {
                            Integer valueOf = Integer.valueOf(((E0.r) list.get(i11)).l(i10));
                            if (valueOf.compareTo(num) > 0) {
                                num = valueOf;
                            }
                            if (i11 != u02) {
                                i11++;
                            }
                        }
                    }
                }
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            case 1:
                return AbstractC0044t0.h(this, g0Var, list, i10);
            default:
                B1 b1 = (B1) this.f50087b;
                ArrayList q10 = AbstractC0579h.q(g0Var);
                b1.getClass();
                ArrayList arrayList = new ArrayList(q10.size());
                int size = q10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    List list2 = (List) q10.get(i12);
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        arrayList2.add(new C0455n((E0.r) list2.get(i13), 1, 1));
                    }
                    arrayList.add(arrayList2);
                }
                return b1.a(new C0460t(g0Var, g0Var.f5770n0.f24860x0), arrayList, A7.b.n(0, 0, 0, i10, 7)).getWidth();
        }
    }

    @Override // E0.N
    public final int e(G0.g0 g0Var, List list, int i10) {
        Integer num;
        switch (this.f50086a) {
            case 0:
                if (list.isEmpty()) {
                    num = null;
                } else {
                    num = Integer.valueOf(((E0.r) list.get(0)).c(i10));
                    int u02 = AbstractC4344b.u0(list);
                    int i11 = 1;
                    if (1 <= u02) {
                        while (true) {
                            Integer valueOf = Integer.valueOf(((E0.r) list.get(i11)).c(i10));
                            if (valueOf.compareTo(num) > 0) {
                                num = valueOf;
                            }
                            if (i11 != u02) {
                                i11++;
                            }
                        }
                    }
                }
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            case 1:
                return AbstractC0044t0.b(this, g0Var, list, i10);
            default:
                B1 b1 = (B1) this.f50087b;
                ArrayList q10 = AbstractC0579h.q(g0Var);
                b1.getClass();
                ArrayList arrayList = new ArrayList(q10.size());
                int size = q10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    List list2 = (List) q10.get(i12);
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        arrayList2.add(new C0455n((E0.r) list2.get(i13), 2, 2));
                    }
                    arrayList.add(arrayList2);
                }
                return b1.a(new C0460t(g0Var, g0Var.f5770n0.f24860x0), arrayList, A7.b.n(0, i10, 0, 0, 13)).getHeight();
        }
    }
}
