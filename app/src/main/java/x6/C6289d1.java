package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.d1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6289d1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49279a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49280b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49281c;

    public C6289d1(String str, String str2, int i10) {
        this.f49279a = str;
        this.f49280b = str2;
        this.f49281c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6289d1)) {
            return false;
        }
        C6289d1 c6289d1 = (C6289d1) obj;
        if (AbstractC3557B.K(this.f49279a, c6289d1.f49279a) && AbstractC3557B.K(this.f49280b, c6289d1.f49280b) && this.f49281c == c6289d1.f49281c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f49279a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f49280b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        int i15 = this.f49281c;
        if (i15 != 0) {
            i12 = AbstractC6708l.f(i15);
        }
        return i14 + i12;
    }

    public final String toString() {
        return "Provider(domain=" + this.f49279a + ", name=" + this.f49280b + ", type=" + AbstractC6287d.Z(this.f49281c) + Separators.RPAREN;
    }
}
