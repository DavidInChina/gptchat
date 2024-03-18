package Ah;

/* loaded from: classes2.dex */
public final class P implements Q, O {

    /* renamed from: a  reason: collision with root package name */
    public final String f904a;

    public P(String str) {
        this.f904a = str;
    }

    @Override // Ah.O
    public final Q a() {
        throw new UnsupportedOperationException("Could not access Unsafe class: " + this.f904a);
    }

    @Override // Ah.O
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        if (this.f904a.equals(((P) obj).f904a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f904a.hashCode() + (P.class.hashCode() * 31);
    }
}
