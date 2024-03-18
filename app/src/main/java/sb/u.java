package sb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f45524a;

    /* renamed from: b  reason: collision with root package name */
    public final M9.c f45525b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f45526c;

    public u(C2969F c2969f, M9.c cVar, boolean z10) {
        AbstractC3557B.c0("message", c2969f);
        this.f45524a = c2969f;
        this.f45525b = cVar;
        this.f45526c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f45524a, uVar.f45524a) && this.f45525b == uVar.f45525b && this.f45526c == uVar.f45526c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f45525b.hashCode() + (this.f45524a.hashCode() * 31)) * 31;
        if (this.f45526c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailedMessageFeedback(message=");
        sb2.append(this.f45524a);
        sb2.append(", rating=");
        sb2.append(this.f45525b);
        sb2.append(", loading=");
        return AbstractC4194d.w(sb2, this.f45526c, Separators.RPAREN);
    }
}
