package O9;

import ah.AbstractC1998i;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class k1 implements AbstractC1102f {
    public static final k1 INSTANCE = new Object();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AbstractC3957g f13550a = R4.b.C1(EnumC3958h.f36152Y, j1.f13547Y);

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.k1, java.lang.Object] */
    static {
        EnumC1098d[] enumC1098dArr = EnumC1098d.f13527Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return true;
    }

    public final int hashCode() {
        return 357735482;
    }

    public final KSerializer serializer() {
        return (KSerializer) f13550a.getValue();
    }

    public final String toString() {
        return "ApiSystemErrorContent";
    }
}
