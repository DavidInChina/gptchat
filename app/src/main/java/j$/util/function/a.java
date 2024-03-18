package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements BinaryOperator, Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35346a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f35347b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f35346a = i10;
        this.f35347b = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.a(this, predicate);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f35346a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            default:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i10 = this.f35346a;
        Object obj3 = this.f35347b;
        switch (i10) {
            case 0:
                return ((Comparator) obj3).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) obj3).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    public final /* synthetic */ Predicate negate() {
        return j$.com.android.tools.r8.a.f(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.g(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.f35347b).test(obj);
    }
}
