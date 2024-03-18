package androidx.appcompat.widget;

import D1.A0;
import D1.AbstractC0372s;
import D1.C0373t;
import D1.H;
import D1.H0;
import D1.J0;
import D1.L;
import D1.N;
import D1.Z;
import D1.r;
import D1.x0;
import D1.y0;
import D1.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.m;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import m.C4538s;
import m.W;
import p.o;
import q.AbstractC5206f;
import q.AbstractC5234s0;
import q.AbstractC5236t0;
import q.C5200d;
import q.C5209g;
import q.C5222m;
import q.RunnableC5203e;
import q.v1;
import q.z1;
import s1.C5523e;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements AbstractC5234s0, r, AbstractC0372s {

    /* renamed from: I0  reason: collision with root package name */
    public static final int[] f24477I0 = {R.attr.actionBarSize, 16842841};

    /* renamed from: A0  reason: collision with root package name */
    public J0 f24478A0;

    /* renamed from: B0  reason: collision with root package name */
    public AbstractC5206f f24479B0;

    /* renamed from: C0  reason: collision with root package name */
    public OverScroller f24480C0;

    /* renamed from: D0  reason: collision with root package name */
    public ViewPropertyAnimator f24481D0;

    /* renamed from: h0  reason: collision with root package name */
    public int f24486h0;

    /* renamed from: j0  reason: collision with root package name */
    public ContentFrameLayout f24488j0;

    /* renamed from: k0  reason: collision with root package name */
    public ActionBarContainer f24489k0;

    /* renamed from: l0  reason: collision with root package name */
    public AbstractC5236t0 f24490l0;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f24491m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f24492n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24493o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f24494p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f24495q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f24496r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f24497s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f24498t0;

    /* renamed from: x0  reason: collision with root package name */
    public J0 f24502x0;

    /* renamed from: y0  reason: collision with root package name */
    public J0 f24503y0;

    /* renamed from: z0  reason: collision with root package name */
    public J0 f24504z0;

    /* renamed from: i0  reason: collision with root package name */
    public int f24487i0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final Rect f24499u0 = new Rect();

    /* renamed from: v0  reason: collision with root package name */
    public final Rect f24500v0 = new Rect();

    /* renamed from: w0  reason: collision with root package name */
    public final Rect f24501w0 = new Rect();

    /* renamed from: E0  reason: collision with root package name */
    public final C5200d f24482E0 = new C5200d(0, this);

    /* renamed from: F0  reason: collision with root package name */
    public final RunnableC5203e f24483F0 = new RunnableC5203e(this, 0);

    /* renamed from: G0  reason: collision with root package name */
    public final RunnableC5203e f24484G0 = new RunnableC5203e(this, 1);

    /* renamed from: H0  reason: collision with root package name */
    public final C0373t f24485H0 = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, D1.t] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        J0 j02 = J0.f3231b;
        this.f24502x0 = j02;
        this.f24503y0 = j02;
        this.f24504z0 = j02;
        this.f24478A0 = j02;
        i(context);
    }

    public static boolean a(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        C5209g c5209g = (C5209g) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) c5209g).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c5209g).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c5209g).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c5209g).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) c5209g).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) c5209g).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) c5209g).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c5209g).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.f24483F0);
        removeCallbacks(this.f24484G0);
        ViewPropertyAnimator viewPropertyAnimator = this.f24481D0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // D1.AbstractC0372s
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        d(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5209g;
    }

    @Override // D1.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f24491m0 != null && !this.f24492n0) {
            if (this.f24489k0.getVisibility() == 0) {
                i10 = (int) (this.f24489k0.getTranslationY() + this.f24489k0.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f24491m0.setBounds(0, i10, getWidth(), this.f24491m0.getIntrinsicHeight() + i10);
            this.f24491m0.draw(canvas);
        }
    }

    @Override // D1.r
    public final boolean e(View view, View view2, int i10, int i11) {
        if (i11 == 0 && onStartNestedScroll(view, view2, i10)) {
            return true;
        }
        return false;
    }

    @Override // D1.r
    public final void f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // D1.r
    public final void g(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f24489k0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0373t c0373t = this.f24485H0;
        return c0373t.f3303b | c0373t.f3302a;
    }

    public CharSequence getTitle() {
        k();
        return ((z1) this.f24490l0).f43598a.getTitle();
    }

    @Override // D1.r
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public final void i(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f24477I0);
        boolean z11 = false;
        this.f24486h0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f24491m0 = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f24492n0 = z11;
        this.f24480C0 = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            ((z1) this.f24490l0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        }
        ((z1) this.f24490l0).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        AbstractC5236t0 abstractC5236t0;
        if (this.f24488j0 == null) {
            this.f24488j0 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f24489k0 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof AbstractC5236t0) {
                abstractC5236t0 = (AbstractC5236t0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                abstractC5236t0 = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f24490l0 = abstractC5236t0;
        }
    }

    public final void l(o oVar, C4538s c4538s) {
        k();
        z1 z1Var = (z1) this.f24490l0;
        C5222m c5222m = z1Var.f43610m;
        Toolbar toolbar = z1Var.f43598a;
        if (c5222m == null) {
            z1Var.f43610m = new C5222m(toolbar.getContext());
        }
        C5222m c5222m2 = z1Var.f43610m;
        c5222m2.f43457j0 = c4538s;
        if (oVar != null || toolbar.f24598h0 != null) {
            toolbar.f();
            o oVar2 = toolbar.f24598h0.f24513w0;
            if (oVar2 != oVar) {
                if (oVar2 != null) {
                    oVar2.r(toolbar.f24591R0);
                    oVar2.r(toolbar.f24592S0);
                }
                if (toolbar.f24592S0 == null) {
                    toolbar.f24592S0 = new v1(toolbar);
                }
                c5222m2.f43469v0 = true;
                if (oVar != null) {
                    oVar.b(c5222m2, toolbar.f24607q0);
                    oVar.b(toolbar.f24592S0, toolbar.f24607q0);
                } else {
                    c5222m2.c(toolbar.f24607q0, null);
                    toolbar.f24592S0.c(toolbar.f24607q0, null);
                    c5222m2.g();
                    toolbar.f24592S0.g();
                }
                toolbar.f24598h0.setPopupTheme(toolbar.f24608r0);
                toolbar.f24598h0.setPresenter(c5222m2);
                toolbar.f24591R0 = c5222m2;
                toolbar.v();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        J0 g10 = J0.g(this, windowInsets);
        boolean a5 = a(this.f24489k0, new Rect(g10.b(), g10.d(), g10.c(), g10.a()), false);
        WeakHashMap weakHashMap = Z.f3247a;
        Rect rect = this.f24499u0;
        N.b(this, g10, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        H0 h02 = g10.f3232a;
        J0 m10 = h02.m(i10, i11, i12, i13);
        this.f24502x0 = m10;
        if (!this.f24503y0.equals(m10)) {
            this.f24503y0 = this.f24502x0;
            a5 = true;
        }
        Rect rect2 = this.f24500v0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        }
        requestLayout();
        return h02.a().f3232a.c().f3232a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = Z.f3247a;
        L.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C5209g c5209g = (C5209g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c5209g).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c5209g).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        A0 a02;
        k();
        measureChildWithMargins(this.f24489k0, i10, 0, i11, 0);
        C5209g c5209g = (C5209g) this.f24489k0.getLayoutParams();
        int max = Math.max(0, this.f24489k0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c5209g).leftMargin + ((ViewGroup.MarginLayoutParams) c5209g).rightMargin);
        int max2 = Math.max(0, this.f24489k0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c5209g).topMargin + ((ViewGroup.MarginLayoutParams) c5209g).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f24489k0.getMeasuredState());
        WeakHashMap weakHashMap = Z.f3247a;
        if ((H.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = this.f24486h0;
            if (this.f24494p0 && this.f24489k0.getTabContainer() != null) {
                i12 += this.f24486h0;
            }
        } else {
            i12 = this.f24489k0.getVisibility() != 8 ? this.f24489k0.getMeasuredHeight() : 0;
        }
        Rect rect = this.f24499u0;
        Rect rect2 = this.f24501w0;
        rect2.set(rect);
        J0 j02 = this.f24502x0;
        this.f24504z0 = j02;
        if (!this.f24493o0 && !z10) {
            rect2.top += i12;
            rect2.bottom = rect2.bottom;
            this.f24504z0 = j02.f3232a.m(0, i12, 0, 0);
        } else {
            C5523e b10 = C5523e.b(j02.b(), this.f24504z0.d() + i12, this.f24504z0.c(), this.f24504z0.a());
            J0 j03 = this.f24504z0;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                a02 = new z0(j03);
            } else if (i13 >= 29) {
                a02 = new y0(j03);
            } else {
                a02 = new x0(j03);
            }
            a02.g(b10);
            this.f24504z0 = a02.b();
        }
        a(this.f24488j0, rect2, true);
        if (!this.f24478A0.equals(this.f24504z0)) {
            J0 j04 = this.f24504z0;
            this.f24478A0 = j04;
            ContentFrameLayout contentFrameLayout = this.f24488j0;
            WindowInsets f6 = j04.f();
            if (f6 != null) {
                WindowInsets a5 = L.a(contentFrameLayout, f6);
                if (!a5.equals(f6)) {
                    J0.g(contentFrameLayout, a5);
                }
            }
        }
        measureChildWithMargins(this.f24488j0, i10, 0, i11, 0);
        C5209g c5209g2 = (C5209g) this.f24488j0.getLayoutParams();
        int max3 = Math.max(max, this.f24488j0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c5209g2).leftMargin + ((ViewGroup.MarginLayoutParams) c5209g2).rightMargin);
        int max4 = Math.max(max2, this.f24488j0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c5209g2).topMargin + ((ViewGroup.MarginLayoutParams) c5209g2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f24488j0.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z10) {
        if (this.f24495q0 && z10) {
            this.f24480C0.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f24480C0.getFinalY() > this.f24489k0.getHeight()) {
                b();
                this.f24484G0.run();
            } else {
                b();
                this.f24483F0.run();
            }
            this.f24496r0 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f24497s0 + i11;
        this.f24497s0 = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        W w10;
        m mVar;
        this.f24485H0.f3302a = i10;
        this.f24497s0 = getActionBarHideOffset();
        b();
        AbstractC5206f abstractC5206f = this.f24479B0;
        if (abstractC5206f != null && (mVar = (w10 = (W) abstractC5206f).f38706D) != null) {
            mVar.a();
            w10.f38706D = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f24489k0.getVisibility() == 0) {
            return this.f24495q0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f24495q0 && !this.f24496r0) {
            if (this.f24497s0 <= this.f24489k0.getHeight()) {
                b();
                postDelayed(this.f24483F0, 600L);
                return;
            }
            b();
            postDelayed(this.f24484G0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.f24498t0 ^ i10;
        this.f24498t0 = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC5206f abstractC5206f = this.f24479B0;
        if (abstractC5206f != null) {
            ((W) abstractC5206f).f38726z = !z11;
            if (!z10 && z11) {
                W w10 = (W) abstractC5206f;
                if (!w10.f38703A) {
                    w10.f38703A = true;
                    w10.u1(true);
                }
            } else {
                W w11 = (W) abstractC5206f;
                if (w11.f38703A) {
                    w11.f38703A = false;
                    w11.u1(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.f24479B0 != null) {
            WeakHashMap weakHashMap = Z.f3247a;
            L.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f24487i0 = i10;
        AbstractC5206f abstractC5206f = this.f24479B0;
        if (abstractC5206f != null) {
            ((W) abstractC5206f).f38725y = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.f24489k0.setTranslationY(-Math.max(0, Math.min(i10, this.f24489k0.getHeight())));
    }

    public void setActionBarVisibilityCallback(AbstractC5206f abstractC5206f) {
        this.f24479B0 = abstractC5206f;
        if (getWindowToken() != null) {
            ((W) this.f24479B0).f38725y = this.f24487i0;
            int i10 = this.f24498t0;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = Z.f3247a;
                L.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f24494p0 = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f24495q0) {
            this.f24495q0 = z10;
            if (!z10) {
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        k();
        z1 z1Var = (z1) this.f24490l0;
        z1Var.f43601d = i10 != 0 ? kotlin.jvm.internal.m.u(z1Var.f43598a.getContext(), i10) : null;
        z1Var.c();
    }

    public void setLogo(int i10) {
        Drawable drawable;
        k();
        z1 z1Var = (z1) this.f24490l0;
        if (i10 != 0) {
            drawable = kotlin.jvm.internal.m.u(z1Var.f43598a.getContext(), i10);
        } else {
            drawable = null;
        }
        z1Var.f43602e = drawable;
        z1Var.c();
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f24493o0 = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24492n0 = z11;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // q.AbstractC5234s0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((z1) this.f24490l0).f43608k = callback;
    }

    @Override // q.AbstractC5234s0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        z1 z1Var = (z1) this.f24490l0;
        if (!z1Var.f43604g) {
            z1Var.f43605h = charSequence;
            if ((z1Var.f43599b & 8) != 0) {
                Toolbar toolbar = z1Var.f43598a;
                toolbar.setTitle(charSequence);
                if (z1Var.f43604g) {
                    Z.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        z1 z1Var = (z1) this.f24490l0;
        z1Var.f43601d = drawable;
        z1Var.c();
    }
}
