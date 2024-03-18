package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3770h implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3775i f35663a;

    private /* synthetic */ C3770h(AbstractC3775i abstractC3775i) {
        this.f35663a = abstractC3775i;
    }

    public static /* synthetic */ BaseStream h(AbstractC3775i abstractC3775i) {
        if (abstractC3775i == null) {
            return null;
        }
        return abstractC3775i instanceof C3765g ? ((C3765g) abstractC3775i).f35652a : abstractC3775i instanceof G ? F.h((G) abstractC3775i) : abstractC3775i instanceof IntStream ? IntStream.Wrapper.convert((IntStream) abstractC3775i) : abstractC3775i instanceof AbstractC3811p0 ? C3806o0.h((AbstractC3811p0) abstractC3775i) : abstractC3775i instanceof Stream ? Stream.Wrapper.convert((Stream) abstractC3775i) : new C3770h(abstractC3775i);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f35663a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC3775i abstractC3775i = this.f35663a;
        if (obj instanceof C3770h) {
            obj = ((C3770h) obj).f35663a;
        }
        return abstractC3775i.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35663a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f35663a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f35663a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return h(this.f35663a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return h(this.f35663a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return h(this.f35663a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f35663a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return h(this.f35663a.unordered());
    }
}
