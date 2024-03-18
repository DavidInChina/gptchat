package mh;

import q0.C5251c;

/* renamed from: mh.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4665J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39411Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4670O f39412Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4665J(C4670O c4670o, int i10) {
        super(1);
        this.f39411Y = i10;
        this.f39412Z = c4670o;
    }

    public final void a(long j6) {
        int i10 = this.f39411Y;
        C4670O c4670o = this.f39412Z;
        switch (i10) {
            case 0:
                Ad.l.O0(c4670o.p0(), null, null, new C4664I(c4670o, j6, null), 3);
                return;
            default:
                Ad.l.O0(c4670o.p0(), null, null, new C4666K(c4670o, null), 3);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f39411Y) {
            case 0:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 1:
                a(((C5251c) obj).f43623a);
                return yVar;
            default:
                long j6 = ((Z0.p) obj).f22815a;
                C4670O c4670o = this.f39412Z;
                Ad.l.O0(c4670o.p0(), null, null, new C4668M(c4670o, j6, null), 3);
                return yVar;
        }
    }
}
