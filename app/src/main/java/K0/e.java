package K0;

import android.os.Parcel;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public class e extends RuntimeException {
    public /* synthetic */ e() {
        super("Failed to bind to the service.");
    }

    public /* synthetic */ e(int i10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, Throwable th2) {
        super(th2);
        if (i10 == 12) {
            super("Rethrow stored exception", th2);
        } else if (i10 != 15) {
        } else {
            super(th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, int i10) {
        super(str);
        if (i10 != 8) {
            AbstractC3557B.c0("message", str);
            return;
        }
        AbstractC3557B.c0("message", str);
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + r0 + " size=" + r4);
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
    }
}
