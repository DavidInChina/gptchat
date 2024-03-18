package e2;

/* renamed from: e2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2777i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f28770b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f28771a;

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        return "ContentScale(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2777i)) {
            return false;
        }
        if (this.f28771a != ((C2777i) obj).f28771a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28771a;
    }

    public final String toString() {
        return b(this.f28771a);
    }
}
