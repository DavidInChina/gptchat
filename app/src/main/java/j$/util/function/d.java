package j$.util.function;

import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function f35354b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function f35355c;

    public /* synthetic */ d(Function function, Function function2, int i10) {
        this.f35353a = i10;
        this.f35354b = function;
        this.f35355c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f35353a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i10 = this.f35353a;
        Function function = this.f35354b;
        Function function2 = this.f35355c;
        switch (i10) {
            case 0:
                return function2.apply(function.apply(obj));
            default:
                return function.apply(function2.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f35353a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
