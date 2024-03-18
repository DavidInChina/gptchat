package G;

import z.C6694e;

/* renamed from: G.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0557l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5533Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f5534Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0557l(r rVar, int i10) {
        super(1);
        this.f5533Y = i10;
        this.f5534Z = rVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f5533Y;
        r rVar = this.f5534Z;
        switch (i10) {
            case 0:
                float floatValue = ((Number) ((C6694e) obj).e()).floatValue();
                int i11 = r.f5550n;
                rVar.f5560j.i(floatValue);
                return yVar;
            default:
                ((r0.I) ((r0.x) obj)).a(rVar.f5560j.h());
                return yVar;
        }
    }
}
