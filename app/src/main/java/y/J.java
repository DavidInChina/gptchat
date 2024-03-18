package y;

import z.C6729v0;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f50119Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f50120Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(wf.k kVar, C6729v0 c6729v0) {
        super(3);
        this.f50119Y = kVar;
        this.f50120Z = c6729v0;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6;
        E0.P p10 = (E0.P) obj;
        E0.d0 o10 = ((E0.M) obj2).o(((Z0.a) obj3).f22782a);
        if (p10.P()) {
            if (!((Boolean) this.f50119Y.invoke(this.f50120Z.f51386c.getValue())).booleanValue()) {
                j6 = 0;
                return p10.j0((int) (j6 >> 32), (int) (j6 & 4294967295L), kf.w.f37484Y, new D(o10, 1));
            }
        }
        j6 = Ng.H.c(o10.f4053Y, o10.f4054Z);
        return p10.j0((int) (j6 >> 32), (int) (j6 & 4294967295L), kf.w.f37484Y, new D(o10, 1));
    }
}
