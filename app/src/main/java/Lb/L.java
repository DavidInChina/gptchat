package lb;

import android.gov.nist.core.Separators;
import fa.AbstractC2965B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jf.C3959i;

/* loaded from: classes2.dex */
public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f37965a = P4.a.o0(new C3959i("rating", "thumbsDown"));

    public static final String a(AbstractC2965B abstractC2965B) {
        if (abstractC2965B instanceof fa.t) {
            return ((fa.t) abstractC2965B).f30079b;
        }
        if (abstractC2965B instanceof fa.n) {
            return ((fa.n) abstractC2965B).f30070b;
        }
        if (abstractC2965B instanceof fa.q) {
            List<AbstractC2965B> list = ((fa.q) abstractC2965B).f30076c;
            ArrayList arrayList = new ArrayList();
            for (AbstractC2965B abstractC2965B2 : list) {
                String a5 = a(abstractC2965B2);
                if (a5 != null) {
                    arrayList.add(a5);
                }
            }
            if (!arrayList.isEmpty()) {
                return kf.t.m2(arrayList, Separators.RETURN, null, null, null, 62);
            }
        }
        return null;
    }
}
