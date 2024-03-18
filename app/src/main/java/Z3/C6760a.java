package z3;

import B2.u;
import Lg.n;
import id.AbstractC3557B;
import java.util.Locale;

/* renamed from: z3.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6760a {

    /* renamed from: a  reason: collision with root package name */
    public final String f51561a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51562b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f51563c;

    /* renamed from: d  reason: collision with root package name */
    public final int f51564d;

    /* renamed from: e  reason: collision with root package name */
    public final String f51565e;

    /* renamed from: f  reason: collision with root package name */
    public final int f51566f;

    /* renamed from: g  reason: collision with root package name */
    public final int f51567g;

    public C6760a(int i10, int i11, String str, String str2, String str3, boolean z10) {
        int i12;
        this.f51561a = str;
        this.f51562b = str2;
        this.f51563c = z10;
        this.f51564d = i10;
        this.f51565e = str3;
        this.f51566f = i11;
        Locale locale = Locale.US;
        AbstractC3557B.b0("US", locale);
        String upperCase = str2.toUpperCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toUpperCase(locale)", upperCase);
        if (n.Z1(upperCase, "INT", false)) {
            i12 = 3;
        } else if (!n.Z1(upperCase, "CHAR", false) && !n.Z1(upperCase, "CLOB", false) && !n.Z1(upperCase, "TEXT", false)) {
            if (n.Z1(upperCase, "BLOB", false)) {
                i12 = 5;
            } else if (!n.Z1(upperCase, "REAL", false) && !n.Z1(upperCase, "FLOA", false) && !n.Z1(upperCase, "DOUB", false)) {
                i12 = 1;
            } else {
                i12 = 4;
            }
        } else {
            i12 = 2;
        }
        this.f51567g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6760a)) {
            return false;
        }
        C6760a c6760a = (C6760a) obj;
        if (this.f51564d != c6760a.f51564d) {
            return false;
        }
        if (!AbstractC3557B.K(this.f51561a, c6760a.f51561a) || this.f51563c != c6760a.f51563c) {
            return false;
        }
        int i10 = c6760a.f51566f;
        String str = c6760a.f51565e;
        String str2 = this.f51565e;
        int i11 = this.f51566f;
        if (i11 == 1 && i10 == 2 && str2 != null && !u.v(str2, str)) {
            return false;
        }
        if (i11 == 2 && i10 == 1 && str != null && !u.v(str, str2)) {
            return false;
        }
        if ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : u.v(str2, str))) && this.f51567g == c6760a.f51567g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.f51561a.hashCode() * 31) + this.f51567g) * 31;
        if (this.f51563c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((hashCode + i10) * 31) + this.f51564d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f51561a);
        sb2.append("', type='");
        sb2.append(this.f51562b);
        sb2.append("', affinity='");
        sb2.append(this.f51567g);
        sb2.append("', notNull=");
        sb2.append(this.f51563c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f51564d);
        sb2.append(", defaultValue='");
        String str = this.f51565e;
        if (str == null) {
            str = "undefined";
        }
        return R.a.t(sb2, str, "'}");
    }
}
