package Pb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f13921b = {new C2695d(a.f13914a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f13922a;

    public f(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f13922a = v.f37483Y;
        } else {
            this.f13922a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f13922a, ((f) obj).f13922a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13922a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("ApiPromptsResponse(items="), this.f13922a, Separators.RPAREN);
    }
}
