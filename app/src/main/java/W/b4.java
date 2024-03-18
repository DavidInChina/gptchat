package W;

import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b4 implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19941a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19942b;

    /* renamed from: c  reason: collision with root package name */
    public final E.g0 f19943c;

    public b4(boolean z10, float f6, E.g0 g0Var) {
        this.f19941a = z10;
        this.f19942b = f6;
        this.f19943c = g0Var;
    }

    public static int g(List list, int i10, S0 s02) {
        E0.r rVar;
        Object obj;
        int i11;
        Object obj2;
        int i12;
        Object obj3;
        int i13;
        Object obj4;
        int i14;
        Object obj5;
        int i15;
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Object obj6 = list.get(i17);
            if (AbstractC3557B.K(X3.d((E0.r) obj6), "TextField")) {
                int intValue = ((Number) s02.invoke(obj6, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i18 = 0;
                while (true) {
                    rVar = null;
                    if (i18 < size2) {
                        obj = list.get(i18);
                        if (AbstractC3557B.K(X3.d((E0.r) obj), "Label")) {
                            break;
                        }
                        i18++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                E0.r rVar2 = (E0.r) obj;
                if (rVar2 != null) {
                    i11 = ((Number) s02.invoke(rVar2, Integer.valueOf(i10))).intValue();
                } else {
                    i11 = 0;
                }
                int size3 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size3) {
                        obj2 = list.get(i19);
                        if (AbstractC3557B.K(X3.d((E0.r) obj2), "Trailing")) {
                            break;
                        }
                        i19++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                E0.r rVar3 = (E0.r) obj2;
                if (rVar3 != null) {
                    i12 = ((Number) s02.invoke(rVar3, Integer.valueOf(i10))).intValue();
                } else {
                    i12 = 0;
                }
                int size4 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size4) {
                        obj3 = list.get(i20);
                        if (AbstractC3557B.K(X3.d((E0.r) obj3), "Prefix")) {
                            break;
                        }
                        i20++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                E0.r rVar4 = (E0.r) obj3;
                if (rVar4 != null) {
                    i13 = ((Number) s02.invoke(rVar4, Integer.valueOf(i10))).intValue();
                } else {
                    i13 = 0;
                }
                int size5 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size5) {
                        obj4 = list.get(i21);
                        if (AbstractC3557B.K(X3.d((E0.r) obj4), "Suffix")) {
                            break;
                        }
                        i21++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                E0.r rVar5 = (E0.r) obj4;
                if (rVar5 != null) {
                    i14 = ((Number) s02.invoke(rVar5, Integer.valueOf(i10))).intValue();
                } else {
                    i14 = 0;
                }
                int size6 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 < size6) {
                        obj5 = list.get(i22);
                        if (AbstractC3557B.K(X3.d((E0.r) obj5), "Leading")) {
                            break;
                        }
                        i22++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                E0.r rVar6 = (E0.r) obj5;
                if (rVar6 != null) {
                    i15 = ((Number) s02.invoke(rVar6, Integer.valueOf(i10))).intValue();
                } else {
                    i15 = 0;
                }
                int size7 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size7) {
                        break;
                    }
                    Object obj7 = list.get(i23);
                    if (AbstractC3557B.K(X3.d((E0.r) obj7), "Hint")) {
                        rVar = obj7;
                        break;
                    }
                    i23++;
                }
                E0.r rVar7 = rVar;
                if (rVar7 != null) {
                    i16 = ((Number) s02.invoke(rVar7, Integer.valueOf(i10))).intValue();
                }
                long j6 = X3.f19834a;
                float f6 = Z3.f19883a;
                int i24 = i13 + i14;
                return Math.max(Math.max(intValue + i24, Math.max(i16 + i24, i11)) + i15 + i12, Z0.a.j(j6));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        Object obj;
        E0.d0 d0Var;
        Object obj2;
        E0.d0 d0Var2;
        Object obj3;
        E0.d0 d0Var3;
        Object obj4;
        E0.d0 d0Var4;
        Object obj5;
        E0.d0 d0Var5;
        Object obj6;
        int i10;
        Object obj7;
        E0.d0 d0Var6;
        E0.d0 d0Var7;
        int i11;
        int i12;
        List list2 = list;
        E.g0 g0Var = this.f19943c;
        int a02 = p10.a0(g0Var.d());
        int a03 = p10.a0(g0Var.a());
        long a5 = Z0.a.a(j6, 0, 0, 0, 0, 10);
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                obj = list2.get(i13);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj), "Leading")) {
                    break;
                }
                i13++;
            } else {
                obj = null;
                break;
            }
        }
        E0.M m10 = (E0.M) obj;
        if (m10 != null) {
            d0Var = m10.o(a5);
        } else {
            d0Var = null;
        }
        int f6 = X3.f(d0Var);
        int max = Math.max(0, X3.e(d0Var));
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size2) {
                obj2 = list2.get(i14);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj2), "Trailing")) {
                    break;
                }
                i14++;
            } else {
                obj2 = null;
                break;
            }
        }
        E0.M m11 = (E0.M) obj2;
        if (m11 != null) {
            d0Var2 = m11.o(A7.b.o1(-f6, 0, 2, a5));
        } else {
            d0Var2 = null;
        }
        int f10 = X3.f(d0Var2) + f6;
        int max2 = Math.max(max, X3.e(d0Var2));
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 < size3) {
                obj3 = list2.get(i15);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj3), "Prefix")) {
                    break;
                }
                i15++;
            } else {
                obj3 = null;
                break;
            }
        }
        E0.M m12 = (E0.M) obj3;
        if (m12 != null) {
            d0Var3 = m12.o(A7.b.o1(-f10, 0, 2, a5));
        } else {
            d0Var3 = null;
        }
        int f11 = X3.f(d0Var3) + f10;
        int max3 = Math.max(max2, X3.e(d0Var3));
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size4) {
                obj4 = list2.get(i16);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj4), "Suffix")) {
                    break;
                }
                i16++;
            } else {
                obj4 = null;
                break;
            }
        }
        E0.M m13 = (E0.M) obj4;
        if (m13 != null) {
            d0Var4 = m13.o(A7.b.o1(-f11, 0, 2, a5));
        } else {
            d0Var4 = null;
        }
        int f12 = X3.f(d0Var4) + f11;
        int max4 = Math.max(max3, X3.e(d0Var4));
        int i17 = -f12;
        long n12 = A7.b.n1(a5, i17, -a03);
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 < size5) {
                Object obj8 = list2.get(i18);
                int i19 = size5;
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj8), "Label")) {
                    obj5 = obj8;
                    break;
                }
                i18++;
                size5 = i19;
            } else {
                obj5 = null;
                break;
            }
        }
        E0.M m14 = (E0.M) obj5;
        if (m14 != null) {
            d0Var5 = m14.o(n12);
        } else {
            d0Var5 = null;
        }
        int size6 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 < size6) {
                obj6 = list2.get(i20);
                int i21 = size6;
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj6), "Supporting")) {
                    break;
                }
                i20++;
                size6 = i21;
            } else {
                obj6 = null;
                break;
            }
        }
        E0.M m15 = (E0.M) obj6;
        if (m15 != null) {
            i10 = m15.S(Z0.a.j(j6));
        } else {
            i10 = 0;
        }
        int e10 = X3.e(d0Var5) + a02;
        long n13 = A7.b.n1(Z0.a.a(j6, 0, 0, 0, 0, 11), i17, ((-e10) - a03) - i10);
        int size7 = list.size();
        int i22 = 0;
        while (i22 < size7) {
            int i23 = size7;
            E0.M m16 = (E0.M) list2.get(i22);
            int i24 = i22;
            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m16), "TextField")) {
                E0.d0 o10 = m16.o(n13);
                long a10 = Z0.a.a(n13, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 < size8) {
                        obj7 = list2.get(i25);
                        int i26 = size8;
                        if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj7), "Hint")) {
                            break;
                        }
                        i25++;
                        list2 = list;
                        size8 = i26;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                E0.M m17 = (E0.M) obj7;
                if (m17 != null) {
                    d0Var6 = m17.o(a10);
                } else {
                    d0Var6 = null;
                }
                int max5 = Math.max(max4, Math.max(X3.e(o10), X3.e(d0Var6)) + e10 + a03);
                int f13 = X3.f(d0Var);
                int f14 = X3.f(d0Var2);
                int f15 = X3.f(d0Var3) + X3.f(d0Var4);
                int max6 = Math.max(Math.max(o10.f4053Y + f15, Math.max(X3.f(d0Var6) + f15, X3.f(d0Var5))) + f13 + f14, Z0.a.j(j6));
                long a11 = Z0.a.a(A7.b.o1(0, -max5, 1, a5), 0, max6, 0, 0, 9);
                if (m15 != null) {
                    d0Var7 = m15.o(a11);
                } else {
                    d0Var7 = null;
                }
                int e11 = X3.e(d0Var7);
                int c10 = Z3.c(o10.f4054Z, X3.e(d0Var5), X3.e(d0Var), X3.e(d0Var2), X3.e(d0Var3), X3.e(d0Var4), X3.e(d0Var6), X3.e(d0Var7), this.f19942b, j6, p10.b(), this.f19943c);
                int i27 = c10 - e11;
                int size9 = list.size();
                int i28 = 0;
                while (i28 < size9) {
                    E0.M m18 = (E0.M) list.get(i28);
                    int i29 = size9;
                    if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m18), "Container")) {
                        if (max6 != Integer.MAX_VALUE) {
                            i11 = max6;
                        } else {
                            i11 = 0;
                        }
                        if (i27 != Integer.MAX_VALUE) {
                            i12 = i27;
                        } else {
                            i12 = 0;
                        }
                        return p10.j0(max6, c10, kf.w.f37484Y, new a4(d0Var5, max6, c10, o10, d0Var6, d0Var, d0Var2, d0Var3, d0Var4, m18.o(A7.b.m(i11, max6, i12, i27)), d0Var7, this, a02, p10));
                    }
                    i28++;
                    size9 = i29;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            list2 = list;
            i22 = i24 + 1;
            size7 = i23;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        return g(list, i10, S0.f19645C0);
    }

    @Override // E0.N
    public final int c(G0.g0 g0Var, List list, int i10) {
        return f(g0Var, list, i10, S0.f19646D0);
    }

    @Override // E0.N
    public final int d(G0.g0 g0Var, List list, int i10) {
        return g(list, i10, S0.f19647E0);
    }

    @Override // E0.N
    public final int e(G0.g0 g0Var, List list, int i10) {
        return f(g0Var, list, i10, S0.f19644B0);
    }

    public final int f(G0.g0 g0Var, List list, int i10, S0 s02) {
        Object obj;
        int i11;
        int i12;
        Object obj2;
        int i13;
        Object obj3;
        int i14;
        Object obj4;
        int i15;
        Object obj5;
        int i16;
        Object obj6;
        int i17;
        Object obj7;
        int i18;
        int size = list.size();
        int i19 = 0;
        while (true) {
            if (i19 < size) {
                obj = list.get(i19);
                if (AbstractC3557B.K(X3.d((E0.r) obj), "Leading")) {
                    break;
                }
                i19++;
            } else {
                obj = null;
                break;
            }
        }
        E0.r rVar = (E0.r) obj;
        if (rVar != null) {
            int m10 = rVar.m(Integer.MAX_VALUE);
            if (i10 == Integer.MAX_VALUE) {
                i12 = i10;
            } else {
                i12 = i10 - m10;
            }
            i11 = ((Number) s02.invoke(rVar, Integer.valueOf(i10))).intValue();
        } else {
            i12 = i10;
            i11 = 0;
        }
        int size2 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 < size2) {
                obj2 = list.get(i20);
                if (AbstractC3557B.K(X3.d((E0.r) obj2), "Trailing")) {
                    break;
                }
                i20++;
            } else {
                obj2 = null;
                break;
            }
        }
        E0.r rVar2 = (E0.r) obj2;
        if (rVar2 != null) {
            int m11 = rVar2.m(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= m11;
            }
            i13 = ((Number) s02.invoke(rVar2, Integer.valueOf(i10))).intValue();
        } else {
            i13 = 0;
        }
        int size3 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 < size3) {
                obj3 = list.get(i21);
                if (AbstractC3557B.K(X3.d((E0.r) obj3), "Label")) {
                    break;
                }
                i21++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (E0.r) obj3;
        if (obj8 != null) {
            i14 = ((Number) s02.invoke(obj8, Integer.valueOf(i12))).intValue();
        } else {
            i14 = 0;
        }
        int size4 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 < size4) {
                obj4 = list.get(i22);
                if (AbstractC3557B.K(X3.d((E0.r) obj4), "Prefix")) {
                    break;
                }
                i22++;
            } else {
                obj4 = null;
                break;
            }
        }
        E0.r rVar3 = (E0.r) obj4;
        if (rVar3 != null) {
            int intValue = ((Number) s02.invoke(rVar3, Integer.valueOf(i12))).intValue();
            int m12 = rVar3.m(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= m12;
            }
            i15 = intValue;
        } else {
            i15 = 0;
        }
        int size5 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 < size5) {
                obj5 = list.get(i23);
                if (AbstractC3557B.K(X3.d((E0.r) obj5), "Suffix")) {
                    break;
                }
                i23++;
            } else {
                obj5 = null;
                break;
            }
        }
        E0.r rVar4 = (E0.r) obj5;
        if (rVar4 != null) {
            int intValue2 = ((Number) s02.invoke(rVar4, Integer.valueOf(i12))).intValue();
            int m13 = rVar4.m(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= m13;
            }
            i16 = intValue2;
        } else {
            i16 = 0;
        }
        int size6 = list.size();
        for (int i24 = 0; i24 < size6; i24++) {
            Object obj9 = list.get(i24);
            if (AbstractC3557B.K(X3.d((E0.r) obj9), "TextField")) {
                int intValue3 = ((Number) s02.invoke(obj9, Integer.valueOf(i12))).intValue();
                int size7 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 < size7) {
                        obj6 = list.get(i25);
                        if (AbstractC3557B.K(X3.d((E0.r) obj6), "Hint")) {
                            break;
                        }
                        i25++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (E0.r) obj6;
                if (obj10 != null) {
                    i17 = ((Number) s02.invoke(obj10, Integer.valueOf(i12))).intValue();
                } else {
                    i17 = 0;
                }
                int size8 = list.size();
                int i26 = 0;
                while (true) {
                    if (i26 < size8) {
                        Object obj11 = list.get(i26);
                        if (AbstractC3557B.K(X3.d((E0.r) obj11), "Supporting")) {
                            obj7 = obj11;
                            break;
                        }
                        i26++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj12 = (E0.r) obj7;
                if (obj12 != null) {
                    i18 = ((Number) s02.invoke(obj12, Integer.valueOf(i10))).intValue();
                } else {
                    i18 = 0;
                }
                return Z3.c(intValue3, i14, i11, i13, i15, i16, i17, i18, this.f19942b, X3.f19834a, g0Var.b(), this.f19943c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
