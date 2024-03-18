package q;

import D1.AbstractC0342b0;
import D1.AbstractC0344c0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class C1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p0  reason: collision with root package name */
    public static C1 f43237p0;

    /* renamed from: q0  reason: collision with root package name */
    public static C1 f43238q0;

    /* renamed from: Y  reason: collision with root package name */
    public final View f43239Y;

    /* renamed from: Z  reason: collision with root package name */
    public final CharSequence f43240Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f43241h0;

    /* renamed from: i0  reason: collision with root package name */
    public final B1 f43242i0 = new Runnable(this) { // from class: q.B1

        /* renamed from: Z  reason: collision with root package name */
        public final /* synthetic */ C1 f43231Z;

        {
            this.f43231Z = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = r2;
            C1 c12 = this.f43231Z;
            switch (i10) {
                case 0:
                    c12.c(false);
                    return;
                default:
                    c12.a();
                    return;
            }
        }
    };

    /* renamed from: j0  reason: collision with root package name */
    public final B1 f43243j0 = new Runnable(this) { // from class: q.B1

        /* renamed from: Z  reason: collision with root package name */
        public final /* synthetic */ C1 f43231Z;

        {
            this.f43231Z = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = r2;
            C1 c12 = this.f43231Z;
            switch (i10) {
                case 0:
                    c12.c(false);
                    return;
                default:
                    c12.a();
                    return;
            }
        }
    };

    /* renamed from: k0  reason: collision with root package name */
    public int f43244k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f43245l0;

    /* renamed from: m0  reason: collision with root package name */
    public D1 f43246m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f43247n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f43248o0;

    /* JADX WARN: Type inference failed for: r0v0, types: [q.B1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.B1] */
    public C1(View view, CharSequence charSequence) {
        int i10;
        this.f43239Y = view;
        this.f43240Z = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0344c0.f3257a;
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = AbstractC0342b0.a(viewConfiguration);
        } else {
            i10 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f43241h0 = i10;
        this.f43248o0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(C1 c12) {
        C1 c13 = f43237p0;
        if (c13 != null) {
            c13.f43239Y.removeCallbacks(c13.f43242i0);
        }
        f43237p0 = c12;
        if (c12 != null) {
            c12.f43239Y.postDelayed(c12.f43242i0, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        C1 c12 = f43238q0;
        View view = this.f43239Y;
        if (c12 == this) {
            f43238q0 = null;
            D1 d12 = this.f43246m0;
            if (d12 != null) {
                if (((View) d12.f43262b).getParent() != null) {
                    ((WindowManager) ((Context) d12.f43261a).getSystemService("window")).removeView((View) d12.f43262b);
                }
                this.f43246m0 = null;
                this.f43248o0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                AbstractC3612c.c("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f43237p0 == this) {
            b(null);
        }
        view.removeCallbacks(this.f43243j0);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, q.D1] */
    public final void c(boolean z10) {
        int i10;
        int i11;
        int i12;
        long j6;
        long longPressTimeout;
        long j10;
        int i13;
        WeakHashMap weakHashMap = D1.Z.f3247a;
        View view = this.f43239Y;
        if (!D1.K.b(view)) {
            return;
        }
        b(null);
        C1 c12 = f43238q0;
        if (c12 != null) {
            c12.a();
        }
        f43238q0 = this;
        this.f43247n0 = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        obj.f43264d = new WindowManager.LayoutParams();
        obj.f43265e = new Rect();
        obj.f43266f = new int[2];
        obj.f43267g = new int[2];
        obj.f43261a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f43262b = inflate;
        obj.f43263c = (TextView) inflate.findViewById(R.id.message);
        ((WindowManager.LayoutParams) obj.f43264d).setTitle(D1.class.getSimpleName());
        ((WindowManager.LayoutParams) obj.f43264d).packageName = ((Context) obj.f43261a).getPackageName();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj.f43264d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951620;
        layoutParams.flags = 24;
        this.f43246m0 = obj;
        int i14 = this.f43244k0;
        int i15 = this.f43245l0;
        boolean z11 = this.f43247n0;
        if (((View) obj.f43262b).getParent() != null && ((View) obj.f43262b).getParent() != null) {
            ((WindowManager) ((Context) obj.f43261a).getSystemService("window")).removeView((View) obj.f43262b);
        }
        ((TextView) obj.f43263c).setText(this.f43240Z);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f43264d;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) obj.f43261a).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i14 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) obj.f43261a).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            i10 = i15 + dimensionPixelOffset2;
            i11 = i15 - dimensionPixelOffset2;
        } else {
            i10 = view.getHeight();
            i11 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = ((Context) obj.f43261a).getResources();
        if (z11) {
            i12 = R.dimen.tooltip_y_offset_touch;
        } else {
            i12 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i12);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            AbstractC3612c.c("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) obj.f43265e);
            Rect rect = (Rect) obj.f43265e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = ((Context) obj.f43261a).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i13 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i13 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) obj.f43265e).set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) obj.f43267g);
            view.getLocationOnScreen((int[]) obj.f43266f);
            int[] iArr = (int[]) obj.f43266f;
            int i16 = iArr[0];
            int[] iArr2 = (int[]) obj.f43267g;
            int i17 = i16 - iArr2[0];
            iArr[0] = i17;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams2.x = (i17 + i14) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) obj.f43262b).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) obj.f43262b).getMeasuredHeight();
            int i18 = ((int[]) obj.f43266f)[1];
            int i19 = ((i11 + i18) - dimensionPixelOffset3) - measuredHeight;
            int i20 = i18 + i10 + dimensionPixelOffset3;
            if (z11) {
                if (i19 >= 0) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i20;
                }
            } else if (measuredHeight + i20 <= ((Rect) obj.f43265e).height()) {
                layoutParams2.y = i20;
            } else {
                layoutParams2.y = i19;
            }
        }
        ((WindowManager) ((Context) obj.f43261a).getSystemService("window")).addView((View) obj.f43262b, (WindowManager.LayoutParams) obj.f43264d);
        view.addOnAttachStateChangeListener(this);
        if (this.f43247n0) {
            j6 = 2500;
        } else {
            if ((D1.H.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j6 = j10 - longPressTimeout;
        }
        B1 b1 = this.f43243j0;
        view.removeCallbacks(b1);
        view.postDelayed(b1, j6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (java.lang.Math.abs(r5 - r3.f43245l0) <= r2) goto L28;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f43246m0 != null && this.f43247n0) {
            return false;
        }
        View view2 = this.f43239Y;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f43248o0 = true;
                a();
            }
        } else if (view2.isEnabled() && this.f43246m0 == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.f43248o0) {
                int abs = Math.abs(x10 - this.f43244k0);
                int i10 = this.f43241h0;
                if (abs <= i10) {
                }
            }
            this.f43244k0 = x10;
            this.f43245l0 = y10;
            this.f43248o0 = false;
            b(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f43244k0 = view.getWidth() / 2;
        this.f43245l0 = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
