package j$.util.stream;

import j$.util.C3730n;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class S1 implements T1, AbstractC3813p2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35521a;

    /* renamed from: b  reason: collision with root package name */
    private long f35522b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f35523c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S1(LongBinaryOperator longBinaryOperator) {
        this.f35523c = longBinaryOperator;
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
        if (this.f35521a) {
            this.f35521a = false;
        } else {
            j6 = this.f35523c.applyAsLong(this.f35522b, j6);
        }
        this.f35522b = j6;
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
        S1 s12 = (S1) t12;
        if (!s12.f35521a) {
            accept(s12.f35522b);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f35521a ? C3730n.a() : C3730n.d(this.f35522b);
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
        this.f35521a = true;
        this.f35522b = 0L;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
