package i7;

import android.content.Context;
import g7.AbstractC3205b;
import j7.AbstractC3923m;
import j7.C3912b;
import j7.C3914d;
import j7.C3922l;
import java.util.concurrent.Executor;
import l7.AbstractC4342c;
import m7.AbstractC4565a;

/* loaded from: classes.dex */
public final class e implements AbstractC3205b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32747a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32748b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f32749c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f32750d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f32751e;

    public /* synthetic */ e(p000if.a aVar, p000if.a aVar2, AbstractC3205b abstractC3205b, p000if.a aVar3, int i10) {
        this.f32747a = i10;
        this.f32748b = aVar;
        this.f32749c = aVar2;
        this.f32750d = abstractC3205b;
        this.f32751e = aVar3;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f32747a;
        p000if.a aVar = this.f32751e;
        p000if.a aVar2 = this.f32750d;
        p000if.a aVar3 = this.f32749c;
        p000if.a aVar4 = this.f32748b;
        switch (i10) {
            case 0:
                AbstractC4565a abstractC4565a = (AbstractC4565a) aVar.get();
                return new C3914d((Context) aVar4.get(), (k7.d) aVar3.get(), (C3912b) aVar2.get());
            default:
                return new C3922l((Executor) aVar4.get(), (k7.d) aVar3.get(), (AbstractC3923m) aVar2.get(), (AbstractC4342c) aVar.get());
        }
    }
}
