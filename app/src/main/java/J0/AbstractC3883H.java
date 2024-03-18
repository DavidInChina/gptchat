package j0;

import Z.C1709f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j0.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3883H implements AbstractC3882G {

    /* renamed from: Y  reason: collision with root package name */
    public final C1709f f35853Y = new AtomicInteger(0);

    public final boolean f(int i10) {
        if ((i10 & this.f35853Y.get()) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i10) {
        C1709f c1709f;
        int i11;
        do {
            c1709f = this.f35853Y;
            i11 = c1709f.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!c1709f.compareAndSet(i11, i11 | i10));
    }

    @Override // j0.AbstractC3882G
    public /* synthetic */ AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        return null;
    }
}
