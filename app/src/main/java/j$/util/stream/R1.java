package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class R1 implements T1, AbstractC3813p2 {

    /* renamed from: a  reason: collision with root package name */
    private long f35510a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f35511b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f35512c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(long j6, LongBinaryOperator longBinaryOperator) {
        this.f35511b = j6;
        this.f35512c = longBinaryOperator;
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
    public final void accept(long j6) {
        this.f35510a = this.f35512c.applyAsLong(this.f35510a, j6);
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

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        accept(((R1) t12).f35510a);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f35510a);
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35510a = this.f35511b;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
