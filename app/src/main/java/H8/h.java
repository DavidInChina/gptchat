package H8;

/* loaded from: classes.dex */
public final class h implements E8.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7493a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7494b = false;

    /* renamed from: c  reason: collision with root package name */
    public E8.c f7495c;

    /* renamed from: d  reason: collision with root package name */
    public final f f7496d;

    public h(f fVar) {
        this.f7496d = fVar;
    }

    @Override // E8.g
    public final E8.g c(String str) {
        if (!this.f7493a) {
            this.f7493a = true;
            this.f7496d.e(this.f7495c, str, this.f7494b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // E8.g
    public final E8.g d(boolean z10) {
        if (!this.f7493a) {
            this.f7493a = true;
            this.f7496d.c(this.f7495c, z10 ? 1 : 0, this.f7494b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
