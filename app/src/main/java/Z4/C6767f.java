package z4;

/* renamed from: z4.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6767f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51614Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6770i f51615Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f51616h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6767f(C6770i c6770i, int i10, int i11) {
        super(1);
        this.f51614Y = i11;
        this.f51615Z = c6770i;
        this.f51616h0 = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C6770i c6770i = this.f51615Z;
        int i10 = this.f51616h0;
        int i11 = this.f51614Y;
        switch (i11) {
            case 0:
                long longValue = ((Number) obj).longValue();
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(C6770i.b(c6770i, i10, longValue));
                    default:
                        return Boolean.valueOf(C6770i.b(c6770i, i10, longValue));
                }
            default:
                long longValue2 = ((Number) obj).longValue();
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(C6770i.b(c6770i, i10, longValue2));
                    default:
                        return Boolean.valueOf(C6770i.b(c6770i, i10, longValue2));
                }
        }
    }
}
