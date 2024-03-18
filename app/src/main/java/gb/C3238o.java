package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gb.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3238o {

    /* renamed from: a  reason: collision with root package name */
    public final List f31494a;

    public C3238o(ArrayList arrayList) {
        this.f31494a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3238o) && AbstractC3557B.K(this.f31494a, ((C3238o) obj).f31494a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31494a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("MessageImageListData(list="), this.f31494a, Separators.RPAREN);
    }
}
