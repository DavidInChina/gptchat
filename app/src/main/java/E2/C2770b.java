package e2;

import a1.C1915c;

/* renamed from: e2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2770b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1915c f28744b = new C1915c(19, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f28745a;

    public /* synthetic */ C2770b(int i10) {
        this.f28745a = i10;
    }

    public static final /* synthetic */ C2770b a(int i10) {
        return new C2770b(i10);
    }

    public static final boolean b(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String c(int i10) {
        return "Vertical(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2770b)) {
            return false;
        }
        if (this.f28745a != ((C2770b) obj).f28745a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28745a;
    }

    public final String toString() {
        return c(this.f28745a);
    }
}
