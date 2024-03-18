package T0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f16801a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "None";
        }
        if (a(i10, 1)) {
            return "Default";
        }
        if (a(i10, 2)) {
            return "Go";
        }
        if (a(i10, 3)) {
            return "Search";
        }
        if (a(i10, 4)) {
            return "Send";
        }
        if (a(i10, 5)) {
            return "Previous";
        }
        if (a(i10, 6)) {
            return "Next";
        }
        if (a(i10, 7)) {
            return "Done";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f16801a != ((n) obj).f16801a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16801a;
    }

    public final String toString() {
        return b(this.f16801a);
    }
}
