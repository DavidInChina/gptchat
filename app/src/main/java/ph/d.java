package ph;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f43179a;

    public d(String str) {
        this.f43179a = str;
    }

    @Override // ph.e
    public final f a() {
        throw new IllegalStateException("Failed to resolve the class file version of the current VM: " + this.f43179a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        if (this.f43179a.equals(((d) obj).f43179a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43179a.hashCode() + (d.class.hashCode() * 31);
    }
}
