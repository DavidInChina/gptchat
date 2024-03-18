package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class n0 extends RuntimeException {
    public /* synthetic */ n0() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(int i10) {
        super(r2);
        String str;
        if (i10 == 1) {
            str = "Player release timed out.";
        } else if (i10 == 2) {
            str = "Setting foreground mode timed out.";
        } else if (i10 != 3) {
            str = "Undefined timeout.";
        } else {
            str = "Detaching surface timed out.";
        }
    }
}
