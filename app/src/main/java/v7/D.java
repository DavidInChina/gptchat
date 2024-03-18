package v7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import java.util.Map;
import w7.AbstractC6134f;

/* loaded from: classes2.dex */
public final class D extends G {

    /* renamed from: b  reason: collision with root package name */
    public final s7.h f47275b;

    public D(s7.g gVar) {
        super(1);
        this.f47275b = gVar;
    }

    @Override // v7.G
    public final void a(Status status) {
        boolean z10;
        try {
            s7.h hVar = this.f47275b;
            hVar.getClass();
            if (status.f26807Y <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                hVar.J0(status);
                return;
            }
            throw new IllegalArgumentException("Failed result must not be success");
        } catch (IllegalStateException e10) {
            AbstractC3612c.s("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // v7.G
    public final void b(RuntimeException runtimeException) {
        Status status = new Status(10, android.gov.nist.core.a.j(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null);
        try {
            s7.h hVar = this.f47275b;
            hVar.getClass();
            if (!false) {
                hVar.J0(status);
                return;
            }
            throw new IllegalArgumentException("Failed result must not be success");
        } catch (IllegalStateException e10) {
            AbstractC3612c.s("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // v7.G
    public final void c(s sVar) {
        try {
            s7.h hVar = this.f47275b;
            AbstractC6134f abstractC6134f = sVar.f47329b;
            hVar.getClass();
            try {
                hVar.K0(abstractC6134f);
            } catch (DeadObjectException e10) {
                hVar.J0(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                hVar.J0(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // v7.G
    public final void d(C3636c1 c3636c1, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        s7.h hVar = this.f47275b;
        ((Map) c3636c1.f34285Z).put(hVar, valueOf);
        hVar.F0(new m(c3636c1, hVar));
    }
}
