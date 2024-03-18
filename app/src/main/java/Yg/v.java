package Yg;

import id.AbstractC3557B;
import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class v {
    public static w a() {
        ZoneId systemDefault = ZoneId.systemDefault();
        AbstractC3557B.b0("systemDefault(...)", systemDefault);
        return c(systemDefault);
    }

    public static w b(String str) {
        AbstractC3557B.c0("zoneId", str);
        try {
            ZoneId of2 = ZoneId.of(str);
            AbstractC3557B.b0("of(...)", of2);
            return c(of2);
        } catch (Exception e10) {
            if (e10 instanceof DateTimeException) {
                throw new Ad.t(2, e10);
            }
            throw e10;
        }
    }

    public static w c(ZoneId zoneId) {
        if (zoneId instanceof ZoneOffset) {
            return new n(new y((ZoneOffset) zoneId));
        }
        try {
            if (zoneId.getRules().isFixedOffset()) {
                ZoneId normalized = zoneId.normalized();
                AbstractC3557B.a0("null cannot be cast to non-null type java.time.ZoneOffset", normalized);
                return new n(new y((ZoneOffset) normalized), zoneId);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return new w(zoneId);
    }

    public final KSerializer serializer() {
        return Zg.l.f23757a;
    }
}
