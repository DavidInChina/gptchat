package io.ktor.websocket;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f33680Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Pg.o f33681Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Pg.o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33681Z = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new u(this.f33681Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((u) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33680Y;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        do {
            this.f33680Y = 1;
        } while (this.f33681Z.g(this) != enumC5000a);
        return enumC5000a;
    }
}
