package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3793l2 implements AbstractC3813p2 {

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC3818q2 f35678a;

    public AbstractC3793l2(AbstractC3818q2 abstractC3818q2) {
        this.f35678a = (AbstractC3818q2) Objects.requireNonNull(abstractC3818q2);
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public void k() {
        this.f35678a.k();
    }

    @Override // j$.util.stream.AbstractC3818q2
    public boolean n() {
        return this.f35678a.n();
    }
}
