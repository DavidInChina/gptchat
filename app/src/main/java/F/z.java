package F;

import B.W0;
import E0.O;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z implements x, O {

    /* renamed from: a  reason: collision with root package name */
    public final A f5006a;

    /* renamed from: b  reason: collision with root package name */
    public int f5007b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5008c;

    /* renamed from: d  reason: collision with root package name */
    public float f5009d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5010e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5011f;

    /* renamed from: g  reason: collision with root package name */
    public final List f5012g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5013h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5014i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5015j;

    /* renamed from: k  reason: collision with root package name */
    public final W0 f5016k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5017l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5018m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ O f5019n;

    public z(A a5, int i10, boolean z10, float f6, O o10, float f10, boolean z11, List list, int i11, int i12, int i13, W0 w02, int i14, int i15) {
        this.f5006a = a5;
        this.f5007b = i10;
        this.f5008c = z10;
        this.f5009d = f6;
        this.f5010e = f10;
        this.f5011f = z11;
        this.f5012g = list;
        this.f5013h = i11;
        this.f5014i = i12;
        this.f5015j = i13;
        this.f5016k = w02;
        this.f5017l = i14;
        this.f5018m = i15;
        this.f5019n = o10;
    }

    @Override // E0.O
    public final Map a() {
        return this.f5019n.a();
    }

    @Override // E0.O
    public final void b() {
        this.f5019n.b();
    }

    public final boolean c(int i10, boolean z10) {
        A a5;
        int i11;
        boolean z11;
        G.r rVar;
        int i12;
        int i13;
        G.r[] rVarArr;
        if (this.f5011f) {
            return false;
        }
        List list = this.f5012g;
        if (list.isEmpty() || (a5 = this.f5006a) == null || (i11 = this.f5007b - i10) < 0 || i11 >= a5.f4842q) {
            return false;
        }
        A a10 = (A) kf.t.f2(list);
        A a11 = (A) kf.t.o2(list);
        if (a10.f4844s || a11.f4844s) {
            return false;
        }
        int i14 = this.f5014i;
        int i15 = this.f5013h;
        if (i10 < 0) {
            if (Math.min((a10.f4840o + a10.f4842q) - i15, (a11.f4840o + a11.f4842q) - i14) <= (-i10)) {
                return false;
            }
        } else if (Math.min(i15 - a10.f4840o, i14 - a11.f4840o) <= i10) {
            return false;
        }
        this.f5007b -= i10;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            A a12 = (A) list.get(i16);
            if (!a12.f4844s) {
                a12.f4840o += i10;
                int[] iArr = a12.f4848w;
                int length = iArr.length;
                int i17 = 0;
                while (true) {
                    z11 = a12.f4828c;
                    if (i17 >= length) {
                        break;
                    }
                    if ((z11 && i17 % 2 == 1) || (!z11 && i17 % 2 == 0)) {
                        iArr[i17] = iArr[i17] + i10;
                    }
                    i17++;
                }
                if (z10) {
                    int size2 = a12.f4827b.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        C0536j c0536j = (C0536j) a12.f4839n.f4933a.get(a12.f4837l);
                        if (c0536j != null && (rVarArr = c0536j.f4930a) != null) {
                            rVar = rVarArr[i18];
                        } else {
                            rVar = null;
                        }
                        if (rVar != null) {
                            long j6 = rVar.f5556f;
                            int i19 = Z0.i.f22798c;
                            if (z11) {
                                i12 = (int) (j6 >> 32);
                            } else {
                                i12 = ((int) (j6 >> 32)) + i10;
                            }
                            if (z11) {
                                i13 = ((int) (j6 & 4294967295L)) + i10;
                            } else {
                                i13 = (int) (j6 & 4294967295L);
                            }
                            rVar.f5556f = kotlin.jvm.internal.m.c(i12, i13);
                        }
                    }
                }
            }
        }
        this.f5009d = i10;
        if (!this.f5008c && i10 > 0) {
            this.f5008c = true;
        }
        return true;
    }

    @Override // E0.O
    public final int getHeight() {
        return this.f5019n.getHeight();
    }

    @Override // E0.O
    public final int getWidth() {
        return this.f5019n.getWidth();
    }
}
