package de;

/* renamed from: de.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2628c extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2628c f28218Z = new C2628c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2628c f28219h0 = new C2628c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2628c f28220i0 = new C2628c(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28221Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2628c(int i10) {
        super(1);
        this.f28221Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        float f10;
        int i10 = this.f28221Y;
        switch (i10) {
            case 0:
                ((Number) obj).intValue();
                switch (i10) {
                    case 0:
                        f6 = AbstractC2634i.f28237a;
                        break;
                    default:
                        f6 = AbstractC2634i.f28238b;
                        break;
                }
                return new Z0.e(f6);
            case 1:
                ((Number) obj).intValue();
                switch (i10) {
                    case 0:
                        f10 = AbstractC2634i.f28237a;
                        break;
                    default:
                        f10 = AbstractC2634i.f28238b;
                        break;
                }
                return new Z0.e(f10);
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
