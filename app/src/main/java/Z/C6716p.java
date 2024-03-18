package z;

import Z.C1724m0;
import Z.l1;
import Z.o1;
import nf.AbstractC4828h;

/* renamed from: z.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6716p implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public final C6737z0 f51345Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1724m0 f51346Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6726u f51347h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f51348i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f51349j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f51350k0;

    public /* synthetic */ C6716p(C6737z0 c6737z0, Object obj, AbstractC6726u abstractC6726u, int i10) {
        this(c6737z0, obj, (i10 & 4) != 0 ? null : abstractC6726u, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object b() {
        return this.f51345Y.f51417b.invoke(this.f51347h0);
    }

    @Override // Z.l1
    public final Object getValue() {
        return this.f51346Z.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f51346Z.getValue() + ", velocity=" + b() + ", isRunning=" + this.f51350k0 + ", lastFrameTimeNanos=" + this.f51348i0 + ", finishedTimeNanos=" + this.f51349j0 + ')';
    }

    public C6716p(C6737z0 c6737z0, Object obj, AbstractC6726u abstractC6726u, long j6, long j10, boolean z10) {
        AbstractC6726u abstractC6726u2;
        this.f51345Y = c6737z0;
        this.f51346Z = AbstractC4828h.Z(obj, o1.f22665a);
        if (abstractC6726u != null) {
            abstractC6726u2 = AbstractC6696f.k(abstractC6726u);
        } else {
            abstractC6726u2 = (AbstractC6726u) c6737z0.f51416a.invoke(obj);
            abstractC6726u2.d();
        }
        this.f51347h0 = abstractC6726u2;
        this.f51348i0 = j6;
        this.f51349j0 = j10;
        this.f51350k0 = z10;
    }
}
