package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3804n3 implements Spliterator, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f35698d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spliterator f35699a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f35700b;

    /* renamed from: c  reason: collision with root package name */
    private Object f35701c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3804n3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C3804n3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f35699a = spliterator;
        this.f35700b = concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Consumer consumer, Object obj) {
        if (this.f35700b.putIfAbsent(obj != null ? obj : f35698d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35701c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f35699a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35699a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f35699a.forEachRemaining(new C3800n(6, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f35699a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3732p.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC3732p.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f35699a.tryAdvance(this)) {
            Object obj = this.f35701c;
            if (obj == null) {
                obj = f35698d;
            }
            if (this.f35700b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f35701c);
                this.f35701c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        Spliterator mo106trySplit = this.f35699a.mo106trySplit();
        if (mo106trySplit != null) {
            return new C3804n3(mo106trySplit, this.f35700b);
        }
        return null;
    }
}
