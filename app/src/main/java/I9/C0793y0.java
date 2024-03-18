package I9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import id.AbstractC3557B;

/* renamed from: I9.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0793y0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f8471a;

    public C0793y0(C2311c c2311c) {
        AbstractC3557B.c0("conversation", c2311c);
        this.f8471a = c2311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0793y0) && AbstractC3557B.K(this.f8471a, ((C0793y0) obj).f8471a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8471a.hashCode();
    }

    public final String toString() {
        return "ConversationShown(conversation=" + this.f8471a + Separators.RPAREN;
    }
}
