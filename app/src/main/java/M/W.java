package m;

import D1.AbstractC0356i0;
import D1.C0358j0;
import D1.Z;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.AbstractC4308a;
import q.AbstractC5206f;
import q.AbstractC5236t0;
import q.z1;

/* loaded from: classes2.dex */
public final class W extends r9.y implements AbstractC5206f {

    /* renamed from: J  reason: collision with root package name */
    public static final AccelerateInterpolator f38701J = new AccelerateInterpolator();

    /* renamed from: K  reason: collision with root package name */
    public static final DecelerateInterpolator f38702K = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public boolean f38703A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f38704B;

    /* renamed from: D  reason: collision with root package name */
    public androidx.appcompat.view.m f38706D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f38707E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f38708F;

    /* renamed from: l  reason: collision with root package name */
    public Context f38712l;

    /* renamed from: m  reason: collision with root package name */
    public Context f38713m;

    /* renamed from: n  reason: collision with root package name */
    public ActionBarOverlayLayout f38714n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContainer f38715o;

    /* renamed from: p  reason: collision with root package name */
    public AbstractC5236t0 f38716p;

    /* renamed from: q  reason: collision with root package name */
    public ActionBarContextView f38717q;

    /* renamed from: r  reason: collision with root package name */
    public final View f38718r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f38719s;

    /* renamed from: t  reason: collision with root package name */
    public V f38720t;

    /* renamed from: u  reason: collision with root package name */
    public V f38721u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.appcompat.view.b f38722v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f38723w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f38724x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public int f38725y = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f38726z = true;

    /* renamed from: C  reason: collision with root package name */
    public boolean f38705C = true;

    /* renamed from: G  reason: collision with root package name */
    public final U f38709G = new U(this, 0);

    /* renamed from: H  reason: collision with root package name */
    public final U f38710H = new U(this, 1);

    /* renamed from: I  reason: collision with root package name */
    public final J0.a f38711I = new J0.a(this);

    public W(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        q1(decorView);
        if (!z10) {
            this.f38718r = decorView.findViewById(16908290);
        }
    }

