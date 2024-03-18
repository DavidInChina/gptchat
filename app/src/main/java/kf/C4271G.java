package kf;

/* renamed from: kf.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4271G extends AbstractC4277b {

    /* renamed from: h0  reason: collision with root package name */
    public int f37443h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37444i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4272H f37445j0;

    public C4271G(C4272H c4272h) {
        this.f37445j0 = c4272h;
        this.f37443h0 = c4272h.r();
        this.f37444i0 = c4272h.f37448h0;
    }

    @Override // kf.AbstractC4277b
    public final void a() {
        int i10 = this.f37443h0;
        if (i10 == 0) {
            this.f37465Y = EnumC4275K.f37462h0;
            return;
        }
        C4272H c4272h = this.f37445j0;
        Object[] objArr = c4272h.f37446Y;
        int i11 = this.f37444i0;
        this.f37466Z = objArr[i11];
        this.f37465Y = EnumC4275K.f37460Y;
        this.f37444i0 = (i11 + 1) % c4272h.f37447Z;
        this.f37443h0 = i10 - 1;
    }
}
