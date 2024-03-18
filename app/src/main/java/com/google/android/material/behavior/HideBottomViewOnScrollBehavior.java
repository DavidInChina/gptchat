package com.google.android.material.behavior;

import P4.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m1.AbstractC4544a;
import q.C5200d;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC4544a {

    /* renamed from: b  reason: collision with root package name */
    public int f27004b;

    /* renamed from: c  reason: collision with root package name */
    public int f27005c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f27006d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f27007e;

    /* renamed from: h  reason: collision with root package name */
    public ViewPropertyAnimator f27010h;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f27003a = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public int f27008f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f27009g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // m1.AbstractC4544a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f27008f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f27004b = a.B0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f27005c = a.B0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f27006d = a.C0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, P7.a.f13841d);
        this.f27007e = a.C0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, P7.a.f13840c);
        return false;
    }

    @Override // m1.AbstractC4544a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f27003a;
        if (i10 > 0) {
            if (this.f27009g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f27010h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f27009g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    int i13 = this.f27008f;
                    this.f27010h = view.animate().translationY(i13).setInterpolator(this.f27007e).setDuration(this.f27005c).setListener(new C5200d(3, this));
                    return;
                }
                AbstractC2469q0.p(it.next());
                throw null;
            }
        } else if (i10 < 0 && this.f27009g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f27010h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f27009g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f27010h = view.animate().translationY(0).setInterpolator(this.f27006d).setDuration(this.f27004b).setListener(new C5200d(3, this));
                return;
            }
            AbstractC2469q0.p(it2.next());
            throw null;
        }
    }

    @Override // m1.AbstractC4544a
    public boolean o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
