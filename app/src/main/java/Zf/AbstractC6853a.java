package zf;

import Df.v;
import id.AbstractC3557B;
import mg.q;

/* renamed from: zf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6853a {

    /* renamed from: a  reason: collision with root package name */
    public Object f52017a;

    public final Object a(Object obj, v vVar) {
        AbstractC3557B.c0("property", vVar);
        return this.f52017a;
    }

    public final void b(Object obj, v vVar) {
        AbstractC3557B.c0("property", vVar);
        if (!((q) this).f39320b.f39342a) {
            this.f52017a = obj;
            return;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f52017a + ')';
    }
}
