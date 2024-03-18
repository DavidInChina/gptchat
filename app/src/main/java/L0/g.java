package L0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f10380a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f10380a != ((g) obj).f10380a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10380a;
    }

    public final String toString() {
        int i10 = this.f10380a;
        if (a(i10, 0)) {
            return "Button";
        }
        if (a(i10, 1)) {
            return "Checkbox";
        }
        if (a(i10, 2)) {
            return "Switch";
        }
        if (a(i10, 3)) {
            return "RadioButton";
        }
        if (a(i10, 4)) {
            return "Tab";
        }
        if (a(i10, 5)) {
            return "Image";
        }
        if (a(i10, 6)) {
            return "DropdownList";
        }
        return "Unknown";
    }
}
