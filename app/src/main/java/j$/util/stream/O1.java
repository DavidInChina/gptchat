package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f35490h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f35491i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(EnumC3764f3 enumC3764f3, IntBinaryOperator intBinaryOperator, int i10) {
        super(enumC3764f3);
        this.f35490h = intBinaryOperator;
        this.f35491i = i10;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final T1 G0() {
        return new N1(this.f35491i, this.f35490h);
    }
}
