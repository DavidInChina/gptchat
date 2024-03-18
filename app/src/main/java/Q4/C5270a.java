package q4;

import Ng.AbstractC1073l0;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.S;

/* renamed from: q4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5270a implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final S f43745Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC1073l0 f43746Z;

    public C5270a(S s10, AbstractC1073l0 abstractC1073l0) {
        this.f43745Y = s10;
        this.f43746Z = abstractC1073l0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(AbstractC2086v abstractC2086v) {
        this.f43746Z.k(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(AbstractC2086v abstractC2086v) {
        AbstractC2072g.c(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(AbstractC2086v abstractC2086v) {
        AbstractC2072g.d(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(AbstractC2086v abstractC2086v) {
        AbstractC2072g.e(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(AbstractC2086v abstractC2086v) {
        AbstractC2072g.f(this, abstractC2086v);
    }
}
