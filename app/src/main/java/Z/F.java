package Z;

import Ng.AbstractC1070k;
import Ng.C1072l;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class F implements Choreographer.FrameCallback {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1070k f22487Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f22488Z;

    public F(C1072l c1072l, wf.k kVar) {
        this.f22487Y = c1072l;
        this.f22488Z = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        Object obj;
        G g10 = G.f22490Y;
        try {
            obj = this.f22488Z.invoke(Long.valueOf(j6));
        } catch (Throwable th2) {
            obj = com.google.android.gms.internal.play_billing.N.w(th2);
        }
        this.f22487Y.resumeWith(obj);
    }
}
