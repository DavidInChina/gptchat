package E0;

import java.util.List;

/* loaded from: classes.dex */
public final class G extends G0.G {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f4008b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ wf.n f4009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j6, wf.n nVar, String str) {
        super(str);
        this.f4008b = j6;
        this.f4009c = nVar;
    }

    @Override // E0.N
    public final O a(P p10, List list, long j6) {
        J j10 = this.f4008b;
        j10.f4019m0.f3999Y = p10.getLayoutDirection();
        float b10 = p10.b();
        E e10 = j10.f4019m0;
        e10.f4000Z = b10;
        e10.f4001h0 = p10.O();
        boolean P = p10.P();
        wf.n nVar = this.f4009c;
        if (!P && j10.f4012Y.f24844h0 != null) {
            j10.f4016j0 = 0;
            O o10 = (O) nVar.invoke(j10.f4020n0, new Z0.a(j6));
            return new F(o10, j10, j10.f4016j0, o10, 0);
        }
        j10.f4015i0 = 0;
        O o11 = (O) nVar.invoke(e10, new Z0.a(j6));
        return new F(o11, j10, j10.f4015i0, o11, 1);
    }
}
