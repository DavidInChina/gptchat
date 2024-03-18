package H0;

import Ng.C1059e0;
import Sg.C1394f;
import Z.AbstractC1700a0;
import Z.AbstractC1725n;
import Z.AbstractC1738u;
import Z.C1723m;
import Z.C1728o0;
import Z.EnumC1747y0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.AbstractC2086v;
import com.openai.chatgpt.R;
import h.C3276b;
import h0.C3288a;
import java.lang.ref.WeakReference;
import jf.C3963m;
import l0.AbstractC4327s;
import l0.C4310b;
import nf.AbstractC4831k;
import nf.C4826f;
import nf.C4832l;
import p.View$OnAttachStateChangeListenerC5030f;
import y.C6473k;

/* renamed from: H0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0666a extends ViewGroup {

    /* renamed from: h0  reason: collision with root package name */
    public WeakReference f6894h0;

    /* renamed from: i0  reason: collision with root package name */
    public IBinder f6895i0;

    /* renamed from: j0  reason: collision with root package name */
    public y1 f6896j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC1738u f6897k0;

    /* renamed from: l0  reason: collision with root package name */
    public F.s f6898l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6899m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6900n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6901o0;

    public /* synthetic */ AbstractC0666a(Context context) {
        this(context, null, 0);
    }

    private final void setParentContext(AbstractC1738u abstractC1738u) {
        if (this.f6897k0 != abstractC1738u) {
            this.f6897k0 = abstractC1738u;
            if (abstractC1738u != null) {
                this.f6894h0 = null;
            }
            y1 y1Var = this.f6896j0;
            if (y1Var != null) {
                y1Var.dispose();
                this.f6896j0 = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f6895i0 != iBinder) {
            this.f6895i0 = iBinder;
            this.f6894h0 = null;
        }
    }

    public abstract void a(AbstractC1725n abstractC1725n, int i10);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f6900n0) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        y1 y1Var = this.f6896j0;
        if (y1Var != null) {
            y1Var.dispose();
        }
        this.f6896j0 = null;
        requestLayout();
    }

    public final void d() {
        if (this.f6896j0 == null) {
            try {
                this.f6900n0 = true;
                this.f6896j0 = A1.a(this, g(), new C3288a(new C6473k(13, this), true, -656146368));
            } finally {
                this.f6900n0 = false;
            }
        }
    }

    public void e(int i10, int i11, int i12, int i13, boolean z10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void f(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r2 > 0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Type inference failed for: r0v0, types: [Z.u] */
    /* JADX WARN: Type inference failed for: r0v1, types: [Z.u] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Z.E0] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1738u g() {
        AbstractC4831k abstractC4831k;
        C1728o0 c1728o0;
        androidx.lifecycle.S s10;
        AbstractC1738u abstractC1738u;
        Object obj;
        Object obj2 = this.f6897k0;
        if (obj2 == 0) {
            obj2 = v1.b(this);
            if (obj2 == null) {
                for (ViewParent parent = getParent(); obj2 == null && (parent instanceof View); parent = parent.getParent()) {
                    obj2 = v1.b((View) parent);
                }
            }
            Object obj3 = null;
            if (obj2 != null) {
                if ((obj2 instanceof Z.E0) && ((EnumC1747y0) ((Z.E0) obj2).f22483t.getValue()).compareTo(EnumC1747y0.f22771Z) <= 0) {
                    obj = null;
                } else {
                    obj = obj2;
                }
                if (obj != null) {
                    this.f6894h0 = new WeakReference(obj);
                }
            } else {
                obj2 = 0;
            }
            if (obj2 == 0) {
                WeakReference weakReference = this.f6894h0;
                if (weakReference != null && (abstractC1738u = (AbstractC1738u) weakReference.get()) != null) {
                    boolean z10 = abstractC1738u instanceof Z.E0;
                    obj2 = abstractC1738u;
                    if (z10) {
                        int compareTo = ((EnumC1747y0) ((Z.E0) abstractC1738u).f22483t.getValue()).compareTo(EnumC1747y0.f22771Z);
                        obj2 = abstractC1738u;
                    }
                    if (obj2 == 0) {
                        if (isAttachedToWindow()) {
                            ViewParent parent2 = getParent();
                            AbstractC0666a abstractC0666a = this;
                            while (parent2 instanceof View) {
                                ?? r02 = (View) parent2;
                                if (r02.getId() == 16908290) {
                                    break;
                                }
                                abstractC0666a = r02;
                                parent2 = r02.getParent();
                            }
                            AbstractC1738u b10 = v1.b(abstractC0666a);
                            if (b10 == null) {
                                ((j1) ((k1) m1.f6977a.get())).getClass();
                                C4832l c4832l = C4832l.f40334Y;
                                c4832l.get(C4826f.f40317Y);
                                C3963m c3963m = C0676e0.f6937q0;
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    abstractC4831k = (AbstractC4831k) C0676e0.f6937q0.getValue();
                                } else {
                                    abstractC4831k = (AbstractC4831k) C0676e0.f6938r0.get();
                                    if (abstractC4831k == null) {
                                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                                    }
                                }
                                AbstractC4831k plus = abstractC4831k.plus(c4832l);
                                AbstractC1700a0 abstractC1700a0 = (AbstractC1700a0) plus.get(C1723m.f22655Z);
                                if (abstractC1700a0 != null) {
                                    C1728o0 c1728o02 = new C1728o0(abstractC1700a0);
                                    Z.X x10 = c1728o02.f22664Z;
                                    synchronized (x10.f22583a) {
                                        x10.f22586d = false;
                                        c1728o0 = c1728o02;
                                    }
                                } else {
                                    c1728o0 = null;
                                }
                                ?? obj4 = new Object();
                                AbstractC4831k abstractC4831k2 = (AbstractC4327s) plus.get(C4310b.f37708u0);
                                if (abstractC4831k2 == null) {
                                    abstractC4831k2 = new G0();
                                    obj4.f37622Y = abstractC4831k2;
                                }
                                if (c1728o0 != null) {
                                    c4832l = c1728o0;
                                }
                                AbstractC4831k plus2 = plus.plus(c4832l).plus(abstractC4831k2);
                                Z.E0 e02 = new Z.E0(plus2);
                                e02.B();
                                C1394f g10 = Ad.l.g(plus2);
                                AbstractC2086v A10 = K4.J.A(abstractC0666a);
                                if (A10 != null) {
                                    s10 = A10.h();
                                } else {
                                    s10 = null;
                                }
                                if (s10 != null) {
                                    abstractC0666a.addOnAttachStateChangeListener(new n1(abstractC0666a, e02));
                                    s10.a(new s1(g10, c1728o0, e02, obj4, abstractC0666a));
                                    abstractC0666a.setTag(R.id.androidx_compose_ui_view_composition_context, e02);
                                    C1059e0 c1059e0 = C1059e0.f12936Y;
                                    Handler handler = abstractC0666a.getHandler();
                                    int i10 = Og.f.f13760a;
                                    abstractC0666a.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5030f(4, Ad.l.O0(c1059e0, new Og.d(handler, "windowRecomposer cleanup", false).f13759j0, null, new l1(e02, abstractC0666a, null), 2)));
                                    obj2 = e02;
                                } else {
                                    throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + abstractC0666a).toString());
                                }
                            } else if (b10 instanceof Z.E0) {
                                obj2 = (Z.E0) b10;
                            } else {
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                            }
                            if (((EnumC1747y0) obj2.f22483t.getValue()).compareTo(EnumC1747y0.f22771Z) > 0) {
                                obj3 = obj2;
                            }
                            if (obj3 != null) {
                                this.f6894h0 = new WeakReference(obj3);
                            }
                        } else {
                            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                        }
                    }
                }
                obj2 = 0;
                if (obj2 == 0) {
                }
            }
        }
        return obj2;
    }

    public final boolean getHasComposition() {
        if (this.f6896j0 != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f6899m0;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.f6901o0 && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        e(i10, i11, i12, i13, z10);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        f(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(AbstractC1738u abstractC1738u) {
        setParentContext(abstractC1738u);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f6899m0 = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((C0714y) ((Owner) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f6901o0 = true;
    }

    public final void setViewCompositionStrategy(X0 x02) {
        F.s sVar = this.f6898l0;
        if (sVar != null) {
            sVar.mo122invoke();
        }
        ((Q) x02).getClass();
        View$OnAttachStateChangeListenerC5030f view$OnAttachStateChangeListenerC5030f = new View$OnAttachStateChangeListenerC5030f(3, this);
        addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC5030f);
        C3276b c3276b = new C3276b(1, this);
        Df.H.S(this).f8731a.add(c3276b);
        this.f6898l0 = new F.s(this, view$OnAttachStateChangeListenerC5030f, c3276b, 6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC0666a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        View$OnAttachStateChangeListenerC5030f view$OnAttachStateChangeListenerC5030f = new View$OnAttachStateChangeListenerC5030f(3, this);
        addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC5030f);
        C3276b c3276b = new C3276b(1, this);
        Df.H.S(this).f8731a.add(c3276b);
        this.f6898l0 = new F.s(this, view$OnAttachStateChangeListenerC5030f, c3276b, 6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
