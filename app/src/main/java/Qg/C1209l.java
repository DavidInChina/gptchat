package Qg;

import java.util.Iterator;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: Qg.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1209l implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14870Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f14871Z;

    public /* synthetic */ C1209l(int i10, Object obj) {
        this.f14870Y = i10;
        this.f14871Z = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        C1208k c1208k;
        int i10;
        AbstractC1207j abstractC1207j2;
        Iterator it;
        C1190a c1190a;
        int i11;
        Throwable th2;
        Rg.C c10;
        jf.y yVar = jf.y.f36177a;
        int i12 = this.f14870Y;
        Object obj = this.f14871Z;
        switch (i12) {
            case 0:
                if (abstractC4825e instanceof C1208k) {
                    c1208k = (C1208k) abstractC4825e;
                    int i13 = c1208k.f14866Z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1208k.f14866Z = i13 - Integer.MIN_VALUE;
                        Object obj2 = c1208k.f14865Y;
                        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                        i10 = c1208k.f14866Z;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                it = c1208k.f14869j0;
                                AbstractC1207j abstractC1207j3 = c1208k.f14868i0;
                                com.google.android.gms.internal.play_billing.N.B0(obj2);
                                abstractC1207j2 = abstractC1207j3;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            abstractC1207j2 = abstractC1207j;
                            it = ((Iterable) obj).iterator();
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            c1208k.f14868i0 = abstractC1207j2;
                            c1208k.f14869j0 = it;
                            c1208k.f14866Z = 1;
                            if (abstractC1207j2.c(next, c1208k) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        return yVar;
                    }
                }
                c1208k = new C1208k(this, abstractC4825e);
                Object obj22 = c1208k.f14865Y;
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                i10 = c1208k.f14866Z;
                if (i10 == 0) {
                }
                while (it.hasNext()) {
                }
                return yVar;
            case 1:
                Object c11 = abstractC1207j.c(obj, abstractC4825e);
                if (c11 == EnumC5000a.f41328Y) {
                    return c11;
                }
                return yVar;
            case 2:
                if (abstractC4825e instanceof C1190a) {
                    c1190a = (C1190a) abstractC4825e;
                    int i14 = c1190a.f14812i0;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1190a.f14812i0 = i14 - Integer.MIN_VALUE;
                        Object obj3 = c1190a.f14810Z;
                        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                        i11 = c1190a.f14812i0;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                c10 = c1190a.f14809Y;
                                try {
                                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    c10.releaseIntercepted();
                                    throw th2;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            Rg.C c12 = new Rg.C(abstractC1207j, c1190a.getContext());
                            try {
                                c1190a.f14809Y = c12;
                                c1190a.f14812i0 = 1;
                                Object invoke = ((wf.n) obj).invoke(c12, c1190a);
                                if (invoke != enumC5000a3) {
                                    invoke = yVar;
                                }
                                if (invoke == enumC5000a3) {
                                    return enumC5000a3;
                                }
                                c10 = c12;
                            } catch (Throwable th4) {
                                th2 = th4;
                                c10 = c12;
                                c10.releaseIntercepted();
                                throw th2;
                            }
                        }
                        c10.releaseIntercepted();
                        return yVar;
                    }
                }
                c1190a = new C1190a(this, abstractC4825e);
                Object obj32 = c1190a.f14810Z;
                EnumC5000a enumC5000a32 = EnumC5000a.f41328Y;
                i11 = c1190a.f14812i0;
                if (i11 == 0) {
                }
                c10.releaseIntercepted();
                return yVar;
            default:
                Rg.x xVar = new Rg.x((wf.o) obj, abstractC1207j, null);
                Sg.y yVar2 = new Sg.y(abstractC4825e, abstractC4825e.getContext());
                Object e12 = Ad.l.e1(yVar2, yVar2, xVar);
                EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                if (e12 == enumC5000a4) {
                    com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
                }
                if (e12 == enumC5000a4) {
                    return e12;
                }
                return yVar;
        }
    }

    public C1209l(wf.n nVar) {
        this.f14870Y = 2;
        this.f14871Z = nVar;
    }
}
