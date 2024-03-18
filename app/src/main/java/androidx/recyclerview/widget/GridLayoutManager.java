package androidx.recyclerview.widget;

import D1.H;
import D1.Z;
import E1.o;
import E1.p;
import E9.f;
import android.content.Context;
import android.gov.nist.core.a;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import i3.g;
import io.sentry.android.core.AbstractC3612c;
import java.util.Arrays;
import java.util.WeakHashMap;
import p3.w;
import q.r1;
import w.C6061h;
import w3.C6112t;
import w3.C6113u;
import w3.C6116x;
import w3.K;
import w3.L;
import w3.V;
import w3.r;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: G  reason: collision with root package name */
    public int[] f25398G;

    /* renamed from: H  reason: collision with root package name */
    public View[] f25399H;

    /* renamed from: E  reason: collision with root package name */
    public boolean f25396E = false;

    /* renamed from: F  reason: collision with root package name */
    public int f25397F = -1;

    /* renamed from: I  reason: collision with root package name */
    public final SparseIntArray f25400I = new SparseIntArray();

    /* renamed from: J  reason: collision with root package name */
    public final SparseIntArray f25401J = new SparseIntArray();

    /* renamed from: K  reason: collision with root package name */
    public final r1 f25402K = new r1();

    /* renamed from: L  reason: collision with root package name */
    public final Rect f25403L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        j1(K.G(context, attributeSet, i10, i11).f47749b);
    }

    @Override // w3.K
    public final int H(g gVar, V v10) {
        if (this.f25408p == 0) {
            return this.f25397F;
        }
        if (v10.b() < 1) {
            return 0;
        }
        return f1(v10.b() - 1, gVar, v10) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View L0(g gVar, V v10, int i10, int i11, int i12) {
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
            if (F10 >= 0 && F10 < i12 && g1(F10, gVar, v10) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
        if (r13 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010b, code lost:
        if (r13 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r22.f47752a.j(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Q(View view, int i10, g gVar, V v10) {
        View view2;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        View view3;
        View view4;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        g gVar2 = gVar;
        V v11 = v10;
        RecyclerView recyclerView = this.f47753b;
        View view5 = null;
        if (recyclerView != null) {
            view2 = recyclerView.A(view);
            if (view2 != null) {
            }
        }
        view2 = null;
        if (view2 == null) {
            return null;
        }
        r rVar = (r) view2.getLayoutParams();
        int i15 = rVar.f47962e;
        int i16 = rVar.f47963f + i15;
        if (super.Q(view, i10, gVar, v10) == null) {
            return null;
        }
        if (D0(i10) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f25413u) {
            i13 = v() - 1;
            i12 = -1;
            i11 = -1;
        } else {
            i12 = v();
            i11 = 1;
            i13 = 0;
        }
        if (this.f25408p == 1 && Q0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        int f12 = f1(i13, gVar2, v11);
        int i17 = -1;
        int i18 = -1;
        int i19 = i11;
        int i20 = 0;
        int i21 = 0;
        int i22 = i13;
        View view6 = null;
        while (i22 != i12) {
            int i23 = i12;
            int f13 = f1(i22, gVar2, v11);
            View u10 = u(i22);
            if (u10 == view2) {
                break;
            }
            if (u10.hasFocusable() && f13 != f12) {
                if (view5 != null) {
                    break;
                }
                view3 = view2;
                view4 = view6;
            } else {
                r rVar2 = (r) u10.getLayoutParams();
                int i24 = rVar2.f47962e;
                view3 = view2;
                int i25 = rVar2.f47963f + i24;
                if (u10.hasFocusable() && i24 == i15 && i25 == i16) {
                    return u10;
                }
                if ((u10.hasFocusable() && view5 == null) || (!u10.hasFocusable() && view6 == null)) {
                    view4 = view6;
                } else {
                    view4 = view6;
                    int min = Math.min(i25, i16) - Math.max(i24, i15);
                    if (u10.hasFocusable()) {
                        if (min <= i20) {
                            if (min == i20) {
                                if (i24 > i18) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                        }
                    } else if (view5 == null) {
                        i14 = i20;
                        if (this.f47754c.h(u10) && this.f47755d.h(u10)) {
                            z13 = true;
                            z12 = true;
                        } else {
                            z13 = true;
                            z12 = false;
                        }
                        if (!z12) {
                            if (min <= i21) {
                                if (min == i21) {
                                    if (i24 > i17) {
                                        z14 = z13;
                                    } else {
                                        z14 = false;
                                    }
                                }
                            }
                            if (!u10.hasFocusable()) {
                                int i26 = rVar2.f47962e;
                                i14 = Math.min(i25, i16) - Math.max(i24, i15);
                                i18 = i26;
                                view6 = view4;
                                view5 = u10;
                            } else {
                                int i27 = rVar2.f47962e;
                                i21 = Math.min(i25, i16) - Math.max(i24, i15);
                                i17 = i27;
                                view6 = u10;
                            }
                            i22 += i19;
                            gVar2 = gVar;
                            v11 = v10;
                            i12 = i23;
                            view2 = view3;
                            i20 = i14;
                        }
                        view6 = view4;
                        i22 += i19;
                        gVar2 = gVar;
                        v11 = v10;
                        i12 = i23;
                        view2 = view3;
                        i20 = i14;
                    }
                }
                i14 = i20;
                if (!u10.hasFocusable()) {
                }
                i22 += i19;
                gVar2 = gVar;
                v11 = v10;
                i12 = i23;
                view2 = view3;
                i20 = i14;
            }
            i14 = i20;
            view6 = view4;
            i22 += i19;
            gVar2 = gVar;
            v11 = v10;
            i12 = i23;
            view2 = view3;
            i20 = i14;
        }
        View view7 = view6;
        if (view5 == null) {
            return view7;
        }
        return view5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
        r22.f47974b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(g gVar, V v10, C6113u c6113u, C6112t c6112t) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ?? r82;
        int i21;
        View b10;
        C6116x c6116x = this.f25410r;
        int i22 = c6116x.f48008d;
        K k10 = c6116x.f48009a;
        switch (i22) {
            case 0:
                i10 = k10.f47764m;
                break;
            default:
                i10 = k10.f47763l;
                break;
        }
        if (i10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (v() > 0) {
            i11 = this.f25398G[this.f25397F];
        } else {
            i11 = 0;
        }
        if (z10) {
            k1();
        }
        if (c6113u.f47981e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i23 = this.f25397F;
        if (!z11) {
            i23 = g1(c6113u.f47980d, gVar, v10) + h1(c6113u.f47980d, gVar, v10);
        }
        int i24 = 0;
        while (i24 < this.f25397F && (i21 = c6113u.f47980d) >= 0 && i21 < v10.b() && i23 > 0) {
            int i25 = c6113u.f47980d;
            int h12 = h1(i25, gVar, v10);
            if (h12 <= this.f25397F) {
                i23 -= h12;
                if (i23 >= 0 && (b10 = c6113u.b(gVar)) != null) {
                    this.f25399H[i24] = b10;
                    i24++;
                }
            } else {
                throw new IllegalArgumentException(a.l(f.A("Item at position ", i25, " requires ", h12, " spans but GridLayoutManager has only "), this.f25397F, " spans."));
            }
        }
        if (z11) {
            i12 = 1;
            i13 = i24;
            i14 = 0;
        } else {
            i14 = i24 - 1;
            i13 = -1;
            i12 = -1;
        }
        int i26 = 0;
        while (i14 != i13) {
            View view = this.f25399H[i14];
            r rVar = (r) view.getLayoutParams();
            int h13 = h1(K.F(view), gVar, v10);
            rVar.f47963f = h13;
            rVar.f47962e = i26;
            i26 += h13;
            i14 += i12;
        }
        float f6 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i24; i28++) {
            View view2 = this.f25399H[i28];
            if (c6113u.f47987k == null) {
                if (z11) {
                    r82 = 0;
                    b(view2, -1, false);
                } else {
                    r82 = 0;
                    b(view2, 0, false);
                }
            } else {
                r82 = 0;
                r82 = 0;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            }
            RecyclerView recyclerView = this.f47753b;
            Rect rect = this.f25403L;
            if (recyclerView == null) {
                int i29 = r82 == true ? 1 : 0;
                int i30 = r82 == true ? 1 : 0;
                int i31 = r82 == true ? 1 : 0;
                int i32 = r82 == true ? 1 : 0;
                rect.set(i29, r82, r82, r82);
            } else {
                rect.set(recyclerView.J(view2));
            }
            i1(view2, i10, r82);
            int c10 = this.f25410r.c(view2);
            if (c10 > i27) {
                i27 = c10;
            }
            float l10 = (this.f25410r.l(view2) * 1.0f) / ((r) view2.getLayoutParams()).f47963f;
            if (l10 > f6) {
                f6 = l10;
            }
        }
        if (z10) {
            c1(Math.max(Math.round(f6 * this.f25397F), i11));
            i27 = 0;
            for (int i33 = 0; i33 < i24; i33++) {
                View view3 = this.f25399H[i33];
                i1(view3, 1073741824, true);
                int c11 = this.f25410r.c(view3);
                if (c11 > i27) {
                    i27 = c11;
                }
            }
        }
        for (int i34 = 0; i34 < i24; i34++) {
            View view4 = this.f25399H[i34];
            if (this.f25410r.c(view4) != i27) {
                r rVar2 = (r) view4.getLayoutParams();
                Rect rect2 = rVar2.f47768b;
                int i35 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar2).topMargin + ((ViewGroup.MarginLayoutParams) rVar2).bottomMargin;
                int i36 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar2).leftMargin + ((ViewGroup.MarginLayoutParams) rVar2).rightMargin;
                int e12 = e1(rVar2.f47962e, rVar2.f47963f);
                if (this.f25408p == 1) {
                    i20 = K.w(e12, 1073741824, i36, ((ViewGroup.MarginLayoutParams) rVar2).width, false);
                    i19 = View.MeasureSpec.makeMeasureSpec(i27 - i35, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i36, 1073741824);
                    i19 = K.w(e12, 1073741824, i35, ((ViewGroup.MarginLayoutParams) rVar2).height, false);
                    i20 = makeMeasureSpec;
                }
                if (u0(view4, i20, i19, (L) view4.getLayoutParams())) {
                    view4.measure(i20, i19);
                }
            }
        }
        c6112t.f47973a = i27;
        if (this.f25408p == 1) {
            if (c6113u.f47982f == -1) {
                int i37 = c6113u.f47978b;
                i17 = 0;
                i16 = 0;
                i15 = i37 - i27;
                i18 = i37;
            } else {
                i15 = c6113u.f47978b;
                i18 = i15 + i27;
                i17 = 0;
                i16 = 0;
            }
        } else {
            if (c6113u.f47982f == -1) {
                int i38 = c6113u.f47978b;
                i17 = i38 - i27;
                i16 = i38;
            } else {
                int i39 = c6113u.f47978b;
                i16 = i39 + i27;
                i17 = i39;
            }
            i18 = 0;
            i15 = 0;
        }
        for (int i40 = 0; i40 < i24; i40++) {
            View view5 = this.f25399H[i40];
            r rVar3 = (r) view5.getLayoutParams();
            if (this.f25408p == 1) {
                if (Q0()) {
                    int C10 = C() + this.f25398G[this.f25397F - rVar3.f47962e];
                    i16 = C10;
                    i17 = C10 - this.f25410r.l(view5);
                } else {
                    i17 = C() + this.f25398G[rVar3.f47962e];
                    i16 = this.f25410r.l(view5) + i17;
                }
            } else {
                int E10 = E() + this.f25398G[rVar3.f47962e];
                i15 = E10;
                i18 = this.f25410r.l(view5) + E10;
            }
            K.L(view5, i17, i15, i16, i18);
            if (rVar3.f47767a.j() || rVar3.f47767a.m()) {
                c6112t.f47975c = true;
            }
            c6112t.f47976d = view5.hasFocusable() | c6112t.f47976d;
        }
        Arrays.fill(this.f25399H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(g gVar, V v10, w wVar, int i10) {
        boolean z10;
        k1();
        if (v10.b() > 0 && !v10.f47784g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int g1 = g1(wVar.f42680b, gVar, v10);
            if (z10) {
                while (g1 > 0) {
                    int i11 = wVar.f42680b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    wVar.f42680b = i12;
                    g1 = g1(i12, gVar, v10);
                }
            } else {
                int b10 = v10.b() - 1;
                int i13 = wVar.f42680b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int g12 = g1(i14, gVar, v10);
                    if (g12 <= g1) {
                        break;
                    }
                    i13 = i14;
                    g1 = g12;
                }
                wVar.f42680b = i13;
            }
        }
        d1();
    }

    @Override // w3.K
    public final void T(g gVar, V v10, View view, p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            S(view, pVar);
            return;
        }
        r rVar = (r) layoutParams;
        int f12 = f1(rVar.f47767a.c(), gVar, v10);
        if (this.f25408p == 0) {
            pVar.k(o.a(rVar.f47962e, rVar.f47963f, f12, 1, false));
        } else {
            pVar.k(o.a(f12, 1, rVar.f47962e, rVar.f47963f, false));
        }
    }

    @Override // w3.K
    public final void U(int i10, int i11) {
        r1 r1Var = this.f25402K;
        r1Var.d();
        ((SparseIntArray) r1Var.f43547e).clear();
    }

    @Override // w3.K
    public final void V() {
        r1 r1Var = this.f25402K;
        r1Var.d();
        ((SparseIntArray) r1Var.f43547e).clear();
    }

    @Override // w3.K
    public final void W(int i10, int i11) {
        r1 r1Var = this.f25402K;
        r1Var.d();
        ((SparseIntArray) r1Var.f43547e).clear();
    }

    @Override // w3.K
    public final void X(int i10, int i11) {
        r1 r1Var = this.f25402K;
        r1Var.d();
        ((SparseIntArray) r1Var.f43547e).clear();
    }

    @Override // w3.K
    public final void Y(int i10, int i11) {
        r1 r1Var = this.f25402K;
        r1Var.d();
        ((SparseIntArray) r1Var.f43547e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(boolean z10) {
        if (!z10) {
            super.Y0(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final void Z(g gVar, V v10) {
        boolean z10 = v10.f47784g;
        SparseIntArray sparseIntArray = this.f25401J;
        SparseIntArray sparseIntArray2 = this.f25400I;
        if (z10) {
            int v11 = v();
            for (int i10 = 0; i10 < v11; i10++) {
                r rVar = (r) u(i10).getLayoutParams();
                int c10 = rVar.f47767a.c();
                sparseIntArray2.put(c10, rVar.f47963f);
                sparseIntArray.put(c10, rVar.f47962e);
            }
        }
        super.Z(gVar, v10);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final void a0(V v10) {
        super.a0(v10);
        this.f25396E = false;
    }

    public final void c1(int i10) {
        int i11;
        int[] iArr = this.f25398G;
        int i12 = this.f25397F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f25398G = iArr;
    }

    public final void d1() {
        View[] viewArr = this.f25399H;
        if (viewArr == null || viewArr.length != this.f25397F) {
            this.f25399H = new View[this.f25397F];
        }
    }

    public final int e1(int i10, int i11) {
        if (this.f25408p == 1 && Q0()) {
            int[] iArr = this.f25398G;
            int i12 = this.f25397F;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.f25398G;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override // w3.K
    public final boolean f(L l10) {
        return l10 instanceof r;
    }

    public final int f1(int i10, g gVar, V v10) {
        boolean z10 = v10.f47784g;
        r1 r1Var = this.f25402K;
        if (!z10) {
            return r1Var.a(i10, this.f25397F);
        }
        int b10 = gVar.b(i10);
        if (b10 == -1) {
            AbstractC3612c.r("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return r1Var.a(b10, this.f25397F);
    }

    public final int g1(int i10, g gVar, V v10) {
        boolean z10 = v10.f47784g;
        r1 r1Var = this.f25402K;
        if (!z10) {
            return r1Var.b(i10, this.f25397F);
        }
        int i11 = this.f25401J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = gVar.b(i10);
        if (b10 == -1) {
            AbstractC3612c.r("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return r1Var.b(b10, this.f25397F);
    }

    public final int h1(int i10, g gVar, V v10) {
        boolean z10 = v10.f47784g;
        r1 r1Var = this.f25402K;
        if (!z10) {
            r1Var.getClass();
            return 1;
        }
        int i11 = this.f25400I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (gVar.b(i10) == -1) {
            AbstractC3612c.r("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        r1Var.getClass();
        return 1;
    }

    public final void i1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        boolean z11;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f47768b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int e12 = e1(rVar.f47962e, rVar.f47963f);
        if (this.f25408p == 1) {
            i11 = K.w(e12, i10, i14, ((ViewGroup.MarginLayoutParams) rVar).width, false);
            i12 = K.w(this.f25410r.g(), this.f47764m, i13, ((ViewGroup.MarginLayoutParams) rVar).height, true);
        } else {
            int w10 = K.w(e12, i10, i13, ((ViewGroup.MarginLayoutParams) rVar).height, false);
            int w11 = K.w(this.f25410r.g(), this.f47763l, i14, ((ViewGroup.MarginLayoutParams) rVar).width, true);
            i12 = w10;
            i11 = w11;
        }
        L l10 = (L) view.getLayoutParams();
        if (z10) {
            z11 = u0(view, i11, i12, l10);
        } else {
            z11 = s0(view, i11, i12, l10);
        }
        if (z11) {
            view.measure(i11, i12);
        }
    }

    public final void j1(int i10) {
        if (i10 == this.f25397F) {
            return;
        }
        this.f25396E = true;
        if (i10 >= 1) {
            this.f25397F = i10;
            this.f25402K.d();
            j0();
            return;
        }
        throw new IllegalArgumentException(a.e("Span count should be at least 1. Provided ", i10));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final int k(V v10) {
        return B0(v10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final int k0(int i10, g gVar, V v10) {
        k1();
        d1();
        return super.k0(i10, gVar, v10);
    }

    public final void k1() {
        int B10;
        int E10;
        if (this.f25408p == 1) {
            B10 = this.f47765n - D();
            E10 = C();
        } else {
            B10 = this.f47766o - B();
            E10 = E();
        }
        c1(B10 - E10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final int l(V v10) {
        return C0(v10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final int m0(int i10, g gVar, V v10) {
        k1();
        d1();
        return super.m0(i10, gVar, v10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final int n(V v10) {
        return B0(v10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final int o(V v10) {
        return C0(v10);
    }

    @Override // w3.K
    public final void p0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.f25398G == null) {
            super.p0(rect, i10, i11);
        }
        int D6 = D() + C();
        int B10 = B() + E();
        if (this.f25408p == 1) {
            int height = rect.height() + B10;
            RecyclerView recyclerView = this.f47753b;
            WeakHashMap weakHashMap = Z.f3247a;
            i13 = K.g(i11, height, H.d(recyclerView));
            int[] iArr = this.f25398G;
            i12 = K.g(i10, iArr[iArr.length - 1] + D6, H.e(this.f47753b));
        } else {
            int width = rect.width() + D6;
            RecyclerView recyclerView2 = this.f47753b;
            WeakHashMap weakHashMap2 = Z.f3247a;
            i12 = K.g(i10, width, H.e(recyclerView2));
            int[] iArr2 = this.f25398G;
            i13 = K.g(i11, iArr2[iArr2.length - 1] + B10, H.d(this.f47753b));
        }
        this.f47753b.setMeasuredDimension(i12, i13);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final L r() {
        if (this.f25408p == 0) {
            return new r(-2, -1);
        }
        return new r(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w3.r, w3.L] */
    @Override // w3.K
    public final L s(Context context, AttributeSet attributeSet) {
        ?? l10 = new L(context, attributeSet);
        l10.f47962e = -1;
        l10.f47963f = 0;
        return l10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w3.r, w3.L] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w3.r, w3.L] */
    @Override // w3.K
    public final L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? l10 = new L((ViewGroup.MarginLayoutParams) layoutParams);
            l10.f47962e = -1;
            l10.f47963f = 0;
            return l10;
        }
        ?? l11 = new L(layoutParams);
        l11.f47962e = -1;
        l11.f47963f = 0;
        return l11;
    }

    @Override // w3.K
    public final int x(g gVar, V v10) {
        if (this.f25408p == 1) {
            return this.f25397F;
        }
        if (v10.b() < 1) {
            return 0;
        }
        return f1(v10.b() - 1, gVar, v10) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final boolean x0() {
        if (this.f25418z == null && !this.f25396E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(V v10, C6113u c6113u, C6061h c6061h) {
        int i10;
        int i11 = this.f25397F;
        for (int i12 = 0; i12 < this.f25397F && (i10 = c6113u.f47980d) >= 0 && i10 < v10.b() && i11 > 0; i12++) {
            c6061h.b(c6113u.f47980d, Math.max(0, c6113u.f47983g));
            this.f25402K.getClass();
            i11--;
            c6113u.f47980d += c6113u.f47981e;
        }
    }

    public GridLayoutManager(int i10) {
        super(1);
        j1(i10);
    }
}
