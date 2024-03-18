package th;

import wh.AbstractC6242g;
import yh.AbstractC6632q;
import yh.l1;

/* renamed from: th.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5811s extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5802j f46232a;

    public C5811s(AbstractC5802j abstractC5802j) {
        this.f46232a = abstractC5802j;
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        AbstractC5802j abstractC5802j = this.f46232a;
        try {
            return new C5810r(0, abstractC5802j.b(Class.forName(abstractC5802j.d().getName(), false, classLoader)).a());
        } catch (ClassNotFoundException e10) {
            return new C5786S(abstractC5802j.d().getName(), e10);
        }
    }

    @Override // th.h0
    public final Object b() {
        return this.f46232a;
    }

    @Override // th.h0
    public final int c() {
        return 12;
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        String str;
        l1 l02 = abstractC6632q.l0();
        AbstractC5802j abstractC5802j = this.f46232a;
        if (l02.equals(abstractC5802j.d())) {
            return this;
        }
        if (abstractC6242g.getReturnType().T0()) {
            str = g0.JAVA_19_CAPABLE_VM.a(12);
        } else {
            str = abstractC5802j.toString();
        }
        return new C5787T(2, abstractC6242g, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (this.f46232a.equals(((h0) obj).b())) {
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
        return this.f46232a.hashCode();
    }

    public final String toString() {
        return this.f46232a.toString();
    }
}
