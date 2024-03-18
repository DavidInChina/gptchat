package Uc;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class O extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final O f17622i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17623j = AbstractC4344b.F0(r9.y.N0(ParameterNames.ID, C1417b.f17636A0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return true;
    }

    public final int hashCode() {
        return -1647834556;
    }

    @Override // Ad.l
    public final List n0() {
        return f17623j;
    }

    public final String toString() {
        return "ShareConversation";
    }

    @Override // Ad.l
    public final String x0() {
        return "share-conversation/{id}";
    }
}
