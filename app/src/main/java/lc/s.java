package Lc;

import Df.H;
import android.app.Application;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import id.AbstractC3557B;
import java.security.SecureRandom;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import vf.AbstractC6046c;
import vf.C6045b;
import wd.p0;
import wd.q0;
import wd.s0;
import wd.t0;
import wd.u0;
import wd.v0;
import x8.W;
import xe.C6419h;
import xe.C6431t;

/* loaded from: classes.dex */
public final class s implements Kc.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f11016a;

    /* renamed from: b  reason: collision with root package name */
    public final Mc.c f11017b;

    /* renamed from: c  reason: collision with root package name */
    public final Kc.c f11018c;

    /* renamed from: d  reason: collision with root package name */
    public final Yc.t f11019d;

    public s(Application application, Mc.c cVar, Kc.c cVar2, Yc.t tVar) {
        this.f11016a = application;
        this.f11017b = cVar;
        this.f11018c = cVar2;
        this.f11019d = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z10, Kc.e eVar, AbstractC4825e abstractC4825e) {
        p pVar;
        int i10;
        Vc.x xVar;
        Vc.v vVar;
        Throwable th2;
        Vc.j jVar;
        if (abstractC4825e instanceof p) {
            pVar = (p) abstractC4825e;
            int i11 = pVar.f11007i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f11007i0 = i11 - Integer.MIN_VALUE;
                Object obj = pVar.f11005Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = pVar.f11007i0;
                String str = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            eVar = pVar.f11004Y;
                            N.B0(obj);
                            xVar = (Vc.x) obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        eVar = pVar.f11004Y;
                        N.B0(obj);
                        xVar = (Vc.x) obj;
                    }
                } else {
                    N.B0(obj);
                    String str2 = eVar.f9626a;
                    String b10 = eVar.f9628c.b();
                    AbstractC3557B.b0("token(...)", b10);
                    Nc.c cVar = new Nc.c(str2, eVar.f9627b, b10, eVar.f9629d);
                    Mc.c cVar2 = this.f11017b;
                    if (z10) {
                        pVar.f11004Y = eVar;
                        pVar.f11007i0 = 1;
                        Yc.f fVar = (Yc.f) cVar2.f12019b.getValue();
                        Mc.b bVar = new Mc.b(cVar, null);
                        Df.w a5 = C.a(jf.y.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(jf.y.class), a5);
                        fVar.getClass();
                        obj = W.S(fVar, n22, bVar, pVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        xVar = (Vc.x) obj;
                    } else {
                        pVar.f11004Y = eVar;
                        pVar.f11007i0 = 2;
                        Yc.f fVar2 = (Yc.f) cVar2.f12019b.getValue();
                        Mc.a aVar = new Mc.a(cVar, null);
                        Df.w a10 = C.a(jf.y.class);
                        Je.a n23 = R4.b.n2(H.O(a10), C.f37623a.b(jf.y.class), a10);
                        fVar2.getClass();
                        obj = W.S(fVar2, n23, aVar, pVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        xVar = (Vc.x) obj;
                    }
                }
                if (!(xVar instanceof Vc.w)) {
                    jf.y yVar = (jf.y) ((Vc.w) xVar).f18565a;
                    xVar = new Vc.w(jf.y.f36177a);
                } else if (!(xVar instanceof Vc.q)) {
                    if (xVar instanceof Vc.r) {
                        Vc.r rVar = (Vc.r) xVar;
                        if (rVar instanceof Vc.v) {
                            vVar = (Vc.v) rVar;
                        } else {
                            vVar = null;
                        }
                        if (vVar != null) {
                            th2 = vVar.f18561a;
                        } else {
                            th2 = null;
                        }
                        if (th2 instanceof Vc.j) {
                            jVar = (Vc.j) th2;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            str = jVar.f18548Z;
                        }
                        if (AbstractC3557B.K(str, "unauthorized_license")) {
                            Vc.v vVar2 = (Vc.v) rVar;
                            return new t0(new Kc.d(eVar.f9628c), new Integer(vVar2.f18562b), vVar2.f18563c, vVar2.f18564d);
                        }
                        return Vc.x.a(rVar);
                    }
                    throw new RuntimeException();
                }
                return xVar.b();
            }
        }
        pVar = new p(this, abstractC4825e);
        Object obj2 = pVar.f11005Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = pVar.f11007i0;
        String str3 = null;
        if (i10 == 0) {
        }
        if (!(xVar instanceof Vc.w)) {
        }
        return xVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z10, AbstractC4825e abstractC4825e) {
        q qVar;
        int i10;
        Object obj;
        String str;
        Object obj2;
        String str2;
        s sVar;
        v0 v0Var;
        t0 t0Var;
        String str3;
        Vc.x xVar;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        boolean z11 = z10;
        if (abstractC4825e instanceof q) {
            qVar = (q) abstractC4825e;
            int i14 = qVar.f11012j0;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f11012j0 = i14 - Integer.MIN_VALUE;
                Object obj3 = qVar.f11010h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = qVar.f11012j0;
                int i15 = 3;
                int i16 = 1;
                int i17 = 0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    N.B0(obj3);
                                    nd.m mVar = (nd.m) obj3;
                                    if (mVar != null) {
                                        obj = mVar.f40292a;
                                    } else {
                                        obj = null;
                                    }
                                    str = (String) obj;
                                    if (str == null) {
                                        return new u0(new nd.m(str));
                                    }
                                    return new s0(0, new Exception("Cookie not found in store"));
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            N.B0(obj3);
                            nd.m mVar2 = (nd.m) obj3;
                            if (mVar2 != null) {
                                obj2 = mVar2.f40292a;
                            } else {
                                obj2 = null;
                            }
                            str2 = (String) obj2;
                            if (str2 == null) {
                                return new u0(new nd.m(str2));
                            }
                            return new s0(0, new Exception("Cookie not found in store"));
                        }
                        z11 = qVar.f11009Z;
                        sVar = qVar.f11008Y;
                        N.B0(obj3);
                        v0Var = (v0) obj3;
                        if (!(v0Var instanceof u0)) {
                            jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                            qVar.f11008Y = sVar;
                            qVar.f11012j0 = 3;
                            obj2 = sVar.c(z11, qVar);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            str2 = (String) obj2;
                            if (str2 == null) {
                            }
                        } else if (v0Var instanceof q0) {
                            q0 q0Var = (q0) v0Var;
                            Pc.c a5 = Pc.e.a();
                            Throwable th2 = q0Var.f48450a;
                            C3959i[] c3959iArr = new C3959i[2];
                            if (q0Var instanceof t0) {
                                t0Var = (t0) q0Var;
                            } else {
                                t0Var = null;
                            }
                            if (t0Var != null) {
                                str3 = t0Var.f48464c;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            c3959iArr[0] = new C3959i(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, str3);
                            c3959iArr[1] = new C3959i("pre_auth", Boolean.valueOf(z11));
                            a5.a("Error refreshing Play Integrity cookie", th2, AbstractC4268D.a1(c3959iArr));
                            return q0Var;
                        } else if (v0Var instanceof p0) {
                            qVar.f11008Y = sVar;
                            qVar.f11012j0 = 4;
                            obj = sVar.c(z11, qVar);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            str = (String) obj;
                            if (str == null) {
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        z11 = qVar.f11009Z;
                        sVar = qVar.f11008Y;
                        N.B0(obj3);
                    }
                } else {
                    N.B0(obj3);
                    if (t.f11020a) {
                        String string = this.f11016a.getString(R.string.emulator_token);
                        AbstractC3557B.b0("getString(...)", string);
                        return new u0(new nd.m(string));
                    }
                    byte[] bArr2 = new byte[256];
                    new SecureRandom().nextBytes(bArr2);
                    C6045b.f47520c.getClass();
                    C6045b c6045b = C6045b.f47522e;
                    c6045b.getClass();
                    C6431t.f(0, 256, 256);
                    int a10 = c6045b.a(256);
                    byte[] bArr3 = new byte[a10];
                    C6431t.f(0, 256, 256);
                    int a11 = c6045b.a(256);
                    if (a10 >= 0) {
                        if (a11 >= 0 && a11 <= a10) {
                            if (c6045b.f47523a) {
                                bArr = AbstractC6046c.f47526b;
                            } else {
                                bArr = AbstractC6046c.f47525a;
                            }
                            if (c6045b.f47524b) {
                                i11 = 19;
                            } else {
                                i11 = Integer.MAX_VALUE;
                            }
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i12 = i18 + 2;
                                if (i12 >= 256) {
                                    break;
                                }
                                int min = Math.min((256 - i18) / i15, i11);
                                for (int i20 = i17; i20 < min; i20++) {
                                    int i21 = i18 + 2;
                                    i18 += 3;
                                    int i22 = ((bArr2[i18] & 255) << 16) | ((bArr2[i18 + 1] & 255) << 8) | (bArr2[i21] & 255);
                                    bArr3[i19] = bArr[i22 >>> 18];
                                    bArr3[i19 + 1] = bArr[(i22 >>> 12) & 63];
                                    int i23 = i19 + 3;
                                    bArr3[i19 + 2] = bArr[(i22 >>> 6) & 63];
                                    i19 += 4;
                                    bArr3[i23] = bArr[i22 & 63];
                                }
                                if (min == i11 && i18 != 256) {
                                    int i24 = i19 + 1;
                                    byte[] bArr4 = C6045b.f47521d;
                                    bArr3[i19] = bArr4[0];
                                    i19 += 2;
                                    i13 = 1;
                                    bArr3[i24] = bArr4[1];
                                } else {
                                    i13 = 1;
                                }
                                i16 = i13;
                                i15 = 3;
                                i17 = 0;
                            }
                            int i25 = 256 - i18;
                            if (i25 != i16) {
                                if (i25 == 2) {
                                    int i26 = ((bArr2[i18 + 1] & 255) << 2) | ((bArr2[i18] & 255) << 10);
                                    bArr3[i19] = bArr[i26 >>> 12];
                                    bArr3[i19 + 1] = bArr[(i26 >>> 6) & 63];
                                    bArr3[i19 + 2] = bArr[i26 & 63];
                                    bArr3[i19 + 3] = 61;
                                    i18 = i12;
                                }
                            } else {
                                int i27 = (bArr2[i18] & 255) << 4;
                                bArr3[i19] = bArr[i27 >>> 6];
                                bArr3[i19 + 1] = bArr[i27 & 63];
                                bArr3[i19 + 2] = 61;
                                bArr3[i19 + 3] = 61;
                                i18++;
                            }
                            if (i18 == 256) {
                                String str4 = new String(bArr3, Lg.a.f11132b);
                                qVar.f11008Y = this;
                                qVar.f11009Z = z11;
                                qVar.f11012j0 = 1;
                                obj3 = ((y) this.f11018c).a(str4, qVar, z11);
                                if (obj3 == enumC5000a) {
                                    return enumC5000a;
                                }
                                sVar = this;
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            throw new IndexOutOfBoundsException(AbstractC2469q0.i("The destination array does not have enough capacity, destination offset: 0, destination size: ", a10, ", capacity needed: ", a11));
                        }
                    } else {
                        throw new IndexOutOfBoundsException(android.gov.nist.core.a.e("destination offset: 0, destination size: ", a10));
                    }
                }
                xVar = (Vc.x) obj3;
                if (!(xVar instanceof Vc.w)) {
                    qVar.f11008Y = sVar;
                    qVar.f11009Z = z11;
                    qVar.f11012j0 = 2;
                    obj3 = sVar.a(z11, (Kc.e) ((Vc.w) xVar).f18565a, qVar);
                    if (obj3 == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = (v0) obj3;
                    if (!(v0Var instanceof u0)) {
                    }
                } else if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof Vc.r) {
                        xVar.getClass();
                        return Vc.x.a((Vc.r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        qVar = new q(this, abstractC4825e);
        Object obj32 = qVar.f11010h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = qVar.f11012j0;
        int i152 = 3;
        int i162 = 1;
        int i172 = 0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj32;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z10, AbstractC4825e abstractC4825e) {
        r rVar;
        int i10;
        C6419h c6419h;
        String str;
        if (abstractC4825e instanceof r) {
            rVar = (r) abstractC4825e;
            int i11 = rVar.f11015h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f11015h0 = i11 - Integer.MIN_VALUE;
                Object obj = rVar.f11013Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = rVar.f11015h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (t.f11020a) {
                        String string = this.f11016a.getString(R.string.emulator_token);
                        AbstractC3557B.b0("getString(...)", string);
                        return string;
                    }
                    if (z10) {
                        str = "_preauth_playintegrity";
                    } else {
                        str = "_playintegrity";
                    }
                    rVar.f11015h0 = 1;
                    obj = this.f11019d.h(str, rVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                c6419h = (C6419h) obj;
                if (c6419h == null) {
                    String str2 = c6419h.f49889b;
                    AbstractC3557B.c0("value", str2);
                    return str2;
                }
                return null;
            }
        }
        rVar = new r(this, abstractC4825e);
        Object obj2 = rVar.f11013Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = rVar.f11015h0;
        if (i10 == 0) {
        }
        c6419h = (C6419h) obj2;
        if (c6419h == null) {
        }
    }
}
