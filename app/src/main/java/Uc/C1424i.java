package Uc;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Uc.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1424i extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C1424i f17679i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17680j = AbstractC4344b.F0(r9.y.N0(ParameterNames.ID, C1417b.f17655s0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1424i)) {
            return false;
        }
        C1424i c1424i = (C1424i) obj;
        return true;
    }

    public final int hashCode() {
        return 167541761;
    }

    @Override // Ad.l
    public final List n0() {
        return f17680j;
    }

    public final String toString() {
        return "ConversationDetails";
    }

    @Override // Ad.l
    public final String x0() {
        return "conversation/details?id={id}";
    }
}
