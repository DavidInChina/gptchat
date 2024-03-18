package rb;

import G0.C0588q;
import O9.Q;
import Qg.AbstractC1206i;
import Qg.F0;
import Qg.s0;
import aa.C1939b;
import aa.EnumC1940c;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.service.voice.VoiceInteractionSession;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import ca.C2311c;
import ca.C2325q;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import dh.C2695d;
import eh.C2917q;
import fa.C2969F;
import fa.EnumC2970G;
import fa.EnumC2971H;
import ha.M;
import ha.T;
import ha.X;
import id.AbstractC3557B;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import jf.C3959i;
import jf.C3963m;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import org.json.JSONArray;
import org.json.JSONObject;
import pf.AbstractC5156c;
import pf.AbstractC5163j;
import r0.AbstractC5337a;
import vb.AbstractC6005a;
import wd.C6180b0;
import wd.C6182c0;
import wd.C6190g0;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;

/* renamed from: rb.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5436z implements AbstractC6005a {

    /* renamed from: a  reason: collision with root package name */
    public final T9.a f44768a;

    /* renamed from: b  reason: collision with root package name */
    public final com.openai.experiment.r f44769b;

    /* renamed from: c  reason: collision with root package name */
    public final C5402C f44770c;

    /* renamed from: d  reason: collision with root package name */
    public final B9.j f44771d;

    /* renamed from: e  reason: collision with root package name */
    public final C3963m f44772e = R4.b.D1(new d9.h(15, this));

    /* renamed from: f  reason: collision with root package name */
    public final Pc.g f44773f = Bi.c.i1(Pc.b.f13939q0);

    public C5436z(T9.a aVar, com.openai.experiment.r rVar, C5402C c5402c, B9.j jVar) {
        this.f44768a = aVar;
        this.f44769b = rVar;
        this.f44770c = c5402c;
        this.f44771d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C5436z c5436z, C2325q c2325q, String str, wf.n nVar, AbstractC4825e abstractC4825e) {
        C5432v c5432v;
        Object obj;
        int i10;
        String str2;
        Intent intent;
        c5436z.getClass();
        if (abstractC4825e instanceof C5432v) {
            c5432v = (C5432v) abstractC4825e;
            int i11 = c5432v.f44752j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5432v.f44752j0 = i11 - Integer.MIN_VALUE;
                C5432v c5432v2 = c5432v;
                obj = c5432v2.f44750h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5432v2.f44752j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5432v2.f44749Z;
                    c5436z = c5432v2.f44748Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    String str3 = (String) c2325q.f26412g.f24021a.f32022f.get("platform");
                    if (str3 != null) {
                        str2 = str3.toLowerCase(Locale.ROOT);
                        AbstractC3557B.b0("toLowerCase(...)", str2);
                    } else {
                        str2 = null;
                    }
                    boolean K10 = AbstractC3557B.K(str2, "whatsapp");
                    C1939b c1939b = c2325q.f26412g;
                    if (K10) {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + str + "&text=" + ((String) c1939b.f24021a.f32022f.get("message"))));
                    } else {
                        intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("smsto:" + str));
                        intent.putExtra("sms_body", (String) c1939b.f24021a.f32022f.get("message"));
                    }
                    c5432v2.f44748Y = c5436z;
                    c5432v2.f44749Z = c2325q;
                    c5432v2.f44752j0 = 1;
                    obj = nVar.invoke(intent, c5432v2);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                C5436z c5436z2 = c5436z;
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                c5432v2.f44748Y = null;
                c5432v2.f44749Z = null;
                c5432v2.f44752j0 = 2;
                obj = i(c5436z2, c2325q, "Message sent", 0, c5432v2, 12);
                if (obj == obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        c5432v = new C5432v(c5436z, abstractC4825e);
        C5432v c5432v22 = c5432v;
        obj = c5432v22.f44750h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5432v22.f44752j0;
        if (i10 == 0) {
        }
        C5436z c5436z22 = c5436z;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public static /* synthetic */ Object i(C5436z c5436z, C2325q c2325q, String str, int i10, AbstractC4825e abstractC4825e, int i11) {
        if ((i11 & 4) != 0) {
            i10 = RCHTTPStatusCodes.SUCCESS;
        }
        return c5436z.h(c2325q, str, i10, null, abstractC4825e);
    }

    public static long p(String str) {
        Yg.u.Companion.getClass();
        try {
            Yg.u uVar = new Yg.u(LocalDateTime.parse(str));
            Yg.w.Companion.getClass();
            return new Yg.p(uVar.f22423Y.o(Yg.v.a().f22424a).toInstant()).c();
        } catch (DateTimeParseException e10) {
            throw new Ad.t(1, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5412b c5412b;
        Object obj;
        int i10;
        C5436z c5436z;
        Long l10;
        Long l11;
        if (abstractC4825e instanceof C5412b) {
            c5412b = (C5412b) abstractC4825e;
            int i11 = c5412b.f44671j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5412b.f44671j0 = i11 - Integer.MIN_VALUE;
                C5412b c5412b2 = c5412b;
                obj = c5412b2.f44669h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5412b2.f44671j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5412b2.f44668Z;
                    C5436z c5436z2 = c5412b2.f44667Y;
                    N.B0(obj);
                    c5436z = c5436z2;
                } else {
                    N.B0(obj);
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setData(Uri.parse("content://com.android.calendar/events"));
                    intent.putExtra("title", (String) c2325q.f26412g.f24021a.f32022f.get("title"));
                    C1939b c1939b = c2325q.f26412g;
                    String str = (String) c1939b.f24021a.f32022f.get("startDateTime");
                    if (str != null) {
                        l10 = new Long(p(str));
                    } else {
                        l10 = null;
                    }
                    intent.putExtra("beginTime", l10);
                    String str2 = (String) c1939b.f24021a.f32022f.get("endDateTime");
                    if (str2 != null) {
                        l11 = new Long(p(str2));
                    } else {
                        l11 = null;
                    }
                    intent.putExtra("endTime", l11);
                    c5412b2.f44667Y = this;
                    c5412b2.f44668Z = c2325q;
                    c5412b2.f44671j0 = 1;
                    obj = c5418h.invoke(intent, c5412b2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    c5436z = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                c5412b2.f44667Y = null;
                c5412b2.f44668Z = null;
                c5412b2.f44671j0 = 2;
                obj = i(c5436z, c2325q, "Event added", 0, c5412b2, 12);
                if (obj == obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        c5412b = new C5412b(this, abstractC4825e);
        C5412b c5412b22 = c5412b;
        obj = c5412b22.f44669h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5412b22.f44671j0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pf.j, wf.n] */
    public final AbstractC1206i c() {
        return s0.e(new Ia.j(K8.d.G0(new AbstractC5163j(2, null), ((C4972C) this.f44768a).f41060o), 1, this), C5415e.f44676Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(C2325q c2325q, AbstractC4825e abstractC4825e) {
        C5416f c5416f;
        int i10;
        C2969F c2969f;
        C5436z c5436z;
        v0 v0Var;
        if (abstractC4825e instanceof C5416f) {
            c5416f = (C5416f) abstractC4825e;
            int i11 = c5416f.f44683j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5416f.f44683j0 = i11 - Integer.MIN_VALUE;
                C5416f c5416f2 = c5416f;
                Object obj = c5416f2.f44681h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5416f2.f44683j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                N.B0(obj);
                                c2969f = (C2969F) obj;
                                return c2969f;
                            }
                        }
                        N.B0(obj);
                        return (C2969F) obj;
                    }
                    c2325q = c5416f2.f44680Z;
                    c5436z = c5416f2.f44679Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c5416f2.f44679Y = this;
                    c5416f2.f44680Z = c2325q;
                    c5416f2.f44683j0 = 1;
                    obj = this.f44770c.b(c5416f2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5436z = this;
                }
                v0Var = (v0) obj;
                c2969f = null;
                if (!(v0Var instanceof u0)) {
                    C2917q c2917q = md.b.f39132a;
                    c2917q.getClass();
                    String d10 = c2917q.d(A7.b.U0(C5406G.Companion.serializer()), (C5406G) ((u0) v0Var).f48468a);
                    c5416f2.f44679Y = null;
                    c5416f2.f44680Z = null;
                    c5416f2.f44683j0 = 2;
                    obj = i(c5436z, c2325q, d10, 0, c5416f2, 12);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (v0Var instanceof q0) {
                    Throwable th2 = ((q0) v0Var).f48450a;
                    if (th2 instanceof C5407H) {
                        W.W(c5436z.f44773f, android.gov.nist.core.a.A("Permission ", ((C5407H) th2).f44661Y, " not yet granted"), null, null, 6);
                        return c2969f;
                    }
                    c5416f2.f44679Y = null;
                    c5416f2.f44680Z = null;
                    c5416f2.f44683j0 = 3;
                    obj = i(c5436z, c2325q, "Location unavailable", RCHTTPStatusCodes.NOT_FOUND, c5416f2, 8);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c2969f = (C2969F) obj;
                    return c2969f;
                } else if (v0Var instanceof p0) {
                    C2917q c2917q2 = md.b.f39132a;
                    c2917q2.getClass();
                    String d11 = c2917q2.d(A7.b.U0(C5406G.Companion.serializer()), null);
                    c5416f2.f44679Y = null;
                    c5416f2.f44680Z = null;
                    c5416f2.f44683j0 = 4;
                    obj = i(c5436z, c2325q, d11, 0, c5416f2, 12);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    throw new RuntimeException();
                }
                return (C2969F) obj;
            }
        }
        c5416f = new C5416f(this, abstractC4825e);
        C5416f c5416f22 = c5416f;
        Object obj2 = c5416f22.f44681h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5416f22.f44683j0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        c2969f = null;
        if (!(v0Var instanceof u0)) {
        }
        return (C2969F) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r3v6, types: [wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5417g c5417g;
        Object obj;
        int i10;
        C2325q c2325q2;
        C5436z c5436z;
        VoiceInteractionSession.AssistState h10;
        AssistStructure assistStructure;
        AssistStructure assistStructure2;
        B9.f fVar;
        Object i11;
        C5436z c5436z2;
        C5418h c5418h2;
        C2325q c2325q3;
        if (abstractC4825e instanceof C5417g) {
            c5417g = (C5417g) abstractC4825e;
            int i12 = c5417g.f44689k0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c5417g.f44689k0 = i12 - Integer.MIN_VALUE;
                C5417g c5417g2 = c5417g;
                obj = c5417g2.f44687i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5417g2.f44689k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    N.B0(obj);
                                    return obj;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C2325q c2325q4 = c5417g2.f44685Z;
                            C5436z c5436z3 = c5417g2.f44684Y;
                            N.B0(obj);
                            c2325q2 = c2325q4;
                            c5436z = c5436z3;
                            h10 = AbstractC5337a.h(obj);
                            Pc.g gVar = c5436z.f44773f;
                            if (h10 == null) {
                                assistStructure = h10.getAssistStructure();
                            } else {
                                assistStructure = null;
                            }
                            W.F(gVar, "AssistantInteractionSession onHandleAssist: " + h10 + Separators.SP + assistStructure, null, 6);
                            if (h10 == null) {
                                assistStructure2 = h10.getAssistStructure();
                            } else {
                                assistStructure2 = null;
                            }
                            if (assistStructure2 == null) {
                                Cf.g D02 = N.D0(0, assistStructure2.getWindowNodeCount());
                                ArrayList arrayList = new ArrayList();
                                Cf.f it = D02.iterator();
                                while (it.f3111h0) {
                                    AssistStructure.WindowNode windowNodeAt = assistStructure2.getWindowNodeAt(it.a());
                                    AbstractC3557B.Z(windowNodeAt);
                                    ArrayList arrayList2 = new ArrayList();
                                    AssistStructure.ViewNode rootViewNode = windowNodeAt.getRootViewNode();
                                    AbstractC3557B.b0("getRootViewNode(...)", rootViewNode);
                                    B9.k.a(rootViewNode, arrayList2, 0, 0);
                                    if (arrayList2.size() > 1) {
                                        kf.r.K1(arrayList2, new C0588q(8));
                                    }
                                    arrayList.add(new B9.i(windowNodeAt.getTitle().toString(), arrayList2));
                                }
                                fVar = new B9.f(arrayList);
                            } else {
                                fVar = null;
                            }
                            C2917q c2917q = md.b.f39132a;
                            c2917q.getClass();
                            String d10 = c2917q.d(A7.b.U0(B9.f.Companion.serializer()), fVar);
                            W.W(c5436z.f44773f, "DeviceContext: Screen: " + d10 + Separators.SP + c2325q2, null, null, 6);
                            c5417g2.f44684Y = null;
                            c5417g2.f44685Z = null;
                            c5417g2.f44689k0 = 4;
                            i11 = i(c5436z, c2325q2, d10, 0, c5417g2, 12);
                            if (i11 != enumC5000a) {
                                return enumC5000a;
                            }
                            return i11;
                        }
                        N.B0(obj);
                        return null;
                    }
                    ?? r32 = c5417g2.f44686h0;
                    C2325q c2325q5 = c5417g2.f44685Z;
                    c5436z2 = c5417g2.f44684Y;
                    N.B0(obj);
                    c5418h2 = r32;
                    c2325q3 = c2325q5;
                } else {
                    N.B0(obj);
                    F0 f02 = this.f44771d.f2004a;
                    c5417g2.f44684Y = this;
                    c2325q3 = c2325q;
                    c5417g2.f44685Z = c2325q3;
                    c5418h2 = c5418h;
                    c5417g2.f44686h0 = c5418h2;
                    c5417g2.f44689k0 = 1;
                    obj = L4.a.o0(f02, c5417g2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5436z2 = this;
                }
                if (obj != null) {
                    Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
                    c5417g2.f44684Y = null;
                    c5417g2.f44685Z = null;
                    c5417g2.f44686h0 = null;
                    c5417g2.f44689k0 = 2;
                    if (c5418h2.invoke(intent, c5417g2) == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (Build.VERSION.SDK_INT >= 29) {
                    F0 f03 = c5436z2.f44771d.f2004a;
                    c5417g2.f44684Y = c5436z2;
                    c5417g2.f44685Z = c2325q3;
                    c5417g2.f44686h0 = null;
                    c5417g2.f44689k0 = 3;
                    obj = L4.a.o0(f03, c5417g2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c2325q2 = c2325q3;
                    c5436z = c5436z2;
                    h10 = AbstractC5337a.h(obj);
                    Pc.g gVar2 = c5436z.f44773f;
                    if (h10 == null) {
                    }
                    W.F(gVar2, "AssistantInteractionSession onHandleAssist: " + h10 + Separators.SP + assistStructure, null, 6);
                    if (h10 == null) {
                    }
                    if (assistStructure2 == null) {
                    }
                    C2917q c2917q2 = md.b.f39132a;
                    c2917q2.getClass();
                    String d102 = c2917q2.d(A7.b.U0(B9.f.Companion.serializer()), fVar);
                    W.W(c5436z.f44773f, "DeviceContext: Screen: " + d102 + Separators.SP + c2325q2, null, null, 6);
                    c5417g2.f44684Y = null;
                    c5417g2.f44685Z = null;
                    c5417g2.f44689k0 = 4;
                    i11 = i(c5436z, c2325q2, d102, 0, c5417g2, 12);
                    if (i11 != enumC5000a) {
                    }
                }
                return null;
            }
        }
        c5417g = new C5417g(this, abstractC4825e);
        C5417g c5417g22 = c5417g;
        obj = c5417g22.f44687i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5417g22.f44689k0;
        if (i10 == 0) {
        }
        if (obj != null) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    public final Object f(C2325q c2325q, wf.k kVar, AbstractC5156c abstractC5156c) {
        String str;
        int i10;
        long j6;
        long j10;
        C2969F c2969f;
        C2969F c2969f2;
        C1939b c1939b;
        M m10;
        C2969F c2969f3 = null;
        C5418h c5418h = new C5418h(c2325q, this, null, kVar);
        if (c2325q != null && (c1939b = c2325q.f26412g) != null && (m10 = c1939b.f24021a) != null) {
            str = m10.f32020d;
        } else {
            str = null;
        }
        if (str == null) {
            if (c2325q != null) {
                Object i11 = i(this, c2325q, "Unsupported Operation", RCHTTPStatusCodes.BAD_REQUEST, abstractC5156c, 8);
                if (i11 != EnumC5000a.f41328Y) {
                    c2969f3 = (C2969F) i11;
                } else {
                    return i11;
                }
            }
            return c2969f3;
        }
        R4.a aVar = EnumC1940c.f24026h0;
        String str2 = c2325q.f26412g.f24021a.f32020d;
        aVar.getClass();
        EnumC1940c Z10 = R4.a.Z(str2);
        if (Z10 == null) {
            i10 = -1;
        } else {
            i10 = AbstractC5411a.f44666a[Z10.ordinal()];
        }
        String str3 = "";
        C1939b c1939b2 = c2325q.f26412g;
        switch (i10) {
            case -1:
                Object i12 = i(this, c2325q, "Unsupported Operation", RCHTTPStatusCodes.BAD_REQUEST, abstractC5156c, 8);
                if (i12 != EnumC5000a.f41328Y) {
                    return (C2969F) i12;
                }
                return i12;
            case 0:
            default:
                throw new RuntimeException();
            case 1:
                String str4 = (String) c1939b2.f24021a.f32022f.get("startTime");
                if (str4 != null) {
                    j6 = p(str4);
                } else {
                    j6 = 0;
                }
                String str5 = (String) c1939b2.f24021a.f32022f.get("endTime");
                if (str5 != null) {
                    j10 = p(str5);
                } else {
                    Mg.a aVar2 = Mg.b.f12127Z;
                    j10 = Mg.b.e(Df.H.x0(24, Mg.d.f12136k0));
                }
                C5402C c5402c = this.f44770c;
                v0 a5 = c5402c.a("android.permission.READ_CALENDAR");
                if (a5 == null) {
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add("dtstart >= ?");
                    arrayList2.add(String.valueOf(System.currentTimeMillis() + j6));
                    arrayList.add("dtend <= ?");
                    arrayList2.add(String.valueOf(System.currentTimeMillis() + j10));
                    Cursor query = c5402c.f44653a.getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{"_id", "title", "dtstart", "dtend", "eventLocation", "description"}, kf.t.m2(arrayList, " AND ", null, null, null, 62), (String[]) arrayList2.toArray(new String[0]), null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            try {
                                long j11 = query.getLong(query.getColumnIndex("_id"));
                                String string = query.getString(query.getColumnIndex("title"));
                                long j12 = query.getLong(query.getColumnIndex("dtstart"));
                                long j13 = query.getLong(query.getColumnIndex("dtend"));
                                String string2 = query.getString(query.getColumnIndex("eventLocation"));
                                String string3 = query.getString(query.getColumnIndex("description"));
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(ParameterNames.ID, j11);
                                jSONObject.put("title", string);
                                jSONObject.put("startDateTime", j12);
                                jSONObject.put("endDateTime", j13);
                                jSONObject.put("location", string2);
                                jSONObject.put("description", string3);
                                jSONArray.put(jSONObject);
                                c2969f3 = null;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } finally {
                                    Ad.l.S(query, th2);
                                }
                            }
                        }
                        th2 = c2969f3;
                    }
                    String jSONArray2 = jSONArray.toString();
                    AbstractC3557B.b0("toString(...)", jSONArray2);
                    a5 = new u0(jSONArray2);
                }
                if (a5 instanceof u0) {
                    String str6 = (String) ((u0) a5).f48468a;
                    if (str6 != null) {
                        Object i13 = i(this, c2325q, str6, 0, abstractC5156c, 12);
                        if (i13 != EnumC5000a.f41328Y) {
                            c2969f = (C2969F) i13;
                        } else {
                            return i13;
                        }
                    } else {
                        c2969f = null;
                    }
                } else {
                    if (a5 instanceof q0) {
                        Throwable th3 = ((q0) a5).f48450a;
                        if (th3 instanceof C5407H) {
                            c2969f2 = null;
                            W.W(this.f44773f, android.gov.nist.core.a.A("Permission ", ((C5407H) th3).f44661Y, " not granted"), null, null, 6);
                        } else {
                            c2969f2 = null;
                        }
                    } else {
                        c2969f2 = null;
                        if (!(a5 instanceof p0)) {
                            throw new RuntimeException();
                        }
                    }
                    c2969f = c2969f2;
                }
                return c2969f;
            case 2:
                return d(c2325q, abstractC5156c);
            case 3:
                String str7 = (String) c1939b2.f24021a.f32022f.get("contact");
                if (str7 != null) {
                    str3 = str7;
                }
                return q(c2325q, str3, new C5431u(c2325q, this, null, c5418h), abstractC5156c);
            case 4:
                String str8 = (String) c1939b2.f24021a.f32022f.get("contact");
                if (str8 != null) {
                    str3 = str8;
                }
                return q(c2325q, str3, new C5421k(c2325q, this, null, c5418h), abstractC5156c);
            case 5:
                return o(c2325q, c5418h, abstractC5156c);
            case 6:
                return g(c2325q, c5418h, abstractC5156c);
            case 7:
                return k(c2325q, c5418h, abstractC5156c);
            case 8:
                return m(c2325q, c5418h, abstractC5156c);
            case 9:
                return j(c2325q, c5418h, abstractC5156c);
            case 10:
                return n(c2325q, c5418h, abstractC5156c);
            case 11:
                return b(c2325q, c5418h, abstractC5156c);
            case 12:
                return e(c2325q, c5418h, abstractC5156c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5420j c5420j;
        int i10;
        C5436z c5436z;
        boolean booleanValue;
        if (abstractC4825e instanceof C5420j) {
            c5420j = (C5420j) abstractC4825e;
            int i11 = c5420j.f44702j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5420j.f44702j0 = i11 - Integer.MIN_VALUE;
                C5420j c5420j2 = c5420j;
                Object obj = c5420j2.f44700h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5420j2.f44702j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5420j2.f44699Z;
                    C5436z c5436z2 = c5420j2.f44698Y;
                    N.B0(obj);
                    c5436z = c5436z2;
                } else {
                    N.B0(obj);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("geo:0,0?q=" + ((String) c2325q.f26412g.f24021a.f32022f.get("query"))));
                    c5420j2.f44698Y = this;
                    c5420j2.f44699Z = c2325q;
                    c5420j2.f44702j0 = 1;
                    obj = c5418h.invoke(intent, c5420j2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    c5436z = this;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                obj = null;
                if (booleanValue) {
                    c5420j2.f44698Y = null;
                    c5420j2.f44699Z = null;
                    c5420j2.f44702j0 = 2;
                    obj = i(c5436z, c2325q, "Map launched", 0, c5420j2, 12);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                return obj;
            }
        }
        c5420j = new C5420j(this, abstractC4825e);
        C5420j c5420j22 = c5420j;
        Object obj3 = c5420j22.f44700h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5420j22.f44702j0;
        if (i10 == 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        obj3 = null;
        if (booleanValue) {
        }
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(C2325q c2325q, String str, int i10, String str2, AbstractC4825e abstractC4825e) {
        C5422l c5422l;
        int i11;
        int i12;
        String str3;
        C2325q c2325q2;
        C2311c c2311c;
        String str4 = str;
        if (abstractC4825e instanceof C5422l) {
            c5422l = (C5422l) abstractC4825e;
            int i13 = c5422l.f44714l0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c5422l.f44714l0 = i13 - Integer.MIN_VALUE;
                Object obj = c5422l.f44712j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c5422l.f44714l0;
                String str5 = null;
                if (i11 == 0) {
                    if (i11 == 1) {
                        int i14 = c5422l.f44711i0;
                        str3 = c5422l.f44710h0;
                        String str6 = c5422l.f44709Z;
                        c2325q2 = c5422l.f44708Y;
                        N.B0(obj);
                        i12 = i14;
                        str4 = str6;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    W.F(this.f44773f, "making reply " + str4, null, 6);
                    Rg.o oVar = ((C4972C) this.f44768a).f41058m;
                    c5422l.f44708Y = c2325q;
                    c5422l.f44709Z = str4;
                    c5422l.f44710h0 = str2;
                    i12 = i10;
                    c5422l.f44711i0 = i12;
                    c5422l.f44714l0 = 1;
                    obj = L4.a.m0(oVar, c5422l);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c2325q2 = c2325q;
                    str3 = str2;
                }
                c2311c = (C2311c) obj;
                if (c2311c != null) {
                    return null;
                }
                String name = c2325q2.f26412g.f24023c.name();
                String str7 = c2325q2.f26412g.f24022b;
                String str8 = c2311c.f26374a;
                AbstractC3557B.c0("conversationId", str8);
                C6182c0.Companion.getClass();
                String a5 = C6180b0.a();
                if (str4 == null) {
                    str4 = "";
                }
                fa.t tVar = new fa.t(str4);
                C6190g0.Companion.getClass();
                EnumC2971H enumC2971H = EnumC2971H.f30052l0;
                EnumC2970G enumC2970G = EnumC2970G.f30034Y;
                T t10 = new T(name, null, null);
                if (str7 != null) {
                    str5 = (String) kf.t.h2(Lg.n.G2(str7, new String[]{Separators.DOT}));
                }
                return new C2969F(a5, str8, tVar, "text-davinci-002-render-sha", enumC2971H, enumC2970G, false, null, null, str7, new X(t10, new Q(str5, Integer.valueOf(i12)), str3, 15), false, null, 6592);
            }
        }
        c5422l = new C5422l(this, abstractC4825e);
        Object obj2 = c5422l.f44712j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c5422l.f44714l0;
        String str52 = null;
        if (i11 == 0) {
        }
        c2311c = (C2311c) obj2;
        if (c2311c != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5428r c5428r;
        int i10;
        C2325q c2325q2;
        C5436z c5436z;
        if (abstractC4825e instanceof C5428r) {
            c5428r = (C5428r) abstractC4825e;
            int i11 = c5428r.f44732j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5428r.f44732j0 = i11 - Integer.MIN_VALUE;
                C5428r c5428r2 = c5428r;
                Object obj = c5428r2.f44730h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5428r2.f44732j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj);
                    } else {
                        C2325q c2325q3 = c5428r2.f44729Z;
                        C5436z c5436z2 = c5428r2.f44728Y;
                        N.B0(obj);
                        c2325q2 = c2325q3;
                        c5436z = c5436z2;
                        c5428r2.f44728Y = null;
                        c5428r2.f44729Z = null;
                        c5428r2.f44732j0 = 2;
                        obj = i(c5436z, c2325q2, "App opened", 0, c5428r2, 12);
                        if (obj != obj2) {
                            return obj2;
                        }
                    }
                } else {
                    N.B0(obj);
                    String str = (String) c2325q.f26412g.f24021a.f32022f.get("packageName");
                    if (str == null) {
                        str = "";
                    }
                    C5402C c5402c = this.f44770c;
                    c5402c.getClass();
                    Object launchIntentForPackage = c5402c.f44653a.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage != null) {
                        c5428r2.f44728Y = this;
                        c5428r2.f44729Z = c2325q;
                        c5428r2.f44732j0 = 1;
                        if (c5418h.invoke(launchIntentForPackage, c5428r2) == obj2) {
                            return obj2;
                        }
                        c5436z = this;
                        c2325q2 = c2325q;
                        c5428r2.f44728Y = null;
                        c5428r2.f44729Z = null;
                        c5428r2.f44732j0 = 2;
                        obj = i(c5436z, c2325q2, "App opened", 0, c5428r2, 12);
                        if (obj != obj2) {
                        }
                    } else {
                        c5428r2.f44732j0 = 3;
                        obj = i(this, c2325q, "App not found", RCHTTPStatusCodes.NOT_FOUND, c5428r2, 8);
                        if (obj == obj2) {
                            return obj2;
                        }
                        return obj;
                    }
                }
                return obj;
            }
        }
        c5428r = new C5428r(this, abstractC4825e);
        C5428r c5428r22 = c5428r;
        Object obj3 = c5428r22.f44730h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5428r22.f44732j0;
        if (i10 == 0) {
        }
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[PHI: r15 
      PHI: (r15v2 java.lang.Object) = (r15v3 java.lang.Object), (r15v1 java.lang.Object) binds: [B:22:0x008a, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5429s c5429s;
        Object obj;
        Object obj2;
        int i10;
        C5436z c5436z;
        if (abstractC4825e instanceof C5429s) {
            c5429s = (C5429s) abstractC4825e;
            int i11 = c5429s.f44737j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5429s.f44737j0 = i11 - Integer.MIN_VALUE;
                C5429s c5429s2 = c5429s;
                obj = c5429s2.f44735h0;
                obj2 = EnumC5000a.f41328Y;
                i10 = c5429s2.f44737j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5429s2.f44734Z;
                    C5436z c5436z2 = c5429s2.f44733Y;
                    N.B0(obj);
                    c5436z = c5436z2;
                } else {
                    N.B0(obj);
                    Intent intent = new Intent("android.media.action.MEDIA_PLAY_FROM_SEARCH");
                    intent.putExtra("query", kf.t.m2(c2325q.f26412g.f24021a.f32022f.values(), Separators.SP, null, null, null, 62));
                    intent.putExtra("android.intent.extra.focus", "vnd.android.cursor.item/*");
                    c5429s2.f44733Y = this;
                    c5429s2.f44734Z = c2325q;
                    c5429s2.f44737j0 = 1;
                    if (c5418h.invoke(intent, c5429s2) == obj2) {
                        return obj2;
                    }
                    c5436z = this;
                }
                c5429s2.f44733Y = null;
                c5429s2.f44734Z = null;
                c5429s2.f44737j0 = 2;
                obj = i(c5436z, c2325q, "Attempting to play music", 0, c5429s2, 12);
                if (obj != obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        c5429s = new C5429s(this, abstractC4825e);
        C5429s c5429s22 = c5429s;
        obj = c5429s22.f44735h0;
        obj2 = EnumC5000a.f41328Y;
        i10 = c5429s22.f44737j0;
        if (i10 == 0) {
        }
        c5429s22.f44733Y = null;
        c5429s22.f44734Z = null;
        c5429s22.f44737j0 = 2;
        obj = i(c5436z, c2325q, "Attempting to play music", 0, c5429s22, 12);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(lb.w wVar, AbstractC4825e abstractC4825e) {
        C5430t c5430t;
        int i10;
        lb.w wVar2;
        C5436z c5436z;
        C3959i c3959i;
        if (abstractC4825e instanceof C5430t) {
            c5430t = (C5430t) abstractC4825e;
            int i11 = c5430t.f44742j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5430t.f44742j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5430t.f44740h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5430t.f44742j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return (C2969F) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wf.k kVar = c5430t.f44739Z;
                    c5436z = c5430t.f44738Y;
                    N.B0(obj);
                    wVar2 = kVar;
                } else {
                    N.B0(obj);
                    W.M(this.f44773f, "Rechecking permissions and rerunning client actions", null, 6);
                    AbstractC1206i c10 = c();
                    c5430t.f44738Y = this;
                    c5430t.f44739Z = wVar;
                    c5430t.f44742j0 = 1;
                    obj = L4.a.o0(c10, c5430t);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5436z = this;
                    wVar2 = wVar;
                }
                c3959i = (C3959i) obj;
                if (c3959i != null) {
                    return null;
                }
                c5430t.f44738Y = null;
                c5430t.f44739Z = null;
                c5430t.f44742j0 = 2;
                obj = c5436z.f((C2325q) c3959i.f36155Y, wVar2, c5430t);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                return (C2969F) obj;
            }
        }
        c5430t = new C5430t(this, abstractC4825e);
        Object obj2 = c5430t.f44740h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5430t.f44742j0;
        if (i10 == 0) {
        }
        c3959i = (C3959i) obj2;
        if (c3959i != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5433w c5433w;
        Object obj;
        int i10;
        C5436z c5436z;
        Integer num;
        Integer num2;
        if (abstractC4825e instanceof C5433w) {
            c5433w = (C5433w) abstractC4825e;
            int i11 = c5433w.f44757j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5433w.f44757j0 = i11 - Integer.MIN_VALUE;
                C5433w c5433w2 = c5433w;
                obj = c5433w2.f44755h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5433w2.f44757j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5433w2.f44754Z;
                    C5436z c5436z2 = c5433w2.f44753Y;
                    N.B0(obj);
                    c5436z = c5436z2;
                } else {
                    N.B0(obj);
                    Intent intent = new Intent("android.intent.action.SET_ALARM");
                    String str = (String) c2325q.f26412g.f24021a.f32022f.get("hour");
                    if (str != null) {
                        num = new Integer(Integer.parseInt(str));
                    } else {
                        num = null;
                    }
                    intent.putExtra("android.intent.extra.alarm.HOUR", num);
                    String str2 = (String) c2325q.f26412g.f24021a.f32022f.get("minutes");
                    if (str2 != null) {
                        num2 = new Integer(Integer.parseInt(str2));
                    } else {
                        num2 = null;
                    }
                    intent.putExtra("android.intent.extra.alarm.MINUTES", num2);
                    c5433w2.f44753Y = this;
                    c5433w2.f44754Z = c2325q;
                    c5433w2.f44757j0 = 1;
                    obj = c5418h.invoke(intent, c5433w2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    c5436z = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                c5433w2.f44753Y = null;
                c5433w2.f44754Z = null;
                c5433w2.f44757j0 = 2;
                obj = i(c5436z, c2325q, "Alarm set", 0, c5433w2, 12);
                if (obj == obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        c5433w = new C5433w(this, abstractC4825e);
        C5433w c5433w22 = c5433w;
        obj = c5433w22.f44755h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5433w22.f44757j0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5434x c5434x;
        Object obj;
        int i10;
        C5436z c5436z;
        Integer num;
        if (abstractC4825e instanceof C5434x) {
            c5434x = (C5434x) abstractC4825e;
            int i11 = c5434x.f44762j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5434x.f44762j0 = i11 - Integer.MIN_VALUE;
                C5434x c5434x2 = c5434x;
                obj = c5434x2.f44760h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5434x2.f44762j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5434x2.f44759Z;
                    C5436z c5436z2 = c5434x2.f44758Y;
                    N.B0(obj);
                    c5436z = c5436z2;
                } else {
                    N.B0(obj);
                    Intent intent = new Intent("android.intent.action.SET_TIMER");
                    String str = (String) c2325q.f26412g.f24021a.f32022f.get("length");
                    if (str != null) {
                        num = new Integer(Integer.parseInt(str));
                    } else {
                        num = null;
                    }
                    intent.putExtra("android.intent.extra.alarm.LENGTH", num);
                    c5434x2.f44758Y = this;
                    c5434x2.f44759Z = c2325q;
                    c5434x2.f44762j0 = 1;
                    obj = c5418h.invoke(intent, c5434x2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    c5436z = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                c5434x2.f44758Y = null;
                c5434x2.f44759Z = null;
                c5434x2.f44762j0 = 2;
                obj = i(c5436z, c2325q, "Timer set", 0, c5434x2, 12);
                if (obj == obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        c5434x = new C5434x(this, abstractC4825e);
        C5434x c5434x22 = c5434x;
        obj = c5434x22.f44760h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5434x22.f44762j0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(C2325q c2325q, C5418h c5418h, AbstractC4825e abstractC4825e) {
        C5435y c5435y;
        int i10;
        C5436z c5436z;
        boolean booleanValue;
        if (abstractC4825e instanceof C5435y) {
            c5435y = (C5435y) abstractC4825e;
            int i11 = c5435y.f44767j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5435y.f44767j0 = i11 - Integer.MIN_VALUE;
                C5435y c5435y2 = c5435y;
                Object obj = c5435y2.f44765h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c5435y2.f44767j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2325q = c5435y2.f44764Z;
                    C5436z c5436z2 = c5435y2.f44763Y;
                    N.B0(obj);
                    c5436z = c5436z2;
                } else {
                    N.B0(obj);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Object obj3 = c2325q.f26412g.f24021a.f32022f.get("destination");
                    intent.setData(Uri.parse("google.navigation:q=" + obj3));
                    c5435y2.f44763Y = this;
                    c5435y2.f44764Z = c2325q;
                    c5435y2.f44767j0 = 1;
                    obj = c5418h.invoke(intent, c5435y2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    c5436z = this;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                obj = null;
                if (booleanValue) {
                    c5435y2.f44763Y = null;
                    c5435y2.f44764Z = null;
                    c5435y2.f44767j0 = 2;
                    obj = i(c5436z, c2325q, "Navigation started", 0, c5435y2, 12);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                return obj;
            }
        }
        c5435y = new C5435y(this, abstractC4825e);
        C5435y c5435y22 = c5435y;
        Object obj4 = c5435y22.f44765h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c5435y22.f44767j0;
        if (i10 == 0) {
        }
        booleanValue = ((Boolean) obj4).booleanValue();
        obj4 = null;
        if (booleanValue) {
        }
        return obj4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.lang.Throwable, java.lang.Object] */
    public final Object q(C2325q c2325q, String str, wf.n nVar, AbstractC5156c abstractC5156c) {
        List list;
        Integer num;
        if (Patterns.PHONE.matcher(str).matches()) {
            return nVar.invoke(str, abstractC5156c);
        }
        C5402C c5402c = this.f44770c;
        c5402c.getClass();
        v0 a5 = c5402c.a("android.permission.READ_CONTACTS");
        th = 0;
        if (a5 == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Cursor query = c5402c.f44653a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "display_name"}, "display_name LIKE ?", new String[]{android.gov.nist.core.a.A(Separators.PERCENT, str, Separators.PERCENT)}, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        String formatNumber = PhoneNumberUtils.formatNumber(query.getString(query.getColumnIndex("data1")), Locale.getDefault().getCountry());
                        String string = query.getString(query.getColumnIndex("display_name"));
                        AbstractC3557B.Z(string);
                        AbstractC3557B.Z(formatNumber);
                        linkedHashSet.add(new C5410K(string, formatNumber));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                            Ad.l.S(query, th2);
                        }
                    }
                }
            }
            a5 = new u0(kf.t.K2(linkedHashSet));
        }
        if (a5 instanceof u0) {
            list = (List) ((u0) a5).f48468a;
        } else {
            if (a5 instanceof q0) {
                wd.s0 s0Var = (q0) a5;
            } else if (!(a5 instanceof p0)) {
                throw new RuntimeException();
            }
            list = th2;
        }
        if (list != null) {
            num = new Integer(list.size());
        } else {
            num = th2;
        }
        if (num == null) {
            W.M(this.f44773f, "Need to prompt user for permission", th2, 6);
            return th2;
        } else if (num.intValue() == 0) {
            return i(this, c2325q, "Contact not found", RCHTTPStatusCodes.NOT_FOUND, abstractC5156c, 8);
        } else {
            if (num.intValue() == 1) {
                return nVar.invoke(((C5410K) kf.t.f2(list)).f44665b, abstractC5156c);
            }
            C2917q c2917q = md.b.f39132a;
            c2917q.getClass();
            return i(this, c2325q, "Multiple contacts found: ".concat(c2917q.d(new C2695d(C5410K.Companion.serializer(), 0), list)), 409, abstractC5156c, 8);
        }
    }
}
