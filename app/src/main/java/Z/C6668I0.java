package z;

/* renamed from: z.I0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6668I0 implements AbstractC6656C0 {

    /* renamed from: Y  reason: collision with root package name */
    public final int f51152Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f51153Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C6658D0 f51154h0;

    public C6668I0(int i10, int i11, AbstractC6653B abstractC6653B) {
        this.f51152Y = i10;
        this.f51153Z = i11;
        this.f51154h0 = new C6658D0(new C6667I(i10, i11, abstractC6653B));
    }

    @Override // z.AbstractC6654B0
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u c(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51154h0.c(j6, abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u d(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51154h0.h(f(abstractC6726u, abstractC6726u2, abstractC6726u3), abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6654B0
    public final long f(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return (i() + g()) * 1000000;
    }

    @Override // z.AbstractC6656C0
    public final int g() {
        return this.f51153Z;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u h(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51154h0.h(j6, abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6656C0
    public final int i() {
        return this.f51152Y;
    }
}
