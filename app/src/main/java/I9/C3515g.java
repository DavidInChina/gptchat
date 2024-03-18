package i9;

import Ng.B;
import Ve.AbstractC1492d;
import Ve.C1503i0;
import Ve.E0;
import android.app.Application;
import android.media.AudioAttributes;
import ce.AbstractC2397c;
import dd.AbstractC2625a;
import id.AbstractC3557B;
import java.util.Set;
import l9.C4355c;
import ld.C4431d;
import wd.EnumC6206t;

/* renamed from: i9.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3515g implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32893a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32894b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f32895c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f32896d;

    public /* synthetic */ C3515g(p000if.a aVar, p000if.a aVar2, p000if.a aVar3, int i10) {
        this.f32893a = i10;
        this.f32894b = aVar;
        this.f32895c = aVar2;
        this.f32896d = aVar3;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f32893a;
        p000if.a aVar = this.f32896d;
        p000if.a aVar2 = this.f32895c;
        p000if.a aVar3 = this.f32894b;
        switch (i10) {
            case 0:
                return new C3514f((C4431d) aVar3.get(), (Set) aVar2.get(), (AbstractC2625a) aVar.get());
            case 1:
                return new C4355c((EnumC6206t) aVar3.get(), (Application) aVar2.get(), (Lc.e) aVar.get());
            case 2:
                Qe.a aVar4 = (Qe.a) aVar2.get();
                Pe.b bVar = (Pe.b) aVar.get();
                AbstractC3557B.c0("audioSwitchHandler", aVar3);
                AbstractC3557B.c0("audioOutputType", bVar);
                if (aVar4 == null) {
                    Object obj = aVar3.get();
                    Qe.g gVar = (Qe.g) obj;
                    gVar.f14691e = bVar.f13951a;
                    AudioAttributes audioAttributes = bVar.f13952b;
                    gVar.f14695i = audioAttributes.getContentType();
                    gVar.f14694h = audioAttributes.getUsage();
                    gVar.f14693g = 0;
                    AbstractC3557B.b0("audioSwitchHandler.get()\u2026audioStreamType\n        }", obj);
                    return (Qe.a) obj;
                }
                return aVar4;
            default:
                return new C1503i0((E0) aVar3.get(), (AbstractC1492d) aVar2.get(), (B) aVar.get());
        }
    }
}
