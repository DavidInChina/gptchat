package j7;

import android.content.Context;
import e7.n;
import f7.C2943f;
import g7.AbstractC3205b;
import java.util.concurrent.Executor;
import k7.AbstractC4202c;
import l7.AbstractC4342c;
import m7.AbstractC4565a;
import m7.AbstractC4566b;

/* renamed from: j7.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3920j implements AbstractC3205b {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f36064a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f36065b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f36066c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f36067d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f36068e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f36069f;

    /* renamed from: g  reason: collision with root package name */
    public final p000if.a f36070g;

    /* renamed from: h  reason: collision with root package name */
    public final p000if.a f36071h;

    /* renamed from: i  reason: collision with root package name */
    public final p000if.a f36072i;

    public C3920j(p000if.a aVar, p000if.a aVar2, p000if.a aVar3, i7.e eVar, p000if.a aVar4, p000if.a aVar5, p000if.a aVar6) {
        n nVar = AbstractC4566b.f38963a;
        n nVar2 = AbstractC4566b.f38964b;
        this.f36064a = aVar;
        this.f36065b = aVar2;
        this.f36066c = aVar3;
        this.f36067d = eVar;
        this.f36068e = aVar4;
        this.f36069f = aVar5;
        this.f36070g = nVar;
        this.f36071h = nVar2;
        this.f36072i = aVar6;
    }

    @Override // p000if.a
    public final Object get() {
        return new C3919i((Context) this.f36064a.get(), (C2943f) this.f36065b.get(), (k7.d) this.f36066c.get(), (AbstractC3923m) this.f36067d.get(), (Executor) this.f36068e.get(), (AbstractC4342c) this.f36069f.get(), (AbstractC4565a) this.f36070g.get(), (AbstractC4565a) this.f36071h.get(), (AbstractC4202c) this.f36072i.get());
    }
}
