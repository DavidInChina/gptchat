package E;

import A.C0043t;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G {
    public static final C0419e a(int i10, String str) {
        WeakHashMap weakHashMap = B0.f3736v;
        return new C0419e(i10, str);
    }

    public static final y0 b(int i10, String str) {
        WeakHashMap weakHashMap = B0.f3736v;
        return new y0(new V(0, 0, 0, 0), str);
    }

    public static B0 c(AbstractC1725n abstractC1725n) {
        B0 b02;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1366542614);
        View view = (View) rVar.m(H0.Z.f6892f);
        WeakHashMap weakHashMap = B0.f3736v;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new B0(view);
                    weakHashMap.put(view, obj);
                }
                b02 = (B0) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC1734s.b(b02, new C0043t(b02, 3, view), rVar);
        rVar.t(false);
        return b02;
    }
}
