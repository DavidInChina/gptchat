package Te;

import Ve.r0;
import We.C;
import Xe.B;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r0 r0Var, We.w wVar, int i10) {
        super(r0Var);
        if (i10 != 1) {
            AbstractC3557B.c0("room", r0Var);
            AbstractC3557B.c0("participant", wVar);
            return;
        }
        AbstractC3557B.c0("room", r0Var);
        AbstractC3557B.c0("participant", wVar);
        super(r0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r0 r0Var, Xe.z zVar, Xe.r rVar, C c10, int i10) {
        super(r0Var);
        if (i10 != 1) {
            AbstractC3557B.c0("participant", c10);
            return;
        }
        AbstractC3557B.c0("participant", c10);
        super(r0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r0 r0Var, B b10, We.w wVar, int i10) {
        super(r0Var);
        if (i10 == 1) {
            AbstractC3557B.c0("room", r0Var);
            AbstractC3557B.c0("publication", b10);
            AbstractC3557B.c0("participant", wVar);
            super(r0Var);
        } else if (i10 == 2) {
            AbstractC3557B.c0("room", r0Var);
            AbstractC3557B.c0("publication", b10);
            AbstractC3557B.c0("participant", wVar);
            super(r0Var);
        } else if (i10 != 3) {
            AbstractC3557B.c0("room", r0Var);
            AbstractC3557B.c0("publication", b10);
            AbstractC3557B.c0("participant", wVar);
        } else {
            AbstractC3557B.c0("room", r0Var);
            AbstractC3557B.c0("publication", b10);
            AbstractC3557B.c0("participant", wVar);
            super(r0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r0 r0Var, List list) {
        super(r0Var);
        AbstractC3557B.c0("speakers", list);
    }
}
