package s5;

import E9.f;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import y.AbstractC6463a;

/* renamed from: s5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5576a {

    /* renamed from: a  reason: collision with root package name */
    public final String f45399a;

    /* renamed from: b  reason: collision with root package name */
    public final String f45400b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45401c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f45402d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f45403e;

    /* renamed from: f  reason: collision with root package name */
    public final String f45404f;

    public C5576a(String str, String str2, String str3, Map map, byte[] bArr, String str4) {
        AbstractC3557B.c0("url", str3);
        this.f45399a = str;
        this.f45400b = str2;
        this.f45401c = str3;
        this.f45402d = map;
        this.f45403e = bArr;
        this.f45404f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5576a)) {
            return false;
        }
        C5576a c5576a = (C5576a) obj;
        if (AbstractC3557B.K(this.f45399a, c5576a.f45399a) && AbstractC3557B.K(this.f45400b, c5576a.f45400b) && AbstractC3557B.K(this.f45401c, c5576a.f45401c) && AbstractC3557B.K(this.f45402d, c5576a.f45402d) && AbstractC3557B.K(this.f45403e, c5576a.f45403e) && AbstractC3557B.K(this.f45404f, c5576a.f45404f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (Arrays.hashCode(this.f45403e) + AbstractC6463a.f(this.f45402d, f.v(this.f45401c, f.v(this.f45400b, this.f45399a.hashCode() * 31, 31), 31), 31)) * 31;
        String str = this.f45404f;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f45403e);
        StringBuilder sb2 = new StringBuilder("Request(id=");
        sb2.append(this.f45399a);
        sb2.append(", description=");
        sb2.append(this.f45400b);
        sb2.append(", url=");
        sb2.append(this.f45401c);
        sb2.append(", headers=");
        sb2.append(this.f45402d);
        sb2.append(", body=");
        sb2.append(arrays);
        sb2.append(", contentType=");
        return R.a.t(sb2, this.f45404f, Separators.RPAREN);
    }
}
