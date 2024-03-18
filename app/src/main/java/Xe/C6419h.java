package xe;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Map;
import k6.AbstractC4194d;
import z.AbstractC6708l;

/* renamed from: xe.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6419h {

    /* renamed from: a  reason: collision with root package name */
    public final String f49888a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49889b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49890c;

    /* renamed from: d  reason: collision with root package name */
    public final int f49891d;

    /* renamed from: e  reason: collision with root package name */
    public final He.b f49892e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49893f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49894g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f49895h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f49896i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f49897j;

    public C6419h(String str, String str2, int i10, int i11, He.b bVar, String str3, String str4, boolean z10, boolean z11, Map map) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        AbstractC2469q0.q("encoding", i10);
        AbstractC3557B.c0("extensions", map);
        this.f49888a = str;
        this.f49889b = str2;
        this.f49890c = i10;
        this.f49891d = i11;
        this.f49892e = bVar;
        this.f49893f = str3;
        this.f49894g = str4;
        this.f49895h = z10;
        this.f49896i = z11;
        this.f49897j = map;
    }

    public static C6419h a(C6419h c6419h, String str, String str2, int i10) {
        if ((i10 & 32) != 0) {
            str = c6419h.f49893f;
        }
        String str3 = str;
        if ((i10 & 64) != 0) {
            str2 = c6419h.f49894g;
        }
        String str4 = c6419h.f49888a;
        AbstractC3557B.c0("name", str4);
        String str5 = c6419h.f49889b;
        AbstractC3557B.c0("value", str5);
        int i11 = c6419h.f49890c;
        AbstractC2469q0.q("encoding", i11);
        Map map = c6419h.f49897j;
        AbstractC3557B.c0("extensions", map);
        return new C6419h(str4, str5, i11, c6419h.f49891d, c6419h.f49892e, str3, str2, c6419h.f49895h, c6419h.f49896i, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6419h)) {
            return false;
        }
        C6419h c6419h = (C6419h) obj;
        if (AbstractC3557B.K(this.f49888a, c6419h.f49888a) && AbstractC3557B.K(this.f49889b, c6419h.f49889b) && this.f49890c == c6419h.f49890c && this.f49891d == c6419h.f49891d && AbstractC3557B.K(this.f49892e, c6419h.f49892e) && AbstractC3557B.K(this.f49893f, c6419h.f49893f) && AbstractC3557B.K(this.f49894g, c6419h.f49894g) && this.f49895h == c6419h.f49895h && this.f49896i == c6419h.f49896i && AbstractC3557B.K(this.f49897j, c6419h.f49897j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int d10 = (AbstractC6708l.d(this.f49890c, E9.f.v(this.f49889b, this.f49888a.hashCode() * 31, 31), 31) + this.f49891d) * 31;
        int i12 = 0;
        He.b bVar = this.f49892e;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = bVar.hashCode();
        }
        int i13 = (d10 + i10) * 31;
        String str = this.f49893f;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.f49894g;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        int i15 = (i14 + i12) * 31;
        int i16 = 1;
        boolean z10 = this.f49895h;
        if (z10) {
            z10 = true;
        }
        int i17 = z10 ? 1 : 0;
        int i18 = z10 ? 1 : 0;
        int i19 = (i15 + i17) * 31;
        boolean z11 = this.f49896i;
        if (!z11) {
            i16 = z11 ? 1 : 0;
        }
        return this.f49897j.hashCode() + ((i19 + i16) * 31);
    }

    public final String toString() {
        return "Cookie(name=" + this.f49888a + ", value=" + this.f49889b + ", encoding=" + AbstractC4194d.O(this.f49890c) + ", maxAge=" + this.f49891d + ", expires=" + this.f49892e + ", domain=" + this.f49893f + ", path=" + this.f49894g + ", secure=" + this.f49895h + ", httpOnly=" + this.f49896i + ", extensions=" + this.f49897j + ')';
    }
}
