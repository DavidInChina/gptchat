package wd;

import id.AbstractC3557B;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* renamed from: wd.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6180b0 {
    public static String a() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
        String obj = Lg.n.C2(uuid, 0, 5, "bbb21").toString();
        AbstractC3557B.c0("value", obj);
        return obj;
    }

    public final KSerializer serializer() {
        return C6178a0.f48382a;
    }
}
