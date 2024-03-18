package io.ktor.websocket;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Throwable f33639Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33640Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f33641h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33641h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new h(this.f33641h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33640Z;
        jf.y yVar = jf.y.f36177a;
        j jVar = this.f33641h0;
        try {
            try {
            } catch (Pg.v unused) {
                jVar.f33655i0.k(null);
                this.f33640Z = 4;
                if (AbstractC4344b.W(jVar.f33652Y, this) == enumC5000a) {
                    return enumC5000a;
                }
            } catch (Pg.w unused2) {
                jVar.f33655i0.k(null);
                this.f33640Z = 3;
                if (AbstractC4344b.W(jVar.f33652Y, this) == enumC5000a) {
                    return enumC5000a;
                }
            } catch (CancellationException unused3) {
                b bVar = new b(EnumC3606a.NORMAL, "");
                this.f33640Z = 5;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j.f33648o0;
                if (jVar.d(bVar, null, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            switch (i10) {
                case 0:
                    N.B0(obj);
                    this.f33640Z = 1;
                    if (j.b(jVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    jVar.f33655i0.k(null);
                    this.f33640Z = 2;
                    if (AbstractC4344b.W(jVar.f33652Y, this) != enumC5000a) {
                        return enumC5000a;
                    }
                    return yVar;
                case 1:
                    N.B0(obj);
                    jVar.f33655i0.k(null);
                    this.f33640Z = 2;
                    if (AbstractC4344b.W(jVar.f33652Y, this) != enumC5000a) {
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 9:
                    N.B0(obj);
                    return yVar;
                case 5:
                    N.B0(obj);
                    jVar.f33655i0.k(null);
                    this.f33640Z = 6;
                    if (AbstractC4344b.W(jVar.f33652Y, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    break;
                case 8:
                    N.B0(obj);
                    jVar.f33655i0.k(null);
                    this.f33640Z = 9;
                    if (AbstractC4344b.W(jVar.f33652Y, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    break;
                case 10:
                    Throwable th2 = this.f33639Y;
                    N.B0(obj);
                    throw th2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            jVar.f33655i0.k(null);
            this.f33639Y = th3;
            this.f33640Z = 10;
            if (AbstractC4344b.W(jVar.f33652Y, this) == enumC5000a) {
                return enumC5000a;
            }
            throw th3;
        }
    }
}
