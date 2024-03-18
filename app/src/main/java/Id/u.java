package id;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.u0;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class u {
    public static final t Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f33127b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f33128a;

    /* JADX WARN: Type inference failed for: r1v0, types: [id.t, java.lang.Object] */
    static {
        u0 u0Var = u0.f28491a;
        f33127b = new KSerializer[]{new C2682H(u0Var, u0Var, 1)};
    }

    public u(Map map) {
        AbstractC3557B.c0("columns", map);
        this.f33128a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && AbstractC3557B.K(this.f33128a, ((u) obj).f33128a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33128a.hashCode();
    }

    public final String toString() {
        return "SpreadsheetMetadata(columns=" + this.f33128a + Separators.RPAREN;
    }

    public u(int i10, Map map) {
        if ((i10 & 1) == 0) {
            this.f33128a = kf.w.f37484Y;
        } else {
            this.f33128a = map;
        }
    }

    public /* synthetic */ u() {
        this(kf.w.f37484Y);
    }
}
