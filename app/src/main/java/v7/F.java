package v7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.C3636c1;
import t7.C5682d;
import u7.C5849e;

/* loaded from: classes2.dex */
public final class F extends x {

    /* renamed from: b  reason: collision with root package name */
    public final N7.f f47279b;

    public F(N7.f fVar) {
        super(4);
        this.f47279b = fVar;
    }

    @Override // v7.G
    public final void a(Status status) {
        this.f47279b.a(new C5849e(status));
    }

    @Override // v7.G
    public final void b(RuntimeException runtimeException) {
        this.f47279b.a(runtimeException);
    }

    @Override // v7.G
    public final void c(s sVar) {
        try {
            h(sVar);
        } catch (DeadObjectException e10) {
            a(G.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(G.e(e11));
        } catch (RuntimeException e12) {
            this.f47279b.a(e12);
        }
    }

    @Override // v7.x
    public final boolean f(s sVar) {
        AbstractC2469q0.p(sVar.f47333f.get(null));
        return false;
    }

    @Override // v7.x
    public final C5682d[] g(s sVar) {
        AbstractC2469q0.p(sVar.f47333f.get(null));
        return null;
    }

    public final void h(s sVar) {
        AbstractC2469q0.p(sVar.f47333f.remove(null));
        this.f47279b.b(Boolean.FALSE);
    }

    @Override // v7.G
    public final /* bridge */ /* synthetic */ void d(C3636c1 c3636c1, boolean z10) {
    }
}
