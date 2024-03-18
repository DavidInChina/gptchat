package O9;

import ah.AbstractC1998i;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class p1 implements AbstractC1102f {
    public static final p1 INSTANCE = new Object();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AbstractC3957g f13580a = R4.b.C1(EnumC3958h.f36152Y, o1.f13569Y);

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.p1, java.lang.Object] */
    static {
        EnumC1098d[] enumC1098dArr = EnumC1098d.f13527Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return true;
    }

    public final int hashCode() {
        return -1278134370;
    }

    public final KSerializer serializer() {
        return (KSerializer) f13580a.getValue();
    }

    public final String toString() {
        return "ApiUnsupportedContent";
    }
}
