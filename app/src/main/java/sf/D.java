package Sf;

import bg.AbstractC2193a;
import bg.AbstractC2207o;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.Iterator;
import kg.C4291c;

/* loaded from: classes.dex */
public abstract class D implements AbstractC2207o {
    public abstract Type a();

    public final boolean equals(Object obj) {
        if ((obj instanceof D) && AbstractC3557B.K(a(), ((D) obj).a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // bg.AbstractC2196d
    public AbstractC2193a l(C4291c c4291c) {
        Object obj;
        AbstractC3557B.c0("fqName", c4291c);
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3557B.K(AbstractC1385d.a(R4.b.k1(R4.b.d1(((C1386e) ((AbstractC2193a) obj)).f16607a))).b(), c4291c)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (AbstractC2193a) obj;
    }

    public final String toString() {
        return getClass().getName() + ": " + a();
    }
}
