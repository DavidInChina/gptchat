package S3;

import android.content.Context;
import android.os.Build;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final f f16129a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16130b;

    /* renamed from: c  reason: collision with root package name */
    public final f f16131c;

    /* renamed from: d  reason: collision with root package name */
    public final f f16132d;

    public m(Context context, X3.b bVar) {
        f fVar;
        Context applicationContext = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext);
        a aVar = new a(applicationContext, bVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext2);
        a aVar2 = new a(applicationContext2, bVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext3);
        String str = j.f16126a;
        AbstractC3557B.c0("taskExecutor", bVar);
        if (Build.VERSION.SDK_INT >= 24) {
            fVar = new i(applicationContext3, bVar);
        } else {
            fVar = new k(applicationContext3, bVar);
        }
        Context applicationContext4 = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext4);
        a aVar3 = new a(applicationContext4, bVar, 2);
        AbstractC3557B.c0("taskExecutor", bVar);
        this.f16129a = aVar;
        this.f16130b = aVar2;
        this.f16131c = fVar;
        this.f16132d = aVar3;
    }
}
