package B;

/* renamed from: B.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0153p0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1450Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f1451Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0153p0(kotlin.jvm.internal.y yVar, int i10) {
        super(2);
        this.f1450Y = i10;
        this.f1451Z = yVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        kotlin.jvm.internal.y yVar2 = this.f1451Z;
        int i10 = this.f1450Y;
        switch (i10) {
            case 0:
                B0.u uVar = (B0.u) obj;
                float floatValue = ((Number) obj2).floatValue();
                switch (i10) {
                    case 0:
                        uVar.a();
                        yVar2.f37646Y = floatValue;
                        break;
                    default:
                        uVar.a();
                        yVar2.f37646Y = floatValue;
                        break;
                }
                return yVar;
            default:
                B0.u uVar2 = (B0.u) obj;
                float floatValue2 = ((Number) obj2).floatValue();
                switch (i10) {
                    case 0:
                        uVar2.a();
                        yVar2.f37646Y = floatValue2;
                        break;
                    default:
                        uVar2.a();
                        yVar2.f37646Y = floatValue2;
                        break;
                }
                return yVar;
        }
    }
}
