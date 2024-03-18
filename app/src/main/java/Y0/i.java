package Y0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f22030a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Left";
        }
        if (a(i10, 2)) {
            return "Right";
        }
        if (a(i10, 3)) {
            return "Center";
        }
        if (a(i10, 4)) {
            return "Justify";
        }
        if (a(i10, 5)) {
            return "Start";
        }
        if (a(i10, 6)) {
            return "End";
        }
        if (a(i10, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f22030a != ((i) obj).f22030a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22030a;
    }

    public final String toString() {
        return b(this.f22030a);
    }
}
