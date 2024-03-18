package Ad;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class t extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i10, Exception exc) {
        super(exc);
        if (i10 != 2) {
        } else {
            super(exc);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, int i10) {
        super("Header(s) " + str + " are controlled by the engine and cannot be set explicitly");
        if (i10 != 3) {
            AbstractC3557B.c0("header", str);
            return;
        }
        AbstractC3557B.c0("msg", str);
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(String str, int i10, int i11) {
        super(AbstractC2469q0.j(r7, str.charAt(i10) & '\u00ff', ')'));
        if (i11 != 1) {
            AbstractC3557B.c0("headerName", str);
            StringBuilder sb2 = new StringBuilder("Header name '");
            sb2.append(str);
            sb2.append("' contains illegal character '");
            sb2.append(str.charAt(i10));
            sb2.append("' (code ");
            return;
        }
        AbstractC3557B.c0("headerValue", str);
        StringBuilder sb3 = new StringBuilder("Header value '");
        sb3.append(str);
        sb3.append("' contains illegal character '");
        sb3.append(str.charAt(i10));
        sb3.append("' (code ");
        super(AbstractC2469q0.j(sb3, str.charAt(i10) & '\u00ff', ')'));
    }

    public t() {
        super("Conversation not found");
    }
}
