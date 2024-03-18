package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public class N0 implements p.G {

    /* renamed from: F0  reason: collision with root package name */
    public static final Method f43313F0;

    /* renamed from: G0  reason: collision with root package name */
    public static final Method f43314G0;

    /* renamed from: H0  reason: collision with root package name */
    public static final Method f43315H0;

    /* renamed from: A0  reason: collision with root package name */
    public final Handler f43316A0;

    /* renamed from: C0  reason: collision with root package name */
    public Rect f43318C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f43319D0;

    /* renamed from: E0  reason: collision with root package name */
    public final F f43320E0;

    /* renamed from: Y  reason: collision with root package name */
    public final Context f43321Y;

    /* renamed from: Z  reason: collision with root package name */
    public ListAdapter f43322Z;

    /* renamed from: h0  reason: collision with root package name */
    public A0 f43323h0;

    /* renamed from: k0  reason: collision with root package name */
    public int f43326k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f43327l0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f43329n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f43330o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f43331p0;

    /* renamed from: s0  reason: collision with root package name */
    public K0 f43334s0;

    /* renamed from: t0  reason: collision with root package name */
    public View f43335t0;

    /* renamed from: u0  reason: collision with root package name */
    public AdapterView.OnItemClickListener f43336u0;

    /* renamed from: v0  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f43337v0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f43324i0 = -2;

    /* renamed from: j0  reason: collision with root package name */
    public int f43325j0 = -2;

    /* renamed from: m0  reason: collision with root package name */
    public final int f43328m0 = 1002;

    /* renamed from: q0  reason: collision with root package name */
    public int f43332q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f43333r0 = Integer.MAX_VALUE;

    /* renamed from: w0  reason: collision with root package name */
    public final G0 f43338w0 = new G0(this, 2);

    /* renamed from: x0  reason: collision with root package name */
    public final M0 f43339x0 = new M0(this);

    /* renamed from: y0  reason: collision with root package name */
    public final L0 f43340y0 = new L0(this);

    /* renamed from: z0  reason: collision with root package name */
    public final G0 f43341z0 = new G0(this, 1);

    /* renamed from: B0  reason: collision with root package name */
    public final Rect f43317B0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f43313F0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f43315H0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f43314G0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [q.F, android.widget.PopupWindow] */
    public N0(Context context, AttributeSet attributeSet, int i10, int i11) {
        Drawable drawable;
        int resourceId;
        this.f43321Y = context;
        this.f43316A0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37678o, i10, i11);
        this.f43326k0 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f43327l0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f43329n0 = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37682s, i10, i11);
        if (obtainStyledAttributes2.hasValue(2)) {
            H1.n.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = kotlin.jvm.internal.m.u(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f43320E0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // p.G
    public final boolean a() {
        return this.f43320E0.isShowing();
    }

    public final int b() {
        return this.f43326k0;
    }

    public final void c(int i10) {
        this.f43326k0 = i10;
    }

    @Override // p.G
    public final void dismiss() {
        F f6 = this.f43320E0;
        f6.dismiss();
        f6.setContentView(null);
        this.f43323h0 = null;
        this.f43316A0.removeCallbacks(this.f43338w0);
    }

    public final Drawable e() {
        return this.f43320E0.getBackground();
    }

    @Override // p.G
    public final void f() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        A0 a02;
        int i13;
        int i14;
        int i15;
        int i16;
        A0 a03 = this.f43323h0;
        F f6 = this.f43320E0;
        Context context = this.f43321Y;
        int i17 = 0;
        if (a03 == null) {
            A0 p10 = p(context, !this.f43319D0);
            this.f43323h0 = p10;
            p10.setAdapter(this.f43322Z);
            this.f43323h0.setOnItemClickListener(this.f43336u0);
            this.f43323h0.setFocusable(true);
            this.f43323h0.setFocusableInTouchMode(true);
            this.f43323h0.setOnItemSelectedListener(new H0(0, this));
            this.f43323h0.setOnScrollListener(this.f43340y0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f43337v0;
            if (onItemSelectedListener != null) {
                this.f43323h0.setOnItemSelectedListener(onItemSelectedListener);
            }
            f6.setContentView(this.f43323h0);
        } else {
            ViewGroup viewGroup = (ViewGroup) f6.getContentView();
        }
        Drawable background = f6.getBackground();
        Rect rect = this.f43317B0;
        if (background != null) {
            background.getPadding(rect);
            int i18 = rect.top;
            i10 = rect.bottom + i18;
            if (!this.f43329n0) {
                this.f43327l0 = -i18;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (f6.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.f43335t0;
        int i19 = this.f43327l0;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f43314G0;
            if (method != null) {
                try {
                    i11 = ((Integer) method.invoke(f6, view, Integer.valueOf(i19), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i11 = f6.getMaxAvailableHeight(view, i19);
        } else {
            i11 = I0.a(f6, view, i19, z10);
        }
        int i20 = this.f43324i0;
        if (i20 == -1) {
            i12 = i11 + i10;
        } else {
            int i21 = this.f43325j0;
            if (i21 != -2) {
                if (i21 != -1) {
                    i15 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                } else {
                    i15 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                i15 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a5 = this.f43323h0.a(i15, i11);
            if (a5 > 0) {
                i16 = this.f43323h0.getPaddingBottom() + this.f43323h0.getPaddingTop() + i10;
            } else {
                i16 = 0;
            }
            i12 = a5 + i16;
        }
        if (this.f43320E0.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        H1.n.d(f6, this.f43328m0);
        if (f6.isShowing()) {
            View view2 = this.f43335t0;
            WeakHashMap weakHashMap = D1.Z.f3247a;
            if (!D1.K.b(view2)) {
                return;
            }
            int i22 = this.f43325j0;
            if (i22 == -1) {
                i22 = -1;
            } else if (i22 == -2) {
                i22 = this.f43335t0.getWidth();
            }
            if (i20 == -1) {
                if (z11) {
                    i20 = i12;
                } else {
                    i20 = -1;
                }
                if (z11) {
                    if (this.f43325j0 == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    f6.setWidth(i14);
                    f6.setHeight(0);
                } else {
                    if (this.f43325j0 == -1) {
                        i17 = -1;
                    }
                    f6.setWidth(i17);
                    f6.setHeight(-1);
                }
            } else if (i20 == -2) {
                i20 = i12;
            }
            f6.setOutsideTouchable(true);
            View view3 = this.f43335t0;
            int i23 = this.f43326k0;
            int i24 = this.f43327l0;
            if (i22 < 0) {
                i22 = -1;
            }
            if (i20 < 0) {
                i13 = -1;
            } else {
                i13 = i20;
            }
            f6.update(view3, i23, i24, i22, i13);
            return;
        }
        int i25 = this.f43325j0;
        if (i25 == -1) {
            i25 = -1;
        } else if (i25 == -2) {
            i25 = this.f43335t0.getWidth();
        }
        if (i20 == -1) {
            i20 = -1;
        } else if (i20 == -2) {
            i20 = i12;
        }
        f6.setWidth(i25);
        f6.setHeight(i20);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f43313F0;
            if (method2 != null) {
                try {
                    method2.invoke(f6, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            J0.b(f6, true);
        }
        f6.setOutsideTouchable(true);
        f6.setTouchInterceptor(this.f43339x0);
        if (this.f43331p0) {
            H1.n.c(f6, this.f43330o0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f43315H0;
            if (method3 != null) {
                try {
                    method3.invoke(f6, this.f43318C0);
                } catch (Exception e10) {
                    AbstractC3612c.d("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            J0.a(f6, this.f43318C0);
        }
        H1.m.a(f6, this.f43335t0, this.f43326k0, this.f43327l0, this.f43332q0);
        this.f43323h0.setSelection(-1);
        if ((!this.f43319D0 || this.f43323h0.isInTouchMode()) && (a02 = this.f43323h0) != null) {
            a02.setListSelectionHidden(true);
            a02.requestLayout();
        }
        if (!this.f43319D0) {
            this.f43316A0.post(this.f43341z0);
        }
    }

    @Override // p.G
    public final A0 h() {
        return this.f43323h0;
    }

    public final void j(Drawable drawable) {
        this.f43320E0.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
        this.f43327l0 = i10;
        this.f43329n0 = true;
    }

    public final int n() {
        if (!this.f43329n0) {
            return 0;
        }
        return this.f43327l0;
    }

    public void o(ListAdapter listAdapter) {
        K0 k02 = this.f43334s0;
        if (k02 == null) {
            this.f43334s0 = new K0(0, this);
        } else {
            ListAdapter listAdapter2 = this.f43322Z;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(k02);
            }
        }
        this.f43322Z = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f43334s0);
        }
        A0 a02 = this.f43323h0;
        if (a02 != null) {
            a02.setAdapter(this.f43322Z);
        }
    }

    public A0 p(Context context, boolean z10) {
        return new A0(context, z10);
    }

    public final void q(int i10) {
        Drawable background = this.f43320E0.getBackground();
        if (background != null) {
            Rect rect = this.f43317B0;
            background.getPadding(rect);
            this.f43325j0 = rect.left + rect.right + i10;
            return;
        }
        this.f43325j0 = i10;
    }
}
