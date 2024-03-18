package j$.time.temporal;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35133b;

    public /* synthetic */ o(int i10, int i11) {
        this.f35132a = i11;
        this.f35133b = i10;
    }

    @Override // j$.time.temporal.n
    public final m A(m mVar) {
        int i10 = this.f35132a;
        int i11 = this.f35133b;
        switch (i10) {
            case 0:
                int p10 = mVar.p(a.DAY_OF_WEEK);
                if (p10 == i11) {
                    return mVar;
                }
                int i12 = p10 - i11;
                return mVar.mo88e(i12 >= 0 ? 7 - i12 : -i12, b.DAYS);
            default:
                int p11 = mVar.p(a.DAY_OF_WEEK);
                if (p11 == i11) {
                    return mVar;
                }
                int i13 = i11 - p11;
                return mVar.g(i13 >= 0 ? 7 - i13 : -i13, b.DAYS);
        }
    }
}
