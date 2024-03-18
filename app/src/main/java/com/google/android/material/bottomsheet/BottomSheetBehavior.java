package com.google.android.material.bottomsheet;

import D1.C0339a;
import D1.C0343c;
import D1.H;
import D1.I;
import D1.K;
import D1.L;
import D1.N;
import D1.Z;
import E1.h;
import L1.e;
import R.a;
import S7.b;
import S7.c;
import S7.d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import f8.f;
import f8.g;
import f8.j;
import g.RunnableC3115h;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m.C4528h;
import m1.AbstractC4544a;
import m1.C4547d;
import v7.l;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC4544a {

    /* renamed from: A  reason: collision with root package name */
    public final l f27019A;

    /* renamed from: B  reason: collision with root package name */
    public final ValueAnimator f27020B;

    /* renamed from: C  reason: collision with root package name */
    public final int f27021C;

    /* renamed from: D  reason: collision with root package name */
    public int f27022D;

    /* renamed from: E  reason: collision with root package name */
    public int f27023E;

    /* renamed from: F  reason: collision with root package name */
    public final float f27024F;

    /* renamed from: G  reason: collision with root package name */
    public int f27025G;

    /* renamed from: H  reason: collision with root package name */
    public final float f27026H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f27027I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f27028J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f27029K;

    /* renamed from: L  reason: collision with root package name */
    public int f27030L;

    /* renamed from: M  reason: collision with root package name */
    public e f27031M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f27032N;

    /* renamed from: O  reason: collision with root package name */
    public int f27033O;
    public boolean P;
    public final float Q;

    /* renamed from: R  reason: collision with root package name */
    public int f27034R;
    public int S;
    public int T;

    /* renamed from: U  reason: collision with root package name */
    public WeakReference f27035U;

    /* renamed from: V  reason: collision with root package name */
    public WeakReference f27036V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f27037W;

    /* renamed from: X  reason: collision with root package name */
    public VelocityTracker f27038X;

    /* renamed from: Y  reason: collision with root package name */
    public int f27039Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f27040Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f27041a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27042a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27043b;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f27044b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f27045c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f27046c0;

    /* renamed from: d  reason: collision with root package name */
    public final int f27047d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f27048d0;

    /* renamed from: e  reason: collision with root package name */
    public int f27049e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27050f;

    /* renamed from: g  reason: collision with root package name */
    public int f27051g;

    /* renamed from: h  reason: collision with root package name */
    public final int f27052h;

    /* renamed from: i  reason: collision with root package name */
    public final g f27053i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f27054j;

    /* renamed from: k  reason: collision with root package name */
    public final int f27055k;

    /* renamed from: l  reason: collision with root package name */
    public final int f27056l;

    /* renamed from: m  reason: collision with root package name */
    public int f27057m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f27058n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f27059o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f27060p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f27061q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f27062r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f27063s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f27064t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f27065u;

    /* renamed from: v  reason: collision with root package name */
    public int f27066v;

    /* renamed from: w  reason: collision with root package name */
    public int f27067w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f27068x;

    /* renamed from: y  reason: collision with root package name */
    public final j f27069y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27070z;

    public BottomSheetBehavior() {
        this.f27041a = 0;
        this.f27043b = true;
        this.f27055k = -1;
        this.f27056l = -1;
        this.f27019A = new l(this, 0);
        this.f27024F = 0.5f;
        this.f27026H = -1.0f;
        this.f27029K = true;
        this.f27030L = 4;
        this.Q = 0.1f;
        this.f27037W = new ArrayList();
        this.f27040Z = -1;
        this.f27046c0 = new SparseIntArray();
        this.f27048d0 = new b(this);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = Z.f3247a;
        if (N.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View v10 = v(viewGroup.getChildAt(i10));
                if (v10 != null) {
                    return v10;
                }
            }
        }
        return null;
    }

    public static int w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final void A(int i10) {
        if (i10 == -1) {
            if (!this.f27050f) {
                this.f27050f = true;
            } else {
                return;
            }
        } else if (this.f27050f || this.f27049e != i10) {
            this.f27050f = false;
            this.f27049e = Math.max(0, i10);
        } else {
            return;
        }
        I();
    }

    public final void B(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2) {
            if (!this.f27027I && i10 == 5) {
                AbstractC3612c.r("BottomSheetBehavior", "Cannot set state: " + i10);
                return;
            }
            if (i10 == 6 && this.f27043b && y(i10) <= this.f27022D) {
                i11 = 3;
            } else {
                i11 = i10;
            }
            WeakReference weakReference = this.f27035U;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f27035U.get();
                RunnableC3115h runnableC3115h = new RunnableC3115h(this, view, i11, 8);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    if (K.b(view)) {
                        view.post(runnableC3115h);
                        return;
                    }
                }
                runnableC3115h.run();
                return;
            }
            C(i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(a.t(sb2, str, " should not be set externally."));
    }

    public final void C(int i10) {
        if (this.f27030L == i10) {
            return;
        }
        this.f27030L = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.f27027I;
        }
        WeakReference weakReference = this.f27035U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            H(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            H(false);
        }
        G(i10, true);
        ArrayList arrayList = this.f27037W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            AbstractC2469q0.p(arrayList.get(0));
            throw null;
        }
    }

    public final boolean D(View view, float f6) {
        if (this.f27028J) {
            return true;
        }
        if (view.getTop() < this.f27025G) {
            return false;
        }
        int t10 = t();
        if (Math.abs(((f6 * this.Q) + view.getTop()) - this.f27025G) / t10 > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r3 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        C(2);
        G(r4, true);
        r2.f27019A.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i10, boolean z10) {
        int y10 = y(i10);
        e eVar = this.f27031M;
        if (eVar != null) {
            if (!z10) {
                int left = view.getLeft();
                eVar.f10513r = view;
                eVar.f10498c = -1;
                boolean h10 = eVar.h(left, y10, 0, 0);
                if (!h10 && eVar.f10496a == 0 && eVar.f10513r != null) {
                    eVar.f10513r = null;
                }
            }
        }
        C(i10);
    }

    public final void F() {
        View view;
        int i10;
        boolean z10;
        C0343c c0343c;
        WeakReference weakReference = this.f27035U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            Z.i(view, 524288);
            Z.g(view, 0);
            Z.i(view, 262144);
            Z.g(view, 0);
            Z.i(view, 1048576);
            Z.g(view, 0);
            SparseIntArray sparseIntArray = this.f27046c0;
            int i11 = sparseIntArray.get(0, -1);
            if (i11 != -1) {
                Z.i(view, i11);
                Z.g(view, 0);
                sparseIntArray.delete(0);
            }
            int i12 = 6;
            if (!this.f27043b && this.f27030L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                C4528h c4528h = new C4528h(6, this);
                ArrayList e10 = Z.e(view);
                int i13 = 0;
                while (true) {
                    if (i13 < e10.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((h) e10.get(i13)).f4112a).getLabel())) {
                            i10 = ((h) e10.get(i13)).a();
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = Z.f3250d;
                            if (i14 >= iArr.length || i15 != -1) {
                                break;
                            }
                            int i16 = iArr[i14];
                            boolean z11 = true;
                            for (int i17 = 0; i17 < e10.size(); i17++) {
                                if (((h) e10.get(i17)).a() != i16) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 &= z10;
                            }
                            if (z11) {
                                i15 = i16;
                            }
                            i14++;
                        }
                        i10 = i15;
                    }
                }
                if (i10 != -1) {
                    h hVar = new h(null, i10, string, c4528h, null);
                    View.AccessibilityDelegate c10 = Z.c(view);
                    if (c10 == null) {
                        c0343c = null;
                    } else if (c10 instanceof C0339a) {
                        c0343c = ((C0339a) c10).f3253a;
                    } else {
                        c0343c = new C0343c(c10);
                    }
                    if (c0343c == null) {
                        c0343c = new C0343c();
                    }
                    Z.l(view, c0343c);
                    Z.i(view, hVar.a());
                    Z.e(view).add(hVar);
                    Z.g(view, 0);
                }
                sparseIntArray.put(0, i10);
            }
            if (this.f27027I && this.f27030L != 5) {
                Z.j(view, h.f4107l, new C4528h(5, this));
            }
            int i18 = this.f27030L;
            if (i18 != 3) {
                if (i18 != 4) {
                    if (i18 == 6) {
                        Z.j(view, h.f4106k, new C4528h(4, this));
                        Z.j(view, h.f4105j, new C4528h(3, this));
                        return;
                    }
                    return;
                }
                if (this.f27043b) {
                    i12 = 3;
                }
                Z.j(view, h.f4105j, new C4528h(i12, this));
                return;
            }
            if (this.f27043b) {
                i12 = 4;
            }
            Z.j(view, h.f4106k, new C4528h(i12, this));
        }
    }

    public final void G(int i10, boolean z10) {
        boolean z11;
        g gVar = this.f27053i;
        ValueAnimator valueAnimator = this.f27020B;
        if (i10 == 2) {
            return;
        }
        if (this.f27030L == 3 && (this.f27068x || z())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27070z != z11 && gVar != null) {
            this.f27070z = z11;
            float f6 = 1.0f;
            if (z10 && valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                float f10 = gVar.f29688Y.f29674j;
                if (z11) {
                    f6 = s();
                }
                valueAnimator.setFloatValues(f10, f6);
                valueAnimator.start();
                return;
            }
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            if (this.f27070z) {
                f6 = s();
            }
            f fVar = gVar.f29688Y;
            if (fVar.f29674j != f6) {
                fVar.f29674j = f6;
                gVar.f29692j0 = true;
                gVar.invalidateSelf();
            }
        }
    }

    public final void H(boolean z10) {
        WeakReference weakReference = this.f27035U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f27044b0 == null) {
                this.f27044b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.f27035U.get() && z10) {
                this.f27044b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z10) {
            this.f27044b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f27035U != null) {
            r();
            if (this.f27030L == 4 && (view = (View) this.f27035U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // m1.AbstractC4544a
    public final void c(C4547d c4547d) {
        this.f27035U = null;
        this.f27031M = null;
    }

    @Override // m1.AbstractC4544a
    public final void e() {
        this.f27035U = null;
        this.f27031M = null;
    }

    @Override // m1.AbstractC4544a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        e eVar;
        boolean z10;
        View view2;
        if (view.isShown() && this.f27029K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f27039Y = -1;
                this.f27040Z = -1;
                VelocityTracker velocityTracker = this.f27038X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f27038X = null;
                }
            }
            if (this.f27038X == null) {
                this.f27038X = VelocityTracker.obtain();
            }
            this.f27038X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f27042a0 = false;
                    this.f27039Y = -1;
                    if (this.f27032N) {
                        this.f27032N = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.f27040Z = (int) motionEvent.getY();
                if (this.f27030L != 2) {
                    WeakReference weakReference = this.f27036V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x10, this.f27040Z)) {
                        this.f27039Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f27042a0 = true;
                    }
                }
                if (this.f27039Y == -1 && !coordinatorLayout.o(view, x10, this.f27040Z)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f27032N = z10;
            }
            if (!this.f27032N && (eVar = this.f27031M) != null && eVar.p(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f27036V;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.f27032N || this.f27030L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f27031M == null || (i10 = this.f27040Z) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.f27031M.f10497b) {
                return false;
            }
            return true;
        }
        this.f27032N = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [s3.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r4v16, types: [Z.x0, java.lang.Object] */
    @Override // m1.AbstractC4544a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z10;
        WeakHashMap weakHashMap = Z.f3247a;
        if (H.b(coordinatorLayout) && !H.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f27035U == null) {
            this.f27051g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f27058n && !this.f27050f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f27059o || this.f27060p || this.f27061q || this.f27063s || this.f27064t || this.f27065u || z10) {
                ?? obj = new Object();
                obj.f22768b = this;
                obj.f22767a = z10;
                int f6 = I.f(view);
                int paddingTop = view.getPaddingTop();
                int e10 = I.e(view);
                int paddingBottom = view.getPaddingBottom();
                ?? obj2 = new Object();
                obj2.f45241a = f6;
                obj2.f45242b = paddingTop;
                obj2.f45243c = e10;
                obj2.f45244d = paddingBottom;
                N.u(view, new a8.l(obj, obj2));
                if (K.b(view)) {
                    L.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            Z.n(view, new d(view));
            this.f27035U = new WeakReference(view);
            Context context = view.getContext();
            P4.a.C0(context, R.attr.motionEasingStandardDecelerateInterpolator, F1.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            P4.a.B0(context, R.attr.motionDurationMedium2, RCHTTPStatusCodes.UNSUCCESSFUL);
            P4.a.B0(context, R.attr.motionDurationShort3, 150);
            P4.a.B0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            g gVar = this.f27053i;
            if (gVar != null) {
                H.q(view, gVar);
                g gVar2 = this.f27053i;
                float f10 = this.f27026H;
                if (f10 == -1.0f) {
                    f10 = N.i(view);
                }
                gVar2.j(f10);
            } else {
                ColorStateList colorStateList = this.f27054j;
                if (colorStateList != null) {
                    N.q(view, colorStateList);
                }
            }
            F();
            if (H.c(view) == 0) {
                H.s(view, 1);
            }
        }
        if (this.f27031M == null) {
            this.f27031M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f27048d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i10);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f27034R = height;
        int i11 = this.T;
        int i12 = i11 - height;
        int i13 = this.f27067w;
        if (i12 < i13) {
            if (this.f27062r) {
                int i14 = this.f27056l;
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.f27034R = i11;
            } else {
                int i15 = i11 - i13;
                int i16 = this.f27056l;
                if (i16 != -1) {
                    i15 = Math.min(i15, i16);
                }
                this.f27034R = i15;
            }
        }
        this.f27022D = Math.max(0, this.T - this.f27034R);
        this.f27023E = (int) ((1.0f - this.f27024F) * this.T);
        r();
        int i17 = this.f27030L;
        if (i17 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i17 == 6) {
            view.offsetTopAndBottom(this.f27023E);
        } else if (this.f27027I && i17 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i17 == 4) {
            view.offsetTopAndBottom(this.f27025G);
        } else if (i17 == 1 || i17 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f27030L, false);
        this.f27036V = new WeakReference(v(view));
        ArrayList arrayList = this.f27037W;
        if (arrayList.size() <= 0) {
            return true;
        }
        AbstractC2469q0.p(arrayList.get(0));
        throw null;
    }

    @Override // m1.AbstractC4544a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f27055k, marginLayoutParams.width), w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f27056l, marginLayoutParams.height));
        return true;
    }

    @Override // m1.AbstractC4544a
    public final boolean i(View view) {
        WeakReference weakReference = this.f27036V;
        if (weakReference == null || view != weakReference.get() || this.f27030L == 3) {
            return false;
        }
        return true;
    }

    @Override // m1.AbstractC4544a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        View view3;
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f27036V;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < x()) {
                int x10 = top - x();
                iArr[1] = x10;
                int i14 = -x10;
                WeakHashMap weakHashMap = Z.f3247a;
                view.offsetTopAndBottom(i14);
                C(3);
            } else if (!this.f27029K) {
                return;
            } else {
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = Z.f3247a;
                view.offsetTopAndBottom(-i11);
                C(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i15 = this.f27025G;
            if (i13 > i15 && !this.f27027I) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                WeakHashMap weakHashMap3 = Z.f3247a;
                view.offsetTopAndBottom(i17);
                C(4);
            } else if (!this.f27029K) {
                return;
            } else {
                iArr[1] = i11;
                WeakHashMap weakHashMap4 = Z.f3247a;
                view.offsetTopAndBottom(-i11);
                C(1);
            }
        }
        u(view.getTop());
        this.f27033O = i11;
        this.P = true;
    }

    @Override // m1.AbstractC4544a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // m1.AbstractC4544a
    public final void m(View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        int i10 = this.f27041a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f27049e = cVar.f16196i0;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f27043b = cVar.f16197j0;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f27027I = cVar.f16198k0;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f27028J = cVar.f16199l0;
            }
        }
        int i11 = cVar.f16195h0;
        if (i11 != 1 && i11 != 2) {
            this.f27030L = i11;
        } else {
            this.f27030L = 4;
        }
    }

    @Override // m1.AbstractC4544a
    public final Parcelable n(View view) {
        return new c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // m1.AbstractC4544a
    public final boolean o(View view, int i10, int i11) {
        this.f27033O = 0;
        this.P = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r4.getTop() <= r3.f27023E) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.f27022D) < java.lang.Math.abs(r5 - r3.f27025G)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.f27025G)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f27025G)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.f27023E) < java.lang.Math.abs(r5 - r3.f27025G)) goto L44;
     */
    @Override // m1.AbstractC4544a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i10) {
        float f6;
        int i11 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.f27036V;
        if (weakReference != null && view2 == weakReference.get() && this.P) {
            if (this.f27033O > 0) {
                if (!this.f27043b) {
                }
                E(view, i11, false);
                this.P = false;
            }
            if (this.f27027I) {
                VelocityTracker velocityTracker = this.f27038X;
                if (velocityTracker == null) {
                    f6 = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f27045c);
                    f6 = this.f27038X.getYVelocity(this.f27039Y);
                }
                if (D(view, f6)) {
                    i11 = 5;
                    E(view, i11, false);
                    this.P = false;
                }
            }
            if (this.f27033O == 0) {
                int top = view.getTop();
                if (!this.f27043b) {
                    int i12 = this.f27023E;
                    if (top < i12) {
                    }
                    i11 = 6;
                }
            } else {
                if (!this.f27043b) {
                    int top2 = view.getTop();
                }
                i11 = 4;
            }
            E(view, i11, false);
            this.P = false;
        }
    }

    @Override // m1.AbstractC4544a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f27030L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f27031M;
        if (eVar != null && (this.f27029K || i10 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f27039Y = -1;
            this.f27040Z = -1;
            VelocityTracker velocityTracker = this.f27038X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f27038X = null;
            }
        }
        if (this.f27038X == null) {
            this.f27038X = VelocityTracker.obtain();
        }
        this.f27038X.addMovement(motionEvent);
        if (this.f27031M != null && ((this.f27029K || this.f27030L == 1) && actionMasked == 2 && !this.f27032N)) {
            float abs = Math.abs(this.f27040Z - motionEvent.getY());
            e eVar2 = this.f27031M;
            if (abs > eVar2.f10497b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f27032N;
    }

    public final void r() {
        int t10 = t();
        if (this.f27043b) {
            this.f27025G = Math.max(this.T - t10, this.f27022D);
        } else {
            this.f27025G = this.T - t10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f6;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f10 = 0.0f;
        if (this.f27053i != null && (weakReference = this.f27035U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f27035U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.f27053i;
                float a5 = gVar.f29688Y.f29665a.f29714e.a(gVar.g());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f11 = radius2;
                    if (f11 > 0.0f && a5 > 0.0f) {
                        f6 = f11 / a5;
                        g gVar2 = this.f27053i;
                        float a10 = gVar2.f29688Y.f29665a.f29715f.a(gVar2.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f12 = radius;
                            if (f12 > 0.0f && a10 > 0.0f) {
                                f10 = f12 / a10;
                            }
                        }
                        return Math.max(f6, f10);
                    }
                }
                f6 = 0.0f;
                g gVar22 = this.f27053i;
                float a102 = gVar22.f29688Y.f29665a.f29715f.a(gVar22.g());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f6, f10);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i10;
        if (this.f27050f) {
            return Math.min(Math.max(this.f27051g, this.T - ((this.S * 9) / 16)), this.f27034R) + this.f27066v;
        }
        if (!this.f27058n && !this.f27059o && (i10 = this.f27057m) > 0) {
            return Math.max(this.f27049e, i10 + this.f27052h);
        }
        return this.f27049e + this.f27066v;
    }

    public final void u(int i10) {
        if (((View) this.f27035U.get()) != null) {
            ArrayList arrayList = this.f27037W;
            if (!arrayList.isEmpty()) {
                int i11 = this.f27025G;
                if (i10 <= i11 && i11 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    AbstractC2469q0.p(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int x() {
        int i10;
        if (this.f27043b) {
            return this.f27022D;
        }
        int i11 = this.f27021C;
        if (this.f27062r) {
            i10 = 0;
        } else {
            i10 = this.f27067w;
        }
        return Math.max(i11, i10);
    }

    public final int y(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.f27023E;
                    }
                    throw new IllegalArgumentException(android.gov.nist.core.a.e("Invalid state to get top offset: ", i10));
                }
                return this.T;
            }
            return this.f27025G;
        }
        return x();
    }

    public final boolean z() {
        WeakReference weakReference = this.f27035U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f27035U.get()).getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        this.f27041a = 0;
        this.f27043b = true;
        this.f27055k = -1;
        this.f27056l = -1;
        this.f27019A = new l(this, 0);
        this.f27024F = 0.5f;
        this.f27026H = -1.0f;
        this.f27029K = true;
        this.f27030L = 4;
        this.Q = 0.1f;
        this.f27037W = new ArrayList();
        this.f27040Z = -1;
        this.f27046c0 = new SparseIntArray();
        this.f27048d0 = new b(this);
        this.f27052h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13402a);
        int i11 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f27054j = A7.b.L0(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f27069y = j.b(context, attributeSet, R.attr.bottomSheetStyle, 2131952483).a();
        }
        j jVar = this.f27069y;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f27053i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f27054j;
            if (colorStateList != null) {
                this.f27053i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f27053i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f27020B = ofFloat;
        ofFloat.setDuration(500L);
        this.f27020B.addUpdateListener(new S7.a(0, this));
        this.f27026H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f27055k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f27056l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            A(i10);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z10 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f27027I != z10) {
            this.f27027I = z10;
            if (!z10 && this.f27030L == 5) {
                B(4);
            }
            F();
        }
        this.f27058n = obtainStyledAttributes.getBoolean(13, false);
        boolean z11 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f27043b != z11) {
            this.f27043b = z11;
            if (this.f27035U != null) {
                r();
            }
            C((!this.f27043b || this.f27030L != 6) ? this.f27030L : i11);
            G(this.f27030L, true);
            F();
        }
        this.f27028J = obtainStyledAttributes.getBoolean(12, false);
        this.f27029K = obtainStyledAttributes.getBoolean(4, true);
        this.f27041a = obtainStyledAttributes.getInt(10, 0);
        float f6 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f6 > 0.0f && f6 < 1.0f) {
            this.f27024F = f6;
            if (this.f27035U != null) {
                this.f27023E = (int) ((1.0f - f6) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i12 = peekValue2.data;
                if (i12 >= 0) {
                    this.f27021C = i12;
                    G(this.f27030L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f27021C = dimensionPixelOffset;
                    G(this.f27030L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f27047d = obtainStyledAttributes.getInt(11, 500);
            this.f27059o = obtainStyledAttributes.getBoolean(17, false);
            this.f27060p = obtainStyledAttributes.getBoolean(18, false);
            this.f27061q = obtainStyledAttributes.getBoolean(19, false);
            this.f27062r = obtainStyledAttributes.getBoolean(20, true);
            this.f27063s = obtainStyledAttributes.getBoolean(14, false);
            this.f27064t = obtainStyledAttributes.getBoolean(15, false);
            this.f27065u = obtainStyledAttributes.getBoolean(16, false);
            this.f27068x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f27045c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
