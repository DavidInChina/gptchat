package com.google.android.material.sidesheet;

import A7.b;
import D1.H;
import D1.K;
import D1.N;
import D1.Z;
import L1.e;
import P4.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d7.h;
import f8.C2944a;
import f8.g;
import f8.j;
import g8.C3207a;
import g8.C3208b;
import g8.C3209c;
import i8.C3493k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k6.AbstractC4194d;
import m1.AbstractC4544a;
import m1.C4547d;
import v7.l;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC4544a {

    /* renamed from: a  reason: collision with root package name */
    public C3207a f27228a;

    /* renamed from: b  reason: collision with root package name */
    public final g f27229b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f27230c;

    /* renamed from: d  reason: collision with root package name */
    public final j f27231d;

    /* renamed from: e  reason: collision with root package name */
    public final l f27232e;

    /* renamed from: f  reason: collision with root package name */
    public final float f27233f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27234g;

    /* renamed from: h  reason: collision with root package name */
    public int f27235h;

    /* renamed from: i  reason: collision with root package name */
    public e f27236i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27237j;

    /* renamed from: k  reason: collision with root package name */
    public final float f27238k;

    /* renamed from: l  reason: collision with root package name */
    public int f27239l;

    /* renamed from: m  reason: collision with root package name */
    public int f27240m;

    /* renamed from: n  reason: collision with root package name */
    public int f27241n;

    /* renamed from: o  reason: collision with root package name */
    public int f27242o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f27243p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f27244q;

    /* renamed from: r  reason: collision with root package name */
    public final int f27245r;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f27246s;

    /* renamed from: t  reason: collision with root package name */
    public int f27247t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f27248u;

    /* renamed from: v  reason: collision with root package name */
    public final C3208b f27249v;

    public SideSheetBehavior() {
        this.f27232e = new l(this);
        this.f27234g = true;
        this.f27235h = 5;
        this.f27238k = 0.1f;
        this.f27245r = -1;
        this.f27248u = new LinkedHashSet();
        this.f27249v = new C3208b(this);
    }

    @Override // m1.AbstractC4544a
    public final void c(C4547d c4547d) {
        this.f27243p = null;
        this.f27236i = null;
    }

    @Override // m1.AbstractC4544a
    public final void e() {
        this.f27243p = null;
        this.f27236i = null;
    }

    @Override // m1.AbstractC4544a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || Z.d(view) != null) && this.f27234g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f27246s) != null) {
                velocityTracker.recycle();
                this.f27246s = null;
            }
            if (this.f27246s == null) {
                this.f27246s = VelocityTracker.obtain();
            }
            this.f27246s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.f27237j) {
                    this.f27237j = false;
                    return false;
                }
            } else {
                this.f27247t = (int) motionEvent.getX();
            }
            if (!this.f27237j && (eVar = this.f27236i) != null && eVar.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.f27237j = true;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r6 != r0) goto L42;
     */
    @Override // m1.AbstractC4544a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View findViewById;
        int i16;
        View view2;
        View view3;
        int i17;
        int i18;
        WeakHashMap weakHashMap = Z.f3247a;
        if (H.b(coordinatorLayout) && !H.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i19 = 0;
        if (this.f27243p == null) {
            this.f27243p = new WeakReference(view);
            Context context = view.getContext();
            a.C0(context, R.attr.motionEasingStandardDecelerateInterpolator, F1.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            a.B0(context, R.attr.motionDurationMedium2, RCHTTPStatusCodes.UNSUCCESSFUL);
            a.B0(context, R.attr.motionDurationShort3, 150);
            a.B0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            g gVar = this.f27229b;
            if (gVar != null) {
                H.q(view, gVar);
                g gVar2 = this.f27229b;
                float f6 = this.f27233f;
                if (f6 == -1.0f) {
                    f6 = N.i(view);
                }
                gVar2.j(f6);
            } else {
                ColorStateList colorStateList = this.f27230c;
                if (colorStateList != null) {
                    N.q(view, colorStateList);
                }
            }
            if (this.f27235h == 5) {
                i18 = 4;
            } else {
                i18 = 0;
            }
            if (view.getVisibility() != i18) {
                view.setVisibility(i18);
            }
            u();
            if (H.c(view) == 0) {
                H.s(view, 1);
            }
            if (Z.d(view) == null) {
                Z.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((C4547d) view.getLayoutParams()).f38853c, i10) == 3) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        C3207a c3207a = this.f27228a;
        if (c3207a != null) {
            switch (c3207a.f31305Y) {
                case 0:
                    i17 = 1;
                    break;
                default:
                    i17 = 0;
                    break;
            }
        }
        j jVar = this.f27231d;
        C4547d c4547d = null;
        if (i11 == 0) {
            this.f27228a = new C3207a(this, 1);
            if (jVar != null) {
                WeakReference weakReference = this.f27243p;
                if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C4547d)) {
                    c4547d = (C4547d) view3.getLayoutParams();
                }
                if (c4547d == null || ((ViewGroup.MarginLayoutParams) c4547d).rightMargin <= 0) {
                    h e10 = jVar.e();
                    e10.f28077f = new C2944a(0.0f);
                    e10.f28078g = new C2944a(0.0f);
                    j a5 = e10.a();
                    g gVar3 = this.f27229b;
                    if (gVar3 != null) {
                        gVar3.setShapeAppearanceModel(a5);
                    }
                }
            }
        } else if (i11 == 1) {
            this.f27228a = new C3207a(this, 0);
            if (jVar != null) {
                WeakReference weakReference2 = this.f27243p;
                if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C4547d)) {
                    c4547d = (C4547d) view2.getLayoutParams();
                }
                if (c4547d == null || ((ViewGroup.MarginLayoutParams) c4547d).leftMargin <= 0) {
                    h e11 = jVar.e();
                    e11.f28076e = new C2944a(0.0f);
                    e11.f28079h = new C2944a(0.0f);
                    j a10 = e11.a();
                    g gVar4 = this.f27229b;
                    if (gVar4 != null) {
                        gVar4.setShapeAppearanceModel(a10);
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC4194d.v("Invalid sheet edge position value: ", i11, ". Must be 0 or 1."));
        }
        if (this.f27236i == null) {
            this.f27236i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f27249v);
        }
        C3207a c3207a2 = this.f27228a;
        int i20 = c3207a2.f31305Y;
        SideSheetBehavior sideSheetBehavior = c3207a2.f31306Z;
        switch (i20) {
            case 0:
                i12 = view.getRight() + sideSheetBehavior.f27242o;
                break;
            default:
                i12 = view.getLeft() - sideSheetBehavior.f27242o;
                break;
        }
        coordinatorLayout.q(view, i10);
        this.f27240m = coordinatorLayout.getWidth();
        switch (this.f27228a.f31305Y) {
            case 0:
                i13 = coordinatorLayout.getLeft();
                break;
            default:
                i13 = coordinatorLayout.getRight();
                break;
        }
        this.f27241n = i13;
        this.f27239l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.f27228a.f31305Y) {
                case 0:
                    i14 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i14 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i14 = 0;
        }
        this.f27242o = i14;
        int i21 = this.f27235h;
        if (i21 != 1 && i21 != 2) {
            if (i21 != 3) {
                if (i21 == 5) {
                    i19 = this.f27228a.t();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f27235h);
                }
            }
        } else {
            C3207a c3207a3 = this.f27228a;
            int i22 = c3207a3.f31305Y;
            SideSheetBehavior sideSheetBehavior2 = c3207a3.f31306Z;
            switch (i22) {
                case 0:
                    i16 = view.getRight() + sideSheetBehavior2.f27242o;
                    break;
                default:
                    i16 = view.getLeft() - sideSheetBehavior2.f27242o;
                    break;
            }
            i19 = i12 - i16;
        }
        view.offsetLeftAndRight(i19);
        if (this.f27244q == null && (i15 = this.f27245r) != -1 && (findViewById = coordinatorLayout.findViewById(i15)) != null) {
            this.f27244q = new WeakReference(findViewById);
        }
        for (Object obj : this.f27248u) {
            AbstractC2469q0.p(obj);
        }
        return true;
    }

    @Override // m1.AbstractC4544a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // m1.AbstractC4544a
    public final void m(View view, Parcelable parcelable) {
        int i10 = ((C3209c) parcelable).f31308h0;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f27235h = i10;
    }

    @Override // m1.AbstractC4544a
    public final Parcelable n(View view) {
        return new C3209c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // m1.AbstractC4544a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27235h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f27236i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f27246s) != null) {
            velocityTracker.recycle();
            this.f27246s = null;
        }
        if (this.f27246s == null) {
            this.f27246s = VelocityTracker.obtain();
        }
        this.f27246s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f27237j && s()) {
            float abs = Math.abs(this.f27247t - motionEvent.getX());
            e eVar = this.f27236i;
            if (abs > eVar.f10497b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f27237j;
    }

    public final void r(int i10) {
        View view;
        int i11;
        if (this.f27235h == i10) {
            return;
        }
        this.f27235h = i10;
        WeakReference weakReference = this.f27243p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f27235h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f27248u.iterator();
        if (!it.hasNext()) {
            u();
        } else {
            AbstractC2469q0.p(it.next());
            throw null;
        }
    }

    public final boolean s() {
        if (this.f27236i != null && (this.f27234g || this.f27235h == 1)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        r(2);
        r2.f27232e.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i10, boolean z10) {
        int i11;
        if (i10 != 3) {
            if (i10 == 5) {
                i11 = this.f27228a.t();
            } else {
                throw new IllegalArgumentException(android.gov.nist.core.a.e("Invalid state to get outer edge offset: ", i10));
            }
        } else {
            i11 = this.f27228a.s();
        }
        e eVar = this.f27236i;
        if (eVar != null) {
            if (!z10) {
                int top = view.getTop();
                eVar.f10513r = view;
                eVar.f10498c = -1;
                boolean h10 = eVar.h(i11, top, 0, 0);
                if (!h10 && eVar.f10496a == 0 && eVar.f10513r != null) {
                    eVar.f10513r = null;
                }
            }
        }
        r(i10);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f27243p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Z.i(view, 262144);
        Z.g(view, 0);
        Z.i(view, 1048576);
        Z.g(view, 0);
        if (this.f27235h != 5) {
            Z.j(view, E1.h.f4107l, new C3493k(5, this));
        }
        if (this.f27235h != 3) {
            Z.j(view, E1.h.f4105j, new C3493k(3, this));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f27232e = new l(this);
        this.f27234g = true;
        this.f27235h = 5;
        this.f27238k = 0.1f;
        this.f27245r = -1;
        this.f27248u = new LinkedHashSet();
        this.f27249v = new C3208b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13424w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f27230c = b.L0(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f27231d = j.b(context, attributeSet, 0, 2131952629).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f27245r = resourceId;
            WeakReference weakReference = this.f27244q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f27244q = null;
            WeakReference weakReference2 = this.f27243p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    if (K.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        j jVar = this.f27231d;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f27229b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f27230c;
            if (colorStateList != null) {
                this.f27229b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f27229b.setTint(typedValue.data);
            }
        }
        this.f27233f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f27234g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
