package A5;

import Df.H;
import id.AbstractC3557B;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements Wh.m {

    /* renamed from: g  reason: collision with root package name */
    public static final long f685g = H.x0(30, Mg.d.f12135j0);

    /* renamed from: d  reason: collision with root package name */
    public final Wh.m f686d = Wh.m.f21233c;

    /* renamed from: e  reason: collision with root package name */
    public final long f687e = f685g;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f688f = new LinkedHashMap();

    static {
        Mg.a aVar = Mg.b.f12127Z;
    }

    @Override // Wh.m
    public final List a(String str) {
        Object obj;
        AbstractC3557B.c0("hostname", str);
        LinkedHashMap linkedHashMap = this.f688f;
        h hVar = (h) linkedHashMap.get(str);
        if (hVar != null) {
            Mg.a aVar = Mg.b.f12127Z;
            if (Mg.b.c(H.y0(System.nanoTime() - hVar.f684c, Mg.d.f12132Z), this.f687e) < 0) {
                List list = hVar.f683b;
                if (!list.isEmpty()) {
                    if (list.isEmpty()) {
                        obj = null;
                    } else {
                        obj = list.remove(0);
                    }
                    InetAddress inetAddress = (InetAddress) obj;
                    if (inetAddress != null) {
                        list.add(inetAddress);
                        return list;
                    }
                    return list;
                }
            }
        }
        List a5 = this.f686d.a(str);
        linkedHashMap.put(str, new h(str, kf.t.M2(a5)));
        return a5;
    }
}
