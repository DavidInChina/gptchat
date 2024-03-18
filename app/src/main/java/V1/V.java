package V1;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class V implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f18119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f18121c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18122d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f18123e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18124f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ X f18125g;

    public V(X x10, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f18125g = x10;
        this.f18119a = obj;
        this.f18120b = arrayList;
        this.f18123e = obj2;
        this.f18124f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        X x10 = this.f18125g;
        Object obj = this.f18119a;
        if (obj != null) {
            x10.t(obj, this.f18120b, null);
        }
        Object obj2 = this.f18121c;
        if (obj2 != null) {
            x10.t(obj2, this.f18122d, null);
        }
        Object obj3 = this.f18123e;
        if (obj3 != null) {
            x10.t(obj3, this.f18124f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
