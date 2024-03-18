package I9;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final G f8169Z = new G(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final G f8170h0 = new G(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final G f8171i0 = new G(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8172Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i10) {
        super(2);
        this.f8172Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8172Y) {
            case 0:
                j1 j1Var = (j1) obj;
                zd.n nVar = (zd.n) obj2;
                AbstractC3557B.c0("$this$setOnEach", j1Var);
                AbstractC3557B.c0("it", nVar);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, nVar, null, null, null, false, 126975);
            case 1:
                j1 j1Var2 = (j1) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                AbstractC3557B.c0("$this$setOnEach", j1Var2);
                return j1.e(j1Var2, false, false, false, null, null, false, null, false, null, null, null, null, booleanValue, 65535);
            default:
                xd.e eVar = (xd.e) obj2;
                AbstractC3557B.c0("$this$setOnEach", (e1) obj);
                AbstractC3557B.c0("it", eVar);
                return new e1(eVar);
        }
    }
}
