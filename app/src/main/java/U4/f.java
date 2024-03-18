package u4;

import Ng.AbstractC1070k;
import Ng.C1072l;
import Wh.AbstractC1660e;
import Wh.AbstractC1661f;
import Wh.D;
import com.google.android.gms.internal.play_billing.N;
import java.io.IOException;
import jf.y;

/* loaded from: classes2.dex */
public final class f implements AbstractC1661f, wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1660e f46391Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC1070k f46392Z;

    public f(ai.j jVar, C1072l c1072l) {
        this.f46391Y = jVar;
        this.f46392Z = c1072l;
    }

    @Override // Wh.AbstractC1661f
    public final void a(ai.j jVar, IOException iOException) {
        if (!jVar.f24270u0) {
            this.f46392Z.resumeWith(N.w(iOException));
        }
    }

    @Override // Wh.AbstractC1661f
    public final void c(ai.j jVar, D d10) {
        this.f46392Z.resumeWith(d10);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        try {
            ((ai.j) this.f46391Y).d();
        } catch (Throwable unused) {
        }
        return y.f36177a;
    }
}
