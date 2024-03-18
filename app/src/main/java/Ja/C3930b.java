package ja;

import cb.C2334C;
import kotlinx.serialization.KSerializer;

/* renamed from: ja.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3930b {
    public static C3931c a(C2334C c2334c) {
        if (c2334c != null) {
            return new C3931c(c2334c.f26439b, false, false, c2334c.f26445h.f26518a, false, 22);
        }
        return null;
    }

    public final KSerializer serializer() {
        return C3929a.f36090a;
    }
}
