package q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import i8.C3494l;
import java.util.ArrayList;
import t1.AbstractC5656b;

/* renamed from: q.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5200d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43408a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f43409b;

    public /* synthetic */ C5200d(int i10, Object obj) {
        this.f43408a = i10;
        this.f43409b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f43408a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f43409b;
                actionBarOverlayLayout.f24481D0 = null;
                actionBarOverlayLayout.f24496r0 = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f43408a;
        Object obj = this.f43409b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f24481D0 = null;
                actionBarOverlayLayout.f24496r0 = false;
                return;
            case 1:
                ((G3.s) obj).n();
                animator.removeListener(this);
                return;
            case 2:
                H3.e eVar = (H3.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f7363j0);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ColorStateList colorStateList = ((V7.a) arrayList.get(i11)).f18412b.f18433v0;
                    if (colorStateList != null) {
                        AbstractC5656b.h(eVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f27010h = null;
                return;
            case 4:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 5:
                AbstractC2469q0.p(obj);
                throw null;
            case 6:
                C3494l c3494l = (C3494l) obj;
                c3494l.q();
                c3494l.f32788r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f43408a;
        Object obj = this.f43409b;
        switch (i10) {
            case 2:
                H3.e eVar = (H3.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f7363j0);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((V7.a) arrayList.get(i11)).a(eVar);
                }
                return;
            case 5:
                AbstractC2469q0.p(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
