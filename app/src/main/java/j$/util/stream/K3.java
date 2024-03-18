package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class K3 implements AbstractC3818q2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f35461b;

    public /* synthetic */ K3(Consumer consumer, int i10) {
        this.f35460a = i10;
        this.f35461b = consumer;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f35460a) {
            case 0:
                AbstractC3855y0.z();
                throw null;
            default:
                AbstractC3855y0.z();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f35460a) {
            case 0:
                AbstractC3855y0.G();
                throw null;
            default:
                AbstractC3855y0.G();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        switch (this.f35460a) {
            case 0:
                AbstractC3855y0.H();
                throw null;
            default:
                AbstractC3855y0.H();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35460a;
        Consumer consumer = this.f35461b;
        switch (i10) {
            case 0:
                ((C3739a3) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35460a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void l(long j6) {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
