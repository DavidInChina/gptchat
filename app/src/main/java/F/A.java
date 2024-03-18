package F;

import E0.c0;
import E0.d0;
import G.AbstractC0564t;
import G.C0560o;
import java.util.List;
import l0.AbstractC4311c;
import l0.AbstractC4312d;
import l0.C4317i;

/* loaded from: classes.dex */
public final class A implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int f4826a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4827b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4828c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC4311c f4829d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC4312d f4830e;

    /* renamed from: f  reason: collision with root package name */
    public final Z0.l f4831f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4832g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4833h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4834i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4835j;

    /* renamed from: k  reason: collision with root package name */
    public final long f4836k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f4837l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f4838m;

    /* renamed from: n  reason: collision with root package name */
    public final C0538l f4839n;

    /* renamed from: o  reason: collision with root package name */
    public int f4840o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4841p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4842q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4843r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4844s;

    /* renamed from: t  reason: collision with root package name */
    public int f4845t = Integer.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public int f4846u;

    /* renamed from: v  reason: collision with root package name */
    public int f4847v;

    /* renamed from: w  reason: collision with root package name */
    public final int[] f4848w;

    public A(int i10, List list, boolean z10, AbstractC4311c abstractC4311c, AbstractC4312d abstractC4312d, Z0.l lVar, boolean z11, int i11, int i12, int i13, long j6, Object obj, Object obj2, C0538l c0538l) {
        int i14;
        int i15;
        this.f4826a = i10;
        this.f4827b = list;
        this.f4828c = z10;
        this.f4829d = abstractC4311c;
        this.f4830e = abstractC4312d;
        this.f4831f = lVar;
        this.f4832g = z11;
        this.f4833h = i11;
        this.f4834i = i12;
        this.f4835j = i13;
        this.f4836k = j6;
        this.f4837l = obj;
        this.f4838m = obj2;
        this.f4839n = c0538l;
        int size = list.size();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            d0 d0Var = (d0) list.get(i19);
            boolean z12 = this.f4828c;
            if (z12) {
                i14 = d0Var.f4054Z;
            } else {
                i14 = d0Var.f4053Y;
            }
            i17 += i14;
            if (!z12) {
                i15 = d0Var.f4054Z;
            } else {
                i15 = d0Var.f4053Y;
            }
            i18 = Math.max(i18, i15);
        }
        this.f4841p = i17;
        int i20 = i17 + this.f4835j;
        this.f4842q = i20 >= 0 ? i20 : i16;
        this.f4843r = i18;
        this.f4848w = new int[this.f4827b.size() * 2];
    }

    public final int a(long j6) {
        long j10;
        if (this.f4828c) {
            int i10 = Z0.i.f22798c;
            j10 = j6 & 4294967295L;
        } else {
            int i11 = Z0.i.f22798c;
            j10 = j6 >> 32;
        }
        return (int) j10;
    }

    public final long b(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f4848w;
        return kotlin.jvm.internal.m.c(iArr[i11], iArr[i11 + 1]);
    }

    public final void c(c0 c0Var, boolean z10) {
        int i10;
        G.r rVar;
        int i11;
        List list;
        wf.k kVar;
        int i12;
        int i13;
        int i14;
        int i15;
        G.r[] rVarArr;
        if (this.f4845t != Integer.MIN_VALUE) {
            List list2 = this.f4827b;
            int i16 = 0;
            for (int size = list2.size(); i16 < size; size = i11) {
                d0 d0Var = (d0) list2.get(i16);
                int i17 = this.f4846u;
                boolean z11 = this.f4828c;
                if (z11) {
                    i10 = d0Var.f4054Z;
                } else {
                    i10 = d0Var.f4053Y;
                }
                int i18 = i17 - i10;
                int i19 = this.f4847v;
                long b10 = b(i16);
                C0536j c0536j = (C0536j) this.f4839n.f4933a.get(this.f4837l);
                if (c0536j != null && (rVarArr = c0536j.f4930a) != null) {
                    rVar = rVarArr[i16];
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    if (z10) {
                        rVar.f5562l = b10;
                        list = list2;
                        i11 = size;
                    } else {
                        if (!Z0.i.a(rVar.f5562l, G.r.f5549m)) {
                            b10 = rVar.f5562l;
                        }
                        long j6 = ((Z0.i) rVar.f5559i.getValue()).f22799a;
                        list = list2;
                        i11 = size;
                        long c10 = kotlin.jvm.internal.m.c(((int) (b10 >> 32)) + ((int) (j6 >> 32)), ((int) (b10 & 4294967295L)) + ((int) (j6 & 4294967295L)));
                        if (((a(b10) <= i18 && a(c10) <= i18) || (a(b10) >= i19 && a(c10) >= i19)) && ((Boolean) rVar.f5554d.getValue()).booleanValue()) {
                            Ad.l.O0(rVar.f5551a, null, null, new C0560o(rVar, null), 3);
                        }
                        b10 = c10;
                    }
                    kVar = rVar.f5561k;
                } else {
                    list = list2;
                    i11 = size;
                    kVar = AbstractC0564t.f5567b;
                }
                if (this.f4832g) {
                    if (z11) {
                        int i20 = Z0.i.f22798c;
                        i12 = (int) (b10 >> 32);
                    } else {
                        int i21 = Z0.i.f22798c;
                        int i22 = this.f4845t - ((int) (b10 >> 32));
                        if (z11) {
                            i15 = d0Var.f4054Z;
                        } else {
                            i15 = d0Var.f4053Y;
                        }
                        i12 = i22 - i15;
                    }
                    if (z11) {
                        int i23 = this.f4845t - ((int) (b10 & 4294967295L));
                        if (z11) {
                            i14 = d0Var.f4054Z;
                        } else {
                            i14 = d0Var.f4053Y;
                        }
                        i13 = i23 - i14;
                    } else {
                        i13 = (int) (b10 & 4294967295L);
                    }
                    b10 = kotlin.jvm.internal.m.c(i12, i13);
                }
                int i24 = Z0.i.f22798c;
                long j10 = this.f4836k;
                long c11 = kotlin.jvm.internal.m.c(((int) (b10 >> 32)) + ((int) (j10 >> 32)), ((int) (b10 & 4294967295L)) + ((int) (j10 & 4294967295L)));
                if (z11) {
                    c0.m(c0Var, d0Var, c11, kVar, 2);
                } else {
                    c0.i(c0Var, d0Var, c11, kVar, 2);
                }
                i16++;
                list2 = list;
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void d(int i10, int i11, int i12) {
        int i13;
        int i14;
        this.f4840o = i10;
        boolean z10 = this.f4828c;
        if (z10) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f4845t = i13;
        List list = this.f4827b;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            d0 d0Var = (d0) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f4848w;
            if (z10) {
                AbstractC4311c abstractC4311c = this.f4829d;
                if (abstractC4311c != null) {
                    iArr[i16] = abstractC4311c.a(d0Var.f4053Y, i11, this.f4831f);
                    iArr[i16 + 1] = i10;
                    i14 = d0Var.f4054Z;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
            } else {
                iArr[i16] = i10;
                int i17 = i16 + 1;
                AbstractC4312d abstractC4312d = this.f4830e;
                if (abstractC4312d != null) {
                    iArr[i17] = ((C4317i) abstractC4312d).a(d0Var.f4054Z, i12);
                    i14 = d0Var.f4053Y;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
            }
            i10 += i14;
        }
        this.f4846u = -this.f4833h;
        this.f4847v = this.f4845t + this.f4834i;
    }
}
