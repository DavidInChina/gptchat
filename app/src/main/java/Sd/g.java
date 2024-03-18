package Sd;

import Ad.l;
import Li.r;
import Qd.i;
import Qd.m;
import Rd.h;
import Rd.j;
import com.segment.analytics.kotlin.core.Settings;
import id.AbstractC3557B;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements j, r {

    /* renamed from: Y  reason: collision with root package name */
    public i f16575Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicBoolean f16576Z = new AtomicBoolean(false);

    /* renamed from: h0  reason: collision with root package name */
    public final ConcurrentLinkedQueue f16577h0 = new ConcurrentLinkedQueue();

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        if (!this.f16576Z.get()) {
            i iVar = this.f16575Y;
            if (iVar != null) {
                r.f.M(iVar, "SegmentStartupQueue queueing event");
                ConcurrentLinkedQueue concurrentLinkedQueue = this.f16577h0;
                if (concurrentLinkedQueue.size() >= 1000) {
                    concurrentLinkedQueue.remove();
                }
                concurrentLinkedQueue.offer(aVar);
                return null;
            }
            AbstractC3557B.C2("analytics");
            throw null;
        }
        return aVar;
    }

    @Override // Rd.j
    public final void c(Settings settings, Rd.i iVar) {
        AbstractC3557B.J2(settings, iVar);
    }

    @Override // Rd.j
    public final void d(i iVar) {
        AbstractC3557B.t2(this, iVar);
        m mVar = iVar.f14611Z;
        l.O0(mVar.b(), mVar.d(), null, new f(iVar, this, null), 2);
    }

    @Override // Rd.j
    public final void e(i iVar) {
        AbstractC3557B.c0("<set-?>", iVar);
        this.f16575Y = iVar;
    }

    @Override // Rd.j
    public final h getType() {
        return h.f15443Y;
    }
}
