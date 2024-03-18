package H;

import E0.c0;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final u f6669Z = new u(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final u f6670h0 = new u(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6671Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10) {
        super(1);
        this.f6671Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f6671Y) {
            case 0:
                c0 c0Var = (c0) obj;
                return jf.y.f36177a;
            default:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj2);
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj3);
                return new I(intValue, ((Float) obj3).floatValue(), new H(0, list));
        }
    }
}
