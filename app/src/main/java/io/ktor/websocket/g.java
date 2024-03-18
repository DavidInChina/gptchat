package io.ktor.websocket;

import com.google.android.gms.internal.play_billing.N;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f33636Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33637Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f33638h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33638h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f33638h0, abstractC4825e);
        gVar.f33637Z = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33636Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            IOException iOException = new IOException("Ping timeout");
            this.f33636Y = 1;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j.f33648o0;
            if (this.f33638h0.d((b) this.f33637Z, iOException, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
