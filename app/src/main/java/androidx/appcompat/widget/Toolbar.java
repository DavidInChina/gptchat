package androidx.appcompat.widget;

import D1.AbstractC0365n;
import D1.AbstractC0367o;
import D1.H;
import D1.I;
import D1.K;
import D1.Z;
import U3.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.k;
import com.openai.chatgpt.R;
import g.RunnableC3118k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.m;
import l.AbstractC4308a;
import m.AbstractC4521a;
import m.View$OnClickListenerC4522b;
import p.o;
import p.q;
import q.AbstractC5236t0;
import q.B;
import q.C5215i0;
import q.C5222m;
import q.D;
import q.G1;
import q.View$OnClickListenerC5197c;
import q.Z0;
import q.t1;
import q.u1;
import q.v1;
import q.w1;
import q.x1;
import q.y1;
import q.z1;

/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements AbstractC0367o {

    /* renamed from: A0  reason: collision with root package name */
    public Z0 f24574A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f24575B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f24576C0;

    /* renamed from: D0  reason: collision with root package name */
    public final int f24577D0;

    /* renamed from: E0  reason: collision with root package name */
    public CharSequence f24578E0;

    /* renamed from: F0  reason: collision with root package name */
    public CharSequence f24579F0;

    /* renamed from: G0  reason: collision with root package name */
    public ColorStateList f24580G0;

    /* renamed from: H0  reason: collision with root package name */
    public ColorStateList f24581H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f24582I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f24583J0;

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f24584K0;

    /* renamed from: L0  reason: collision with root package name */
    public final ArrayList f24585L0;

    /* renamed from: M0  reason: collision with root package name */
    public final int[] f24586M0;

    /* renamed from: N0  reason: collision with root package name */
    public final u f24587N0;

    /* renamed from: O0  reason: collision with root package name */
    public ArrayList f24588O0;

    /* renamed from: P0  reason: collision with root package name */
    public final F4.a f24589P0;

    /* renamed from: Q0  reason: collision with root package name */
    public z1 f24590Q0;

    /* renamed from: R0  reason: collision with root package name */
    public C5222m f24591R0;

    /* renamed from: S0  reason: collision with root package name */
    public v1 f24592S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f24593T0;

    /* renamed from: U0  reason: collision with root package name */
    public OnBackInvokedCallback f24594U0;

    /* renamed from: V0  reason: collision with root package name */
    public OnBackInvokedDispatcher f24595V0;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f24596W0;

    /* renamed from: X0  reason: collision with root package name */
    public final RunnableC3118k f24597X0;

    /* renamed from: h0  reason: collision with root package name */
    public ActionMenuView f24598h0;

    /* renamed from: i0  reason: collision with root package name */
    public C5215i0 f24599i0;

    /* renamed from: j0  reason: collision with root package name */
    public C5215i0 f24600j0;

    /* renamed from: k0  reason: collision with root package name */
    public B f24601k0;

    /* renamed from: l0  reason: collision with root package name */
    public D f24602l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Drawable f24603m0;

    /* renamed from: n0  reason: collision with root package name */
    public final CharSequence f24604n0;

    /* renamed from: o0  reason: collision with root package name */
    public B f24605o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f24606p0;

    /* renamed from: q0  reason: collision with root package name */
    public Context f24607q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f24608r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f24609s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f24610t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f24611u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f24612v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f24613w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f24614x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f24615y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f24616z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a, q.w1, android.view.ViewGroup$MarginLayoutParams] */
    public static w1 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f43583b = 0;
        marginLayoutParams.f38727a = 8388627;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m.a, q.w1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [m.a, q.w1, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r0v5, types: [m.a, q.w1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [m.a, q.w1] */
    public static w1 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof w1) {
            w1 w1Var = (w1) layoutParams;
            ?? abstractC4521a = new AbstractC4521a((AbstractC4521a) w1Var);
            abstractC4521a.f43583b = 0;
            abstractC4521a.f43583b = w1Var.f43583b;
            return abstractC4521a;
        } else if (layoutParams instanceof AbstractC4521a) {
            ?? abstractC4521a2 = new AbstractC4521a((AbstractC4521a) layoutParams);
            abstractC4521a2.f43583b = 0;
            return abstractC4521a2;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ?? abstractC4521a3 = new AbstractC4521a(marginLayoutParams);
            abstractC4521a3.f43583b = 0;
            ((ViewGroup.MarginLayoutParams) abstractC4521a3).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) abstractC4521a3).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) abstractC4521a3).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) abstractC4521a3).bottomMargin = marginLayoutParams.bottomMargin;
            return abstractC4521a3;
        } else {
            ?? abstractC4521a4 = new AbstractC4521a(layoutParams);
            abstractC4521a4.f43583b = 0;
            return abstractC4521a4;
        }
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0365n.b(marginLayoutParams) + AbstractC0365n.c(marginLayoutParams);
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, I.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                w1 w1Var = (w1) childAt.getLayoutParams();
                if (w1Var.f43583b == 0 && u(childAt) && j(w1Var.f38727a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            w1 w1Var2 = (w1) childAt2.getLayoutParams();
            if (w1Var2.f43583b == 0 && u(childAt2) && j(w1Var2.f38727a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z10) {
        w1 w1Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            w1Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            w1Var = i(layoutParams);
        } else {
            w1Var = (w1) layoutParams;
        }
        w1Var.f43583b = 1;
        if (z10 && this.f24606p0 != null) {
            view.setLayoutParams(w1Var);
            this.f24585L0.add(view);
            return;
        }
        addView(view, w1Var);
    }

    public final void c() {
        if (this.f24605o0 == null) {
            B b10 = new B(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f24605o0 = b10;
            b10.setImageDrawable(this.f24603m0);
            this.f24605o0.setContentDescription(this.f24604n0);
            w1 h10 = h();
            h10.f38727a = (this.f24611u0 & 112) | 8388611;
            h10.f43583b = 2;
            this.f24605o0.setLayoutParams(h10);
            this.f24605o0.setOnClickListener(new View$OnClickListenerC4522b(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof w1)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q.Z0, java.lang.Object] */
    public final void d() {
        if (this.f24574A0 == null) {
            ?? obj = new Object();
            obj.f43389a = 0;
            obj.f43390b = 0;
            obj.f43391c = Integer.MIN_VALUE;
            obj.f43392d = Integer.MIN_VALUE;
            obj.f43393e = 0;
            obj.f43394f = 0;
            obj.f43395g = false;
            obj.f43396h = false;
            this.f24574A0 = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f24598h0;
        if (actionMenuView.f24513w0 == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.f24592S0 == null) {
                this.f24592S0 = new v1(this);
            }
            this.f24598h0.setExpandedActionViewsExclusive(true);
            oVar.b(this.f24592S0, this.f24607q0);
            v();
        }
    }

    public final void f() {
        if (this.f24598h0 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f24598h0 = actionMenuView;
            actionMenuView.setPopupTheme(this.f24608r0);
            this.f24598h0.setOnMenuItemClickListener(this.f24589P0);
            ActionMenuView actionMenuView2 = this.f24598h0;
            J0.a aVar = new J0.a(this);
            actionMenuView2.f24506B0 = null;
            actionMenuView2.f24507C0 = aVar;
            w1 h10 = h();
            h10.f38727a = (this.f24611u0 & 112) | 8388613;
            this.f24598h0.setLayoutParams(h10);
            b(this.f24598h0, false);
        }
    }

    public final void g() {
        if (this.f24601k0 == null) {
            this.f24601k0 = new B(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            w1 h10 = h();
            h10.f38727a = (this.f24611u0 & 112) | 8388611;
            this.f24601k0.setLayoutParams(h10);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        B b10 = this.f24605o0;
        if (b10 != null) {
            return b10.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        B b10 = this.f24605o0;
        if (b10 != null) {
            return b10.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Z0 z02 = this.f24574A0;
        if (z02 != null) {
            if (z02.f43395g) {
                return z02.f43389a;
            }
            return z02.f43390b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f24576C0;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        Z0 z02 = this.f24574A0;
        if (z02 != null) {
            return z02.f43389a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Z0 z02 = this.f24574A0;
        if (z02 != null) {
            return z02.f43390b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Z0 z02 = this.f24574A0;
        if (z02 != null) {
            if (z02.f43395g) {
                return z02.f43390b;
            }
            return z02.f43389a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f24575B0;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        o oVar;
        ActionMenuView actionMenuView = this.f24598h0;
        if (actionMenuView != null && (oVar = actionMenuView.f24513w0) != null && oVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f24576C0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f24575B0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        D d10 = this.f24602l0;
        if (d10 != null) {
            return d10.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        D d10 = this.f24602l0;
        if (d10 != null) {
            return d10.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f24598h0.getMenu();
    }

    public View getNavButtonView() {
        return this.f24601k0;
    }

    public CharSequence getNavigationContentDescription() {
        B b10 = this.f24601k0;
        if (b10 != null) {
            return b10.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        B b10 = this.f24601k0;
        if (b10 != null) {
            return b10.getDrawable();
        }
        return null;
    }

    public C5222m getOuterActionMenuPresenter() {
        return this.f24591R0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f24598h0.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f24607q0;
    }

    public int getPopupTheme() {
        return this.f24608r0;
    }

    public CharSequence getSubtitle() {
        return this.f24579F0;
    }

    public final TextView getSubtitleTextView() {
        return this.f24600j0;
    }

    public CharSequence getTitle() {
        return this.f24578E0;
    }

    public int getTitleMarginBottom() {
        return this.f24616z0;
    }

    public int getTitleMarginEnd() {
        return this.f24614x0;
    }

    public int getTitleMarginStart() {
        return this.f24613w0;
    }

    public int getTitleMarginTop() {
        return this.f24615y0;
    }

    public final TextView getTitleTextView() {
        return this.f24599i0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q.z1, java.lang.Object] */
    public AbstractC5236t0 getWrapper() {
        boolean z10;
        Drawable drawable;
        if (this.f24590Q0 == null) {
            ?? obj = new Object();
            obj.f43611n = 0;
            obj.f43598a = this;
            obj.f43605h = getTitle();
            obj.f43606i = getSubtitle();
            if (obj.f43605h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj.f43604g = z10;
            obj.f43603f = getNavigationIcon();
            String str = null;
            u I10 = u.I(getContext(), null, AbstractC4308a.f37664a, R.attr.actionBarStyle, 0);
            obj.f43612o = I10.t(15);
            CharSequence C10 = I10.C(27);
            if (!TextUtils.isEmpty(C10)) {
                obj.f43604g = true;
                obj.f43605h = C10;
                if ((obj.f43599b & 8) != 0) {
                    Toolbar toolbar = obj.f43598a;
                    toolbar.setTitle(C10);
                    if (obj.f43604g) {
                        Z.m(toolbar.getRootView(), C10);
                    }
                }
            }
            CharSequence C11 = I10.C(25);
            if (!TextUtils.isEmpty(C11)) {
                obj.f43606i = C11;
                if ((obj.f43599b & 8) != 0) {
                    setSubtitle(C11);
                }
            }
            Drawable t10 = I10.t(20);
            if (t10 != null) {
                obj.f43602e = t10;
                obj.c();
            }
            Drawable t11 = I10.t(17);
            if (t11 != null) {
                obj.f43601d = t11;
                obj.c();
            }
            if (obj.f43603f == null && (drawable = obj.f43612o) != null) {
                obj.f43603f = drawable;
                int i10 = obj.f43599b & 4;
                Toolbar toolbar2 = obj.f43598a;
                if (i10 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(I10.x(10, 0));
            int z11 = I10.z(9, 0);
            if (z11 != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(z11, (ViewGroup) this, false);
                View view = obj.f43600c;
                if (view != null && (obj.f43599b & 16) != 0) {
                    removeView(view);
                }
                obj.f43600c = inflate;
                if (inflate != null && (obj.f43599b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f43599b | 16);
            }
            int layoutDimension = ((TypedArray) I10.f17493h0).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int r10 = I10.r(7, -1);
            int r11 = I10.r(3, -1);
            if (r10 >= 0 || r11 >= 0) {
                int max = Math.max(r10, 0);
                int max2 = Math.max(r11, 0);
                d();
                this.f24574A0.a(max, max2);
            }
            int z12 = I10.z(28, 0);
            if (z12 != 0) {
                Context context = getContext();
                this.f24609s0 = z12;
                C5215i0 c5215i0 = this.f24599i0;
                if (c5215i0 != null) {
                    c5215i0.setTextAppearance(context, z12);
                }
            }
            int z13 = I10.z(26, 0);
            if (z13 != 0) {
                Context context2 = getContext();
                this.f24610t0 = z13;
                C5215i0 c5215i02 = this.f24600j0;
                if (c5215i02 != null) {
                    c5215i02.setTextAppearance(context2, z13);
                }
            }
            int z14 = I10.z(22, 0);
            if (z14 != 0) {
                setPopupTheme(z14);
            }
            I10.N();
            if (R.string.abc_action_bar_up_description != obj.f43611n) {
                obj.f43611n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i11 = obj.f43611n;
                    if (i11 != 0) {
                        str = getContext().getString(i11);
                    }
                    obj.f43607j = str;
                    obj.b();
                }
            }
            obj.f43607j = getNavigationContentDescription();
            setNavigationOnClickListener(new View$OnClickListenerC5197c(obj));
            this.f24590Q0 = obj;
        }
        return this.f24590Q0;
    }

    public final int j(int i10) {
        WeakHashMap weakHashMap = Z.f3247a;
        int d10 = I.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d10) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (d10 != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    public final int k(View view, int i10) {
        int i11;
        w1 w1Var = (w1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = w1Var.f38727a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f24577D0 & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) w1Var).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) w1Var).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) w1Var).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void n(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void o() {
        Iterator it = this.f24588O0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f24587N0.f17493h0).iterator();
        while (it2.hasNext()) {
            ((V1.D) it2.next()).f18020a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f24588O0 = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f24597X0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f24583J0 = false;
        }
        if (!this.f24583J0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f24583J0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f24583J0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0293 A[LOOP:0: B:103:0x0291->B:104:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02af A[LOOP:1: B:106:0x02ad->B:107:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ce A[LOOP:2: B:109:0x02cc->B:110:0x02ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031c A[LOOP:3: B:117:0x031a->B:118:0x031c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        boolean u10;
        boolean u11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int size;
        int i22;
        int i23;
        int size2;
        int i24;
        int size3;
        int i25;
        int i26;
        int i27;
        int size4;
        C5215i0 c5215i0;
        C5215i0 c5215i02;
        boolean z12;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i36 = width - paddingRight;
        int[] iArr = this.f24586M0;
        iArr[1] = 0;
        iArr[0] = 0;
        int d10 = H.d(this);
        if (d10 >= 0) {
            i14 = Math.min(d10, i13 - i11);
        } else {
            i14 = 0;
        }
        if (u(this.f24601k0)) {
            if (z11) {
                i15 = r(this.f24601k0, i36, i14, iArr);
                i16 = paddingLeft;
                if (u(this.f24605o0)) {
                    if (z11) {
                        i15 = r(this.f24605o0, i15, i14, iArr);
                    } else {
                        i16 = q(this.f24605o0, i16, i14, iArr);
                    }
                }
                if (u(this.f24598h0)) {
                    if (z11) {
                        i16 = q(this.f24598h0, i16, i14, iArr);
                    } else {
                        i15 = r(this.f24598h0, i15, i14, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i16);
                iArr[1] = Math.max(0, currentContentInsetRight - (i36 - i15));
                int max = Math.max(i16, currentContentInsetLeft);
                int min = Math.min(i15, i36 - currentContentInsetRight);
                if (u(this.f24606p0)) {
                    if (z11) {
                        min = r(this.f24606p0, min, i14, iArr);
                    } else {
                        max = q(this.f24606p0, max, i14, iArr);
                    }
                }
                if (u(this.f24602l0)) {
                    if (z11) {
                        min = r(this.f24602l0, min, i14, iArr);
                    } else {
                        max = q(this.f24602l0, max, i14, iArr);
                    }
                }
                u10 = u(this.f24599i0);
                u11 = u(this.f24600j0);
                if (!u10) {
                    w1 w1Var = (w1) this.f24599i0.getLayoutParams();
                    i17 = paddingRight;
                    i18 = ((ViewGroup.MarginLayoutParams) w1Var).bottomMargin + this.f24599i0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w1Var).topMargin;
                } else {
                    i17 = paddingRight;
                    i18 = 0;
                }
                if (!u11) {
                    w1 w1Var2 = (w1) this.f24600j0.getLayoutParams();
                    i19 = width;
                    i18 += this.f24600j0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w1Var2).topMargin + ((ViewGroup.MarginLayoutParams) w1Var2).bottomMargin;
                } else {
                    i19 = width;
                }
                if (u10 && !u11) {
                    i21 = paddingLeft;
                    i20 = i14;
                } else {
                    if (!u10) {
                        c5215i0 = this.f24599i0;
                    } else {
                        c5215i0 = this.f24600j0;
                    }
                    if (!u11) {
                        c5215i02 = this.f24600j0;
                    } else {
                        c5215i02 = this.f24599i0;
                    }
                    w1 w1Var3 = (w1) c5215i0.getLayoutParams();
                    w1 w1Var4 = (w1) c5215i02.getLayoutParams();
                    if ((!u10 && this.f24599i0.getMeasuredWidth() > 0) || (u11 && this.f24600j0.getMeasuredWidth() > 0)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i28 = this.f24577D0 & 112;
                    i21 = paddingLeft;
                    if (i28 == 48) {
                        if (i28 != 80) {
                            int i37 = (((height - paddingTop) - paddingBottom) - i18) / 2;
                            i20 = i14;
                            int i38 = ((ViewGroup.MarginLayoutParams) w1Var3).topMargin + this.f24615y0;
                            if (i37 < i38) {
                                i37 = i38;
                            } else {
                                int i39 = (((height - paddingBottom) - i18) - i37) - paddingTop;
                                int i40 = ((ViewGroup.MarginLayoutParams) w1Var3).bottomMargin;
                                int i41 = this.f24616z0;
                                if (i39 < i40 + i41) {
                                    i37 = Math.max(0, i37 - ((((ViewGroup.MarginLayoutParams) w1Var4).bottomMargin + i41) - i39));
                                }
                            }
                            i29 = paddingTop + i37;
                        } else {
                            i20 = i14;
                            i29 = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) w1Var4).bottomMargin) - this.f24616z0) - i18;
                        }
                    } else {
                        i20 = i14;
                        i29 = getPaddingTop() + ((ViewGroup.MarginLayoutParams) w1Var3).topMargin + this.f24615y0;
                    }
                    if (!z11) {
                        if (z12) {
                            i33 = this.f24613w0;
                        } else {
                            i33 = 0;
                        }
                        int i42 = i33 - iArr[1];
                        min -= Math.max(0, i42);
                        iArr[1] = Math.max(0, -i42);
                        if (u10) {
                            int measuredWidth = min - this.f24599i0.getMeasuredWidth();
                            int measuredHeight = this.f24599i0.getMeasuredHeight() + i29;
                            this.f24599i0.layout(measuredWidth, i29, min, measuredHeight);
                            i34 = measuredWidth - this.f24614x0;
                            i29 = measuredHeight + ((ViewGroup.MarginLayoutParams) ((w1) this.f24599i0.getLayoutParams())).bottomMargin;
                        } else {
                            i34 = min;
                        }
                        if (u11) {
                            int i43 = i29 + ((ViewGroup.MarginLayoutParams) ((w1) this.f24600j0.getLayoutParams())).topMargin;
                            this.f24600j0.layout(min - this.f24600j0.getMeasuredWidth(), i43, min, this.f24600j0.getMeasuredHeight() + i43);
                            i35 = min - this.f24614x0;
                        } else {
                            i35 = min;
                        }
                        if (z12) {
                            min = Math.min(i34, i35);
                        }
                    } else {
                        if (z12) {
                            i30 = this.f24613w0;
                        } else {
                            i30 = 0;
                        }
                        int i44 = i30 - iArr[0];
                        max += Math.max(0, i44);
                        iArr[0] = Math.max(0, -i44);
                        if (u10) {
                            int measuredWidth2 = this.f24599i0.getMeasuredWidth() + max;
                            int measuredHeight2 = this.f24599i0.getMeasuredHeight() + i29;
                            this.f24599i0.layout(max, i29, measuredWidth2, measuredHeight2);
                            i31 = measuredWidth2 + this.f24614x0;
                            i29 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((w1) this.f24599i0.getLayoutParams())).bottomMargin;
                        } else {
                            i31 = max;
                        }
                        if (u11) {
                            int i45 = i29 + ((ViewGroup.MarginLayoutParams) ((w1) this.f24600j0.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f24600j0.getMeasuredWidth() + max;
                            this.f24600j0.layout(max, i45, measuredWidth3, this.f24600j0.getMeasuredHeight() + i45);
                            i32 = measuredWidth3 + this.f24614x0;
                        } else {
                            i32 = max;
                        }
                        if (z12) {
                            max = Math.max(i31, i32);
                        }
                    }
                }
                ArrayList arrayList = this.f24584K0;
                a(3, arrayList);
                size = arrayList.size();
                i22 = max;
                for (i23 = 0; i23 < size; i23++) {
                    i22 = q((View) arrayList.get(i23), i22, i20, iArr);
                }
                int i46 = i20;
                a(5, arrayList);
                size2 = arrayList.size();
                for (i24 = 0; i24 < size2; i24++) {
                    min = r((View) arrayList.get(i24), min, i46, iArr);
                }
                a(1, arrayList);
                int i47 = iArr[0];
                int i48 = iArr[1];
                size3 = arrayList.size();
                int i49 = i47;
                i25 = 0;
                int i50 = 0;
                while (i25 < size3) {
                    View view = (View) arrayList.get(i25);
                    w1 w1Var5 = (w1) view.getLayoutParams();
                    int i51 = ((ViewGroup.MarginLayoutParams) w1Var5).leftMargin - i49;
                    int i52 = ((ViewGroup.MarginLayoutParams) w1Var5).rightMargin - i48;
                    int max2 = Math.max(0, i51);
                    int max3 = Math.max(0, i52);
                    int max4 = Math.max(0, -i51);
                    int max5 = Math.max(0, -i52);
                    i50 += view.getMeasuredWidth() + max2 + max3;
                    i25++;
                    i48 = max5;
                    i49 = max4;
                }
                i27 = ((((i19 - i21) - i17) / 2) + i21) - (i50 / 2);
                int i53 = i50 + i27;
                if (i27 >= i22) {
                    if (i53 > min) {
                        i22 = i27 - (i53 - min);
                    } else {
                        i22 = i27;
                    }
                }
                size4 = arrayList.size();
                for (i26 = 0; i26 < size4; i26++) {
                    i22 = q((View) arrayList.get(i26), i22, i46, iArr);
                }
                arrayList.clear();
            }
            i16 = q(this.f24601k0, paddingLeft, i14, iArr);
        } else {
            i16 = paddingLeft;
        }
        i15 = i36;
        if (u(this.f24605o0)) {
        }
        if (u(this.f24598h0)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i16);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i36 - i15));
        int max6 = Math.max(i16, currentContentInsetLeft2);
        int min2 = Math.min(i15, i36 - currentContentInsetRight2);
        if (u(this.f24606p0)) {
        }
        if (u(this.f24602l0)) {
        }
        u10 = u(this.f24599i0);
        u11 = u(this.f24600j0);
        if (!u10) {
        }
        if (!u11) {
        }
        if (u10) {
        }
        if (!u10) {
        }
        if (!u11) {
        }
        w1 w1Var32 = (w1) c5215i0.getLayoutParams();
        w1 w1Var42 = (w1) c5215i02.getLayoutParams();
        if (!u10) {
        }
        z12 = false;
        i28 = this.f24577D0 & 112;
        i21 = paddingLeft;
        if (i28 == 48) {
        }
        if (!z11) {
        }
        ArrayList arrayList2 = this.f24584K0;
        a(3, arrayList2);
        size = arrayList2.size();
        i22 = max6;
        while (i23 < size) {
        }
        int i462 = i20;
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i24 < size2) {
        }
        a(1, arrayList2);
        int i472 = iArr[0];
        int i482 = iArr[1];
        size3 = arrayList2.size();
        int i492 = i472;
        i25 = 0;
        int i502 = 0;
        while (i25 < size3) {
        }
        i27 = ((((i19 - i21) - i17) / 2) + i21) - (i502 / 2);
        int i532 = i502 + i27;
        if (i27 >= i22) {
        }
        size4 = arrayList2.size();
        while (i26 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean a5 = G1.a(this);
        int i19 = !a5 ? 1 : 0;
        int i20 = 0;
        if (u(this.f24601k0)) {
            t(this.f24601k0, i10, 0, i11, this.f24612v0);
            i14 = l(this.f24601k0) + this.f24601k0.getMeasuredWidth();
            i13 = Math.max(0, m(this.f24601k0) + this.f24601k0.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.f24601k0.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (u(this.f24605o0)) {
            t(this.f24605o0, i10, 0, i11, this.f24612v0);
            i14 = l(this.f24605o0) + this.f24605o0.getMeasuredWidth();
            i13 = Math.max(i13, m(this.f24605o0) + this.f24605o0.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f24605o0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14);
        int max2 = Math.max(0, currentContentInsetStart - i14);
        int[] iArr = this.f24586M0;
        iArr[a5 ? 1 : 0] = max2;
        if (u(this.f24598h0)) {
            t(this.f24598h0, i10, max, i11, this.f24612v0);
            i15 = l(this.f24598h0) + this.f24598h0.getMeasuredWidth();
            i13 = Math.max(i13, m(this.f24598h0) + this.f24598h0.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f24598h0.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (u(this.f24606p0)) {
            max3 += s(this.f24606p0, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, m(this.f24606p0) + this.f24606p0.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f24606p0.getMeasuredState());
        }
        if (u(this.f24602l0)) {
            max3 += s(this.f24602l0, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, m(this.f24602l0) + this.f24602l0.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f24602l0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((w1) childAt.getLayoutParams()).f43583b == 0 && u(childAt)) {
                max3 += s(childAt, i10, max3, i11, 0, iArr);
                i13 = Math.max(i13, m(childAt) + childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i22 = this.f24615y0 + this.f24616z0;
        int i23 = this.f24613w0 + this.f24614x0;
        if (u(this.f24599i0)) {
            s(this.f24599i0, i10, max3 + i23, i11, i22, iArr);
            int l10 = l(this.f24599i0) + this.f24599i0.getMeasuredWidth();
            i16 = m(this.f24599i0) + this.f24599i0.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i12, this.f24599i0.getMeasuredState());
            i17 = l10;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (u(this.f24600j0)) {
            i17 = Math.max(i17, s(this.f24600j0, i10, max3 + i23, i11, i16 + i22, iArr));
            i16 += m(this.f24600j0) + this.f24600j0.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i18, this.f24600j0.getMeasuredState());
        }
        int max4 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i17, getSuggestedMinimumWidth()), i10, (-16777216) & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (this.f24593T0) {
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt2 = getChildAt(i24);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i20);
        }
        i20 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i20);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        o oVar;
        MenuItem findItem;
        if (!(parcelable instanceof y1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y1 y1Var = (y1) parcelable;
        super.onRestoreInstanceState(y1Var.f9325Y);
        ActionMenuView actionMenuView = this.f24598h0;
        if (actionMenuView != null) {
            oVar = actionMenuView.f24513w0;
        } else {
            oVar = null;
        }
        int i10 = y1Var.f43589h0;
        if (i10 != 0 && this.f24592S0 != null && oVar != null && (findItem = oVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (y1Var.f43590i0) {
            RunnableC3118k runnableC3118k = this.f24597X0;
            removeCallbacks(runnableC3118k);
            post(runnableC3118k);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        Z0 z02 = this.f24574A0;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != z02.f43395g) {
            z02.f43395g = z10;
            if (z02.f43396h) {
                if (z10) {
                    int i11 = z02.f43392d;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = z02.f43393e;
                    }
                    z02.f43389a = i11;
                    int i12 = z02.f43391c;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = z02.f43394f;
                    }
                    z02.f43390b = i12;
                    return;
                }
                int i13 = z02.f43391c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = z02.f43393e;
                }
                z02.f43389a = i13;
                int i14 = z02.f43392d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = z02.f43394f;
                }
                z02.f43390b = i14;
                return;
            }
            z02.f43389a = z02.f43393e;
            z02.f43390b = z02.f43394f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.y1, android.os.Parcelable, K1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        C5222m c5222m;
        q qVar;
        ?? bVar = new K1.b(super.onSaveInstanceState());
        v1 v1Var = this.f24592S0;
        if (v1Var != null && (qVar = v1Var.f43571Z) != null) {
            bVar.f43589h0 = qVar.f41635a;
        }
        ActionMenuView actionMenuView = this.f24598h0;
        if (actionMenuView != null && (c5222m = actionMenuView.f24505A0) != null && c5222m.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.f43590i0 = z10;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f24582I0 = false;
        }
        if (!this.f24582I0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f24582I0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f24582I0 = false;
        }
        return true;
    }

    public final boolean p(View view) {
        if (view.getParent() != this && !this.f24585L0.contains(view)) {
            return false;
        }
        return true;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        w1 w1Var = (w1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) w1Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int k10 = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k10, max + measuredWidth, view.getMeasuredHeight() + k10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) w1Var).rightMargin + max;
    }

    public final int r(View view, int i10, int i11, int[] iArr) {
        w1 w1Var = (w1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) w1Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int k10 = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k10, max, view.getMeasuredHeight() + k10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) w1Var).leftMargin);
    }

    public final int s(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f24596W0 != z10) {
            this.f24596W0 = z10;
            v();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(m.u(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f24593T0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f24576C0) {
            this.f24576C0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f24575B0) {
            this.f24575B0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(m.u(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(m.u(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f24601k0.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f24598h0.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f24608r0 != i10) {
            this.f24608r0 = i10;
            if (i10 == 0) {
                this.f24607q0 = getContext();
            } else {
                this.f24607q0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f24616z0 = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f24614x0 = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f24613w0 = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f24615y0 = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r4.f24596W0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a5 = u1.a(this);
            v1 v1Var = this.f24592S0;
            boolean z11 = true;
            if (v1Var != null && v1Var.f43571Z != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && a5 != null) {
                WeakHashMap weakHashMap = Z.f3247a;
                if (K.b(this)) {
                }
            }
            z11 = false;
            if (z11 && this.f24595V0 == null) {
                if (this.f24594U0 == null) {
                    this.f24594U0 = u1.b(new t1(this, 0));
                }
                u1.c(a5, this.f24594U0);
                this.f24595V0 = a5;
            } else if (!z11 && (onBackInvokedDispatcher = this.f24595V0) != null) {
                u1.d(onBackInvokedDispatcher, this.f24594U0);
                this.f24595V0 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f24577D0 = 8388627;
        this.f24584K0 = new ArrayList();
        this.f24585L0 = new ArrayList();
        this.f24586M0 = new int[2];
        this.f24587N0 = new u(new t1(this, 1));
        this.f24588O0 = new ArrayList();
        this.f24589P0 = new F4.a(5, this);
        this.f24597X0 = new RunnableC3118k(3, this);
        Context context2 = getContext();
        int[] iArr = AbstractC4308a.f37687x;
        u I10 = u.I(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        Z.k(this, context, iArr, attributeSet, (TypedArray) I10.f17493h0, R.attr.toolbarStyle);
        this.f24609s0 = I10.z(28, 0);
        this.f24610t0 = I10.z(19, 0);
        this.f24577D0 = ((TypedArray) I10.f17493h0).getInteger(0, 8388627);
        this.f24611u0 = ((TypedArray) I10.f17493h0).getInteger(2, 48);
        int r10 = I10.r(22, 0);
        r10 = I10.E(27) ? I10.r(27, r10) : r10;
        this.f24616z0 = r10;
        this.f24615y0 = r10;
        this.f24614x0 = r10;
        this.f24613w0 = r10;
        int r11 = I10.r(25, -1);
        if (r11 >= 0) {
            this.f24613w0 = r11;
        }
        int r12 = I10.r(24, -1);
        if (r12 >= 0) {
            this.f24614x0 = r12;
        }
        int r13 = I10.r(26, -1);
        if (r13 >= 0) {
            this.f24615y0 = r13;
        }
        int r14 = I10.r(23, -1);
        if (r14 >= 0) {
            this.f24616z0 = r14;
        }
        this.f24612v0 = I10.s(13, -1);
        int r15 = I10.r(9, Integer.MIN_VALUE);
        int r16 = I10.r(5, Integer.MIN_VALUE);
        int s10 = I10.s(7, 0);
        int s11 = I10.s(8, 0);
        d();
        Z0 z02 = this.f24574A0;
        z02.f43396h = false;
        if (s10 != Integer.MIN_VALUE) {
            z02.f43393e = s10;
            z02.f43389a = s10;
        }
        if (s11 != Integer.MIN_VALUE) {
            z02.f43394f = s11;
            z02.f43390b = s11;
        }
        if (r15 != Integer.MIN_VALUE || r16 != Integer.MIN_VALUE) {
            z02.a(r15, r16);
        }
        this.f24575B0 = I10.r(10, Integer.MIN_VALUE);
        this.f24576C0 = I10.r(6, Integer.MIN_VALUE);
        this.f24603m0 = I10.t(4);
        this.f24604n0 = I10.C(3);
        CharSequence C10 = I10.C(21);
        if (!TextUtils.isEmpty(C10)) {
            setTitle(C10);
        }
        CharSequence C11 = I10.C(18);
        if (!TextUtils.isEmpty(C11)) {
            setSubtitle(C11);
        }
        this.f24607q0 = getContext();
        setPopupTheme(I10.z(17, 0));
        Drawable t10 = I10.t(16);
        if (t10 != null) {
            setNavigationIcon(t10);
        }
        CharSequence C12 = I10.C(15);
        if (!TextUtils.isEmpty(C12)) {
            setNavigationContentDescription(C12);
        }
        Drawable t11 = I10.t(11);
        if (t11 != null) {
            setLogo(t11);
        }
        CharSequence C13 = I10.C(12);
        if (!TextUtils.isEmpty(C13)) {
            setLogoDescription(C13);
        }
        if (I10.E(29)) {
            setTitleTextColor(I10.p(29));
        }
        if (I10.E(20)) {
            setSubtitleTextColor(I10.p(20));
        }
        if (I10.E(14)) {
            n(I10.z(14, 0));
        }
        I10.N();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a, q.w1, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f38727a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37665b);
        marginLayoutParams.f38727a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f43583b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        B b10 = this.f24605o0;
        if (b10 != null) {
            b10.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f24605o0.setImageDrawable(drawable);
            return;
        }
        B b10 = this.f24605o0;
        if (b10 == null) {
            return;
        }
        b10.setImageDrawable(this.f24603m0);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f24602l0 == null) {
                this.f24602l0 = new D(getContext(), null, 0);
            }
            if (!p(this.f24602l0)) {
                b(this.f24602l0, true);
            }
        } else {
            D d10 = this.f24602l0;
            if (d10 != null && p(d10)) {
                removeView(this.f24602l0);
                this.f24585L0.remove(this.f24602l0);
            }
        }
        D d11 = this.f24602l0;
        if (d11 != null) {
            d11.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f24602l0 == null) {
            this.f24602l0 = new D(getContext(), null, 0);
        }
        D d10 = this.f24602l0;
        if (d10 != null) {
            d10.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        B b10 = this.f24601k0;
        if (b10 != null) {
            b10.setContentDescription(charSequence);
            m.I(this.f24601k0, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f24601k0)) {
                b(this.f24601k0, true);
            }
        } else {
            B b10 = this.f24601k0;
            if (b10 != null && p(b10)) {
                removeView(this.f24601k0);
                this.f24585L0.remove(this.f24601k0);
            }
        }
        B b11 = this.f24601k0;
        if (b11 != null) {
            b11.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f24600j0 == null) {
                Context context = getContext();
                C5215i0 c5215i0 = new C5215i0(context, null);
                this.f24600j0 = c5215i0;
                c5215i0.setSingleLine();
                this.f24600j0.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f24610t0;
                if (i10 != 0) {
                    this.f24600j0.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f24581H0;
                if (colorStateList != null) {
                    this.f24600j0.setTextColor(colorStateList);
                }
            }
            if (!p(this.f24600j0)) {
                b(this.f24600j0, true);
            }
        } else {
            C5215i0 c5215i02 = this.f24600j0;
            if (c5215i02 != null && p(c5215i02)) {
                removeView(this.f24600j0);
                this.f24585L0.remove(this.f24600j0);
            }
        }
        C5215i0 c5215i03 = this.f24600j0;
        if (c5215i03 != null) {
            c5215i03.setText(charSequence);
        }
        this.f24579F0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f24581H0 = colorStateList;
        C5215i0 c5215i0 = this.f24600j0;
        if (c5215i0 != null) {
            c5215i0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f24599i0 == null) {
                Context context = getContext();
                C5215i0 c5215i0 = new C5215i0(context, null);
                this.f24599i0 = c5215i0;
                c5215i0.setSingleLine();
                this.f24599i0.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f24609s0;
                if (i10 != 0) {
                    this.f24599i0.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f24580G0;
                if (colorStateList != null) {
                    this.f24599i0.setTextColor(colorStateList);
                }
            }
            if (!p(this.f24599i0)) {
                b(this.f24599i0, true);
            }
        } else {
            C5215i0 c5215i02 = this.f24599i0;
            if (c5215i02 != null && p(c5215i02)) {
                removeView(this.f24599i0);
                this.f24585L0.remove(this.f24599i0);
            }
        }
        C5215i0 c5215i03 = this.f24599i0;
        if (c5215i03 != null) {
            c5215i03.setText(charSequence);
        }
        this.f24578E0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f24580G0 = colorStateList;
        C5215i0 c5215i0 = this.f24599i0;
        if (c5215i0 != null) {
            c5215i0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(x1 x1Var) {
    }
}
