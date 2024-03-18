package wh;

import sh.AbstractC5631c;
import yh.C6640u0;
import yh.l1;

/* renamed from: wh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6241f extends AbstractC6236a implements AbstractC6242g {
    public l1.a T() {
        if (h1(8)) {
            l1.a aVar = l1.a.f51045N;
            return null;
        } else if (W0()) {
            l1 mo118a = mo118a();
            l1 W6 = mo118a().W();
            if (W6 == null) {
                return C6640u0.i1(mo118a);
            }
            if (mo118a.r()) {
                return W6.w0();
            }
            return C6640u0.i1(W6);
        } else {
            return C6640u0.i1(mo118a());
        }
    }

    public AbstractC5631c y() {
        return this;
    }
}
