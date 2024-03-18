package S3;

import L3.s;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import id.AbstractC3557B;
import m.C4507D;

/* loaded from: classes2.dex */
public abstract class d extends f {

    /* renamed from: f  reason: collision with root package name */
    public final C4507D f16114f = new C4507D(4, this);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, X3.b bVar) {
        super(context, bVar);
        AbstractC3557B.c0("taskExecutor", bVar);
    }

    @Override // S3.f
    public final void c() {
        s.d().a(e.f16115a, getClass().getSimpleName().concat(": registering receiver"));
        this.f16117b.registerReceiver(this.f16114f, e());
    }

    @Override // S3.f
    public final void d() {
        s.d().a(e.f16115a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f16117b.unregisterReceiver(this.f16114f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
