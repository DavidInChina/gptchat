package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3824s implements BinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f35721b;

    public /* synthetic */ C3824s(BiConsumer biConsumer, int i10) {
        this.f35720a = i10;
        this.f35721b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f35720a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            case 1:
                return j$.com.android.tools.r8.a.b(this, function);
            default:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i10 = this.f35720a;
        BiConsumer biConsumer = this.f35721b;
        switch (i10) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
