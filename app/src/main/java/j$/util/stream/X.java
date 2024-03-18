package j$.util.stream;

import j$.util.C3724h;
import j$.util.C3726j;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class X implements BiConsumer, IntBinaryOperator, ObjLongConsumer, LongBinaryOperator, LongFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35561a;

    public /* synthetic */ X(int i10) {
        this.f35561a = i10;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j6) {
        ((C3726j) obj).accept(j6);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f35561a) {
            case 0:
                ((C3724h) obj).a((C3724h) obj2);
                return;
            default:
                ((C3726j) obj).a((C3726j) obj2);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j6) {
        return Long.valueOf(j6);
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i10, int i11) {
        switch (this.f35561a) {
            case 1:
                return i10 + i11;
            default:
                return Math.max(i10, i11);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public final long applyAsLong(long j6, long j10) {
        switch (this.f35561a) {
            case 4:
                return Math.min(j6, j10);
            case 7:
                return Math.max(j6, j10);
            default:
                return j6 + j10;
        }
    }

    public final /* synthetic */ BiConsumer d(BiConsumer biConsumer) {
        switch (this.f35561a) {
            case 0:
                return Objects.requireNonNull(biConsumer);
            default:
                return Objects.requireNonNull(biConsumer);
        }
    }
}
