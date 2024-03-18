package Xb;

import Ad.s;
import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f21838a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21839b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f21840c;

    public p(String str, String str2, Intent intent) {
        AbstractC3557B.c0("message", str);
        this.f21838a = str;
        this.f21839b = str2;
        this.f21840c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (AbstractC3557B.K(this.f21838a, pVar.f21838a) && AbstractC3557B.K(this.f21839b, pVar.f21839b) && AbstractC3557B.K(this.f21840c, pVar.f21840c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f21838a.hashCode() * 31;
        int i11 = 0;
        String str = this.f21839b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        Intent intent = this.f21840c;
        if (intent != null) {
            i11 = intent.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "FailwhaleViewState(message=" + this.f21838a + ", moreDetailButtonTitle=" + this.f21839b + ", moreDetailIntent=" + this.f21840c + Separators.RPAREN;
    }
}
