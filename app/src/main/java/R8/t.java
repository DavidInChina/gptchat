package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public s f15166a;

    /* renamed from: b  reason: collision with root package name */
    public s f15167b;

    /* renamed from: c  reason: collision with root package name */
    public s f15168c;

    /* renamed from: d  reason: collision with root package name */
    public s f15169d;

    /* renamed from: e  reason: collision with root package name */
    public s f15170e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!AbstractC3557B.K(this.f15167b, tVar.f15167b) || !AbstractC3557B.K(this.f15170e, tVar.f15170e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f15167b;
        Object obj2 = 0;
        if (obj == null) {
            obj = obj2;
        }
        int hashCode = obj.hashCode() * 11;
        Object obj3 = this.f15170e;
        if (obj3 != null) {
            obj2 = obj3;
        }
        return (obj2.hashCode() * 7) + hashCode;
    }

    public final String toString() {
        s sVar = this.f15167b;
        s sVar2 = this.f15168c;
        s sVar3 = this.f15170e;
        return "AstNodeLinks(parent=" + this.f15166a + ", firstChild=" + sVar + ", lastChild=" + sVar2 + ", previous=" + this.f15169d + ", next=" + sVar3 + Separators.RPAREN;
    }
}
