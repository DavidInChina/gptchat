package e2;

/* renamed from: e2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2769a {

    /* renamed from: b  reason: collision with root package name */
    public static final P5.c f28742b = new P5.c(19, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f28743a;

    public /* synthetic */ C2769a(int i10) {
        this.f28743a = i10;
    }

    public static final /* synthetic */ C2769a a(int i10) {
        return new C2769a(i10);
    }

    public static final boolean b(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String c(int i10) {
        return "Horizontal(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2769a)) {
            return false;
        }
        if (this.f28743a != ((C2769a) obj).f28743a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28743a;
    }

    public final String toString() {
        return c(this.f28743a);
    }
}
