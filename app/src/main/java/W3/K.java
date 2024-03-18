package w3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v3.AbstractC5970a;
import w.C6061h;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public C6096c f47752a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f47753b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f47754c;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f47755d;

    /* renamed from: e  reason: collision with root package name */
    public C6115w f47756e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47757f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f47758g = false;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f47759h = true;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f47760i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f47761j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f47762k;

    /* renamed from: l  reason: collision with root package name */
    public int f47763l;

    /* renamed from: m  reason: collision with root package name */
    public int f47764m;

    /* renamed from: n  reason: collision with root package name */
    public int f47765n;

    /* renamed from: o  reason: collision with root package name */
    public int f47766o;

    public K() {
        C.b bVar = new C.b(0, this);
        C.b bVar2 = new C.b(1, this);
        this.f47754c = new j0(bVar);
        this.f47755d = new j0(bVar2);
    }

    public static int F(View view) {
        return ((L) view.getLayoutParams()).f47767a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w3.J] */
    public static J G(Context context, AttributeSet attributeSet, int i10, int i11) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5970a.f47147a, i10, i11);
        obj.f47748a = obtainStyledAttributes.getInt(0, 1);
        obj.f47749b = obtainStyledAttributes.getInt(10, 1);
        obj.f47750c = obtainStyledAttributes.getBoolean(9, false);
        obj.f47751d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean K(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        } else if (size < i10) {
            return false;
        } else {
            return true;
        }
    }

    public static void L(View view, int i10, int i11, int i12, int i13) {
        L l10 = (L) view.getLayoutParams();
        Rect rect = l10.f47768b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) l10).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) l10).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) l10).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) l10).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r5 == 1073741824) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(int i10, int i11, int i12, int i13, boolean z10) {
        int max = Math.max(0, i10 - i12);
        if (z10) {
            if (i13 < 0) {
                if (i13 == -1) {
                    if (i11 != Integer.MIN_VALUE) {
                        if (i11 != 0) {
                        }
                    }
                    i13 = max;
                }
                i11 = 0;
                i13 = 0;
            }
            i11 = 1073741824;
        } else {
            if (i13 < 0) {
                if (i13 != -1) {
                    if (i13 == -2) {
                        if (i11 != Integer.MIN_VALUE && i11 != 1073741824) {
                            i13 = max;
                            i11 = 0;
                        } else {
                            i13 = max;
                            i11 = Integer.MIN_VALUE;
                        }
                    }
                    i11 = 0;
                    i13 = 0;
                }
                i13 = max;
            }
            i11 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public final int A() {
        RecyclerView recyclerView = this.f47753b;
        WeakHashMap weakHashMap = D1.Z.f3247a;
        return D1.I.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(i3.g gVar, V v10) {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView == null || recyclerView.f25473r0 == null || !e()) {
            return 1;
        }
        return this.f47753b.f25473r0.a();
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((L) view.getLayoutParams()).f47768b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f47753b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f47753b.f25471q0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i10) {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            int e10 = recyclerView.f25461l0.e();
            for (int i11 = 0; i11 < e10; i11++) {
                recyclerView.f25461l0.d(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void N(int i10) {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            int e10 = recyclerView.f25461l0.e();
            for (int i11 = 0; i11 < e10; i11++) {
                recyclerView.f25461l0.d(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public abstract void P(RecyclerView recyclerView);

    public abstract View Q(View view, int i10, i3.g gVar, V v10);

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f47753b;
        i3.g gVar = recyclerView.f25455i0;
        V v10 = recyclerView.g1;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f47753b.canScrollVertically(-1) && !this.f47753b.canScrollHorizontally(-1) && !this.f47753b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            AbstractC6088D abstractC6088D = this.f47753b.f25473r0;
            if (abstractC6088D != null) {
                accessibilityEvent.setItemCount(abstractC6088D.a());
            }
        }
    }

    public final void S(View view, E1.p pVar) {
        Y I10 = RecyclerView.I(view);
        if (I10 != null && !I10.j() && !this.f47752a.f47835c.contains(I10.f47800a)) {
            RecyclerView recyclerView = this.f47753b;
            T(recyclerView.f25455i0, recyclerView.g1, view, pVar);
        }
    }

    public void T(i3.g gVar, V v10, View view, E1.p pVar) {
        int i10;
        int i11;
        if (e()) {
            i10 = F(view);
        } else {
            i10 = 0;
        }
        if (d()) {
            i11 = F(view);
        } else {
            i11 = 0;
        }
        pVar.k(E1.o.a(i10, 1, i11, 1, false));
    }

    public abstract void Z(i3.g gVar, V v10);

    public abstract void a0(V v10);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i10, boolean z10) {
        int i11;
        Y I10 = RecyclerView.I(view);
        if (!z10 && !I10.j()) {
            this.f47753b.f25463m0.l(I10);
        } else {
            this.f47753b.f25463m0.a(I10);
        }
        L l10 = (L) view.getLayoutParams();
        if (!I10.r() && !I10.k()) {
            int i12 = -1;
            if (view.getParent() == this.f47753b) {
                C6096c c6096c = this.f47752a;
                int indexOfChild = c6096c.f47833a.f47739a.indexOfChild(view);
                if (indexOfChild != -1) {
                    S2.c cVar = c6096c.f47834b;
                    if (!cVar.d(indexOfChild)) {
                        i11 = indexOfChild - cVar.b(indexOfChild);
                        if (i10 == -1) {
                            i10 = this.f47752a.e();
                        }
                        if (i11 == -1) {
                            if (i11 != i10) {
                                K k10 = this.f47753b.f25475s0;
                                View u10 = k10.u(i11);
                                if (u10 != null) {
                                    k10.u(i11);
                                    k10.f47752a.c(i11);
                                    L l11 = (L) u10.getLayoutParams();
                                    Y I11 = RecyclerView.I(u10);
                                    if (I11.j()) {
                                        k10.f47753b.f25463m0.a(I11);
                                    } else {
                                        k10.f47753b.f25463m0.l(I11);
                                    }
                                    k10.f47752a.b(u10, i10, l11, I11.j());
                                } else {
                                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + k10.f47753b.toString());
                                }
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb2.append(this.f47753b.indexOfChild(view));
                            throw new IllegalStateException(AbstractC2469q0.h(this.f47753b, sb2));
                        }
                    }
                }
                i11 = -1;
                if (i10 == -1) {
                }
                if (i11 == -1) {
                }
            } else {
                this.f47752a.a(view, i10, false);
                l10.f47769c = true;
                C6115w c6115w = this.f47756e;
                if (c6115w != null && c6115w.f47996e) {
                    c6115w.f47993b.getClass();
                    Y I12 = RecyclerView.I(view);
                    if (I12 != null) {
                        i12 = I12.c();
                    }
                    if (i12 == c6115w.f47992a) {
                        c6115w.f47997f = view;
                    }
                }
            }
        } else {
            if (I10.k()) {
                I10.f47813n.j(I10);
            } else {
                I10.f47809j &= -33;
            }
            this.f47752a.b(view, i10, view.getLayoutParams(), false);
        }
        if (l10.f47770d) {
            I10.f47800a.invalidate();
            l10.f47770d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public Parcelable c0() {
        return null;
    }

    public abstract boolean d();

    public abstract boolean e();

    public final void e0(i3.g gVar) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            if (!RecyclerView.I(u(v10)).q()) {
                View u10 = u(v10);
                h0(v10);
                gVar.f(u10);
            }
        }
    }

    public boolean f(L l10) {
        if (l10 != null) {
            return true;
        }
        return false;
    }

    public final void f0(i3.g gVar) {
        Cloneable cloneable;
        int size = ((ArrayList) gVar.f32642c).size();
        int i10 = size - 1;
        while (true) {
            cloneable = gVar.f32642c;
            if (i10 < 0) {
                break;
            }
            View view = ((Y) ((ArrayList) cloneable).get(i10)).f47800a;
            Y I10 = RecyclerView.I(view);
            if (!I10.q()) {
                I10.p(false);
                if (I10.l()) {
                    this.f47753b.removeDetachedView(view, false);
                }
                AbstractC6092H abstractC6092H = this.f47753b.f25436O0;
                if (abstractC6092H != null) {
                    abstractC6092H.d(I10);
                }
                I10.p(true);
                Y I11 = RecyclerView.I(view);
                I11.f47813n = null;
                I11.f47814o = false;
                I11.f47809j &= -33;
                gVar.g(I11);
            }
            i10--;
        }
        ((ArrayList) cloneable).clear();
        ArrayList arrayList = (ArrayList) gVar.f32643d;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f47753b.invalidate();
        }
    }

    public final void g0(View view, i3.g gVar) {
        C6096c c6096c = this.f47752a;
        C6087C c6087c = c6096c.f47833a;
        int indexOfChild = c6087c.f47739a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (c6096c.f47834b.f(indexOfChild)) {
                c6096c.k(view);
            }
            c6087c.h(indexOfChild);
        }
        gVar.f(view);
    }

    public final void h0(int i10) {
        if (u(i10) != null) {
            C6096c c6096c = this.f47752a;
            int f6 = c6096c.f(i10);
            C6087C c6087c = c6096c.f47833a;
            View childAt = c6087c.f47739a.getChildAt(f6);
            if (childAt != null) {
                if (c6096c.f47834b.f(f6)) {
                    c6096c.k(childAt);
                }
                c6087c.h(f6);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if ((r5.bottom - r1) > r13) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int C10 = C();
        int E10 = E();
        int D6 = this.f47765n - D();
        int B10 = this.f47766o - B();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i10 = left - C10;
        int min = Math.min(0, i10);
        int i11 = top - E10;
        int min2 = Math.min(0, i11);
        int i12 = width - D6;
        int max = Math.max(0, i12);
        int max2 = Math.max(0, height - B10);
        if (A() == 1) {
            if (max == 0) {
                max = Math.max(min, i12);
            }
        } else {
            if (min == 0) {
                min = Math.min(i10, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i11, max2);
        }
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int C11 = C();
                int E11 = E();
                int D10 = this.f47765n - D();
                int B11 = this.f47766o - B();
                Rect rect2 = this.f47753b.f25467o0;
                y(focusedChild, rect2);
                if (rect2.left - max < D10) {
                    if (rect2.right - max > C11) {
                        if (rect2.top - min2 < B11) {
                        }
                    }
                }
            }
            return false;
        }
        if (max != 0 || min2 != 0) {
            if (z10) {
                recyclerView.scrollBy(max, min2);
            } else {
                recyclerView.b0(max, min2, false);
            }
            return true;
        }
        return false;
    }

    public abstract int j(V v10);

    public final void j0() {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int k(V v10);

    public abstract int k0(int i10, i3.g gVar, V v10);

    public abstract int l(V v10);

    public abstract void l0(int i10);

    public abstract int m(V v10);

    public abstract int m0(int i10, i3.g gVar, V v10);

    public abstract int n(V v10);

    public final void n0(RecyclerView recyclerView) {
        o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int o(V v10);

    public final void o0(int i10, int i11) {
        this.f47765n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f47763l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f25419w1;
        }
        this.f47766o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f47764m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f25419w1;
        }
    }

    public final void p(i3.g gVar) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u10 = u(v10);
            Y I10 = RecyclerView.I(u10);
            if (!I10.q()) {
                if (I10.h() && !I10.j() && !this.f47753b.f25473r0.f47741b) {
                    h0(v10);
                    gVar.g(I10);
                } else {
                    u(v10);
                    this.f47752a.c(v10);
                    gVar.h(u10);
                    this.f47753b.f25463m0.l(I10);
                }
            }
        }
    }

    public void p0(Rect rect, int i10, int i11) {
        int D6 = D() + C() + rect.width();
        int B10 = B() + E() + rect.height();
        RecyclerView recyclerView = this.f47753b;
        WeakHashMap weakHashMap = D1.Z.f3247a;
        this.f47753b.setMeasuredDimension(g(i10, D6, D1.H.e(recyclerView)), g(i11, B10, D1.H.d(this.f47753b)));
    }

    public View q(int i10) {
        int v10 = v();
        for (int i11 = 0; i11 < v10; i11++) {
            View u10 = u(i11);
            Y I10 = RecyclerView.I(u10);
            if (I10 != null && I10.c() == i10 && !I10.q() && (this.f47753b.g1.f47784g || !I10.j())) {
                return u10;
            }
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        int v10 = v();
        if (v10 == 0) {
            this.f47753b.n(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < v10; i16++) {
            View u10 = u(i16);
            Rect rect = this.f47753b.f25467o0;
            y(u10, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f47753b.f25467o0.set(i15, i13, i12, i14);
        p0(this.f47753b.f25467o0, i10, i11);
    }

    public abstract L r();

    public final void r0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f47753b = null;
            this.f47752a = null;
            this.f47765n = 0;
            this.f47766o = 0;
        } else {
            this.f47753b = recyclerView;
            this.f47752a = recyclerView.f25461l0;
            this.f47765n = recyclerView.getWidth();
            this.f47766o = recyclerView.getHeight();
        }
        this.f47763l = 1073741824;
        this.f47764m = 1073741824;
    }

    public L s(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    public final boolean s0(View view, int i10, int i11, L l10) {
        if (!view.isLayoutRequested() && this.f47759h && K(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) l10).width) && K(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) l10).height)) {
            return false;
        }
        return true;
    }

    public L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof L) {
            return new L((L) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new L((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new L(layoutParams);
    }

    public boolean t0() {
        return false;
    }

    public final View u(int i10) {
        C6096c c6096c = this.f47752a;
        if (c6096c != null) {
            return c6096c.d(i10);
        }
        return null;
    }

    public final boolean u0(View view, int i10, int i11, L l10) {
        if (this.f47759h && K(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) l10).width) && K(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) l10).height)) {
            return false;
        }
        return true;
    }

    public final int v() {
        C6096c c6096c = this.f47752a;
        if (c6096c != null) {
            return c6096c.e();
        }
        return 0;
    }

    public abstract void v0(RecyclerView recyclerView, int i10);

    public final void w0(C6115w c6115w) {
        C6115w c6115w2 = this.f47756e;
        if (c6115w2 != null && c6115w != c6115w2 && c6115w2.f47996e) {
            c6115w2.i();
        }
        this.f47756e = c6115w;
        RecyclerView recyclerView = this.f47753b;
        X x10 = recyclerView.f25450d1;
        x10.f47798l0.removeCallbacks(x10);
        x10.f47794h0.abortAnimation();
        if (c6115w.f47999h) {
            AbstractC3612c.r("RecyclerView", "An instance of " + c6115w.getClass().getSimpleName() + " was started more than once. Each instance of" + c6115w.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c6115w.f47993b = recyclerView;
        c6115w.f47994c = this;
        int i10 = c6115w.f47992a;
        if (i10 != -1) {
            recyclerView.g1.f47778a = i10;
            c6115w.f47996e = true;
            c6115w.f47995d = true;
            c6115w.f47997f = recyclerView.f25475s0.q(i10);
            c6115w.f47993b.f25450d1.a();
            c6115w.f47999h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public int x(i3.g gVar, V v10) {
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView == null || recyclerView.f25473r0 == null || !d()) {
            return 1;
        }
        return this.f47753b.f25473r0.a();
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f25419w1;
        L l10 = (L) view.getLayoutParams();
        Rect rect2 = l10.f47768b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) l10).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) l10).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) l10).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) l10).bottomMargin);
    }

    public final int z() {
        AbstractC6088D abstractC6088D;
        RecyclerView recyclerView = this.f47753b;
        if (recyclerView != null) {
            abstractC6088D = recyclerView.getAdapter();
        } else {
            abstractC6088D = null;
        }
        if (abstractC6088D != null) {
            return abstractC6088D.a();
        }
        return 0;
    }

    public void V() {
    }

    public void O(RecyclerView recyclerView) {
    }

    public void b0(Parcelable parcelable) {
    }

    public void d0(int i10) {
    }

    public void U(int i10, int i11) {
    }

    public void W(int i10, int i11) {
    }

    public void X(int i10, int i11) {
    }

    public void Y(int i10, int i11) {
    }

    public void i(int i10, C6061h c6061h) {
    }

    public void h(int i10, int i11, V v10, C6061h c6061h) {
    }
}
