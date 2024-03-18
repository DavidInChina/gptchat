package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Y3 extends Z3 implements Consumer {

    /* renamed from: f  reason: collision with root package name */
    final Predicate f35571f;

    /* renamed from: g  reason: collision with root package name */
    Object f35572g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y3(Spliterator spliterator, Y3 y32) {
        super(spliterator, y32);
        this.f35571f = y32.f35571f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y3(Spliterator spliterator, Predicate predicate) {
        super(spliterator);
        this.f35571f = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35581e = (this.f35581e + 1) & 63;
        this.f35572g = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
