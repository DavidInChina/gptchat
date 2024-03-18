package wd;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* renamed from: wd.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6208v {
    public static String a(String str) {
        AbstractC3557B.c0("fileId", str);
        String concat = "file-service://".concat(str);
        AbstractC3557B.c0("value", concat);
        return concat;
    }

    public final KSerializer serializer() {
        return C6207u.f48466a;
    }
}
