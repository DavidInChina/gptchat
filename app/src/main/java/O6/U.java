package o6;

/* loaded from: classes2.dex */
public final class U implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public double f40726a = Double.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f40727b;

    public U(a0 a0Var) {
        this.f40727b = a0Var;
    }

    @Override // w6.l
    public final void a(w6.k kVar) {
        boolean isNaN = Double.isNaN(this.f40726a);
        double d10 = kVar.f48065c;
        if (isNaN) {
            this.f40726a = d10;
        } else {
            this.f40727b.f40775I = Double.valueOf(d10 - this.f40726a);
        }
    }
}
