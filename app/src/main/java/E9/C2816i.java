package e9;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import g9.C3220k;
import h9.C3343h;
import j9.C3927c;
import l9.C4355c;
import ld.C4428a;
import nd.AbstractC4816e;
import p9.s;
import pd.t;
import qd.AbstractC5304a;
import wd.EnumC6206t;

/* renamed from: e9.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2816i implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29066a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f29067b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f29068c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f29069d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f29070e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f29071f;

    /* renamed from: g  reason: collision with root package name */
    public final p000if.a f29072g;

    public /* synthetic */ C2816i(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5, AbstractC2400f abstractC2400f6, int i10) {
        this.f29066a = i10;
        this.f29067b = abstractC2400f;
        this.f29068c = abstractC2400f2;
        this.f29069d = abstractC2400f3;
        this.f29070e = abstractC2400f4;
        this.f29071f = abstractC2400f5;
        this.f29072g = abstractC2400f6;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29066a;
        p000if.a aVar = this.f29072g;
        p000if.a aVar2 = this.f29071f;
        p000if.a aVar3 = this.f29070e;
        p000if.a aVar4 = this.f29069d;
        p000if.a aVar5 = this.f29068c;
        p000if.a aVar6 = this.f29067b;
        switch (i10) {
            case 0:
                return new C2815h((Application) aVar6.get(), (s) aVar5.get(), (AbstractC5304a) aVar4.get(), (t) aVar3.get(), (EnumC6206t) aVar2.get(), (C3220k) aVar.get());
            default:
                return new C3343h((C4428a) aVar6.get(), (com.openai.experiment.t) aVar5.get(), (AbstractC4816e) aVar4.get(), (C4355c) aVar3.get(), (C3927c) aVar2.get(), (Lc.e) aVar.get());
        }
    }
}
