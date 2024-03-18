package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class X {
    public static final W Companion = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer[] f32043h = {P4.a.E("com.openai.feature.conversations.domain.metadata.ToolCommand", U.values()), null, P4.a.E("com.openai.feature.conversations.domain.metadata.ToolStatus", Y.values()), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final U f32044a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.serialization.json.a f32045b;

    /* renamed from: c  reason: collision with root package name */
    public final Y f32046c;

    /* renamed from: d  reason: collision with root package name */
    public final M f32047d;

    /* renamed from: e  reason: collision with root package name */
    public final T f32048e;

    /* renamed from: f  reason: collision with root package name */
    public final O9.Q f32049f;

    /* renamed from: g  reason: collision with root package name */
    public final String f32050g;

    public /* synthetic */ X(T t10, O9.Q q10, String str, int i10) {
        this(null, null, null, null, (i10 & 16) != 0 ? null : t10, (i10 & 32) != 0 ? null : q10, (i10 & 64) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        if (this.f32044a != x10.f32044a || !AbstractC3557B.K(this.f32045b, x10.f32045b) || this.f32046c != x10.f32046c || !AbstractC3557B.K(this.f32047d, x10.f32047d) || !AbstractC3557B.K(this.f32048e, x10.f32048e) || !AbstractC3557B.K(this.f32049f, x10.f32049f)) {
            return false;
        }
        String str = this.f32050g;
        String str2 = x10.f32050g;
        if (str != null ? str2 != null && AbstractC3557B.K(str, str2) : str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        U u10 = this.f32044a;
        if (u10 == null) {
            i10 = 0;
        } else {
            i10 = u10.hashCode();
        }
        int i17 = i10 * 31;
        kotlinx.serialization.json.a aVar = this.f32045b;
        if (aVar == null) {
            i11 = 0;
        } else {
            i11 = aVar.f37661Y.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        Y y10 = this.f32046c;
        if (y10 == null) {
            i12 = 0;
        } else {
            i12 = y10.hashCode();
        }
        int i19 = (i18 + i12) * 31;
        M m10 = this.f32047d;
        if (m10 == null) {
            i13 = 0;
        } else {
            i13 = m10.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        T t10 = this.f32048e;
        if (t10 == null) {
            i14 = 0;
        } else {
            i14 = t10.hashCode();
        }
        int i21 = (i20 + i14) * 31;
        O9.Q q10 = this.f32049f;
        if (q10 == null) {
            i15 = 0;
        } else {
            i15 = q10.hashCode();
        }
        int i22 = (i21 + i15) * 31;
        String str = this.f32050g;
        if (str != null) {
            i16 = str.hashCode();
        }
        return i22 + i16;
    }

    public final String toString() {
        String str;
        String str2 = this.f32050g;
        if (str2 == null) {
            str = "null";
        } else {
            str = wd.O.a(str2);
        }
        return "ToolMetadata(command=" + this.f32044a + ", args=" + this.f32045b + ", status=" + this.f32046c + ", actionCall=" + this.f32047d + ", actionResponse=" + this.f32048e + ", invokedPlugin=" + this.f32049f + ", gizmoId=" + str + Separators.RPAREN;
    }

    public X(int i10, U u10, kotlinx.serialization.json.a aVar, Y y10, M m10, T t10, O9.Q q10, String str) {
        if ((i10 & 1) == 0) {
            this.f32044a = null;
        } else {
            this.f32044a = u10;
        }
        if ((i10 & 2) == 0) {
            this.f32045b = null;
        } else {
            this.f32045b = aVar;
        }
        if ((i10 & 4) == 0) {
            this.f32046c = null;
        } else {
            this.f32046c = y10;
        }
        if ((i10 & 8) == 0) {
            this.f32047d = null;
        } else {
            this.f32047d = m10;
        }
        if ((i10 & 16) == 0) {
            this.f32048e = null;
        } else {
            this.f32048e = t10;
        }
        if ((i10 & 32) == 0) {
            this.f32049f = null;
        } else {
            this.f32049f = q10;
        }
        if ((i10 & 64) == 0) {
            this.f32050g = null;
        } else {
            this.f32050g = str;
        }
    }

    public X(U u10, kotlinx.serialization.json.a aVar, Y y10, M m10, T t10, O9.Q q10, String str) {
        this.f32044a = u10;
        this.f32045b = aVar;
        this.f32046c = y10;
        this.f32047d = m10;
        this.f32048e = t10;
        this.f32049f = q10;
        this.f32050g = str;
    }
}
