package Z;

import h0.AbstractC3293f;
import h0.C3292e;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f22640a = new AtomicReference(AbstractC3293f.f31688a);

    /* renamed from: b  reason: collision with root package name */
    public final Object f22641b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public Object f22642c;

    public final Object a() {
        if (Thread.currentThread().getId() == AbstractC1703c.f22605a) {
            return this.f22642c;
        }
        C3292e c3292e = (C3292e) this.f22640a.get();
        int a5 = c3292e.a(Thread.currentThread().getId());
        if (a5 >= 0) {
            return c3292e.f31687c[a5];
        }
        return null;
    }

    public final void b(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == AbstractC1703c.f22605a) {
            this.f22642c = obj;
            return;
        }
        synchronized (this.f22641b) {
            C3292e c3292e = (C3292e) this.f22640a.get();
            int a5 = c3292e.a(id2);
            if (a5 < 0) {
                this.f22640a.set(c3292e.b(id2, obj));
            } else {
                c3292e.f31687c[a5] = obj;
            }
        }
    }
}
