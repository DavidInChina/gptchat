package N0;

/* renamed from: N0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049h {

    /* renamed from: a  reason: collision with root package name */
    public final int f12523a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == 1) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1049h)) {
            return false;
        }
        if (this.f12523a != ((C1049h) obj).f12523a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12523a;
    }

    public final String toString() {
        return a(this.f12523a);
    }
}
