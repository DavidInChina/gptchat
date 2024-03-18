package p0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f41675a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Next";
        }
        if (a(i10, 2)) {
            return "Previous";
        }
        if (a(i10, 3)) {
            return "Left";
        }
        if (a(i10, 4)) {
            return "Right";
        }
        if (a(i10, 5)) {
            return "Up";
        }
        if (a(i10, 6)) {
            return "Down";
        }
        if (a(i10, 7)) {
            return "Enter";
        }
        if (a(i10, 8)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f41675a != ((c) obj).f41675a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41675a;
    }

    public final String toString() {
        return b(this.f41675a);
    }
}
