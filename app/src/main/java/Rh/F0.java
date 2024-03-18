package Rh;

import th.AbstractC5809q;
import wh.AbstractC6242g;
import yh.AbstractC6632q;

/* loaded from: classes.dex */
public abstract class F0 extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public transient /* synthetic */ int f15619a;

    @Override // th.h0
    public final th.a0 a(ClassLoader classLoader) {
        return e().a(classLoader);
    }

    @Override // th.h0
    public final Object b() {
        return e().b();
    }

    @Override // th.h0
    public final th.h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        return e().d(abstractC6242g, abstractC6632q);
    }

    public abstract AbstractC5809q e();

    public final boolean equals(Object obj) {
        return e().equals(obj);
    }

    @Override // th.h0
    public final int getState() {
        return e().getState();
    }

    public final int hashCode() {
        int i10;
        if (this.f15619a != 0) {
            i10 = 0;
        } else {
            i10 = e().hashCode();
        }
        if (i10 == 0) {
            return this.f15619a;
        }
        this.f15619a = i10;
        return i10;
    }

    public final String toString() {
        return e().toString();
    }
}
