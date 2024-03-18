package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6291e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49287a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49288b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49289c;

    public C6291e0(String str, String str2, int i10) {
        this.f49287a = str;
        this.f49288b = str2;
        this.f49289c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6291e0)) {
            return false;
        }
        C6291e0 c6291e0 = (C6291e0) obj;
        if (AbstractC3557B.K(this.f49287a, c6291e0.f49287a) && AbstractC3557B.K(this.f49288b, c6291e0.f49288b) && this.f49289c == c6291e0.f49289c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f49287a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f49288b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        int i15 = this.f49289c;
        if (i15 != 0) {
            i12 = AbstractC6708l.f(i15);
        }
        return i14 + i12;
    }

    public final String toString() {
        return "Provider(domain=" + this.f49287a + ", name=" + this.f49288b + ", type=" + AbstractC6287d.K(this.f49289c) + Separators.RPAREN;
    }
}
