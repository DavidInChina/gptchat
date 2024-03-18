package I8;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class A extends C {
    public A() {
        super("LONG_OR_DOUBLE", 2);
    }

    @Override // I8.D
    public final Number a(P8.b bVar) {
        String H02 = bVar.H0();
        try {
            try {
                return Long.valueOf(Long.parseLong(H02));
            } catch (NumberFormatException unused) {
                Double valueOf = Double.valueOf(H02);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!bVar.f13851Z) {
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + bVar.O());
                }
                return valueOf;
            }
        } catch (NumberFormatException e10) {
            StringBuilder s10 = android.gov.nist.core.a.s("Cannot parse ", H02, "; at path ");
            s10.append(bVar.O());
            throw new RuntimeException(s10.toString(), e10);
        }
    }
}
