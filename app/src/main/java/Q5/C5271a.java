package q5;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import id.AbstractC3557B;
import java.util.Map;
import o5.EnumC4919c;

/* renamed from: q5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5271a {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC4919c f43895a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43896b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43897c;

    /* renamed from: d  reason: collision with root package name */
    public final String f43898d;

    /* renamed from: e  reason: collision with root package name */
    public final String f43899e;

    /* renamed from: f  reason: collision with root package name */
    public final String f43900f;

    /* renamed from: g  reason: collision with root package name */
    public final String f43901g;

    /* renamed from: h  reason: collision with root package name */
    public final String f43902h;

    /* renamed from: i  reason: collision with root package name */
    public final f f43903i;

    /* renamed from: j  reason: collision with root package name */
    public final C5275e f43904j;

    /* renamed from: k  reason: collision with root package name */
    public final C5274d f43905k;

    /* renamed from: l  reason: collision with root package name */
    public final C5272b f43906l;

    /* renamed from: m  reason: collision with root package name */
    public final g f43907m;

    /* renamed from: n  reason: collision with root package name */
    public final h6.a f43908n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f43909o;

    public C5271a(EnumC4919c enumC4919c, String str, String str2, String str3, String str4, String str5, String str6, String str7, f fVar, C5275e c5275e, C5274d c5274d, C5272b c5272b, g gVar, h6.a aVar, Map map) {
        AbstractC3557B.c0("site", enumC4919c);
        AbstractC3557B.c0("clientToken", str);
        AbstractC3557B.c0(ReferencesHeader.SERVICE, str2);
        AbstractC3557B.c0("env", str3);
        AbstractC3557B.c0(ParameterNames.VERSION, str4);
        AbstractC3557B.c0("variant", str5);
        AbstractC3557B.c0("source", str6);
        AbstractC3557B.c0("sdkVersion", str7);
        AbstractC3557B.c0("networkInfo", c5274d);
        AbstractC3557B.c0("userInfo", gVar);
        AbstractC3557B.c0("trackingConsent", aVar);
        this.f43895a = enumC4919c;
        this.f43896b = str;
        this.f43897c = str2;
        this.f43898d = str3;
        this.f43899e = str4;
        this.f43900f = str5;
        this.f43901g = str6;
        this.f43902h = str7;
        this.f43903i = fVar;
        this.f43904j = c5275e;
        this.f43905k = c5274d;
        this.f43906l = c5272b;
        this.f43907m = gVar;
        this.f43908n = aVar;
        this.f43909o = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5271a)) {
            return false;
        }
        C5271a c5271a = (C5271a) obj;
        if (this.f43895a == c5271a.f43895a && AbstractC3557B.K(this.f43896b, c5271a.f43896b) && AbstractC3557B.K(this.f43897c, c5271a.f43897c) && AbstractC3557B.K(this.f43898d, c5271a.f43898d) && AbstractC3557B.K(this.f43899e, c5271a.f43899e) && AbstractC3557B.K(this.f43900f, c5271a.f43900f) && AbstractC3557B.K(this.f43901g, c5271a.f43901g) && AbstractC3557B.K(this.f43902h, c5271a.f43902h) && AbstractC3557B.K(this.f43903i, c5271a.f43903i) && AbstractC3557B.K(this.f43904j, c5271a.f43904j) && AbstractC3557B.K(this.f43905k, c5271a.f43905k) && AbstractC3557B.K(this.f43906l, c5271a.f43906l) && AbstractC3557B.K(this.f43907m, c5271a.f43907m) && this.f43908n == c5271a.f43908n && AbstractC3557B.K(this.f43909o, c5271a.f43909o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f43902h, E9.f.v(this.f43901g, E9.f.v(this.f43900f, E9.f.v(this.f43899e, E9.f.v(this.f43898d, E9.f.v(this.f43897c, E9.f.v(this.f43896b, this.f43895a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        int hashCode = this.f43904j.hashCode();
        int hashCode2 = this.f43905k.hashCode();
        int hashCode3 = this.f43906l.hashCode();
        int hashCode4 = this.f43907m.hashCode();
        int hashCode5 = this.f43908n.hashCode();
        return this.f43909o.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f43903i.hashCode() + v10) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DatadogContext(site=" + this.f43895a + ", clientToken=" + this.f43896b + ", service=" + this.f43897c + ", env=" + this.f43898d + ", version=" + this.f43899e + ", variant=" + this.f43900f + ", source=" + this.f43901g + ", sdkVersion=" + this.f43902h + ", time=" + this.f43903i + ", processInfo=" + this.f43904j + ", networkInfo=" + this.f43905k + ", deviceInfo=" + this.f43906l + ", userInfo=" + this.f43907m + ", trackingConsent=" + this.f43908n + ", featuresContext=" + this.f43909o + Separators.RPAREN;
    }
}
