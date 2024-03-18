package c9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: c9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2308b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26368a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26369b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f26370c;

    public C2308b(String str, String str2, Boolean bool) {
        this.f26368a = str;
        this.f26369b = str2;
        this.f26370c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2308b)) {
            return false;
        }
        C2308b c2308b = (C2308b) obj;
        if (AbstractC3557B.K(this.f26368a, c2308b.f26368a) && AbstractC3557B.K(this.f26369b, c2308b.f26369b) && AbstractC3557B.K(this.f26370c, c2308b.f26370c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f26368a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f26369b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Boolean bool = this.f26370c;
        if (bool != null) {
            i12 = bool.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ProfileClaim(userId=" + this.f26368a + ", email=" + this.f26369b + ", emailVerified=" + this.f26370c + Separators.RPAREN;
    }
}
