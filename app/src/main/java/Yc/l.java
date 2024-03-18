package Yc;

import android.gov.nist.javax.sip.header.ParameterNames;
import b9.AbstractC2133b;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.IOException;
import me.C4631d;
import me.T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import ve.AbstractC6034c;
import x8.W;
import xe.C6398C;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2133b f22251a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22252b;

    public l(AbstractC2133b abstractC2133b, p000if.a aVar) {
        this.f22251a = abstractC2133b;
        this.f22252b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Yc.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Yc.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Throwable th2, i iVar, j jVar, AbstractC4825e abstractC4825e) {
        k kVar;
        Throwable th3;
        Wc.b bVar;
        Vc.j jVar2;
        Vc.v vVar;
        Exception exc;
        String str;
        Throwable th4;
        Wc.b bVar2;
        Vc.j jVar3;
        Exception exc2;
        String str2;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i10 = kVar.f22250j0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f22250j0 = i10 - Integer.MIN_VALUE;
                Object obj = kVar.f22248h0;
                Object obj2 = EnumC5000a.f41328Y;
                String str3 = null;
                switch (kVar.f22250j0) {
                    case 0:
                        N.B0(obj);
                        if (th2 instanceof h) {
                            return new Vc.t(th2);
                        }
                        if (th2 instanceof C4631d) {
                            if (AbstractC3557B.K(((C4631d) th2).f39189Y.f(), C6398C.f49833o0) && jVar != 0) {
                                kVar.f22246Y = th2;
                                kVar.f22250j0 = 1;
                                if (jVar.invoke(kVar) == obj2) {
                                    return obj2;
                                }
                            }
                            kVar.f22246Y = th2;
                            kVar.f22250j0 = 2;
                            obj = Wc.b.f20895Z.e((T) th2, kVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            th4 = th2;
                            bVar2 = obj;
                            kVar.f22246Y = th4;
                            kVar.f22247Z = bVar2;
                            kVar.f22250j0 = 3;
                            obj = Vc.j.f18546h0.f((T) th4, kVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            jVar3 = (Vc.j) obj;
                            if (bVar2 == null) {
                                exc2 = bVar2;
                            } else if (jVar3 != null) {
                                exc2 = jVar3;
                            } else {
                                exc2 = (Exception) th4;
                            }
                            C4631d c4631d = (C4631d) th4;
                            int i11 = c4631d.f39189Y.f().f49834Y;
                            AbstractC6034c abstractC6034c = c4631d.f39189Y;
                            AbstractC3557B.c0("<this>", abstractC6034c);
                            String e10 = abstractC6034c.a().e("cf-ray");
                            if (bVar2 == null && (str2 = bVar2.f20896Y) != null) {
                                str3 = str2;
                            } else if (jVar3 != null) {
                                str3 = jVar3.f18547Y;
                            }
                            vVar = new Vc.v(i11, e10, str3, exc2);
                            return vVar;
                        } else if (th2 instanceof T) {
                            if (AbstractC3557B.K(((T) th2).f39189Y.f(), C6398C.f49832n0) && iVar != 0) {
                                kVar.f22246Y = th2;
                                kVar.f22250j0 = 4;
                                if (iVar.invoke(kVar) == obj2) {
                                    return obj2;
                                }
                            }
                            kVar.f22246Y = th2;
                            kVar.f22250j0 = 5;
                            obj = Wc.b.f20895Z.e((T) th2, kVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            th3 = th2;
                            bVar = (Wc.b) obj;
                            kVar.f22246Y = th3;
                            kVar.f22247Z = bVar;
                            kVar.f22250j0 = 6;
                            obj = Vc.j.f18546h0.f((T) th3, kVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            jVar2 = (Vc.j) obj;
                            if (bVar == null) {
                                exc = bVar;
                            } else if (jVar2 != null) {
                                exc = jVar2;
                            } else {
                                exc = (Exception) th3;
                            }
                            T t10 = (T) th3;
                            int i12 = t10.f39189Y.f().f49834Y;
                            AbstractC6034c abstractC6034c2 = t10.f39189Y;
                            AbstractC3557B.c0("<this>", abstractC6034c2);
                            String e11 = abstractC6034c2.a().e("cf-ray");
                            if (bVar == null && (str = bVar.f20896Y) != null) {
                                str3 = str;
                            } else if (jVar2 != null) {
                                str3 = jVar2.f18547Y;
                            }
                            vVar = new Vc.v(i12, e11, str3, exc);
                            return vVar;
                        } else if (th2 instanceof IOException) {
                            return new Vc.s(th2);
                        } else {
                            if ((th2 instanceof IllegalArgumentException) || (th2 instanceof Ce.a)) {
                                W.W(Pc.e.a(), "Serialization error", th2, null, 4);
                                AbstractC3557B.c0(ParameterNames.CAUSE, th2);
                                return new Vc.r(th2);
                            }
                            W.W(Pc.e.a(), "Unexpected exception from network request", th2, null, 4);
                            return new Vc.t(th2);
                        }
                    case 1:
                        th2 = kVar.f22246Y;
                        N.B0(obj);
                        kVar.f22246Y = th2;
                        kVar.f22250j0 = 2;
                        obj = Wc.b.f20895Z.e((T) th2, kVar);
                        if (obj == obj2) {
                        }
                        th4 = th2;
                        bVar2 = obj;
                        kVar.f22246Y = th4;
                        kVar.f22247Z = bVar2;
                        kVar.f22250j0 = 3;
                        obj = Vc.j.f18546h0.f((T) th4, kVar);
                        if (obj == obj2) {
                        }
                        jVar3 = (Vc.j) obj;
                        if (bVar2 == null) {
                        }
                        C4631d c4631d2 = (C4631d) th4;
                        int i112 = c4631d2.f39189Y.f().f49834Y;
                        AbstractC6034c abstractC6034c3 = c4631d2.f39189Y;
                        AbstractC3557B.c0("<this>", abstractC6034c3);
                        String e102 = abstractC6034c3.a().e("cf-ray");
                        if (bVar2 == null) {
                            break;
                        }
                        if (jVar3 != null) {
                        }
                        vVar = new Vc.v(i112, e102, str3, exc2);
                        return vVar;
                    case 2:
                        th2 = kVar.f22246Y;
                        N.B0(obj);
                        th4 = th2;
                        bVar2 = obj;
                        kVar.f22246Y = th4;
                        kVar.f22247Z = bVar2;
                        kVar.f22250j0 = 3;
                        obj = Vc.j.f18546h0.f((T) th4, kVar);
                        if (obj == obj2) {
                        }
                        jVar3 = (Vc.j) obj;
                        if (bVar2 == null) {
                        }
                        C4631d c4631d22 = (C4631d) th4;
                        int i1122 = c4631d22.f39189Y.f().f49834Y;
                        AbstractC6034c abstractC6034c32 = c4631d22.f39189Y;
                        AbstractC3557B.c0("<this>", abstractC6034c32);
                        String e1022 = abstractC6034c32.a().e("cf-ray");
                        if (bVar2 == null) {
                        }
                        if (jVar3 != null) {
                        }
                        vVar = new Vc.v(i1122, e1022, str3, exc2);
                        return vVar;
                    case 3:
                        bVar2 = kVar.f22247Z;
                        th4 = kVar.f22246Y;
                        N.B0(obj);
                        jVar3 = (Vc.j) obj;
                        if (bVar2 == null) {
                        }
                        C4631d c4631d222 = (C4631d) th4;
                        int i11222 = c4631d222.f39189Y.f().f49834Y;
                        AbstractC6034c abstractC6034c322 = c4631d222.f39189Y;
                        AbstractC3557B.c0("<this>", abstractC6034c322);
                        String e10222 = abstractC6034c322.a().e("cf-ray");
                        if (bVar2 == null) {
                        }
                        if (jVar3 != null) {
                        }
                        vVar = new Vc.v(i11222, e10222, str3, exc2);
                        return vVar;
                    case 4:
                        th2 = kVar.f22246Y;
                        N.B0(obj);
                        kVar.f22246Y = th2;
                        kVar.f22250j0 = 5;
                        obj = Wc.b.f20895Z.e((T) th2, kVar);
                        if (obj == obj2) {
                        }
                        th3 = th2;
                        bVar = (Wc.b) obj;
                        kVar.f22246Y = th3;
                        kVar.f22247Z = bVar;
                        kVar.f22250j0 = 6;
                        obj = Vc.j.f18546h0.f((T) th3, kVar);
                        if (obj == obj2) {
                        }
                        jVar2 = (Vc.j) obj;
                        if (bVar == null) {
                        }
                        T t102 = (T) th3;
                        int i122 = t102.f39189Y.f().f49834Y;
                        AbstractC6034c abstractC6034c22 = t102.f39189Y;
                        AbstractC3557B.c0("<this>", abstractC6034c22);
                        String e112 = abstractC6034c22.a().e("cf-ray");
                        if (bVar == null) {
                            break;
                        }
                        if (jVar2 != null) {
                        }
                        vVar = new Vc.v(i122, e112, str3, exc);
                        return vVar;
                    case 5:
                        th2 = kVar.f22246Y;
                        N.B0(obj);
                        th3 = th2;
                        bVar = (Wc.b) obj;
                        kVar.f22246Y = th3;
                        kVar.f22247Z = bVar;
                        kVar.f22250j0 = 6;
                        obj = Vc.j.f18546h0.f((T) th3, kVar);
                        if (obj == obj2) {
                        }
                        jVar2 = (Vc.j) obj;
                        if (bVar == null) {
                        }
                        T t1022 = (T) th3;
                        int i1222 = t1022.f39189Y.f().f49834Y;
                        AbstractC6034c abstractC6034c222 = t1022.f39189Y;
                        AbstractC3557B.c0("<this>", abstractC6034c222);
                        String e1122 = abstractC6034c222.a().e("cf-ray");
                        if (bVar == null) {
                        }
                        if (jVar2 != null) {
                        }
                        vVar = new Vc.v(i1222, e1122, str3, exc);
                        return vVar;
                    case 6:
                        bVar = kVar.f22247Z;
                        th3 = kVar.f22246Y;
                        N.B0(obj);
                        jVar2 = (Vc.j) obj;
                        if (bVar == null) {
                        }
                        T t10222 = (T) th3;
                        int i12222 = t10222.f39189Y.f().f49834Y;
                        AbstractC6034c abstractC6034c2222 = t10222.f39189Y;
                        AbstractC3557B.c0("<this>", abstractC6034c2222);
                        String e11222 = abstractC6034c2222.a().e("cf-ray");
                        if (bVar == null) {
                        }
                        if (jVar2 != null) {
                        }
                        vVar = new Vc.v(i12222, e11222, str3, exc);
                        return vVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj3 = kVar.f22248h0;
        Object obj22 = EnumC5000a.f41328Y;
        String str32 = null;
        switch (kVar.f22250j0) {
        }
    }
}
