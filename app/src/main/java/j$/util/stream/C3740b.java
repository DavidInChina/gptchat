package j$.util.stream;

import j$.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3740b implements IntFunction, BinaryOperator, Function, BiConsumer, Supplier, ObjDoubleConsumer, ToDoubleFunction, ToIntFunction, ObjIntConsumer, ToLongFunction, ObjLongConsumer, LongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35592a;

    public /* synthetic */ C3740b(int i10) {
        this.f35592a = i10;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final void accept(Object obj, double d10) {
        switch (this.f35592a) {
            case 5:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d10);
                dArr[3] = dArr[3] + d10;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                Collectors.a(dArr2, d10);
                dArr2[2] = dArr2[2] + d10;
                return;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i10) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i10;
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j6) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j6;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f35592a) {
            case 3:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 6:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 20:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f35592a) {
            case 0:
                return new Object[i10];
            case 8:
                return new Double[i10];
            case 15:
                int i11 = U.f35532h;
                return new Object[i10];
            case 16:
                return new Integer[i10];
            case 22:
                return new Long[i10];
            default:
                return new Object[i10];
        }
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j6) {
        switch (this.f35592a) {
            case 27:
                return AbstractC3855y0.h0(j6);
            default:
                return AbstractC3855y0.t0(j6);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Set set = Collectors.f35400a;
        return obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f35592a) {
            case 1:
                List list = (List) obj;
                Set set = Collectors.f35400a;
                list.addAll((List) obj2);
                return list;
            default:
                return new J0((D0) obj, (D0) obj2);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    public final /* synthetic */ BiConsumer d(BiConsumer biConsumer) {
        switch (this.f35592a) {
            case 3:
                return Objects.requireNonNull(biConsumer);
            case 6:
                return Objects.requireNonNull(biConsumer);
            case 20:
                return Objects.requireNonNull(biConsumer);
            default:
                return Objects.requireNonNull(biConsumer);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f35592a) {
            case 4:
                return new double[4];
            case 9:
                return new double[3];
            case 11:
                return new Object();
            case 12:
                return new Object();
            case 13:
                return new Object();
            case 14:
                return new Object();
            case 18:
                return new long[2];
            default:
                return new long[2];
        }
    }
}
