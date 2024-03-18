package h4;

import Ng.C1067i0;
import Wh.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final F f31875a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.n f31876b;

    /* renamed from: c  reason: collision with root package name */
    public final Wg.f f31877c;

    /* renamed from: d  reason: collision with root package name */
    public final l f31878d;

    public e(F f6, q4.n nVar, Wg.i iVar, l lVar) {
        this.f31875a = f6;
        this.f31876b = nVar;
        this.f31877c = iVar;
        this.f31878d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Wg.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        d dVar;
        EnumC5000a enumC5000a;
        int i10;
        Wg.i iVar;
        e eVar;
        Wg.i iVar2;
        Throwable th2;
        Object n12;
        try {
            if (abstractC4825e instanceof d) {
                dVar = (d) abstractC4825e;
                int i11 = dVar.f31874j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f31874j0 = i11 - Integer.MIN_VALUE;
                    Object obj = dVar.f31872h0;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = dVar.f31874j0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                iVar2 = (Wg.f) dVar.f31870Y;
                                try {
                                    N.B0(obj);
                                    g gVar = (g) obj;
                                    ((Wg.i) iVar2).c();
                                    return gVar;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    iVar2.c();
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r22 = dVar.f31871Z;
                        eVar = (e) dVar.f31870Y;
                        N.B0(obj);
                        iVar = r22;
                    } else {
                        N.B0(obj);
                        dVar.f31870Y = this;
                        Wg.f fVar = this.f31877c;
                        dVar.f31871Z = fVar;
                        dVar.f31874j0 = 1;
                        iVar = (Wg.i) fVar;
                        if (iVar.a(dVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        eVar = this;
                    }
                    X0.b bVar = new X0.b(12, eVar);
                    dVar.f31870Y = iVar;
                    dVar.f31871Z = null;
                    dVar.f31874j0 = 2;
                    n12 = Ad.l.n1(dVar, C4832l.f40334Y, new C1067i0(bVar, null));
                    if (n12 != enumC5000a) {
                        return enumC5000a;
                    }
                    iVar2 = iVar;
                    obj = n12;
                    g gVar2 = (g) obj;
                    ((Wg.i) iVar2).c();
                    return gVar2;
                }
            }
            X0.b bVar2 = new X0.b(12, eVar);
            dVar.f31870Y = iVar;
            dVar.f31871Z = null;
            dVar.f31874j0 = 2;
            n12 = Ad.l.n1(dVar, C4832l.f40334Y, new C1067i0(bVar2, null));
            if (n12 != enumC5000a) {
            }
        } catch (Throwable th4) {
            iVar2 = iVar;
            th2 = th4;
            iVar2.c();
            throw th2;
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f31872h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = dVar.f31874j0;
        if (i10 == 0) {
        }
    }
}
