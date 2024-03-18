package S3;

import L3.s;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class k extends d {

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f16127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, X3.b bVar) {
        super(context, bVar);
        AbstractC3557B.c0("taskExecutor", bVar);
        Object systemService = this.f16117b.getSystemService("connectivity");
        AbstractC3557B.a0("null cannot be cast to non-null type android.net.ConnectivityManager", systemService);
        this.f16127g = (ConnectivityManager) systemService;
    }

    @Override // S3.f
    public final Object a() {
        return j.a(this.f16127g);
    }

    @Override // S3.d
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // S3.d
    public final void f(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        if (AbstractC3557B.K(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            s.d().a(j.f16126a, "Network broadcast received");
            b(j.a(this.f16127g));
        }
    }
}
