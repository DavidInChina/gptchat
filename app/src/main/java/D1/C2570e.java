package d1;

import A.AbstractC0044t0;
import E0.M;
import E0.N;
import E0.O;
import E0.P;
import E0.d0;
import G0.g0;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import y.C6461B;
import y.D;

/* renamed from: d1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2570e implements N {

    /* renamed from: b  reason: collision with root package name */
    public static final C2570e f27860b = new C2570e(0);

    /* renamed from: c  reason: collision with root package name */
    public static final C2570e f27861c = new C2570e(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27862a;

    public /* synthetic */ C2570e(int i10) {
        this.f27862a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // E0.N
    public final O a(P p10, List list, long j6) {
        Object obj;
        int i10;
        int i11;
        int i12;
        kf.w wVar = kf.w.f37484Y;
        int i13 = 0;
        int i14 = 1;
        switch (this.f27862a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList.add(((M) list.get(i15)).o(j6));
                }
                d0 d0Var = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i16 = ((d0) obj).f4053Y;
                    int u02 = AbstractC4344b.u0(arrayList);
                    if (1 <= u02) {
                        int i17 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i17);
                            int i18 = ((d0) obj2).f4053Y;
                            if (i16 < i18) {
                                obj = obj2;
                                i16 = i18;
                            }
                            if (i17 != u02) {
                                i17++;
                            }
                        }
                    }
                }
                d0 d0Var2 = (d0) obj;
                if (d0Var2 != null) {
                    i10 = d0Var2.f4053Y;
                } else {
                    i10 = Z0.a.j(j6);
                }
                if (!arrayList.isEmpty()) {
                    Object obj3 = arrayList.get(0);
                    int i19 = ((d0) obj3).f4054Z;
                    int u03 = AbstractC4344b.u0(arrayList);
                    Object obj4 = obj3;
                    if (1 <= u03) {
                        while (true) {
                            Object obj5 = arrayList.get(i14);
                            int i20 = ((d0) obj5).f4054Z;
                            obj3 = obj4;
                            if (i19 < i20) {
                                obj3 = obj5;
                                i19 = i20;
                            }
                            if (i14 != u03) {
                                i14++;
                                obj4 = obj3;
                            }
                        }
                    }
                    d0Var = obj3;
                }
                d0 d0Var3 = d0Var;
                if (d0Var3 != null) {
                    i11 = d0Var3.f4054Z;
                } else {
                    i11 = Z0.a.i(j6);
                }
                return p10.j0(i10, i11, wVar, new C6461B(6, arrayList));
            default:
                int size2 = list.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            arrayList2.add(((M) list.get(i21)).o(j6));
                        }
                        int u04 = AbstractC4344b.u0(arrayList2);
                        if (u04 >= 0) {
                            int i22 = 0;
                            i12 = 0;
                            while (true) {
                                d0 d0Var4 = (d0) arrayList2.get(i13);
                                i22 = Math.max(i22, d0Var4.f4053Y);
                                i12 = Math.max(i12, d0Var4.f4054Z);
                                if (i13 != u04) {
                                    i13++;
                                } else {
                                    i13 = i22;
                                }
                            }
                        } else {
                            i12 = 0;
                        }
                        return p10.j0(i13, i12, wVar, new C6461B(7, arrayList2));
                    }
                    d0 o10 = ((M) list.get(0)).o(j6);
                    return p10.j0(o10.f4053Y, o10.f4054Z, wVar, new D(o10, 14));
                }
                return p10.j0(0, 0, wVar, C2567b.f27851k0);
        }
    }

    @Override // E0.N
    public final /* synthetic */ int b(g0 g0Var, List list, int i10) {
        int i11 = this.f27862a;
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(g0 g0Var, List list, int i10) {
        int i11 = this.f27862a;
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(g0 g0Var, List list, int i10) {
        int i11 = this.f27862a;
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(g0 g0Var, List list, int i10) {
        int i11 = this.f27862a;
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
