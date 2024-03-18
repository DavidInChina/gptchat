package j$.util.concurrent;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f35325b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f35326c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.f35324a = i10;
        this.f35325b = obj;
        this.f35326c = obj2;
    }

    public /* synthetic */ u(BiFunction biFunction, Function function) {
        this.f35324a = 2;
        this.f35326c = biFunction;
        this.f35325b = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f35325b).accept(obj);
        ((Consumer) this.f35326c).accept(obj);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i10 = this.f35324a;
        Object obj3 = this.f35326c;
        Object obj4 = this.f35325b;
        switch (i10) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.b(this, function);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return j$.com.android.tools.r8.a.h((BiFunction) this.f35326c, (Function) this.f35325b, obj, obj2);
    }

    public final /* synthetic */ BiConsumer d(BiConsumer biConsumer) {
        switch (this.f35324a) {
            case 0:
                return Objects.requireNonNull(biConsumer);
            default:
                return Objects.requireNonNull(biConsumer);
        }
    }
}
