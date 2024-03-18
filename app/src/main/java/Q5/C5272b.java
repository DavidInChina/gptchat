package q5;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: q5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5272b {

    /* renamed from: a  reason: collision with root package name */
    public final String f43910a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43911b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43912c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC5273c f43913d;

    /* renamed from: e  reason: collision with root package name */
    public final String f43914e;

    /* renamed from: f  reason: collision with root package name */
    public final String f43915f;

    /* renamed from: g  reason: collision with root package name */
    public final String f43916g;

    /* renamed from: h  reason: collision with root package name */
    public final String f43917h;

    /* renamed from: i  reason: collision with root package name */
    public final String f43918i;

    public C5272b(String str, String str2, String str3, EnumC5273c enumC5273c, String str4, String str5, String str6, String str7, String str8) {
        AbstractC3557B.c0("deviceName", str);
        AbstractC3557B.c0("deviceBrand", str2);
        AbstractC3557B.c0("deviceModel", str3);
        AbstractC3557B.c0("deviceType", enumC5273c);
        AbstractC3557B.c0("deviceBuildId", str4);
        AbstractC3557B.c0("osName", str5);
        AbstractC3557B.c0("osMajorVersion", str6);
        AbstractC3557B.c0("osVersion", str7);
        AbstractC3557B.c0("architecture", str8);
        this.f43910a = str;
        this.f43911b = str2;
        this.f43912c = str3;
        this.f43913d = enumC5273c;
        this.f43914e = str4;
        this.f43915f = str5;
        this.f43916g = str6;
        this.f43917h = str7;
        this.f43918i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5272b)) {
            return false;
        }
        C5272b c5272b = (C5272b) obj;
        if (AbstractC3557B.K(this.f43910a, c5272b.f43910a) && AbstractC3557B.K(this.f43911b, c5272b.f43911b) && AbstractC3557B.K(this.f43912c, c5272b.f43912c) && this.f43913d == c5272b.f43913d && AbstractC3557B.K(this.f43914e, c5272b.f43914e) && AbstractC3557B.K(this.f43915f, c5272b.f43915f) && AbstractC3557B.K(this.f43916g, c5272b.f43916g) && AbstractC3557B.K(this.f43917h, c5272b.f43917h) && AbstractC3557B.K(this.f43918i, c5272b.f43918i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f43912c, E9.f.v(this.f43911b, this.f43910a.hashCode() * 31, 31), 31);
        return this.f43918i.hashCode() + E9.f.v(this.f43917h, E9.f.v(this.f43916g, E9.f.v(this.f43915f, E9.f.v(this.f43914e, (this.f43913d.hashCode() + v10) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(deviceName=");
        sb2.append(this.f43910a);
        sb2.append(", deviceBrand=");
        sb2.append(this.f43911b);
        sb2.append(", deviceModel=");
        sb2.append(this.f43912c);
        sb2.append(", deviceType=");
        sb2.append(this.f43913d);
        sb2.append(", deviceBuildId=");
        sb2.append(this.f43914e);
        sb2.append(", osName=");
        sb2.append(this.f43915f);
        sb2.append(", osMajorVersion=");
        sb2.append(this.f43916g);
        sb2.append(", osVersion=");
        sb2.append(this.f43917h);
        sb2.append(", architecture=");
        return R.a.t(sb2, this.f43918i, Separators.RPAREN);
    }
}
