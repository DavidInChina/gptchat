package A5;

import id.AbstractC3557B;
import java.util.Queue;
import q5.C5271a;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final Queue f694Y;

    /* renamed from: Z  reason: collision with root package name */
    public final u5.g f695Z;

    /* renamed from: h0  reason: collision with root package name */
    public final y5.h f696h0;

    public u(Queue queue, u5.g gVar, y5.h hVar) {
        AbstractC3557B.c0("taskQueue", queue);
        AbstractC3557B.c0("sdkCore", gVar);
        AbstractC3557B.c0("feature", hVar);
        this.f694Y = queue;
        this.f695Z = gVar;
        this.f696h0 = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u5.g gVar = this.f695Z;
        C5271a o10 = gVar.o();
        if (o10 == null) {
            return;
        }
        y5.h hVar = this.f696h0;
        F5.l lVar = hVar.f50817f;
        e eVar = hVar.f50818g;
        F5.c w10 = lVar.w();
        if (w10 != null) {
            t i10 = eVar.i(o10, w10.f5035b, w10.f5036c);
            lVar.c(w10.f5034a, new C5.d(i10.f693b), !i10.f692a);
            Queue queue = this.f694Y;
            queue.offer(new u(queue, gVar, hVar));
        }
    }
}
