package hd;

import Ng.Q;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.G;
import com.openai.experiment.t;
import jf.y;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* renamed from: hd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3409c implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final t f32245a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4816e f32246b;

    public C3409c(t tVar, AbstractC4816e abstractC4816e) {
        this.f32245a = tVar;
        this.f32246b = abstractC4816e;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pf.j, wf.n] */
    /* JADX WARN: Type inference failed for: r2v3, types: [pf.j, wf.n] */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C3407a c3407a;
        EnumC5000a enumC5000a;
        int i10;
        C3409c c3409c;
        C5426p c5426p;
        ?? abstractC5163j;
        if (abstractC4825e instanceof C3407a) {
            c3407a = (C3407a) abstractC4825e;
            int i11 = c3407a.f32243i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3407a.f32243i0 = i11 - Integer.MIN_VALUE;
                Object obj = c3407a.f32241Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c3407a.f32243i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3409c = c3407a.f32240Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c3407a.f32240Y = this;
                    c3407a.f32243i0 = 1;
                    Object n02 = L4.a.n0(((G) this.f32245a).f27676e, new AbstractC5163j(2, null), c3407a);
                    if (n02 != enumC5000a) {
                        n02 = yVar;
                    }
                    if (n02 == enumC5000a) {
                        return enumC5000a;
                    }
                    c3409c = this;
                }
                t tVar = c3409c.f32245a;
                Object obj2 = new Object();
                G g10 = (G) tVar;
                g10.getClass();
                g10.f27674c.add(obj2);
                c5426p = ((xc.e) c3409c.f32246b).f49801b;
                abstractC5163j = new AbstractC5163j(2, null);
                c3407a.f32240Y = null;
                c3407a.f32243i0 = 2;
                if (L4.a.b0(c5426p, abstractC5163j, c3407a) != enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            }
        }
        c3407a = new C3407a(this, abstractC4825e);
        Object obj3 = c3407a.f32241Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c3407a.f32243i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        t tVar2 = c3409c.f32245a;
        Object obj22 = new Object();
        G g102 = (G) tVar2;
        g102.getClass();
        g102.f27674c.add(obj22);
        c5426p = ((xc.e) c3409c.f32246b).f49801b;
        abstractC5163j = new AbstractC5163j(2, null);
        c3407a.f32240Y = null;
        c3407a.f32243i0 = 2;
        if (L4.a.b0(c5426p, abstractC5163j, c3407a) != enumC5000a) {
        }
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
