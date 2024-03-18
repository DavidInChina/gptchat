package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3812p1 extends X2 implements F0, B0 {
    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
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

    @Override // j$.util.stream.X2, java.util.function.LongConsumer
    public final void accept(long j6) {
        super.accept(j6);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.B0, j$.util.stream.C0
    /* renamed from: b */
    public final F0 mo102b() {
        return this;
    }

    @Override // j$.util.stream.B0, j$.util.stream.C0
    /* renamed from: b  reason: collision with other method in class */
    public final H0 mo102b() {
        return this;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.G0
    public final void d(Object obj, int i10) {
        super.d((long[]) obj, i10);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.G0
    public final Object e() {
        return (long[]) super.e();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.G0
    public final void f(Object obj) {
        super.f((LongConsumer) obj);
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        clear();
        u(j6);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3855y0.I(this, intFunction);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: spliterator */
    public final j$.util.O mo103spliterator() {
        return super.mo103spliterator();
    }

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo103spliterator() {
        return super.mo103spliterator();
    }

    @Override // j$.util.stream.X2
    public final j$.util.L x() {
        return super.mo103spliterator();
    }

    /* renamed from: y */
    public final /* synthetic */ void i(Long[] lArr, int i10) {
        AbstractC3855y0.L(this, lArr, i10);
    }

    /* renamed from: z */
    public final /* synthetic */ F0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.R(this, j6, j10);
    }
}
