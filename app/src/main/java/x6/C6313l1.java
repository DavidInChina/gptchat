package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: x6.l1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6313l1 {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f49372e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f49373a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49374b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49375c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f49376d;

    public C6313l1(String str, String str2, String str3, Map map) {
        this.f49373a = str;
        this.f49374b = str2;
        this.f49375c = str3;
        this.f49376d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6313l1)) {
            return false;
        }
        C6313l1 c6313l1 = (C6313l1) obj;
        if (AbstractC3557B.K(this.f49373a, c6313l1.f49373a) && AbstractC3557B.K(this.f49374b, c6313l1.f49374b) && AbstractC3557B.K(this.f49375c, c6313l1.f49375c) && AbstractC3557B.K(this.f49376d, c6313l1.f49376d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f49373a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f49374b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f49375c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f49376d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f49373a + ", name=" + this.f49374b + ", email=" + this.f49375c + ", additionalProperties=" + this.f49376d + Separators.RPAREN;
    }
}
