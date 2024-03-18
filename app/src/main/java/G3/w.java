package G3;

/* loaded from: classes2.dex */
public final class w extends t {

    /* renamed from: a  reason: collision with root package name */
    public x f5972a;

    @Override // G3.t, G3.r
    public final void c(s sVar) {
        x xVar = this.f5972a;
        if (!xVar.f5976F0) {
            xVar.G();
            xVar.f5976F0 = true;
        }
    }

    @Override // G3.r
    public final void d(s sVar) {
        x xVar = this.f5972a;
        int i10 = xVar.f5975E0 - 1;
        xVar.f5975E0 = i10;
        if (i10 == 0) {
            xVar.f5976F0 = false;
            xVar.n();
        }
        sVar.w(this);
    }
}
