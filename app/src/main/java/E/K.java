package E;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3782Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int[] f3783Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int[] iArr, int i10) {
        super(3);
        this.f3782Y = i10;
        this.f3783Z = iArr;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int[] iArr = this.f3783Z;
        int i10 = this.f3782Y;
        switch (i10) {
            case 0:
                E0.r rVar = (E0.r) obj;
                int intValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                switch (i10) {
                    case 0:
                        return Integer.valueOf(iArr[intValue]);
                    default:
                        return Integer.valueOf(iArr[intValue]);
                }
            default:
                E0.r rVar2 = (E0.r) obj;
                int intValue2 = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                switch (i10) {
                    case 0:
                        return Integer.valueOf(iArr[intValue2]);
                    default:
                        return Integer.valueOf(iArr[intValue2]);
                }
        }
    }
}
