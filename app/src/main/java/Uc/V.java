package Uc;

import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class V extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final V f17631i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17632j = AbstractC4344b.F0(r9.y.N0("sharedId", C1417b.f17638C0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return true;
    }

    public final int hashCode() {
        return 1620401675;
    }

    @Override // Ad.l
    public final List n0() {
        return f17632j;
    }

    public final String toString() {
        return "ViewSharedConversation";
    }

    @Override // Ad.l
    public final String x0() {
        return "view-shared-conversation/{sharedId}";
    }
}
