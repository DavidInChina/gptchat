package e2;

import a1.C1915c;
import java.util.ArrayList;
import java.util.Iterator;
import yf.AbstractC6583a;

/* renamed from: e2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2780l extends X1.j {

    /* renamed from: d  reason: collision with root package name */
    public X1.m f28777d = X1.k.f21752b;

    /* renamed from: e  reason: collision with root package name */
    public int f28778e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f28779f;

    public C2780l() {
        super(0, 3);
        C1915c c1915c = C2771c.f28746c;
        this.f28779f = c1915c.n();
    }

    @Override // X1.h
    public final X1.h a() {
        C2780l c2780l = new C2780l();
        c2780l.f28777d = this.f28777d;
        c2780l.f28778e = this.f28778e;
        c2780l.f28779f = this.f28779f;
        ArrayList arrayList = c2780l.f21751c;
        ArrayList arrayList2 = this.f21751c;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((X1.h) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return c2780l;
    }

    @Override // X1.h
    public final void b(X1.m mVar) {
        this.f28777d = mVar;
    }

    @Override // X1.h
    public final X1.m c() {
        return this.f28777d;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f28777d + ", horizontalAlignment=" + ((Object) C2769a.c(this.f28778e)) + ", verticalAlignment=" + ((Object) C2770b.c(this.f28779f)) + ", children=[\n" + d() + "\n])";
    }
}
