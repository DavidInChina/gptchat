package yh;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;

/* loaded from: classes2.dex */
public abstract class r extends AbstractC6635s {
    @Override // yh.l1
    public final String R0() {
        if (!K() && !m()) {
            String D02 = D0();
            l1 W6 = W();
            if (W6 != null) {
                if (D02.startsWith(W6.D0() + "$")) {
                    return W6.R0() + Separators.DOT + D02.substring(W6.D0().length() + 1);
                }
            }
            return getName();
        }
        return null;
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final boolean a1() {
        return false;
    }

    @Override // sh.AbstractC5637i.a
    public final String getDescriptor() {
        return TokenNames.f24315L + D0() + Separators.SEMICOLON;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:7:0x002d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String o() {
        int i10;
        String D02 = D0();
        l1 W6 = W();
        if (W6 != null) {
            if (D02.startsWith(W6.D0() + "$")) {
                i10 = W6.D0().length();
                i10++;
                if (i10 < D02.length() || Character.isLetter(D02.charAt(i10))) {
                    return D02.substring(i10);
                }
                i10++;
                if (i10 < D02.length()) {
                }
                return D02.substring(i10);
            }
        }
        i10 = D02.lastIndexOf(47);
        if (i10 == -1) {
            return D02;
        }
        if (i10 < D02.length()) {
        }
        return D02.substring(i10);
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return Hh.o.SINGLE;
    }

    @Override // yh.AbstractC6635s, yh.l1, yh.AbstractC6632q
    /* renamed from: g */
    public final l1 mo119g() {
        return null;
    }
}
