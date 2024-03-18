package ph;

import android.gov.nist.core.Separators;
import yh.l1;

/* loaded from: classes.dex */
public final class i implements j {
    @Override // ph.j
    public final String a(l1 l1Var) {
        String str;
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            if (i10 < length) {
                if (stackTrace[i10].getClassName().equals(C5189a.class.getName())) {
                    z10 = true;
                } else if (z10) {
                    str = stackTraceElement.getClassName() + Separators.DOT + stackTraceElement.getMethodName();
                    break;
                }
                i10++;
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            return l1Var.getName() + "$" + str.replace('.', '$');
        }
        throw new IllegalStateException("Base name resolver not invoked via " + C5189a.class);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        Object obj2 = h.f43206Y;
        if (obj2.equals(obj2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return h.f43206Y.hashCode() + (i.class.hashCode() * 31);
    }
}
