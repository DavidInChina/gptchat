package X1;

import Z1.r;
import e2.C2777i;
import j2.AbstractC3899a;
import j2.C3906h;

/* loaded from: classes2.dex */
public final class c implements l {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3899a f21725b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21726c = 2;

    public c(C3906h c3906h) {
        this.f21725b = c3906h;
    }

    @Override // X1.m
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // X1.m
    public final boolean b(wf.k kVar) {
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
        return "BackgroundModifier(colorProvider=" + this.f21725b + ", imageProvider=null, contentScale=" + ((Object) C2777i.b(this.f21726c)) + ')';
    }
}
