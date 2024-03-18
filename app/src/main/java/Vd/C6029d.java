package vd;

import f9.p;
import kotlin.jvm.internal.o;
import ld.g;
import ld.h;
import wf.AbstractC6216a;

/* renamed from: vd.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6029d extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final C6029d f47476Y = new o(0);

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object b10 = g.f38286a.b(AbstractC6031f.class);
        if (b10 != null) {
            return (AbstractC6028c) ((p) ((AbstractC6031f) b10)).f29889R.get();
        }
        throw new h("Couldn't find component of type ".concat(AbstractC6031f.class.getName()));
    }
}
