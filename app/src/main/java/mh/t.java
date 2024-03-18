package mh;

import id.AbstractC3557B;
import q0.C5251c;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final t f39507a = new Object();

    @Override // mh.v
    public final C5252d b(long j6, Z0.l lVar) {
        AbstractC3557B.c0("direction", lVar);
        int i10 = C5251c.f43622e;
        return A7.b.K(C5251c.f43619b, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return true;
    }

    public final int hashCode() {
        return 807724423;
    }

    public final String toString() {
        return "SameAsLayoutBounds";
    }

    @Override // mh.v
    public final long a(long j6) {
        return j6;
    }
}
