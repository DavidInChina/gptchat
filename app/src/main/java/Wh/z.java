package Wh;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import jh.L1;
import kf.AbstractC4268D;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final s f21336a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21337b;

    /* renamed from: c  reason: collision with root package name */
    public final q f21338c;

    /* renamed from: d  reason: collision with root package name */
    public final B f21339d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f21340e;

    /* renamed from: f  reason: collision with root package name */
    public C1658c f21341f;

    public z(s sVar, String str, q qVar, B b10, Map map) {
        AbstractC3557B.c0("method", str);
        this.f21336a = sVar;
        this.f21337b = str;
        this.f21338c = qVar;
        this.f21339d = b10;
        this.f21340e = map;
    }

    public final C1658c a() {
        C1658c c1658c = this.f21341f;
        if (c1658c == null) {
            C1658c c1658c2 = C1658c.f21170n;
            C1658c o10 = L1.o(this.f21338c);
            this.f21341f = o10;
            return o10;
        }
        return c1658c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Wh.y, java.lang.Object] */
    public final y b() {
        LinkedHashMap linkedHashMap;
        ?? obj = new Object();
        obj.f21335e = new LinkedHashMap();
        obj.f21331a = this.f21336a;
        obj.f21332b = this.f21337b;
        obj.f21334d = this.f21339d;
        Map map = this.f21340e;
        if (map.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = AbstractC4268D.m1(map);
        }
        obj.f21335e = linkedHashMap;
        obj.f21333c = this.f21338c.I();
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f21337b);
        sb2.append(", url=");
        sb2.append(this.f21336a);
        q qVar = this.f21338c;
        if (qVar.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : qVar) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    C3959i c3959i = (C3959i) obj;
                    String str = (String) c3959i.f36155Y;
                    String str2 = (String) c3959i.f36156Z;
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(str);
                    sb2.append(':');
                    sb2.append(str2);
                    i10 = i11;
                } else {
                    AbstractC4344b.d1();
                    throw null;
                }
            }
            sb2.append(']');
        }
        Map map = this.f21340e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
