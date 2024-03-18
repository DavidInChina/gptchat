package Ec;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n {
    public static o a(zd.g gVar) {
        o oVar;
        Object obj;
        AbstractC3557B.c0("settings", gVar);
        String str = gVar.f51970f;
        if (str != null) {
            o.f4626h0.getClass();
            Iterator it = o.f4630l0.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3557B.K(((o) obj).f4631Y, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            o oVar2 = (o) obj;
            if (oVar2 == null) {
                throw new IllegalArgumentException("Unknown language code: ".concat(str));
            }
            return oVar2;
        }
        if (AbstractC3557B.K(Locale.getDefault().toLanguageTag(), "en-SG")) {
            oVar = o.f4628j0;
        } else {
            oVar = o.f4627i0;
        }
        return oVar;
    }
}
