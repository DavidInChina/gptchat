package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2038x extends AbstractC2009a {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2040z f25126Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC2040z f25127Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25128h0 = false;

    public AbstractC2038x(AbstractC2040z abstractC2040z) {
        this.f25126Y = abstractC2040z;
        this.f25127Z = (AbstractC2040z) abstractC2040z.d(4);
    }

    public final AbstractC2040z a() {
        AbstractC2040z b10 = b();
        if (b10.g()) {
            return b10;
        }
        throw new n0();
    }

    public final AbstractC2040z b() {
        if (this.f25128h0) {
            return this.f25127Z;
        }
        AbstractC2040z abstractC2040z = this.f25127Z;
        abstractC2040z.getClass();
        C2014c0 c2014c0 = C2014c0.f25030c;
        c2014c0.getClass();
        c2014c0.a(abstractC2040z.getClass()).d(abstractC2040z);
        this.f25128h0 = true;
        return this.f25127Z;
    }

    public final void c() {
        if (this.f25128h0) {
            AbstractC2040z abstractC2040z = (AbstractC2040z) this.f25127Z.d(4);
            AbstractC2040z abstractC2040z2 = this.f25127Z;
            C2014c0 c2014c0 = C2014c0.f25030c;
            c2014c0.getClass();
            c2014c0.a(abstractC2040z.getClass()).c(abstractC2040z, abstractC2040z2);
            this.f25127Z = abstractC2040z;
            this.f25128h0 = false;
        }
    }

    public final Object clone() {
        AbstractC2038x abstractC2038x = (AbstractC2038x) this.f25126Y.d(5);
        abstractC2038x.d(b());
        return abstractC2038x;
    }

    public final void d(AbstractC2040z abstractC2040z) {
        c();
        AbstractC2040z abstractC2040z2 = this.f25127Z;
        C2014c0 c2014c0 = C2014c0.f25030c;
        c2014c0.getClass();
        c2014c0.a(abstractC2040z2.getClass()).c(abstractC2040z2, abstractC2040z);
    }
}
