package Qh;

/* renamed from: Qh.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1238p extends AbstractC1230h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f15000a;

    public C1238p(C1231i c1231i) {
        this.f15000a = c1231i;
    }

    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        try {
            return this.f15000a.a(obj);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1238p.class == obj.getClass() && this.f15000a.equals(((C1238p) obj).f15000a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15000a.hashCode() + (C1238p.class.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "failSafe(try(" + this.f15000a + ") or false)";
    }
}
