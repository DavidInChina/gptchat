package Yg;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import j$.time.ZoneOffset;

@AbstractC1998i(with = Zg.m.class)
/* loaded from: classes.dex */
public final class y {
    public static final x Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final ZoneOffset f22425a;

    /* JADX WARN: Type inference failed for: r0v0, types: [Yg.x, java.lang.Object] */
    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        AbstractC3557B.b0("UTC", zoneOffset);
        new y(zoneOffset);
    }

    public y(ZoneOffset zoneOffset) {
        AbstractC3557B.c0("zoneOffset", zoneOffset);
        this.f22425a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            if (AbstractC3557B.K(this.f22425a, ((y) obj).f22425a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22425a.hashCode();
    }

    public final String toString() {
        String zoneOffset = this.f22425a.toString();
        AbstractC3557B.b0("toString(...)", zoneOffset);
        return zoneOffset;
    }
}
