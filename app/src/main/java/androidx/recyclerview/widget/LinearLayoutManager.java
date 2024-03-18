package androidx.recyclerview.widget;

import K4.J;
import android.content.Context;
import android.gov.nist.core.a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import i3.g;
import java.util.List;
import p3.w;
import w.C6061h;
import w3.AbstractC6117y;
import w3.C6112t;
import w3.C6113u;
import w3.C6114v;
import w3.C6115w;
import w3.C6116x;
import w3.K;
import w3.L;
import w3.U;
import w3.V;
import w3.Y;

/* loaded from: classes.dex */
public class LinearLayoutManager extends K implements U {

    /* renamed from: A  reason: collision with root package name */
    public final w f25404A;

    /* renamed from: B  reason: collision with root package name */
    public final C6112t f25405B;

    /* renamed from: C  reason: collision with root package name */
    public final int f25406C;

    /* renamed from: D  reason: collision with root package name */
    public final int[] f25407D;

    /* renamed from: p  reason: collision with root package name */
    public int f25408p;

    /* renamed from: q  reason: collision with root package name */
    public C6113u f25409q;

    /* renamed from: r  reason: collision with root package name */
    public C6116x f25410r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f25411s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f25412t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f25413u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f25414v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f25415w;

    /* renamed from: x  reason: collision with root package name */
    public int f25416x;

    /* renamed from: y  reason: collision with root package name */
    public int f25417y;

    /* renamed from: z  reason: collision with root package name */
    public C6114v f25418z;

    /* JADX WARN: Type inference failed for: r2v1, types: [w3.t, java.lang.Object] */
    public LinearLayoutManager(int i10) {
        this.f25408p = 1;
        this.f25412t = false;
        this.f25413u = false;
        this.f25414v = false;
        this.f25415w = true;
        this.f25416x = -1;
        this.f25417y = Integer.MIN_VALUE;
        this.f25418z = null;
        this.f25404A = new w();
        this.f25405B = new Object();
        this.f25406C = 2;
        this.f25407D = new int[2];
        X0(i10);
        c(null);
        if (!this.f25412t) {
            return;
        }
        this.f25412t = false;
        j0();
    }

    public final int A0(V v10) {
        if (v() == 0) {
            return 0;
        }
        E0();
        C6116x c6116x = this.f25410r;
        boolean z10 = !this.f25415w;
        return J.k(v10, c6116x, H0(z10), G0(z10), this, this.f25415w);
    }

    public final int B0(V v10) {
        if (v() == 0) {
            return 0;
        }
        E0();
        C6116x c6116x = this.f25410r;
        boolean z10 = !this.f25415w;
        return J.l(v10, c6116x, H0(z10), G0(z10), this, this.f25415w, this.f25413u);
    }

    public final int C0(V v10) {
        if (v() == 0) {
            return 0;
        }
        E0();
        C6116x c6116x = this.f25410r;
        boolean z10 = !this.f25415w;
        return J.m(v10, c6116x, H0(z10), G0(z10), this, this.f25415w);
    }

