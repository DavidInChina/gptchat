package s3;

import Bg.c0;
import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Parcelable;
import b7.C2130a;
import com.google.android.gms.internal.play_billing.h1;
import id.AbstractC3557B;
import io.sentry.B1;
import io.sentry.C3634c;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jf.AbstractC3957g;
import kf.C4288m;
import m7.C4567c;
import q.C5241w;
import w.C6060g;
import w7.C6131c;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public Object f45394a;

    /* renamed from: b  reason: collision with root package name */
    public Object f45395b;

    /* renamed from: c  reason: collision with root package name */
    public Object f45396c;

    /* renamed from: d  reason: collision with root package name */
    public Object f45397d;

    /* renamed from: e  reason: collision with root package name */
    public Object f45398e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(int i10) {
        this(new io.sentry.protocol.s((UUID) null), new B1(), (B1) null, (C3634c) null, (Boolean) null);
        if (i10 == 5) {
            this.f45398e = L7.a.f10751Y;
        } else if (i10 != 7) {
        }
    }

    public final C6131c a() {
        return new C6131c((Account) this.f45394a, (C6060g) this.f45395b, (String) this.f45396c, (String) this.f45397d, (L7.a) this.f45398e);
    }

    public final o1.S b() {
        if (((C5542E) this.f45396c) != null) {
            if (!((List) this.f45397d).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                Iterator it = ((List) this.f45397d).iterator();
                AbstractC5540C abstractC5540C = null;
                while (true) {
                    int i10 = 0;
                    if (it.hasNext()) {
                        C5574y c5574y = (C5574y) it.next();
                        int i11 = c5574y.f45392a;
                        AbstractC5540C c10 = c(i11);
                        if (c10 != null) {
                            int[] y10 = c10.y(abstractC5540C);
                            int length = y10.length;
                            while (i10 < length) {
                                arrayList.add(Integer.valueOf(y10[i10]));
                                arrayList2.add(c5574y.f45393b);
                                i10++;
                            }
                            abstractC5540C = c10;
                        } else {
                            int i12 = AbstractC5540C.f45214n0;
                            StringBuilder s10 = android.gov.nist.core.a.s("Navigation destination ", B2.u.w((Context) this.f45394a, i11), " cannot be found in the navigation graph ");
                            s10.append((C5542E) this.f45396c);
                            throw new IllegalArgumentException(s10.toString());
                        }
                    } else {
                        ((Intent) this.f45395b).putExtra("android-support-nav:controller:deepLinkIds", kf.t.J2(arrayList));
                        ((Intent) this.f45395b).putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                        o1.S s11 = new o1.S((Context) this.f45394a);
                        Intent intent = new Intent((Intent) this.f45395b);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(((Context) s11.f40450h0).getPackageManager());
                        }
                        if (component != null) {
                            s11.f(component);
                        }
                        Object obj = s11.f40449Z;
                        ((ArrayList) obj).add(intent);
                        ArrayList arrayList3 = (ArrayList) obj;
                        int size = arrayList3.size();
                        while (i10 < size) {
                            Intent intent2 = (Intent) arrayList3.get(i10);
                            if (intent2 != null) {
                                intent2.putExtra("android-support-nav:controller:deepLinkIntent", (Intent) this.f45395b);
                            }
                            i10++;
                        }
                        return s11;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    public final AbstractC5540C c(int i10) {
        C4288m c4288m = new C4288m();
        C5542E c5542e = (C5542E) this.f45396c;
        AbstractC3557B.Z(c5542e);
        c4288m.addLast(c5542e);
        while (!c4288m.isEmpty()) {
            AbstractC5540C abstractC5540C = (AbstractC5540C) c4288m.removeFirst();
            if (abstractC5540C.f45221l0 == i10) {
                return abstractC5540C;
            }
            if (abstractC5540C instanceof C5542E) {
                C5541D c5541d = new C5541D((C5542E) abstractC5540C);
                while (c5541d.hasNext()) {
                    c4288m.addLast((AbstractC5540C) c5541d.next());
                }
            }
        }
        return null;
    }

    public final Mf.B d() {
        return ((Xf.a) this.f45394a).f21966o;
    }

    public final Ag.u e() {
        return ((Xf.a) this.f45394a).f21952a;
    }

    public final void f(C2130a c2130a) {
        A9.a aVar = new A9.a(6);
        e7.p pVar = (e7.p) this.f45398e;
        z zVar = new z(2);
        e7.i iVar = (e7.i) this.f45394a;
        if (iVar != null) {
            zVar.f45394a = iVar;
            zVar.f45396c = c2130a;
            String str = (String) this.f45395b;
            if (str != null) {
                zVar.f45395b = str;
                b7.d dVar = (b7.d) this.f45397d;
                if (dVar != null) {
                    zVar.f45397d = dVar;
                    b7.b bVar = (b7.b) this.f45396c;
                    if (bVar != null) {
                        zVar.f45398e = bVar;
                        if ("".isEmpty()) {
                            e7.i iVar2 = (e7.i) zVar.f45394a;
                            String str2 = (String) zVar.f45395b;
                            C2130a c2130a2 = (C2130a) zVar.f45396c;
                            b7.d dVar2 = (b7.d) zVar.f45397d;
                            b7.b bVar2 = (b7.b) zVar.f45398e;
                            e7.q qVar = (e7.q) pVar;
                            qVar.getClass();
                            c2130a2.getClass();
                            b7.c cVar = b7.c.f25648Y;
                            iVar2.getClass();
                            U3.u a5 = e7.i.a();
                            a5.O(iVar2.f29006a);
                            a5.P(cVar);
                            a5.f17493h0 = iVar2.f29007b;
                            e7.i h10 = a5.h();
                            C5241w c5241w = new C5241w(4);
                            c5241w.f43578f = new HashMap();
                            c5241w.f43576d = Long.valueOf(((C4567c) qVar.f29021a).a());
                            c5241w.f43577e = Long.valueOf(((C4567c) qVar.f29022b).a());
                            if (str2 != null) {
                                c5241w.f43573a = str2;
                                ((K4.I) dVar2).getClass();
                                c5241w.n(new e7.l(bVar2, ((h1) c2130a2.f25646a).b()));
                                c5241w.f43574b = null;
                                e7.h e10 = c5241w.e();
                                i7.b bVar3 = (i7.b) qVar.f29023c;
                                bVar3.getClass();
                                bVar3.f32741b.execute(new M3.u(bVar3, h10, aVar, e10, 1));
                                return;
                            }
                            throw new NullPointerException("Null transportName");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(""));
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final void g() {
        for (C5574y c5574y : (List) this.f45397d) {
            int i10 = c5574y.f45392a;
            if (c(i10) == null) {
                int i11 = AbstractC5540C.f45214n0;
                StringBuilder s10 = android.gov.nist.core.a.s("Navigation destination ", B2.u.w((Context) this.f45394a, i10), " cannot be found in the navigation graph ");
                s10.append((C5542E) this.f45396c);
                throw new IllegalArgumentException(s10.toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, U3.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, P5.c] */
    public z(Xf.a aVar, Xf.i iVar, AbstractC3957g abstractC3957g) {
        AbstractC3557B.c0("components", aVar);
        AbstractC3557B.c0("typeParameterResolver", iVar);
        AbstractC3557B.c0("delegateForDefaultTypeQualifiers", abstractC3957g);
        this.f45394a = aVar;
        this.f45395b = iVar;
        this.f45396c = abstractC3957g;
        this.f45397d = abstractC3957g;
        ?? obj = new Object();
        obj.f17414Y = this;
        obj.f17415Z = iVar;
        ?? obj2 = new Object();
        obj.f17416h0 = obj2;
        obj.f17417i0 = new c0(obj2);
        this.f45398e = obj;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f45394a = obj;
        this.f45395b = obj2;
        this.f45396c = obj3;
        this.f45397d = obj4;
        this.f45398e = obj5;
    }

    public z(String str) {
        try {
            Ad.l.Z0("The DSN is required.", str);
            URI normalize = new URI(str).normalize();
            String scheme = normalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = normalize.getUserInfo();
            if (userInfo != null && !userInfo.isEmpty()) {
                String[] split = userInfo.split(":", -1);
                String str2 = split[0];
                this.f45397d = str2;
                if (str2 != null && !str2.isEmpty()) {
                    this.f45396c = split.length > 1 ? split[1] : null;
                    String path = normalize.getPath();
                    path = path.endsWith(Separators.SLASH) ? path.substring(0, path.length() - 1) : path;
                    int lastIndexOf = path.lastIndexOf(Separators.SLASH) + 1;
                    String substring = path.substring(0, lastIndexOf);
                    substring = !substring.endsWith(Separators.SLASH) ? substring.concat(Separators.SLASH) : substring;
                    this.f45395b = substring;
                    String substring2 = path.substring(lastIndexOf);
                    this.f45394a = substring2;
                    if (!substring2.isEmpty()) {
                        String host = normalize.getHost();
                        int port = normalize.getPort();
                        this.f45398e = new URI(scheme, null, host, port, substring + "api/" + ((String) this.f45394a), null, null);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                }
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    public z(C5545H c5545h) {
        Intent intent;
        AbstractC3557B.c0("navController", c5545h);
        Context context = c5545h.f45340a;
        AbstractC3557B.c0("context", context);
        this.f45394a = context;
        if (context instanceof Activity) {
            Context context2 = (Context) this.f45394a;
            intent = new Intent(context2, context2.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(((Context) this.f45394a).getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f45395b = intent;
        this.f45397d = new ArrayList();
        this.f45396c = c5545h.j();
    }

    public z(io.sentry.protocol.s sVar, B1 b1, B1 b12, C3634c c3634c, Boolean bool) {
        this.f45394a = sVar;
        this.f45395b = b1;
        this.f45396c = b12;
        this.f45398e = c3634c;
        this.f45397d = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(z zVar) {
        this(r2, r3, r4, r5, (Boolean) zVar.f45397d);
        C3634c c3634c;
        io.sentry.protocol.s sVar = (io.sentry.protocol.s) zVar.f45394a;
        B1 b1 = (B1) zVar.f45395b;
        B1 b12 = (B1) zVar.f45396c;
        C3634c c3634c2 = (C3634c) zVar.f45398e;
        if (c3634c2 != null) {
            c3634c = new C3634c(c3634c2.f34279a, c3634c2.f34280b, c3634c2.f34281c, c3634c2.f34282d);
        } else {
            c3634c = null;
        }
    }
}
