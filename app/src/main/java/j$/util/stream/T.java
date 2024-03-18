package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class T implements N3, O3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35530a;

    /* JADX INFO: Access modifiers changed from: protected */
    public T(boolean z10) {
        this.f35530a = z10;
    }

    public final void a(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        (this.f35530a ? new U(abstractC3855y0, spliterator, this) : new V(abstractC3855y0, spliterator, abstractC3855y0.J0(this))).invoke();
    }

    public /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.N3
    public final int h() {
        if (this.f35530a) {
            return 0;
        }
        return EnumC3759e3.f35634r;
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
