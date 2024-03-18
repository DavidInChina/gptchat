package E2;

import java.io.IOException;

/* renamed from: E2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473e extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0473e(int i10) {
        super("Illegal clipping: ".concat(r2));
        String str;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    str = "unknown";
                } else {
                    str = "start exceeds end";
                }
            } else {
                str = "not seekable to start";
            }
        } else {
            str = "invalid period count";
        }
    }
}
