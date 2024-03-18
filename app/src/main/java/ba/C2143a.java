package ba;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ba.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143a extends AbstractC2148f {

    /* renamed from: b  reason: collision with root package name */
    public final String f25673b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25674c;

    public C2143a(String str, boolean z10) {
        this.f25673b = str;
        this.f25674c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2143a)) {
            return false;
        }
        C2143a c2143a = (C2143a) obj;
        if (AbstractC3557B.K(this.f25673b, c2143a.f25673b) && this.f25674c == c2143a.f25674c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.f25673b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        if (this.f25674c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        return "Click(url=" + this.f25673b + ", hasError=" + this.f25674c + Separators.RPAREN;
    }
}
