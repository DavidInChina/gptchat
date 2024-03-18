package Ie;

import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import pf.AbstractC5157d;

/* loaded from: classes.dex */
public final class i implements AbstractC5157d, AbstractC4825e {

    /* renamed from: Y  reason: collision with root package name */
    public static final i f8582Y = new Object();

    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        return null;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return C4832l.f40334Y;
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.".toString());
    }
}
