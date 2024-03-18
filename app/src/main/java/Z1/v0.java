package Z1;

import java.util.ArrayList;
import java.util.Iterator;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class v0 extends X1.j {

    /* renamed from: d  reason: collision with root package name */
    public final int f23118d;

    /* renamed from: e  reason: collision with root package name */
    public X1.m f23119e = X1.k.f21752b;

    public v0(int i10) {
        super(i10, 2);
        this.f23118d = i10;
    }

    @Override // X1.h
    public final X1.h a() {
        v0 v0Var = new v0(this.f23118d);
        v0Var.f23119e = this.f23119e;
        ArrayList arrayList = v0Var.f21751c;
        ArrayList arrayList2 = this.f21751c;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((X1.h) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return v0Var;
    }

    @Override // X1.h
    public final void b(X1.m mVar) {
        this.f23119e = mVar;
    }

    @Override // X1.h
    public final X1.m c() {
        return this.f23119e;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f23119e + ", children=[\n" + d() + "\n])";
    }
}
