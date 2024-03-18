package L0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f10375a = 0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f10375a != ((e) obj).f10375a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10375a;
    }

    public final String toString() {
        int i10 = this.f10375a;
        if (i10 == 0) {
            return "Polite";
        }
        if (i10 == 1) {
            return "Assertive";
        }
        return "Unknown";
    }
}
