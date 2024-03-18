package f7;

import android.content.Context;
import e7.n;
import g7.AbstractC3205b;
import m7.AbstractC4565a;

/* renamed from: f7.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2942e implements AbstractC3205b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29652a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f29653b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f29654c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f29655d;

    public /* synthetic */ C2942e(p000if.a aVar, n nVar, n nVar2, int i10) {
        this.f29652a = i10;
        this.f29653b = aVar;
        this.f29654c = nVar;
        this.f29655d = nVar2;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29652a;
        p000if.a aVar = this.f29655d;
        p000if.a aVar2 = this.f29654c;
        p000if.a aVar3 = this.f29653b;
        switch (i10) {
            case 0:
                return new C2941d((Context) aVar3.get(), (AbstractC4565a) aVar2.get(), (AbstractC4565a) aVar.get());
            default:
                return new k7.n(((Integer) aVar.get()).intValue(), (Context) aVar3.get(), (String) aVar2.get());
        }
    }
}
