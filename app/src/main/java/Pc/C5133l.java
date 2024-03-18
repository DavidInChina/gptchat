package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pc.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5133l extends AbstractC5137p {

    /* renamed from: h0  reason: collision with root package name */
    public final Integer f43005h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f43006i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Throwable f43007j0;

    public C5133l(Integer num, String str, Exception exc) {
        super(str, exc);
        this.f43005h0 = num;
        this.f43006i0 = str;
        this.f43007j0 = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5133l)) {
            return false;
        }
        C5133l c5133l = (C5133l) obj;
        if (AbstractC3557B.K(this.f43005h0, c5133l.f43005h0) && AbstractC3557B.K(this.f43006i0, c5133l.f43006i0) && AbstractC3557B.K(this.f43007j0, c5133l.f43007j0)) {
            return true;
        }
        return false;
    }

    @Override // pc.AbstractC5137p, java.lang.Throwable
    public final Throwable getCause() {
        return this.f43007j0;
    }

    @Override // pc.AbstractC5137p, java.lang.Throwable
    public final String getMessage() {
        return this.f43006i0;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Integer num = this.f43005h0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i13 = i10 * 31;
        String str = this.f43006i0;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Throwable th2 = this.f43007j0;
        if (th2 != null) {
            i12 = th2.hashCode();
        }
        return i14 + i12;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Other(errorCode=" + this.f43005h0 + ", message=" + this.f43006i0 + ", cause=" + this.f43007j0 + Separators.RPAREN;
    }
}
