package u8;

/* renamed from: u8.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5867q extends AbstractRunnableC5866p {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N7.f f46498Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractRunnableC5866p f46499h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5852b f46500i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5867q(C5852b c5852b, N7.f fVar, N7.f fVar2, o8.o oVar) {
        super(fVar);
        this.f46500i0 = c5852b;
        this.f46498Z = fVar2;
        this.f46499h0 = oVar;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void b() {
        synchronized (this.f46500i0.f46478f) {
            try {
                C5852b c5852b = this.f46500i0;
                N7.f fVar = this.f46498Z;
                c5852b.f46477e.add(fVar);
                fVar.f12723a.a(new v7.n(c5852b, fVar, 3));
                if (this.f46500i0.f46484l.getAndIncrement() > 0) {
                    this.f46500i0.f46474b.b("Already connected to the service.", new Object[0]);
                }
                C5852b.b(this.f46500i0, this.f46499h0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