    public final int D0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f25408p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f25408p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f25408p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f25408p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f25408p != 1 && Q0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f25408p == 1 || !Q0()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w3.u, java.lang.Object] */
    public final void E0() {
        if (this.f25409q == null) {
            ?? obj = new Object();
            obj.f47977a = true;
            obj.f47984h = 0;
            obj.f47985i = 0;
            obj.f47987k = null;
            this.f25409q = obj;
        }
    }

    public final int F0(g gVar, C6113u c6113u, V v10, boolean z10) {
        int i10;
        int i11 = c6113u.f47979c;
        int i12 = c6113u.f47983g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                c6113u.f47983g = i12 + i11;
            }
            T0(gVar, c6113u);
        }
        int i13 = c6113u.f47979c + c6113u.f47984h;
        while (true) {
            if ((!c6113u.f47988l && i13 <= 0) || (i10 = c6113u.f47980d) < 0 || i10 >= v10.b()) {
                break;
            }
            C6112t c6112t = this.f25405B;
            c6112t.f47973a = 0;
            c6112t.f47974b = false;
            c6112t.f47975c = false;
            c6112t.f47976d = false;
            R0(gVar, v10, c6113u, c6112t);
            if (!c6112t.f47974b) {
                int i14 = c6113u.f47978b;
                int i15 = c6112t.f47973a;
                c6113u.f47978b = (c6113u.f47982f * i15) + i14;
                if (!c6112t.f47975c || c6113u.f47987k != null || !v10.f47784g) {
                    c6113u.f47979c -= i15;
                    i13 -= i15;
                }
                int i16 = c6113u.f47983g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    c6113u.f47983g = i17;
                    int i18 = c6113u.f47979c;
                    if (i18 < 0) {
                        c6113u.f47983g = i17 + i18;
                    }
                    T0(gVar, c6113u);
                }
                if (z10 && c6112t.f47976d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - c6113u.f47979c;
    }

    public final View G0(boolean z10) {
        if (this.f25413u) {
            return K0(0, v(), z10);
        }
        return K0(v() - 1, -1, z10);
    }

    public final View H0(boolean z10) {
        if (this.f25413u) {
            return K0(v() - 1, -1, z10);
        }
        return K0(0, v(), z10);
    }

    public final int I0() {
        View K02 = K0(v() - 1, -1, false);
        if (K02 == null) {
            return -1;
        }
        return K.F(K02);
    }

    @Override // w3.K
    public final boolean J() {
        return true;
    }

    public final View J0(int i10, int i11) {
        int i12;
        int i13;
        E0();
        if (i11 > i10 || i11 < i10) {
            if (this.f25410r.d(u(i10)) < this.f25410r.f()) {
                i13 = 16644;
                i12 = 16388;
            } else {
                i13 = 4161;
                i12 = 4097;
            }
            if (this.f25408p == 0) {
                return this.f47754c.f(i10, i11, i13, i12);
            }
            return this.f47755d.f(i10, i11, i13, i12);
        }
        return u(i10);
    }

    public final View K0(int i10, int i11, boolean z10) {
        int i12;
        E0();
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (this.f25408p == 0) {
            return this.f47754c.f(i10, i11, i12, 320);
        }
        return this.f47755d.f(i10, i11, i12, 320);
    }

    public View L0(g gVar, V v10, int i10, int i11, int i12) {
        int i13;
        E0();
        int f6 = this.f25410r.f();
        int e10 = this.f25410r.e();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View u10 = u(i10);
            int F10 = K.F(u10);
            if (F10 >= 0 && F10 < i12) {
                if (((L) u10.getLayoutParams()).f47767a.j()) {
                    if (view2 == null) {
                        view2 = u10;
                    }
                } else if (this.f25410r.d(u10) < e10 && this.f25410r.b(u10) >= f6) {
                    return u10;
                } else {
                    if (view == null) {
                        view = u10;
                    }
                }
            }
            i10 += i13;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final int M0(int i10, g gVar, V v10, boolean z10) {
        int e10;
        int e11 = this.f25410r.e() - i10;
        if (e11 > 0) {
            int i11 = -W0(-e11, gVar, v10);
            int i12 = i10 + i11;
            if (z10 && (e10 = this.f25410r.e() - i12) > 0) {
                this.f25410r.k(e10);
                return e10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int N0(int i10, g gVar, V v10, boolean z10) {
        int f6;
        int f10 = i10 - this.f25410r.f();
        if (f10 > 0) {
            int i11 = -W0(f10, gVar, v10);
            int i12 = i10 + i11;
            if (z10 && (f6 = i12 - this.f25410r.f()) > 0) {
                this.f25410r.k(-f6);
                return i11 - f6;
            }
            return i11;
        }
        return 0;
    }

    public final View O0() {
        int i10;
        if (this.f25413u) {
            i10 = 0;
        } else {
            i10 = v() - 1;
        }
        return u(i10);
    }

    @Override // w3.K
    public final void P(RecyclerView recyclerView) {
    }

    public final View P0() {
        int i10;
        if (this.f25413u) {
            i10 = v() - 1;
        } else {
            i10 = 0;
        }
        return u(i10);
    }

    @Override // w3.K
    public View Q(View view, int i10, g gVar, V v10) {
        int D02;
        View view2;
        View view3;
        V0();
        if (v() == 0 || (D02 = D0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        E0();
        Z0(D02, (int) (this.f25410r.g() * 0.33333334f), false, v10);
        C6113u c6113u = this.f25409q;
        c6113u.f47983g = Integer.MIN_VALUE;
        c6113u.f47977a = false;
        F0(gVar, c6113u, v10, true);
        if (D02 == -1) {
            if (this.f25413u) {
                view2 = J0(v() - 1, -1);
            } else {
                view2 = J0(0, v());
            }
        } else if (this.f25413u) {
            view2 = J0(0, v());
        } else {
            view2 = J0(v() - 1, -1);
        }
        if (D02 == -1) {
            view3 = P0();
        } else {
            view3 = O0();
        }
        if (view3.hasFocusable()) {
            if (view2 == null) {
                return null;
            }
            return view3;
        }
        return view2;
    }

    public final boolean Q0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    @Override // w3.K
    public final void R(AccessibilityEvent accessibilityEvent) {
        int i10;
        super.R(accessibilityEvent);
        if (v() > 0) {
            View K02 = K0(0, v(), false);
            if (K02 == null) {
                i10 = -1;
            } else {
                i10 = K.F(K02);
            }
            accessibilityEvent.setFromIndex(i10);
            accessibilityEvent.setToIndex(I0());
        }
    }

    public void R0(g gVar, V v10, C6113u c6113u, C6112t c6112t) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        View b10 = c6113u.b(gVar);
        if (b10 == null) {
            c6112t.f47974b = true;
            return;
        }
        L l10 = (L) b10.getLayoutParams();
        if (c6113u.f47987k == null) {
            boolean z12 = this.f25413u;
            if (c6113u.f47982f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z13 = this.f25413u;
            if (c6113u.f47982f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        L l11 = (L) b10.getLayoutParams();
        Rect J10 = this.f47753b.J(b10);
        int i14 = J10.left + J10.right;
        int i15 = J10.top + J10.bottom;
        int w10 = K.w(this.f47765n, this.f47763l, D() + C() + ((ViewGroup.MarginLayoutParams) l11).leftMargin + ((ViewGroup.MarginLayoutParams) l11).rightMargin + i14, ((ViewGroup.MarginLayoutParams) l11).width, d());
        int w11 = K.w(this.f47766o, this.f47764m, B() + E() + ((ViewGroup.MarginLayoutParams) l11).topMargin + ((ViewGroup.MarginLayoutParams) l11).bottomMargin + i15, ((ViewGroup.MarginLayoutParams) l11).height, e());
        if (s0(b10, w10, w11, l11)) {
            b10.measure(w10, w11);
        }
        c6112t.f47973a = this.f25410r.c(b10);
        if (this.f25408p == 1) {
            if (Q0()) {
                i13 = this.f47765n - D();
                i12 = i13 - this.f25410r.l(b10);
            } else {
                i12 = C();
                i13 = this.f25410r.l(b10) + i12;
            }
            if (c6113u.f47982f == -1) {
                i10 = c6113u.f47978b;
                i11 = i10 - c6112t.f47973a;
            } else {
                i11 = c6113u.f47978b;
                i10 = c6112t.f47973a + i11;
            }
        } else {
            int E10 = E();
            int l12 = this.f25410r.l(b10) + E10;
            if (c6113u.f47982f == -1) {
                int i16 = c6113u.f47978b;
                int i17 = i16 - c6112t.f47973a;
                i13 = i16;
                i10 = l12;
                i12 = i17;
                i11 = E10;
            } else {
                int i18 = c6113u.f47978b;
                int i19 = c6112t.f47973a + i18;
                i12 = i18;
                i10 = l12;
                i11 = E10;
                i13 = i19;
            }
        }
        K.L(b10, i12, i11, i13, i10);
        if (l10.f47767a.j() || l10.f47767a.m()) {
            c6112t.f47975c = true;
        }
        c6112t.f47976d = b10.hasFocusable();
    }

    public final void T0(g gVar, C6113u c6113u) {
        int i10;
        if (c6113u.f47977a && !c6113u.f47988l) {
            int i11 = c6113u.f47983g;
            int i12 = c6113u.f47985i;
            if (c6113u.f47982f == -1) {
                int v10 = v();
                if (i11 >= 0) {
                    C6116x c6116x = this.f25410r;
                    int i13 = c6116x.f48008d;
                    K k10 = c6116x.f48009a;
                    switch (i13) {
                        case 0:
                            i10 = k10.f47765n;
                            break;
                        default:
                            i10 = k10.f47766o;
                            break;
                    }
                    int i14 = (i10 - i11) + i12;
                    if (this.f25413u) {
                        for (int i15 = 0; i15 < v10; i15++) {
                            View u10 = u(i15);
                            if (this.f25410r.d(u10) < i14 || this.f25410r.j(u10) < i14) {
                                U0(gVar, 0, i15);
                                return;
                            }
                        }
                        return;
                    }
                    int i16 = v10 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View u11 = u(i17);
                        if (this.f25410r.d(u11) < i14 || this.f25410r.j(u11) < i14) {
                            U0(gVar, i16, i17);
                            return;
                        }
                    }
                }
            } else if (i11 >= 0) {
                int i18 = i11 - i12;
                int v11 = v();
                if (this.f25413u) {
                    int i19 = v11 - 1;
                    for (int i20 = i19; i20 >= 0; i20--) {
                        View u12 = u(i20);
                        if (this.f25410r.b(u12) > i18 || this.f25410r.i(u12) > i18) {
                            U0(gVar, i19, i20);
                            return;
                        }
                    }
                    return;
                }
                for (int i21 = 0; i21 < v11; i21++) {
                    View u13 = u(i21);
                    if (this.f25410r.b(u13) > i18 || this.f25410r.i(u13) > i18) {
                        U0(gVar, 0, i21);
                        return;
                    }
                }
            }
        }
    }

    public final void U0(g gVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                View u10 = u(i12);
                h0(i12);
                gVar.f(u10);
            }
            return;
        }
        while (i10 > i11) {
            View u11 = u(i10);
            h0(i10);
            gVar.f(u11);
            i10--;
        }
    }

    public final void V0() {
        if (this.f25408p != 1 && Q0()) {
            this.f25413u = !this.f25412t;
        } else {
            this.f25413u = this.f25412t;
        }
    }

    public final int W0(int i10, g gVar, V v10) {
        int i11;
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        E0();
        this.f25409q.f47977a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        Z0(i11, abs, true, v10);
        C6113u c6113u = this.f25409q;
        int F02 = F0(gVar, c6113u, v10, false) + c6113u.f47983g;
        if (F02 < 0) {
            return 0;
        }
        if (abs > F02) {
            i10 = i11 * F02;
        }
        this.f25410r.k(-i10);
        this.f25409q.f47986j = i10;
        return i10;
    }

    public final void X0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a.e("invalid orientation:", i10));
        }
        c(null);
        if (i10 != this.f25408p || this.f25410r == null) {
            C6116x a5 = AbstractC6117y.a(this, i10);
            this.f25410r = a5;
            this.f25404A.f42684f = a5;
            this.f25408p = i10;
            j0();
        }
    }

    public void Y0(boolean z10) {
        c(null);
        if (this.f25414v == z10) {
            return;
        }
        this.f25414v = z10;
        j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0493  */
    @Override // w3.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z(g gVar, V v10) {
        View view;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int size;
        int i15;
        int i16;
        int i17;
        List list;
        boolean z11;
        int i18;
        int i19;
        int M02;
        int i20;
        int i21;
        View q10;
        int d10;
        int i22;
        int i23;
        View view2;
        View view3;
        int i24;
        int i25;
        boolean z12;
        boolean z13;
        int i26;
        int i27;
        int i28 = -1;
        if ((this.f25418z != null || this.f25416x != -1) && v10.b() == 0) {
            e0(gVar);
            return;
        }
        C6114v c6114v = this.f25418z;
        if (c6114v != null && (i27 = c6114v.f47989Y) >= 0) {
            this.f25416x = i27;
        }
        E0();
        this.f25409q.f47977a = false;
        V0();
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.f47752a.j(view)) {
            view = null;
        }
        w wVar = this.f25404A;
        if (wVar.f42683e && this.f25416x == -1 && this.f25418z == null) {
            if (view != null && (this.f25410r.d(view) >= this.f25410r.e() || this.f25410r.b(view) <= this.f25410r.f())) {
                wVar.d(view, K.F(view));
            }
        } else {
            wVar.f();
            wVar.f42682d = this.f25413u ^ this.f25414v;
            if (!v10.f47784g && (i25 = this.f25416x) != -1) {
                if (i25 >= 0 && i25 < v10.b()) {
                    int i29 = this.f25416x;
                    wVar.f42680b = i29;
                    C6114v c6114v2 = this.f25418z;
                    if (c6114v2 != null && c6114v2.f47989Y >= 0) {
                        boolean z14 = c6114v2.f47991h0;
                        wVar.f42682d = z14;
                        if (z14) {
                            wVar.f42681c = this.f25410r.e() - this.f25418z.f47990Z;
                        } else {
                            wVar.f42681c = this.f25410r.f() + this.f25418z.f47990Z;
                        }
                    } else if (this.f25417y == Integer.MIN_VALUE) {
                        View q11 = q(i29);
                        if (q11 != null) {
                            if (this.f25410r.c(q11) > this.f25410r.g()) {
                                wVar.b();
                            } else if (this.f25410r.d(q11) - this.f25410r.f() < 0) {
                                wVar.f42681c = this.f25410r.f();
                                wVar.f42682d = false;
                            } else if (this.f25410r.e() - this.f25410r.b(q11) < 0) {
                                wVar.f42681c = this.f25410r.e();
                                wVar.f42682d = true;
                            } else {
                                if (wVar.f42682d) {
                                    i26 = this.f25410r.h() + this.f25410r.b(q11);
                                } else {
                                    i26 = this.f25410r.d(q11);
                                }
                                wVar.f42681c = i26;
                            }
                        } else {
                            if (v() > 0) {
                                if (this.f25416x < K.F(u(0))) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12 == this.f25413u) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                wVar.f42682d = z13;
                            }
                            wVar.b();
                        }
                    } else {
                        boolean z15 = this.f25413u;
                        wVar.f42682d = z15;
                        if (z15) {
                            wVar.f42681c = this.f25410r.e() - this.f25417y;
                        } else {
                            wVar.f42681c = this.f25410r.f() + this.f25417y;
                        }
                    }
                    wVar.f42683e = true;
                } else {
                    this.f25416x = -1;
                    this.f25417y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f47753b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.f47752a.j(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    L l10 = (L) view2.getLayoutParams();
                    if (!l10.f47767a.j() && l10.f47767a.c() >= 0 && l10.f47767a.c() < v10.b()) {
                        wVar.d(view2, K.F(view2));
                        wVar.f42683e = true;
                    }
                }
                if (this.f25411s == this.f25414v) {
                    if (wVar.f42682d) {
                        if (this.f25413u) {
                            view3 = L0(gVar, v10, 0, v(), v10.b());
                        } else {
                            view3 = L0(gVar, v10, v() - 1, -1, v10.b());
                        }
                    } else if (this.f25413u) {
                        view3 = L0(gVar, v10, v() - 1, -1, v10.b());
                    } else {
                        view3 = L0(gVar, v10, 0, v(), v10.b());
                    }
                    if (view3 != null) {
                        wVar.c(view3, K.F(view3));
                        if (!v10.f47784g && x0() && (this.f25410r.d(view3) >= this.f25410r.e() || this.f25410r.b(view3) < this.f25410r.f())) {
                            if (wVar.f42682d) {
                                i24 = this.f25410r.e();
                            } else {
                                i24 = this.f25410r.f();
                            }
                            wVar.f42681c = i24;
                        }
                        wVar.f42683e = true;
                    }
                }
            }
            wVar.b();
            if (this.f25414v) {
                i23 = v10.b() - 1;
            } else {
                i23 = 0;
            }
            wVar.f42680b = i23;
            wVar.f42683e = true;
        }
        C6113u c6113u = this.f25409q;
        if (c6113u.f47986j >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        c6113u.f47982f = i10;
        int[] iArr = this.f25407D;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(v10, iArr);
        int f6 = this.f25410r.f() + Math.max(0, iArr[0]);
        int max = Math.max(0, iArr[1]);
        C6116x c6116x = this.f25410r;
        int i30 = c6116x.f48008d;
        K k10 = c6116x.f48009a;
        switch (i30) {
            case 0:
                i11 = k10.D();
                break;
            default:
                i11 = k10.B();
                break;
        }
        int i31 = i11 + max;
        if (v10.f47784g && (i21 = this.f25416x) != -1 && this.f25417y != Integer.MIN_VALUE && (q10 = q(i21)) != null) {
            if (this.f25413u) {
                i22 = this.f25410r.e() - this.f25410r.b(q10);
                d10 = this.f25417y;
            } else {
                d10 = this.f25410r.d(q10) - this.f25410r.f();
                i22 = this.f25417y;
            }
            int i32 = i22 - d10;
            if (i32 > 0) {
                f6 += i32;
            } else {
                i31 -= i32;
            }
        }
        if (!wVar.f42682d ? !this.f25413u : this.f25413u) {
            i28 = 1;
        }
        S0(gVar, v10, wVar, i28);
        p(gVar);
        C6113u c6113u2 = this.f25409q;
        C6116x c6116x2 = this.f25410r;
        int i33 = c6116x2.f48008d;
        K k11 = c6116x2.f48009a;
        switch (i33) {
            case 0:
                i12 = k11.f47763l;
                break;
            default:
                i12 = k11.f47764m;
                break;
        }
        if (i12 == 0) {
            switch (i33) {
                case 0:
                    i20 = k11.f47765n;
                    break;
                default:
                    i20 = k11.f47766o;
                    break;
            }
            if (i20 == 0) {
                z10 = true;
                c6113u2.f47988l = z10;
                c6113u2.getClass();
                this.f25409q.f47985i = 0;
                if (!wVar.f42682d) {
                    b1(wVar.f42680b, wVar.f42681c);
                    C6113u c6113u3 = this.f25409q;
                    c6113u3.f47984h = f6;
                    F0(gVar, c6113u3, v10, false);
                    C6113u c6113u4 = this.f25409q;
                    i13 = c6113u4.f47978b;
                    int i34 = c6113u4.f47980d;
                    int i35 = c6113u4.f47979c;
                    if (i35 > 0) {
                        i31 += i35;
                    }
                    a1(wVar.f42680b, wVar.f42681c);
                    C6113u c6113u5 = this.f25409q;
                    c6113u5.f47984h = i31;
                    c6113u5.f47980d += c6113u5.f47981e;
                    F0(gVar, c6113u5, v10, false);
                    C6113u c6113u6 = this.f25409q;
                    i14 = c6113u6.f47978b;
                    int i36 = c6113u6.f47979c;
                    if (i36 > 0) {
                        b1(i34, i13);
                        C6113u c6113u7 = this.f25409q;
                        c6113u7.f47984h = i36;
                        F0(gVar, c6113u7, v10, false);
                        i13 = this.f25409q.f47978b;
                    }
                } else {
                    a1(wVar.f42680b, wVar.f42681c);
                    C6113u c6113u8 = this.f25409q;
                    c6113u8.f47984h = i31;
                    F0(gVar, c6113u8, v10, false);
                    C6113u c6113u9 = this.f25409q;
                    i14 = c6113u9.f47978b;
                    int i37 = c6113u9.f47980d;
                    int i38 = c6113u9.f47979c;
                    if (i38 > 0) {
                        f6 += i38;
                    }
                    b1(wVar.f42680b, wVar.f42681c);
                    C6113u c6113u10 = this.f25409q;
                    c6113u10.f47984h = f6;
                    c6113u10.f47980d += c6113u10.f47981e;
                    F0(gVar, c6113u10, v10, false);
                    C6113u c6113u11 = this.f25409q;
                    i13 = c6113u11.f47978b;
                    int i39 = c6113u11.f47979c;
                    if (i39 > 0) {
                        a1(i37, i14);
                        C6113u c6113u12 = this.f25409q;
                        c6113u12.f47984h = i39;
                        F0(gVar, c6113u12, v10, false);
                        i14 = this.f25409q.f47978b;
                    }
                }
                if (v() > 0) {
                    if (this.f25413u ^ this.f25414v) {
                        int M03 = M0(i14, gVar, v10, true);
                        i18 = i13 + M03;
                        i19 = i14 + M03;
                        M02 = N0(i18, gVar, v10, false);
                    } else {
                        int N02 = N0(i13, gVar, v10, true);
                        i18 = i13 + N02;
                        i19 = i14 + N02;
                        M02 = M0(i19, gVar, v10, false);
                    }
                    i13 = i18 + M02;
                    i14 = i19 + M02;
                }
                if (v10.f47788k && v() != 0 && !v10.f47784g && x0()) {
                    List list2 = (List) gVar.f32645f;
                    size = list2.size();
                    int F10 = K.F(u(0));
                    i16 = 0;
                    i17 = 0;
                    for (i15 = 0; i15 < size; i15++) {
                        Y y10 = (Y) list2.get(i15);
                        if (!y10.j()) {
                            if (y10.c() < F10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z16 = this.f25413u;
                            View view4 = y10.f47800a;
                            if (z11 != z16) {
                                i16 += this.f25410r.c(view4);
                            } else {
                                i17 += this.f25410r.c(view4);
                            }
                        }
                    }
                    this.f25409q.f47987k = list2;
                    if (i16 > 0) {
                        b1(K.F(P0()), i13);
                        C6113u c6113u13 = this.f25409q;
                        c6113u13.f47984h = i16;
                        c6113u13.f47979c = 0;
                        c6113u13.a(null);
                        F0(gVar, this.f25409q, v10, false);
                    }
                    if (i17 <= 0) {
                        a1(K.F(O0()), i14);
                        C6113u c6113u14 = this.f25409q;
                        c6113u14.f47984h = i17;
                        c6113u14.f47979c = 0;
                        list = null;
                        c6113u14.a(null);
                        F0(gVar, this.f25409q, v10, false);
                    } else {
                        list = null;
                    }
                    this.f25409q.f47987k = list;
                }
                if (v10.f47784g) {
                    C6116x c6116x3 = this.f25410r;
                    c6116x3.f48010b = c6116x3.g();
                } else {
                    wVar.f();
                }
                this.f25411s = this.f25414v;
            }
        }
        z10 = false;
        c6113u2.f47988l = z10;
        c6113u2.getClass();
        this.f25409q.f47985i = 0;
        if (!wVar.f42682d) {
        }
        if (v() > 0) {
        }
        if (v10.f47788k) {
            List list22 = (List) gVar.f32645f;
            size = list22.size();
            int F102 = K.F(u(0));
            i16 = 0;
            i17 = 0;
            while (i15 < size) {
            }
            this.f25409q.f47987k = list22;
            if (i16 > 0) {
            }
            if (i17 <= 0) {
            }
            this.f25409q.f47987k = list;
        }
        if (v10.f47784g) {
        }
        this.f25411s = this.f25414v;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(int i10, int i11, boolean z10, V v10) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        C6113u c6113u = this.f25409q;
        C6116x c6116x = this.f25410r;
        int i17 = c6116x.f48008d;
        K k10 = c6116x.f48009a;
        switch (i17) {
            case 0:
                i12 = k10.f47763l;
                break;
            default:
                i12 = k10.f47764m;
                break;
        }
        boolean z12 = false;
        int i18 = 1;
        if (i12 == 0) {
            switch (i17) {
                case 0:
                    i16 = k10.f47765n;
                    break;
                default:
                    i16 = k10.f47766o;
                    break;
            }
            if (i16 == 0) {
                z11 = true;
                c6113u.f47988l = z11;
                c6113u.f47982f = i10;
                int[] iArr = this.f25407D;
                iArr[0] = 0;
                iArr[1] = 0;
                y0(v10, iArr);
                int max = Math.max(0, iArr[0]);
                int max2 = Math.max(0, iArr[1]);
                if (i10 == 1) {
                    z12 = true;
                }
                C6113u c6113u2 = this.f25409q;
                if (!z12) {
                    i13 = max2;
                } else {
                    i13 = max;
                }
                c6113u2.f47984h = i13;
                if (!z12) {
                    max = max2;
                }
                c6113u2.f47985i = max;
                if (!z12) {
                    C6116x c6116x2 = this.f25410r;
                    int i19 = c6116x2.f48008d;
                    K k11 = c6116x2.f48009a;
                    switch (i19) {
                        case 0:
                            i15 = k11.D();
                            break;
                        default:
                            i15 = k11.B();
                            break;
                    }
                    c6113u2.f47984h = i15 + i13;
                    View O02 = O0();
                    C6113u c6113u3 = this.f25409q;
                    if (this.f25413u) {
                        i18 = -1;
                    }
                    c6113u3.f47981e = i18;
                    int F10 = K.F(O02);
                    C6113u c6113u4 = this.f25409q;
                    c6113u3.f47980d = F10 + c6113u4.f47981e;
                    c6113u4.f47978b = this.f25410r.b(O02);
                    i14 = this.f25410r.b(O02) - this.f25410r.e();
                } else {
                    View P02 = P0();
                    C6113u c6113u5 = this.f25409q;
                    c6113u5.f47984h = this.f25410r.f() + c6113u5.f47984h;
                    C6113u c6113u6 = this.f25409q;
                    if (!this.f25413u) {
                        i18 = -1;
                    }
                    c6113u6.f47981e = i18;
                    int F11 = K.F(P02);
                    C6113u c6113u7 = this.f25409q;
                    c6113u6.f47980d = F11 + c6113u7.f47981e;
                    c6113u7.f47978b = this.f25410r.d(P02);
                    i14 = (-this.f25410r.d(P02)) + this.f25410r.f();
                }
                C6113u c6113u8 = this.f25409q;
                c6113u8.f47979c = i11;
                if (z10) {
                    c6113u8.f47979c = i11 - i14;
                }
                c6113u8.f47983g = i14;
            }
        }
        z11 = false;
        c6113u.f47988l = z11;
        c6113u.f47982f = i10;
        int[] iArr2 = this.f25407D;
        iArr2[0] = 0;
        iArr2[1] = 0;
        y0(v10, iArr2);
        int max3 = Math.max(0, iArr2[0]);
        int max22 = Math.max(0, iArr2[1]);
        if (i10 == 1) {
        }
        C6113u c6113u22 = this.f25409q;
        if (!z12) {
        }
        c6113u22.f47984h = i13;
        if (!z12) {
        }
        c6113u22.f47985i = max3;
        if (!z12) {
        }
        C6113u c6113u82 = this.f25409q;
        c6113u82.f47979c = i11;
        if (z10) {
        }
        c6113u82.f47983g = i14;
    }

    @Override // w3.U
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < K.F(u(0))) {
            z10 = true;
        }
        if (z10 != this.f25413u) {
            i11 = -1;
        }
        if (this.f25408p == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    @Override // w3.K
    public void a0(V v10) {
        this.f25418z = null;
        this.f25416x = -1;
        this.f25417y = Integer.MIN_VALUE;
        this.f25404A.f();
    }

    public final void a1(int i10, int i11) {
        int i12;
        this.f25409q.f47979c = this.f25410r.e() - i11;
        C6113u c6113u = this.f25409q;
        if (this.f25413u) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        c6113u.f47981e = i12;
        c6113u.f47980d = i10;
        c6113u.f47982f = 1;
        c6113u.f47978b = i11;
        c6113u.f47983g = Integer.MIN_VALUE;
    }

    @Override // w3.K
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof C6114v) {
            this.f25418z = (C6114v) parcelable;
            j0();
        }
    }

    public final void b1(int i10, int i11) {
        int i12;
        this.f25409q.f47979c = i11 - this.f25410r.f();
        C6113u c6113u = this.f25409q;
        c6113u.f47980d = i10;
        if (this.f25413u) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        c6113u.f47981e = i12;
        c6113u.f47982f = -1;
        c6113u.f47978b = i11;
        c6113u.f47983g = Integer.MIN_VALUE;
    }

    @Override // w3.K
    public final void c(String str) {
        if (this.f25418z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w3.v, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [w3.v, android.os.Parcelable, java.lang.Object] */
    @Override // w3.K
    public final Parcelable c0() {
        C6114v c6114v = this.f25418z;
        if (c6114v != null) {
            ?? obj = new Object();
            obj.f47989Y = c6114v.f47989Y;
            obj.f47990Z = c6114v.f47990Z;
            obj.f47991h0 = c6114v.f47991h0;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            E0();
            boolean z10 = this.f25411s ^ this.f25413u;
            obj2.f47991h0 = z10;
            if (z10) {
                View O02 = O0();
                obj2.f47990Z = this.f25410r.e() - this.f25410r.b(O02);
                obj2.f47989Y = K.F(O02);
            } else {
                View P02 = P0();
                obj2.f47989Y = K.F(P02);
                obj2.f47990Z = this.f25410r.d(P02) - this.f25410r.f();
            }
        } else {
            obj2.f47989Y = -1;
        }
        return obj2;
    }

    @Override // w3.K
    public final boolean d() {
        if (this.f25408p == 0) {
            return true;
        }
        return false;
    }

    @Override // w3.K
    public final boolean e() {
        if (this.f25408p == 1) {
            return true;
        }
        return false;
    }

    @Override // w3.K
    public final void h(int i10, int i11, V v10, C6061h c6061h) {
        int i12;
        if (this.f25408p != 0) {
            i10 = i11;
        }
        if (v() != 0 && i10 != 0) {
            E0();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            Z0(i12, Math.abs(i10), true, v10);
            z0(v10, this.f25409q, c6061h);
        }
    }

    @Override // w3.K
    public final void i(int i10, C6061h c6061h) {
        int i11;
        boolean z10;
        C6114v c6114v = this.f25418z;
        int i12 = -1;
        if (c6114v != null && (i11 = c6114v.f47989Y) >= 0) {
            z10 = c6114v.f47991h0;
        } else {
            V0();
            z10 = this.f25413u;
            i11 = this.f25416x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.f25406C && i11 >= 0 && i11 < i10; i13++) {
            c6061h.b(i11, 0);
            i11 += i12;
        }
    }

    @Override // w3.K
    public final int j(V v10) {
        return A0(v10);
    }

    @Override // w3.K
    public int k(V v10) {
        return B0(v10);
    }

    @Override // w3.K
    public int k0(int i10, g gVar, V v10) {
        if (this.f25408p == 1) {
            return 0;
        }
        return W0(i10, gVar, v10);
    }

    @Override // w3.K
    public int l(V v10) {
        return C0(v10);
    }

    @Override // w3.K
    public final void l0(int i10) {
        this.f25416x = i10;
        this.f25417y = Integer.MIN_VALUE;
        C6114v c6114v = this.f25418z;
        if (c6114v != null) {
            c6114v.f47989Y = -1;
        }
        j0();
    }

    @Override // w3.K
    public final int m(V v10) {
        return A0(v10);
    }

    @Override // w3.K
    public int m0(int i10, g gVar, V v10) {
        if (this.f25408p == 0) {
            return 0;
        }
        return W0(i10, gVar, v10);
    }

    @Override // w3.K
    public int n(V v10) {
        return B0(v10);
    }

    @Override // w3.K
    public int o(V v10) {
        return C0(v10);
    }

    @Override // w3.K
    public final View q(int i10) {
        int v10 = v();
        if (v10 == 0) {
            return null;
        }
        int F10 = i10 - K.F(u(0));
        if (F10 >= 0 && F10 < v10) {
            View u10 = u(F10);
            if (K.F(u10) == i10) {
                return u10;
            }
        }
        return super.q(i10);
    }

    @Override // w3.K
    public L r() {
        return new L(-2, -2);
    }

    @Override // w3.K
    public final boolean t0() {
        if (this.f47764m == 1073741824 || this.f47763l == 1073741824) {
            return false;
        }
        int v10 = v();
        for (int i10 = 0; i10 < v10; i10++) {
            ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // w3.K
    public void v0(RecyclerView recyclerView, int i10) {
        C6115w c6115w = new C6115w(recyclerView.getContext());
        c6115w.f47992a = i10;
        w0(c6115w);
    }

    @Override // w3.K
    public boolean x0() {
        if (this.f25418z == null && this.f25411s == this.f25414v) {
            return true;
        }
        return false;
    }

    public void y0(V v10, int[] iArr) {
        int i10;
        int i11;
        if (v10.f47778a != -1) {
            i10 = this.f25410r.g();
        } else {
            i10 = 0;
        }
        if (this.f25409q.f47982f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void z0(V v10, C6113u c6113u, C6061h c6061h) {
        int i10 = c6113u.f47980d;
        if (i10 >= 0 && i10 < v10.b()) {
            c6061h.b(i10, Math.max(0, c6113u.f47983g));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [w3.t, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f25408p = 1;
        this.f25412t = false;
        this.f25413u = false;
        this.f25414v = false;
        this.f25415w = true;
        this.f25416x = -1;
        this.f25417y = Integer.MIN_VALUE;
        this.f25418z = null;
        this.f25404A = new w();
        this.f25405B = new Object();
        this.f25406C = 2;
        this.f25407D = new int[2];
        w3.J G10 = K.G(context, attributeSet, i10, i11);
        X0(G10.f47748a);
        boolean z10 = G10.f47750c;
        c(null);
        if (z10 != this.f25412t) {
            this.f25412t = z10;
            j0();
        }
        Y0(G10.f47751d);
    }

    public void S0(g gVar, V v10, w wVar, int i10) {
    }
}
