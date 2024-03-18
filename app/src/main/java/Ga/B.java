package Ga;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6180Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6181Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E f6182h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f6183i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6184j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e10, AbstractC1207j abstractC1207j, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6182h0 = e10;
        this.f6183i0 = abstractC1207j;
        this.f6184j0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        B b10 = new B(this.f6182h0, this.f6183i0, this.f6184j0, abstractC4825e);
        b10.f6181Z = obj;
        return b10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((AbstractC6034c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0058 -> B:24:0x005a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:24:0x005a). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        io.ktor.utils.io.x xVar;
        io.ktor.utils.io.x xVar2;
        String str;
        io.ktor.utils.io.t tVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6180Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        xVar = (io.ktor.utils.io.x) this.f6181Z;
                        N.B0(obj);
                        xVar2 = xVar;
                        tVar = (io.ktor.utils.io.t) xVar2;
                        if (tVar.r()) {
                            this.f6181Z = tVar;
                            this.f6180Y = 2;
                            Object H6 = io.ktor.utils.io.t.H(tVar, Integer.MAX_VALUE, this);
                            if (H6 == enumC5000a) {
                                return enumC5000a;
                            }
                            xVar = tVar;
                            obj = H6;
                            str = (String) obj;
                            if (str != null) {
                                this.f6181Z = xVar;
                                this.f6180Y = 3;
                                if (E.a(this.f6182h0, this.f6183i0, str, this.f6184j0, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            xVar2 = xVar;
                            tVar = (io.ktor.utils.io.t) xVar2;
                            if (tVar.r()) {
                                return jf.y.f36177a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    xVar = (io.ktor.utils.io.x) this.f6181Z;
                    N.B0(obj);
                    str = (String) obj;
                    if (str != null) {
                    }
                    xVar2 = xVar;
                    tVar = (io.ktor.utils.io.t) xVar2;
                    if (tVar.r()) {
                    }
                }
            } else {
                N.B0(obj);
            }
        } else {
            N.B0(obj);
            this.f6180Y = 1;
            obj = AbstractC3557B.T((AbstractC6034c) this.f6181Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        xVar2 = (io.ktor.utils.io.x) obj;
        tVar = (io.ktor.utils.io.t) xVar2;
        if (tVar.r()) {
        }
    }
}
