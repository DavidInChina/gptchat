package L3;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a  reason: collision with root package name */
    public final g f10723a = g.f10714c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.f10723a.equals(((n) obj).f10723a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10723a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f10723a + '}';
    }
}
