package e2;

import java.util.ArrayList;
import java.util.Iterator;
import yf.AbstractC6583a;

/* renamed from: e2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2779k extends X1.j {

    /* renamed from: d  reason: collision with root package name */
    public X1.m f28774d = X1.k.f21752b;

    /* renamed from: e  reason: collision with root package name */
    public int f28775e = C2771c.f28746c.n();

    /* renamed from: f  reason: collision with root package name */
    public int f28776f = 0;

    public C2779k() {
        super(0, 3);
    }

    @Override // X1.h
    public final X1.h a() {
        C2779k c2779k = new C2779k();
        c2779k.f28774d = this.f28774d;
        c2779k.f28775e = this.f28775e;
        c2779k.f28776f = this.f28776f;
        ArrayList arrayList = c2779k.f21751c;
        ArrayList arrayList2 = this.f21751c;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((X1.h) it.next()).a());
        }
        arrayList.addAll(arrayList3);
        return c2779k;
    }

    @Override // X1.h
    public final void b(X1.m mVar) {
        this.f28774d = mVar;
    }

    @Override // X1.h
    public final X1.m c() {
        return this.f28774d;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f28774d + ", verticalAlignment=" + ((Object) C2770b.c(this.f28775e)) + ", horizontalAlignment=" + ((Object) C2769a.c(this.f28776f)) + ", children=[\n" + d() + "\n])";
    }
}
