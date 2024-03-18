package b7;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f25647a;

    public b(String str) {
        if (str != null) {
            this.f25647a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f25647a.equals(((b) obj).f25647a);
    }

    public final int hashCode() {
        return this.f25647a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Encoding{name=\""), this.f25647a, "\"}");
    }
}
