package sd;

import id.AbstractC3557B;
import kf.q;
import kf.t;
import nd.C4812a;
import rd.AbstractC5482f;
import td.C5756a;

/* renamed from: sd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5614c extends AbstractC5482f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5614c(C5613b c5613b, String str, C5756a c5756a, Object obj) {
        super(c5613b.f45531a, c5613b.f45532b, t.m2(q.h3(new String[]{r2.f40278e, str}), "_", null, null, null, 62), c5756a, obj);
        AbstractC3557B.c0("dependencies", c5613b);
        C4812a c4812a = c5613b.f45533c;
        AbstractC3557B.c0("accountSession", c4812a);
        c5613b.f45534d.a(new C5612a(this, null));
    }
}
