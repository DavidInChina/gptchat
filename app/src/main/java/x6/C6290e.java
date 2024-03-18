package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6290e {

    /* renamed from: a  reason: collision with root package name */
    public final String f49282a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49283b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49284c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49285d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f49286e;

    public /* synthetic */ C6290e(String str, String str2, String str3) {
        this(str, null, str2, str3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6290e)) {
            return false;
        }
        C6290e c6290e = (C6290e) obj;
        if (AbstractC3557B.K(this.f49282a, c6290e.f49282a) && AbstractC3557B.K(this.f49283b, c6290e.f49283b) && AbstractC3557B.K(this.f49284c, c6290e.f49284c) && AbstractC3557B.K(this.f49285d, c6290e.f49285d) && AbstractC3557B.K(this.f49286e, c6290e.f49286e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f49282a.hashCode() * 31;
        int i12 = 0;
        String str = this.f49283b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f49284c, (hashCode + i10) * 31, 31);
        String str2 = this.f49285d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i13 = (v10 + i11) * 31;
        Boolean bool = this.f49286e;
        if (bool != null) {
            i12 = bool.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        return "ActionEventView(id=" + this.f49282a + ", referrer=" + this.f49283b + ", url=" + this.f49284c + ", name=" + this.f49285d + ", inForeground=" + this.f49286e + Separators.RPAREN;
    }

    public C6290e(String str, String str2, String str3, String str4, Boolean bool) {
        this.f49282a = str;
        this.f49283b = str2;
        this.f49284c = str3;
        this.f49285d = str4;
        this.f49286e = bool;
    }
}
