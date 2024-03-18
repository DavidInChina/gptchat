package y0;

/* renamed from: y0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6488a {

    /* renamed from: a  reason: collision with root package name */
    public final int f50319a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6488a)) {
            return false;
        }
        if (this.f50319a != ((C6488a) obj).f50319a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f50319a;
    }

    public final String toString() {
        int i10 = this.f50319a;
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
