package zh;

import yh.C6637t;
import yh.C6641v;
import yh.l1;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final l1 f52110a = C6641v.l1(H.class);

    public static l1 a(l1 l1Var, l1 l1Var2) {
        int i10 = 0;
        l1 l1Var3 = l1Var;
        while (l1Var3.T0()) {
            l1Var3 = l1Var3.mo119g();
            i10++;
        }
        if (l1Var3.H(H.class)) {
            return C6637t.l1(l1Var2, i10);
        }
        return l1Var;
    }
}
