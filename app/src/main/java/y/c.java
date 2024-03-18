package Y;

import f8.e;
import java.util.List;
import java.util.Set;
import kf.t;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f22010Z = new e(18, 0);

    /* renamed from: h0  reason: collision with root package name */
    public static final Set f22011h0 = R4.b.X1(new c(0), new c(1), new c(2));

    /* renamed from: i0  reason: collision with root package name */
    public static final List f22012i0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f22013Y;

    static {
        List G02 = AbstractC4344b.G0(new c(2), new c(1), new c(0));
        f22012i0 = G02;
        t.P2(G02);
    }

    public /* synthetic */ c(int i10) {
        this.f22013Y = i10;
    }

    public static final boolean a(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String b(int i10) {
        String str;
        if (a(i10, 0)) {
            str = "Compact";
        } else if (a(i10, 1)) {
            str = "Medium";
        } else if (a(i10, 2)) {
            str = "Expanded";
        } else {
            str = "";
        }
        return "WindowWidthSizeClass.".concat(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(e.j(this.f22013Y), e.j(((c) obj).f22013Y));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f22013Y != ((c) obj).f22013Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22013Y;
    }

    public final String toString() {
        return b(this.f22013Y);
    }
}
