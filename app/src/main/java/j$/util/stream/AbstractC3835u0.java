package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3835u0 implements AbstractC3818q2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f35735a;

    /* renamed from: b  reason: collision with root package name */
    boolean f35736b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3835u0(EnumC3840v0 enumC3840v0) {
        boolean z10;
        z10 = enumC3840v0.f35751b;
        this.f35736b = !z10;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void l(long j6) {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final boolean n() {
        return this.f35735a;
    }
}
