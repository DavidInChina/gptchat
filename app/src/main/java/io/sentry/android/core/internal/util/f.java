package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.RunnableC3615f;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnDrawListener {

    /* renamed from: Y  reason: collision with root package name */
    public final Handler f34166Y = new Handler(Looper.getMainLooper());

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicReference f34167Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f34168h0;

    public f(View view, RunnableC3615f runnableC3615f) {
        this.f34167Z = new AtomicReference(view);
        this.f34168h0 = runnableC3615f;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f34167Z.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.e
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f fVar = f.this;
                fVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(fVar);
            }
        });
        this.f34166Y.postAtFrontOfQueue(this.f34168h0);
    }
}
