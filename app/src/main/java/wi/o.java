package wi;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: g  reason: collision with root package name */
    public final String f48603g;

    /* renamed from: h  reason: collision with root package name */
    public final String f48604h;

    public o(String str, String str2) {
        this.f48603g = str;
        this.f48604h = str2;
    }

    @Override // wi.s
    public final void a(L4.a aVar) {
        aVar.W0(this);
    }

    @Override // wi.s
    public final String h() {
        return "destination=" + this.f48603g + ", title=" + this.f48604h;
    }
}
