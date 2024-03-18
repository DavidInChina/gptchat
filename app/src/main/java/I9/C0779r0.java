package I9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import id.AbstractC3557B;

/* renamed from: I9.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779r0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f8439a;

    public C0779r0(C2311c c2311c) {
        AbstractC3557B.c0("conversation", c2311c);
        this.f8439a = c2311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0779r0) && AbstractC3557B.K(this.f8439a, ((C0779r0) obj).f8439a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8439a.hashCode();
    }

    public final String toString() {
        return "ArchiveConversation(conversation=" + this.f8439a + Separators.RPAREN;
    }
}
