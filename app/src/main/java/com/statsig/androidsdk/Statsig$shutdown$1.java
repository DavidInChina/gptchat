package com.statsig.androidsdk;

import Ad.l;
import Ng.F;
import Ng.Q;
import Og.d;
import Sg.u;
import Tg.e;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.Statsig$shutdown$1", f = "Statsig.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Statsig$shutdown$1 extends AbstractC5163j implements n {
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
    @AbstractC5158e(c = "com.statsig.androidsdk.Statsig$shutdown$1$1", f = "Statsig.kt", l = {318}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.Statsig$shutdown$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends AbstractC5163j implements n {
        int label;

        public AnonymousClass1(AbstractC4825e abstractC4825e) {
            super(2, abstractC4825e);
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
            return new AnonymousClass1(abstractC4825e);
        }

        public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
            return ((AnonymousClass1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
        }

        @Override // pf.AbstractC5154a
        public final Object invokeSuspend(Object obj) {
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                Statsig statsig = Statsig.INSTANCE;
                this.label = 1;
                if (statsig.shutdownSuspend(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            return y.f36177a;
        }
    }

    public Statsig$shutdown$1(AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Statsig$shutdown$1(abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((Statsig$shutdown$1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            e eVar = Q.f12904a;
            d dVar = ((d) u.f16684a).f13759j0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (l.n1(this, dVar, anonymousClass1) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
