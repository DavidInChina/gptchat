package Ya;

import G0.C0588q;
import cb.C2334C;
import cb.C2362c0;
import id.AbstractC3557B;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22185Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f22186Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2334C f22187h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(C2334C c2334c, C2334C c2334c2, int i10) {
        super(1);
        this.f22185Y = i10;
        this.f22186Z = c2334c;
        this.f22187h0 = c2334c2;
    }

    public final C2362c0 a(C2362c0 c2362c0) {
        int i10 = this.f22185Y;
        C2334C c2334c = this.f22187h0;
        C2334C c2334c2 = this.f22186Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("gizmos", c2362c0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : c2362c0.f26510a) {
                    if (!AbstractC3557B.K(((C2334C) obj).f26438a, c2334c.f26438a)) {
                        arrayList.add(obj);
                    }
                }
                return C2362c0.a(c2362c0, kf.t.F2(kf.t.x2(c2334c2, arrayList), new C0588q(11)), null, 2);
            default:
                AbstractC3557B.c0("gizmos", c2362c0);
                return new C2362c0(kf.t.t2(c2362c0.f26510a, c2334c2), kf.t.x2(c2334c, kf.t.t2(c2362c0.f26511b, c2334c2)));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f22185Y) {
            case 0:
                return a((C2362c0) obj);
            default:
                return a((C2362c0) obj);
        }
    }
}
