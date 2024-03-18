package oa;

import Qg.AbstractC1207j;
import ca.C2311c;
import ca.EnumC2320l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import nf.AbstractC4825e;
import o9.C4957e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class p extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41149Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public int f41150Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41151h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f41152i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41153j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AbstractC4825e abstractC4825e, C4972C c4972c) {
        super(3, abstractC4825e);
        this.f41153j0 = c4972c;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f41149Y;
        C4972C c4972c = this.f41153j0;
        switch (i10) {
            case 0:
                p pVar = new p((AbstractC4825e) obj3, c4972c);
                pVar.f41151h0 = (AbstractC1207j) obj;
                pVar.f41152i0 = obj2;
                return pVar.invokeSuspend(yVar);
            default:
                p pVar2 = new p(c4972c, (AbstractC4825e) obj3);
                pVar2.f41151h0 = (T9.k) obj;
                pVar2.f41152i0 = (C2311c) obj2;
                return pVar2.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        T9.k kVar;
        boolean z10;
        String str3;
        List list;
        String str4;
        int i10 = this.f41149Y;
        C4972C c4972c = this.f41153j0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f41150Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str5 = ((C6168C) this.f41152i0).f48321a;
                    xa.f fVar = (xa.f) c4972c.f41047b;
                    fVar.getClass();
                    AbstractC3557B.c0("conversationId", str5);
                    C4957e e10 = ((Ia.l) fVar.f49715b).e(str5);
                    this.f41150Z = 1;
                    if (L4.a.j0(this, e10, (AbstractC1207j) this.f41151h0) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return jf.y.f36177a;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                if (this.f41150Z == 0) {
                    N.B0(obj);
                    T9.k kVar2 = (T9.k) this.f41151h0;
                    C2311c c2311c = (C2311c) this.f41152i0;
                    if (c2311c != null) {
                        str = c2311c.f26375b;
                    } else {
                        str = null;
                    }
                    if (c2311c != null) {
                        Qa.h b10 = c2311c.b();
                        Qa.h g10 = c2311c.f26387n.g(b10);
                        if (g10 != null) {
                            b10 = g10;
                        }
                        if (b10 != null) {
                            str2 = ((C6182c0) b10.f14554a).f48393Y;
                            if (c2311c != null && (kVar2 instanceof T9.i)) {
                                if (c2311c.f26385l != EnumC2320l.f26400h0) {
                                    kVar = T9.h.f16975a;
                                    z10 = false;
                                    if (c2311c != null && c2311c.f26386m) {
                                        z10 = true;
                                    }
                                    if (c2311c != null) {
                                        str3 = c2311c.f26379f;
                                    } else {
                                        str3 = null;
                                    }
                                    if (c2311c != null) {
                                        list = T9.b.c(c2311c, c4972c.f41054i, kVar2);
                                    } else {
                                        list = null;
                                    }
                                    if (list == null) {
                                        list = kf.v.f37483Y;
                                    }
                                    List list2 = list;
                                    if (c2311c != null) {
                                        str4 = c2311c.f26382i;
                                    } else {
                                        str4 = null;
                                    }
                                    return new T9.c(str, str2, kVar, z10, str3, list2, str4);
                                }
                            }
                            kVar = kVar2;
                            z10 = false;
                            if (c2311c != null) {
                                z10 = true;
                            }
                            if (c2311c != null) {
                            }
                            if (c2311c != null) {
                            }
                            if (list == null) {
                            }
                            List list22 = list;
                            if (c2311c != null) {
                            }
                            return new T9.c(str, str2, kVar, z10, str3, list22, str4);
                        }
                    }
                    str2 = T9.b.f16964a;
                    if (c2311c != null) {
                        if (c2311c.f26385l != EnumC2320l.f26400h0) {
                        }
                    }
                    kVar = kVar2;
                    z10 = false;
                    if (c2311c != null) {
                    }
                    if (c2311c != null) {
                    }
                    if (c2311c != null) {
                    }
                    if (list == null) {
                    }
                    List list222 = list;
                    if (c2311c != null) {
                    }
                    return new T9.c(str, str2, kVar, z10, str3, list222, str4);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f41153j0 = c4972c;
    }
}
