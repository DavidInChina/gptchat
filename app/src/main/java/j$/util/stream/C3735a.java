package j$.util.stream;

import j$.util.C3721e;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3735a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35582a;

    /* renamed from: b  reason: collision with root package name */
    public Object f35583b;

    public /* synthetic */ C3735a(Object obj, int i10) {
        this.f35582a = i10;
        this.f35583b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object obj2 = this.f35583b;
        switch (this.f35582a) {
            case 2:
                ((AbstractC3818q2) obj2).accept((AbstractC3818q2) obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35582a) {
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.DoubleFunction
    public final Object apply(double d10) {
        Object apply = ((DoubleFunction) this.f35583b).apply(d10);
        if (apply == null) {
            return null;
        }
        if (apply instanceof G) {
            return F.h((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.h((DoubleStream) apply);
        }
        C3721e.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j6) {
        Object apply = ((LongFunction) this.f35583b).apply(j6);
        if (apply == null) {
            return null;
        }
        if (apply instanceof AbstractC3811p0) {
            return C3806o0.h((AbstractC3811p0) apply);
        }
        if (apply instanceof LongStream) {
            return C3801n0.h((LongStream) apply);
        }
        C3721e.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply = ((Function) this.f35583b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return C3744b3.h((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof G) {
            return F.h((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.h((DoubleStream) apply);
        }
        if (apply instanceof AbstractC3811p0) {
            return C3806o0.h((AbstractC3811p0) apply);
        }
        if (apply instanceof LongStream) {
            return C3801n0.h((LongStream) apply);
        }
        C3721e.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj = this.f35583b;
        switch (this.f35582a) {
            case 0:
                return ((AbstractC3745c) obj).S0();
            default:
                return (Spliterator) obj;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        Object obj = this.f35583b;
        switch (this.f35582a) {
            case 3:
                C3814p3 c3814p3 = (C3814p3) obj;
                return c3814p3.f35657d.tryAdvance(c3814p3.f35658e);
            case 4:
                C3823r3 c3823r3 = (C3823r3) obj;
                return c3823r3.f35657d.tryAdvance(c3823r3.f35658e);
            case 5:
                C3833t3 c3833t3 = (C3833t3) obj;
                return c3833t3.f35657d.tryAdvance(c3833t3.f35658e);
            default:
                L3 l32 = (L3) obj;
                return l32.f35657d.tryAdvance(l32.f35658e);
        }
    }
}
