package v5;

import E9.f;
import Wh.AbstractC1657b;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;
import kf.w;
import o5.EnumC4919c;

/* renamed from: v5.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5975b {

    /* renamed from: h  reason: collision with root package name */
    public static final C5974a f47251h = new C5974a(false, false, w.f37484Y, 2, 2, null, AbstractC1657b.f21169a, EnumC4919c.US1, 2);

    /* renamed from: a  reason: collision with root package name */
    public final C5974a f47252a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47253b;

    /* renamed from: c  reason: collision with root package name */
    public final String f47254c;

    /* renamed from: d  reason: collision with root package name */
    public final String f47255d;

    /* renamed from: e  reason: collision with root package name */
    public final String f47256e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47257f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f47258g;

    public C5975b(C5974a c5974a, String str, String str2, String str3, String str4, boolean z10, Map map) {
        AbstractC3557B.c0("coreConfig", c5974a);
        AbstractC3557B.c0("clientToken", str);
        AbstractC3557B.c0("env", str2);
        AbstractC3557B.c0("variant", str3);
        AbstractC3557B.c0("additionalConfig", map);
        this.f47252a = c5974a;
        this.f47253b = str;
        this.f47254c = str2;
        this.f47255d = str3;
        this.f47256e = str4;
        this.f47257f = z10;
        this.f47258g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5975b)) {
            return false;
        }
        C5975b c5975b = (C5975b) obj;
        if (AbstractC3557B.K(this.f47252a, c5975b.f47252a) && AbstractC3557B.K(this.f47253b, c5975b.f47253b) && AbstractC3557B.K(this.f47254c, c5975b.f47254c) && AbstractC3557B.K(this.f47255d, c5975b.f47255d) && AbstractC3557B.K(this.f47256e, c5975b.f47256e) && this.f47257f == c5975b.f47257f && AbstractC3557B.K(this.f47258g, c5975b.f47258g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = f.v(this.f47255d, f.v(this.f47254c, f.v(this.f47253b, this.f47252a.hashCode() * 31, 31), 31), 31);
        String str = this.f47256e;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i11 = (v10 + i10) * 31;
        boolean z10 = this.f47257f;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        return this.f47258g.hashCode() + ((i11 + i12) * 31);
    }

    public final String toString() {
        return "Configuration(coreConfig=" + this.f47252a + ", clientToken=" + this.f47253b + ", env=" + this.f47254c + ", variant=" + this.f47255d + ", service=" + this.f47256e + ", crashReportsEnabled=" + this.f47257f + ", additionalConfig=" + this.f47258g + Separators.RPAREN;
    }
}
