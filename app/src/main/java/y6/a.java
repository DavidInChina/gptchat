package Y6;

import E9.f;
import K0.e;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j6, long j10, char c10, String str) {
        super(str + " [rowNum = " + j6 + ", colIndex = " + j10 + ", char = " + c10 + ']', 4);
        AbstractC3557B.c0("message", str);
    }

    public a(int i10, int i11, int i12) {
        super(AbstractC2469q0.j(f.A("Fields num seems to be ", i10, " on each row, but on ", i12, "th csv row, fields num is "), i11, '.'), 4);
    }
}
