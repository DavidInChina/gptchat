package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: x6.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6303i0 {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f49327e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f49328a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49329b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49330c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f49331d;

    public C6303i0(String str, String str2, String str3, Map map) {
        this.f49328a = str;
        this.f49329b = str2;
        this.f49330c = str3;
        this.f49331d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6303i0)) {
            return false;
        }
        C6303i0 c6303i0 = (C6303i0) obj;
        if (AbstractC3557B.K(this.f49328a, c6303i0.f49328a) && AbstractC3557B.K(this.f49329b, c6303i0.f49329b) && AbstractC3557B.K(this.f49330c, c6303i0.f49330c) && AbstractC3557B.K(this.f49331d, c6303i0.f49331d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f49328a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f49329b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f49330c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f49331d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f49328a + ", name=" + this.f49329b + ", email=" + this.f49330c + ", additionalProperties=" + this.f49331d + Separators.RPAREN;
    }
}
