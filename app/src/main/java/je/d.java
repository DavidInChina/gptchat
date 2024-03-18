package je;

import Ng.AbstractC1085t;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.Q;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.C3963m;
import kf.x;
import nf.AbstractC4829i;
import nf.AbstractC4831k;
import zc.u;

/* loaded from: classes.dex */
public abstract class d implements c {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36127i0 = AtomicIntegerFieldUpdater.newUpdater(d.class, "closed");

    /* renamed from: Y  reason: collision with root package name */
    public final String f36128Y = "ktor-okhttp";
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Tg.d f36129Z = Q.f12906c;

    /* renamed from: h0  reason: collision with root package name */
    public final C3963m f36130h0 = R4.b.D1(new u(9, this));

    @Override // je.c
    public Set K() {
        return x.f37485Y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC1085t abstractC1085t;
        if (!f36127i0.compareAndSet(this, 0, 1)) {
            return;
        }
        AbstractC4829i abstractC4829i = i().get(C1071k0.f12951Y);
        if (abstractC4829i instanceof AbstractC1085t) {
            abstractC1085t = (AbstractC1085t) abstractC4829i;
        } else {
            abstractC1085t = null;
        }
        if (abstractC1085t == null) {
            return;
        }
        ((C1079o0) abstractC1085t).q0();
    }

    @Override // Ng.F
    public AbstractC4831k i() {
        return (AbstractC4831k) this.f36130h0.getValue();
    }
}
