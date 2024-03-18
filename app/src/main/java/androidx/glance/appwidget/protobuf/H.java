package androidx.glance.appwidget.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public final class H extends I {
    @Override // androidx.glance.appwidget.protobuf.I
    public final void a(long j6, Object obj) {
        ((AbstractC2043c) ((AbstractC2065z) m0.f25250c.i(j6, obj))).f25202Y = false;
    }

    @Override // androidx.glance.appwidget.protobuf.I
    public final void b(long j6, Object obj, Object obj2) {
        l0 l0Var = m0.f25250c;
        AbstractC2065z abstractC2065z = (AbstractC2065z) l0Var.i(j6, obj);
        AbstractC2065z abstractC2065z2 = (AbstractC2065z) l0Var.i(j6, obj2);
        int size = abstractC2065z.size();
        int size2 = abstractC2065z2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC2043c) abstractC2065z).f25202Y) {
                abstractC2065z = abstractC2065z.h(size2 + size);
            }
            abstractC2065z.addAll(abstractC2065z2);
        }
        if (size > 0) {
            abstractC2065z2 = abstractC2065z;
        }
        m0.s(j6, obj, abstractC2065z2);
    }

    @Override // androidx.glance.appwidget.protobuf.I
    public final List c(long j6, Object obj) {
        int i10;
        AbstractC2065z abstractC2065z = (AbstractC2065z) m0.f25250c.i(j6, obj);
        if (!((AbstractC2043c) abstractC2065z).f25202Y) {
            int size = abstractC2065z.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            AbstractC2065z h10 = abstractC2065z.h(i10);
            m0.s(j6, obj, h10);
            return h10;
        }
        return abstractC2065z;
    }
}
