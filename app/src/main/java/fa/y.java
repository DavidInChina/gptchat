package fa;

import ah.AbstractC1998i;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class y extends AbstractC2965B {
    public static final y INSTANCE = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AbstractC3957g f30084b = R4.b.C1(EnumC3958h.f36152Y, x.f30083Y);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return true;
    }

    public final int hashCode() {
        return -2005112648;
    }

    public final KSerializer serializer() {
        return (KSerializer) f30084b.getValue();
    }

    public final String toString() {
        return "SystemError";
    }
}
