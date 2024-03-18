package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public final class b0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f31387a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31388b;

    public b0(int i10, List list) {
        AbstractC3557B.c0("showImageSelection", list);
        this.f31387a = list;
        this.f31388b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (AbstractC3557B.K(this.f31387a, b0Var.f31387a) && this.f31388b == b0Var.f31388b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31387a.hashCode() * 31) + this.f31388b;
    }

    public final String toString() {
        return "OpenImageDetailScreen(showImageSelection=" + this.f31387a + ", firstImageIndex=" + this.f31388b + Separators.RPAREN;
    }
}
