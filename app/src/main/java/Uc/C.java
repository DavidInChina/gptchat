package Uc;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class C extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C f17609i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17610j = AbstractC4344b.F0(r9.y.N0(ParameterNames.ID, C1417b.f17662z0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return true;
    }

    public final int hashCode() {
        return 2139699022;
    }

    @Override // Ad.l
    public final List n0() {
        return f17610j;
    }

    public final String toString() {
        return "ImageDetail";
    }

    @Override // Ad.l
    public final String x0() {
        return "conversation/edit?id={id}";
    }
}
