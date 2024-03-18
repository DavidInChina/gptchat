package I2;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class m extends IOException {
    public m(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}
