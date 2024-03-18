package Bg;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public abstract class D extends o0 implements Eg.g, Eg.h {
    /* renamed from: F0 */
    public abstract D C0(boolean z10);

    /* renamed from: G0 */
    public abstract D E0(Q q10);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Nf.c cVar : getAnnotations()) {
            String[] strArr = {"[", mg.m.f39298e.w(cVar, null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb2.append(strArr[i10]);
            }
        }
        sb2.append(y0());
        if (!w0().isEmpty()) {
            kf.t.l2(w0(), sb2, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, null, 112);
        }
        if (z0()) {
            sb2.append(Separators.QUESTION);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }
}
