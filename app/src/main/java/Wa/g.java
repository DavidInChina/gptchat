package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.u0;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class g {
    public static final f Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f20846d = {null, null, new C2682H(u0.f28491a, P4.a.B("com.openai.feature.gizmos.api.GizmoActionStatus", n.values(), new String[]{"always_allow", "unset"}, new Annotation[][]{null, null}), 1)};

    /* renamed from: a  reason: collision with root package name */
    public final String f20847a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20848b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f20849c;

    public g(int i10, String str, String str2, Map map) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, e.f20845b);
            throw null;
        }
        this.f20847a = str;
        this.f20848b = str2;
        this.f20849c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3557B.K(this.f20847a, gVar.f20847a) && AbstractC3557B.K(this.f20848b, gVar.f20848b) && AbstractC3557B.K(this.f20849c, gVar.f20849c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f20847a.hashCode() * 31;
        String str = this.f20848b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f20849c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "GizmoActionOperationUpdate(gizmoActionId=" + this.f20847a + ", domain=" + this.f20848b + ", actionSettings=" + this.f20849c + Separators.RPAREN;
    }

    public g(String str, String str2, Map map) {
        AbstractC3557B.c0("gizmoActionId", str);
        this.f20847a = str;
        this.f20848b = str2;
        this.f20849c = map;
    }
}
