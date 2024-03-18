package kg;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import yf.AbstractC6583a;

/* renamed from: kg.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4298j {
    static {
        new C4291c("java.lang").c(C4294f.e("annotation"));
    }

    public static final C4290b a(String str) {
        C4291c c4291c = C4297i.f37518a;
        return new C4290b(C4297i.f37518a, C4294f.e(str));
    }

    public static final C4290b b(String str) {
        C4291c c4291c = C4297i.f37518a;
        return new C4290b(C4297i.f37520c, C4294f.e(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int n02 = P4.a.n0(AbstractC6583a.H1(entrySet, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n02);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final C4290b d(C4294f c4294f) {
        C4291c c4291c = C4297i.f37518a;
        C4290b c4290b = C4297i.f37525h;
        return new C4290b(c4290b.g(), C4294f.e(c4294f.c().concat(c4290b.i().c())));
    }

    public static final C4290b e(String str) {
        C4291c c4291c = C4297i.f37518a;
        return new C4290b(C4297i.f37519b, C4294f.e(str));
    }

    public static final C4290b f(C4290b c4290b) {
        C4291c c4291c = C4297i.f37518a;
        return new C4290b(C4297i.f37518a, C4294f.e(TokenNames.f24319U.concat(c4290b.i().c())));
    }
}
