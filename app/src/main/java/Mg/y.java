package mg;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class y extends EnumC4650A {
    public y() {
        super("HTML", 1);
    }

    @Override // mg.EnumC4650A
    public final String a(String str) {
        AbstractC3557B.c0("string", str);
        return Lg.n.A2(Lg.n.A2(str, Separators.LESS_THAN, "&lt;"), Separators.GREATER_THAN, "&gt;");
    }
}
