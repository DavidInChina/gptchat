package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DoubleUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35350a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f35351b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f35352c;

    public /* synthetic */ c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i10) {
        this.f35350a = i10;
        this.f35351b = doubleUnaryOperator;
        this.f35352c = doubleUnaryOperator2;
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d10) {
        int i10 = this.f35350a;
        DoubleUnaryOperator doubleUnaryOperator = this.f35352c;
        DoubleUnaryOperator doubleUnaryOperator2 = this.f35351b;
        switch (i10) {
            case 0:
                return doubleUnaryOperator2.applyAsDouble(doubleUnaryOperator.applyAsDouble(d10));
            default:
                return doubleUnaryOperator.applyAsDouble(doubleUnaryOperator2.applyAsDouble(d10));
        }
    }

    public final /* synthetic */ DoubleUnaryOperator b(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f35350a) {
            case 0:
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
        }
    }

    public final /* synthetic */ DoubleUnaryOperator c(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f35350a) {
            case 0:
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
        }
    }
}
