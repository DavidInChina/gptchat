package F9;

import Jc.AbstractC0810d;
import Uc.C1423h;
import Vc.q;
import Vc.r;
import androidx.lifecycle.P;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import id.w;
import id.x;
import java.util.concurrent.CancellationException;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rc.C5476z;
import wd.p0;
import wd.q0;
import wd.s0;
import wd.u0;
import wd.v0;

/* loaded from: classes2.dex */
public final class m extends Ad.g {

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC0810d f5102j;

    /* renamed from: k  reason: collision with root package name */
    public final Ic.a f5103k;

    /* renamed from: l  reason: collision with root package name */
    public final xd.f f5104l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(P p10, AbstractC0810d abstractC0810d, Ic.a aVar, xd.f fVar) {
        super(new i(Fe.c.a(r1), null, null));
        C1423h c1423h = C1423h.f17677i;
        String str = (String) p10.b("title");
        if (str != null) {
            this.f5102j = abstractC0810d;
            this.f5103k = aVar;
            this.f5104l = fVar;
            h(new j(p10, this, null));
            return;
        }
        throw new IllegalStateException("No title provided".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(m mVar, String str, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        mVar.getClass();
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f5097j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f5097j0 = i11 - Integer.MIN_VALUE;
                Object obj5 = kVar.f5095h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f5097j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            str2 = kVar.f5094Z;
                            N.B0(obj5);
                            obj = (v0) obj5;
                            w wVar = x.Companion;
                            if (!(obj instanceof u0)) {
                                try {
                                    wVar.getClass();
                                    obj = new u0(w.a((String) ((u0) obj).f48468a));
                                } catch (Exception e10) {
                                    obj = new s0(2, e10);
                                }
                            } else if (!(obj instanceof p0) && !(obj instanceof q0)) {
                                throw new RuntimeException();
                            }
                            obj2 = obj;
                            if (!(obj2 instanceof u0)) {
                                return new u0(new o((x) ((u0) obj2).f48468a, str2));
                            }
                            AbstractC3557B.a0("null cannot be cast to non-null type com.openai.types.Result<R of com.openai.feature.conversationcsvattachment.impl.ConversationCsvAttachmentViewModel.unwrapOrReturnResult$lambda$5>", obj2);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = kVar.f5093Y;
                    N.B0(obj5);
                } else {
                    N.B0(obj5);
                    kVar.f5093Y = mVar;
                    kVar.f5097j0 = 1;
                    obj5 = ((Ta.l) mVar.f5102j).a(str, kVar);
                    if (obj5 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                obj3 = (Vc.x) obj5;
                if (!(obj3 instanceof Vc.w)) {
                    String str3 = ((Jc.g) ((Vc.w) obj3).f18565a).f9050b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    obj3 = new Vc.w(str3);
                } else if (!(obj3 instanceof q) && !(obj3 instanceof r)) {
                    throw new RuntimeException();
                }
                if (!(obj3 instanceof Vc.w)) {
                    obj4 = new u0(((Vc.w) obj3).f18565a);
                } else if (obj3 instanceof q) {
                    obj4 = p0.f48449a;
                } else if (obj3 instanceof r) {
                    obj3.getClass();
                    obj4 = Vc.x.a((r) obj3);
                } else {
                    throw new RuntimeException();
                }
                if (!(obj4 instanceof u0)) {
                    String str4 = (String) ((u0) obj4).f48468a;
                    Ic.a aVar = mVar.f5103k;
                    kVar.f5093Y = mVar;
                    kVar.f5094Z = str4;
                    kVar.f5097j0 = 2;
                    obj5 = ((Ua.c) aVar).a(str4, kVar);
                    if (obj5 != enumC5000a) {
                        str2 = str4;
                        obj = (v0) obj5;
                        w wVar2 = x.Companion;
                        if (!(obj instanceof u0)) {
                        }
                        obj2 = obj;
                        if (!(obj2 instanceof u0)) {
                        }
                    } else {
                        return enumC5000a;
                    }
                } else {
                    return obj4;
                }
            }
        }
        kVar = new k(mVar, abstractC4825e);
        Object obj52 = kVar.f5095h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f5097j0;
        if (i10 == 0) {
        }
        obj3 = (Vc.x) obj52;
        if (!(obj3 instanceof Vc.w)) {
        }
        if (!(obj3 instanceof Vc.w)) {
        }
        if (!(obj4 instanceof u0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(m mVar, q0 q0Var, AbstractC4825e abstractC4825e) {
        l lVar;
        int i10;
        mVar.getClass();
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i11 = lVar.f5101i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f5101i0 = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f5099Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = lVar.f5101i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        mVar = lVar.f5098Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (!(q0Var.f48450a instanceof CancellationException)) {
                        lVar.f5098Y = mVar;
                        lVar.f5101i0 = 1;
                        if (((C5476z) mVar.f5104l).a(q0Var, lVar) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                }
                mVar.g(Ad.o.f825a);
                return y.f36177a;
            }
        }
        lVar = new l(mVar, abstractC4825e);
        Object obj2 = lVar.f5099Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = lVar.f5101i0;
        if (i10 == 0) {
        }
        mVar.g(Ad.o.f825a);
        return y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2469q0.p(iVar);
        AbstractC3557B.c0("intent", null);
    }
}
