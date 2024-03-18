package E;

import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3921a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0425i f3922b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0427k f3923c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3924d;

    /* renamed from: e  reason: collision with root package name */
    public final r.f f3925e;

    /* renamed from: f  reason: collision with root package name */
    public final List f3926f;

    /* renamed from: g  reason: collision with root package name */
    public final E0.d0[] f3927g;

    /* renamed from: h  reason: collision with root package name */
    public final o0[] f3928h;

    public n0(int i10, AbstractC0425i abstractC0425i, AbstractC0427k abstractC0427k, float f6, r.f fVar, List list, E0.d0[] d0VarArr) {
        this.f3921a = i10;
        this.f3922b = abstractC0425i;
        this.f3923c = abstractC0427k;
        this.f3924d = f6;
        this.f3925e = fVar;
        this.f3926f = list;
        this.f3927g = d0VarArr;
        int size = list.size();
        o0[] o0VarArr = new o0[size];
        for (int i11 = 0; i11 < size; i11++) {
            o0VarArr[i11] = androidx.compose.foundation.layout.a.k((E0.r) this.f3926f.get(i11));
        }
        this.f3928h = o0VarArr;
    }

    public final int a(E0.d0 d0Var) {
        if (this.f3921a == 1) {
            return d0Var.f4054Z;
        }
        return d0Var.f4053Y;
    }

    public final int b(E0.d0 d0Var) {
        if (this.f3921a == 1) {
            return d0Var.f4053Y;
        }
        return d0Var.f4054Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l0 c(E0.P p10, long j6, int i10, int i11) {
        List list;
        o0[] o0VarArr;
        E0.d0[] d0VarArr;
        int i12;
        o0[] o0VarArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        r.f fVar;
        Integer num;
        int i18;
        float f6;
        long j10;
        o0[] o0VarArr3;
        float f10;
        List list2;
        int i19;
        int i20;
        int i21;
        boolean z10;
        r.f fVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        float f11;
        r.f fVar3;
        int i26;
        int i27 = i11;
        int i28 = this.f3921a;
        long i29 = androidx.compose.foundation.layout.a.i(j6, i28);
        long a02 = p10.a0(this.f3924d);
        int i30 = i27 - i10;
        float f12 = 0.0f;
        int i31 = i10;
        float f13 = 0.0f;
        int i32 = 0;
        long j11 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean z11 = false;
        while (true) {
            list = this.f3926f;
            o0VarArr = this.f3928h;
            d0VarArr = this.f3927g;
            if (i31 >= i27) {
                break;
            }
            E0.M m10 = (E0.M) list.get(i31);
            o0 o0Var = o0VarArr[i31];
            float l10 = androidx.compose.foundation.layout.a.l(o0Var);
            if (l10 > f12) {
                f13 += l10;
                i32++;
                i23 = i28;
                i22 = i30;
            } else {
                int h10 = Z0.a.h(i29);
                E0.d0 d0Var = d0VarArr[i31];
                if (d0Var == null) {
                    if (h10 == Integer.MAX_VALUE) {
                        i24 = i30;
                        i25 = i32;
                        f11 = f13;
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i24 = i30;
                        i25 = i32;
                        f11 = f13;
                        i26 = (int) com.google.android.gms.internal.play_billing.N.k(h10 - j11, 0L);
                    }
                    d0Var = m10.o(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.a.j(i29, 0, i26, 8), i28));
                } else {
                    i24 = i30;
                    i25 = i32;
                    f11 = f13;
                }
                E0.d0 d0Var2 = d0Var;
                i23 = i28;
                i22 = i24;
                i33 = Math.min((int) a02, (int) com.google.android.gms.internal.play_billing.N.k((h10 - j11) - b(d0Var2), 0L));
                j11 += b(d0Var2) + i33;
                i34 = Math.max(i34, a(d0Var2));
                if (!z11) {
                    if (o0Var != null) {
                        fVar3 = o0Var.f3933c;
                    } else {
                        fVar3 = null;
                    }
                    if (fVar3 == null || !(fVar3 instanceof C)) {
                        z11 = false;
                        d0VarArr[i31] = d0Var2;
                        f13 = f11;
                        i32 = i25;
                    }
                }
                z11 = true;
                d0VarArr[i31] = d0Var2;
                f13 = f11;
                i32 = i25;
            }
            i31++;
            i27 = i11;
            i28 = i23;
            i30 = i22;
            f12 = 0.0f;
        }
        int i35 = i28;
        int i36 = i30;
        float f14 = f13;
        int i37 = i34;
        if (i32 == 0) {
            j11 -= i33;
            i14 = i11;
            o0VarArr2 = o0VarArr;
            i15 = i35;
            i13 = 0;
        } else {
            int i38 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i38 > 0 && Z0.a.h(i29) != Integer.MAX_VALUE) {
                i18 = Z0.a.h(i29);
            } else {
                i18 = Z0.a.j(i29);
            }
            long j12 = a02 * (i12 - 1);
            long k10 = com.google.android.gms.internal.play_billing.N.k((i18 - j11) - j12, 0L);
            if (i38 > 0) {
                f6 = ((float) k10) / f14;
            } else {
                f6 = 0.0f;
            }
            Cf.f it = com.google.android.gms.internal.play_billing.N.D0(i10, i11).iterator();
            int i39 = 0;
            while (it.f3111h0) {
                i39 += AbstractC4344b.Y0(androidx.compose.foundation.layout.a.l(o0VarArr[it.a()]) * f6);
            }
            long j13 = k10 - i39;
            int i40 = i10;
            i14 = i11;
            int i41 = 0;
            while (i40 < i14) {
                if (d0VarArr[i40] == null) {
                    E0.M m11 = (E0.M) list.get(i40);
                    list2 = list;
                    o0 o0Var2 = o0VarArr[i40];
                    float l11 = androidx.compose.foundation.layout.a.l(o0Var2);
                    if (l11 > 0.0f) {
                        int i42 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        if (i42 < 0) {
                            j10 = j12;
                            o0VarArr3 = o0VarArr;
                            i20 = -1;
                        } else if (i42 > 0) {
                            j10 = j12;
                            o0VarArr3 = o0VarArr;
                            i20 = 1;
                        } else {
                            j10 = j12;
                            o0VarArr3 = o0VarArr;
                            i20 = 0;
                        }
                        j13 -= i20;
                        int max = Math.max(0, AbstractC4344b.Y0(l11 * f6) + i20);
                        if ((o0Var2 == null || o0Var2.f3932b) && max != Integer.MAX_VALUE) {
                            i21 = max;
                            f10 = f6;
                            i19 = i35;
                            E0.d0 o10 = m11.o(androidx.compose.foundation.layout.a.x(A7.b.m(i21, max, 0, Z0.a.g(i29)), i19));
                            int b10 = b(o10) + i41;
                            i37 = Math.max(i37, a(o10));
                            if (!z11) {
                                if (o0Var2 != null) {
                                    fVar2 = o0Var2.f3933c;
                                } else {
                                    fVar2 = null;
                                }
                                if (fVar2 == null || !(fVar2 instanceof C)) {
                                    z10 = false;
                                    d0VarArr[i40] = o10;
                                    z11 = z10;
                                    i41 = b10;
                                }
                            }
                            z10 = true;
                            d0VarArr[i40] = o10;
                            z11 = z10;
                            i41 = b10;
                        }
                        i21 = 0;
                        f10 = f6;
                        i19 = i35;
                        E0.d0 o102 = m11.o(androidx.compose.foundation.layout.a.x(A7.b.m(i21, max, 0, Z0.a.g(i29)), i19));
                        int b102 = b(o102) + i41;
                        i37 = Math.max(i37, a(o102));
                        if (!z11) {
                        }
                        z10 = true;
                        d0VarArr[i40] = o102;
                        z11 = z10;
                        i41 = b102;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f10 = f6;
                    j10 = j12;
                    o0VarArr3 = o0VarArr;
                    list2 = list;
                    i19 = i35;
                }
                i40++;
                i35 = i19;
                list = list2;
                f6 = f10;
                o0VarArr = o0VarArr3;
                j12 = j10;
            }
            o0VarArr2 = o0VarArr;
            i15 = i35;
            i13 = (int) com.google.android.gms.internal.play_billing.N.q(i41 + j12, 0L, Z0.a.h(i29) - j11);
        }
        if (z11) {
            int i43 = 0;
            i17 = 0;
            for (int i44 = i10; i44 < i14; i44++) {
                E0.d0 d0Var3 = d0VarArr[i44];
                AbstractC3557B.Z(d0Var3);
                o0 o0Var3 = o0VarArr2[i44];
                if (o0Var3 != null) {
                    fVar = o0Var3.f3933c;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    num = fVar.h(d0Var3);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i43 = Math.max(i43, intValue);
                    int a5 = a(d0Var3);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = a(d0Var3);
                    }
                    i17 = Math.max(i17, a5 - intValue2);
                }
            }
            i16 = i43;
        } else {
            i17 = 0;
            i16 = 0;
        }
        int max2 = Math.max((int) com.google.android.gms.internal.play_billing.N.k(j11 + i13, 0L), Z0.a.j(i29));
        Z0.a.g(i29);
        int max3 = Math.max(i37, Math.max(Z0.a.i(i29), i17 + i16));
        int[] iArr = new int[i36];
        for (int i45 = 0; i45 < i36; i45++) {
            iArr[i45] = 0;
        }
        int[] iArr2 = new int[i36];
        for (int i46 = 0; i46 < i36; i46++) {
            E0.d0 d0Var4 = d0VarArr[i46 + i10];
            AbstractC3557B.Z(d0Var4);
            iArr2[i46] = b(d0Var4);
        }
        if (i15 == 2) {
            AbstractC0427k abstractC0427k = this.f3923c;
            if (abstractC0427k != null) {
                abstractC0427k.c(p10, max2, iArr2, iArr);
            } else {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
        } else {
            AbstractC0425i abstractC0425i = this.f3922b;
            if (abstractC0425i != null) {
                abstractC0425i.b(p10, max2, iArr2, p10.getLayoutDirection(), iArr);
            } else {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
        }
        return new l0(max3, max2, i10, i11, i16, iArr);
    }

    public final void d(E0.c0 c0Var, l0 l0Var, int i10, Z0.l lVar) {
        o0 o0Var;
        r.f fVar;
        Z0.l lVar2;
        for (int i11 = l0Var.f3903c; i11 < l0Var.f3904d; i11++) {
            E0.d0 d0Var = this.f3927g[i11];
            AbstractC3557B.Z(d0Var);
            Object u10 = ((E0.M) this.f3926f.get(i11)).u();
            if (u10 instanceof o0) {
                o0Var = (o0) u10;
            } else {
                o0Var = null;
            }
            if (o0Var == null || (fVar = o0Var.f3933c) == null) {
                fVar = this.f3925e;
            }
            int a5 = l0Var.f3901a - a(d0Var);
            int i12 = this.f3921a;
            if (i12 == 1) {
                lVar2 = Z0.l.f22805Y;
            } else {
                lVar2 = lVar;
            }
            int f6 = fVar.f(a5, lVar2, d0Var, l0Var.f3905e) + i10;
            int i13 = l0Var.f3903c;
            int[] iArr = l0Var.f3906f;
            if (i12 == 1) {
                E0.c0.d(c0Var, d0Var, iArr[i11 - i13], f6);
            } else {
                E0.c0.d(c0Var, d0Var, f6, iArr[i11 - i13]);
            }
        }
    }
}
