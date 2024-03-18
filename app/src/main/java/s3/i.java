package S3;

import L3.s;
import android.content.Context;
import android.net.ConnectivityManager;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class i extends f {

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f16124f;

    /* renamed from: g  reason: collision with root package name */
    public final h f16125g = new h(0, this);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, X3.b bVar) {
        super(context, bVar);
        AbstractC3557B.c0("taskExecutor", bVar);
        Object systemService = this.f16117b.getSystemService("connectivity");
        AbstractC3557B.a0("null cannot be cast to non-null type android.net.ConnectivityManager", systemService);
        this.f16124f = (ConnectivityManager) systemService;
    }

    @Override // S3.f
    public final Object a() {
        return j.a(this.f16124f);
    }

    @Override // S3.f
    public final void c() {
        try {
            s.d().a(j.f16126a, "Registering network callback");
            V3.k.a(this.f16124f, this.f16125g);
        } catch (IllegalArgumentException e10) {
            s.d().c(j.f16126a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            s.d().c(j.f16126a, "Received exception while registering network callback", e11);
        }
    }

    @Override // S3.f
    public final void d() {
        try {
            s.d().a(j.f16126a, "Unregistering network callback");
            V3.i.c(this.f16124f, this.f16125g);
        } catch (IllegalArgumentException e10) {
            s.d().c(j.f16126a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            s.d().c(j.f16126a, "Received exception while unregistering network callback", e11);
        }
    }
}
