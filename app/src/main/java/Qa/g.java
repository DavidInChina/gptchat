package Qa;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class g {
    public final <T0, T1> KSerializer serializer(KSerializer kSerializer, KSerializer kSerializer2) {
        AbstractC3557B.c0("typeSerial0", kSerializer);
        AbstractC3557B.c0("typeSerial1", kSerializer2);
        return new f(kSerializer, kSerializer2);
    }
}
