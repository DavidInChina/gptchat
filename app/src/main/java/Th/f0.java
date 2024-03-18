package th;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class f0 extends g0 {
    @Override // th.g0
    public final String b(byte b10) {
        return "(byte)0x" + Integer.toHexString(b10 & 255);
    }

    @Override // th.g0
    public final String c(char c10) {
        StringBuilder sb2 = new StringBuilder(Separators.QUOTE);
        if (c10 == '\'') {
            sb2.append("\\'");
        } else {
            sb2.append(c10);
        }
        sb2.append('\'');
        return sb2.toString();
    }

    @Override // th.g0
    public final String d(double d10) {
        if (Math.abs(d10) <= Double.MAX_VALUE) {
            return Double.toString(d10);
        }
        if (Double.isInfinite(d10)) {
            if (d10 < 0.0d) {
                return "-1.0/0.0";
            }
            return "1.0/0.0";
        }
        return "0.0/0.0";
    }

    @Override // th.g0
    public final String e(float f6) {
        if (Math.abs(f6) <= Float.MAX_VALUE) {
            return f6 + "f";
        } else if (Float.isInfinite(f6)) {
            if (f6 < 0.0f) {
                return "-1.0f/0.0f";
            }
            return "1.0f/0.0f";
        } else {
            return "0.0f/0.0f";
        }
    }

    @Override // th.g0
    public final String f(long j6) {
        return j6 + TokenNames.f24315L;
    }

    @Override // th.g0
    public final String g(String str) {
        StringBuilder sb2 = new StringBuilder(Separators.DOUBLE_QUOTE);
        if (str.indexOf(34) != -1) {
            str = str.replace(Separators.DOUBLE_QUOTE, "\\\"");
        }
        return R.a.t(sb2, str, Separators.DOUBLE_QUOTE);
    }

    @Override // th.g0
    public final String i(l1 l1Var) {
        return l1Var.R0() + ".class";
    }

    @Override // th.g0
    public final String j(Class cls) {
        return cls.getName();
    }
}
