package Lc;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class l extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, int i10) {
        super(str);
        if (i10 == 2) {
            super(str);
        } else if (i10 != 3) {
            AbstractC3557B.c0("message", str);
        } else {
            AbstractC3557B.c0("message", str);
            super(str);
        }
    }

    public l() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public /* synthetic */ l(int i10) {
        this("An operation is not implemented.", 1);
    }
}
