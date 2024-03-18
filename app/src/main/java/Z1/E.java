package Z1;

import e2.C2782n;
import e2.C2790v;
import j2.C3903e;
import java.util.ArrayList;
import java.util.Iterator;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class E extends X1.j {

    /* renamed from: d  reason: collision with root package name */
    public long f22826d = Z0.g.f22793c;

    /* renamed from: e  reason: collision with root package name */
    public D0 f22827e = C0.f22824a;

    public E() {
        super(0, 3);
    }

    @Override // X1.h
    public final X1.h a() {
        E e10 = new E();
        e10.f22826d = this.f22826d;
        e10.f22827e = this.f22827e;
        ArrayList arrayList = e10.f21751c;
        ArrayList arrayList2 = this.f21751c;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((X1.h) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return e10;
    }

    @Override // X1.h
    public final void b(X1.m mVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // X1.h
    public final X1.m c() {
        X1.m c10;
        X1.h hVar = (X1.h) kf.t.D2(this.f21751c);
        if (hVar == null || (c10 = hVar.c()) == null) {
            C3903e c3903e = C3903e.f36006a;
            return new C2790v(c3903e).d(new C2782n(c3903e));
        }
        return c10;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) Z0.g.c(this.f22826d)) + ", sizeMode=" + this.f22827e + ", children=[\n" + d() + "\n])";
    }
}
