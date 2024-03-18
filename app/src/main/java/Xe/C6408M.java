package xe;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* renamed from: xe.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6408M {

    /* renamed from: c  reason: collision with root package name */
    public static final C6408M f49850c;

    /* renamed from: d  reason: collision with root package name */
    public static final C6408M f49851d;

    /* renamed from: e  reason: collision with root package name */
    public static final C6408M f49852e;

    /* renamed from: f  reason: collision with root package name */
    public static final LinkedHashMap f49853f;

    /* renamed from: a  reason: collision with root package name */
    public final String f49854a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49855b;

    static {
        C6408M c6408m = new C6408M("http", 80);
        f49850c = c6408m;
        C6408M c6408m2 = new C6408M("https", 443);
        C6408M c6408m3 = new C6408M("ws", 80);
        f49851d = c6408m3;
        C6408M c6408m4 = new C6408M("wss", 443);
        f49852e = c6408m4;
        List G02 = AbstractC4344b.G0(c6408m, c6408m2, c6408m3, c6408m4, new C6408M("socks", 1080));
        int n02 = P4.a.n0(AbstractC6583a.H1(G02, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Object obj : G02) {
            linkedHashMap.put(((C6408M) obj).f49854a, obj);
        }
        f49853f = linkedHashMap;
    }

    public C6408M(String str, int i10) {
        this.f49854a = str;
        this.f49855b = i10;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.toLowerCase(charAt) != charAt) {
                throw new IllegalArgumentException("All characters should be lower case".toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6408M)) {
            return false;
        }
        C6408M c6408m = (C6408M) obj;
        if (AbstractC3557B.K(this.f49854a, c6408m.f49854a) && this.f49855b == c6408m.f49855b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f49854a.hashCode() * 31) + this.f49855b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.f49854a);
        sb2.append(", defaultPort=");
        return AbstractC2469q0.j(sb2, this.f49855b, ')');
    }
}
