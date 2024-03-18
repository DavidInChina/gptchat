package X9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import fa.C2969F;
import fa.EnumC2971H;
import id.AbstractC3557B;
import java.util.List;
import java.util.UUID;
import kf.t;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f21802a;

    /* renamed from: b  reason: collision with root package name */
    public final List f21803b;

    public b(C2969F c2969f, List list) {
        this.f21802a = c2969f;
        this.f21803b = list;
    }

    public static b a(b bVar, String str, boolean z10, int i10) {
        EnumC2971H enumC2971H = EnumC2971H.f30049i0;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        bVar.getClass();
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        C6182c0.Companion.getClass();
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
        C2969F c2969f = bVar.f21802a;
        return new b(c2969f, t.x2(new C2969F(uuid, c2969f.f30009b, str, c2969f.f30023p, null, null, null, enumC2971H, null, z11, 880), bVar.f21803b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f21802a, bVar.f21802a) && AbstractC3557B.K(this.f21803b, bVar.f21803b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21803b.hashCode() + (this.f21802a.hashCode() * 31);
    }

    public final String toString() {
        return "OutgoingMessages(userMessage=" + this.f21802a + ", prependedMessages=" + this.f21803b + Separators.RPAREN;
    }
}
