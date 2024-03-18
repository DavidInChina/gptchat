package p2;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class H implements AbstractC5057j {

    /* renamed from: l0  reason: collision with root package name */
    public static final H f41799l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final String f41800m0 = Integer.toString(0, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f41801n0 = Integer.toString(1, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41802o0 = Integer.toString(2, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41803p0 = Integer.toString(3, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f41804q0 = Integer.toString(4, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f41805r0 = Integer.toString(5, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final A9.a f41806s0 = new A9.a(15);

    /* renamed from: Y  reason: collision with root package name */
    public final String f41807Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C f41808Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C5047B f41809h0;

    /* renamed from: i0  reason: collision with root package name */
    public final K f41810i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C5070x f41811j0;

    /* renamed from: k0  reason: collision with root package name */
    public final D f41812k0;

    /* JADX WARN: Type inference failed for: r4v0, types: [p2.w, p2.x] */
    static {
        C5068v c5068v = new C5068v();
        x8.L l10 = x8.N.f49523Z;
        x8.k0 k0Var = x8.k0.f49573j0;
        Collections.emptyList();
        x8.k0 k0Var2 = x8.k0.f49573j0;
        f41799l0 = new H("", new AbstractC5069w(c5068v), null, new C5047B(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), K.f41848N0, D.f41769i0);
        int i10 = AbstractC5530A.f45131a;
    }

    public H(String str, C5070x c5070x, C c10, C5047B c5047b, K k10, D d10) {
        this.f41807Y = str;
        this.f41808Z = c10;
        this.f41809h0 = c5047b;
        this.f41810i0 = k10;
        this.f41811j0 = c5070x;
        this.f41812k0 = d10;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [p2.w, p2.x] */
    public static H b(Uri uri) {
        boolean z10;
        C c10;
        C5068v c5068v = new C5068v();
        C5071y c5071y = new C5071y();
        List emptyList = Collections.emptyList();
        x8.k0 k0Var = x8.k0.f49573j0;
        D d10 = D.f41769i0;
        if (((Uri) c5071y.f42360e) != null && ((UUID) c5071y.f42359d) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.n(z10);
        C5072z c5072z = null;
        if (uri != null) {
            if (((UUID) c5071y.f42359d) != null) {
                c5072z = new C5072z(c5071y);
            }
            c10 = new C(uri, null, c5072z, null, emptyList, null, k0Var, null, -9223372036854775807L);
        } else {
            c10 = null;
        }
        return new H("", new AbstractC5069w(c5068v), c10, new C5047B(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), K.f41848N0, d10);
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f41807Y;
        if (!str.equals("")) {
            bundle.putString(f41800m0, str);
        }
        C5047B c5047b = C5047B.f41739k0;
        C5047B c5047b2 = this.f41809h0;
        if (!c5047b2.equals(c5047b)) {
            bundle.putBundle(f41801n0, c5047b2.a());
        }
        K k10 = K.f41848N0;
        K k11 = this.f41810i0;
        if (!k11.equals(k10)) {
            bundle.putBundle(f41802o0, k11.a());
        }
        C5070x c5070x = AbstractC5069w.f42343k0;
        C5070x c5070x2 = this.f41811j0;
        if (!c5070x2.equals(c5070x)) {
            bundle.putBundle(f41803p0, c5070x2.a());
        }
        D d10 = D.f41769i0;
        D d11 = this.f41812k0;
        if (!d11.equals(d10)) {
            bundle.putBundle(f41804q0, d11.a());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        if (AbstractC5530A.a(this.f41807Y, h10.f41807Y) && this.f41811j0.equals(h10.f41811j0) && AbstractC5530A.a(this.f41808Z, h10.f41808Z) && AbstractC5530A.a(this.f41809h0, h10.f41809h0) && AbstractC5530A.a(this.f41810i0, h10.f41810i0) && AbstractC5530A.a(this.f41812k0, h10.f41812k0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f41807Y.hashCode() * 31;
        C c10 = this.f41808Z;
        if (c10 != null) {
            i10 = c10.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f41809h0.hashCode();
        int hashCode3 = this.f41811j0.hashCode();
        int hashCode4 = this.f41810i0.hashCode();
        return this.f41812k0.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
