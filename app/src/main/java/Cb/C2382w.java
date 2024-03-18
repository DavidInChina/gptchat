package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2382w {
    public static final C2381v Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f26554b = {P4.a.E("com.openai.feature.gizmos.model.Gizmo.ToolAuthType", EnumC2383x.values())};

    /* renamed from: a  reason: collision with root package name */
    public final EnumC2383x f26555a;

    public C2382w(int i10, EnumC2383x enumC2383x) {
        if (1 == (i10 & 1)) {
            this.f26555a = enumC2383x;
        } else {
            R4.b.e2(i10, 1, C2380u.f26553b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2382w) && this.f26555a == ((C2382w) obj).f26555a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26555a.hashCode();
    }

    public final String toString() {
        return "ToolAuth(type=" + this.f26555a + Separators.RPAREN;
    }

    public C2382w(EnumC2383x enumC2383x) {
        this.f26555a = enumC2383x;
    }
}
