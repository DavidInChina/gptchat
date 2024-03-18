package w2;

import java.util.TreeSet;
import v.C5934c;

/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    public final TreeSet f47716a = new TreeSet(new C5934c(5));

    /* renamed from: b  reason: collision with root package name */
    public long f47717b;

    public final void a(AbstractC6084b abstractC6084b, long j6) {
        while (this.f47717b + j6 > 314572800 && !this.f47716a.isEmpty()) {
            j jVar = (j) this.f47716a.first();
            t tVar = (t) abstractC6084b;
            synchronized (tVar) {
                tVar.k(jVar);
            }
        }
    }

    public final void b(AbstractC6084b abstractC6084b, j jVar) {
        this.f47716a.add(jVar);
        this.f47717b += jVar.f47690h0;
        a(abstractC6084b, 0L);
    }
}
