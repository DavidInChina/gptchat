package ed;

import Qg.F0;
import android.app.Activity;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import id.AbstractC3557B;
import java.util.Set;
import kf.AbstractC4273I;

/* renamed from: ed.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2875a implements DefaultLifecycleObserver {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2877c f29276Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f29277Z;

    public C2875a(C2877c c2877c, Activity activity) {
        this.f29276Y = c2877c;
        this.f29277Z = activity;
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
        Object value;
        AbstractC3557B.c0("owner", abstractC2086v);
        F0 f02 = this.f29276Y.f29280b;
        do {
            value = f02.getValue();
        } while (!f02.e(value, AbstractC4273I.v2((Set) value, this.f29277Z)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(AbstractC2086v abstractC2086v) {
        Object value;
        AbstractC3557B.c0("owner", abstractC2086v);
        F0 f02 = this.f29276Y.f29280b;
        do {
            value = f02.getValue();
        } while (!f02.e(value, AbstractC4273I.s2((Set) value, this.f29277Z)));
    }
}
