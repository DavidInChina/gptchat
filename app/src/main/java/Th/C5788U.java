package th;

import uh.AbstractC5929a;
import wh.AbstractC6242g;
import yh.AbstractC6632q;

/* renamed from: th.U  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5788U extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5929a f46196a;

    public C5788U(AbstractC5929a abstractC5929a) {
        this.f46196a = abstractC5929a;
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        AbstractC5929a abstractC5929a = this.f46196a;
        try {
            return new C5810r(1, abstractC5929a.e(Class.forName(abstractC5929a.b().getName(), false, classLoader)));
        } catch (ClassNotFoundException e10) {
            return new C5786S(abstractC5929a.b().getName(), e10);
        }
    }

    @Override // th.h0
    public final Object b() {
        return this.f46196a;
    }

    @Override // th.h0
    public final int c() {
        return 11;
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        AbstractC5929a abstractC5929a;
        String str;
        if (abstractC6632q.l0().equals(this.f46196a.b())) {
            return this;
        }
        if (abstractC6242g.getReturnType().T0()) {
            str = g0.JAVA_19_CAPABLE_VM.a(11);
        } else {
            str = abstractC5929a.b().getName() + '.' + abstractC5929a.d();
        }
        return new C5787T(2, abstractC6242g, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (this.f46196a.equals(((h0) obj).b())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // th.h0
    public final int getState() {
        return 3;
    }

    public final int hashCode() {
        return this.f46196a.hashCode();
    }

    public final String toString() {
        return this.f46196a.toString();
    }
}
