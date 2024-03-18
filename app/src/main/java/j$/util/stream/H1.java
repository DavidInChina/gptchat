package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes3.dex */
final class H1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f35426h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ double f35427i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(EnumC3764f3 enumC3764f3, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        super(enumC3764f3);
        this.f35426h = doubleBinaryOperator;
        this.f35427i = d10;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final T1 G0() {
        return new C1(this.f35427i, this.f35426h);
    }
}
