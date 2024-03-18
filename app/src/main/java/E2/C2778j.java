package e2;

import java.util.ArrayList;
import java.util.Iterator;
import yf.AbstractC6583a;

/* renamed from: e2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2778j extends X1.j {

    /* renamed from: d  reason: collision with root package name */
    public X1.m f28772d = X1.k.f21752b;

    /* renamed from: e  reason: collision with root package name */
    public C2771c f28773e = C2771c.f28747d;

    public C2778j() {
        super(0, 3);
    }

    @Override // X1.h
    public final X1.h a() {
        C2778j c2778j = new C2778j();
        c2778j.f28772d = this.f28772d;
        c2778j.f28773e = this.f28773e;
        ArrayList arrayList = c2778j.f21751c;
        ArrayList arrayList2 = this.f21751c;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((X1.h) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return c2778j;
    }

    @Override // X1.h
    public final void b(X1.m mVar) {
        this.f28772d = mVar;
    }

    @Override // X1.h
    public final X1.m c() {
        return this.f28772d;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f28772d + ", contentAlignment=" + this.f28773e + "children=[\n" + d() + "\n])";
    }
}
