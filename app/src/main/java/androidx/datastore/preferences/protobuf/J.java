package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class J extends K {
    @Override // androidx.datastore.preferences.protobuf.K
    public final void a(long j6, Object obj) {
        ((AbstractC2013c) ((A) x0.f25132d.i(j6, obj))).f25029Y = false;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final void b(long j6, Object obj, Object obj2) {
        w0 w0Var = x0.f25132d;
        A a5 = (A) w0Var.i(j6, obj);
        A a10 = (A) w0Var.i(j6, obj2);
        int size = a5.size();
        int size2 = a10.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC2013c) a5).f25029Y) {
                a5 = a5.h(size2 + size);
            }
            a5.addAll(a10);
        }
        if (size > 0) {
            a10 = a5;
        }
        x0.r(j6, obj, a10);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final List c(long j6, Object obj) {
        int i10;
        A a5 = (A) x0.f25132d.i(j6, obj);
        if (!((AbstractC2013c) a5).f25029Y) {
            int size = a5.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            A h10 = a5.h(i10);
            x0.r(j6, obj, h10);
            return h10;
        }
        return a5;
    }
}
