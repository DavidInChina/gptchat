package Y1;

import X1.l;
import X1.m;
import Z1.r;
import wf.k;
import wf.n;

/* loaded from: classes2.dex */
public final class b implements l {

    /* renamed from: b  reason: collision with root package name */
    public final a f22049b;

    public b(a aVar) {
        this.f22049b = aVar;
    }

    @Override // X1.m
    public final Object a(Object obj, n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // X1.m
    public final boolean b(k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final boolean c() {
        return ((Boolean) r.f23086Z.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final /* synthetic */ m d(m mVar) {
        return R.a.c(this, mVar);
    }

    public final String toString() {
        return "ActionModifier(action=" + this.f22049b + ')';
    }
}
