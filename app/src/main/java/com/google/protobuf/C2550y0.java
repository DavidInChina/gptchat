package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2550y0 extends AbstractC2552z0 {
    @Override // com.google.protobuf.AbstractC2552z0
    public final void a(long j6, Object obj) {
        ((AbstractC2496d) ((AbstractC2535q0) C1.f27385c.k(j6, obj))).f27534Y = false;
    }

    @Override // com.google.protobuf.AbstractC2552z0
    public final void b(long j6, Object obj, Object obj2) {
        B1 b1 = C1.f27385c;
        AbstractC2535q0 abstractC2535q0 = (AbstractC2535q0) b1.k(j6, obj);
        AbstractC2535q0 abstractC2535q02 = (AbstractC2535q0) b1.k(j6, obj2);
        int size = abstractC2535q0.size();
        int size2 = abstractC2535q02.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
                abstractC2535q0 = abstractC2535q0.h(size2 + size);
            }
            abstractC2535q0.addAll(abstractC2535q02);
        }
        if (size > 0) {
            abstractC2535q02 = abstractC2535q0;
        }
        C1.v(j6, obj, abstractC2535q02);
    }

    @Override // com.google.protobuf.AbstractC2552z0
    public final List c(long j6, Object obj) {
        int i10;
        AbstractC2535q0 abstractC2535q0 = (AbstractC2535q0) C1.f27385c.k(j6, obj);
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            int size = abstractC2535q0.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            AbstractC2535q0 h10 = abstractC2535q0.h(i10);
            C1.v(j6, obj, h10);
            return h10;
        }
        return abstractC2535q0;
    }
}
