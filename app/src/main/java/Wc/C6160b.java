package wc;

import A.AbstractC0044t0;
import Vc.m;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wf.n;
import xe.C6396A;

/* renamed from: wc.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6160b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f48299Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f48300Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, wc.b, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f48300Z = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6160b) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f48299Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d B10 = E9.f.B("me");
            B10.f46130f.e(m.f18554b, y.f36177a);
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49811b, B10, (ge.d) this.f48300Z);
            this.f48299Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
