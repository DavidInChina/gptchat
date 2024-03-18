package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2379t {
    public static final C2378s Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f26548d = {null, P4.a.E("com.openai.feature.gizmos.model.Gizmo.ToolType", EnumC2333B.values()), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f26549a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC2333B f26550b;

    /* renamed from: c  reason: collision with root package name */
    public final C2332A f26551c;

    public C2379t(int i10, String str, EnumC2333B enumC2333B, C2332A c2332a) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C2377r.f26547b);
            throw null;
        }
        this.f26549a = str;
        this.f26550b = enumC2333B;
        if ((i10 & 4) == 0) {
            this.f26551c = null;
        } else {
            this.f26551c = c2332a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2379t)) {
            return false;
        }
        C2379t c2379t = (C2379t) obj;
        if (AbstractC3557B.K(this.f26549a, c2379t.f26549a) && this.f26550b == c2379t.f26550b && AbstractC3557B.K(this.f26551c, c2379t.f26551c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f26550b.hashCode() + (this.f26549a.hashCode() * 31)) * 31;
        C2332A c2332a = this.f26551c;
        if (c2332a == null) {
            i10 = 0;
        } else {
            i10 = c2332a.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Tool(id=" + this.f26549a + ", type=" + this.f26550b + ", metadata=" + this.f26551c + Separators.RPAREN;
    }

    public C2379t(String str, EnumC2333B enumC2333B, C2332A c2332a) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f26549a = str;
        this.f26550b = enumC2333B;
        this.f26551c = c2332a;
    }
}
