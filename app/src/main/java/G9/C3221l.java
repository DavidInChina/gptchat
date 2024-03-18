package g9;

import Ng.B;
import Ve.E0;
import Wh.I;
import Wh.w;
import Yc.t;
import b9.AbstractC2133b;
import bf.C2192a;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import eh.AbstractC2904d;
import f9.v;
import f9.x;
import ld.C4431d;

/* renamed from: g9.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3221l implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31340a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f31341b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f31342c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f31343d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f31344e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f31345f;

    public /* synthetic */ C3221l(p000if.a aVar, p000if.a aVar2, p000if.a aVar3, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, int i10) {
        this.f31340a = i10;
        this.f31341b = aVar;
        this.f31342c = aVar2;
        this.f31343d = aVar3;
        this.f31344e = abstractC2400f;
        this.f31345f = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f31340a;
        p000if.a aVar = this.f31345f;
        p000if.a aVar2 = this.f31344e;
        p000if.a aVar3 = this.f31343d;
        p000if.a aVar4 = this.f31342c;
        p000if.a aVar5 = this.f31341b;
        switch (i10) {
            case 0:
                return new C3220k((AbstractC2133b) aVar5.get(), (v) aVar4.get(), (x) aVar3.get(), (t) aVar2.get(), (C4431d) aVar.get());
            default:
                return new E0((I) aVar5.get(), (AbstractC2904d) aVar4.get(), (w) aVar3.get(), (B) aVar2.get(), (C2192a) aVar.get());
        }
    }
}
