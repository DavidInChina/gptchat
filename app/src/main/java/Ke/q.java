package ke;

import Df.H;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import xe.AbstractC6432u;

/* loaded from: classes2.dex */
public final class q implements AbstractC6432u {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Wh.q f37436c;

    public q(Wh.q qVar) {
        this.f37436c = qVar;
    }

    @Override // Fe.v
    public final Set a() {
        return this.f37436c.M().entrySet();
    }

    @Override // Fe.v
    public final boolean b() {
        return true;
    }

    @Override // Fe.v
    public final List c(String str) {
        AbstractC3557B.c0("name", str);
        List U10 = this.f37436c.U(str);
        if (!(!U10.isEmpty())) {
            return null;
        }
        return U10;
    }

    @Override // Fe.v
    public final void d(wf.n nVar) {
        H.M(this, (Jb.c) nVar);
    }

    @Override // Fe.v
    public final String e(String str) {
        List c10 = c(str);
        if (c10 != null) {
            return (String) kf.t.h2(c10);
        }
        return null;
    }

    @Override // Fe.v
    public final Set names() {
        Wh.q qVar = this.f37436c;
        qVar.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC3557B.b0("CASE_INSENSITIVE_ORDER", comparator);
        TreeSet treeSet = new TreeSet(comparator);
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(qVar.y(i10));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC3557B.b0("unmodifiableSet(result)", unmodifiableSet);
        return unmodifiableSet;
    }
}
