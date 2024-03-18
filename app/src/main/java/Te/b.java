package Te;

import Ng.D0;
import Ng.F;
import Qg.m0;
import Qg.r0;
import Qg.s0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f17184a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f17185b;

    public b() {
        r0 b10 = s0.b(0, Integer.MAX_VALUE, null, 5);
        this.f17184a = b10;
        this.f17185b = new m0(b10);
    }

    public final D0 a(W w10, F f6) {
        AbstractC3557B.c0("scope", f6);
        return Ad.l.O0(f6, null, null, new a(this, w10, null), 3);
    }

    public final Object b(Object obj, AbstractC4825e abstractC4825e) {
        Object c10 = this.f17184a.c(obj, abstractC4825e);
        if (c10 == EnumC5000a.f41328Y) {
            return c10;
        }
        return jf.y.f36177a;
    }
}
