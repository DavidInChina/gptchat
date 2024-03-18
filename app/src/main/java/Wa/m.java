package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2676B;
import dh.C2682H;
import dh.u0;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class m {
    public static final l Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f20856e;

    /* renamed from: a  reason: collision with root package name */
    public final String f20857a;

    /* renamed from: b  reason: collision with root package name */
    public final a f20858b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f20859c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f20860d;

    /* JADX WARN: Type inference failed for: r4v0, types: [Wa.l, java.lang.Object] */
    static {
        C2676B B10 = P4.a.B("com.openai.feature.gizmos.api.GizmoActionAuthStatus", a.values(), new String[]{"valid", "expired", "missing"}, new Annotation[][]{null, null, null});
        u0 u0Var = u0.f28491a;
        f20856e = new KSerializer[]{null, B10, new C2682H(u0Var, P4.a.B("com.openai.feature.gizmos.api.GizmoActionStatus", n.values(), new String[]{"always_allow", "unset"}, new Annotation[][]{null, null}), 1), new C2682H(u0Var, b.f20839a, 1)};
    }

    public m(int i10, String str, a aVar, Map map, Map map2) {
        if (13 != (i10 & 13)) {
            R4.b.e2(i10, 13, k.f20855b);
            throw null;
        }
        this.f20857a = str;
        if ((i10 & 2) == 0) {
            this.f20858b = null;
        } else {
            this.f20858b = aVar;
        }
        this.f20859c = map;
        this.f20860d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3557B.K(this.f20857a, mVar.f20857a) && this.f20858b == mVar.f20858b && AbstractC3557B.K(this.f20859c, mVar.f20859c) && AbstractC3557B.K(this.f20860d, mVar.f20860d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f20857a.hashCode() * 31;
        int i12 = 0;
        a aVar = this.f20858b;
        if (aVar == null) {
            i10 = 0;
        } else {
            i10 = aVar.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        Map map = this.f20859c;
        if (map == null) {
            i11 = 0;
        } else {
            i11 = map.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Map map2 = this.f20860d;
        if (map2 != null) {
            i12 = map2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "GizmoActionSettingsItem(actionId=" + this.f20857a + ", oauthStatus=" + this.f20858b + ", actionSettings=" + this.f20859c + ", operations=" + this.f20860d + Separators.RPAREN;
    }

    public m(String str, a aVar, Map map, Map map2) {
        this.f20857a = str;
        this.f20858b = aVar;
        this.f20859c = map;
        this.f20860d = map2;
    }
}
