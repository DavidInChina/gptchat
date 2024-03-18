package fa;

import ah.AbstractC1998i;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: fa.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2964A extends AbstractC2965B {
    public static final C2964A INSTANCE = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AbstractC3957g f30000b = R4.b.C1(EnumC3958h.f36152Y, z.f30085Y);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2964A)) {
            return false;
        }
        C2964A c2964a = (C2964A) obj;
        return true;
    }

    public final int hashCode() {
        return -1836761083;
    }

    public final KSerializer serializer() {
        return (KSerializer) f30000b.getValue();
    }

    public final String toString() {
        return "UnsupportedContent";
    }
}
