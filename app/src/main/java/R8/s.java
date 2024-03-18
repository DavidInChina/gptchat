package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final U3.f f15164a;

    /* renamed from: b  reason: collision with root package name */
    public final t f15165b;

    public s(U3.f fVar, t tVar) {
        this.f15164a = fVar;
        this.f15165b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f15164a, sVar.f15164a) && AbstractC3557B.K(this.f15165b, sVar.f15165b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15165b.hashCode() + (this.f15164a.hashCode() * 31);
    }

    public final String toString() {
        return "AstNode(type=" + this.f15164a + ", links=" + this.f15165b + Separators.RPAREN;
    }
}
