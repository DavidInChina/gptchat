package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f35464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(Collection collection) {
        this.f35464a = collection;
    }

    @Override // j$.util.stream.H0
    public final H0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f35464a.size();
    }

    @Override // j$.util.stream.H0
    public final void forEach(Consumer consumer) {
        AbstractC3732p.q(this.f35464a, consumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.S(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.H0
    public final void i(Object[] objArr, int i10) {
        for (Object obj : this.f35464a) {
            objArr[i10] = obj;
            i10++;
        }
    }

    @Override // j$.util.stream.H0
    public final Object[] o(IntFunction intFunction) {
        Collection collection = this.f35464a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final Spliterator mo101spliterator() {
        Collection collection = this.f35464a;
        return (collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : AbstractC3855y0.H0(AbstractC3732p.r(collection), false)).spliterator();
    }

    public final String toString() {
        Collection collection = this.f35464a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
