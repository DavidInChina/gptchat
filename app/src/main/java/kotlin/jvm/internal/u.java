package kotlin.jvm.internal;

import Df.AbstractC0404c;
import Df.AbstractC0405d;
import Df.AbstractC0407f;
import Gf.AbstractC0644s;

/* loaded from: classes.dex */
public class u extends w implements Df.s {
    public u(AbstractC0407f abstractC0407f, String str, String str2) {
        super(AbstractC4305d.NO_RECEIVER, ((AbstractC4306e) abstractC0407f).f(), str, str2, !(abstractC0407f instanceof AbstractC0405d) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0404c computeReflected() {
        return C.f37623a.g(this);
    }

    @Override // Df.s
    public final Df.r d() {
        return ((Df.s) getReflected()).d();
    }

    public Object get(Object obj) {
        return ((AbstractC0644s) d()).call(obj);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    public u(Class cls, String str, String str2, int i10) {
        super(AbstractC4305d.NO_RECEIVER, cls, str, str2, i10);
    }
}
