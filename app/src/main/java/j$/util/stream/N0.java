package j$.util.stream;

import j$.util.C3723g;
import j$.util.C3724h;
import j$.util.C3726j;
import j$.util.C3727k;
import j$.util.C3728l;
import j$.util.C3729m;
import j$.util.C3730n;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final /* synthetic */ class N0 implements BinaryOperator, LongFunction, IntFunction, Consumer, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, Predicate, IntBinaryOperator, ObjIntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35482a;

    public /* synthetic */ N0(int i10) {
        this.f35482a = i10;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final void accept(Object obj, double d10) {
        ((C3723g) obj).accept(d10);
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i10) {
        ((C3724h) obj).accept(i10);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f35482a) {
            case 12:
                ((List) obj).add(obj2);
                return;
            case 16:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 17:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C3723g) obj).a((C3723g) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f35482a) {
            case 23:
                return j$.com.android.tools.r8.a.a(this, predicate);
            case 24:
                return j$.com.android.tools.r8.a.a(this, predicate);
            case 25:
                return j$.com.android.tools.r8.a.a(this, predicate);
            default:
                return j$.com.android.tools.r8.a.a(this, predicate);
        }
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f35482a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            case 1:
            default:
                return j$.com.android.tools.r8.a.b(this, function);
            case 2:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35482a) {
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.DoubleFunction
    public final Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f35482a) {
            case 4:
                return new Object[i10];
            case 5:
                return new Integer[i10];
            case 6:
                return new Long[i10];
            case 7:
                return new Double[i10];
            default:
                return Integer.valueOf(i10);
        }
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j6) {
        return AbstractC3855y0.v0(j6);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f35482a) {
            case 0:
                return new J0((E0) obj, (E0) obj2);
            case 1:
            default:
                return new J0((H0) obj, (H0) obj2);
            case 2:
                return new J0((F0) obj, (F0) obj2);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final double applyAsDouble(double d10, double d11) {
        switch (this.f35482a) {
            case 18:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i10, int i11) {
        return Math.min(i10, i11);
    }

    public final /* synthetic */ BiConsumer d(BiConsumer biConsumer) {
        switch (this.f35482a) {
            case 12:
                return Objects.requireNonNull(biConsumer);
            case 16:
                return Objects.requireNonNull(biConsumer);
            case 17:
                return Objects.requireNonNull(biConsumer);
            default:
                return Objects.requireNonNull(biConsumer);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f35482a) {
            case 10:
                return new C3723g();
            case 11:
                return new ArrayList();
            case 12:
            default:
                return new LinkedHashSet();
            case 13:
                return new C3724h();
            case 14:
                return new C3726j();
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f35482a) {
            case 23:
                return j$.com.android.tools.r8.a.f(this);
            case 24:
                return j$.com.android.tools.r8.a.f(this);
            case 25:
                return j$.com.android.tools.r8.a.f(this);
            default:
                return j$.com.android.tools.r8.a.f(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f35482a) {
            case 23:
                return j$.com.android.tools.r8.a.g(this, predicate);
            case 24:
                return j$.com.android.tools.r8.a.g(this, predicate);
            case 25:
                return j$.com.android.tools.r8.a.g(this, predicate);
            default:
                return j$.com.android.tools.r8.a.g(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f35482a) {
            case 23:
                return ((C3728l) obj).c();
            case 24:
                return ((C3729m) obj).c();
            case 25:
                return ((C3730n) obj).c();
            default:
                return ((C3727k) obj).c();
        }
    }
}
