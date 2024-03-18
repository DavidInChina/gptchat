package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3861z1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f35786h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ long f35787i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3861z1(EnumC3764f3 enumC3764f3, LongBinaryOperator longBinaryOperator, long j6) {
        super(enumC3764f3);
        this.f35786h = longBinaryOperator;
        this.f35787i = j6;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final T1 G0() {
        return new R1(this.f35787i, this.f35786h);
    }
}
