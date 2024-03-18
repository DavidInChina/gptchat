package S0;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final int f16061a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "Normal";
        }
        if (a(i10, 1)) {
            return "Italic";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        if (this.f16061a != ((z) obj).f16061a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16061a;
    }

    public final String toString() {
        return b(this.f16061a);
    }
}
