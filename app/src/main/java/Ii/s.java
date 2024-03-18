package Ii;

import android.os.MessageQueue;
import android.os.SystemClock;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements MessageQueue.IdleHandler {
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        Hi.c cVar = v.f8691c;
        if (cVar != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - cVar.f7833b;
            Hi.c cVar2 = v.f8691c;
            if (cVar2 != null) {
                v.f8691c = Hi.c.a(cVar2, Long.valueOf(uptimeMillis), null, null, null, null, null, null, null, null, null, null, null, null, null, -65537);
                return false;
            }
            AbstractC3557B.C2("appStartData");
            throw null;
        }
        AbstractC3557B.C2("appStartData");
        throw null;
    }
}
