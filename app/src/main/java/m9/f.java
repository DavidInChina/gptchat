package M9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import wd.C6168C;
import wd.C6182c0;

@AbstractC1998i
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f11730f = {null, null, c.Companion.serializer(), null, new C2695d(l.Companion.serializer(), 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f11731a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11732b;

    /* renamed from: c  reason: collision with root package name */
    public final c f11733c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11734d;

    /* renamed from: e  reason: collision with root package name */
    public final List f11735e;

    public f(int i10, String str, String str2, c cVar, String str3, List list) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, d.f11729b);
            throw null;
        }
        this.f11731a = str;
        this.f11732b = str2;
        this.f11733c = cVar;
        this.f11734d = str3;
        if ((i10 & 16) == 0) {
            this.f11735e = null;
        } else {
            this.f11735e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f11731a, fVar.f11731a) && AbstractC3557B.K(this.f11732b, fVar.f11732b) && this.f11733c == fVar.f11733c && AbstractC3557B.K(this.f11734d, fVar.f11734d) && AbstractC3557B.K(this.f11735e, fVar.f11735e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f11733c.hashCode() + E9.f.v(this.f11732b, this.f11731a.hashCode() * 31, 31)) * 31;
        int i11 = 0;
        String str = this.f11734d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        List list = this.f11735e;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder t10 = android.gov.nist.core.a.t("MessageFeedbackRequest(conversationId=", C6168C.a(this.f11731a), ", messageId=", C6182c0.a(this.f11732b), ", rating=");
        t10.append(this.f11733c);
        t10.append(", text=");
        t10.append(this.f11734d);
        t10.append(", tags=");
        return android.gov.nist.core.a.o(t10, this.f11735e, Separators.RPAREN);
    }

    public f(String str, String str2, c cVar, String str3, List list) {
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("rating", cVar);
        this.f11731a = str;
        this.f11732b = str2;
        this.f11733c = cVar;
        this.f11734d = str3;
        this.f11735e = list;
    }
}
