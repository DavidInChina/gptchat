package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.u0;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class I {
    public static final H Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f15267e;

    /* renamed from: a  reason: collision with root package name */
    public final L f15268a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15269b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15270c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f15271d;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, Rb.H] */
    static {
        u0 u0Var = u0.f28491a;
        f15267e = new KSerializer[]{null, null, null, new C2682H(u0Var, u0Var, 1)};
    }

    public I(int i10, L l10, String str, String str2, Map map) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, G.f15266b);
            throw null;
        }
        this.f15268a = l10;
        this.f15269b = str;
        this.f15270c = str2;
        if ((i10 & 8) == 0) {
            this.f15271d = kf.w.f37484Y;
        } else {
            this.f15271d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        if (AbstractC3557B.K(this.f15268a, i10.f15268a) && AbstractC3557B.K(this.f15269b, i10.f15269b) && AbstractC3557B.K(this.f15270c, i10.f15270c) && AbstractC3557B.K(this.f15271d, i10.f15271d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15268a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15269b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15270c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f15271d.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        return "ReportContentRequest(reason=" + this.f15268a + ", entityType=" + this.f15269b + ", entityId=" + this.f15270c + ", additionalFieldsValues=" + this.f15271d + Separators.RPAREN;
    }

    public I(L l10, String str, String str2, Map map) {
        this.f15268a = l10;
        this.f15269b = str;
        this.f15270c = str2;
        this.f15271d = map;
    }
}
