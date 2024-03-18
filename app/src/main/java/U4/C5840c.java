package u4;

import Ng.AbstractC1070k;
import Ng.C1072l;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import jf.y;

/* renamed from: u4.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5840c implements DefaultLifecycleObserver {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1070k f46386Y;

    public C5840c(C1072l c1072l) {
        this.f46386Y = c1072l;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC2072g.b(this, abstractC2086v);
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
    public final void onStart(AbstractC2086v abstractC2086v) {
        this.f46386Y.resumeWith(y.f36177a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(AbstractC2086v abstractC2086v) {
        AbstractC2072g.f(this, abstractC2086v);
    }
}
