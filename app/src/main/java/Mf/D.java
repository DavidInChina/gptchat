package Mf;

import id.AbstractC3557B;
import java.util.List;
import kg.C4290b;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final C4290b f12058a;

    /* renamed from: b  reason: collision with root package name */
    public final List f12059b;

    public D(C4290b c4290b, List list) {
        AbstractC3557B.c0("classId", c4290b);
        this.f12058a = c4290b;
        this.f12059b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (AbstractC3557B.K(this.f12058a, d10.f12058a) && AbstractC3557B.K(this.f12059b, d10.f12059b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12059b.hashCode() + (this.f12058a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f12058a + ", typeParametersCount=" + this.f12059b + ')';
    }
}
