package Yf;

import Mf.AbstractC0997f;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class G extends Ig.i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0997f f22307c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Set f22308d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ wf.k f22309e;

    public G(Wf.c cVar, Set set, wf.k kVar) {
        this.f22307c = cVar;
        this.f22308d = set;
        this.f22309e = kVar;
    }

    @Override // Ig.i
    public final boolean d(Object obj) {
        AbstractC0997f abstractC0997f = (AbstractC0997f) obj;
        AbstractC3557B.c0("current", abstractC0997f);
        if (abstractC0997f == this.f22307c) {
            return true;
        }
        ug.n N10 = abstractC0997f.N();
        AbstractC3557B.b0("getStaticScope(...)", N10);
        if (!(N10 instanceof I)) {
            return true;
        }
        this.f22308d.addAll((Collection) this.f22309e.invoke(N10));
        return false;
    }

    @Override // Ig.i
    public final /* bridge */ /* synthetic */ Object j() {
        return jf.y.f36177a;
    }
}
