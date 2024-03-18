package Vc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final String f18566a;

    /* renamed from: d  reason: collision with root package name */
    public final Map f18569d;

    /* renamed from: f  reason: collision with root package name */
    public final String f18571f;

    /* renamed from: h  reason: collision with root package name */
    public final int f18573h;

    /* renamed from: n  reason: collision with root package name */
    public final A f18579n;

    /* renamed from: b  reason: collision with root package name */
    public final String f18567b = "https://android.chat.openai.com/backend-api/";

    /* renamed from: c  reason: collision with root package name */
    public final String f18568c = "https://android.chat.openai.com/public-api/";

    /* renamed from: e  reason: collision with root package name */
    public final int f18570e = 160;

    /* renamed from: g  reason: collision with root package name */
    public final String f18572g = "1.2024.066";

    /* renamed from: i  reason: collision with root package name */
    public final String f18574i = "https://api.openai.com";

    /* renamed from: j  reason: collision with root package name */
    public final String f18575j = "auth0.openai.com";

    /* renamed from: k  reason: collision with root package name */
    public final String f18576k = "chat.openai.com/ces/v1";

    /* renamed from: l  reason: collision with root package name */
    public final String f18577l = "https://chat.openai.com/ces";

    /* renamed from: m  reason: collision with root package name */
    public final String f18578m = "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y";

    /* renamed from: o  reason: collision with root package name */
    public final String f18580o = "ABFE4E70-B947-490F-84CE-369187A9989F";

    public y(String str, String str2, int i10) {
        kf.w wVar = kf.w.f37484Y;
        A a5 = A.f18524Z;
        AbstractC3557B.c0("userAgent", str);
        this.f18566a = str;
        this.f18569d = wVar;
        this.f18571f = str2;
        this.f18573h = i10;
        this.f18579n = a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (AbstractC3557B.K(this.f18566a, yVar.f18566a) && AbstractC3557B.K(this.f18567b, yVar.f18567b) && AbstractC3557B.K(this.f18568c, yVar.f18568c) && AbstractC3557B.K(this.f18569d, yVar.f18569d) && this.f18570e == yVar.f18570e && AbstractC3557B.K(this.f18571f, yVar.f18571f) && AbstractC3557B.K(this.f18572g, yVar.f18572g) && this.f18573h == yVar.f18573h && AbstractC3557B.K(this.f18574i, yVar.f18574i) && AbstractC3557B.K(this.f18575j, yVar.f18575j) && AbstractC3557B.K(this.f18576k, yVar.f18576k) && AbstractC3557B.K(this.f18577l, yVar.f18577l) && AbstractC3557B.K(this.f18578m, yVar.f18578m) && this.f18579n == yVar.f18579n && AbstractC3557B.K(this.f18580o, yVar.f18580o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f18568c, E9.f.v(this.f18567b, this.f18566a.hashCode() * 31, 31), 31);
        int v11 = E9.f.v(this.f18571f, (AbstractC6463a.f(this.f18569d, v10, 31) + this.f18570e) * 31, 31);
        int v12 = E9.f.v(this.f18578m, E9.f.v(this.f18577l, E9.f.v(this.f18576k, E9.f.v(this.f18575j, E9.f.v(this.f18574i, (E9.f.v(this.f18572g, v11, 31) + this.f18573h) * 31, 31), 31), 31), 31), 31);
        return this.f18580o.hashCode() + ((this.f18579n.hashCode() + v12) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesConfig(userAgent=");
        sb2.append(this.f18566a);
        sb2.append(", apiBaseUrl=");
        sb2.append(this.f18567b);
        sb2.append(", publicApiBaseUrl=");
        sb2.append(this.f18568c);
        sb2.append(", additionalHeaders=");
        sb2.append(this.f18569d);
        sb2.append(", buildNumber=");
        sb2.append(this.f18570e);
        sb2.append(", deviceType=");
        sb2.append(this.f18571f);
        sb2.append(", appVersion=");
        sb2.append(this.f18572g);
        sb2.append(", systemVersion=");
        sb2.append(this.f18573h);
        sb2.append(", onboardingApiBaseUrl=");
        sb2.append(this.f18574i);
        sb2.append(", auth0Domain=");
        sb2.append(this.f18575j);
        sb2.append(", analyticsUrl=");
        sb2.append(this.f18576k);
        sb2.append(", analyticsCdnUrl=");
        sb2.append(this.f18577l);
        sb2.append(", auth0ClientId=");
        sb2.append(this.f18578m);
        sb2.append(", voiceApiHost=");
        sb2.append(this.f18579n);
        sb2.append(", arkoseKey=");
        return R.a.t(sb2, this.f18580o, Separators.RPAREN);
    }
}
