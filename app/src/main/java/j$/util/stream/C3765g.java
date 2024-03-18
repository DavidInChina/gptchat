package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3765g implements AbstractC3775i {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f35652a;

    private /* synthetic */ C3765g(BaseStream baseStream) {
        this.f35652a = baseStream;
    }

    public static /* synthetic */ AbstractC3775i h(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C3770h ? ((C3770h) baseStream).f35663a : baseStream instanceof DoubleStream ? E.h((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C3801n0.h((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C3744b3.h((java.util.stream.Stream) baseStream) : new C3765g(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f35652a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3765g) {
            obj = ((C3765g) obj).f35652a;
        }
        return this.f35652a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f35652a.hashCode();
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ boolean isParallel() {
        return this.f35652a.isParallel();
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f35652a.iterator();
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i onClose(Runnable runnable) {
        return h(this.f35652a.onClose(runnable));
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ AbstractC3775i parallel() {
        return h(this.f35652a.parallel());
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ AbstractC3775i sequential() {
        return h(this.f35652a.sequential());
    }

    @Override // j$.util.stream.AbstractC3775i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.P.a(this.f35652a.spliterator());
    }

    @Override // j$.util.stream.AbstractC3775i
    public final /* synthetic */ AbstractC3775i unordered() {
        return h(this.f35652a.unordered());
    }
}
