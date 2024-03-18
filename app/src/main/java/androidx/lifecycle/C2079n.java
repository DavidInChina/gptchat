package androidx.lifecycle;

import id.AbstractC3557B;

/* renamed from: androidx.lifecycle.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2079n {
    public static EnumC2081p a(EnumC2082q enumC2082q) {
        AbstractC3557B.c0("state", enumC2082q);
        int ordinal = enumC2082q.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return EnumC2081p.ON_RESUME;
            }
            return EnumC2081p.ON_START;
        }
        return EnumC2081p.ON_CREATE;
    }
}
