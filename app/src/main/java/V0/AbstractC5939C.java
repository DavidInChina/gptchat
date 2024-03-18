package v0;

import t0.AbstractC5650i;
import w.C6077x;

/* renamed from: v0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5939C {

    /* renamed from: a  reason: collision with root package name */
    public wf.k f46843a;

    public abstract void a(AbstractC5650i abstractC5650i);

    public wf.k b() {
        return this.f46843a;
    }

    public final void c() {
        wf.k b10 = b();
        if (b10 != null) {
            b10.invoke(this);
        }
    }

    public void d(C6077x c6077x) {
        this.f46843a = c6077x;
    }
}
