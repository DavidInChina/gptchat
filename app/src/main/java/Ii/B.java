package Ii;

import android.os.Handler;
import android.view.Choreographer;

/* loaded from: classes2.dex */
public final class B implements Choreographer.FrameCallback {

    /* renamed from: Y  reason: collision with root package name */
    public Hi.j f8625Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Choreographer f8626Z = Choreographer.getInstance();

    public B(Hi.j jVar) {
        this.f8625Y = jVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        AbstractC0804i.b((Handler) AbstractC0804i.f8654a.getValue(), new Uf.A(25, this));
        this.f8626Z.postFrameCallback(this);
    }
}
