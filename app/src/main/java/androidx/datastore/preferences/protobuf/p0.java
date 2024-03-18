package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p0 {
    public static boolean a(Object obj, AbstractC2020f0 abstractC2020f0) {
        int tag = abstractC2020f0.getTag();
        int i10 = tag >>> 3;
        int i11 = tag & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            ((o0) obj).c((i10 << 3) | 5, Integer.valueOf(abstractC2020f0.h()));
                            return true;
                        }
                        throw D.b();
                    }
                    o0 b10 = o0.b();
                    int i12 = i10 << 3;
                    int i13 = i12 | 4;
                    while (abstractC2020f0.w() != Integer.MAX_VALUE && a(b10, abstractC2020f0)) {
                    }
                    if (i13 == abstractC2020f0.getTag()) {
                        b10.f25099e = false;
                        ((o0) obj).c(i12 | 3, b10);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((o0) obj).c((i10 << 3) | 2, abstractC2020f0.z());
                return true;
            }
            ((o0) obj).c((i10 << 3) | 1, Long.valueOf(abstractC2020f0.d()));
            return true;
        }
        ((o0) obj).c(i10 << 3, Long.valueOf(abstractC2020f0.I()));
        return true;
    }
}
