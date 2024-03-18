package S3;

import android.content.Context;
import id.AbstractC3557B;
import java.util.LinkedHashSet;
import kf.t;
import m.RunnableC4517N;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final X3.b f16116a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16117b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16118c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f16119d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public Object f16120e;

    public f(Context context, X3.b bVar) {
        AbstractC3557B.c0("taskExecutor", bVar);
        this.f16116a = bVar;
        Context applicationContext = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext);
        this.f16117b = applicationContext;
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f16118c) {
            Object obj2 = this.f16120e;
            if (obj2 != null && AbstractC3557B.K(obj2, obj)) {
                return;
            }
            this.f16120e = obj;
            this.f16116a.f21782d.execute(new RunnableC4517N(t.K2(this.f16119d), 22, this));
        }
    }

    public abstract void c();

    public abstract void d();
}
