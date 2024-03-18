package y;

import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class r implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final C6460A f50280a;

    public r(C6460A c6460a) {
        this.f50280a = c6460a;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        E0.d0 d0Var;
        E0.d0 d0Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int size = list.size();
        E0.d0[] d0VarArr = new E0.d0[size];
        int size2 = list.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            d0Var = null;
            C6483v c6483v = null;
            if (i16 >= size2) {
                break;
            }
            E0.M m10 = (E0.M) list.get(i16);
            Object u10 = m10.u();
            if (u10 instanceof C6483v) {
                c6483v = (C6483v) u10;
            }
            if (c6483v != null && c6483v.f50306b) {
                d0VarArr[i16] = m10.o(j6);
            }
            i16++;
        }
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            E0.M m11 = (E0.M) list.get(i17);
            if (d0VarArr[i17] == null) {
                d0VarArr[i17] = m11.o(j6);
            }
        }
        if (size == 0) {
            d0Var2 = null;
        } else {
            d0Var2 = d0VarArr[0];
            int l32 = kf.q.l3(d0VarArr);
            if (l32 != 0) {
                if (d0Var2 != null) {
                    i13 = d0Var2.f4053Y;
                } else {
                    i13 = 0;
                }
                Cf.f it = new Cf.e(1, l32, 1).iterator();
                while (it.f3111h0) {
                    E0.d0 d0Var3 = d0VarArr[it.a()];
                    if (d0Var3 != null) {
                        i14 = d0Var3.f4053Y;
                    } else {
                        i14 = 0;
                    }
                    if (i13 < i14) {
                        d0Var2 = d0Var3;
                        i13 = i14;
                    }
                }
            }
        }
        if (d0Var2 != null) {
            i10 = d0Var2.f4053Y;
        } else {
            i10 = 0;
        }
        if (size != 0) {
            d0Var = d0VarArr[0];
            int l33 = kf.q.l3(d0VarArr);
            if (l33 != 0) {
                if (d0Var != null) {
                    i11 = d0Var.f4054Z;
                } else {
                    i11 = 0;
                }
                Cf.f it2 = new Cf.e(1, l33, 1).iterator();
                while (it2.f3111h0) {
                    E0.d0 d0Var4 = d0VarArr[it2.a()];
                    if (d0Var4 != null) {
                        i12 = d0Var4.f4054Z;
                    } else {
                        i12 = 0;
                    }
                    if (i11 < i12) {
                        d0Var = d0Var4;
                        i11 = i12;
                    }
                }
            }
        }
        if (d0Var != null) {
            i15 = d0Var.f4054Z;
        }
        this.f50280a.f50081d.setValue(new Z0.k(Ng.H.c(i10, i15)));
        return p10.j0(i10, i15, kf.w.f37484Y, new C6479q(d0VarArr, this, i10, i15));
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((E0.r) list.get(0)).m(i10));
            int u02 = AbstractC4344b.u0(list);
            int i11 = 1;
            if (1 <= u02) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((E0.r) list.get(i11)).m(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == u02) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // E0.N
    public final int c(G0.g0 g0Var, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((E0.r) list.get(0)).S(i10));
            int u02 = AbstractC4344b.u0(list);
            int i11 = 1;
            if (1 <= u02) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((E0.r) list.get(i11)).S(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == u02) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // E0.N
    public final int d(G0.g0 g0Var, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((E0.r) list.get(0)).l(i10));
            int u02 = AbstractC4344b.u0(list);
            int i11 = 1;
            if (1 <= u02) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((E0.r) list.get(i11)).l(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == u02) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // E0.N
    public final int e(G0.g0 g0Var, List list, int i10) {
        Integer num;
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
                    if (i11 == u02) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
