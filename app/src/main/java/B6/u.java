package B6;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final I2.i f1974a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1975b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1976c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1977d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1978e;

    /* renamed from: f  reason: collision with root package name */
    public final p f1979f;

    /* renamed from: g  reason: collision with root package name */
    public final r f1980g;

    /* renamed from: h  reason: collision with root package name */
    public final t f1981h;

    /* renamed from: i  reason: collision with root package name */
    public final o f1982i;

    /* renamed from: j  reason: collision with root package name */
    public final List f1983j;

    /* renamed from: k  reason: collision with root package name */
    public final s f1984k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1985l = "telemetry";

    public u(I2.i iVar, long j6, String str, int i10, String str2, p pVar, r rVar, t tVar, o oVar, List list, s sVar) {
        AbstractC2469q0.q("source", i10);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        this.f1974a = iVar;
        this.f1975b = j6;
        this.f1976c = str;
        this.f1977d = i10;
        this.f1978e = str2;
        this.f1979f = pVar;
        this.f1980g = rVar;
        this.f1981h = tVar;
        this.f1982i = oVar;
        this.f1983j = list;
        this.f1984k = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f1974a, uVar.f1974a) && this.f1975b == uVar.f1975b && AbstractC3557B.K(this.f1976c, uVar.f1976c) && this.f1977d == uVar.f1977d && AbstractC3557B.K(this.f1978e, uVar.f1978e) && AbstractC3557B.K(this.f1979f, uVar.f1979f) && AbstractC3557B.K(this.f1980g, uVar.f1980g) && AbstractC3557B.K(this.f1981h, uVar.f1981h) && AbstractC3557B.K(this.f1982i, uVar.f1982i) && AbstractC3557B.K(this.f1983j, uVar.f1983j) && AbstractC3557B.K(this.f1984k, uVar.f1984k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j6 = this.f1975b;
        int v10 = E9.f.v(this.f1978e, AbstractC6708l.d(this.f1977d, E9.f.v(this.f1976c, ((this.f1974a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31), 31), 31);
        int i14 = 0;
        p pVar = this.f1979f;
        if (pVar == null) {
            i10 = 0;
        } else {
            i10 = pVar.f1965a.hashCode();
        }
        int i15 = (v10 + i10) * 31;
        r rVar = this.f1980g;
        if (rVar == null) {
            i11 = 0;
        } else {
            i11 = rVar.f1968a.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        t tVar = this.f1981h;
        if (tVar == null) {
            i12 = 0;
        } else {
            i12 = tVar.f1973a.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        o oVar = this.f1982i;
        if (oVar == null) {
            i13 = 0;
        } else {
            i13 = oVar.f1964a.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        List list = this.f1983j;
        if (list != null) {
            i14 = list.hashCode();
        }
        return this.f1984k.hashCode() + ((i18 + i14) * 31);
    }

    public final String toString() {
        return "TelemetryErrorEvent(dd=" + this.f1974a + ", date=" + this.f1975b + ", service=" + this.f1976c + ", source=" + AbstractC0044t0.K(this.f1977d) + ", version=" + this.f1978e + ", application=" + this.f1979f + ", session=" + this.f1980g + ", view=" + this.f1981h + ", action=" + this.f1982i + ", experimentalFeatures=" + this.f1983j + ", telemetry=" + this.f1984k + Separators.RPAREN;
    }
}
