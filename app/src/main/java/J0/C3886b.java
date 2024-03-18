package j0;

import java.util.List;
import y.C6461B;
import y.Y;

/* renamed from: j0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3886b extends C3887c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3886b(int i10, n nVar) {
        super(i10, nVar, null, r2);
        wf.k kVar;
        synchronized (p.f35918b) {
            List list = p.f35924h;
            kVar = (wf.k) kf.t.D2(list);
            kVar = kVar == null ? new C6461B(4, list) : kVar;
        }
    }

    @Override // j0.C3887c
    public final C3887c B(wf.k kVar, wf.k kVar2) {
        return (C3887c) ((AbstractC3893i) p.e(new Y(13, new C3885a(kVar, kVar2, 0))));
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void c() {
        synchronized (p.f35918b) {
            int i10 = this.f35895d;
            if (i10 >= 0) {
                p.t(i10);
                this.f35895d = -1;
            }
        }
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void k() {
        y.a();
        throw null;
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void l() {
        y.a();
        throw null;
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void m() {
        p.e(o.f35914Z);
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final AbstractC3893i t(wf.k kVar) {
        return (AbstractC3893i) p.e(new Y(13, new Y(12, kVar)));
    }

    @Override // j0.C3887c
    public final L4.a v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
