package H0;

import Ng.AbstractC1070k;
import Ng.C1072l;
import android.view.Choreographer;

/* renamed from: H0.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class Choreographer$FrameCallbackC0678f0 implements Choreographer.FrameCallback {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1070k f6951Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f6952Z;

    public Choreographer$FrameCallbackC0678f0(C1072l c1072l, C0680g0 c0680g0, wf.k kVar) {
        this.f6951Y = c1072l;
        this.f6952Z = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        Object obj;
        try {
            obj = this.f6952Z.invoke(Long.valueOf(j6));
        } catch (Throwable th2) {
            obj = com.google.android.gms.internal.play_billing.N.w(th2);
        }
        this.f6951Y.resumeWith(obj);
    }
}
