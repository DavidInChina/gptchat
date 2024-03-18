package e7;

import f7.C2943f;
import g7.AbstractC3205b;
import j7.AbstractC3923m;
import j7.C3919i;
import j7.C3922l;
import java.util.concurrent.Executor;
import k7.C4200a;
import l7.AbstractC4342c;
import m7.AbstractC4565a;

/* loaded from: classes2.dex */
public final class r implements AbstractC3205b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29025a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f29026b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f29027c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f29028d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f29029e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f29030f;

    public /* synthetic */ r(p000if.a aVar, p000if.a aVar2, AbstractC3205b abstractC3205b, p000if.a aVar3, p000if.a aVar4, int i10) {
        this.f29025a = i10;
        this.f29026b = aVar;
        this.f29027c = aVar2;
        this.f29028d = abstractC3205b;
        this.f29029e = aVar3;
        this.f29030f = aVar4;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29025a;
        p000if.a aVar = this.f29030f;
        p000if.a aVar2 = this.f29029e;
        p000if.a aVar3 = this.f29028d;
        p000if.a aVar4 = this.f29027c;
        p000if.a aVar5 = this.f29026b;
        switch (i10) {
            case 0:
                return new q((AbstractC4565a) aVar5.get(), (AbstractC4565a) aVar4.get(), (i7.c) aVar3.get(), (C3919i) aVar2.get(), (C3922l) aVar.get());
            case 1:
                return new i7.b((Executor) aVar5.get(), (C2943f) aVar4.get(), (AbstractC3923m) aVar3.get(), (k7.d) aVar2.get(), (AbstractC4342c) aVar.get());
            default:
                return new k7.k((AbstractC4565a) aVar5.get(), (AbstractC4565a) aVar4.get(), (C4200a) aVar3.get(), (k7.n) aVar2.get(), this.f29030f);
        }
    }
}
