package z;

/* renamed from: z.H0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6666H0 implements AbstractC6654B0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6658D0 f51148Y;

    public C6666H0(float f6, float f10, AbstractC6726u abstractC6726u) {
        C.b bVar;
        if (abstractC6726u != null) {
            bVar = new C.b(f6, f10, abstractC6726u);
        } else {
            bVar = new C.b(f6, f10);
        }
        this.f51148Y = new C6658D0(bVar);
    }

    @Override // z.AbstractC6654B0
    public final boolean a() {
        this.f51148Y.getClass();
        return false;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u c(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51148Y.c(j6, abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u d(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51148Y.d(abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6654B0
    public final long f(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51148Y.f(abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u h(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51148Y.h(j6, abstractC6726u, abstractC6726u2, abstractC6726u3);
    }
}
