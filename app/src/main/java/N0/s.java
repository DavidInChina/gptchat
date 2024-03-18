package N0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final s f12563c = new s(false, 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12564a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12565b;

    public s() {
        this.f12564a = false;
        this.f12565b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f12564a == sVar.f12564a && this.f12565b == sVar.f12565b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f12564a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return (i10 * 31) + this.f12565b;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f12564a + ", emojiSupportMatch=" + ((Object) C1049h.a(this.f12565b)) + ')';
    }

    public s(boolean z10, int i10) {
        this.f12564a = z10;
        this.f12565b = i10;
    }
}
