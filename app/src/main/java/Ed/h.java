package Ed;

import android.content.res.Resources;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kf.q;
import kf.t;
import kotlinx.serialization.KSerializer;
import q1.AbstractC5260f;
import r9.y;

/* loaded from: classes2.dex */
public final class h {
    public static i a(String str) {
        AbstractC3557B.c0("uuid", str);
        y1.k n02 = y.n0(Resources.getSystem().getConfiguration());
        ArrayList arrayList = new ArrayList();
        y1.m mVar = n02.f50327a;
        int size = mVar.size();
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                Locale locale = mVar.get(i10);
                if (locale != null) {
                    arrayList.add(locale);
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String language = ((Locale) it.next()).getLanguage();
                AbstractC3557B.b0("getLanguage(...)", language);
                if (Lg.n.I2(language, "zh", false)) {
                    return i.f4679n0;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String language2 = ((Locale) it2.next()).getLanguage();
                AbstractC3557B.b0("getLanguage(...)", language2);
                if (Lg.n.I2(language2, "es", false)) {
                    return i.f4675j0;
                }
            }
        }
        return (i) t.f2(b(str));
    }

    public static ArrayList b(String str) {
        AbstractC3557B.c0("uuid", str);
        List N22 = t.N2(new Cf.e(0, q.l3(i.f4681p0.toArray(new i[0])), 1));
        t.z2(N22, AbstractC5260f.d(str.hashCode()));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) N22).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            i.Companion.getClass();
            i iVar = (i) t.i2(intValue, i.f4681p0);
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static i c(zd.q qVar) {
        int ordinal = qVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return i.f4679n0;
                        }
                        throw new RuntimeException();
                    }
                    return i.f4678m0;
                }
                return i.f4677l0;
            }
            return i.f4676k0;
        }
        return i.f4675j0;
    }

    public final KSerializer serializer() {
        return (KSerializer) i.f4674i0.getValue();
    }
}
