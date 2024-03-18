package Y0;

import r0.AbstractC5350n;
import r0.J;
import r0.N;

/* loaded from: classes.dex */
public final class l {
    public static o a(float f6, AbstractC5350n abstractC5350n) {
        m mVar = m.f22036a;
        if (abstractC5350n != null) {
            if (abstractC5350n instanceof N) {
                boolean isNaN = Float.isNaN(f6);
                long j6 = ((N) abstractC5350n).f44223a;
                if (!isNaN && f6 < 1.0f) {
                    j6 = r0.r.b(j6, r0.r.d(j6) * f6);
                }
                if (j6 != r0.r.f44263k) {
                    return new c(j6);
                }
                return mVar;
            } else if (abstractC5350n instanceof J) {
                return new b((J) abstractC5350n, f6);
            } else {
                throw new RuntimeException();
            }
        }
        return mVar;
    }
}
