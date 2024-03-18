package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class s extends Exception {
    public static final o Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final r f5172Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f5173Z;

    public s(int i10, r rVar, String str) {
        if (1 == (i10 & 1)) {
            this.f5172Y = rVar;
            if ((i10 & 2) == 0) {
                this.f5173Z = rVar.f5168a;
                return;
            } else {
                this.f5173Z = str;
                return;
            }
        }
        R4.b.e2(i10, 1, m.f5162b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && AbstractC3557B.K(this.f5172Y, ((s) obj).f5172Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5172Y.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "OpenAIApiError(error=" + this.f5172Y + Separators.RPAREN;
    }
}
