package c6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Map;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f26315l = {"status", ReferencesHeader.SERVICE, "message", "date", "logger", "_dd", "usr", "network", "error", "ddtags"};

    /* renamed from: a  reason: collision with root package name */
    public final int f26316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26317b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26318c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26319d;

    /* renamed from: e  reason: collision with root package name */
    public final C2300e f26320e;

    /* renamed from: f  reason: collision with root package name */
    public final C2297b f26321f;

    /* renamed from: g  reason: collision with root package name */
    public final i f26322g;

    /* renamed from: h  reason: collision with root package name */
    public final C2301f f26323h;

    /* renamed from: i  reason: collision with root package name */
    public final C2299d f26324i;

    /* renamed from: j  reason: collision with root package name */
    public final String f26325j;

    /* renamed from: k  reason: collision with root package name */
    public final Map f26326k;

    public j(int i10, String str, String str2, String str3, C2300e c2300e, C2297b c2297b, i iVar, C2301f c2301f, C2299d c2299d, String str4, Map map) {
        AbstractC2469q0.q("status", i10);
        AbstractC3557B.c0(ReferencesHeader.SERVICE, str);
        AbstractC3557B.c0("message", str2);
        this.f26316a = i10;
        this.f26317b = str;
        this.f26318c = str2;
        this.f26319d = str3;
        this.f26320e = c2300e;
        this.f26321f = c2297b;
        this.f26322g = iVar;
        this.f26323h = c2301f;
        this.f26324i = c2299d;
        this.f26325j = str4;
        this.f26326k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f26316a == jVar.f26316a && AbstractC3557B.K(this.f26317b, jVar.f26317b) && AbstractC3557B.K(this.f26318c, jVar.f26318c) && AbstractC3557B.K(this.f26319d, jVar.f26319d) && AbstractC3557B.K(this.f26320e, jVar.f26320e) && AbstractC3557B.K(this.f26321f, jVar.f26321f) && AbstractC3557B.K(this.f26322g, jVar.f26322g) && AbstractC3557B.K(this.f26323h, jVar.f26323h) && AbstractC3557B.K(this.f26324i, jVar.f26324i) && AbstractC3557B.K(this.f26325j, jVar.f26325j) && AbstractC3557B.K(this.f26326k, jVar.f26326k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f26321f.hashCode() + ((this.f26320e.hashCode() + E9.f.v(this.f26319d, E9.f.v(this.f26318c, E9.f.v(this.f26317b, AbstractC6708l.f(this.f26316a) * 31, 31), 31), 31)) * 31)) * 31;
        int i12 = 0;
        i iVar = this.f26322g;
        if (iVar == null) {
            i10 = 0;
        } else {
            i10 = iVar.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        C2301f c2301f = this.f26323h;
        if (c2301f == null) {
            i11 = 0;
        } else {
            i11 = c2301f.f26303a.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        C2299d c2299d = this.f26324i;
        if (c2299d != null) {
            i12 = c2299d.hashCode();
        }
        return this.f26326k.hashCode() + E9.f.v(this.f26325j, (i14 + i12) * 31, 31);
    }

    public final String toString() {
        return "LogEvent(status=" + android.gov.nist.core.a.E(this.f26316a) + ", service=" + this.f26317b + ", message=" + this.f26318c + ", date=" + this.f26319d + ", logger=" + this.f26320e + ", dd=" + this.f26321f + ", usr=" + this.f26322g + ", network=" + this.f26323h + ", error=" + this.f26324i + ", ddtags=" + this.f26325j + ", additionalProperties=" + this.f26326k + Separators.RPAREN;
    }
}
