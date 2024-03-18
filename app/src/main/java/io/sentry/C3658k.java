package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

/* renamed from: io.sentry.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3658k extends TimerTask {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34404Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f34405Z;

    public /* synthetic */ C3658k(int i10, Object obj) {
        this.f34404Y = i10;
        this.f34405Z = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [io.sentry.z0, java.lang.Object] */
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i10 = this.f34404Y;
        Object obj = this.f34405Z;
        switch (i10) {
            case 0:
                Iterator it = ((C3661l) obj).f34412d.iterator();
                while (it.hasNext()) {
                    ((M) it.next()).c();
                }
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                C3661l c3661l = (C3661l) obj;
                if (currentTimeMillis - c3661l.f34417i >= 10) {
                    c3661l.f34417i = currentTimeMillis;
                    ?? obj2 = new Object();
                    obj2.f34857a = null;
                    obj2.f34858b = null;
                    Iterator it2 = c3661l.f34412d.iterator();
                    while (it2.hasNext()) {
                        ((M) it2.next()).a(obj2);
                    }
                    for (List list : c3661l.f34411c.values()) {
                        list.add(obj2);
                    }
                    return;
                }
                return;
            default:
                io.sentry.android.core.K k10 = (io.sentry.android.core.K) obj;
                k10.getClass();
                C3640e c3640e = new C3640e();
                c3640e.f34320h0 = ParameterNames.SESSION;
                c3640e.a("state", "end");
                c3640e.f34322j0 = "app.lifecycle";
                c3640e.f34323k0 = EnumC3642e1.INFO;
                G g10 = k10.f33988k0;
                g10.i(c3640e);
                g10.z();
                return;
        }
    }
}
