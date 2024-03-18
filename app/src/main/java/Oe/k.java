package oe;

import Lg.n;
import id.AbstractC3557B;
import xe.AbstractC6414c;
import xe.AbstractC6418g;
import xe.C6417f;

/* loaded from: classes.dex */
public final class k implements AbstractC6418g {

    /* renamed from: a  reason: collision with root package name */
    public static final k f41327a = new Object();

    @Override // xe.AbstractC6418g
    public final boolean a(C6417f c6417f) {
        AbstractC3557B.c0("contentType", c6417f);
        if (c6417f.b(AbstractC6414c.f49880a)) {
            return true;
        }
        if (!c6417f.f49951b.isEmpty()) {
            c6417f = new C6417f(c6417f.f49886c, c6417f.f49887d);
        }
        String abstractC6429r = c6417f.toString();
        if (n.I2(abstractC6429r, "application/", false) && n.c2(abstractC6429r, "+json", false)) {
            return true;
        }
        return false;
    }
}
