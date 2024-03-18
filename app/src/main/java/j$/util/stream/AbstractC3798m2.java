package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3798m2 implements AbstractC3818q2 {

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC3818q2 f35690a;

    public AbstractC3798m2(AbstractC3818q2 abstractC3818q2) {
        this.f35690a = (AbstractC3818q2) Objects.requireNonNull(abstractC3818q2);
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public void k() {
        this.f35690a.k();
    }

    @Override // j$.util.stream.AbstractC3818q2
    public void l(long j6) {
        this.f35690a.l(j6);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public boolean n() {
        return this.f35690a.n();
    }
}
