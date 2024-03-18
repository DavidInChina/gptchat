package f9;

import Z8.n1;
import Z8.p1;
import a4.AbstractC1930a;
import android.app.Application;
import ce.AbstractC2397c;
import h9.C3337b;
import h9.C3345j;
import h9.C3347l;
import id.AbstractC3557B;
import j9.C3927c;
import l9.C4355c;
import ld.C4428a;
import ld.C4431d;
import livekit.org.webrtc.EglBase;
import nd.AbstractC4816e;
import rd.C5477a;
import sd.C5615d;

/* renamed from: f9.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2957i implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29790a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f29791b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f29792c;

    public /* synthetic */ C2957i(p000if.a aVar, p000if.a aVar2, int i10) {
        this.f29790a = i10;
        this.f29791b = aVar;
        this.f29792c = aVar2;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29790a;
        p000if.a aVar = this.f29792c;
        p000if.a aVar2 = this.f29791b;
        switch (i10) {
            case 0:
                C4428a c4428a = (C4428a) aVar2.get();
                u uVar = (u) aVar.get();
                AbstractC3557B.c0("parentScope", c4428a);
                AbstractC3557B.c0("screenComponentFactory", uVar);
                return new AbstractC2948D(new C2955g(c4428a, uVar, 0));
            case 1:
                ld.i iVar = (ld.i) aVar2.get();
                AbstractC1930a abstractC1930a = (AbstractC1930a) aVar.get();
                AbstractC3557B.c0("parentScope", iVar);
                AbstractC3557B.c0("screenComponentFactory", abstractC1930a);
                return new AbstractC2948D(new C2955g(iVar, abstractC1930a, 2));
            case 2:
                ld.j jVar = (ld.j) aVar2.get();
                z zVar = (z) aVar.get();
                AbstractC3557B.c0("parentScope", jVar);
                AbstractC3557B.c0("screenComponentFactory", zVar);
                return new AbstractC2948D(new C2955g(jVar, zVar, 1));
            case 3:
                return new C3337b((C4428a) aVar2.get(), (AbstractC4816e) aVar.get());
            case 4:
                return new C3345j((com.openai.experiment.t) aVar2.get(), (n1) aVar.get());
            case 5:
                return new C3347l((com.openai.experiment.t) aVar2.get(), (p1) aVar.get());
            case 6:
                return new C3927c((C4355c) aVar2.get(), (j9.e) aVar.get());
            case 7:
                return new C5615d((C5477a) aVar2.get(), (C4431d) aVar.get());
            case 8:
                return new Dd.B((Yc.a) aVar2.get(), (Vc.y) aVar.get());
            case 9:
                return new Kd.p((Application) aVar2.get(), (C4431d) aVar.get());
            default:
                EglBase eglBase = (EglBase) aVar2.get();
                Ue.a aVar3 = (Ue.a) aVar.get();
                AbstractC3557B.c0("memoryManager", aVar3);
                if (eglBase == null) {
                    EglBase b10 = livekit.org.webrtc.e.b();
                    aVar3.a(new Re.a(2, b10));
                    AbstractC3557B.b0("create()\n            .ap\u2026rClosable { release() } }", b10);
                    return b10;
                }
                return eglBase;
        }
    }
}
