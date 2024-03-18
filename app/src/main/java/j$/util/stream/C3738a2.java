package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3738a2 extends AbstractC3760f {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC3855y0 f35587h;

    C3738a2(C3738a2 c3738a2, Spliterator spliterator) {
        super(c3738a2, spliterator);
        this.f35587h = c3738a2.f35587h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3738a2(AbstractC3855y0 abstractC3855y0, AbstractC3855y0 abstractC3855y02, Spliterator spliterator) {
        super(abstractC3855y02, spliterator);
        this.f35587h = abstractC3855y0;
    }

    @Override // j$.util.stream.AbstractC3760f
    protected final Object a() {
        AbstractC3855y0 abstractC3855y0 = this.f35645a;
        T1 G02 = this.f35587h.G0();
        abstractC3855y0.I0(this.f35646b, G02);
        return G02;
    }

    @Override // j$.util.stream.AbstractC3760f
    protected final AbstractC3760f e(Spliterator spliterator) {
        return new C3738a2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3760f abstractC3760f = this.f35648d;
        if (abstractC3760f != null) {
            T1 t12 = (T1) ((C3738a2) abstractC3760f).c();
            t12.g((T1) ((C3738a2) this.f35649e).c());
            f(t12);
        }
        super.onCompletion(countedCompleter);
    }
}
