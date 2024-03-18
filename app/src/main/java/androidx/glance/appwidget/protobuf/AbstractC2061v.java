package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2061v extends AbstractC2041a {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2063x f25276Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC2063x f25277Z;

    public AbstractC2061v(AbstractC2063x abstractC2063x) {
        this.f25276Y = abstractC2063x;
        if (!abstractC2063x.h()) {
            this.f25277Z = abstractC2063x.j();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void f(AbstractC2063x abstractC2063x, Object obj) {
        Y y10 = Y.f25192c;
        y10.getClass();
        y10.a(abstractC2063x.getClass()).c(abstractC2063x, obj);
    }

    public final AbstractC2063x c() {
        AbstractC2063x d10 = d();
        d10.getClass();
        if (AbstractC2063x.g(d10, true)) {
            return d10;
        }
        throw new e0();
    }

    public final Object clone() {
        AbstractC2061v abstractC2061v = (AbstractC2061v) this.f25276Y.d(5);
        abstractC2061v.f25277Z = d();
        return abstractC2061v;
    }

    public final AbstractC2063x d() {
        if (!this.f25277Z.h()) {
            return this.f25277Z;
        }
        AbstractC2063x abstractC2063x = this.f25277Z;
        abstractC2063x.getClass();
        Y y10 = Y.f25192c;
        y10.getClass();
        y10.a(abstractC2063x.getClass()).d(abstractC2063x);
        abstractC2063x.i();
        return this.f25277Z;
    }

    public final void e() {
        if (!this.f25277Z.h()) {
            AbstractC2063x j6 = this.f25276Y.j();
            f(j6, this.f25277Z);
            this.f25277Z = j6;
        }
    }
}
