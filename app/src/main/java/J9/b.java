package J9;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import java.util.Map;
import k6.AbstractC4194d;
import kf.w;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f8894a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f8895b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8896c;

    public b(C2334C c2334c, Map map, boolean z10) {
        AbstractC3557B.c0("allGizmosInConversation", map);
        this.f8894a = c2334c;
        this.f8895b = map;
        this.f8896c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f8894a, bVar.f8894a) && AbstractC3557B.K(this.f8895b, bVar.f8895b) && this.f8896c == bVar.f8896c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        C2334C c2334c = this.f8894a;
        if (c2334c == null) {
            i10 = 0;
        } else {
            i10 = c2334c.hashCode();
        }
        int f6 = AbstractC6463a.f(this.f8895b, i10 * 31, 31);
        if (this.f8896c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return f6 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationGizmoState(primaryGizmo=");
        sb2.append(this.f8894a);
        sb2.append(", allGizmosInConversation=");
        sb2.append(this.f8895b);
        sb2.append(", isLoading=");
        return AbstractC4194d.w(sb2, this.f8896c, Separators.RPAREN);
    }

    public /* synthetic */ b() {
        this(null, w.f37484Y, false);
    }
}
