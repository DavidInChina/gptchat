package androidx.fragment.app;

import D1.J0;
import D1.L;
import D1.Z;
import U1.a;
import V1.AbstractActivityC1483y;
import V1.AbstractComponentCallbacksC1480v;
import V1.C1460a;
import V1.C1482x;
import V1.E;
import V1.K;
import V1.P;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Ljf/y;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "LV1/v;", TokenNames.f24312F, "getFragment", "()LV1/v;", "fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: j0  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f25140j0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f25138h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f25139i0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public boolean f25141k0 = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, K k10) {
        super(context, attributeSet);
        View view;
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("attrs", attributeSet);
        AbstractC3557B.c0("fm", k10);
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f17387b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        AbstractComponentCallbacksC1480v B10 = k10.B(id2);
        if (classAttribute != null && B10 == null) {
            if (id2 == -1) {
                throw new IllegalStateException(android.gov.nist.core.a.A("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            E E10 = k10.E();
            context.getClassLoader();
            AbstractComponentCallbacksC1480v a5 = E10.a(classAttribute);
            AbstractC3557B.b0("fm.fragmentFactory.insta\u2026ontext.classLoader, name)", a5);
            a5.f18260A0 = id2;
            a5.f18261B0 = id2;
            a5.f18262C0 = string;
            a5.f18302w0 = k10;
            C1482x c1482x = k10.f18064u;
            a5.f18303x0 = c1482x;
            a5.f18267H0 = true;
            if ((c1482x == null ? null : c1482x.f18308Y) != null) {
                a5.f18267H0 = true;
            }
            C1460a c1460a = new C1460a(k10);
            c1460a.f18146o = true;
            a5.f18268I0 = this;
            c1460a.e(getId(), a5, string, 1);
            if (!c1460a.f18138g) {
                c1460a.f18147p.z(c1460a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = k10.f18046c.v().iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
            if (abstractComponentCallbacksC1480v.f18261B0 == getId() && (view = abstractComponentCallbacksC1480v.f18269J0) != null && view.getParent() == null) {
                abstractComponentCallbacksC1480v.f18268I0 = this;
                p10.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f25139i0.contains(view)) {
            this.f25138h0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v;
        AbstractC3557B.c0("child", view);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof AbstractComponentCallbacksC1480v) {
            abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) tag;
        } else {
            abstractComponentCallbacksC1480v = null;
        }
        if (abstractComponentCallbacksC1480v != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        J0 j02;
        AbstractC3557B.c0("insets", windowInsets);
        J0 g10 = J0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f25140j0;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC3557B.b0("onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)", onApplyWindowInsets);
            j02 = J0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = Z.f3247a;
            WindowInsets f6 = g10.f();
            if (f6 != null) {
                WindowInsets b10 = L.b(this, f6);
                if (!b10.equals(f6)) {
                    g10 = J0.g(this, b10);
                }
            }
            j02 = g10;
        }
        if (!j02.f3232a.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap weakHashMap2 = Z.f3247a;
                WindowInsets f10 = j02.f();
                if (f10 != null) {
                    WindowInsets a5 = L.a(childAt, f10);
                    if (!a5.equals(f10)) {
                        J0.g(childAt, a5);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC3557B.c0("canvas", canvas);
        if (this.f25141k0) {
            Iterator it = this.f25138h0.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        AbstractC3557B.c0("canvas", canvas);
        AbstractC3557B.c0("child", view);
        if (this.f25141k0) {
            ArrayList arrayList = this.f25138h0;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC3557B.c0("view", view);
        this.f25139i0.remove(view);
        if (this.f25138h0.remove(view)) {
            this.f25141k0 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC1480v> F getFragment() {
        K k10;
        AbstractActivityC1483y abstractActivityC1483y;
        AbstractComponentCallbacksC1480v C10 = K.C(this);
        if (C10 != null) {
            if (C10.s()) {
                k10 = C10.l();
            } else {
                throw new IllegalStateException("The Fragment " + C10 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof AbstractActivityC1483y) {
                        abstractActivityC1483y = (AbstractActivityC1483y) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    abstractActivityC1483y = null;
                    break;
                }
            }
            if (abstractActivityC1483y != null) {
                k10 = abstractActivityC1483y.f18317y0.e();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) k10.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC3557B.c0("insets", windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                AbstractC3557B.b0("view", childAt);
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC3557B.c0("view", view);
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        AbstractC3557B.b0("view", childAt);
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC3557B.c0("view", view);
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            AbstractC3557B.b0("view", childAt);
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            AbstractC3557B.b0("view", childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f25141k0 = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC3557B.c0("listener", onApplyWindowInsetsListener);
        this.f25140j0 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC3557B.c0("view", view);
        if (view.getParent() == this) {
            this.f25139i0.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        AbstractC3557B.c0("context", context);
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f17387b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
