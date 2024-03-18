package sb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f45519a;

    /* renamed from: b  reason: collision with root package name */
    public final M9.c f45520b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45521c;

    /* renamed from: d  reason: collision with root package name */
    public final List f45522d;

    public r(C2969F c2969f, M9.c cVar, String str, List list) {
        AbstractC3557B.c0("message", c2969f);
        AbstractC3557B.c0("rating", cVar);
        AbstractC3557B.c0("tags", list);
        this.f45519a = c2969f;
        this.f45520b = cVar;
        this.f45521c = str;
        this.f45522d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f45519a, rVar.f45519a) && this.f45520b == rVar.f45520b && AbstractC3557B.K(this.f45521c, rVar.f45521c) && AbstractC3557B.K(this.f45522d, rVar.f45522d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f45520b.hashCode() + (this.f45519a.hashCode() * 31)) * 31;
        String str = this.f45521c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f45522d.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "SubmitDetailedMessageFeedback(message=" + this.f45519a + ", rating=" + this.f45520b + ", comment=" + this.f45521c + ", tags=" + this.f45522d + Separators.RPAREN;
    }
}
