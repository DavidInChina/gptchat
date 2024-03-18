package ke;

import Wh.v;
import Wh.w;
import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;
import me.M;
import me.Q;
import p2.F;

/* loaded from: classes2.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.k implements wf.k {
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.o, wf.k] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        M m10 = (M) obj;
        d dVar = ((k) this.receiver).f37404j0;
        w wVar = dVar.f37380b;
        if (wVar == null) {
            wVar = (w) k.f37403o0.getValue();
        }
        v a5 = wVar.a();
        a5.f21266a = new F();
        dVar.f37379a.invoke(a5);
        if (m10 != null) {
            Long l10 = m10.f39176b;
            long j10 = 0;
            if (l10 != null) {
                long longValue = l10.longValue();
                Ei.a aVar = Q.f39187a;
                if (longValue == Long.MAX_VALUE) {
                    longValue = 0;
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                AbstractC3557B.c0("unit", timeUnit);
                a5.f21289x = Xh.b.b("timeout", longValue, timeUnit);
            }
            Long l11 = m10.f39177c;
            if (l11 != null) {
                long longValue2 = l11.longValue();
                Ei.a aVar2 = Q.f39187a;
                int i10 = (longValue2 > Long.MAX_VALUE ? 1 : (longValue2 == Long.MAX_VALUE ? 0 : -1));
                if (i10 == 0) {
                    j6 = 0;
                } else {
                    j6 = longValue2;
                }
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                AbstractC3557B.c0("unit", timeUnit2);
                a5.f21290y = Xh.b.b("timeout", j6, timeUnit2);
                if (i10 != 0) {
                    j10 = longValue2;
                }
                a5.f21291z = Xh.b.b("timeout", j10, timeUnit2);
            }
        }
        return new w(a5);
    }
}
