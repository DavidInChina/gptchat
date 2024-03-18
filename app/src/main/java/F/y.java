package F;

import E0.c0;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final y f5002Z = new y(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final y f5003h0 = new y(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final y f5004i0 = new y(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5005Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10) {
        super(1);
        this.f5005Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f5005Y) {
            case 0:
                c0 c0Var = (c0) obj;
                return jf.y.f36177a;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                List list = (List) obj;
                return new J(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
