package i4;

import B2.E;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final E f32701a;

    public l(E e10) {
        this.f32701a = e10;
    }

    public final m a() {
        C3473f j6;
        E e10 = this.f32701a;
        i iVar = (i) e10.f1741d;
        synchronized (iVar) {
            e10.b(true);
            j6 = iVar.j(((C3472e) e10.f1739b).f32667a);
        }
        if (j6 != null) {
            return new m(j6);
        }
        return null;
    }
}
