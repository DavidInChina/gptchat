package F;

import E0.O;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4973Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ G.J f4974Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f4975h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f4976i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f4977j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(G.J j6, long j10, int i10, int i11, int i12) {
        super(3);
        this.f4973Y = i12;
        this.f4974Z = j6;
        this.f4975h0 = j10;
        this.f4976i0 = i10;
        this.f4977j0 = i11;
    }

    public final O a(int i10, int i11, wf.k kVar) {
        kf.w wVar = kf.w.f37484Y;
        int i12 = this.f4973Y;
        G.J j6 = this.f4974Z;
        int i13 = this.f4977j0;
        long j10 = this.f4975h0;
        int i14 = this.f4976i0;
        switch (i12) {
            case 0:
                return ((G.K) j6).f5435Z.j0(A7.b.t0(i10 + i14, j10), A7.b.s0(i11 + i13, j10), wVar, kVar);
            default:
                return ((G.K) j6).f5435Z.j0(A7.b.t0(i10 + i14, j10), A7.b.s0(i11 + i13, j10), wVar, kVar);
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4973Y) {
            case 0:
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (wf.k) obj3);
            default:
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (wf.k) obj3);
        }
    }
}
