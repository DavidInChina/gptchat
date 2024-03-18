package v7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.C3636c1;
import java.util.Map;
import t7.C5682d;
import u7.C5849e;

/* loaded from: classes2.dex */
public final class E extends x {

    /* renamed from: b  reason: collision with root package name */
    public final l f47276b;

    /* renamed from: c  reason: collision with root package name */
    public final N7.f f47277c;

    /* renamed from: d  reason: collision with root package name */
    public final f8.e f47278d;

    public E(int i10, l lVar, N7.f fVar, f8.e eVar) {
        super(i10);
        this.f47277c = fVar;
        this.f47276b = lVar;
        this.f47278d = eVar;
        if (i10 == 2 && lVar.f47317c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // v7.G
    public final void a(Status status) {
        C5849e c5849e;
        this.f47278d.getClass();
        if (status.f26809h0 != null) {
            c5849e = new C5849e(status);
        } else {
            c5849e = new C5849e(status);
        }
        this.f47277c.a(c5849e);
    }

    @Override // v7.G
    public final void b(RuntimeException runtimeException) {
        this.f47277c.a(runtimeException);
    }

    @Override // v7.G
    public final void c(s sVar) {
        N7.f fVar = this.f47277c;
        try {
            this.f47276b.c(sVar.f47329b, fVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(G.e(e11));
        } catch (RuntimeException e12) {
            fVar.a(e12);
        }
    }

    @Override // v7.G
    public final void d(C3636c1 c3636c1, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        N7.f fVar = this.f47277c;
        ((Map) c3636c1.f34286h0).put(fVar, valueOf);
        fVar.f12723a.a(new n(c3636c1, fVar, 0));
    }

    @Override // v7.x
    public final boolean f(s sVar) {
        return this.f47276b.f47317c;
    }

    @Override // v7.x
    public final C5682d[] g(s sVar) {
        return (C5682d[]) this.f47276b.f47316b;
    }
}
