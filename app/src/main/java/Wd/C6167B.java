package wd;

import id.AbstractC3557B;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* renamed from: wd.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6167B {
    public static String a() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
        return uuid;
    }

    public final KSerializer serializer() {
        return C6166A.f48310a;
    }
}
