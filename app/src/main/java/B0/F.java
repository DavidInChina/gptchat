package B0;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final int f1597a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        if (this.f1597a != ((F) obj).f1597a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1597a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f1597a + ')';
    }
}
