package androidx.recyclerview.widget;

import D1.AbstractC0340a0;
import D1.AbstractC0344c0;
import D1.C0371q;
import D1.H;
import D1.I;
import D1.Z;
import E1.AbstractC0468b;
import K1.b;
import L1.d;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import i3.g;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k5.F;
import s3.C5547J;
import v3.AbstractC5970a;
import w.C6049A;
import w.C6061h;
import w.C6066m;
import w3.AbstractC6088D;
import w3.AbstractC6090F;
import w3.AbstractC6092H;
import w3.AbstractC6093I;
import w3.AbstractC6117y;
import w3.C6085A;
import w3.C6087C;
import w3.C6091G;
import w3.C6094a;
import w3.C6095b;
import w3.C6096c;
import w3.C6103j;
import w3.C6108o;
import w3.C6115w;
import w3.C6118z;
import w3.K;
import w3.L;
import w3.M;
import w3.N;
import w3.O;
import w3.P;
import w3.Q;
import w3.RunnableC6086B;
import w3.RunnableC6110q;
import w3.S;
import w3.T;
import w3.U;
import w3.V;
import w3.W;
import w3.X;
import w3.Y;
import w3.a0;
import w3.i0;
import w3.j0;
import y1.p;
import y1.q;

/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {

    /* renamed from: x1 */
    public static final Class[] f25420x1;

    /* renamed from: A0 */
    public boolean f25422A0;

    /* renamed from: B0 */
    public boolean f25423B0;

    /* renamed from: C0 */
    public boolean f25424C0;

    /* renamed from: D0 */
    public int f25425D0;

    /* renamed from: E0 */
    public final AccessibilityManager f25426E0;

    /* renamed from: F0 */
    public boolean f25427F0;

    /* renamed from: G0 */
    public boolean f25428G0;

    /* renamed from: H0 */
    public int f25429H0;

    /* renamed from: I0 */
    public int f25430I0;

    /* renamed from: J0 */
    public C6091G f25431J0;

    /* renamed from: K0 */
    public EdgeEffect f25432K0;

    /* renamed from: L0 */
    public EdgeEffect f25433L0;

    /* renamed from: M0 */
    public EdgeEffect f25434M0;

    /* renamed from: N0 */
    public EdgeEffect f25435N0;

    /* renamed from: O0 */
    public AbstractC6092H f25436O0;

    /* renamed from: P0 */
    public int f25437P0;

    /* renamed from: Q0 */
    public int f25438Q0;

    /* renamed from: R0 */
    public VelocityTracker f25439R0;

    /* renamed from: S0 */
    public int f25440S0;

    /* renamed from: T0 */
    public int f25441T0;

    /* renamed from: U0 */
    public int f25442U0;

    /* renamed from: V0 */
    public int f25443V0;

    /* renamed from: W0 */
    public int f25444W0;

    /* renamed from: X0 */
    public M f25445X0;

    /* renamed from: Y0 */
    public final int f25446Y0;

    /* renamed from: Z0 */
    public final int f25447Z0;

    /* renamed from: a1 */
    public final float f25448a1;
    public final float b1;

    /* renamed from: c1 */
    public boolean f25449c1;

    /* renamed from: d1 */
    public final X f25450d1;

    /* renamed from: e1 */
    public RunnableC6110q f25451e1;

    /* renamed from: f1 */
    public final C6061h f25452f1;
    public final V g1;

    /* renamed from: h0 */
    public final F f25453h0;

    /* renamed from: h1 */
    public O f25454h1;

    /* renamed from: i0 */
    public final g f25455i0;

    /* renamed from: i1 */
    public ArrayList f25456i1;

    /* renamed from: j0 */
    public T f25457j0;

    /* renamed from: j1 */
    public boolean f25458j1;

    /* renamed from: k0 */
    public final C6095b f25459k0;

    /* renamed from: k1 */
    public boolean f25460k1;

    /* renamed from: l0 */
    public final C6096c f25461l0;

    /* renamed from: l1 */
    public final C6087C f25462l1;

    /* renamed from: m0 */
    public final j0 f25463m0;

    /* renamed from: m1 */
    public boolean f25464m1;

    /* renamed from: n0 */
    public boolean f25465n0;

    /* renamed from: n1 */
    public a0 f25466n1;

    /* renamed from: o0 */
    public final Rect f25467o0;

    /* renamed from: o1 */
    public final int[] f25468o1;

    /* renamed from: p0 */
    public final Rect f25469p0;

    /* renamed from: p1 */
    public C0371q f25470p1;

    /* renamed from: q0 */
    public final RectF f25471q0;

    /* renamed from: q1 */
    public final int[] f25472q1;

    /* renamed from: r0 */
    public AbstractC6088D f25473r0;

    /* renamed from: r1 */
    public final int[] f25474r1;

    /* renamed from: s0 */
    public K f25475s0;

    /* renamed from: s1 */
    public final int[] f25476s1;

    /* renamed from: t0 */
    public final ArrayList f25477t0;

    /* renamed from: t1 */
    public final ArrayList f25478t1;

    /* renamed from: u0 */
    public final ArrayList f25479u0;

    /* renamed from: u1 */
    public final RunnableC6086B f25480u1;

    /* renamed from: v0 */
    public N f25481v0;

    /* renamed from: v1 */
    public final C6087C f25482v1;

    /* renamed from: w0 */
    public boolean f25483w0;

    /* renamed from: x0 */
    public boolean f25484x0;

    /* renamed from: y0 */
    public boolean f25485y0;

    /* renamed from: z0 */
    public int f25486z0;

    /* renamed from: w1 */
    public static final int[] f25419w1 = {16843830};

    /* renamed from: y1 */
    public static final d f25421y1 = new d(1);

    static {
        Class cls = Integer.TYPE;
        f25420x1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView D6 = D(viewGroup.getChildAt(i10));
            if (D6 != null) {
                return D6;
            }
        }
        return null;
    }

    public static Y I(View view) {
        if (view == null) {
            return null;
        }
        return ((L) view.getLayoutParams()).f47767a;
    }

    private C0371q getScrollingChildHelper() {
        if (this.f25470p1 == null) {
            this.f25470p1 = new C0371q(this);
        }
        return this.f25470p1;
    }

    public static void j(Y y10) {
        WeakReference weakReference = y10.f47801b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == y10.f47800a) {
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            y10.f47801b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r7 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f25479u0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            N n10 = (N) arrayList.get(i10);
            C6108o c6108o = (C6108o) n10;
            int i11 = c6108o.f47946v;
            if (i11 == 1) {
                boolean d10 = c6108o.d(motionEvent.getX(), motionEvent.getY());
                boolean c10 = c6108o.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d10 || c10)) {
                    if (c10) {
                        c6108o.f47947w = 1;
                        c6108o.f47940p = (int) motionEvent.getX();
                    } else if (d10) {
                        c6108o.f47947w = 2;
                        c6108o.f47937m = (int) motionEvent.getY();
                    }
                    c6108o.f(2);
                    z10 = true;
                }
                z10 = false;
            }
            if (z10 && action != 3) {
                this.f25481v0 = n10;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int e10 = this.f25461l0.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            Y I10 = I(this.f25461l0.d(i12));
            if (!I10.q()) {
                int c10 = I10.c();
                if (c10 < i10) {
                    i10 = c10;
                }
                if (c10 > i11) {
                    i11 = c10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final Y E(int i10) {
        Y y10 = null;
        if (this.f25427F0) {
            return null;
        }
        int h10 = this.f25461l0.h();
        for (int i11 = 0; i11 < h10; i11++) {
            Y I10 = I(this.f25461l0.g(i11));
            if (I10 != null && !I10.j() && F(I10) == i10) {
                if (this.f25461l0.j(I10.f47800a)) {
                    y10 = I10;
                } else {
                    return I10;
                }
            }
        }
        return y10;
    }

    public final int F(Y y10) {
        if (y10.e(524) || !y10.g()) {
            return -1;
        }
        C6095b c6095b = this.f25459k0;
        int i10 = y10.f47802c;
        ArrayList arrayList = c6095b.f47827b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C6094a c6094a = (C6094a) arrayList.get(i11);
            int i12 = c6094a.f47820a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = c6094a.f47821b;
                        if (i13 == i10) {
                            i10 = c6094a.f47823d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (c6094a.f47823d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = c6094a.f47821b;
                    if (i14 <= i10) {
                        int i15 = c6094a.f47823d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (c6094a.f47821b <= i10) {
                i10 += c6094a.f47823d;
            }
        }
        return i10;
    }

    public final long G(Y y10) {
        if (this.f25473r0.f47741b) {
            return y10.f47804e;
        }
        return y10.f47802c;
    }

    public final Y H(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return I(view);
    }

    public final Rect J(View view) {
        L l10 = (L) view.getLayoutParams();
        boolean z10 = l10.f47769c;
        Rect rect = l10.f47768b;
        if (!z10) {
            return rect;
        }
        if (this.g1.f47784g && (l10.f47767a.m() || l10.f47767a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f25477t0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f25467o0;
            rect2.set(0, 0, 0, 0);
            ((AbstractC6093I) arrayList.get(i10)).getClass();
            ((L) view.getLayoutParams()).f47767a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        l10.f47769c = false;
        return rect;
    }

    public final boolean K() {
        if (this.f25485y0 && !this.f25427F0 && !this.f25459k0.g()) {
            return false;
        }
        return true;
    }

    public final boolean L() {
        if (this.f25429H0 > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i10) {
        if (this.f25475s0 == null) {
            return;
        }
        setScrollState(2);
        this.f25475s0.l0(i10);
        awakenScrollBars();
    }

    public final void N() {
        int h10 = this.f25461l0.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((L) this.f25461l0.g(i10).getLayoutParams()).f47769c = true;
        }
        ArrayList arrayList = (ArrayList) this.f25455i0.f32644e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            L l10 = (L) ((Y) arrayList.get(i11)).f47800a.getLayoutParams();
            if (l10 != null) {
                l10.f47769c = true;
            }
        }
    }

    public final void O(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f25461l0.h();
        for (int i13 = 0; i13 < h10; i13++) {
            Y I10 = I(this.f25461l0.g(i13));
            if (I10 != null && !I10.q()) {
                int i14 = I10.f47802c;
                V v10 = this.g1;
                if (i14 >= i12) {
                    I10.n(-i11, z10);
                    v10.f47783f = true;
                } else if (i14 >= i10) {
                    I10.b(8);
                    I10.n(-i11, z10);
                    I10.f47802c = i10 - 1;
                    v10.f47783f = true;
                }
            }
        }
        g gVar = this.f25455i0;
        ArrayList arrayList = (ArrayList) gVar.f32644e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y y10 = (Y) arrayList.get(size);
            if (y10 != null) {
                int i15 = y10.f47802c;
                if (i15 >= i12) {
                    y10.n(-i11, z10);
                } else if (i15 >= i10) {
                    y10.b(8);
                    gVar.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f25429H0++;
    }

    public final void Q(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f25429H0 - 1;
        this.f25429H0 = i11;
        if (i11 < 1) {
            this.f25429H0 = 0;
            if (z10) {
                int i12 = this.f25425D0;
                this.f25425D0 = 0;
                if (i12 != 0 && (accessibilityManager = this.f25426E0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    AbstractC0468b.b(obtain, i12);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f25478t1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Y y10 = (Y) arrayList.get(size);
                    if (y10.f47800a.getParent() == this && !y10.q() && (i10 = y10.f47816q) != -1) {
                        WeakHashMap weakHashMap = Z.f3247a;
                        H.s(y10.f47800a, i10);
                        y10.f47816q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f25438Q0) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f25438Q0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f25442U0 = x10;
            this.f25440S0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f25443V0 = y10;
            this.f25441T0 = y10;
        }
    }

    public final void S() {
        if (!this.f25464m1 && this.f25483w0) {
            WeakHashMap weakHashMap = Z.f3247a;
            H.m(this, this.f25480u1);
            this.f25464m1 = true;
        }
    }

    public final void T() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f25427F0) {
            C6095b c6095b = this.f25459k0;
            c6095b.l(c6095b.f47827b);
            c6095b.l(c6095b.f47828c);
            if (this.f25428G0) {
                this.f25475s0.V();
            }
        }
        if (this.f25436O0 != null && this.f25475s0.x0()) {
            this.f25459k0.j();
        } else {
            this.f25459k0.c();
        }
        boolean z13 = true;
        if (!this.f25458j1 && !this.f25460k1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f25485y0 && this.f25436O0 != null && (((z12 = this.f25427F0) || z10 || this.f25475s0.f47757f) && (!z12 || this.f25473r0.f47741b))) {
            z11 = true;
        } else {
            z11 = false;
        }
        V v10 = this.g1;
        v10.f47787j = z11;
        if (!z11 || !z10 || this.f25427F0 || this.f25436O0 == null || !this.f25475s0.x0()) {
            z13 = false;
        }
        v10.f47788k = z13;
    }

    public final void U(boolean z10) {
        this.f25428G0 = z10 | this.f25428G0;
        this.f25427F0 = true;
        int h10 = this.f25461l0.h();
        for (int i10 = 0; i10 < h10; i10++) {
            Y I10 = I(this.f25461l0.g(i10));
            if (I10 != null && !I10.q()) {
                I10.b(6);
            }
        }
        N();
        g gVar = this.f25455i0;
        ArrayList arrayList = (ArrayList) gVar.f32644e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Y y10 = (Y) arrayList.get(i11);
            if (y10 != null) {
                y10.b(6);
                y10.a(null);
            }
        }
        AbstractC6088D abstractC6088D = ((RecyclerView) gVar.f32648i).f25473r0;
        if (abstractC6088D == null || !abstractC6088D.f47741b) {
            gVar.d();
        }
    }

    public final void V(Y y10, C5547J c5547j) {
        y10.f47809j &= -8193;
        boolean z10 = this.g1.f47785h;
        j0 j0Var = this.f25463m0;
        if (z10 && y10.m() && !y10.j() && !y10.q()) {
            ((C6066m) j0Var.f47913c).h(G(y10), y10);
        }
        j0Var.c(y10, c5547j);
    }

    public final void W(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f25467o0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof L) {
            L l10 = (L) layoutParams;
            if (!l10.f47769c) {
                int i10 = rect.left;
                Rect rect2 = l10.f47768b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        K k10 = this.f25475s0;
        boolean z11 = !this.f25485y0;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k10.i0(this, view, this.f25467o0, z11, z10);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f25439R0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        e0(0);
        EdgeEffect edgeEffect = this.f25432K0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f25432K0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f25433L0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f25433L0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f25434M0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f25434M0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f25435N0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f25435N0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010a, code lost:
        if (r6 == 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        m();
        AbstractC6088D abstractC6088D = this.f25473r0;
        int[] iArr = this.f25476s1;
        if (abstractC6088D != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Z(i10, i11, iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            i15 = i16;
            i14 = i17;
            i13 = i10 - i16;
            i12 = i11 - i17;
        } else {
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (!this.f25477t0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i15, i14, i13, i12, this.f25472q1, 0, iArr);
        int i18 = iArr[0];
        int i19 = i13 - i18;
        int i20 = iArr[1];
        int i21 = i12 - i20;
        if (i18 == 0 && i20 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i22 = this.f25442U0;
        int[] iArr2 = this.f25472q1;
        int i23 = iArr2[0];
        this.f25442U0 = i22 - i23;
        int i24 = this.f25443V0;
        int i25 = iArr2[1];
        this.f25443V0 = i24 - i25;
        int[] iArr3 = this.f25474r1;
        iArr3[0] = iArr3[0] + i23;
        iArr3[1] = iArr3[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f6 = i19;
                float y10 = motionEvent.getY();
                float f10 = i21;
                if (f6 < 0.0f) {
                    v();
                    H1.d.a(this.f25432K0, (-f6) / getWidth(), 1.0f - (y10 / getHeight()));
                } else if (f6 > 0.0f) {
                    w();
                    H1.d.a(this.f25434M0, f6 / getWidth(), y10 / getHeight());
                } else {
                    z11 = false;
                    if (f10 >= 0.0f) {
                        x();
                        H1.d.a(this.f25433L0, (-f10) / getHeight(), x10 / getWidth());
                    } else {
                        int i26 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                        if (i26 > 0) {
                            u();
                            H1.d.a(this.f25435N0, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                        } else if (!z11) {
                            if (f6 == 0.0f) {
                            }
                        }
                    }
                    WeakHashMap weakHashMap = Z.f3247a;
                    H.k(this);
                }
                z11 = true;
                if (f10 >= 0.0f) {
                }
                WeakHashMap weakHashMap2 = Z.f3247a;
                H.k(this);
            }
            l(i10, i11);
        }
        if (i15 != 0 || i14 != 0) {
            t(i15, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z10 && i15 == 0 && i14 == 0) {
            return false;
        }
        return true;
    }

    public final void Z(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        Y y10;
        c0();
        P();
        int i14 = q.f50332a;
        p.a("RV Scroll");
        V v10 = this.g1;
        z(v10);
        g gVar = this.f25455i0;
        if (i10 != 0) {
            i12 = this.f25475s0.k0(i10, gVar, v10);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f25475s0.m0(i11, gVar, v10);
        } else {
            i13 = 0;
        }
        p.b();
        int e10 = this.f25461l0.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f25461l0.d(i15);
            Y H6 = H(d10);
            if (H6 != null && (y10 = H6.f47808i) != null) {
                int left = d10.getLeft();
                int top = d10.getTop();
                View view = y10.f47800a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    public final void a0(int i10) {
        C6115w c6115w;
        if (this.f25423B0) {
            return;
        }
        setScrollState(0);
        X x10 = this.f25450d1;
        x10.f47798l0.removeCallbacks(x10);
        x10.f47794h0.abortAnimation();
        K k10 = this.f25475s0;
        if (k10 != null && (c6115w = k10.f47756e) != null) {
            c6115w.i();
        }
        K k11 = this.f25475s0;
        if (k11 == null) {
            AbstractC3612c.c("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        k11.l0(i10);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        K k10 = this.f25475s0;
        if (k10 != null) {
            k10.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10, int i11, boolean z10) {
        K k10 = this.f25475s0;
        if (k10 == null) {
            AbstractC3612c.c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f25423B0) {
        } else {
            int i12 = 0;
            if (!k10.d()) {
                i10 = 0;
            }
            if (!this.f25475s0.e()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z10) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    getScrollingChildHelper().h(i12, 1);
                }
                this.f25450d1.b(i10, i11, Integer.MIN_VALUE, null);
            }
        }
    }

    public final void c0() {
        int i10 = this.f25486z0 + 1;
        this.f25486z0 = i10;
        if (i10 == 1 && !this.f25423B0) {
            this.f25422A0 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof L) && this.f25475s0.f((L) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        K k10 = this.f25475s0;
        if (k10 == null || !k10.d()) {
            return 0;
        }
        return this.f25475s0.j(this.g1);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        K k10 = this.f25475s0;
        if (k10 == null || !k10.d()) {
            return 0;
        }
        return this.f25475s0.k(this.g1);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        K k10 = this.f25475s0;
        if (k10 == null || !k10.d()) {
            return 0;
        }
        return this.f25475s0.l(this.g1);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        K k10 = this.f25475s0;
        if (k10 == null || !k10.e()) {
            return 0;
        }
        return this.f25475s0.m(this.g1);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        K k10 = this.f25475s0;
        if (k10 == null || !k10.e()) {
            return 0;
        }
        return this.f25475s0.n(this.g1);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        K k10 = this.f25475s0;
        if (k10 == null || !k10.e()) {
            return 0;
        }
        return this.f25475s0.o(this.g1);
    }

    public final void d0(boolean z10) {
        if (this.f25486z0 < 1) {
            this.f25486z0 = 1;
        }
        if (!z10 && !this.f25423B0) {
            this.f25422A0 = false;
        }
        if (this.f25486z0 == 1) {
            if (z10 && this.f25422A0 && !this.f25423B0 && this.f25475s0 != null && this.f25473r0 != null) {
                o();
            }
            if (!this.f25423B0) {
                this.f25422A0 = false;
            }
        }
        this.f25486z0--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f10, boolean z10) {
        return getScrollingChildHelper().a(f6, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f10) {
        return getScrollingChildHelper().b(f6, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        ArrayList arrayList = this.f25477t0;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ((AbstractC6093I) arrayList.get(i12)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f25432K0;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f25465n0) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, 0.0f);
            EdgeEffect edgeEffect2 = this.f25432K0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.f25433L0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f25465n0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f25433L0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f25434M0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f25465n0) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i10, -width);
            EdgeEffect edgeEffect6 = this.f25434M0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f25435N0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f25465n0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f25435N0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if ((!z10 && this.f25436O0 != null && arrayList.size() > 0 && this.f25436O0.f()) || z10) {
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void e0(int i10) {
        getScrollingChildHelper().i(i10);
    }

    public final void f(Y y10) {
        boolean z10;
        View view = y10.f47800a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25455i0.j(H(view));
        if (y10.l()) {
            this.f25461l0.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f25461l0.a(view, -1, true);
        } else {
            C6096c c6096c = this.f25461l0;
            int indexOfChild = c6096c.f47833a.f47739a.indexOfChild(view);
            if (indexOfChild >= 0) {
                c6096c.f47834b.h(indexOfChild);
                c6096c.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        int i11;
        int i12;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        this.f25475s0.getClass();
        if (this.f25473r0 != null && this.f25475s0 != null && !L() && !this.f25423B0) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        V v10 = this.g1;
        g gVar = this.f25455i0;
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.f25475s0.e()) {
                if (i10 == 2) {
                    i14 = 130;
                } else {
                    i14 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i14) == null) {
                    z11 = true;
                    if (!z11 && this.f25475s0.d()) {
                        if (this.f25475s0.A() != 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i10 != 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!(z12 ^ z13)) {
                            i13 = 66;
                        } else {
                            i13 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i13) != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        c0();
                        this.f25475s0.Q(view, i10, gVar, v10);
                        d0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i10);
                }
            }
            z11 = false;
            if (!z11) {
                if (this.f25475s0.A() != 1) {
                }
                if (i10 != 2) {
                }
                if (!(z12 ^ z13)) {
                }
                if (focusFinder.findNextFocus(this, view, i13) != null) {
                }
            }
            if (z11) {
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z10) {
                m();
                if (A(view) == null) {
                    return null;
                }
                c0();
                view2 = this.f25475s0.Q(view, i10, gVar, v10);
                d0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            W(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && A(view2) != null) {
            if (view != null && A(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f25467o0;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f25469p0;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                if (this.f25475s0.A() == 1) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                int i15 = rect.left;
                int i16 = rect2.left;
                if ((i15 < i16 || rect.right <= i16) && rect.right < rect2.right) {
                    i12 = 1;
                } else {
                    int i17 = rect.right;
                    int i18 = rect2.right;
                    if ((i17 > i18 || i15 >= i18) && i15 > i16) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                }
                int i19 = rect.top;
                int i20 = rect2.top;
                if ((i19 < i20 || rect.bottom <= i20) && rect.bottom < rect2.bottom) {
                    c10 = 1;
                } else {
                    int i21 = rect.bottom;
                    int i22 = rect2.bottom;
                    if ((i21 > i22 || i19 >= i22) && i19 > i20) {
                        c10 = '\uffff';
                    } else {
                        c10 = 0;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 != 66) {
                                    if (i10 == 130) {
                                        if (c10 > 0) {
                                            return view2;
                                        }
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                        sb2.append(i10);
                                        throw new IllegalArgumentException(AbstractC2469q0.h(this, sb2));
                                    }
                                } else if (i12 > 0) {
                                    return view2;
                                }
                            } else if (c10 < 0) {
                                return view2;
                            }
                        } else if (i12 < 0) {
                            return view2;
                        }
                    } else if (c10 <= 0) {
                        if (c10 == 0 && i12 * i11 >= 0) {
                            return view2;
                        }
                    } else {
                        return view2;
                    }
                } else if (c10 >= 0) {
                    if (c10 == 0 && i12 * i11 <= 0) {
                        return view2;
                    }
                } else {
                    return view2;
                }
            } else {
                return view2;
            }
        }
        return super.focusSearch(view, i10);
    }

    public final void g(AbstractC6093I abstractC6093I) {
        K k10 = this.f25475s0;
        if (k10 != null) {
            k10.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f25477t0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC6093I);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        K k10 = this.f25475s0;
        if (k10 != null) {
            return k10.r();
        }
        throw new IllegalStateException(AbstractC2469q0.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        K k10 = this.f25475s0;
        if (k10 != null) {
            return k10.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC2469q0.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC6088D getAdapter() {
        return this.f25473r0;
    }

    @Override // android.view.View
    public int getBaseline() {
        K k10 = this.f25475s0;
        if (k10 != null) {
            k10.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f25465n0;
    }

    public a0 getCompatAccessibilityDelegate() {
        return this.f25466n1;
    }

    public C6091G getEdgeEffectFactory() {
        return this.f25431J0;
    }

    public AbstractC6092H getItemAnimator() {
        return this.f25436O0;
    }

    public int getItemDecorationCount() {
        return this.f25477t0.size();
    }

    public K getLayoutManager() {
        return this.f25475s0;
    }

    public int getMaxFlingVelocity() {
        return this.f25447Z0;
    }

    public int getMinFlingVelocity() {
        return this.f25446Y0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public M getOnFlingListener() {
        return this.f25445X0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f25449c1;
    }

    public Q getRecycledViewPool() {
        return this.f25455i0.c();
    }

    public int getScrollState() {
        return this.f25437P0;
    }

    public final void h(O o10) {
        if (this.f25456i1 == null) {
            this.f25456i1 = new ArrayList();
        }
        this.f25456i1.add(o10);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                throw new IllegalStateException(AbstractC2469q0.h(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.f25430I0 > 0) {
            AbstractC3612c.s("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC2469q0.h(this, new StringBuilder(""))));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f25483w0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f25423B0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3291d;
    }

    public final void k() {
        int h10 = this.f25461l0.h();
        for (int i10 = 0; i10 < h10; i10++) {
            Y I10 = I(this.f25461l0.g(i10));
            if (!I10.q()) {
                I10.f47803d = -1;
                I10.f47806g = -1;
            }
        }
        g gVar = this.f25455i0;
        ArrayList arrayList = (ArrayList) gVar.f32644e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Y y10 = (Y) arrayList.get(i11);
            y10.f47803d = -1;
            y10.f47806g = -1;
        }
        ArrayList arrayList2 = (ArrayList) gVar.f32642c;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Y y11 = (Y) arrayList2.get(i12);
            y11.f47803d = -1;
            y11.f47806g = -1;
        }
        ArrayList arrayList3 = (ArrayList) gVar.f32643d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                Y y12 = (Y) ((ArrayList) gVar.f32643d).get(i13);
                y12.f47803d = -1;
                y12.f47806g = -1;
            }
        }
    }

    public final void l(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f25432K0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.f25432K0.onRelease();
            z10 = this.f25432K0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f25434M0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f25434M0.onRelease();
            z10 |= this.f25434M0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f25433L0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f25433L0.onRelease();
            z10 |= this.f25433L0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f25435N0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f25435N0.onRelease();
            z10 |= this.f25435N0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(this);
        }
    }

    public final void m() {
        if (this.f25485y0 && !this.f25427F0) {
            if (!this.f25459k0.g()) {
                return;
            }
            this.f25459k0.getClass();
            if (this.f25459k0.g()) {
                int i10 = q.f50332a;
                p.a("RV FullInvalidate");
                o();
                p.b();
                return;
            }
            return;
        }
        int i11 = q.f50332a;
        p.a("RV FullInvalidate");
        o();
        p.b();
    }

    public final void n(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = Z.f3247a;
        setMeasuredDimension(K.g(i10, paddingRight, H.e(this)), K.g(i11, getPaddingBottom() + getPaddingTop(), H.d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fc, code lost:
        if (r18.f25461l0.f47835c.contains(getFocusedChild()) == false) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a2  */
    /* JADX WARN: Type inference failed for: r13v7, types: [s3.J, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        Y y10;
        View findViewById;
        boolean z10;
        C5547J c5547j;
        int i10;
        int i11;
        if (this.f25473r0 == null) {
            AbstractC3612c.c("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f25475s0 == null) {
            AbstractC3612c.c("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            V v10 = this.g1;
            int i12 = 0;
            v10.f47786i = false;
            int i13 = 1;
            if (v10.f47781d == 1) {
                p();
                this.f25475s0.n0(this);
                q();
            } else {
                C6095b c6095b = this.f25459k0;
                if ((c6095b.f47828c.isEmpty() || c6095b.f47827b.isEmpty()) && this.f25475s0.f47765n == getWidth() && this.f25475s0.f47766o == getHeight()) {
                    this.f25475s0.n0(this);
                } else {
                    this.f25475s0.n0(this);
                    q();
                }
            }
            v10.a(4);
            c0();
            P();
            v10.f47781d = 1;
            boolean z11 = v10.f47787j;
            g gVar = this.f25455i0;
            j0 j0Var = this.f25463m0;
            if (z11) {
                int e10 = this.f25461l0.e() - 1;
                while (e10 >= 0) {
                    Y I10 = I(this.f25461l0.d(e10));
                    if (!I10.q()) {
                        long G10 = G(I10);
                        this.f25436O0.getClass();
                        ?? obj = new Object();
                        obj.a(I10);
                        Y y11 = (Y) ((C6066m) j0Var.f47913c).d(G10);
                        if (y11 != null && !y11.q()) {
                            i0 i0Var = (i0) ((C6049A) j0Var.f47912b).get(y11);
                            if (i0Var != null && (i0Var.f47895a & i13) != 0) {
                                i10 = i13;
                            } else {
                                i10 = 0;
                            }
                            i0 i0Var2 = (i0) ((C6049A) j0Var.f47912b).get(I10);
                            if (i0Var2 != null && (i0Var2.f47895a & i13) != 0) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            if (i10 != 0 && y11 == I10) {
                                j0Var.b(I10, obj);
                            } else {
                                C5547J k10 = j0Var.k(y11, 4);
                                j0Var.b(I10, obj);
                                C5547J k11 = j0Var.k(I10, 8);
                                if (k10 == null) {
                                    int e11 = this.f25461l0.e();
                                    for (int i14 = 0; i14 < e11; i14++) {
                                        Y I11 = I(this.f25461l0.d(i14));
                                        if (I11 != I10 && G(I11) == G10) {
                                            AbstractC6088D abstractC6088D = this.f25473r0;
                                            if (abstractC6088D != null && abstractC6088D.f47741b) {
                                                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                sb2.append(I11);
                                                sb2.append(" \n View Holder 2:");
                                                sb2.append(I10);
                                                throw new IllegalStateException(AbstractC2469q0.h(this, sb2));
                                            }
                                            StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb3.append(I11);
                                            sb3.append(" \n View Holder 2:");
                                            sb3.append(I10);
                                            throw new IllegalStateException(AbstractC2469q0.h(this, sb3));
                                        }
                                    }
                                    AbstractC3612c.c("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + y11 + " cannot be found but it is necessary for " + I10 + y());
                                } else {
                                    y11.p(false);
                                    if (i10 != 0) {
                                        f(y11);
                                    }
                                    if (y11 != I10) {
                                        if (i11 != 0) {
                                            f(I10);
                                        }
                                        y11.f47807h = I10;
                                        f(y11);
                                        gVar.j(y11);
                                        I10.p(false);
                                        I10.f47808i = y11;
                                    }
                                    if (this.f25436O0.a(y11, I10, k10, k11)) {
                                        S();
                                    }
                                }
                            }
                        } else {
                            j0Var.b(I10, obj);
                        }
                    }
                    e10--;
                    i13 = 1;
                }
                for (int i15 = ((C6049A) j0Var.f47912b).f47560h0 - 1; i15 >= 0; i15--) {
                    Y y12 = (Y) ((C6049A) j0Var.f47912b).g(i15);
                    i0 i0Var3 = (i0) ((C6049A) j0Var.f47912b).h(i15);
                    int i16 = i0Var3.f47895a;
                    int i17 = i16 & 3;
                    C6087C c6087c = this.f25482v1;
                    if (i17 == 3) {
                        RecyclerView recyclerView = c6087c.f47739a;
                        recyclerView.f25475s0.g0(y12.f47800a, recyclerView.f25455i0);
                    } else if ((i16 & 1) != 0) {
                        C5547J c5547j2 = i0Var3.f47896b;
                        if (c5547j2 == null) {
                            RecyclerView recyclerView2 = c6087c.f47739a;
                            recyclerView2.f25475s0.g0(y12.f47800a, recyclerView2.f25455i0);
                        } else {
                            c6087c.g(y12, c5547j2, i0Var3.f47897c);
                        }
                    } else if ((i16 & 14) == 14) {
                        c6087c.f(y12, i0Var3.f47896b, i0Var3.f47897c);
                    } else if ((i16 & 12) == 12) {
                        C5547J c5547j3 = i0Var3.f47896b;
                        C5547J c5547j4 = i0Var3.f47897c;
                        c6087c.getClass();
                        y12.p(false);
                        RecyclerView recyclerView3 = c6087c.f47739a;
                        if (recyclerView3.f25427F0) {
                            if (recyclerView3.f25436O0.a(y12, y12, c5547j3, c5547j4)) {
                                recyclerView3.S();
                            }
                        } else {
                            C6103j c6103j = (C6103j) recyclerView3.f25436O0;
                            c6103j.getClass();
                            int i18 = c5547j3.f45241a;
                            int i19 = c5547j4.f45241a;
                            if (i18 == i19 && c5547j3.f45242b == c5547j4.f45242b) {
                                c6103j.c(y12);
                            } else if (c6103j.g(y12, i18, c5547j3.f45242b, i19, c5547j4.f45242b)) {
                                recyclerView3.S();
                            }
                        }
                    } else {
                        if ((i16 & 4) != 0) {
                            c5547j = null;
                            c6087c.g(y12, i0Var3.f47896b, null);
                        } else {
                            c5547j = null;
                            if ((i16 & 8) != 0) {
                                c6087c.f(y12, i0Var3.f47896b, i0Var3.f47897c);
                            }
                        }
                        i0Var3.f47895a = 0;
                        i0Var3.f47896b = c5547j;
                        i0Var3.f47897c = c5547j;
                        i0.f47894d.b(i0Var3);
                    }
                    c5547j = null;
                    i0Var3.f47895a = 0;
                    i0Var3.f47896b = c5547j;
                    i0Var3.f47897c = c5547j;
                    i0.f47894d.b(i0Var3);
                }
            }
            View view = null;
            this.f25475s0.f0(gVar);
            v10.f47779b = v10.f47782e;
            this.f25427F0 = false;
            this.f25428G0 = false;
            v10.f47787j = false;
            v10.f47788k = false;
            this.f25475s0.f47757f = false;
            ArrayList arrayList = (ArrayList) gVar.f32643d;
            if (arrayList != null) {
                arrayList.clear();
            }
            K k12 = this.f25475s0;
            if (k12.f47762k) {
                k12.f47761j = 0;
                k12.f47762k = false;
                gVar.k();
            }
            this.f25475s0.a0(v10);
            Q(true);
            d0(false);
            j0Var.d();
            int[] iArr = this.f25468o1;
            int i20 = iArr[0];
            int i21 = iArr[1];
            C(iArr);
            if (iArr[0] != i20 || iArr[1] != i21) {
                t(0, 0);
            }
            if (this.f25449c1 && this.f25473r0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                if (!isFocused()) {
                }
                long j6 = v10.f47790m;
                if (j6 != -1 && (z10 = this.f25473r0.f47741b) && z10) {
                    int h10 = this.f25461l0.h();
                    int i22 = 0;
                    y10 = null;
                    while (true) {
                        if (i22 >= h10) {
                            break;
                        }
                        Y I12 = I(this.f25461l0.g(i22));
                        if (I12 != null && !I12.j() && I12.f47804e == j6) {
                            if (this.f25461l0.f47835c.contains(I12.f47800a)) {
                                y10 = I12;
                            } else {
                                y10 = I12;
                                break;
                            }
                        }
                        i22++;
                    }
                } else {
                    y10 = null;
                }
                if (y10 != null) {
                    ArrayList arrayList2 = this.f25461l0.f47835c;
                    View view2 = y10.f47800a;
                    if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                        view = view2;
                        if (view != null) {
                            int i23 = v10.f47791n;
                            if (i23 != -1 && (findViewById = view.findViewById(i23)) != null && findViewById.isFocusable()) {
                                view = findViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
                if (this.f25461l0.e() > 0) {
                    int i24 = v10.f47789l;
                    if (i24 != -1) {
                        i12 = i24;
                    }
                    int b10 = v10.b();
                    for (int i25 = i12; i25 < b10; i25++) {
                        Y E10 = E(i25);
                        if (E10 == null) {
                            break;
                        }
                        View view3 = E10.f47800a;
                        if (view3.hasFocusable()) {
                            view = view3;
                            break;
                        }
                    }
                    int min = Math.min(b10, i12) - 1;
                    while (true) {
                        if (min < 0) {
                            break;
                        }
                        Y E11 = E(min);
                        if (E11 == null) {
                            break;
                        }
                        View view4 = E11.f47800a;
                        if (view4.hasFocusable()) {
                            view = view4;
                            break;
                        }
                        min--;
                    }
                }
                if (view != null) {
                }
            }
            v10.f47790m = -1L;
            v10.f47789l = -1;
            v10.f47791n = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r1 >= 30.0f) goto L19;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [w3.q, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z10;
        float f6;
        super.onAttachedToWindow();
        this.f25429H0 = 0;
        this.f25483w0 = true;
        if (this.f25485y0 && !isLayoutRequested()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25485y0 = z10;
        K k10 = this.f25475s0;
        if (k10 != null) {
            k10.f47758g = true;
            k10.O(this);
        }
        this.f25464m1 = false;
        ThreadLocal threadLocal = RunnableC6110q.f47956j0;
        RunnableC6110q runnableC6110q = (RunnableC6110q) threadLocal.get();
        this.f25451e1 = runnableC6110q;
        if (runnableC6110q == null) {
            ?? obj = new Object();
            obj.f47958Y = new ArrayList();
            obj.f47961i0 = new ArrayList();
            this.f25451e1 = obj;
            WeakHashMap weakHashMap = Z.f3247a;
            Display b10 = I.b(this);
            if (!isInEditMode() && b10 != null) {
                f6 = b10.getRefreshRate();
            }
            f6 = 60.0f;
            RunnableC6110q runnableC6110q2 = this.f25451e1;
            runnableC6110q2.f47960h0 = 1.0E9f / f6;
            threadLocal.set(runnableC6110q2);
        }
        this.f25451e1.f47958Y.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C6115w c6115w;
        super.onDetachedFromWindow();
        AbstractC6092H abstractC6092H = this.f25436O0;
        if (abstractC6092H != null) {
            abstractC6092H.e();
        }
        setScrollState(0);
        X x10 = this.f25450d1;
        x10.f47798l0.removeCallbacks(x10);
        x10.f47794h0.abortAnimation();
        K k10 = this.f25475s0;
        if (k10 != null && (c6115w = k10.f47756e) != null) {
            c6115w.i();
        }
        this.f25483w0 = false;
        K k11 = this.f25475s0;
        if (k11 != null) {
            k11.f47758g = false;
            k11.P(this);
        }
        this.f25478t1.clear();
        removeCallbacks(this.f25480u1);
        this.f25463m0.getClass();
        do {
        } while (i0.f47894d.a() != null);
        RunnableC6110q runnableC6110q = this.f25451e1;
        if (runnableC6110q != null) {
            runnableC6110q.f47958Y.remove(this);
            this.f25451e1 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f25477t0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC6093I) arrayList.get(i10)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float f10;
        if (this.f25475s0 != null && !this.f25423B0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f25475s0.e()) {
                    f10 = -motionEvent.getAxisValue(9);
                } else {
                    f10 = 0.0f;
                }
                if (this.f25475s0.d()) {
                    f6 = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || f6 != 0.0f) {
                        Y((int) (f6 * this.f25448a1), (int) (f10 * this.b1), motionEvent);
                    }
                }
                f6 = 0.0f;
                if (f10 == 0.0f) {
                }
                Y((int) (f6 * this.f25448a1), (int) (f10 * this.b1), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f25475s0.e()) {
                        f10 = -axisValue;
                        f6 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        Y((int) (f6 * this.f25448a1), (int) (f10 * this.b1), motionEvent);
                    } else if (this.f25475s0.d()) {
                        f6 = axisValue;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        Y((int) (f6 * this.f25448a1), (int) (f10 * this.b1), motionEvent);
                    }
                }
                f10 = 0.0f;
                f6 = 0.0f;
                if (f10 == 0.0f) {
                }
                Y((int) (f6 * this.f25448a1), (int) (f10 * this.b1), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        if (r0 != null) goto L45;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.f25423B0) {
            return false;
        }
        this.f25481v0 = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        K k10 = this.f25475s0;
        if (k10 == null) {
            return false;
        }
        boolean d10 = k10.d();
        boolean e10 = this.f25475s0.e();
        if (this.f25439R0 == null) {
            this.f25439R0 = VelocityTracker.obtain();
        }
        this.f25439R0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                R(motionEvent);
                            }
                        } else {
                            this.f25438Q0 = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f25442U0 = x10;
                            this.f25440S0 = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f25443V0 = y10;
                            this.f25441T0 = y10;
                        }
                    } else {
                        X();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f25438Q0);
                    if (findPointerIndex < 0) {
                        AbstractC3612c.c("RecyclerView", "Error processing scroll; pointer index for id " + this.f25438Q0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f25437P0 != 1) {
                        int i10 = x11 - this.f25440S0;
                        int i11 = y11 - this.f25441T0;
                        if (d10 && Math.abs(i10) > this.f25444W0) {
                            this.f25442U0 = x11;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        if (e10 && Math.abs(i11) > this.f25444W0) {
                            this.f25443V0 = y11;
                        }
                        setScrollState(1);
                    }
                }
            } else {
                this.f25439R0.clear();
                e0(0);
            }
        } else {
            if (this.f25424C0) {
                this.f25424C0 = false;
            }
            this.f25438Q0 = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.f25442U0 = x12;
            this.f25440S0 = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.f25443V0 = y12;
            this.f25441T0 = y12;
            if (this.f25437P0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f25474r1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e10) {
                boolean z10 = d10 ? 1 : 0;
                char c10 = d10 ? 1 : 0;
                d10 = z10 | true;
            }
            C0371q scrollingChildHelper = getScrollingChildHelper();
            int i12 = d10 ? 1 : 0;
            int i13 = d10 ? 1 : 0;
            scrollingChildHelper.h(i12, 0);
        }
        if (this.f25437P0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = q.f50332a;
        p.a("RV OnLayout");
        o();
        p.b();
        this.f25485y0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        K k10 = this.f25475s0;
        if (k10 == null) {
            n(i10, i11);
            return;
        }
        boolean J10 = k10.J();
        V v10 = this.g1;
        if (J10) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f25475s0.f47753b.n(i10, i11);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f25473r0 == null) {
                return;
            }
            if (v10.f47781d == 1) {
                p();
            }
            this.f25475s0.o0(i10, i11);
            v10.f47786i = true;
            q();
            this.f25475s0.q0(i10, i11);
            if (this.f25475s0.t0()) {
                this.f25475s0.o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                v10.f47786i = true;
                q();
                this.f25475s0.q0(i10, i11);
            }
        } else if (this.f25484x0) {
            this.f25475s0.f47753b.n(i10, i11);
        } else if (v10.f47788k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            AbstractC6088D abstractC6088D = this.f25473r0;
            if (abstractC6088D != null) {
                v10.f47782e = abstractC6088D.a();
            } else {
                v10.f47782e = 0;
            }
            c0();
            this.f25475s0.f47753b.n(i10, i11);
            d0(false);
            v10.f47784g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof T)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T t10 = (T) parcelable;
        this.f25457j0 = t10;
        super.onRestoreInstanceState(t10.f9325Y);
        K k10 = this.f25475s0;
        if (k10 != null && (parcelable2 = this.f25457j0.f47777h0) != null) {
            k10.b0(parcelable2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, w3.T, K1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        T t10 = this.f25457j0;
        if (t10 != null) {
            bVar.f47777h0 = t10.f47777h0;
        } else {
            K k10 = this.f25475s0;
            if (k10 != null) {
                bVar.f47777h0 = k10.c0();
            } else {
                bVar.f47777h0 = null;
            }
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.f25435N0 = null;
            this.f25433L0 = null;
            this.f25434M0 = null;
            this.f25432K0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        RecyclerView recyclerView;
        int i10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        RecyclerView recyclerView2;
        float f6;
        float f10;
        MotionEvent motionEvent4;
        RecyclerView recyclerView3;
        int i11;
        boolean z11;
        int minFlingVelocity;
        boolean z12;
        C6115w c6115w;
        AbstractC6117y abstractC6117y;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        PointF a5;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        int i17 = 0;
        if (this.f25423B0 || this.f25424C0) {
            return false;
        }
        N n10 = this.f25481v0;
        if (n10 == null) {
            if (motionEvent.getAction() != 0 && B(motionEvent)) {
                recyclerView = this;
                z10 = true;
            } else {
                K k10 = this.f25475s0;
                if (k10 == null) {
                    return false;
                }
                boolean d10 = k10.d();
                boolean e10 = this.f25475s0.e();
                if (this.f25439R0 == null) {
                    this.f25439R0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f25474r1;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        R(motionEvent);
                                    }
                                } else {
                                    this.f25438Q0 = motionEvent.getPointerId(actionIndex);
                                    int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.f25442U0 = x10;
                                    this.f25440S0 = x10;
                                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.f25443V0 = y10;
                                    this.f25441T0 = y10;
                                }
                            } else {
                                X();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f25438Q0);
                            if (findPointerIndex < 0) {
                                AbstractC3612c.c("RecyclerView", "Error processing scroll; pointer index for id " + this.f25438Q0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            int i18 = this.f25442U0 - x11;
                            int i19 = this.f25443V0 - y11;
                            if (this.f25437P0 != 1) {
                                if (d10) {
                                    if (i18 > 0) {
                                        i18 = Math.max(0, i18 - this.f25444W0);
                                    } else {
                                        i18 = Math.min(0, i18 + this.f25444W0);
                                    }
                                    if (i18 != 0) {
                                        objArr = 1;
                                        if (e10) {
                                            if (i19 > 0) {
                                                i19 = Math.max(0, i19 - this.f25444W0);
                                            } else {
                                                i19 = Math.min(0, i19 + this.f25444W0);
                                            }
                                            if (i19 != 0) {
                                                objArr = 1;
                                            }
                                        }
                                        if (objArr != null) {
                                            setScrollState(1);
                                        }
                                    }
                                }
                                objArr = null;
                                if (e10) {
                                }
                                if (objArr != null) {
                                }
                            }
                            int i20 = i18;
                            int i21 = i19;
                            if (this.f25437P0 == 1) {
                                int[] iArr2 = this.f25476s1;
                                iArr2[0] = 0;
                                iArr2[1] = 0;
                                if (d10) {
                                    i14 = i20;
                                } else {
                                    i14 = 0;
                                }
                                if (e10) {
                                    i15 = i21;
                                } else {
                                    i15 = 0;
                                }
                                boolean r10 = r(i14, i15, 0, iArr2, this.f25472q1);
                                int[] iArr3 = this.f25472q1;
                                if (r10) {
                                    i20 -= iArr2[0];
                                    i21 -= iArr2[1];
                                    iArr[0] = iArr[0] + iArr3[0];
                                    iArr[1] = iArr[1] + iArr3[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i22 = i20;
                                int i23 = i21;
                                this.f25442U0 = x11 - iArr3[0];
                                this.f25443V0 = y11 - iArr3[1];
                                if (d10) {
                                    i16 = i22;
                                } else {
                                    i16 = 0;
                                }
                                if (e10) {
                                    i17 = i23;
                                }
                                if (Y(i16, i17, motionEvent)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                RunnableC6110q runnableC6110q = this.f25451e1;
                                if (runnableC6110q != null && (i22 != 0 || i23 != 0)) {
                                    runnableC6110q.a(this, i22, i23);
                                }
                            }
                        }
                        recyclerView2 = this;
                        motionEvent3 = obtain;
                    } else {
                        this.f25439R0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f25439R0;
                        int i24 = this.f25447Z0;
                        velocityTracker.computeCurrentVelocity(1000, i24);
                        if (d10) {
                            f6 = -this.f25439R0.getXVelocity(this.f25438Q0);
                        } else {
                            f6 = 0.0f;
                        }
                        if (e10) {
                            f10 = -this.f25439R0.getYVelocity(this.f25438Q0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (f6 == 0.0f && f10 == 0.0f) {
                            recyclerView3 = this;
                            i11 = 0;
                            motionEvent4 = obtain;
                        } else {
                            int i25 = (int) f6;
                            int i26 = (int) f10;
                            K k11 = this.f25475s0;
                            if (k11 == null) {
                                AbstractC3612c.c("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f25423B0) {
                                boolean d11 = k11.d();
                                boolean e11 = this.f25475s0.e();
                                int i27 = this.f25446Y0;
                                if (!d11 || Math.abs(i25) < i27) {
                                    i25 = 0;
                                }
                                if (!e11 || Math.abs(i26) < i27) {
                                    i26 = 0;
                                }
                                if (i25 != 0 || i26 != 0) {
                                    float f11 = i25;
                                    float f12 = i26;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        if (!d11 && !e11) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        dispatchNestedFling(f11, f12, z11);
                                        M m10 = this.f25445X0;
                                        if (m10 != null) {
                                            C6085A c6085a = (C6085A) m10;
                                            K layoutManager = c6085a.f47734a.getLayoutManager();
                                            if (layoutManager != null && c6085a.f47734a.getAdapter() != null && ((Math.abs(i26) > (minFlingVelocity = c6085a.f47734a.getMinFlingVelocity()) || Math.abs(i25) > minFlingVelocity) && ((z12 = layoutManager instanceof U)))) {
                                                if (!z12) {
                                                    c6115w = null;
                                                } else {
                                                    c6115w = new C6118z(c6085a, c6085a.f47734a.getContext(), 0);
                                                }
                                                if (c6115w != null) {
                                                    int z15 = layoutManager.z();
                                                    if (z15 != 0) {
                                                        if (layoutManager.e()) {
                                                            abstractC6117y = c6085a.e(layoutManager);
                                                        } else if (layoutManager.d()) {
                                                            abstractC6117y = c6085a.d(layoutManager);
                                                        } else {
                                                            abstractC6117y = null;
                                                        }
                                                        if (abstractC6117y != null) {
                                                            int v10 = layoutManager.v();
                                                            motionEvent4 = obtain;
                                                            int i28 = Integer.MIN_VALUE;
                                                            int i29 = Integer.MAX_VALUE;
                                                            int i30 = 0;
                                                            View view = null;
                                                            View view2 = null;
                                                            while (i30 < v10) {
                                                                int i31 = v10;
                                                                View u10 = layoutManager.u(i30);
                                                                if (u10 != null) {
                                                                    int b10 = C6085A.b(u10, abstractC6117y);
                                                                    if (b10 <= 0 && b10 > i28) {
                                                                        i28 = b10;
                                                                        view2 = u10;
                                                                    }
                                                                    if (b10 >= 0 && b10 < i29) {
                                                                        i29 = b10;
                                                                        view = u10;
                                                                    }
                                                                }
                                                                i30++;
                                                                v10 = i31;
                                                            }
                                                            if (!layoutManager.d() ? i26 > 0 : i25 > 0) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            if (z13 && view != null) {
                                                                i13 = K.F(view);
                                                            } else if (!z13 && view2 != null) {
                                                                i13 = K.F(view2);
                                                            } else {
                                                                if (z13) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    int F10 = K.F(view);
                                                                    int z16 = layoutManager.z();
                                                                    if (z12 && (a5 = ((U) layoutManager).a(z16 - 1)) != null && (a5.x < 0.0f || a5.y < 0.0f)) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = false;
                                                                    }
                                                                    if (z14 == z13) {
                                                                        i12 = -1;
                                                                    } else {
                                                                        i12 = 1;
                                                                    }
                                                                    int i32 = i12 + F10;
                                                                    if (i32 >= 0 && i32 < z15) {
                                                                        i13 = i32;
                                                                    }
                                                                }
                                                                i13 = -1;
                                                            }
                                                            if (i13 != -1) {
                                                                c6115w.f47992a = i13;
                                                                layoutManager.w0(c6115w);
                                                                X();
                                                                motionEvent2 = motionEvent4;
                                                                motionEvent2.recycle();
                                                                return true;
                                                            }
                                                            if (z11) {
                                                                if (e11) {
                                                                    boolean z17 = d11 ? 1 : 0;
                                                                    char c10 = d11 ? 1 : 0;
                                                                    d11 = z17 | true;
                                                                }
                                                                C0371q scrollingChildHelper = getScrollingChildHelper();
                                                                int i33 = d11 ? 1 : 0;
                                                                int i34 = d11 ? 1 : 0;
                                                                scrollingChildHelper.h(i33, 1);
                                                                int i35 = -i24;
                                                                int max = Math.max(i35, Math.min(i25, i24));
                                                                int max2 = Math.max(i35, Math.min(i26, i24));
                                                                X x12 = this.f25450d1;
                                                                RecyclerView recyclerView4 = x12.f47798l0;
                                                                recyclerView4.setScrollState(2);
                                                                x12.f47793Z = 0;
                                                                x12.f47792Y = 0;
                                                                Interpolator interpolator = x12.f47795i0;
                                                                d dVar = f25421y1;
                                                                if (interpolator != dVar) {
                                                                    x12.f47795i0 = dVar;
                                                                    x12.f47794h0 = new OverScroller(recyclerView4.getContext(), dVar);
                                                                }
                                                                x12.f47794h0.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                x12.a();
                                                                X();
                                                                motionEvent2 = motionEvent4;
                                                                motionEvent2.recycle();
                                                                return true;
                                                            }
                                                            recyclerView3 = this;
                                                            i11 = 0;
                                                        }
                                                    }
                                                    motionEvent4 = obtain;
                                                    i13 = -1;
                                                    if (i13 != -1) {
                                                    }
                                                    if (z11) {
                                                    }
                                                }
                                            }
                                        }
                                        motionEvent4 = obtain;
                                        if (z11) {
                                        }
                                    }
                                }
                            }
                            recyclerView3 = this;
                            motionEvent4 = obtain;
                            i11 = 0;
                        }
                        recyclerView3.setScrollState(i11);
                        X();
                        motionEvent2 = motionEvent4;
                        motionEvent2.recycle();
                        return true;
                    }
                } else {
                    recyclerView2 = this;
                    motionEvent3 = obtain;
                    recyclerView2.f25438Q0 = motionEvent.getPointerId(0);
                    int x13 = (int) (motionEvent.getX() + 0.5f);
                    recyclerView2.f25442U0 = x13;
                    recyclerView2.f25440S0 = x13;
                    int y12 = (int) (motionEvent.getY() + 0.5f);
                    recyclerView2.f25443V0 = y12;
                    recyclerView2.f25441T0 = y12;
                    if (e10) {
                        boolean z18 = d10 ? 1 : 0;
                        char c11 = d10 ? 1 : 0;
                        d10 = z18 | true;
                    }
                    C0371q scrollingChildHelper2 = getScrollingChildHelper();
                    int i36 = d10 ? 1 : 0;
                    int i37 = d10 ? 1 : 0;
                    scrollingChildHelper2.h(i36, 0);
                }
                motionEvent2 = motionEvent3;
                recyclerView2.f25439R0.addMovement(motionEvent2);
                motionEvent2.recycle();
                return true;
            }
        } else {
            recyclerView = this;
            C6108o c6108o = (C6108o) n10;
            if (c6108o.f47946v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d12 = c6108o.d(motionEvent.getX(), motionEvent.getY());
                    boolean c12 = c6108o.c(motionEvent.getX(), motionEvent.getY());
                    if (d12 || c12) {
                        if (c12) {
                            c6108o.f47947w = 1;
                            c6108o.f47940p = (int) motionEvent.getX();
                        } else if (d12) {
                            i10 = 2;
                            c6108o.f47947w = 2;
                            c6108o.f47937m = (int) motionEvent.getY();
                            c6108o.f(i10);
                        }
                        i10 = 2;
                        c6108o.f(i10);
                    }
                } else if (motionEvent.getAction() == 1 && c6108o.f47946v == 2) {
                    c6108o.f47937m = 0.0f;
                    c6108o.f47940p = 0.0f;
                    c6108o.f(1);
                    c6108o.f47947w = 0;
                } else if (motionEvent.getAction() == 2 && c6108o.f47946v == 2) {
                    c6108o.g();
                    int i38 = c6108o.f47947w;
                    int i39 = c6108o.f47926b;
                    if (i38 == 1) {
                        float x14 = motionEvent.getX();
                        int[] iArr4 = c6108o.f47949y;
                        iArr4[0] = i39;
                        int i40 = c6108o.f47941q - i39;
                        iArr4[1] = i40;
                        float max3 = Math.max(i39, Math.min(i40, x14));
                        if (Math.abs(c6108o.f47939o - max3) >= 2.0f) {
                            int e12 = C6108o.e(c6108o.f47940p, max3, iArr4, c6108o.f47943s.computeHorizontalScrollRange(), c6108o.f47943s.computeHorizontalScrollOffset(), c6108o.f47941q);
                            if (e12 != 0) {
                                c6108o.f47943s.scrollBy(e12, 0);
                            }
                            c6108o.f47940p = max3;
                        }
                    }
                    if (c6108o.f47947w == 2) {
                        float y13 = motionEvent.getY();
                        int[] iArr5 = c6108o.f47948x;
                        iArr5[0] = i39;
                        int i41 = c6108o.f47942r - i39;
                        iArr5[1] = i41;
                        float max4 = Math.max(i39, Math.min(i41, y13));
                        if (Math.abs(c6108o.f47936l - max4) >= 2.0f) {
                            int e13 = C6108o.e(c6108o.f47937m, max4, iArr5, c6108o.f47943s.computeVerticalScrollRange(), c6108o.f47943s.computeVerticalScrollOffset(), c6108o.f47942r);
                            if (e13 != 0) {
                                c6108o.f47943s.scrollBy(0, e13);
                            }
                            c6108o.f47937m = max4;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            z10 = true;
            if (action == 3 || action == 1) {
                recyclerView.f25481v0 = null;
            }
        }
        X();
        recyclerView.setScrollState(0);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [s3.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [s3.J, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        View view;
        boolean z10;
        i0 i0Var;
        int i10;
        View view2;
        View A10;
        V v10 = this.g1;
        v10.a(1);
        z(v10);
        v10.f47786i = false;
        c0();
        j0 j0Var = this.f25463m0;
        j0Var.d();
        P();
        T();
        Y y10 = null;
        if (this.f25449c1 && hasFocus() && this.f25473r0 != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (A10 = A(view)) != null) {
            y10 = H(A10);
        }
        long j6 = -1;
        if (y10 == null) {
            v10.f47790m = -1L;
            v10.f47789l = -1;
            v10.f47791n = -1;
        } else {
            if (this.f25473r0.f47741b) {
                j6 = y10.f47804e;
            }
            v10.f47790m = j6;
            if (!this.f25427F0) {
                if (y10.j()) {
                    i10 = y10.f47803d;
                } else {
                    RecyclerView recyclerView = y10.f47817r;
                    if (recyclerView != null) {
                        i10 = recyclerView.F(y10);
                    }
                }
                v10.f47789l = i10;
                view2 = y10.f47800a;
                int id2 = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() == -1) {
                        id2 = view2.getId();
                    }
                }
                v10.f47791n = id2;
            }
            i10 = -1;
            v10.f47789l = i10;
            view2 = y10.f47800a;
            int id22 = view2.getId();
            while (!view2.isFocused()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() == -1) {
                }
            }
            v10.f47791n = id22;
        }
        if (v10.f47787j && this.f25460k1) {
            z10 = true;
        } else {
            z10 = false;
        }
        v10.f47785h = z10;
        this.f25460k1 = false;
        this.f25458j1 = false;
        v10.f47784g = v10.f47788k;
        v10.f47782e = this.f25473r0.a();
        C(this.f25468o1);
        if (v10.f47787j) {
            int e10 = this.f25461l0.e();
            for (int i11 = 0; i11 < e10; i11++) {
                Y I10 = I(this.f25461l0.d(i11));
                if (!I10.q() && (!I10.h() || this.f25473r0.f47741b)) {
                    AbstractC6092H abstractC6092H = this.f25436O0;
                    AbstractC6092H.b(I10);
                    I10.d();
                    abstractC6092H.getClass();
                    ?? obj = new Object();
                    obj.a(I10);
                    j0Var.c(I10, obj);
                    if (v10.f47785h && I10.m() && !I10.j() && !I10.q() && !I10.h()) {
                        ((C6066m) j0Var.f47913c).h(G(I10), I10);
                    }
                }
            }
        }
        if (v10.f47788k) {
            int h10 = this.f25461l0.h();
            for (int i12 = 0; i12 < h10; i12++) {
                Y I11 = I(this.f25461l0.g(i12));
                if (!I11.q() && I11.f47803d == -1) {
                    I11.f47803d = I11.f47802c;
                }
            }
            boolean z11 = v10.f47783f;
            v10.f47783f = false;
            this.f25475s0.Z(this.f25455i0, v10);
            v10.f47783f = z11;
            for (int i13 = 0; i13 < this.f25461l0.e(); i13++) {
                Y I12 = I(this.f25461l0.d(i13));
                if (!I12.q() && ((i0Var = (i0) ((C6049A) j0Var.f47912b).get(I12)) == null || (i0Var.f47895a & 4) == 0)) {
                    AbstractC6092H.b(I12);
                    boolean e11 = I12.e(8192);
                    AbstractC6092H abstractC6092H2 = this.f25436O0;
                    I12.d();
                    abstractC6092H2.getClass();
                    ?? obj2 = new Object();
                    obj2.a(I12);
                    if (e11) {
                        V(I12, obj2);
                    } else {
                        i0 i0Var2 = (i0) ((C6049A) j0Var.f47912b).get(I12);
                        if (i0Var2 == null) {
                            i0Var2 = i0.a();
                            ((C6049A) j0Var.f47912b).put(I12, i0Var2);
                        }
                        i0Var2.f47895a |= 2;
                        i0Var2.f47896b = obj2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        d0(false);
        v10.f47781d = 2;
    }

    public final void q() {
        boolean z10;
        c0();
        P();
        V v10 = this.g1;
        v10.a(6);
        this.f25459k0.c();
        v10.f47782e = this.f25473r0.a();
        v10.f47780c = 0;
        v10.f47784g = false;
        this.f25475s0.Z(this.f25455i0, v10);
        v10.f47783f = false;
        this.f25457j0 = null;
        if (v10.f47787j && this.f25436O0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v10.f47787j = z10;
        v10.f47781d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        Y I10 = I(view);
        if (I10 != null) {
            if (I10.l()) {
                I10.f47809j &= -257;
            } else if (!I10.q()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(I10);
                throw new IllegalArgumentException(AbstractC2469q0.h(this, sb2));
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C6115w c6115w = this.f25475s0.f47756e;
        if ((c6115w == null || !c6115w.f47996e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f25475s0.i0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.f25479u0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((N) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f25486z0 == 0 && !this.f25423B0) {
            super.requestLayout();
        } else {
            this.f25422A0 = true;
        }
    }

    public final void s(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        K k10 = this.f25475s0;
        if (k10 == null) {
            AbstractC3612c.c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f25423B0) {
        } else {
            boolean d10 = k10.d();
            boolean e10 = this.f25475s0.e();
            if (d10 || e10) {
                if (!d10) {
                    i10 = 0;
                }
                if (!e10) {
                    i11 = 0;
                }
                Y(i10, i11, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        AbstractC3612c.r("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        if (L()) {
            int i11 = 0;
            if (accessibilityEvent != null) {
                i10 = AbstractC0468b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.f25425D0 |= i11;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(a0 a0Var) {
        this.f25466n1 = a0Var;
        Z.l(this, a0Var);
    }

    public void setAdapter(AbstractC6088D abstractC6088D) {
        setLayoutFrozen(false);
        AbstractC6088D abstractC6088D2 = this.f25473r0;
        F f6 = this.f25453h0;
        if (abstractC6088D2 != null) {
            abstractC6088D2.f47740a.unregisterObserver(f6);
            this.f25473r0.getClass();
        }
        AbstractC6092H abstractC6092H = this.f25436O0;
        if (abstractC6092H != null) {
            abstractC6092H.e();
        }
        K k10 = this.f25475s0;
        g gVar = this.f25455i0;
        if (k10 != null) {
            k10.e0(gVar);
            this.f25475s0.f0(gVar);
        }
        ((ArrayList) gVar.f32642c).clear();
        gVar.d();
        C6095b c6095b = this.f25459k0;
        c6095b.l(c6095b.f47827b);
        c6095b.l(c6095b.f47828c);
        AbstractC6088D abstractC6088D3 = this.f25473r0;
        this.f25473r0 = abstractC6088D;
        if (abstractC6088D != null) {
            abstractC6088D.f47740a.registerObserver(f6);
        }
        AbstractC6088D abstractC6088D4 = this.f25473r0;
        ((ArrayList) gVar.f32642c).clear();
        gVar.d();
        Q c10 = gVar.c();
        if (abstractC6088D3 != null) {
            c10.f47776b--;
        }
        if (c10.f47776b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = c10.f47775a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                ((P) sparseArray.valueAt(i10)).f47771a.clear();
                i10++;
            }
        }
        if (abstractC6088D4 != null) {
            c10.f47776b++;
        }
        this.g1.f47783f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AbstractC6090F abstractC6090F) {
        if (abstractC6090F == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f25465n0) {
            this.f25435N0 = null;
            this.f25433L0 = null;
            this.f25434M0 = null;
            this.f25432K0 = null;
        }
        this.f25465n0 = z10;
        super.setClipToPadding(z10);
        if (this.f25485y0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C6091G c6091g) {
        c6091g.getClass();
        this.f25431J0 = c6091g;
        this.f25435N0 = null;
        this.f25433L0 = null;
        this.f25434M0 = null;
        this.f25432K0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f25484x0 = z10;
    }

    public void setItemAnimator(AbstractC6092H abstractC6092H) {
        AbstractC6092H abstractC6092H2 = this.f25436O0;
        if (abstractC6092H2 != null) {
            abstractC6092H2.e();
            this.f25436O0.f47742a = null;
        }
        this.f25436O0 = abstractC6092H;
        if (abstractC6092H != null) {
            abstractC6092H.f47742a = this.f25462l1;
        }
    }

    public void setItemViewCacheSize(int i10) {
        g gVar = this.f25455i0;
        gVar.f32640a = i10;
        gVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(K k10) {
        C6087C c6087c;
        C6115w c6115w;
        if (k10 == this.f25475s0) {
            return;
        }
        setScrollState(0);
        X x10 = this.f25450d1;
        x10.f47798l0.removeCallbacks(x10);
        x10.f47794h0.abortAnimation();
        K k11 = this.f25475s0;
        if (k11 != null && (c6115w = k11.f47756e) != null) {
            c6115w.i();
        }
        K k12 = this.f25475s0;
        g gVar = this.f25455i0;
        if (k12 != null) {
            AbstractC6092H abstractC6092H = this.f25436O0;
            if (abstractC6092H != null) {
                abstractC6092H.e();
            }
            this.f25475s0.e0(gVar);
            this.f25475s0.f0(gVar);
            ((ArrayList) gVar.f32642c).clear();
            gVar.d();
            if (this.f25483w0) {
                K k13 = this.f25475s0;
                k13.f47758g = false;
                k13.P(this);
            }
            this.f25475s0.r0(null);
            this.f25475s0 = null;
        } else {
            ((ArrayList) gVar.f32642c).clear();
            gVar.d();
        }
        C6096c c6096c = this.f25461l0;
        c6096c.f47834b.g();
        ArrayList arrayList = c6096c.f47835c;
        int size = arrayList.size() - 1;
        while (true) {
            c6087c = c6096c.f47833a;
            if (size < 0) {
                break;
            }
            c6087c.getClass();
            Y I10 = I((View) arrayList.get(size));
            if (I10 != null) {
                int i10 = I10.f47815p;
                RecyclerView recyclerView = c6087c.f47739a;
                if (recyclerView.L()) {
                    I10.f47816q = i10;
                    recyclerView.f25478t1.add(I10);
                } else {
                    WeakHashMap weakHashMap = Z.f3247a;
                    H.s(I10.f47800a, i10);
                }
                I10.f47815p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = c6087c.f47739a;
        int childCount = recyclerView2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView2.getChildAt(i11);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f25475s0 = k10;
        if (k10 != null) {
            if (k10.f47753b == null) {
                k10.r0(this);
                if (this.f25483w0) {
                    K k14 = this.f25475s0;
                    k14.f47758g = true;
                    k14.O(this);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(k10);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC2469q0.h(k10.f47753b, sb2));
            }
        }
        gVar.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0371q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3291d) {
            WeakHashMap weakHashMap = Z.f3247a;
            D1.N.z(scrollingChildHelper.f3290c);
        }
        scrollingChildHelper.f3291d = z10;
    }

    public void setOnFlingListener(M m10) {
        this.f25445X0 = m10;
    }

    @Deprecated
    public void setOnScrollListener(O o10) {
        this.f25454h1 = o10;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f25449c1 = z10;
    }

    public void setRecycledViewPool(Q q10) {
        Q q11;
        g gVar = this.f25455i0;
        if (((Q) gVar.f32646g) != null) {
            q11.f47776b--;
        }
        gVar.f32646g = q10;
        if (q10 != null && ((RecyclerView) gVar.f32648i).getAdapter() != null) {
            ((Q) gVar.f32646g).f47776b++;
        }
    }

    public void setScrollState(int i10) {
        C6115w c6115w;
        if (i10 == this.f25437P0) {
            return;
        }
        this.f25437P0 = i10;
        if (i10 != 2) {
            X x10 = this.f25450d1;
            x10.f47798l0.removeCallbacks(x10);
            x10.f47794h0.abortAnimation();
            K k10 = this.f25475s0;
            if (k10 != null && (c6115w = k10.f47756e) != null) {
                c6115w.i();
            }
        }
        K k11 = this.f25475s0;
        if (k11 != null) {
            k11.d0(i10);
        }
        O o10 = this.f25454h1;
        if (o10 != null) {
            o10.a(this, i10);
        }
        ArrayList arrayList = this.f25456i1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((O) this.f25456i1.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                AbstractC3612c.r("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f25444W0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f25444W0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(W w10) {
        this.f25455i0.f32647h = w10;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().h(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        C6115w c6115w;
        if (z10 != this.f25423B0) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f25423B0 = false;
                if (this.f25422A0 && this.f25475s0 != null && this.f25473r0 != null) {
                    requestLayout();
                }
                this.f25422A0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f25423B0 = true;
            this.f25424C0 = true;
            setScrollState(0);
            X x10 = this.f25450d1;
            x10.f47798l0.removeCallbacks(x10);
            x10.f47794h0.abortAnimation();
            K k10 = this.f25475s0;
            if (k10 != null && (c6115w = k10.f47756e) != null) {
                c6115w.i();
            }
        }
    }

    public final void t(int i10, int i11) {
        this.f25430I0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        O o10 = this.f25454h1;
        if (o10 != null) {
            o10.b(this, i10, i11);
        }
        ArrayList arrayList = this.f25456i1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((O) this.f25456i1.get(size)).b(this, i10, i11);
            }
        }
        this.f25430I0--;
    }

    public final void u() {
        if (this.f25435N0 != null) {
            return;
        }
        this.f25431J0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f25435N0 = edgeEffect;
        if (this.f25465n0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f25432K0 != null) {
            return;
        }
        this.f25431J0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f25432K0 = edgeEffect;
        if (this.f25465n0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f25434M0 != null) {
            return;
        }
        this.f25431J0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f25434M0 = edgeEffect;
        if (this.f25465n0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f25433L0 != null) {
            return;
        }
        this.f25431J0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f25433L0 = edgeEffect;
        if (this.f25465n0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return Separators.SP + super.toString() + ", adapter:" + this.f25473r0 + ", layout:" + this.f25475s0 + ", context:" + getContext();
    }

    public final void z(V v10) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f25450d1.f47794h0;
            overScroller.getFinalX();
            overScroller.getCurrX();
            v10.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        v10.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x03cc  */
    /* JADX WARN: Type inference failed for: r0v8, types: [w3.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [w3.H, java.lang.Object, w3.j] */
    /* JADX WARN: Type inference failed for: r1v17, types: [w3.V, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float f6;
        float f10;
        TypedArray typedArray;
        char c10;
        int i11;
        boolean z10;
        int i12;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        this.f25453h0 = new F(this);
        this.f25455i0 = new g(this);
        this.f25463m0 = new j0(0);
        this.f25467o0 = new Rect();
        this.f25469p0 = new Rect();
        this.f25471q0 = new RectF();
        this.f25477t0 = new ArrayList();
        this.f25479u0 = new ArrayList();
        this.f25486z0 = 0;
        this.f25427F0 = false;
        this.f25428G0 = false;
        this.f25429H0 = 0;
        this.f25430I0 = 0;
        this.f25431J0 = new Object();
        ?? obj = new Object();
        obj.f47742a = null;
        obj.f47743b = new ArrayList();
        obj.f47744c = 120L;
        obj.f47745d = 120L;
        obj.f47746e = 250L;
        obj.f47747f = 250L;
        obj.f47899g = true;
        obj.f47900h = new ArrayList();
        obj.f47901i = new ArrayList();
        obj.f47902j = new ArrayList();
        obj.f47903k = new ArrayList();
        obj.f47904l = new ArrayList();
        obj.f47905m = new ArrayList();
        obj.f47906n = new ArrayList();
        obj.f47907o = new ArrayList();
        obj.f47908p = new ArrayList();
        obj.f47909q = new ArrayList();
        obj.f47910r = new ArrayList();
        this.f25436O0 = obj;
        this.f25437P0 = 0;
        this.f25438Q0 = -1;
        this.f25448a1 = Float.MIN_VALUE;
        this.b1 = Float.MIN_VALUE;
        this.f25449c1 = true;
        this.f25450d1 = new X(this);
        this.f25452f1 = new C6061h(1);
        ?? obj2 = new Object();
        obj2.f47778a = -1;
        obj2.f47779b = 0;
        obj2.f47780c = 0;
        obj2.f47781d = 1;
        obj2.f47782e = 0;
        obj2.f47783f = false;
        obj2.f47784g = false;
        obj2.f47785h = false;
        obj2.f47786i = false;
        obj2.f47787j = false;
        obj2.f47788k = false;
        this.g1 = obj2;
        this.f25458j1 = false;
        this.f25460k1 = false;
        C6087C c6087c = new C6087C(this);
        this.f25462l1 = c6087c;
        this.f25464m1 = false;
        this.f25468o1 = new int[2];
        this.f25472q1 = new int[2];
        this.f25474r1 = new int[2];
        this.f25476s1 = new int[2];
        this.f25478t1 = new ArrayList();
        this.f25480u1 = new RunnableC6086B(this);
        this.f25482v1 = new C6087C(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f25444W0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = AbstractC0344c0.f3257a;
            f6 = AbstractC0340a0.a(viewConfiguration);
        } else {
            f6 = AbstractC0344c0.a(viewConfiguration, context);
        }
        this.f25448a1 = f6;
        if (i13 >= 26) {
            f10 = AbstractC0340a0.b(viewConfiguration);
        } else {
            f10 = AbstractC0344c0.a(viewConfiguration, context);
        }
        this.b1 = f10;
        this.f25446Y0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f25447Z0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f25436O0.f47742a = c6087c;
        this.f25459k0 = new C6095b(new C6087C(this));
        this.f25461l0 = new C6096c(new C6087C(this));
        WeakHashMap weakHashMap = Z.f3247a;
        if ((i13 < 26 || D1.P.c(this) == 0) && i13 >= 26) {
            D1.P.m(this, 8);
        }
        if (H.c(this) == 0) {
            H.s(this, 1);
        }
        this.f25426E0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a0(this));
        int[] iArr = AbstractC5970a.f47147a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (i13 >= 29) {
            typedArray = obtainStyledAttributes;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        } else {
            typedArray = obtainStyledAttributes;
        }
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f25465n0 = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                i11 = 4;
                c10 = 2;
                new C6108o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(AbstractC2469q0.h(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            i11 = 4;
            c10 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(Separators.DOT)) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(K.class);
                    try {
                        constructor = asSubclass.getConstructor(f25420x1);
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = context;
                        z10 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c10] = Integer.valueOf(i10);
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e10) {
                            e = e10;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                                constructor.setAccessible(z10);
                                setLayoutManager((K) constructor.newInstance(objArr));
                                i12 = Build.VERSION.SDK_INT;
                                int[] iArr2 = f25419w1;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
                                if (i12 >= 29) {
                                }
                                boolean z11 = obtainStyledAttributes2.getBoolean(0, z10);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z11);
                            } catch (NoSuchMethodException e11) {
                                e11.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e11);
                            }
                        }
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        z10 = true;
                    }
                    constructor.setAccessible(z10);
                    setLayoutManager((K) constructor.newInstance(objArr));
                    i12 = Build.VERSION.SDK_INT;
                    int[] iArr22 = f25419w1;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i10, 0);
                    if (i12 >= 29) {
                        saveAttributeDataForStyleable(context, iArr22, attributeSet, obtainStyledAttributes22, i10, 0);
                    }
                    boolean z112 = obtainStyledAttributes22.getBoolean(0, z10);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z112);
                } catch (ClassCastException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e13);
                } catch (ClassNotFoundException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e15);
                } catch (InstantiationException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e17);
                }
            }
        }
        z10 = true;
        i12 = Build.VERSION.SDK_INT;
        int[] iArr222 = f25419w1;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i10, 0);
        if (i12 >= 29) {
        }
        boolean z1122 = obtainStyledAttributes222.getBoolean(0, z10);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z1122);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        K k10 = this.f25475s0;
        if (k10 != null) {
            return k10.t(layoutParams);
        }
        throw new IllegalStateException(AbstractC2469q0.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void setRecyclerListener(S s10) {
    }
}
