package M1;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11457Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11458Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J f11459h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(J j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11459h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        s sVar = new s(this.f11459h0, abstractC4825e);
        sVar.f11458Z = obj;
        return sVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((p) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r7 == r0) goto L26;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11457Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            p pVar = (p) this.f11458Z;
            boolean z10 = pVar instanceof n;
            J j6 = this.f11459h0;
            if (z10) {
                n nVar = (n) pVar;
                this.f11457Y = 1;
                K k10 = (K) j6.f11423g.getValue();
                if (!(k10 instanceof C0922c)) {
                    if (k10 instanceof C0930k) {
                        if (k10 == nVar.f11450a) {
                            obj2 = j6.g(this);
                        }
                    } else if (AbstractC3557B.K(k10, L.f11426a)) {
                        obj2 = j6.g(this);
                    } else if (k10 instanceof C0929j) {
                        throw new IllegalStateException("Can't read in final state.".toString());
                    }
                }
                obj2 = yVar;
                if (obj2 == enumC5000a) {
                    return enumC5000a;
                }
            } else if (pVar instanceof o) {
                this.f11457Y = 2;
                if (J.c(j6, (o) pVar, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return yVar;
    }
}
