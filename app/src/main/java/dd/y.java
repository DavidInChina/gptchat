package Dd;

import ah.AbstractC1998i;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class y extends AbstractC0392m {
    public static final y INSTANCE = new Object();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AbstractC3957g f3582a = R4.b.C1(EnumC3958h.f36152Y, x.f3581Y);

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
        return -252388757;
    }

    public final KSerializer serializer() {
        return (KSerializer) f3582a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
