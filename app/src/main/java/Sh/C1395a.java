package Sh;

import yh.l1;

/* renamed from: Sh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1395a implements AbstractC1396b {

    /* renamed from: a  reason: collision with root package name */
    public final Hh.n f16710a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f16711b;

    public C1395a(Hh.n nVar, l1 l1Var) {
        this.f16710a = nVar;
        this.f16711b = l1Var;
    }

    @Override // Sh.AbstractC1396b
    public final l1 a() {
        return this.f16711b;
    }

    @Override // Sh.AbstractC1396b
    public final Hh.n b() {
        return this.f16710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1395a.class != obj.getClass()) {
            return false;
        }
        C1395a c1395a = (C1395a) obj;
        if (this.f16710a.equals(c1395a.f16710a) && this.f16711b.equals(c1395a.f16711b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f16710a.hashCode();
        return this.f16711b.hashCode() + ((hashCode + (C1395a.class.hashCode() * 31)) * 31);
    }
}
