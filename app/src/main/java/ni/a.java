package ni;

import Ci.c;
import Z.C1745x0;
import ei.l;
import io.sentry.android.core.z;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import q.C5241w;
import xi.b;

/* loaded from: classes2.dex */
public final class a implements b {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oi.b] */
    @Override // xi.b
    public final void a(C5241w c5241w) {
        Object obj;
        l lVar;
        ?? obj2 = new Object();
        C1745x0 c1745x0 = new C1745x0(6);
        c cVar = c.f3172Y;
        c cVar2 = c.f3173Z;
        EnumSet of2 = EnumSet.of(cVar, cVar2);
        if (of2 != null) {
            HashSet hashSet = new HashSet(of2);
            c1745x0.f22768b = hashSet;
            G6.a aVar = null;
            if (hashSet.contains(cVar)) {
                obj = new Object();
            } else {
                obj = null;
            }
            if (((Set) c1745x0.f22768b).contains(c.f3174h0)) {
                lVar = new l(21);
            } else {
                lVar = null;
            }
            if (((Set) c1745x0.f22768b).contains(cVar2)) {
                aVar = new G6.a(c1745x0.f22767a);
            }
            obj2.f41489a = new z(obj, lVar, aVar);
            ((List) c5241w.f43575c).add(obj2);
            return;
        }
        throw new NullPointerException("linkTypes must not be null");
    }
}
