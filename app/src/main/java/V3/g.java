package V3;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import io.sentry.C3692x;
import io.sentry.X0;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18350b;

    public /* synthetic */ g(int i10, Object obj) {
        this.f18349a = i10;
        this.f18350b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10;
        int i11 = 0;
        switch (this.f18349a) {
            case 0:
                F4.a aVar = (F4.a) this.f18350b;
                AbstractC3557B.c0("this$0", aVar);
                WorkDatabase workDatabase = (WorkDatabase) aVar.f5033Z;
                Long w10 = workDatabase.q().w("next_alarm_manager_id");
                if (w10 != null) {
                    i10 = (int) w10.longValue();
                } else {
                    i10 = 0;
                }
                if (i10 != Integer.MAX_VALUE) {
                    i11 = i10 + 1;
                }
                workDatabase.q().x(new U3.d("next_alarm_manager_id", Long.valueOf(i11)));
                return Integer.valueOf(i10);
            case 1:
                C3692x c3692x = (C3692x) this.f18350b;
                C3692x c3692x2 = C3692x.f34822i;
                c3692x.getClass();
                try {
                    c3692x.f34824b = ((InetAddress) c3692x.f34827e.call()).getCanonicalHostName();
                    c3692x.f34825c = System.currentTimeMillis() + c3692x.f34823a;
                    return null;
                } finally {
                    c3692x.f34826d.set(false);
                }
            default:
                Charset charset = X0.f33883d;
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry : ((io.sentry.metrics.a) this.f18350b).f34430a.entrySet()) {
                    ((Long) entry.getKey()).getClass();
                    Collection values = ((Map) entry.getValue()).values();
                    int i12 = io.sentry.metrics.b.f34432b;
                    Iterator it = values.iterator();
                    if (it.hasNext()) {
                        AbstractC2469q0.p(it.next());
                        throw null;
                    }
                }
                return sb2.toString().getBytes(io.sentry.metrics.a.f34429b);
        }
    }
}
