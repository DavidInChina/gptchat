package kb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.u0;
import wd.v0;

/* renamed from: kb.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4227l implements AbstractC4232q {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f37259a;

    /* renamed from: b  reason: collision with root package name */
    public final v0 f37260b;

    public C4227l(v0 v0Var, u0 u0Var) {
        this.f37259a = v0Var;
        this.f37260b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4227l)) {
            return false;
        }
        C4227l c4227l = (C4227l) obj;
        if (AbstractC3557B.K(this.f37259a, c4227l.f37259a) && AbstractC3557B.K(this.f37260b, c4227l.f37260b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37259a.hashCode() * 31;
        v0 v0Var = this.f37260b;
        if (v0Var == null) {
            i10 = 0;
        } else {
            i10 = v0Var.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ImageInpaintedConfirmed(result=" + this.f37259a + ", inPainted=" + this.f37260b + Separators.RPAREN;
    }
}
