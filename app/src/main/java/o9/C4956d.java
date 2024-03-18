package o9;

import Qg.AbstractC1207j;
import Qg.i0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: o9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4956d implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40990Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f40991Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f40992h0;

    public /* synthetic */ C4956d(AbstractC1207j abstractC1207j, wf.n nVar, int i10) {
        this.f40990Y = i10;
        this.f40991Z = abstractC1207j;
        this.f40992h0 = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r3.invoke(r12, r1) == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r13 == r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        C4955c c4955c;
        Object obj2;
        EnumC5000a enumC5000a;
        int i10;
        i0 i0Var;
        EnumC5000a enumC5000a2;
        int i11;
        y yVar = y.f36177a;
        int i12 = this.f40990Y;
        wf.n nVar = this.f40992h0;
        AbstractC1207j abstractC1207j = this.f40991Z;
        switch (i12) {
            case 0:
                if (abstractC4825e instanceof C4955c) {
                    c4955c = (C4955c) abstractC4825e;
                    int i13 = c4955c.f40987Z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c4955c.f40987Z = i13 - Integer.MIN_VALUE;
                        obj2 = c4955c.f40986Y;
                        enumC5000a = EnumC5000a.f41328Y;
                        i10 = c4955c.f40987Z;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    N.B0(obj2);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            abstractC1207j = c4955c.f40988h0;
                            N.B0(obj2);
                        } else {
                            N.B0(obj2);
                            c4955c.f40988h0 = abstractC1207j;
                            c4955c.f40987Z = 1;
                            obj2 = nVar.invoke(obj, c4955c);
                            break;
                        }
                        c4955c.f40988h0 = null;
                        c4955c.f40987Z = 2;
                        if (abstractC1207j.c(obj2, c4955c) != enumC5000a) {
                            return yVar;
                        }
                        return enumC5000a;
                    }
                }
                c4955c = new C4955c(this, abstractC4825e);
                obj2 = c4955c.f40986Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c4955c.f40987Z;
                if (i10 == 0) {
                }
                c4955c.f40988h0 = null;
                c4955c.f40987Z = 2;
                if (abstractC1207j.c(obj2, c4955c) != enumC5000a) {
                }
                return enumC5000a;
            default:
                if (abstractC4825e instanceof i0) {
                    i0Var = (i0) abstractC4825e;
                    int i14 = i0Var.f14860Z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        i0Var.f14860Z = i14 - Integer.MIN_VALUE;
                        Object obj3 = i0Var.f14859Y;
                        enumC5000a2 = EnumC5000a.f41328Y;
                        i11 = i0Var.f14860Z;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    N.B0(obj3);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            abstractC1207j = i0Var.f14863j0;
                            obj = i0Var.f14862i0;
                            N.B0(obj3);
                        } else {
                            N.B0(obj3);
                            i0Var.f14862i0 = obj;
                            i0Var.f14863j0 = abstractC1207j;
                            i0Var.f14860Z = 1;
                            break;
                        }
                        i0Var.f14862i0 = null;
                        i0Var.f14863j0 = null;
                        i0Var.f14860Z = 2;
                        if (abstractC1207j.c(obj, i0Var) != enumC5000a2) {
                            return yVar;
                        }
                        return enumC5000a2;
                    }
                }
                i0Var = new i0(this, abstractC4825e);
                Object obj32 = i0Var.f14859Y;
                enumC5000a2 = EnumC5000a.f41328Y;
                i11 = i0Var.f14860Z;
                if (i11 == 0) {
                }
                i0Var.f14862i0 = null;
                i0Var.f14863j0 = null;
                i0Var.f14860Z = 2;
                if (abstractC1207j.c(obj, i0Var) != enumC5000a2) {
                }
                return enumC5000a2;
        }
    }
}
