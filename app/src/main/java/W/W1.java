package W;

/* loaded from: classes2.dex */
public final class W1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19798Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f19799Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W1(C1550f3 c1550f3, int i10) {
        super(1);
        this.f19798Y = i10;
        this.f19799Z = c1550f3;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f19798Y;
        C1550f3 c1550f3 = this.f19799Z;
        switch (i10) {
            case 0:
                Z0.b bVar = (Z0.b) obj;
                return new Z0.i(kotlin.jvm.internal.m.c(0, (int) c1550f3.f20062c.g()));
            default:
                ((Number) obj).floatValue();
                Z0.b bVar2 = c1550f3.f20063d;
                if (bVar2 != null) {
                    return Float.valueOf(bVar2.R(56));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
        }
    }
}
