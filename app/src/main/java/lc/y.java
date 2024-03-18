package Lc;

import Df.H;
import android.app.Application;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import o8.AbstractC4949b;
import o8.C4948a;
import o9.C4969q;
import of.EnumC5000a;
import u8.C5852b;
import u8.C5867q;
import x8.W;

/* loaded from: classes.dex */
public final class y implements Kc.c {

    /* renamed from: e  reason: collision with root package name */
    public static int f11036e;

    /* renamed from: a  reason: collision with root package name */
    public final Application f11037a;

    /* renamed from: b  reason: collision with root package name */
    public final e f11038b;

    /* renamed from: c  reason: collision with root package name */
    public final Pc.g f11039c = Bi.c.i1(Pc.b.f13928Y);

    /* renamed from: d  reason: collision with root package name */
    public final C4969q f11040d = new C4969q(Long.valueOf(Mg.b.e(H.x0(1, Mg.d.f12136k0))), new x(this, null));

    public y(Application application, e eVar) {
        this.f11037a = application;
        this.f11038b = eVar;
        Mg.a aVar = Mg.b.f12127Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: Exception -> 0x005d, RemoteException -> 0x0065, a -> 0x01b9, CancellationException -> 0x0280, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0280, blocks: (B:18:0x0057, B:27:0x0075, B:43:0x00e6, B:45:0x00ea, B:48:0x00fa, B:49:0x00fe, B:50:0x0100, B:51:0x0102, B:52:0x0104, B:56:0x0113, B:58:0x0135, B:62:0x0175), top: B:106:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa A[Catch: Exception -> 0x005d, RemoteException -> 0x0065, a -> 0x01b9, CancellationException -> 0x0280, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0280, blocks: (B:18:0x0057, B:27:0x0075, B:43:0x00e6, B:45:0x00ea, B:48:0x00fa, B:49:0x00fe, B:50:0x0100, B:51:0x0102, B:52:0x0104, B:56:0x0113, B:58:0x0135, B:62:0x0175), top: B:106:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Pc.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Pc.g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Pc.g] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, AbstractC4825e abstractC4825e, boolean z10) {
        w wVar;
        ?? r72;
        y yVar;
        String str2;
        RemoteException e10;
        Exception e11;
        String str3;
        String str4;
        AbstractC4949b abstractC4949b;
        int i10;
        String str5;
        String str6;
        AbstractC4949b abstractC4949b2;
        y yVar2;
        String str7;
        String str8;
        boolean z11;
        String str9;
        try {
            try {
                try {
                    try {
                        if (abstractC4825e instanceof w) {
                            wVar = (w) abstractC4825e;
                            int i11 = wVar.f11033m0;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                wVar.f11033m0 = i11 - Integer.MIN_VALUE;
                                Object obj = wVar.f11031k0;
                                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                                r72 = wVar.f11033m0;
                                if (r72 == 0) {
                                    if (r72 != 1) {
                                        if (r72 != 2) {
                                            if (r72 != 3) {
                                                if (r72 == 4) {
                                                    abstractC4949b2 = (AbstractC4949b) wVar.f11028h0;
                                                    str6 = wVar.f11027Z;
                                                    str5 = (String) wVar.f11026Y;
                                                    N.B0(obj);
                                                    return new Vc.w(new Kc.e(str5, str6, abstractC4949b2, (String) obj));
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            r72 = wVar.f11029i0;
                                            str4 = (String) wVar.f11028h0;
                                            str3 = wVar.f11027Z;
                                            yVar = (y) wVar.f11026Y;
                                            try {
                                                N.B0(obj);
                                                str2 = "Failed to generate Play Integrity token";
                                                r72 = r72;
                                            } catch (C4948a e12) {
                                                e = e12;
                                                str2 = "Failed to generate Play Integrity token";
                                                yVar.f11039c.b(str2, e, r72);
                                                Status status = e.f46452Y;
                                                i10 = status.f26807Y;
                                                int i12 = status.f26807Y;
                                                Application application = yVar.f11037a;
                                                if (i10 != -18) {
                                                }
                                            }
                                            try {
                                                abstractC4949b = (AbstractC4949b) obj;
                                                abstractC4949b2 = abstractC4949b;
                                                str6 = str3;
                                                str5 = yVar.f11037a.getPackageName();
                                                AbstractC3557B.b0("getPackageName(...)", str5);
                                                AbstractC3557B.Z(abstractC4949b2);
                                                wVar.f11026Y = str5;
                                                wVar.f11027Z = str6;
                                                wVar.f11028h0 = abstractC4949b2;
                                                wVar.f11029i0 = null;
                                                wVar.f11033m0 = 4;
                                                obj = yVar.f11038b.a(wVar);
                                                if (obj == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                return new Vc.w(new Kc.e(str5, str6, abstractC4949b2, (String) obj));
                                            } catch (RemoteException e13) {
                                                e10 = e13;
                                                yVar.f11039c.b(str2, e10, r72);
                                                return new Vc.v(new Error(e10), 998, (String) null, 12);
                                            } catch (C4948a e14) {
                                                e = e14;
                                                yVar.f11039c.b(str2, e, r72);
                                                Status status2 = e.f46452Y;
                                                i10 = status2.f26807Y;
                                                int i122 = status2.f26807Y;
                                                Application application2 = yVar.f11037a;
                                                if (i10 != -18) {
                                                }
                                            } catch (Exception e15) {
                                                e11 = e15;
                                                yVar.f11039c.b(str2, e11, r72);
                                                return new Vc.t(e11);
                                            }
                                        } else {
                                            r72 = wVar.f11029i0;
                                            str8 = (String) wVar.f11028h0;
                                            str7 = wVar.f11027Z;
                                            yVar2 = (y) wVar.f11026Y;
                                            try {
                                                N.B0(obj);
                                                r72 = r72;
                                                o8.s sVar = (o8.s) obj;
                                                o8.t tVar = sVar.f40980a;
                                                tVar.getClass();
                                                long j6 = sVar.f40982c;
                                                Object[] objArr = {Long.valueOf(j6)};
                                                o8.p pVar = tVar.f40983a;
                                                pVar.f40971a.b("requestExpressIntegrityToken(%s)", objArr);
                                                N7.f fVar = new N7.f();
                                                str2 = "Failed to generate Play Integrity token";
                                            } catch (RemoteException e16) {
                                                e10 = e16;
                                                str2 = "Failed to generate Play Integrity token";
                                                yVar = yVar2;
                                                yVar.f11039c.b(str2, e10, r72);
                                                return new Vc.v(new Error(e10), 998, (String) null, 12);
                                            } catch (C4948a e17) {
                                                e = e17;
                                                str2 = "Failed to generate Play Integrity token";
                                                str4 = str8;
                                                yVar = yVar2;
                                                yVar.f11039c.b(str2, e, r72);
                                                Status status22 = e.f46452Y;
                                                i10 = status22.f26807Y;
                                                int i1222 = status22.f26807Y;
                                                Application application22 = yVar.f11037a;
                                                if (i10 != -18) {
                                                }
                                            } catch (Exception e18) {
                                                e11 = e18;
                                                str2 = "Failed to generate Play Integrity token";
                                                yVar = yVar2;
                                                yVar.f11039c.b(str2, e11, r72);
                                                return new Vc.t(e11);
                                            }
                                            try {
                                                o8.j jVar = new o8.j(pVar, fVar, str7, sVar.f40981b, j6, fVar);
                                                C5852b c5852b = pVar.f40976f;
                                                c5852b.getClass();
                                                c5852b.a().post(new C5867q(c5852b, fVar, fVar, jVar));
                                                N7.m mVar = fVar.f12723a;
                                                AbstractC3557B.b0("request(...)", mVar);
                                                wVar.f11026Y = yVar2;
                                                wVar.f11027Z = str7;
                                                wVar.f11028h0 = str8;
                                                wVar.f11029i0 = r72;
                                                wVar.f11033m0 = 3;
                                                obj = Bi.c.T(mVar, wVar);
                                                if (obj != enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                str4 = str8;
                                                str3 = str7;
                                                yVar = yVar2;
                                                r72 = r72;
                                                abstractC4949b = (AbstractC4949b) obj;
                                                abstractC4949b2 = abstractC4949b;
                                                str6 = str3;
                                                str5 = yVar.f11037a.getPackageName();
                                                AbstractC3557B.b0("getPackageName(...)", str5);
                                                AbstractC3557B.Z(abstractC4949b2);
                                                wVar.f11026Y = str5;
                                                wVar.f11027Z = str6;
                                                wVar.f11028h0 = abstractC4949b2;
                                                wVar.f11029i0 = null;
                                                wVar.f11033m0 = 4;
                                                obj = yVar.f11038b.a(wVar);
                                                if (obj == enumC5000a) {
                                                }
                                                return new Vc.w(new Kc.e(str5, str6, abstractC4949b2, (String) obj));
                                            } catch (RemoteException e19) {
                                                e10 = e19;
                                                yVar = yVar2;
                                                yVar.f11039c.b(str2, e10, r72);
                                                return new Vc.v(new Error(e10), 998, (String) null, 12);
                                            } catch (C4948a e20) {
                                                e = e20;
                                                str4 = str8;
                                                yVar = yVar2;
                                                yVar.f11039c.b(str2, e, r72);
                                                Status status222 = e.f46452Y;
                                                i10 = status222.f26807Y;
                                                int i12222 = status222.f26807Y;
                                                Application application222 = yVar.f11037a;
                                                if (i10 != -18) {
                                                }
                                            } catch (Exception e21) {
                                                e11 = e21;
                                                yVar = yVar2;
                                                yVar.f11039c.b(str2, e11, r72);
                                                return new Vc.t(e11);
                                            }
                                        }
                                    } else {
                                        z11 = wVar.f11030j0;
                                        str3 = wVar.f11027Z;
                                        yVar = (y) wVar.f11026Y;
                                        N.B0(obj);
                                    }
                                } else {
                                    N.B0(obj);
                                    W.F(this.f11039c, "Generating Play Integrity token", null, 6);
                                    wVar.f11026Y = this;
                                    wVar.f11027Z = str;
                                    z11 = z10;
                                    wVar.f11030j0 = z11;
                                    wVar.f11033m0 = 1;
                                    Object a5 = this.f11038b.a(wVar);
                                    if (a5 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    yVar = this;
                                    str3 = str;
                                    obj = a5;
                                }
                                str9 = (String) obj;
                                int i13 = f11036e;
                                f11036e = i13 + 1;
                                r72 = AbstractC4268D.a1(new C3959i("pre_auth", Boolean.valueOf(z11)), new C3959i("request_count", new Integer(i13)));
                                if (!t.f11020a) {
                                    yVar.getClass();
                                    abstractC4949b = new v(yVar);
                                    abstractC4949b2 = abstractC4949b;
                                    str6 = str3;
                                    str5 = yVar.f11037a.getPackageName();
                                    AbstractC3557B.b0("getPackageName(...)", str5);
                                    AbstractC3557B.Z(abstractC4949b2);
                                    wVar.f11026Y = str5;
                                    wVar.f11027Z = str6;
                                    wVar.f11028h0 = abstractC4949b2;
                                    wVar.f11029i0 = null;
                                    wVar.f11033m0 = 4;
                                    obj = yVar.f11038b.a(wVar);
                                    if (obj == enumC5000a) {
                                    }
                                    return new Vc.w(new Kc.e(str5, str6, abstractC4949b2, (String) obj));
                                }
                                C4969q c4969q = yVar.f11040d;
                                wVar.f11026Y = yVar;
                                wVar.f11027Z = str3;
                                wVar.f11028h0 = str9;
                                wVar.f11029i0 = r72;
                                wVar.f11033m0 = 2;
                                obj = c4969q.a(wVar);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                y yVar3 = yVar;
                                str7 = str3;
                                str8 = str9;
                                yVar2 = yVar3;
                                r72 = r72;
                                o8.s sVar2 = (o8.s) obj;
                                o8.t tVar2 = sVar2.f40980a;
                                tVar2.getClass();
                                long j62 = sVar2.f40982c;
                                Object[] objArr2 = {Long.valueOf(j62)};
                                o8.p pVar2 = tVar2.f40983a;
                                pVar2.f40971a.b("requestExpressIntegrityToken(%s)", objArr2);
                                N7.f fVar2 = new N7.f();
                                str2 = "Failed to generate Play Integrity token";
                                o8.j jVar2 = new o8.j(pVar2, fVar2, str7, sVar2.f40981b, j62, fVar2);
                                C5852b c5852b2 = pVar2.f40976f;
                                c5852b2.getClass();
                                c5852b2.a().post(new C5867q(c5852b2, fVar2, fVar2, jVar2));
                                N7.m mVar2 = fVar2.f12723a;
                                AbstractC3557B.b0("request(...)", mVar2);
                                wVar.f11026Y = yVar2;
                                wVar.f11027Z = str7;
                                wVar.f11028h0 = str8;
                                wVar.f11029i0 = r72;
                                wVar.f11033m0 = 3;
                                obj = Bi.c.T(mVar2, wVar);
                                if (obj != enumC5000a) {
                                }
                            }
                        }
                        if (!t.f11020a) {
                        }
                    } catch (C4948a e22) {
                        e = e22;
                        str2 = "Failed to generate Play Integrity token";
                        str4 = str9;
                        yVar.f11039c.b(str2, e, r72);
                        Status status2222 = e.f46452Y;
                        i10 = status2222.f26807Y;
                        int i122222 = status2222.f26807Y;
                        Application application2222 = yVar.f11037a;
                        if (i10 != -18) {
                            if (i10 != -12) {
                                if (i10 != -9) {
                                    if (i10 != -6 && i10 != -15) {
                                        if (i10 != -14) {
                                            if (i10 != -3) {
                                                if (i10 != -2 && i10 != -1) {
                                                    return new Vc.v(new Error(e), i122222, (String) null, 12);
                                                }
                                            }
                                        }
                                    } else {
                                        return new Vc.v(new Error(e), i122222, application2222.getString(R.string.login_device_integrity_error_play_services, str4, String.valueOf(i122222)), 4);
                                    }
                                }
                                return new Vc.v(new Error(e), i122222, application2222.getString(R.string.login_device_integrity_error_play_store, str4, String.valueOf(i122222)), 4);
                            }
                            return new Vc.s(e);
                        }
                        return new Vc.v(new Error(e), i122222, application2222.getString(R.string.login_client_transient, str4, String.valueOf(i122222)), 4);
                    }
                } catch (C4948a e23) {
                    e = e23;
                }
                if (r72 == 0) {
                }
                str9 = (String) obj;
                int i132 = f11036e;
                f11036e = i132 + 1;
                r72 = AbstractC4268D.a1(new C3959i("pre_auth", Boolean.valueOf(z11)), new C3959i("request_count", new Integer(i132)));
            } catch (CancellationException unused) {
                return Vc.q.f18560a;
            }
        } catch (RemoteException e24) {
            e10 = e24;
            str2 = "Failed to generate Play Integrity token";
        } catch (Exception e25) {
            e11 = e25;
            str2 = "Failed to generate Play Integrity token";
        }
        wVar = new w(this, abstractC4825e);
        Object obj2 = wVar.f11031k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        r72 = wVar.f11033m0;
    }
}
