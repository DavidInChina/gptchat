package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6326q {

    /* renamed from: a  reason: collision with root package name */
    public final String f49415a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f49416b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f49417c;

    public C6326q(String str, Long l10, Long l11) {
        this.f49415a = str;
        this.f49416b = l10;
        this.f49417c = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6326q)) {
            return false;
        }
        C6326q c6326q = (C6326q) obj;
        if (AbstractC3557B.K(this.f49415a, c6326q.f49415a) && AbstractC3557B.K(this.f49416b, c6326q.f49416b) && AbstractC3557B.K(this.f49417c, c6326q.f49417c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f49415a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        Long l10 = this.f49416b;
        if (l10 == null) {
            i11 = 0;
        } else {
            i11 = l10.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Long l11 = this.f49417c;
        if (l11 != null) {
            i12 = l11.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "DdActionTarget(selector=" + this.f49415a + ", width=" + this.f49416b + ", height=" + this.f49417c + Separators.RPAREN;
    }
}
