package ef;

import Ad.l;
import Lg.n;
import Ng.C1057d0;
import Ve.C1509n;
import id.AbstractC3557B;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nf.AbstractC4825e;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f29375a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1057d0 f29376b;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new d());
        f29375a = newSingleThreadExecutor;
        AbstractC3557B.b0("executor", newSingleThreadExecutor);
        f29376b = new C1057d0(newSingleThreadExecutor);
    }

    public static final Object a(AbstractC6216a abstractC6216a) {
        String name = Thread.currentThread().getName();
        AbstractC3557B.b0("currentThread().name", name);
        if (n.I2(name, "LK_RTC_THREAD", false)) {
            return abstractC6216a.mo122invoke();
        }
        return f29375a.submit(new CallableC2892a(abstractC6216a, 1)).get();
    }

    public static final void b(AbstractC6216a abstractC6216a) {
        String name = Thread.currentThread().getName();
        AbstractC3557B.b0("currentThread().name", name);
        if (n.I2(name, "LK_RTC_THREAD", false)) {
            abstractC6216a.mo122invoke();
            return;
        }
        f29375a.submit(new CallableC2892a(abstractC6216a, 0));
    }

    public static final Object c(C1509n c1509n, AbstractC4825e abstractC4825e) {
        return l.e0(new c(c1509n, null), abstractC4825e);
    }
}
