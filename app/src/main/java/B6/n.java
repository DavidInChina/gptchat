package B6;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final I2.i f1952a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1953b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1954c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1955d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1956e;

    /* renamed from: f  reason: collision with root package name */
    public final j f1957f;

    /* renamed from: g  reason: collision with root package name */
    public final k f1958g;

    /* renamed from: h  reason: collision with root package name */
    public final m f1959h;

    /* renamed from: i  reason: collision with root package name */
    public final i f1960i;

    /* renamed from: j  reason: collision with root package name */
    public final List f1961j;

    /* renamed from: k  reason: collision with root package name */
    public final l f1962k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1963l = "telemetry";

    public n(I2.i iVar, long j6, String str, int i10, String str2, j jVar, k kVar, m mVar, i iVar2, List list, l lVar) {
        AbstractC2469q0.q("source", i10);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        this.f1952a = iVar;
        this.f1953b = j6;
        this.f1954c = str;
        this.f1955d = i10;
        this.f1956e = str2;
        this.f1957f = jVar;
        this.f1958g = kVar;
        this.f1959h = mVar;
        this.f1960i = iVar2;
        this.f1961j = list;
        this.f1962k = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3557B.K(this.f1952a, nVar.f1952a) && this.f1953b == nVar.f1953b && AbstractC3557B.K(this.f1954c, nVar.f1954c) && this.f1955d == nVar.f1955d && AbstractC3557B.K(this.f1956e, nVar.f1956e) && AbstractC3557B.K(this.f1957f, nVar.f1957f) && AbstractC3557B.K(this.f1958g, nVar.f1958g) && AbstractC3557B.K(this.f1959h, nVar.f1959h) && AbstractC3557B.K(this.f1960i, nVar.f1960i) && AbstractC3557B.K(this.f1961j, nVar.f1961j) && AbstractC3557B.K(this.f1962k, nVar.f1962k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j6 = this.f1953b;
        int v10 = E9.f.v(this.f1956e, AbstractC6708l.d(this.f1955d, E9.f.v(this.f1954c, ((this.f1952a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31), 31), 31);
        int i14 = 0;
        j jVar = this.f1957f;
        if (jVar == null) {
            i10 = 0;
        } else {
            i10 = jVar.f1943a.hashCode();
        }
        int i15 = (v10 + i10) * 31;
        k kVar = this.f1958g;
        if (kVar == null) {
            i11 = 0;
        } else {
            i11 = kVar.f1944a.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        m mVar = this.f1959h;
        if (mVar == null) {
            i12 = 0;
        } else {
            i12 = mVar.f1951a.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        i iVar = this.f1960i;
        if (iVar == null) {
            i13 = 0;
        } else {
            i13 = iVar.f1942a.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        List list = this.f1961j;
        if (list != null) {
            i14 = list.hashCode();
        }
        return this.f1962k.hashCode() + ((i18 + i14) * 31);
    }

    public final String toString() {
        return "TelemetryDebugEvent(dd=" + this.f1952a + ", date=" + this.f1953b + ", service=" + this.f1954c + ", source=" + AbstractC0044t0.J(this.f1955d) + ", version=" + this.f1956e + ", application=" + this.f1957f + ", session=" + this.f1958g + ", view=" + this.f1959h + ", action=" + this.f1960i + ", experimentalFeatures=" + this.f1961j + ", telemetry=" + this.f1962k + Separators.RPAREN;
    }
}
