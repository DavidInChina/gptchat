package z;

/* renamed from: z.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6707k0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f51305Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51306Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6706k f51307h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6726u f51308i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C6716p f51309j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f51310k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f51311l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6707k0(kotlin.jvm.internal.B b10, Object obj, AbstractC6706k abstractC6706k, AbstractC6726u abstractC6726u, C6716p c6716p, float f6, wf.k kVar) {
        super(1);
        this.f51305Y = b10;
        this.f51306Z = obj;
        this.f51307h0 = abstractC6706k;
        this.f51308i0 = abstractC6726u;
        this.f51309j0 = c6716p;
        this.f51310k0 = f6;
        this.f51311l0 = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        AbstractC6706k abstractC6706k = this.f51307h0;
        C6737z0 c10 = abstractC6706k.c();
        Object g10 = abstractC6706k.g();
        C6705j0 c6705j0 = new C6705j0(0, this.f51309j0);
        C6712n c6712n = new C6712n(this.f51306Z, c10, this.f51308i0, longValue, g10, longValue, c6705j0);
        AbstractC6696f.o(c6712n, longValue, this.f51310k0, this.f51307h0, this.f51309j0, this.f51311l0);
        this.f51305Y.f37622Y = c6712n;
        return jf.y.f36177a;
    }
}
