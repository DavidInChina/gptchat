package Kc;

import E9.f;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import o8.AbstractC4949b;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f9626a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9627b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4949b f9628c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9629d;

    public e(String str, String str2, AbstractC4949b abstractC4949b, String str3) {
        AbstractC3557B.c0("packageName", str);
        AbstractC3557B.c0("requestHash", str2);
        AbstractC3557B.c0("tokenResponse", abstractC4949b);
        AbstractC3557B.c0("deviceId", str3);
        this.f9626a = str;
        this.f9627b = str2;
        this.f9628c = abstractC4949b;
        this.f9629d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f9626a, eVar.f9626a) && AbstractC3557B.K(this.f9627b, eVar.f9627b) && AbstractC3557B.K(this.f9628c, eVar.f9628c) && AbstractC3557B.K(this.f9629d, eVar.f9629d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = f.v(this.f9627b, this.f9626a.hashCode() * 31, 31);
        return this.f9629d.hashCode() + ((this.f9628c.hashCode() + v10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenConfig(packageName=");
        sb2.append(this.f9626a);
        sb2.append(", requestHash=");
        sb2.append(this.f9627b);
        sb2.append(", tokenResponse=");
        sb2.append(this.f9628c);
        sb2.append(", deviceId=");
        return R.a.t(sb2, this.f9629d, Separators.RPAREN);
    }
}
