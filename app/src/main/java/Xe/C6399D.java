package xe;

import id.AbstractC3557B;

/* renamed from: xe.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6399D extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6399D(String str, String str2) {
        super("Failed to parse date string: \"" + str + "\". Reason: \"" + str2 + '\"');
        AbstractC3557B.c0("data", str);
        AbstractC3557B.c0("reason", str2);
    }
}
