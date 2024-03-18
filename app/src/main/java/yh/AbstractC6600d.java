package yh;

import android.gov.nist.core.Separators;
import java.lang.reflect.GenericSignatureFormatError;
import yh.l1;

/* renamed from: yh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6600d implements AbstractC6612h {
    public String N0() {
        l1.a type = getType();
        try {
            if (type.c().b()) {
                return null;
            }
            return ((Ph.a) type.k(new R0(new Ph.b()))).toString();
        } catch (GenericSignatureFormatError unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6612h)) {
            return false;
        }
        return f1().equals(((AbstractC6612h) obj).f1());
    }

    @Override // sh.AbstractC5637i.a
    public final String getDescriptor() {
        return getType().l0().getDescriptor();
    }

    public final int hashCode() {
        return f1().hashCode();
    }

    public final String toString() {
        return getType().getTypeName() + Separators.SP + f1();
    }
}
