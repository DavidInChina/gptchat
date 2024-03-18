package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.x0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3850x0 extends AbstractC3750d {

    /* renamed from: j  reason: collision with root package name */
    private final C3845w0 f35764j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3850x0(C3845w0 c3845w0, AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        super(abstractC3855y0, spliterator);
        this.f35764j = c3845w0;
    }

    C3850x0(C3850x0 c3850x0, Spliterator spliterator) {
        super(c3850x0, spliterator);
        this.f35764j = c3850x0.f35764j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final Object a() {
        boolean z10;
        AbstractC3855y0 abstractC3855y0 = this.f35645a;
        AbstractC3835u0 abstractC3835u0 = (AbstractC3835u0) this.f35764j.f35758b.get();
        abstractC3855y0.I0(this.f35646b, abstractC3835u0);
        boolean z11 = abstractC3835u0.f35736b;
        z10 = this.f35764j.f35757a.f35751b;
        if (z11 == z10) {
            Boolean valueOf = Boolean.valueOf(z11);
            AtomicReference atomicReference = this.f35608h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final AbstractC3760f e(Spliterator spliterator) {
        return new C3850x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3750d
    protected final Object j() {
        boolean z10;
        z10 = this.f35764j.f35757a.f35751b;
        return Boolean.valueOf(!z10);
    }
}
