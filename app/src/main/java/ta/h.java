package Ta;

import id.AbstractC3557B;
import jf.y;
import qe.C5316h;
import qe.C5320l;
import xe.C6433v;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final h f16998Z = new h(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final h f16999h0 = new h(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final h f17000i0 = new h(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17001Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f17001Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f17001Y) {
            case 0:
                C5316h c5316h = (C5316h) obj;
                AbstractC3557B.c0("$this$install", c5316h);
                c5316h.f44096c = new Cf.h(0);
                return yVar;
            case 1:
                ge.f fVar = (ge.f) obj;
                AbstractC3557B.c0("$this$HttpClient", fVar);
                fVar.a(C5320l.f44112e, f16998Z);
                fVar.f31612g = true;
                return yVar;
            default:
                C6433v c6433v = (C6433v) obj;
                AbstractC3557B.c0("$this$headers", c6433v);
                c6433v.f("x-ms-blob-type", "BlockBlob");
                c6433v.f("x-ms-version", "2020-04-08");
                return yVar;
        }
    }
}
