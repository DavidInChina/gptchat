package Pc;

import f9.p;
import kotlin.jvm.internal.o;
import ld.h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class d extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f13942Y = new o(0);

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object b10 = ld.g.f38286a.b(f.class);
        if (b10 != null) {
            return (c) ((p) ((f) b10)).f29916k.get();
        }
        throw new h("Couldn't find component of type ".concat(f.class.getName()));
    }
}
