package Y0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f22018a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Hyphens.None";
        }
        if (a(i10, 2)) {
            return "Hyphens.Auto";
        }
        if (a(i10, Integer.MIN_VALUE)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f22018a != ((d) obj).f22018a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22018a;
    }

    public final String toString() {
        return b(this.f22018a);
    }
}