    public final void o1(boolean z10) {
        C0358j0 c0358j0;
        C0358j0 c0358j02;
        long j6;
        if (z10) {
            if (!this.f38704B) {
                this.f38704B = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f38714n;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u1(false);
            }
        } else if (this.f38704B) {
            this.f38704B = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38714n;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u1(false);
        }
        ActionBarContainer actionBarContainer = this.f38715o;
        WeakHashMap weakHashMap = Z.f3247a;
        if (D1.K.c(actionBarContainer)) {
            if (z10) {
                z1 z1Var = (z1) this.f38716p;
                c0358j02 = Z.a(z1Var.f43598a);
                c0358j02.a(0.0f);
                c0358j02.c(100L);
                c0358j02.d(new androidx.appcompat.view.l(z1Var, 4));
                c0358j0 = this.f38717q.l(0, 200L);
            } else {
                z1 z1Var2 = (z1) this.f38716p;
                C0358j0 a5 = Z.a(z1Var2.f43598a);
                a5.a(1.0f);
                a5.c(200L);
                a5.d(new androidx.appcompat.view.l(z1Var2, 0));
                c0358j02 = this.f38717q.l(8, 100L);
                c0358j0 = a5;
            }
            androidx.appcompat.view.m mVar = new androidx.appcompat.view.m();
            ArrayList arrayList = (ArrayList) mVar.f24414c;
            arrayList.add(c0358j02);
            View view = (View) c0358j02.f3273a.get();
            if (view != null) {
                j6 = view.animate().getDuration();
            } else {
                j6 = 0;
            }
            View view2 = (View) c0358j0.f3273a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j6);
            }
            arrayList.add(c0358j0);
            mVar.c();
        } else if (z10) {
            ((z1) this.f38716p).f43598a.setVisibility(4);
            this.f38717q.setVisibility(0);
        } else {
            ((z1) this.f38716p).f43598a.setVisibility(0);
            this.f38717q.setVisibility(8);
        }
    }

    public final Context p1() {
        if (this.f38713m == null) {
            TypedValue typedValue = new TypedValue();
            this.f38712l.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f38713m = new ContextThemeWrapper(this.f38712l, i10);
            } else {
                this.f38713m = this.f38712l;
            }
        }
        return this.f38713m;
    }

    public final void q1(View view) {
        AbstractC5236t0 abstractC5236t0;
        boolean z10;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f38714n = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof AbstractC5236t0) {
            abstractC5236t0 = (AbstractC5236t0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            abstractC5236t0 = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f38716p = abstractC5236t0;
        this.f38717q = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f38715o = actionBarContainer;
        AbstractC5236t0 abstractC5236t02 = this.f38716p;
        if (abstractC5236t02 != null && this.f38717q != null && actionBarContainer != null) {
            Context context = ((z1) abstractC5236t02).f43598a.getContext();
            this.f38712l = context;
            if ((((z1) this.f38716p).f43599b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f38719s = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f38716p.getClass();
            s1(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f38712l.obtainStyledAttributes(null, AbstractC4308a.f37664a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38714n;
                if (actionBarOverlayLayout2.f24493o0) {
                    this.f38708F = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f38715o;
                WeakHashMap weakHashMap = Z.f3247a;
                D1.N.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(W.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void r1(boolean z10) {
        int i10;
        if (!this.f38719s) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            z1 z1Var = (z1) this.f38716p;
            int i11 = z1Var.f43599b;
            this.f38719s = true;
            z1Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void s1(boolean z10) {
        if (!z10) {
            ((z1) this.f38716p).getClass();
            this.f38715o.setTabContainer(null);
        } else {
            this.f38715o.setTabContainer(null);
            ((z1) this.f38716p).getClass();
        }
        this.f38716p.getClass();
        ((z1) this.f38716p).f43598a.setCollapsible(false);
        this.f38714n.setHasNonEmbeddedTabs(false);
    }

    public final void t1(CharSequence charSequence) {
        z1 z1Var = (z1) this.f38716p;
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

    public final void u1(boolean z10) {
        boolean z11;
        int[] iArr;
        int[] iArr2;
        boolean z12 = this.f38703A;
        if (this.f38704B || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        final J0.a aVar = this.f38711I;
        View view = this.f38718r;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (z11) {
            if (!this.f38705C) {
                this.f38705C = true;
                androidx.appcompat.view.m mVar = this.f38706D;
                if (mVar != null) {
                    mVar.a();
                }
                this.f38715o.setVisibility(0);
                int i10 = this.f38725y;
                U u10 = this.f38710H;
                if (i10 == 0 && (this.f38707E || z10)) {
                    this.f38715o.setTranslationY(0.0f);
                    float f6 = -this.f38715o.getHeight();
                    if (z10) {
                        this.f38715o.getLocationInWindow(new int[]{0, 0});
                        f6 -= iArr2[1];
                    }
                    this.f38715o.setTranslationY(f6);
                    androidx.appcompat.view.m mVar2 = new androidx.appcompat.view.m();
                    C0358j0 a5 = Z.a(this.f38715o);
                    a5.e(0.0f);
                    final View view2 = (View) a5.f3273a.get();
                    if (view2 != null) {
                        if (aVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: D1.g0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) ((m.W) J0.a.this.f8729Y).f38715o.getParent()).invalidate();
                                }
                            };
                        }
                        AbstractC0356i0.a(view2.animate(), animatorUpdateListener);
                    }
                    mVar2.b(a5);
                    if (this.f38726z && view != null) {
                        view.setTranslationY(f6);
                        C0358j0 a10 = Z.a(view);
                        a10.e(0.0f);
                        mVar2.b(a10);
                    }
                    DecelerateInterpolator decelerateInterpolator = f38702K;
                    boolean z13 = mVar2.f24413b;
                    if (!z13) {
                        mVar2.f24415d = decelerateInterpolator;
                    }
                    if (!z13) {
                        mVar2.f24412a = 250L;
                    }
                    if (!z13) {
                        mVar2.f24416e = u10;
                    }
                    this.f38706D = mVar2;
                    mVar2.c();
                } else {
                    this.f38715o.setAlpha(1.0f);
                    this.f38715o.setTranslationY(0.0f);
                    if (this.f38726z && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    u10.d();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f38714n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    D1.L.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f38705C) {
            this.f38705C = false;
            androidx.appcompat.view.m mVar3 = this.f38706D;
            if (mVar3 != null) {
                mVar3.a();
            }
            int i11 = this.f38725y;
            U u11 = this.f38709G;
            if (i11 == 0 && (this.f38707E || z10)) {
                this.f38715o.setAlpha(1.0f);
                this.f38715o.setTransitioning(true);
                androidx.appcompat.view.m mVar4 = new androidx.appcompat.view.m();
                float f10 = -this.f38715o.getHeight();
                if (z10) {
                    this.f38715o.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                C0358j0 a11 = Z.a(this.f38715o);
                a11.e(f10);
                final View view3 = (View) a11.f3273a.get();
                if (view3 != null) {
                    if (aVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: D1.g0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) ((m.W) J0.a.this.f8729Y).f38715o.getParent()).invalidate();
                            }
                        };
                    }
                    AbstractC0356i0.a(view3.animate(), animatorUpdateListener);
                }
                mVar4.b(a11);
                if (this.f38726z && view != null) {
                    C0358j0 a12 = Z.a(view);
                    a12.e(f10);
                    mVar4.b(a12);
                }
                AccelerateInterpolator accelerateInterpolator = f38701J;
                boolean z14 = mVar4.f24413b;
                if (!z14) {
                    mVar4.f24415d = accelerateInterpolator;
                }
                if (!z14) {
                    mVar4.f24412a = 250L;
                }
                if (!z14) {
                    mVar4.f24416e = u11;
                }
                this.f38706D = mVar4;
                mVar4.c();
                return;
            }
            u11.d();
        }
    }

    public W(Dialog dialog) {
        new ArrayList();
        q1(dialog.getWindow().getDecorView());
    }
}
