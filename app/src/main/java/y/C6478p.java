package y;

import java.util.Map;
import z.AbstractC6670J0;
import z.AbstractC6696f;

/* renamed from: y.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6478p extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6478p f50268Z = new C6478p(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6478p f50269h0 = new C6478p(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50270Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6478p(int i10) {
        super(2);
        this.f50270Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10 = true;
        switch (this.f50270Y) {
            case 0:
                long j6 = ((Z0.k) obj).f22804a;
                long j10 = ((Z0.k) obj2).f22804a;
                Map map = AbstractC6670J0.f51158a;
                return AbstractC6696f.u(0.0f, 400.0f, new Z0.k(Ng.H.c(1, 1)), 1);
            default:
                V v10 = (V) obj2;
                if (((V) obj) != v10 || v10 != V.f50158h0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
