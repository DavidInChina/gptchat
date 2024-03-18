package Y;

import f8.e;
import java.util.List;
import java.util.Set;
import kf.t;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f22003Z = new e(17, 0);

    /* renamed from: h0  reason: collision with root package name */
    public static final Set f22004h0 = R4.b.X1(new a(0), new a(1), new a(2));

    /* renamed from: i0  reason: collision with root package name */
    public static final List f22005i0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f22006Y;

    static {
        List G02 = AbstractC4344b.G0(new a(2), new a(1), new a(0));
        f22005i0 = G02;
        t.P2(G02);
    }

    public /* synthetic */ a(int i10) {
        this.f22006Y = i10;
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
        return "WindowHeightSizeClass.".concat(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(e.k(this.f22006Y), e.k(((a) obj).f22006Y));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f22006Y != ((a) obj).f22006Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22006Y;
    }

    public final String toString() {
        return b(this.f22006Y);
    }
}
