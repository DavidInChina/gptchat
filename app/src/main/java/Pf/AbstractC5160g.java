package pf;

import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;

/* renamed from: pf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5160g extends AbstractC5154a {
    public AbstractC5160g(AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        if (abstractC4825e != null && abstractC4825e.getContext() != C4832l.f40334Y) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return C4832l.f40334Y;
    }
}
