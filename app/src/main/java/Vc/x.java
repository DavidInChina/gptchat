package Vc;

import id.AbstractC3557B;
import wd.p0;
import wd.q0;
import wd.r0;
import wd.s0;
import wd.t0;
import wd.u0;
import wd.v0;

/* loaded from: classes2.dex */
public abstract class x {
    public static q0 a(r rVar) {
        AbstractC3557B.c0("<this>", rVar);
        boolean z10 = rVar instanceof v;
        Throwable th2 = rVar.f18561a;
        if (z10) {
            v vVar = (v) rVar;
            return new t0(th2, Integer.valueOf(vVar.f18562b), vVar.f18563c, vVar.f18564d);
        } else if (rVar instanceof s) {
            return new r0(th2);
        } else {
            if (rVar instanceof u) {
                return new s0(2, th2);
            }
            if (rVar instanceof t) {
                return new s0(0, th2);
            }
            throw new RuntimeException();
        }
    }

    public final v0 b() {
        if (this instanceof w) {
            w wVar = (w) this;
            return new u0(jf.y.f36177a);
        } else if (this instanceof q) {
            return p0.f48449a;
        } else {
            if (this instanceof r) {
                return a((r) this);
            }
            throw new RuntimeException();
        }
    }
}
