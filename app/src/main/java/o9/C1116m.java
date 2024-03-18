package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: O9.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116m {
    public static final C1108i Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f13558b = {EnumC1114l.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1114l f13559a;

    public C1116m() {
        this.f13559a = EnumC1114l.f13553h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1116m) && this.f13559a == ((C1116m) obj).f13559a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13559a.hashCode();
    }

    public final String toString() {
        return "ApiConversationFinishDetails(type=" + this.f13559a + Separators.RPAREN;
    }

    public C1116m(int i10, EnumC1114l enumC1114l) {
        if (1 == (i10 & 1)) {
            this.f13559a = enumC1114l;
        } else {
            R4.b.e2(i10, 1, C1106h.f13541b);
            throw null;
        }
    }
}
