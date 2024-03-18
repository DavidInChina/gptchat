package Ga;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f6219c = {new C2695d(m.f6222a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f6220a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6221b;

    public l(int i10, List list, int i11) {
        if (3 == (i10 & 3)) {
            this.f6220a = list;
            this.f6221b = i11;
            return;
        }
        R4.b.e2(i10, 3, j.f6218b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f6220a, lVar.f6220a) && this.f6221b == lVar.f6221b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6220a.hashCode() * 31) + this.f6221b;
    }

    public final String toString() {
        return "ConversationListResponse(items=" + this.f6220a + ", total=" + this.f6221b + Separators.RPAREN;
    }
}
