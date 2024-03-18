package S4;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class i extends p {
    @Override // S4.p
    public final void j() {
        String str;
        if (c().size() > 65536) {
            TreeMap treeMap = new TreeMap();
            Iterator it = c().iterator();
            if (!it.hasNext()) {
                Formatter formatter = new Formatter();
                try {
                    if (this instanceof k) {
                        str = "method";
                    } else {
                        str = "field";
                    }
                    formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", str, Integer.valueOf(c().size()), 65536);
                    for (Map.Entry entry : treeMap.entrySet()) {
                        formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    throw new N4.a(formatter2, null);
                } catch (Throwable th2) {
                    formatter.close();
                    throw th2;
                }
            }
            AbstractC2469q0.p(it.next());
            throw null;
        }
        Iterator it2 = c().iterator();
        if (!it2.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it2.next());
        throw null;
    }
}
