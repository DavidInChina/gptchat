package I9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class E0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f8166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8167b;

    public E0(C2311c c2311c, String str) {
        AbstractC3557B.c0("conversation", c2311c);
        AbstractC3557B.c0("name", str);
        this.f8166a = c2311c;
        this.f8167b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (AbstractC3557B.K(this.f8166a, e02.f8166a) && AbstractC3557B.K(this.f8167b, e02.f8167b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8167b.hashCode() + (this.f8166a.hashCode() * 31);
    }

    public final String toString() {
        return "RenameConversation(conversation=" + this.f8166a + ", name=" + this.f8167b + Separators.RPAREN;
    }
}
