package j1;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f35987m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f35979e = 2;
        } else {
            this.f35979e = 3;
        }
    }

    @Override // j1.f
    public final void d(int i10) {
        if (this.f35984j) {
            return;
        }
        this.f35984j = true;
        this.f35981g = i10;
        Iterator it = this.f35985k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
