package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.j2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3783j2 implements AbstractC3803n2 {

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC3818q2 f35672a;

    public AbstractC3783j2(AbstractC3818q2 abstractC3818q2) {
        this.f35672a = (AbstractC3818q2) Objects.requireNonNull(abstractC3818q2);
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public void k() {
        this.f35672a.k();
    }

    @Override // j$.util.stream.AbstractC3818q2
    public boolean n() {
        return this.f35672a.n();
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
    }
}
