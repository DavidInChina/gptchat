package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f35388h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f35389i;

    public B1(EnumC3764f3 enumC3764f3, Object obj, int i10) {
        this.f35388h = i10;
        this.f35389i = obj;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final T1 G0() {
        int i10 = this.f35388h;
        Object obj = this.f35389i;
        switch (i10) {
            case 0:
                return new S1((LongBinaryOperator) obj);
            case 1:
                return new E1((DoubleBinaryOperator) obj);
            case 2:
                return new J1((BinaryOperator) obj);
            default:
                return new P1((IntBinaryOperator) obj);
        }
    }
}
