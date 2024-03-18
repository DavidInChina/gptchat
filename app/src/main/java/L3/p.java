package L3;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a  reason: collision with root package name */
    public final g f10724a;

    public p(g gVar) {
        this.f10724a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            return this.f10724a.equals(((p) obj).f10724a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10724a.hashCode() + (p.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f10724a + '}';
    }
}
