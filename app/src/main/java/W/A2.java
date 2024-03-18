package W;

import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;
import nf.AbstractC4828h;
import q0.C5254f;

/* loaded from: classes.dex */
public final class A2 implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f18977a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18978b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18979c;

    /* renamed from: d  reason: collision with root package name */
    public final E.g0 f18980d;

    public A2(wf.k kVar, boolean z10, float f6, E.g0 g0Var) {
        this.f18977a = kVar;
        this.f18978b = z10;
        this.f18979c = f6;
        this.f18980d = g0Var;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        Object obj;
        E0.d0 d0Var;
        Object obj2;
        E0.d0 d0Var2;
        Object obj3;
        E0.d0 d0Var3;
        E0.d0 d0Var4;
        Object obj4;
        E0.d0 d0Var5;
        E0.d0 d0Var6;
        Object obj5;
        E0.d0 d0Var7;
        Object obj6;
        int i10;
        Object obj7;
        E0.d0 d0Var8;
        E0.d0 d0Var9;
        int i11;
        int i12;
        E.g0 g0Var = this.f18980d;
        int a02 = p10.a0(g0Var.a());
        long a5 = Z0.a.a(j6, 0, 0, 0, 0, 10);
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                obj = list.get(i13);
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
                obj2 = list.get(i14);
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
                obj3 = list.get(i15);
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
            d0Var3 = d0Var;
            d0Var4 = m12.o(A7.b.o1(-f10, 0, 2, a5));
        } else {
            d0Var3 = d0Var;
            d0Var4 = null;
        }
        int f11 = X3.f(d0Var4) + f10;
        int max3 = Math.max(max2, X3.e(d0Var4));
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size4) {
                obj4 = list.get(i16);
                int i17 = size4;
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj4), "Suffix")) {
                    break;
                }
                i16++;
                size4 = i17;
            } else {
                obj4 = null;
                break;
            }
        }
        E0.M m13 = (E0.M) obj4;
        if (m13 != null) {
            d0Var5 = m13.o(A7.b.o1(-f11, 0, 2, a5));
        } else {
            d0Var5 = null;
        }
        int f12 = X3.f(d0Var5) + f11;
        int max4 = Math.max(max3, X3.e(d0Var5));
        E0.P p11 = p10;
        int a03 = p11.a0(g0Var.c(p10.getLayoutDirection())) + p11.a0(g0Var.b(p10.getLayoutDirection()));
        int i18 = -f12;
        A2 a22 = this;
        int M10 = K4.J.M(a22.f18979c, i18 - a03, -a03);
        int i19 = -a02;
        E0.d0 d0Var10 = d0Var5;
        long n12 = A7.b.n1(a5, M10, i19);
        int size5 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 < size5) {
                obj5 = list.get(i20);
                int i21 = size5;
                d0Var6 = d0Var10;
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj5), "Label")) {
                    break;
                }
                i20++;
                d0Var10 = d0Var6;
                size5 = i21;
            } else {
                d0Var6 = d0Var10;
                obj5 = null;
                break;
            }
        }
        E0.M m14 = (E0.M) obj5;
        if (m14 != null) {
            d0Var7 = m14.o(n12);
        } else {
            d0Var7 = null;
        }
        if (d0Var7 != null) {
            a22.f18977a.invoke(new C5254f(AbstractC4828h.i(d0Var7.f4053Y, d0Var7.f4054Z)));
        }
        int size6 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 < size6) {
                obj6 = list.get(i22);
                int i23 = size6;
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj6), "Supporting")) {
                    break;
                }
                i22++;
                size6 = i23;
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
        int max5 = Math.max(X3.e(d0Var7) / 2, p11.a0(g0Var.d()));
        long a10 = Z0.a.a(A7.b.n1(j6, i18, (i19 - max5) - i10), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i24 = 0;
        while (i24 < size7) {
            int i25 = size7;
            E0.M m16 = (E0.M) list.get(i24);
            int i26 = i24;
            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m16), "TextField")) {
                E0.d0 o10 = m16.o(a10);
                long a11 = Z0.a.a(a10, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i27 = 0;
                while (true) {
                    if (i27 < size8) {
                        obj7 = list.get(i27);
                        int i28 = size8;
                        if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj7), "Hint")) {
                            break;
                        }
                        i27++;
                        size8 = i28;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                E0.M m17 = (E0.M) obj7;
                if (m17 != null) {
                    d0Var8 = m17.o(a11);
                } else {
                    d0Var8 = null;
                }
                int max6 = Math.max(max4, Math.max(X3.e(o10), X3.e(d0Var8)) + max5 + a02);
                int e10 = AbstractC1643y2.e(X3.f(d0Var3), X3.f(d0Var2), X3.f(d0Var4), X3.f(d0Var6), o10.f4053Y, X3.f(d0Var7), X3.f(d0Var8), a22.f18979c, j6, p10.b(), a22.f18980d);
                long a12 = Z0.a.a(A7.b.o1(0, -max6, 1, a5), 0, e10, 0, 0, 9);
                if (m15 != null) {
                    d0Var9 = m15.o(a12);
                } else {
                    d0Var9 = null;
                }
                int e11 = X3.e(d0Var9);
                int d10 = AbstractC1643y2.d(X3.e(d0Var3), X3.e(d0Var2), X3.e(d0Var4), X3.e(d0Var6), o10.f4054Z, X3.e(d0Var7), X3.e(d0Var8), X3.e(d0Var9), a22.f18979c, j6, p10.b(), a22.f18980d);
                int i29 = d10 - e11;
                int size9 = list.size();
                for (int i30 = 0; i30 < size9; i30++) {
                    E0.M m18 = (E0.M) list.get(i30);
                    if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m18), "Container")) {
                        if (e10 != Integer.MAX_VALUE) {
                            i11 = e10;
                        } else {
                            i11 = 0;
                        }
                        if (i29 != Integer.MAX_VALUE) {
                            i12 = i29;
                        } else {
                            i12 = 0;
                        }
                        return p10.j0(e10, d10, kf.w.f37484Y, new C1648z2(d10, e10, d0Var3, d0Var2, d0Var4, d0Var6, o10, d0Var7, d0Var8, m18.o(A7.b.m(i11, e10, i12, i29)), d0Var9, this, p10));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i24 = i26 + 1;
            size7 = i25;
            a22 = this;
            p11 = p11;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        return g(g0Var, list, i10, S0.f19666x0);
    }

    @Override // E0.N
    public final int c(G0.g0 g0Var, List list, int i10) {
        return f(g0Var, list, i10, S0.f19667y0);
    }

    @Override // E0.N
    public final int d(G0.g0 g0Var, List list, int i10) {
        return g(g0Var, list, i10, S0.f19668z0);
    }

    @Override // E0.N
    public final int e(G0.g0 g0Var, List list, int i10) {
        return f(g0Var, list, i10, S0.f19665w0);
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
            i14 = ((Number) s02.invoke(obj8, Integer.valueOf(K4.J.M(this.f18979c, i12, i10)))).intValue();
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
            i15 = ((Number) s02.invoke(rVar3, Integer.valueOf(i12))).intValue();
            int m12 = rVar3.m(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= m12;
            }
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
            int intValue = ((Number) s02.invoke(rVar4, Integer.valueOf(i12))).intValue();
            int m13 = rVar4.m(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= m13;
            }
            i16 = intValue;
        } else {
            i16 = 0;
        }
        int size6 = list.size();
        for (int i24 = 0; i24 < size6; i24++) {
            Object obj9 = list.get(i24);
            if (AbstractC3557B.K(X3.d((E0.r) obj9), "TextField")) {
                int intValue2 = ((Number) s02.invoke(obj9, Integer.valueOf(i12))).intValue();
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
                return AbstractC1643y2.d(i11, i13, i15, i16, intValue2, i14, i17, i18, this.f18979c, X3.f19834a, g0Var.b(), this.f18980d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int g(G0.g0 g0Var, List list, int i10, S0 s02) {
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
                        if (AbstractC3557B.K(X3.d((E0.r) obj3), "Leading")) {
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
                        if (AbstractC3557B.K(X3.d((E0.r) obj4), "Prefix")) {
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
                        if (AbstractC3557B.K(X3.d((E0.r) obj5), "Suffix")) {
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
                return AbstractC1643y2.e(i13, i12, i14, i15, intValue, i11, i16, this.f18979c, X3.f19834a, g0Var.b(), this.f18980d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
