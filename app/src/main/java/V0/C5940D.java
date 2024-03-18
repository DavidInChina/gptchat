package v0;

import q0.C5251c;
import t0.AbstractC5650i;
import t0.C5643b;

/* renamed from: v0.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5940D extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46844Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5941E f46845Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5940D(C5941E c5941e, int i10) {
        super(1);
        this.f46844Y = i10;
        this.f46845Z = c5941e;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f46844Y;
        C5941E c5941e = this.f46845Z;
        switch (i10) {
            case 0:
                AbstractC5939C abstractC5939C = (AbstractC5939C) obj;
                c5941e.f46848d = true;
                c5941e.f46850f.mo122invoke();
                return yVar;
            default:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                C5950c c5950c = c5941e.f46846b;
                float f6 = c5941e.f46855k;
                float f10 = c5941e.f46856l;
                long j6 = C5251c.f43619b;
                C5643b V10 = abstractC5650i.V();
                long b10 = V10.b();
                V10.a().h();
                V10.f45609a.d(f6, f10, j6);
                c5950c.a(abstractC5650i);
                V10.a().q();
                V10.c(b10);
                return yVar;
        }
    }
}
