package q4;

import androidx.lifecycle.AbstractC2085u;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.S;

/* loaded from: classes.dex */
public final class g extends S {

    /* renamed from: d  reason: collision with root package name */
    public static final g f43786d = new S();

    /* renamed from: e  reason: collision with root package name */
    public static final f f43787e = new Object();

    @Override // androidx.lifecycle.S
    public final void a(AbstractC2085u abstractC2085u) {
        if (abstractC2085u instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) abstractC2085u;
            f fVar = f43787e;
            defaultLifecycleObserver.onCreate(fVar);
            defaultLifecycleObserver.onStart(fVar);
            defaultLifecycleObserver.onResume(fVar);
            return;
        }
        throw new IllegalArgumentException((abstractC2085u + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.S
    public final EnumC2082q f() {
        return EnumC2082q.f25379j0;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.S
    public final void g(AbstractC2085u abstractC2085u) {
    }
}
