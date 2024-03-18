package kotlin.jvm.internal;

import Df.AbstractC0404c;
import Df.AbstractC0405d;
import Gf.AbstractC0644s;

/* loaded from: classes.dex */
public class q extends r implements Df.l {
    public q(AbstractC0405d abstractC0405d, String str, String str2) {
        super(AbstractC4305d.NO_RECEIVER, ((AbstractC4306e) abstractC0405d).f(), str, str2, !(abstractC0405d instanceof AbstractC0405d) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0404c computeReflected() {
        return C.f37623a.e(this);
    }

    @Override // Df.s
    public final Df.r d() {
        return ((Df.l) getReflected()).d();
    }

    public Object get(Object obj) {
        return ((AbstractC0644s) d()).call(obj);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Df.m
    /* renamed from: b */
    public final Df.k mo11b() {
        return ((Df.l) getReflected()).mo11b();
    }

    public q(Class cls, String str, String str2, int i10) {
        super(AbstractC4305d.NO_RECEIVER, cls, str, str2, i10);
    }
}
