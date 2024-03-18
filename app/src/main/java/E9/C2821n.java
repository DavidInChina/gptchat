package e9;

import Dd.C0389j;
import Dd.W;
import android.app.Application;
import android.os.Build;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import f9.C2954f;
import f9.C2960l;
import h9.C3341f;
import id.AbstractC3557B;
import ld.C4428a;
import ld.p;
import ld.q;
import nd.AbstractC4813b;
import nd.AbstractC4816e;
import nd.C4812a;
import rd.C5477a;
import sd.C5613b;
import sd.C5618g;
import yc.C6578d;

/* renamed from: e9.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2821n implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29092a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f29093b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f29094c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f29095d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f29096e;

    public /* synthetic */ C2821n(p000if.a aVar, p000if.a aVar2, p000if.a aVar3, AbstractC2400f abstractC2400f, int i10) {
        this.f29092a = i10;
        this.f29093b = aVar;
        this.f29094c = aVar2;
        this.f29095d = aVar3;
        this.f29096e = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29092a;
        p000if.a aVar = this.f29096e;
        p000if.a aVar2 = this.f29095d;
        p000if.a aVar3 = this.f29094c;
        p000if.a aVar4 = this.f29093b;
        switch (i10) {
            case 0:
                return new C2820m((Application) aVar4.get(), (t) aVar3.get(), (AbstractC4816e) aVar2.get(), (Va.e) aVar.get());
            case 1:
                return new C2954f((AbstractC4813b) aVar4.get(), (p) aVar3.get(), (q) aVar2.get(), (C2960l) aVar.get());
            case 2:
                return new C3341f((C4428a) aVar4.get(), (AbstractC4816e) aVar3.get(), (C6578d) aVar2.get(), (C4812a) aVar.get());
            case 3:
                return new C5613b((C5477a) aVar4.get(), (C4428a) aVar3.get(), (C4812a) aVar2.get(), (q) aVar.get());
            case 4:
                return new C5618g((C5477a) aVar4.get(), (ld.j) aVar3.get(), (nd.k) aVar2.get(), (ld.k) aVar.get());
            case 5:
                return new sd.j((C5477a) aVar4.get(), (p) aVar3.get(), (nd.h) aVar2.get(), (q) aVar.get());
            case 6:
                return new W((C0389j) aVar4.get(), (Lc.e) aVar3.get(), (xd.g) aVar2.get(), (C4428a) aVar.get());
            default:
                boolean booleanValue = ((Boolean) aVar4.get()).booleanValue();
                Pe.b bVar = (Pe.b) aVar3.get();
                Ue.a aVar5 = (Ue.a) aVar2.get();
                AbstractC3557B.c0("audioType", bVar);
                AbstractC3557B.c0("closeableManager", aVar5);
                AbstractC3557B.c0("commWorkaroundImplProvider", aVar);
                if (!booleanValue && Build.VERSION.SDK_INT >= 30 && bVar.f13951a == 3) {
                    Object obj = aVar.get();
                    aVar5.a(new Re.a(0, (Qe.m) obj));
                    AbstractC3557B.b0("{\n            commWorkar\u2026}\n            }\n        }", obj);
                    return (Qe.h) obj;
                }
                return new Object();
        }
    }
}
