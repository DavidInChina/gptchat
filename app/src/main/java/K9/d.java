package k9;

import Pc.e;
import gf.AbstractC3268i;
import id.AbstractC3557B;
import io.opentracing.util.GlobalTracer;
import vd.AbstractC6028c;
import vd.EnumC6026a;
import x8.W;

/* loaded from: classes2.dex */
public final class d implements AbstractC6028c {
    public final c a(EnumC6026a enumC6026a) {
        if (GlobalTracer.f33707Y instanceof AbstractC3268i) {
            W.W(e.a(), "Attempting to trace before Tracing is initialized!", null, null, 6);
        }
        ff.e E10 = GlobalTracer.f33708Z.E(enumC6026a.toString());
        AbstractC3557B.b0("buildSpan(...)", E10);
        return new c(E10);
    }
}
