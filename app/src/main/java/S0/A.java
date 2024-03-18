package S0;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final int f15966a;

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
            return "All";
        }
        if (a(i10, 2)) {
            return "Weight";
        }
        if (a(i10, 3)) {
            return "Style";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        if (this.f15966a != ((A) obj).f15966a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15966a;
    }

    public final String toString() {
        return b(this.f15966a);
    }
}
