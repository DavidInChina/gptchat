package h1;

import U3.n;
import i1.C3458c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: h1.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3298e {

    /* renamed from: o  reason: collision with root package name */
    public static int f31704o = 1000;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f31705p = true;

    /* renamed from: b  reason: collision with root package name */
    public final C3301h f31707b;

    /* renamed from: e  reason: collision with root package name */
    public C3296c[] f31710e;

    /* renamed from: k  reason: collision with root package name */
    public final n f31716k;

    /* renamed from: n  reason: collision with root package name */
    public C3296c f31719n;

    /* renamed from: a  reason: collision with root package name */
    public int f31706a = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f31708c = 32;

    /* renamed from: d  reason: collision with root package name */
    public int f31709d = 32;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31711f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f31712g = new boolean[32];

    /* renamed from: h  reason: collision with root package name */
    public int f31713h = 1;

    /* renamed from: i  reason: collision with root package name */
    public int f31714i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f31715j = 32;

    /* renamed from: l  reason: collision with root package name */
    public C3302i[] f31717l = new C3302i[f31704o];

    /* renamed from: m  reason: collision with root package name */
    public int f31718m = 0;

    /* JADX WARN: Type inference failed for: r2v6, types: [h1.h, h1.c] */
    public C3298e() {
        this.f31710e = null;
        this.f31710e = new C3296c[32];
        q();
        n nVar = new n(3);
        this.f31716k = nVar;
        ?? c3296c = new C3296c(nVar);
        c3296c.f31725f = new C3302i[128];
        c3296c.f31726g = new C3302i[128];
        c3296c.f31727h = 0;
        c3296c.f31728i = new C3300g(c3296c);
        this.f31707b = c3296c;
        if (f31705p) {
            this.f31719n = new C3297d(nVar);
        } else {
            this.f31719n = new C3296c(nVar);
        }
    }

    public static int m(C3458c c3458c) {
        C3302i c3302i = c3458c.f32463g;
        if (c3302i != null) {
            return (int) (c3302i.f31733e + 0.5f);
        }
        return 0;
    }

    public final C3302i a(int i10) {
        C3302i c3302i = (C3302i) ((C3299f) this.f31716k.f17428h0).a();
        if (c3302i == null) {
            c3302i = new C3302i(i10);
            c3302i.f31740l = i10;
        } else {
            c3302i.c();
            c3302i.f31740l = i10;
        }
        int i11 = this.f31718m;
        int i12 = f31704o;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f31704o = i13;
            this.f31717l = (C3302i[]) Arrays.copyOf(this.f31717l, i13);
        }
        C3302i[] c3302iArr = this.f31717l;
        int i14 = this.f31718m;
        this.f31718m = i14 + 1;
        c3302iArr[i14] = c3302i;
        return c3302i;
    }

    public final void b(C3302i c3302i, C3302i c3302i2, int i10, float f6, C3302i c3302i3, C3302i c3302i4, int i11, int i12) {
        C3296c k10 = k();
        if (c3302i2 == c3302i3) {
            k10.f31702d.a(c3302i, 1.0f);
            k10.f31702d.a(c3302i4, 1.0f);
            k10.f31702d.a(c3302i2, -2.0f);
        } else if (f6 == 0.5f) {
            k10.f31702d.a(c3302i, 1.0f);
            k10.f31702d.a(c3302i2, -1.0f);
            k10.f31702d.a(c3302i3, -1.0f);
            k10.f31702d.a(c3302i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                k10.f31700b = (-i10) + i11;
            }
        } else if (f6 <= 0.0f) {
            k10.f31702d.a(c3302i, -1.0f);
            k10.f31702d.a(c3302i2, 1.0f);
            k10.f31700b = i10;
        } else if (f6 >= 1.0f) {
            k10.f31702d.a(c3302i4, -1.0f);
            k10.f31702d.a(c3302i3, 1.0f);
            k10.f31700b = -i11;
        } else {
            float f10 = 1.0f - f6;
            k10.f31702d.a(c3302i, f10 * 1.0f);
            k10.f31702d.a(c3302i2, f10 * (-1.0f));
            k10.f31702d.a(c3302i3, (-1.0f) * f6);
            k10.f31702d.a(c3302i4, 1.0f * f6);
            if (i10 > 0 || i11 > 0) {
                k10.f31700b = (i11 * f6) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            k10.a(this, i12);
        }
        c(k10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
        if (r5.f31739k <= 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
        if (r5.f31739k <= 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00db, code lost:
        if (r5.f31739k <= 1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e8, code lost:
        if (r5.f31739k <= 1) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C3296c c3296c) {
        boolean z10;
        boolean z11;
        C3302i e10;
        ArrayList arrayList;
        if (this.f31714i + 1 >= this.f31715j || this.f31713h + 1 >= this.f31709d) {
            n();
        }
        if (!c3296c.f31703e) {
            if (this.f31710e.length != 0) {
                boolean z12 = false;
                while (!z12) {
                    int b10 = c3296c.f31702d.b();
                    int i10 = 0;
                    while (true) {
                        arrayList = c3296c.f31701c;
                        if (i10 >= b10) {
                            break;
                        }
                        C3302i e11 = c3296c.f31702d.e(i10);
                        if (e11.f31731c != -1 || e11.f31734f) {
                            arrayList.add(e11);
                        }
                        i10++;
                    }
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C3302i c3302i = (C3302i) it.next();
                            if (c3302i.f31734f) {
                                c3296c.g(c3302i, true);
                            } else {
                                c3296c.h(this.f31710e[c3302i.f31731c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z12 = true;
                    }
                }
            }
            if (c3296c.f31699a == null && c3296c.f31700b == 0.0f && c3296c.f31702d.b() == 0) {
                return;
            }
            float f6 = c3296c.f31700b;
            if (f6 < 0.0f) {
                c3296c.f31700b = f6 * (-1.0f);
                c3296c.f31702d.f();
            }
            int b11 = c3296c.f31702d.b();
            float f10 = 0.0f;
            float f11 = 0.0f;
            C3302i c3302i2 = null;
            C3302i c3302i3 = null;
            boolean z13 = false;
            boolean z14 = false;
            for (int i11 = 0; i11 < b11; i11++) {
                float g10 = c3296c.f31702d.g(i11);
                C3302i e12 = c3296c.f31702d.e(i11);
                if (e12.f31740l == 1) {
                    if (c3302i2 != null) {
                        if (f10 <= g10) {
                            if (!z13) {
                                if (e12.f31739k > 1) {
                                }
                            }
                        }
                        z13 = true;
                    }
                    c3302i2 = e12;
                    f10 = g10;
                } else if (c3302i2 == null && g10 < 0.0f) {
                    if (c3302i3 != null) {
                        if (f11 <= g10) {
                            if (!z14) {
                                if (e12.f31739k > 1) {
                                }
                            }
                        }
                        z14 = true;
                    }
                    c3302i3 = e12;
                    f11 = g10;
                }
            }
            if (c3302i2 == null) {
                c3302i2 = c3302i3;
            }
            if (c3302i2 == null) {
                z10 = true;
            } else {
                c3296c.f(c3302i2);
                z10 = false;
            }
            if (c3296c.f31702d.b() == 0) {
                c3296c.f31703e = true;
            }
            if (z10) {
                if (this.f31713h + 1 >= this.f31709d) {
                    n();
                }
                C3302i a5 = a(3);
                int i12 = this.f31706a + 1;
                this.f31706a = i12;
                this.f31713h++;
                a5.f31730b = i12;
                ((C3302i[]) this.f31716k.f17429i0)[i12] = a5;
                c3296c.f31699a = a5;
                h(c3296c);
                C3296c c3296c2 = this.f31719n;
                c3296c2.getClass();
                c3296c2.f31699a = null;
                c3296c2.f31702d.clear();
                for (int i13 = 0; i13 < c3296c.f31702d.b(); i13++) {
                    c3296c2.f31702d.d(c3296c.f31702d.e(i13), c3296c.f31702d.g(i13), true);
                }
                p(this.f31719n);
                if (a5.f31731c == -1) {
                    if (c3296c.f31699a == a5 && (e10 = c3296c.e(null, a5)) != null) {
                        c3296c.f(e10);
                    }
                    if (!c3296c.f31703e) {
                        c3296c.f31699a.d(c3296c);
                    }
                    this.f31714i--;
                }
                z11 = true;
            } else {
                z11 = false;
            }
            C3302i c3302i4 = c3296c.f31699a;
            if (c3302i4 != null) {
                if ((c3302i4.f31740l != 1 && c3296c.f31700b < 0.0f) || z11) {
                    return;
                }
            } else {
                return;
            }
        }
        h(c3296c);
    }

    public final void d(C3302i c3302i, int i10) {
        int i11 = c3302i.f31731c;
        if (i11 == -1) {
            c3302i.f31733e = i10;
            c3302i.f31734f = true;
            int i12 = c3302i.f31738j;
            for (int i13 = 0; i13 < i12; i13++) {
                c3302i.f31737i[i13].g(c3302i, false);
            }
            c3302i.f31738j = 0;
        } else if (i11 != -1) {
            C3296c c3296c = this.f31710e[i11];
            if (c3296c.f31703e) {
                c3296c.f31700b = i10;
            } else if (c3296c.f31702d.b() == 0) {
                c3296c.f31703e = true;
                c3296c.f31700b = i10;
            } else {
                C3296c k10 = k();
                if (i10 < 0) {
                    k10.f31700b = i10 * (-1);
                    k10.f31702d.a(c3302i, 1.0f);
                } else {
                    k10.f31700b = i10;
                    k10.f31702d.a(c3302i, -1.0f);
                }
                c(k10);
            }
        } else {
            C3296c k11 = k();
            k11.f31699a = c3302i;
            float f6 = i10;
            c3302i.f31733e = f6;
            k11.f31700b = f6;
            k11.f31703e = true;
            c(k11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C3302i c3302i, C3302i c3302i2, int i10, int i11) {
        boolean z10 = false;
        if (i11 == 8 && c3302i2.f31734f && c3302i.f31731c == -1) {
            c3302i.f31733e = c3302i2.f31733e + i10;
            c3302i.f31734f = true;
            int i12 = c3302i.f31738j;
            for (int i13 = 0; i13 < i12; i13++) {
                c3302i.f31737i[i13].g(c3302i, false);
            }
            c3302i.f31738j = 0;
            return;
        }
        C3296c k10 = k();
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            k10.f31700b = i10;
            if (z10) {
                k10.f31702d.a(c3302i, 1.0f);
                k10.f31702d.a(c3302i2, -1.0f);
                if (i11 != 8) {
                    k10.a(this, i11);
                }
                c(k10);
            }
        }
        k10.f31702d.a(c3302i, -1.0f);
        k10.f31702d.a(c3302i2, 1.0f);
        if (i11 != 8) {
        }
        c(k10);
    }

    public final void f(C3302i c3302i, C3302i c3302i2, int i10, int i11) {
        C3296c k10 = k();
        C3302i l10 = l();
        l10.f31732d = 0;
        k10.b(c3302i, c3302i2, l10, i10);
        if (i11 != 8) {
            k10.f31702d.a(i(i11), (int) (k10.f31702d.c(l10) * (-1.0f)));
        }
        c(k10);
    }

    public final void g(C3302i c3302i, C3302i c3302i2, int i10, int i11) {
        C3296c k10 = k();
        C3302i l10 = l();
        l10.f31732d = 0;
        k10.c(c3302i, c3302i2, l10, i10);
        if (i11 != 8) {
            k10.f31702d.a(i(i11), (int) (k10.f31702d.c(l10) * (-1.0f)));
        }
        c(k10);
    }

    public final void h(C3296c c3296c) {
        boolean z10 = f31705p;
        n nVar = this.f31716k;
        if (z10) {
            C3296c c3296c2 = this.f31710e[this.f31714i];
            if (c3296c2 != null) {
                ((C3299f) nVar.f17426Y).b(c3296c2);
            }
        } else {
            C3296c c3296c3 = this.f31710e[this.f31714i];
            if (c3296c3 != null) {
                ((C3299f) nVar.f17427Z).b(c3296c3);
            }
        }
        C3296c[] c3296cArr = this.f31710e;
        int i10 = this.f31714i;
        c3296cArr[i10] = c3296c;
        C3302i c3302i = c3296c.f31699a;
        c3302i.f31731c = i10;
        this.f31714i = i10 + 1;
        c3302i.d(c3296c);
    }

    public final C3302i i(int i10) {
        if (this.f31713h + 1 >= this.f31709d) {
            n();
        }
        C3302i a5 = a(4);
        int i11 = this.f31706a + 1;
        this.f31706a = i11;
        this.f31713h++;
        a5.f31730b = i11;
        a5.f31732d = i10;
        ((C3302i[]) this.f31716k.f17429i0)[i11] = a5;
        C3301h c3301h = this.f31707b;
        c3301h.f31728i.f31723Y = a5;
        float[] fArr = a5.f31736h;
        Arrays.fill(fArr, 0.0f);
        fArr[a5.f31732d] = 1.0f;
        c3301h.i(a5);
        return a5;
    }

    public final C3302i j(Object obj) {
        C3302i c3302i = null;
        if (obj == null) {
            return null;
        }
        if (this.f31713h + 1 >= this.f31709d) {
            n();
        }
        if (obj instanceof C3458c) {
            C3458c c3458c = (C3458c) obj;
            c3302i = c3458c.f32463g;
            if (c3302i == null) {
                c3458c.i();
                c3302i = c3458c.f32463g;
            }
            int i10 = c3302i.f31730b;
            n nVar = this.f31716k;
            if (i10 == -1 || i10 > this.f31706a || ((C3302i[]) nVar.f17429i0)[i10] == null) {
                if (i10 != -1) {
                    c3302i.c();
                }
                int i11 = this.f31706a + 1;
                this.f31706a = i11;
                this.f31713h++;
                c3302i.f31730b = i11;
                c3302i.f31740l = 1;
                ((C3302i[]) nVar.f17429i0)[i11] = c3302i;
            }
        }
        return c3302i;
    }

    public final C3296c k() {
        boolean z10 = f31705p;
        n nVar = this.f31716k;
        if (z10) {
            C3296c c3296c = (C3296c) ((C3299f) nVar.f17426Y).a();
            if (c3296c == null) {
                return new C3297d(nVar);
            }
            c3296c.f31699a = null;
            c3296c.f31702d.clear();
            c3296c.f31700b = 0.0f;
            c3296c.f31703e = false;
            return c3296c;
        }
        C3296c c3296c2 = (C3296c) ((C3299f) nVar.f17427Z).a();
        if (c3296c2 == null) {
            return new C3296c(nVar);
        }
        c3296c2.f31699a = null;
        c3296c2.f31702d.clear();
        c3296c2.f31700b = 0.0f;
        c3296c2.f31703e = false;
        return c3296c2;
    }

    public final C3302i l() {
        if (this.f31713h + 1 >= this.f31709d) {
            n();
        }
        C3302i a5 = a(3);
        int i10 = this.f31706a + 1;
        this.f31706a = i10;
        this.f31713h++;
        a5.f31730b = i10;
        ((C3302i[]) this.f31716k.f17429i0)[i10] = a5;
        return a5;
    }

    public final void n() {
        int i10 = this.f31708c * 2;
        this.f31708c = i10;
        this.f31710e = (C3296c[]) Arrays.copyOf(this.f31710e, i10);
        n nVar = this.f31716k;
        nVar.f17429i0 = (C3302i[]) Arrays.copyOf((C3302i[]) nVar.f17429i0, this.f31708c);
        int i11 = this.f31708c;
        this.f31712g = new boolean[i11];
        this.f31709d = i11;
        this.f31715j = i11;
    }

    public final void o(C3301h c3301h) {
        n nVar;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f31714i) {
                break;
            }
            C3296c c3296c = this.f31710e[i10];
            int i11 = 1;
            if (c3296c.f31699a.f31740l != 1) {
                float f6 = 0.0f;
                if (c3296c.f31700b < 0.0f) {
                    boolean z10 = false;
                    int i12 = 0;
                    while (!z10) {
                        i12 += i11;
                        float f10 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.f31714i;
                            nVar = this.f31716k;
                            if (i15 >= i17) {
                                break;
                            }
                            C3296c c3296c2 = this.f31710e[i15];
                            if (c3296c2.f31699a.f31740l != i11 && !c3296c2.f31703e && c3296c2.f31700b < f6) {
                                int i18 = i11;
                                while (i18 < this.f31713h) {
                                    C3302i c3302i = ((C3302i[]) nVar.f17429i0)[i18];
                                    float c10 = c3296c2.f31702d.c(c3302i);
                                    if (c10 > f6) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f11 = c3302i.f31735g[i19] / c10;
                                            if ((f11 < f10 && i19 == i16) || i19 > i16) {
                                                i16 = i19;
                                                f10 = f11;
                                                i13 = i15;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                    i18++;
                                    f6 = 0.0f;
                                }
                            }
                            i15++;
                            f6 = 0.0f;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            C3296c c3296c3 = this.f31710e[i13];
                            c3296c3.f31699a.f31731c = -1;
                            c3296c3.f(((C3302i[]) nVar.f17429i0)[i14]);
                            C3302i c3302i2 = c3296c3.f31699a;
                            c3302i2.f31731c = i13;
                            c3302i2.d(c3296c3);
                        } else {
                            z10 = true;
                        }
                        if (i12 > this.f31713h / 2) {
                            z10 = true;
                        }
                        f6 = 0.0f;
                        i11 = 1;
                    }
                }
            }
            i10++;
        }
        p(c3301h);
        for (int i20 = 0; i20 < this.f31714i; i20++) {
            C3296c c3296c4 = this.f31710e[i20];
            c3296c4.f31699a.f31733e = c3296c4.f31700b;
        }
    }

    public final void p(C3296c c3296c) {
        for (int i10 = 0; i10 < this.f31713h; i10++) {
            this.f31712g[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f31713h * 2) {
                return;
            }
            C3302i c3302i = c3296c.f31699a;
            if (c3302i != null) {
                this.f31712g[c3302i.f31730b] = true;
            }
            C3302i d10 = c3296c.d(this.f31712g);
            if (d10 != null) {
                boolean[] zArr = this.f31712g;
                int i12 = d10.f31730b;
                if (zArr[i12]) {
                    return;
                }
                zArr[i12] = true;
            }
            if (d10 != null) {
                float f6 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f31714i; i14++) {
                    C3296c c3296c2 = this.f31710e[i14];
                    if (c3296c2.f31699a.f31740l != 1 && !c3296c2.f31703e && c3296c2.f31702d.k(d10)) {
                        float c10 = c3296c2.f31702d.c(d10);
                        if (c10 < 0.0f) {
                            float f10 = (-c3296c2.f31700b) / c10;
                            if (f10 < f6) {
                                i13 = i14;
                                f6 = f10;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C3296c c3296c3 = this.f31710e[i13];
                    c3296c3.f31699a.f31731c = -1;
                    c3296c3.f(d10);
                    C3302i c3302i2 = c3296c3.f31699a;
                    c3302i2.f31731c = i13;
                    c3302i2.d(c3296c3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void q() {
        boolean z10 = f31705p;
        n nVar = this.f31716k;
        int i10 = 0;
        if (z10) {
            while (true) {
                C3296c[] c3296cArr = this.f31710e;
                if (i10 < c3296cArr.length) {
                    C3296c c3296c = c3296cArr[i10];
                    if (c3296c != null) {
                        ((C3299f) nVar.f17426Y).b(c3296c);
                    }
                    this.f31710e[i10] = null;
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C3296c[] c3296cArr2 = this.f31710e;
                if (i10 < c3296cArr2.length) {
                    C3296c c3296c2 = c3296cArr2[i10];
                    if (c3296c2 != null) {
                        ((C3299f) nVar.f17427Z).b(c3296c2);
                    }
                    this.f31710e[i10] = null;
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        n nVar;
        int i10 = 0;
        while (true) {
            nVar = this.f31716k;
            C3302i[] c3302iArr = (C3302i[]) nVar.f17429i0;
            if (i10 >= c3302iArr.length) {
                break;
            }
            C3302i c3302i = c3302iArr[i10];
            if (c3302i != null) {
                c3302i.c();
            }
            i10++;
        }
        C3299f c3299f = (C3299f) nVar.f17428h0;
        C3302i[] c3302iArr2 = this.f31717l;
        int i11 = this.f31718m;
        c3299f.getClass();
        if (i11 > c3302iArr2.length) {
            i11 = c3302iArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            C3302i c3302i2 = c3302iArr2[i12];
            int i13 = c3299f.f31722c;
            Object[] objArr = c3299f.f31721b;
            if (i13 < objArr.length) {
                objArr[i13] = c3302i2;
                c3299f.f31722c = i13 + 1;
            }
        }
        this.f31718m = 0;
        Arrays.fill((C3302i[]) nVar.f17429i0, (Object) null);
        this.f31706a = 0;
        C3301h c3301h = this.f31707b;
        c3301h.f31727h = 0;
        c3301h.f31700b = 0.0f;
        this.f31713h = 1;
        for (int i14 = 0; i14 < this.f31714i; i14++) {
            this.f31710e[i14].getClass();
        }
        q();
        this.f31714i = 0;
        if (f31705p) {
            this.f31719n = new C3297d(nVar);
        } else {
            this.f31719n = new C3296c(nVar);
        }
    }
}
