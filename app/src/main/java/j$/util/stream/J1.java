package j$.util.stream;

import j$.util.C3727k;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class J1 implements T1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35444a;

    /* renamed from: b  reason: collision with root package name */
    private Object f35445b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f35446c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(BinaryOperator binaryOperator) {
        this.f35446c = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f35444a) {
            this.f35444a = false;
        } else {
            obj = this.f35446c.apply(this.f35445b, obj);
        }
        this.f35445b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        J1 j12 = (J1) t12;
        if (!j12.f35444a) {
            accept(j12.f35445b);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f35444a ? C3727k.a() : C3727k.d(this.f35445b);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35444a = true;
        this.f35445b = null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
