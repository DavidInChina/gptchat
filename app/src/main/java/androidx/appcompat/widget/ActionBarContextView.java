package androidx.appcompat.widget;

import D1.C0358j0;
import D1.H;
import D1.Z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import l.AbstractC4308a;
import p.E;
import p.o;
import q.C5191a;
import q.C5212h;
import q.C5222m;
import q.G1;
import q.View$OnClickListenerC5197c;

/* loaded from: classes2.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A0  reason: collision with root package name */
    public final int f24457A0;

    /* renamed from: h0  reason: collision with root package name */
    public final C5191a f24458h0 = new C5191a(this);

    /* renamed from: i0  reason: collision with root package name */
    public final Context f24459i0;

    /* renamed from: j0  reason: collision with root package name */
    public ActionMenuView f24460j0;

    /* renamed from: k0  reason: collision with root package name */
    public C5222m f24461k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f24462l0;

    /* renamed from: m0  reason: collision with root package name */
    public C0358j0 f24463m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f24464n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24465o0;

    /* renamed from: p0  reason: collision with root package name */
    public CharSequence f24466p0;

    /* renamed from: q0  reason: collision with root package name */
    public CharSequence f24467q0;

    /* renamed from: r0  reason: collision with root package name */
    public View f24468r0;

    /* renamed from: s0  reason: collision with root package name */
    public View f24469s0;

    /* renamed from: t0  reason: collision with root package name */
    public View f24470t0;

    /* renamed from: u0  reason: collision with root package name */
    public LinearLayout f24471u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f24472v0;

    /* renamed from: w0  reason: collision with root package name */
    public TextView f24473w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int f24474x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int f24475y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f24476z0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f24459i0 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f24459i0 = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37667d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = m.u(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = Z.f3247a;
        H.q(this, drawable);
        this.f24474x0 = obtainStyledAttributes.getResourceId(5, 0);
        this.f24475y0 = obtainStyledAttributes.getResourceId(4, 0);
        this.f24462l0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f24457A0 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int j(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(androidx.appcompat.view.c cVar) {
        View view = this.f24468r0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f24457A0, (ViewGroup) this, false);
            this.f24468r0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f24468r0);
        }
        View findViewById = this.f24468r0.findViewById(R.id.action_mode_close_button);
        this.f24469s0 = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC5197c(this, cVar));
        o c10 = cVar.c();
        C5222m c5222m = this.f24461k0;
        if (c5222m != null) {
            c5222m.f();
            C5212h c5212h = c5222m.f43472y0;
            if (c5212h != null && c5212h.b()) {
                c5212h.f41506j.dismiss();
            }
        }
        C5222m c5222m2 = new C5222m(getContext());
        this.f24461k0 = c5222m2;
        c5222m2.f43464q0 = true;
        c5222m2.f43465r0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c10.b(this.f24461k0, this.f24459i0);
        C5222m c5222m3 = this.f24461k0;
        E e10 = c5222m3.f43460m0;
        if (e10 == null) {
            E e11 = (E) c5222m3.f43456i0.inflate(c5222m3.f43458k0, (ViewGroup) this, false);
            c5222m3.f43460m0 = e11;
            e11.d(c5222m3.f43455h0);
            c5222m3.g();
        }
        E e12 = c5222m3.f43460m0;
        if (e10 != e12) {
            ((ActionMenuView) e12).setPresenter(c5222m3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) e12;
        this.f24460j0 = actionMenuView;
        WeakHashMap weakHashMap = Z.f3247a;
        H.q(actionMenuView, null);
        addView(this.f24460j0, layoutParams);
    }

    public final void d() {
        int i10;
        if (this.f24471u0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f24471u0 = linearLayout;
            this.f24472v0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f24473w0 = (TextView) this.f24471u0.findViewById(R.id.action_bar_subtitle);
            int i11 = this.f24474x0;
            if (i11 != 0) {
                this.f24472v0.setTextAppearance(getContext(), i11);
            }
            int i12 = this.f24475y0;
            if (i12 != 0) {
                this.f24473w0.setTextAppearance(getContext(), i12);
            }
        }
        this.f24472v0.setText(this.f24466p0);
        this.f24473w0.setText(this.f24467q0);
        boolean z10 = !TextUtils.isEmpty(this.f24466p0);
        boolean z11 = !TextUtils.isEmpty(this.f24467q0);
        TextView textView = this.f24473w0;
        int i13 = 8;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f24471u0;
        if (z10 || z11) {
            i13 = 0;
        }
        linearLayout2.setVisibility(i13);
        if (this.f24471u0.getParent() == null) {
            addView(this.f24471u0);
        }
    }

    public final void e() {
        removeAllViews();
        this.f24470t0 = null;
        this.f24460j0 = null;
        this.f24461k0 = null;
        View view = this.f24469s0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: g */
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC4308a.f37664a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C5222m c5222m = this.f24461k0;
        if (c5222m != null) {
            Configuration configuration2 = c5222m.f43454Z.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
                if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                    if (i11 >= 360) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 5;
            }
            c5222m.f43468u0 = i10;
            o oVar = c5222m.f43455h0;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f24463m0 != null) {
            return this.f24458h0.f43398b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f24462l0;
    }

    public CharSequence getSubtitle() {
        return this.f24467q0;
    }

    public CharSequence getTitle() {
        return this.f24466p0;
    }

    public final boolean h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f24465o0 = false;
        }
        if (!this.f24465o0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f24465o0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f24465o0 = false;
        }
        return true;
    }

    public final boolean i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f24464n0 = false;
        }
        if (!this.f24464n0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f24464n0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f24464n0 = false;
        }
        return true;
    }

    /* renamed from: k */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0358j0 c0358j0 = this.f24463m0;
            if (c0358j0 != null) {
                c0358j0.b();
            }
            super.setVisibility(i10);
        }
    }

    public final C0358j0 l(int i10, long j6) {
        C0358j0 c0358j0 = this.f24463m0;
        if (c0358j0 != null) {
            c0358j0.b();
        }
        C5191a c5191a = this.f24458h0;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0358j0 a5 = Z.a(this);
            a5.a(1.0f);
            a5.c(j6);
            c5191a.f43399c.f24463m0 = a5;
            c5191a.f43398b = i10;
            a5.d(c5191a);
            return a5;
        }
        C0358j0 a10 = Z.a(this);
        a10.a(0.0f);
        a10.c(j6);
        c5191a.f43399c.f24463m0 = a10;
        c5191a.f43398b = i10;
        a10.d(c5191a);
        return a10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5222m c5222m = this.f24461k0;
        if (c5222m != null) {
            c5222m.f();
            C5212h c5212h = this.f24461k0.f43472y0;
            if (c5212h != null && c5212h.b()) {
                c5212h.f41506j.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        h(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean a5 = G1.a(this);
        if (a5) {
            i14 = (i12 - i10) - getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f24468r0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24468r0.getLayoutParams();
            if (a5) {
                i16 = marginLayoutParams.rightMargin;
            } else {
                i16 = marginLayoutParams.leftMargin;
            }
            if (a5) {
                i17 = marginLayoutParams.leftMargin;
            } else {
                i17 = marginLayoutParams.rightMargin;
            }
            if (a5) {
                i18 = i14 - i16;
            } else {
                i18 = i14 + i16;
            }
            int j6 = j(this.f24468r0, i18, paddingTop, paddingTop2, a5) + i18;
            if (a5) {
                i19 = j6 - i17;
            } else {
                i19 = j6 + i17;
            }
            i14 = i19;
        }
        LinearLayout linearLayout = this.f24471u0;
        if (linearLayout != null && this.f24470t0 == null && linearLayout.getVisibility() != 8) {
            i14 += j(this.f24471u0, i14, paddingTop, paddingTop2, a5);
        }
        View view2 = this.f24470t0;
        if (view2 != null) {
            j(view2, i14, paddingTop, paddingTop2, a5);
        }
        if (a5) {
            i15 = getPaddingLeft();
        } else {
            i15 = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f24460j0;
        if (actionMenuView != null) {
            j(actionMenuView, i15, paddingTop, paddingTop2, !a5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f24462l0;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                View view = this.f24468r0;
                if (view != null) {
                    int f6 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24468r0.getLayoutParams();
                    paddingLeft = f6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f24460j0;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f24460j0, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f24471u0;
                if (linearLayout != null && this.f24470t0 == null) {
                    if (this.f24476z0) {
                        this.f24471u0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f24471u0.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f24471u0;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f24470t0;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.f24470t0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f24462l0 <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        return true;
    }

    public void setContentHeight(int i10) {
        this.f24462l0 = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f24470t0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f24470t0 = view;
        if (view != null && (linearLayout = this.f24471u0) != null) {
            removeView(linearLayout);
            this.f24471u0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f24467q0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f24466p0 = charSequence;
        d();
        Z.m(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f24476z0) {
            requestLayout();
        }
        this.f24476z0 = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
