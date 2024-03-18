package xe;

import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import l8.AbstractC4344b;

/* renamed from: xe.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6396A {

    /* renamed from: b  reason: collision with root package name */
    public static final C6396A f49811b;

    /* renamed from: c  reason: collision with root package name */
    public static final C6396A f49812c;

    /* renamed from: d  reason: collision with root package name */
    public static final C6396A f49813d;

    /* renamed from: e  reason: collision with root package name */
    public static final C6396A f49814e;

    /* renamed from: f  reason: collision with root package name */
    public static final C6396A f49815f;

    /* renamed from: g  reason: collision with root package name */
    public static final C6396A f49816g;

    /* renamed from: a  reason: collision with root package name */
    public final String f49817a;

    static {
        C6396A c6396a = new C6396A("GET");
        f49811b = c6396a;
        C6396A c6396a2 = new C6396A("POST");
        f49812c = c6396a2;
        C6396A c6396a3 = new C6396A("PUT");
        f49813d = c6396a3;
        C6396A c6396a4 = new C6396A("PATCH");
        f49814e = c6396a4;
        C6396A c6396a5 = new C6396A("DELETE");
        f49815f = c6396a5;
        C6396A c6396a6 = new C6396A("HEAD");
        f49816g = c6396a6;
        AbstractC4344b.G0(c6396a, c6396a2, c6396a3, c6396a4, c6396a5, c6396a6, new C6396A(TokenNames.OPTIONS));
    }

    public C6396A(String str) {
        this.f49817a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6396A) && AbstractC3557B.K(this.f49817a, ((C6396A) obj).f49817a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49817a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("HttpMethod(value="), this.f49817a, ')');
    }
}
