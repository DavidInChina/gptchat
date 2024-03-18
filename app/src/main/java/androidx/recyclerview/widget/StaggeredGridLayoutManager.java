package androidx.recyclerview.widget;

import D1.H;
import D1.Z;
import E1.o;
import E1.p;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import i3.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import w.C6061h;
import w3.AbstractC6117y;
import w3.C6111s;
import w3.C6115w;
import w3.C6116x;
import w3.J;
import w3.K;
import w3.L;
import w3.RunnableC6104k;
import w3.U;
import w3.V;
import w3.c0;
import w3.d0;
import w3.f0;
import w3.g0;
import w3.j0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends K implements U {

    /* renamed from: B  reason: collision with root package name */
    public final j0 f25488B;

    /* renamed from: D  reason: collision with root package name */
    public boolean f25490D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f25491E;

    /* renamed from: F  reason: collision with root package name */
    public f0 f25492F;

    /* renamed from: J  reason: collision with root package name */
    public int[] f25496J;

    /* renamed from: p  reason: collision with root package name */
    public final int f25498p;

    /* renamed from: q  reason: collision with root package name */
    public final g0[] f25499q;

    /* renamed from: r  reason: collision with root package name */
    public final AbstractC6117y f25500r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC6117y f25501s;

    /* renamed from: t  reason: collision with root package name */
    public final int f25502t;

    /* renamed from: u  reason: collision with root package name */
    public int f25503u;

    /* renamed from: v  reason: collision with root package name */
    public final C6111s f25504v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f25505w;

    /* renamed from: y  reason: collision with root package name */
    public final BitSet f25507y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f25506x = false;

    /* renamed from: z  reason: collision with root package name */
    public int f25508z = -1;

    /* renamed from: A  reason: collision with root package name */
    public int f25487A = Integer.MIN_VALUE;

    /* renamed from: C  reason: collision with root package name */
    public final int f25489C = 2;

    /* renamed from: G  reason: collision with root package name */
    public final Rect f25493G = new Rect();

    /* renamed from: H  reason: collision with root package name */
    public final c0 f25494H = new c0(this);

    /* renamed from: I  reason: collision with root package name */
    public final boolean f25495I = true;

    /* renamed from: K  reason: collision with root package name */
    public final RunnableC6104k f25497K = new RunnableC6104k(1, this);

    /* JADX WARN: Type inference failed for: r5v3, types: [w3.s, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f25498p = -1;
        this.f25505w = false;
        j0 j0Var = new j0(1);
        this.f25488B = j0Var;
        J G10 = K.G(context, attributeSet, i10, i11);
        int i12 = G10.f47748a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f25502t) {
            this.f25502t = i12;
            AbstractC6117y abstractC6117y = this.f25500r;
            this.f25500r = this.f25501s;
            this.f25501s = abstractC6117y;
            j0();
        }
        int i13 = G10.f47749b;
        c(null);
        if (i13 != this.f25498p) {
            j0Var.d();
            j0();
            this.f25498p = i13;
            this.f25507y = new BitSet(this.f25498p);
            this.f25499q = new g0[this.f25498p];
            for (int i14 = 0; i14 < this.f25498p; i14++) {
                this.f25499q[i14] = new g0(this, i14);
            }
            j0();
        }
        boolean z10 = G10.f47750c;
        c(null);
        f0 f0Var = this.f25492F;
        if (f0Var != null && f0Var.f47869m0 != z10) {
            f0Var.f47869m0 = z10;
        }
        this.f25505w = z10;
        j0();
        ?? obj = new Object();
        obj.f47964a = true;
        obj.f47969f = 0;
        obj.f47970g = 0;
        this.f25504v = obj;
        this.f25500r = AbstractC6117y.a(this, this.f25502t);
        this.f25501s = AbstractC6117y.a(this, 1 - this.f25502t);
    }

    public static int b1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    public final int A0(V v10) {
        if (v() == 0) {
            return 0;
        }
        AbstractC6117y abstractC6117y = this.f25500r;
        boolean z10 = this.f25495I;
        return K4.J.k(v10, abstractC6117y, F0(!z10), E0(!z10), this, this.f25495I);
    }

    public final int B0(V v10) {
        if (v() == 0) {
            return 0;
        }
        AbstractC6117y abstractC6117y = this.f25500r;
        boolean z10 = this.f25495I;
        return K4.J.l(v10, abstractC6117y, F0(!z10), E0(!z10), this, this.f25495I, this.f25506x);
    }

    public final int C0(V v10) {
        if (v() == 0) {
            return 0;
        }
        AbstractC6117y abstractC6117y = this.f25500r;
        boolean z10 = this.f25495I;
        return K4.J.m(v10, abstractC6117y, F0(!z10), E0(!z10), this, this.f25495I);
    }

    public final int D0(g gVar, C6111s c6111s, V v10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        g0 g0Var;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 0;
        int i25 = 1;
        this.f25507y.set(0, this.f25498p, true);
        C6111s c6111s2 = this.f25504v;
        if (c6111s2.f47972i) {
            if (c6111s.f47968e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (c6111s.f47968e == 1) {
            i10 = c6111s.f47970g + c6111s.f47965b;
        } else {
            i10 = c6111s.f47969f - c6111s.f47965b;
        }
        int i26 = c6111s.f47968e;
        for (int i27 = 0; i27 < this.f25498p; i27++) {
            if (!this.f25499q[i27].f47877a.isEmpty()) {
                a1(this.f25499q[i27], i26, i10);
            }
        }
        if (this.f25506x) {
            i11 = this.f25500r.e();
        } else {
            i11 = this.f25500r.f();
        }
        Object[] objArr = null;
        while (true) {
            int i28 = c6111s.f47966c;
            if (i28 >= 0 && i28 < v10.b()) {
                i12 = i25;
            } else {
                i12 = i24;
            }
            if (i12 == 0 || (!c6111s2.f47972i && this.f25507y.isEmpty())) {
                break;
            }
            View view = gVar.i(c6111s.f47966c, Long.MAX_VALUE).f47800a;
            c6111s.f47966c += c6111s.f47967d;
            d0 d0Var = (d0) view.getLayoutParams();
            int c10 = d0Var.f47767a.c();
            j0 j0Var = this.f25488B;
            int[] iArr = (int[]) j0Var.f47912b;
            if (iArr != null && c10 < iArr.length) {
                i14 = iArr[c10];
            } else {
                i14 = -1;
            }
            if (i14 == -1) {
                if (R0(c6111s.f47968e)) {
                    i23 = this.f25498p - i25;
                    i22 = -1;
                    i21 = -1;
                } else {
                    i21 = i25;
                    i22 = this.f25498p;
                    i23 = i24;
                }
                g0 g0Var2 = null;
                if (c6111s.f47968e == i25) {
                    int f6 = this.f25500r.f();
                    int i29 = Integer.MAX_VALUE;
                    while (i23 != i22) {
                        g0 g0Var3 = this.f25499q[i23];
                        int f10 = g0Var3.f(f6);
                        if (f10 < i29) {
                            i29 = f10;
                            g0Var2 = g0Var3;
                        }
                        i23 += i21;
                    }
                } else {
                    int e10 = this.f25500r.e();
                    int i30 = Integer.MIN_VALUE;
                    while (i23 != i22) {
                        g0 g0Var4 = this.f25499q[i23];
                        int h10 = g0Var4.h(e10);
                        if (h10 > i30) {
                            g0Var2 = g0Var4;
                            i30 = h10;
                        }
                        i23 += i21;
                    }
                }
                g0Var = g0Var2;
                j0Var.e(c10);
                ((int[]) j0Var.f47912b)[c10] = g0Var.f47881e;
            } else {
                g0Var = this.f25499q[i14];
            }
            d0Var.f47846e = g0Var;
            if (c6111s.f47968e == 1) {
                z10 = false;
                b(view, -1, false);
            } else {
                z10 = false;
                b(view, 0, false);
            }
            if (this.f25502t == 1) {
                int i31 = this.f25503u;
                int i32 = this.f47763l;
                int i33 = ((ViewGroup.MarginLayoutParams) d0Var).width;
                int i34 = z10 ? 1 : 0;
                int i35 = z10 ? 1 : 0;
                i15 = 1;
                P0(view, K.w(i31, i32, i34, i33, z10), K.w(this.f47766o, this.f47764m, B() + E(), ((ViewGroup.MarginLayoutParams) d0Var).height, true));
            } else {
                i15 = 1;
                P0(view, K.w(this.f47765n, this.f47763l, D() + C(), ((ViewGroup.MarginLayoutParams) d0Var).width, true), K.w(this.f25503u, this.f47764m, 0, ((ViewGroup.MarginLayoutParams) d0Var).height, false));
            }
            if (c6111s.f47968e == i15) {
                i17 = g0Var.f(i11);
                i16 = this.f25500r.c(view) + i17;
            } else {
                i16 = g0Var.h(i11);
                i17 = i16 - this.f25500r.c(view);
            }
            if (c6111s.f47968e == 1) {
                g0 g0Var5 = d0Var.f47846e;
                g0Var5.getClass();
                d0 d0Var2 = (d0) view.getLayoutParams();
                d0Var2.f47846e = g0Var5;
                ArrayList arrayList = g0Var5.f47877a;
                arrayList.add(view);
                g0Var5.f47879c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    g0Var5.f47878b = Integer.MIN_VALUE;
                }
                if (d0Var2.f47767a.j() || d0Var2.f47767a.m()) {
                    g0Var5.f47880d = g0Var5.f47882f.f25500r.c(view) + g0Var5.f47880d;
                }
            } else {
                g0 g0Var6 = d0Var.f47846e;
                g0Var6.getClass();
                d0 d0Var3 = (d0) view.getLayoutParams();
                d0Var3.f47846e = g0Var6;
                ArrayList arrayList2 = g0Var6.f47877a;
                arrayList2.add(0, view);
                g0Var6.f47878b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    g0Var6.f47879c = Integer.MIN_VALUE;
                }
                if (d0Var3.f47767a.j() || d0Var3.f47767a.m()) {
                    g0Var6.f47880d = g0Var6.f47882f.f25500r.c(view) + g0Var6.f47880d;
                }
            }
            if (O0() && this.f25502t == 1) {
                i19 = this.f25501s.e() - (((this.f25498p - 1) - g0Var.f47881e) * this.f25503u);
                i18 = i19 - this.f25501s.c(view);
            } else {
                i18 = this.f25501s.f() + (g0Var.f47881e * this.f25503u);
                i19 = this.f25501s.c(view) + i18;
            }
            if (this.f25502t == 1) {
                K.L(view, i18, i17, i19, i16);
            } else {
                K.L(view, i17, i18, i16, i19);
            }
            a1(g0Var, c6111s2.f47968e, i10);
            T0(gVar, c6111s2);
            if (c6111s2.f47971h && view.hasFocusable()) {
                i20 = 0;
                this.f25507y.set(g0Var.f47881e, false);
            } else {
                i20 = 0;
            }
            i24 = i20;
            i25 = 1;
            objArr = 1;
        }
        int i36 = i24;
        if (objArr == null) {
            T0(gVar, c6111s2);
        }
        if (c6111s2.f47968e == -1) {
            i13 = this.f25500r.f() - L0(this.f25500r.f());
        } else {
            i13 = K0(this.f25500r.e()) - this.f25500r.e();
        }
        if (i13 > 0) {
            return Math.min(c6111s.f47965b, i13);
        }
        return i36;
    }

    public final View E0(boolean z10) {
        int f6 = this.f25500r.f();
        int e10 = this.f25500r.e();
        View view = null;
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u10 = u(v10);
            int d10 = this.f25500r.d(u10);
            int b10 = this.f25500r.b(u10);
            if (b10 > f6 && d10 < e10) {
                if (b10 > e10 && z10) {
                    if (view == null) {
                        view = u10;
                    }
                } else {
                    return u10;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z10) {
        int f6 = this.f25500r.f();
        int e10 = this.f25500r.e();
        int v10 = v();
        View view = null;
        for (int i10 = 0; i10 < v10; i10++) {
            View u10 = u(i10);
            int d10 = this.f25500r.d(u10);
            if (this.f25500r.b(u10) > f6 && d10 < e10) {
                if (d10 < f6 && z10) {
                    if (view == null) {
                        view = u10;
                    }
                } else {
                    return u10;
                }
            }
        }
        return view;
    }

    public final void G0(g gVar, V v10, boolean z10) {
        int e10;
        int K02 = K0(Integer.MIN_VALUE);
        if (K02 != Integer.MIN_VALUE && (e10 = this.f25500r.e() - K02) > 0) {
            int i10 = e10 - (-X0(-e10, gVar, v10));
            if (z10 && i10 > 0) {
                this.f25500r.k(i10);
            }
        }
    }

    @Override // w3.K
    public final int H(g gVar, V v10) {
        if (this.f25502t == 0) {
            return this.f25498p;
        }
        return super.H(gVar, v10);
    }

    public final void H0(g gVar, V v10, boolean z10) {
        int f6;
        int L02 = L0(Integer.MAX_VALUE);
        if (L02 != Integer.MAX_VALUE && (f6 = L02 - this.f25500r.f()) > 0) {
            int X02 = f6 - X0(f6, gVar, v10);
            if (z10 && X02 > 0) {
                this.f25500r.k(-X02);
            }
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return K.F(u(0));
    }

    @Override // w3.K
    public final boolean J() {
        if (this.f25489C != 0) {
            return true;
        }
        return false;
    }

    public final int J0() {
        int v10 = v();
        if (v10 == 0) {
            return 0;
        }
        return K.F(u(v10 - 1));
    }

    public final int K0(int i10) {
        int f6 = this.f25499q[0].f(i10);
        for (int i11 = 1; i11 < this.f25498p; i11++) {
            int f10 = this.f25499q[i11].f(i10);
            if (f10 > f6) {
                f6 = f10;
            }
        }
        return f6;
    }

    public final int L0(int i10) {
        int h10 = this.f25499q[0].h(i10);
        for (int i11 = 1; i11 < this.f25498p; i11++) {
            int h11 = this.f25499q[i11].h(i10);
            if (h11 < h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    @Override // w3.K
    public final void M(int i10) {
        super.M(i10);
        for (int i11 = 0; i11 < this.f25498p; i11++) {
            g0 g0Var = this.f25499q[i11];
            int i12 = g0Var.f47878b;
            if (i12 != Integer.MIN_VALUE) {
                g0Var.f47878b = i12 + i10;
            }
            int i13 = g0Var.f47879c;
            if (i13 != Integer.MIN_VALUE) {
                g0Var.f47879c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f25506x) {
            i13 = J0();
        } else {
            i13 = I0();
        }
        if (i12 == 8) {
            if (i10 < i11) {
                i15 = i11 + 1;
            } else {
                i15 = i10 + 1;
                i14 = i11;
                j0 j0Var = this.f25488B;
                j0Var.g(i14);
                if (i12 == 1) {
                    if (i12 != 2) {
                        if (i12 == 8) {
                            j0Var.j(i10, 1);
                            j0Var.i(i11, 1);
                        }
                    } else {
                        j0Var.j(i10, i11);
                    }
                } else {
                    j0Var.i(i10, i11);
                }
                if (i15 > i13) {
                    return;
                }
                if (this.f25506x) {
                    i16 = I0();
                } else {
                    i16 = J0();
                }
                if (i14 <= i16) {
                    j0();
                    return;
                }
                return;
            }
        } else {
            i15 = i10 + i11;
        }
        i14 = i10;
        j0 j0Var2 = this.f25488B;
        j0Var2.g(i14);
        if (i12 == 1) {
        }
        if (i15 > i13) {
        }
    }

    @Override // w3.K
    public final void N(int i10) {
        super.N(i10);
        for (int i11 = 0; i11 < this.f25498p; i11++) {
            g0 g0Var = this.f25499q[i11];
            int i12 = g0Var.f47878b;
            if (i12 != Integer.MIN_VALUE) {
                g0Var.f47878b = i12 + i10;
            }
            int i13 = g0Var.f47879c;
            if (i13 != Integer.MIN_VALUE) {
                g0Var.f47879c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View N0() {
        char c10;
        boolean z10;
        boolean z11;
        int v10 = v();
        int i10 = v10 - 1;
        BitSet bitSet = new BitSet(this.f25498p);
        bitSet.set(0, this.f25498p, true);
        int i11 = -1;
        if (this.f25502t == 1 && O0()) {
            c10 = 1;
        } else {
            c10 = '\uffff';
        }
        if (this.f25506x) {
            v10 = -1;
        } else {
            i10 = 0;
        }
        if (i10 < v10) {
            i11 = 1;
        }
        while (i10 != v10) {
            View u10 = u(i10);
            d0 d0Var = (d0) u10.getLayoutParams();
            if (bitSet.get(d0Var.f47846e.f47881e)) {
                g0 g0Var = d0Var.f47846e;
                if (this.f25506x) {
                    int i12 = g0Var.f47879c;
                    if (i12 == Integer.MIN_VALUE) {
                        g0Var.a();
                        i12 = g0Var.f47879c;
                    }
                    if (i12 < this.f25500r.e()) {
                        ArrayList arrayList = g0Var.f47877a;
                        ((d0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u10;
                    }
                    bitSet.clear(d0Var.f47846e.f47881e);
                } else {
                    int i13 = g0Var.f47878b;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = (View) g0Var.f47877a.get(0);
                        g0Var.f47878b = g0Var.f47882f.f25500r.d(view);
                        ((d0) view.getLayoutParams()).getClass();
                        i13 = g0Var.f47878b;
                    }
                    if (i13 > this.f25500r.f()) {
                        ((d0) ((View) g0Var.f47877a.get(0)).getLayoutParams()).getClass();
                        return u10;
                    }
                    bitSet.clear(d0Var.f47846e.f47881e);
                }
            }
            i10 += i11;
            if (i10 != v10) {
                View u11 = u(i10);
                if (this.f25506x) {
                    int b10 = this.f25500r.b(u10);
                    int b11 = this.f25500r.b(u11);
                    if (b10 < b11) {
                        return u10;
                    }
                    if (b10 == b11) {
                        if (d0Var.f47846e.f47881e - ((d0) u11.getLayoutParams()).f47846e.f47881e >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c10 >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            return u10;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int d10 = this.f25500r.d(u10);
                    int d11 = this.f25500r.d(u11);
                    if (d10 > d11) {
                        return u10;
                    }
                    if (d10 == d11) {
                        if (d0Var.f47846e.f47881e - ((d0) u11.getLayoutParams()).f47846e.f47881e >= 0) {
                        }
                        if (c10 >= 0) {
                        }
                        if (z10 == z11) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final boolean O0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    @Override // w3.K
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f47753b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f25497K);
        }
        for (int i10 = 0; i10 < this.f25498p; i10++) {
            this.f25499q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final void P0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f47753b;
        Rect rect = this.f25493G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        d0 d0Var = (d0) view.getLayoutParams();
        int b1 = b1(i10, ((ViewGroup.MarginLayoutParams) d0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) d0Var).rightMargin + rect.right);
        int b12 = b1(i11, ((ViewGroup.MarginLayoutParams) d0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin + rect.bottom);
        if (s0(view, b1, b12, d0Var)) {
            view.measure(b1, b12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (r8.f25502t == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
        if (r8.f25502t == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
        if (O0() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
        if (O0() == false) goto L40;
     */
    @Override // w3.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Q(View view, int i10, g gVar, V v10) {
        View view2;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView == null || (view2 = recyclerView.A(view)) == null || this.f47752a.j(view2)) {
            view2 = null;
        }
        if (view2 == null) {
            return null;
        }
        W0();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 == 66) {
                        }
                    }
                    i11 = Integer.MIN_VALUE;
                }
            } else {
                if (this.f25502t != 1) {
                }
                i11 = 1;
            }
        } else {
            if (this.f25502t != 1) {
            }
            i11 = -1;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        d0 d0Var = (d0) view2.getLayoutParams();
        d0Var.getClass();
        g0 g0Var = d0Var.f47846e;
        if (i11 == 1) {
            i12 = J0();
        } else {
            i12 = I0();
        }
        Z0(i12, v10);
        Y0(i11);
        C6111s c6111s = this.f25504v;
        c6111s.f47966c = c6111s.f47967d + i12;
        c6111s.f47965b = (int) (this.f25500r.g() * 0.33333334f);
        c6111s.f47971h = true;
        c6111s.f47964a = false;
        D0(gVar, c6111s, v10);
        this.f25490D = this.f25506x;
        View g10 = g0Var.g(i12, i11);
        if (g10 != null && g10 != view2) {
            return g10;
        }
        if (R0(i11)) {
            for (int i16 = this.f25498p - 1; i16 >= 0; i16--) {
                View g11 = this.f25499q[i16].g(i12, i11);
                if (g11 != null && g11 != view2) {
                    return g11;
                }
            }
        } else {
            for (int i17 = 0; i17 < this.f25498p; i17++) {
                View g12 = this.f25499q[i17].g(i12, i11);
                if (g12 != null && g12 != view2) {
                    return g12;
                }
            }
        }
        boolean z12 = !this.f25505w;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = g0Var.c();
        } else {
            i13 = g0Var.d();
        }
        View q10 = q(i13);
        if (q10 != null && q10 != view2) {
            return q10;
        }
        if (R0(i11)) {
            for (int i18 = this.f25498p - 1; i18 >= 0; i18--) {
                if (i18 != g0Var.f47881e) {
                    if (z11) {
                        i15 = this.f25499q[i18].c();
                    } else {
                        i15 = this.f25499q[i18].d();
                    }
                    View q11 = q(i15);
                    if (q11 != null && q11 != view2) {
                        return q11;
                    }
                }
            }
        } else {
            for (int i19 = 0; i19 < this.f25498p; i19++) {
                if (z11) {
                    i14 = this.f25499q[i19].c();
                } else {
                    i14 = this.f25499q[i19].d();
                }
                View q12 = q(i14);
                if (q12 != null && q12 != view2) {
                    return q12;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0429, code lost:
        if (z0() != false) goto L250;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(g gVar, V v10, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        f0 f0Var;
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int f6;
        f0 f0Var2 = this.f25492F;
        c0 c0Var = this.f25494H;
        if ((f0Var2 != null || this.f25508z != -1) && v10.b() == 0) {
            e0(gVar);
            c0Var.a();
            return;
        }
        boolean z13 = true;
        if (c0Var.f47840e && this.f25508z == -1 && this.f25492F == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        j0 j0Var = this.f25488B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0Var.f47842g;
        if (z11) {
            c0Var.a();
            f0 f0Var3 = this.f25492F;
            if (f0Var3 != null) {
                int i20 = f0Var3.f47864h0;
                if (i20 > 0) {
                    if (i20 == this.f25498p) {
                        for (int i21 = 0; i21 < this.f25498p; i21++) {
                            this.f25499q[i21].b();
                            f0 f0Var4 = this.f25492F;
                            int i22 = f0Var4.f47865i0[i21];
                            if (i22 != Integer.MIN_VALUE) {
                                if (f0Var4.f47870n0) {
                                    f6 = this.f25500r.e();
                                } else {
                                    f6 = this.f25500r.f();
                                }
                                i22 += f6;
                            }
                            g0 g0Var = this.f25499q[i21];
                            g0Var.f47878b = i22;
                            g0Var.f47879c = i22;
                        }
                    } else {
                        f0Var3.f47865i0 = null;
                        f0Var3.f47864h0 = 0;
                        f0Var3.f47866j0 = 0;
                        f0Var3.f47867k0 = null;
                        f0Var3.f47868l0 = null;
                        f0Var3.f47862Y = f0Var3.f47863Z;
                    }
                }
                f0 f0Var5 = this.f25492F;
                this.f25491E = f0Var5.f47871o0;
                boolean z14 = f0Var5.f47869m0;
                c(null);
                f0 f0Var6 = this.f25492F;
                if (f0Var6 != null && f0Var6.f47869m0 != z14) {
                    f0Var6.f47869m0 = z14;
                }
                this.f25505w = z14;
                j0();
                W0();
                f0 f0Var7 = this.f25492F;
                int i23 = f0Var7.f47862Y;
                if (i23 != -1) {
                    this.f25508z = i23;
                    c0Var.f47838c = f0Var7.f47870n0;
                } else {
                    c0Var.f47838c = this.f25506x;
                }
                if (f0Var7.f47866j0 > 1) {
                    j0Var.f47912b = f0Var7.f47867k0;
                    j0Var.f47913c = f0Var7.f47868l0;
                }
            } else {
                W0();
                c0Var.f47838c = this.f25506x;
            }
            if (!v10.f47784g && (i16 = this.f25508z) != -1) {
                if (i16 >= 0 && i16 < v10.b()) {
                    f0 f0Var8 = this.f25492F;
                    if (f0Var8 != null && f0Var8.f47862Y != -1 && f0Var8.f47864h0 >= 1) {
                        c0Var.f47837b = Integer.MIN_VALUE;
                        c0Var.f47836a = this.f25508z;
                    } else {
                        View q10 = q(this.f25508z);
                        if (q10 != null) {
                            if (this.f25506x) {
                                i18 = J0();
                            } else {
                                i18 = I0();
                            }
                            c0Var.f47836a = i18;
                            if (this.f25487A != Integer.MIN_VALUE) {
                                if (c0Var.f47838c) {
                                    c0Var.f47837b = (this.f25500r.e() - this.f25487A) - this.f25500r.b(q10);
                                } else {
                                    c0Var.f47837b = (this.f25500r.f() + this.f25487A) - this.f25500r.d(q10);
                                }
                            } else if (this.f25500r.c(q10) > this.f25500r.g()) {
                                if (c0Var.f47838c) {
                                    i19 = this.f25500r.e();
                                } else {
                                    i19 = this.f25500r.f();
                                }
                                c0Var.f47837b = i19;
                            } else {
                                int d10 = this.f25500r.d(q10) - this.f25500r.f();
                                if (d10 < 0) {
                                    c0Var.f47837b = -d10;
                                } else {
                                    int e10 = this.f25500r.e() - this.f25500r.b(q10);
                                    if (e10 < 0) {
                                        c0Var.f47837b = e10;
                                    } else {
                                        c0Var.f47837b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i24 = this.f25508z;
                            c0Var.f47836a = i24;
                            int i25 = this.f25487A;
                            if (i25 == Integer.MIN_VALUE) {
                                if (y0(i24) == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                c0Var.f47838c = z12;
                                if (z12) {
                                    i17 = staggeredGridLayoutManager.f25500r.e();
                                } else {
                                    i17 = staggeredGridLayoutManager.f25500r.f();
                                }
                                c0Var.f47837b = i17;
                            } else if (c0Var.f47838c) {
                                c0Var.f47837b = staggeredGridLayoutManager.f25500r.e() - i25;
                            } else {
                                c0Var.f47837b = staggeredGridLayoutManager.f25500r.f() + i25;
                            }
                            c0Var.f47839d = true;
                        }
                    }
                    c0Var.f47840e = true;
                } else {
                    this.f25508z = -1;
                    this.f25487A = Integer.MIN_VALUE;
                }
            }
            if (this.f25490D) {
                int b10 = v10.b();
                for (int v11 = v() - 1; v11 >= 0; v11--) {
                    i15 = K.F(u(v11));
                    if (i15 >= 0 && i15 < b10) {
                        break;
                    }
                }
                i15 = 0;
                c0Var.f47836a = i15;
                c0Var.f47837b = Integer.MIN_VALUE;
            } else {
                int b11 = v10.b();
                int v12 = v();
                for (int i26 = 0; i26 < v12; i26++) {
                    int F10 = K.F(u(i26));
                    if (F10 >= 0 && F10 < b11) {
                        i15 = F10;
                        break;
                    }
                }
                i15 = 0;
                c0Var.f47836a = i15;
                c0Var.f47837b = Integer.MIN_VALUE;
            }
            c0Var.f47840e = true;
        }
        if (this.f25492F == null && this.f25508z == -1 && (c0Var.f47838c != this.f25490D || O0() != this.f25491E)) {
            j0Var.d();
            c0Var.f47839d = true;
        }
        if (v() > 0 && ((f0Var = this.f25492F) == null || f0Var.f47864h0 < 1)) {
            if (c0Var.f47839d) {
                for (int i27 = 0; i27 < this.f25498p; i27++) {
                    this.f25499q[i27].b();
                    int i28 = c0Var.f47837b;
                    if (i28 != Integer.MIN_VALUE) {
                        g0 g0Var2 = this.f25499q[i27];
                        g0Var2.f47878b = i28;
                        g0Var2.f47879c = i28;
                    }
                }
            } else if (!z11 && c0Var.f47841f != null) {
                for (int i29 = 0; i29 < this.f25498p; i29++) {
                    g0 g0Var3 = this.f25499q[i29];
                    g0Var3.b();
                    int i30 = c0Var.f47841f[i29];
                    g0Var3.f47878b = i30;
                    g0Var3.f47879c = i30;
                }
            } else {
                for (int i31 = 0; i31 < this.f25498p; i31++) {
                    g0 g0Var4 = this.f25499q[i31];
                    boolean z15 = this.f25506x;
                    int i32 = c0Var.f47837b;
                    if (z15) {
                        i14 = g0Var4.f(Integer.MIN_VALUE);
                    } else {
                        i14 = g0Var4.h(Integer.MIN_VALUE);
                    }
                    g0Var4.b();
                    if (i14 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = g0Var4.f47882f;
                        if ((!z15 || i14 >= staggeredGridLayoutManager2.f25500r.e()) && (z15 || i14 <= staggeredGridLayoutManager2.f25500r.f())) {
                            if (i32 != Integer.MIN_VALUE) {
                                i14 += i32;
                            }
                            g0Var4.f47879c = i14;
                            g0Var4.f47878b = i14;
                        }
                    }
                }
                g0[] g0VarArr = this.f25499q;
                int length = g0VarArr.length;
                int[] iArr = c0Var.f47841f;
                if (iArr == null || iArr.length < length) {
                    c0Var.f47841f = new int[staggeredGridLayoutManager.f25499q.length];
                }
                for (int i33 = 0; i33 < length; i33++) {
                    c0Var.f47841f[i33] = g0VarArr[i33].h(Integer.MIN_VALUE);
                }
            }
        }
        p(gVar);
        C6111s c6111s = this.f25504v;
        c6111s.f47964a = false;
        int g10 = this.f25501s.g();
        this.f25503u = g10 / this.f25498p;
        C6116x c6116x = (C6116x) this.f25501s;
        int i34 = c6116x.f48008d;
        K k10 = c6116x.f48009a;
        switch (i34) {
            case 0:
                i10 = k10.f47763l;
                break;
            default:
                i10 = k10.f47764m;
                break;
        }
        View.MeasureSpec.makeMeasureSpec(g10, i10);
        Z0(c0Var.f47836a, v10);
        if (c0Var.f47838c) {
            Y0(-1);
            D0(gVar, c6111s, v10);
            Y0(1);
            c6111s.f47966c = c0Var.f47836a + c6111s.f47967d;
            D0(gVar, c6111s, v10);
        } else {
            Y0(1);
            D0(gVar, c6111s, v10);
            Y0(-1);
            c6111s.f47966c = c0Var.f47836a + c6111s.f47967d;
            D0(gVar, c6111s, v10);
        }
        C6116x c6116x2 = (C6116x) this.f25501s;
        int i35 = c6116x2.f48008d;
        K k11 = c6116x2.f48009a;
        switch (i35) {
            case 0:
                i11 = k11.f47763l;
                break;
            default:
                i11 = k11.f47764m;
                break;
        }
        if (i11 != 1073741824) {
            int v13 = v();
            float f10 = 0.0f;
            for (int i36 = 0; i36 < v13; i36++) {
                View u10 = u(i36);
                float c10 = this.f25501s.c(u10);
                if (c10 >= f10) {
                    ((d0) u10.getLayoutParams()).getClass();
                    f10 = Math.max(f10, c10);
                }
            }
            int i37 = this.f25503u;
            int round = Math.round(f10 * this.f25498p);
            AbstractC6117y abstractC6117y = this.f25501s;
            C6116x c6116x3 = (C6116x) abstractC6117y;
            int i38 = c6116x3.f48008d;
            K k12 = c6116x3.f48009a;
            switch (i38) {
                case 0:
                    i12 = k12.f47763l;
                    break;
                default:
                    i12 = k12.f47764m;
                    break;
            }
            if (i12 == Integer.MIN_VALUE) {
                round = Math.min(round, abstractC6117y.g());
            }
            this.f25503u = round / this.f25498p;
            C6116x c6116x4 = (C6116x) this.f25501s;
            int i39 = c6116x4.f48008d;
            K k13 = c6116x4.f48009a;
            switch (i39) {
                case 0:
                    i13 = k13.f47763l;
                    break;
                default:
                    i13 = k13.f47764m;
                    break;
            }
            View.MeasureSpec.makeMeasureSpec(round, i13);
            if (this.f25503u != i37) {
                for (int i40 = 0; i40 < v13; i40++) {
                    View u11 = u(i40);
                    d0 d0Var = (d0) u11.getLayoutParams();
                    d0Var.getClass();
                    if (O0() && this.f25502t == 1) {
                        int i41 = -((this.f25498p - 1) - d0Var.f47846e.f47881e);
                        u11.offsetLeftAndRight((this.f25503u * i41) - (i41 * i37));
                    } else {
                        int i42 = d0Var.f47846e.f47881e;
                        int i43 = this.f25503u * i42;
                        int i44 = i42 * i37;
                        if (this.f25502t == 1) {
                            u11.offsetLeftAndRight(i43 - i44);
                        } else {
                            u11.offsetTopAndBottom(i43 - i44);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f25506x) {
                G0(gVar, v10, true);
                H0(gVar, v10, false);
            } else {
                H0(gVar, v10, true);
                G0(gVar, v10, false);
            }
        }
        if (z10 && !v10.f47784g && this.f25489C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.f47753b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f25497K);
            }
        }
        z13 = false;
        if (v10.f47784g) {
            c0Var.a();
        }
        this.f25490D = c0Var.f47838c;
        this.f25491E = O0();
        if (z13) {
            c0Var.a();
            Q0(gVar, v10, false);
        }
    }

    @Override // w3.K
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View F02 = F0(false);
            View E02 = E0(false);
            if (F02 != null && E02 != null) {
                int F10 = K.F(F02);
                int F11 = K.F(E02);
                if (F10 < F11) {
                    accessibilityEvent.setFromIndex(F10);
                    accessibilityEvent.setToIndex(F11);
                    return;
                }
                accessibilityEvent.setFromIndex(F11);
                accessibilityEvent.setToIndex(F10);
            }
        }
    }

    public final boolean R0(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f25502t == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.f25506x) {
                return false;
            }
            return true;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f25506x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != O0()) {
            return false;
        }
        return true;
    }

    public final void S0(int i10, V v10) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = J0();
            i11 = 1;
        } else {
            i12 = I0();
            i11 = -1;
        }
        C6111s c6111s = this.f25504v;
        c6111s.f47964a = true;
        Z0(i12, v10);
        Y0(i11);
        c6111s.f47966c = i12 + c6111s.f47967d;
        c6111s.f47965b = Math.abs(i10);
    }

    @Override // w3.K
    public final void T(g gVar, V v10, View view, p pVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d0)) {
            S(view, pVar);
            return;
        }
        d0 d0Var = (d0) layoutParams;
        if (this.f25502t == 0) {
            g0 g0Var = d0Var.f47846e;
            if (g0Var == null) {
                i11 = -1;
            } else {
                i11 = g0Var.f47881e;
            }
            pVar.k(o.a(i11, 1, -1, -1, false));
            return;
        }
        g0 g0Var2 = d0Var.f47846e;
        if (g0Var2 == null) {
            i10 = -1;
        } else {
            i10 = g0Var2.f47881e;
        }
        pVar.k(o.a(-1, -1, i10, 1, false));
    }

    public final void T0(g gVar, C6111s c6111s) {
        int i10;
        int i11;
        if (c6111s.f47964a && !c6111s.f47972i) {
            if (c6111s.f47965b == 0) {
                if (c6111s.f47968e == -1) {
                    U0(c6111s.f47970g, gVar);
                    return;
                } else {
                    V0(c6111s.f47969f, gVar);
                    return;
                }
            }
            int i12 = 1;
            if (c6111s.f47968e == -1) {
                int i13 = c6111s.f47969f;
                int h10 = this.f25499q[0].h(i13);
                while (i12 < this.f25498p) {
                    int h11 = this.f25499q[i12].h(i13);
                    if (h11 > h10) {
                        h10 = h11;
                    }
                    i12++;
                }
                int i14 = i13 - h10;
                if (i14 < 0) {
                    i11 = c6111s.f47970g;
                } else {
                    i11 = c6111s.f47970g - Math.min(i14, c6111s.f47965b);
                }
                U0(i11, gVar);
                return;
            }
            int i15 = c6111s.f47970g;
            int f6 = this.f25499q[0].f(i15);
            while (i12 < this.f25498p) {
                int f10 = this.f25499q[i12].f(i15);
                if (f10 < f6) {
                    f6 = f10;
                }
                i12++;
            }
            int i16 = f6 - c6111s.f47970g;
            if (i16 < 0) {
                i10 = c6111s.f47969f;
            } else {
                i10 = Math.min(i16, c6111s.f47965b) + c6111s.f47969f;
            }
            V0(i10, gVar);
        }
    }

    @Override // w3.K
    public final void U(int i10, int i11) {
        M0(i10, i11, 1);
    }

    public final void U0(int i10, g gVar) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u10 = u(v10);
            if (this.f25500r.d(u10) >= i10 && this.f25500r.j(u10) >= i10) {
                d0 d0Var = (d0) u10.getLayoutParams();
                d0Var.getClass();
                if (d0Var.f47846e.f47877a.size() == 1) {
                    return;
                }
                g0 g0Var = d0Var.f47846e;
                ArrayList arrayList = g0Var.f47877a;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                d0 d0Var2 = (d0) view.getLayoutParams();
                d0Var2.f47846e = null;
                if (d0Var2.f47767a.j() || d0Var2.f47767a.m()) {
                    g0Var.f47880d -= g0Var.f47882f.f25500r.c(view);
                }
                if (size == 1) {
                    g0Var.f47878b = Integer.MIN_VALUE;
                }
                g0Var.f47879c = Integer.MIN_VALUE;
                g0(u10, gVar);
            } else {
                return;
            }
        }
    }

    @Override // w3.K
    public final void V() {
        this.f25488B.d();
        j0();
    }

    public final void V0(int i10, g gVar) {
        while (v() > 0) {
            View u10 = u(0);
            if (this.f25500r.b(u10) <= i10 && this.f25500r.i(u10) <= i10) {
                d0 d0Var = (d0) u10.getLayoutParams();
                d0Var.getClass();
                if (d0Var.f47846e.f47877a.size() == 1) {
                    return;
                }
                g0 g0Var = d0Var.f47846e;
                ArrayList arrayList = g0Var.f47877a;
                View view = (View) arrayList.remove(0);
                d0 d0Var2 = (d0) view.getLayoutParams();
                d0Var2.f47846e = null;
                if (arrayList.size() == 0) {
                    g0Var.f47879c = Integer.MIN_VALUE;
                }
                if (d0Var2.f47767a.j() || d0Var2.f47767a.m()) {
                    g0Var.f47880d -= g0Var.f47882f.f25500r.c(view);
                }
                g0Var.f47878b = Integer.MIN_VALUE;
                g0(u10, gVar);
            } else {
                return;
            }
        }
    }

    @Override // w3.K
    public final void W(int i10, int i11) {
        M0(i10, i11, 8);
    }

    public final void W0() {
        if (this.f25502t != 1 && O0()) {
            this.f25506x = !this.f25505w;
        } else {
            this.f25506x = this.f25505w;
        }
    }

    @Override // w3.K
    public final void X(int i10, int i11) {
        M0(i10, i11, 2);
    }

    public final int X0(int i10, g gVar, V v10) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        S0(i10, v10);
        C6111s c6111s = this.f25504v;
        int D02 = D0(gVar, c6111s, v10);
        if (c6111s.f47965b >= D02) {
            if (i10 < 0) {
                i10 = -D02;
            } else {
                i10 = D02;
            }
        }
        this.f25500r.k(-i10);
        this.f25490D = this.f25506x;
        c6111s.f47965b = 0;
        T0(gVar, c6111s);
        return i10;
    }

    @Override // w3.K
    public final void Y(int i10, int i11) {
        M0(i10, i11, 4);
    }

    public final void Y0(int i10) {
        boolean z10;
        C6111s c6111s = this.f25504v;
        c6111s.f47968e = i10;
        boolean z11 = this.f25506x;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        c6111s.f47967d = i11;
    }

    @Override // w3.K
    public final void Z(g gVar, V v10) {
        Q0(gVar, v10, true);
    }

    public final void Z0(int i10, V v10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        C6111s c6111s = this.f25504v;
        boolean z12 = false;
        c6111s.f47965b = 0;
        c6111s.f47966c = i10;
        C6115w c6115w = this.f47756e;
        if (c6115w != null && c6115w.f47996e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i16 = v10.f47778a) != -1) {
            boolean z13 = this.f25506x;
            if (i16 < i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z13 == z11) {
                i12 = this.f25500r.g();
                i11 = 0;
            } else {
                i11 = this.f25500r.g();
                i12 = 0;
            }
        } else {
            i12 = 0;
            i11 = 0;
        }
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null && recyclerView.f25465n0) {
            c6111s.f47969f = this.f25500r.f() - i11;
            c6111s.f47970g = this.f25500r.e() + i12;
        } else {
            C6116x c6116x = (C6116x) this.f25500r;
            int i17 = c6116x.f48008d;
            K k10 = c6116x.f48009a;
            switch (i17) {
                case 0:
                    i15 = k10.f47765n;
                    break;
                default:
                    i15 = k10.f47766o;
                    break;
            }
            c6111s.f47970g = i15 + i12;
            c6111s.f47969f = -i11;
        }
        c6111s.f47971h = false;
        c6111s.f47964a = true;
        AbstractC6117y abstractC6117y = this.f25500r;
        C6116x c6116x2 = (C6116x) abstractC6117y;
        int i18 = c6116x2.f48008d;
        K k11 = c6116x2.f48009a;
        switch (i18) {
            case 0:
                i13 = k11.f47763l;
                break;
            default:
                i13 = k11.f47764m;
                break;
        }
        if (i13 == 0) {
            C6116x c6116x3 = (C6116x) abstractC6117y;
            int i19 = c6116x3.f48008d;
            K k12 = c6116x3.f48009a;
            switch (i19) {
                case 0:
                    i14 = k12.f47765n;
                    break;
                default:
                    i14 = k12.f47766o;
                    break;
            }
            if (i14 == 0) {
                z12 = true;
            }
        }
        c6111s.f47972i = z12;
    }

    @Override // w3.U
    public final PointF a(int i10) {
        int y02 = y0(i10);
        PointF pointF = new PointF();
        if (y02 == 0) {
            return null;
        }
        if (this.f25502t == 0) {
            pointF.x = y02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = y02;
        }
        return pointF;
    }

    @Override // w3.K
    public final void a0(V v10) {
        this.f25508z = -1;
        this.f25487A = Integer.MIN_VALUE;
        this.f25492F = null;
        this.f25494H.a();
    }

    public final void a1(g0 g0Var, int i10, int i11) {
        int i12 = g0Var.f47880d;
        int i13 = g0Var.f47881e;
        if (i10 == -1) {
            int i14 = g0Var.f47878b;
            if (i14 == Integer.MIN_VALUE) {
                View view = (View) g0Var.f47877a.get(0);
                g0Var.f47878b = g0Var.f47882f.f25500r.d(view);
                ((d0) view.getLayoutParams()).getClass();
                i14 = g0Var.f47878b;
            }
            if (i14 + i12 <= i11) {
                this.f25507y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = g0Var.f47879c;
        if (i15 == Integer.MIN_VALUE) {
            g0Var.a();
            i15 = g0Var.f47879c;
        }
        if (i15 - i12 >= i11) {
            this.f25507y.set(i13, false);
        }
    }

    @Override // w3.K
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof f0) {
            this.f25492F = (f0) parcelable;
            j0();
        }
    }

    @Override // w3.K
    public final void c(String str) {
        if (this.f25492F == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, w3.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.os.Parcelable, w3.f0, java.lang.Object] */
    @Override // w3.K
    public final Parcelable c0() {
        int i10;
        View view;
        int i11;
        int f6;
        int[] iArr;
        f0 f0Var = this.f25492F;
        if (f0Var != null) {
            ?? obj = new Object();
            obj.f47864h0 = f0Var.f47864h0;
            obj.f47862Y = f0Var.f47862Y;
            obj.f47863Z = f0Var.f47863Z;
            obj.f47865i0 = f0Var.f47865i0;
            obj.f47866j0 = f0Var.f47866j0;
            obj.f47867k0 = f0Var.f47867k0;
            obj.f47869m0 = f0Var.f47869m0;
            obj.f47870n0 = f0Var.f47870n0;
            obj.f47871o0 = f0Var.f47871o0;
            obj.f47868l0 = f0Var.f47868l0;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f47869m0 = this.f25505w;
        obj2.f47870n0 = this.f25490D;
        obj2.f47871o0 = this.f25491E;
        j0 j0Var = this.f25488B;
        if (j0Var != null && (iArr = (int[]) j0Var.f47912b) != null) {
            obj2.f47867k0 = iArr;
            obj2.f47866j0 = iArr.length;
            obj2.f47868l0 = (List) j0Var.f47913c;
        } else {
            obj2.f47866j0 = 0;
        }
        int i12 = -1;
        if (v() > 0) {
            if (this.f25490D) {
                i10 = J0();
            } else {
                i10 = I0();
            }
            obj2.f47862Y = i10;
            if (this.f25506x) {
                view = E0(true);
            } else {
                view = F0(true);
            }
            if (view != null) {
                i12 = K.F(view);
            }
            obj2.f47863Z = i12;
            int i13 = this.f25498p;
            obj2.f47864h0 = i13;
            obj2.f47865i0 = new int[i13];
            for (int i14 = 0; i14 < this.f25498p; i14++) {
                if (this.f25490D) {
                    i11 = this.f25499q[i14].f(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        f6 = this.f25500r.e();
                        i11 -= f6;
                        obj2.f47865i0[i14] = i11;
                    } else {
                        obj2.f47865i0[i14] = i11;
                    }
                } else {
                    i11 = this.f25499q[i14].h(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        f6 = this.f25500r.f();
                        i11 -= f6;
                        obj2.f47865i0[i14] = i11;
                    } else {
                        obj2.f47865i0[i14] = i11;
                    }
                }
            }
        } else {
            obj2.f47862Y = -1;
            obj2.f47863Z = -1;
            obj2.f47864h0 = 0;
        }
        return obj2;
    }

    @Override // w3.K
    public final boolean d() {
        if (this.f25502t == 0) {
            return true;
        }
        return false;
    }

    @Override // w3.K
    public final void d0(int i10) {
        if (i10 == 0) {
            z0();
        }
    }

    @Override // w3.K
    public final boolean e() {
        if (this.f25502t == 1) {
            return true;
        }
        return false;
    }

    @Override // w3.K
    public final boolean f(L l10) {
        return l10 instanceof d0;
    }

    @Override // w3.K
    public final void h(int i10, int i11, V v10, C6061h c6061h) {
        C6111s c6111s;
        int f6;
        int i12;
        if (this.f25502t != 0) {
            i10 = i11;
        }
        if (v() != 0 && i10 != 0) {
            S0(i10, v10);
            int[] iArr = this.f25496J;
            if (iArr == null || iArr.length < this.f25498p) {
                this.f25496J = new int[this.f25498p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f25498p;
                c6111s = this.f25504v;
                if (i13 >= i15) {
                    break;
                }
                if (c6111s.f47967d == -1) {
                    f6 = c6111s.f47969f;
                    i12 = this.f25499q[i13].h(f6);
                } else {
                    f6 = this.f25499q[i13].f(c6111s.f47970g);
                    i12 = c6111s.f47970g;
                }
                int i16 = f6 - i12;
                if (i16 >= 0) {
                    this.f25496J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.f25496J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = c6111s.f47966c;
                if (i18 >= 0 && i18 < v10.b()) {
                    c6061h.b(c6111s.f47966c, this.f25496J[i17]);
                    c6111s.f47966c += c6111s.f47967d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // w3.K
    public final int j(V v10) {
        return A0(v10);
    }

    @Override // w3.K
    public final int k(V v10) {
        return B0(v10);
    }

    @Override // w3.K
    public final int k0(int i10, g gVar, V v10) {
        return X0(i10, gVar, v10);
    }

    @Override // w3.K
    public final int l(V v10) {
        return C0(v10);
    }

    @Override // w3.K
    public final void l0(int i10) {
        f0 f0Var = this.f25492F;
        if (f0Var != null && f0Var.f47862Y != i10) {
            f0Var.f47865i0 = null;
            f0Var.f47864h0 = 0;
            f0Var.f47862Y = -1;
            f0Var.f47863Z = -1;
        }
        this.f25508z = i10;
        this.f25487A = Integer.MIN_VALUE;
        j0();
    }

    @Override // w3.K
    public final int m(V v10) {
        return A0(v10);
    }

    @Override // w3.K
    public final int m0(int i10, g gVar, V v10) {
        return X0(i10, gVar, v10);
    }

    @Override // w3.K
    public final int n(V v10) {
        return B0(v10);
    }

    @Override // w3.K
    public final int o(V v10) {
        return C0(v10);
    }

    @Override // w3.K
    public final void p0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int D6 = D() + C();
        int B10 = B() + E();
        if (this.f25502t == 1) {
            int height = rect.height() + B10;
            RecyclerView recyclerView = this.f47753b;
            WeakHashMap weakHashMap = Z.f3247a;
            i13 = K.g(i11, height, H.d(recyclerView));
            i12 = K.g(i10, (this.f25503u * this.f25498p) + D6, H.e(this.f47753b));
        } else {
            int width = rect.width() + D6;
            RecyclerView recyclerView2 = this.f47753b;
            WeakHashMap weakHashMap2 = Z.f3247a;
            i12 = K.g(i10, width, H.e(recyclerView2));
            i13 = K.g(i11, (this.f25503u * this.f25498p) + B10, H.d(this.f47753b));
        }
        RecyclerView.e(this.f47753b, i12, i13);
    }

    @Override // w3.K
    public final L r() {
        if (this.f25502t == 0) {
            return new L(-2, -1);
        }
        return new L(-1, -2);
    }

    @Override // w3.K
    public final L s(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    @Override // w3.K
    public final L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new L((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new L(layoutParams);
    }

    @Override // w3.K
    public final void v0(RecyclerView recyclerView, int i10) {
        C6115w c6115w = new C6115w(recyclerView.getContext());
        c6115w.f47992a = i10;
        w0(c6115w);
    }

    @Override // w3.K
    public final int x(g gVar, V v10) {
        if (this.f25502t == 1) {
            return this.f25498p;
        }
        return super.x(gVar, v10);
    }

    @Override // w3.K
    public final boolean x0() {
        if (this.f25492F == null) {
            return true;
        }
        return false;
    }

    public final int y0(int i10) {
        boolean z10;
        if (v() == 0) {
            if (!this.f25506x) {
                return -1;
            }
            return 1;
        }
        if (i10 < I0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f25506x) {
            return -1;
        }
        return 1;
    }

    public final boolean z0() {
        int i10;
        if (v() != 0 && this.f25489C != 0 && this.f47758g) {
            if (this.f25506x) {
                i10 = J0();
                I0();
            } else {
                i10 = I0();
                J0();
            }
            j0 j0Var = this.f25488B;
            if (i10 == 0 && N0() != null) {
                j0Var.d();
                this.f47757f = true;
                j0();
                return true;
            }
        }
        return false;
    }
}
