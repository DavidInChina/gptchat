package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class P0 extends AbstractC3760f {

    /* renamed from: h  reason: collision with root package name */
    protected final AbstractC3855y0 f35495h;

    /* renamed from: i  reason: collision with root package name */
    protected final LongFunction f35496i;

    /* renamed from: j  reason: collision with root package name */
    protected final BinaryOperator f35497j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P0(P0 p02, Spliterator spliterator) {
        super(p02, spliterator);
        this.f35495h = p02.f35495h;
        this.f35496i = p02.f35496i;
        this.f35497j = p02.f35497j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public P0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC3855y0, spliterator);
        this.f35495h = abstractC3855y0;
        this.f35496i = longFunction;
        this.f35497j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public AbstractC3760f e(Spliterator spliterator) {
        return new P0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final H0 a() {
        C0 c02 = (C0) this.f35496i.apply(this.f35495h.k0(this.f35646b));
        this.f35495h.I0(this.f35646b, c02);
        return c02.mo102b();
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3760f abstractC3760f = this.f35648d;
        if (abstractC3760f != null) {
            f((H0) this.f35497j.apply((H0) ((P0) abstractC3760f).c(), (H0) ((P0) this.f35649e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
