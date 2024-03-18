package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f35401h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f35402i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Object f35403j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Object f35404k;

    public D1(EnumC3764f3 enumC3764f3, Object obj, Object obj2, Object obj3, int i10) {
        this.f35401h = i10;
        this.f35402i = obj;
        this.f35404k = obj2;
        this.f35403j = obj3;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final T1 G0() {
        int i10 = this.f35401h;
        Object obj = this.f35402i;
        Object obj2 = this.f35404k;
        Object obj3 = this.f35403j;
        switch (i10) {
            case 0:
                return new A1((Supplier) obj3, (ObjLongConsumer) obj2, (BinaryOperator) obj);
            case 1:
                return new G1((Supplier) obj3, (ObjDoubleConsumer) obj2, (BinaryOperator) obj);
            case 2:
                return new I1(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 3:
                return new M1((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new Q1((Supplier) obj3, (ObjIntConsumer) obj2, (BinaryOperator) obj);
        }
    }
}
