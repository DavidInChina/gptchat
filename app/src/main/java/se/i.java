package se;

import Lg.n;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import id.AbstractC3557B;
import io.ktor.websocket.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kf.t;
import kf.v;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;
import ve.C6035d;
import wf.o;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6398C;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class i extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public int f45563Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Ie.e f45564Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ C6035d f45565h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ j f45566i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f45567j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC4825e abstractC4825e, boolean z10) {
        super(3, abstractC4825e);
        this.f45566i0 = jVar;
        this.f45567j0 = z10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i iVar = new i(this.f45566i0, (AbstractC4825e) obj3, this.f45567j0);
        iVar.f45564Z = (Ie.e) obj;
        iVar.f45565h0 = (C6035d) obj2;
        return iVar.invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [se.c] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C5622d c5622d;
        io.ktor.websocket.c cVar;
        List list;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45563Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ie.e eVar = this.f45564Z;
            C6035d c6035d = this.f45565h0;
            Je.a aVar = c6035d.f47491a;
            AbstractC6034c d10 = ((C3418c) eVar.f8578Y).d();
            C6398C f6 = d10.f();
            boolean z10 = AbstractC3557B.u1(d10).getContent() instanceof f;
            Object obj2 = c6035d.f47492b;
            Object obj3 = eVar.f8578Y;
            if (!z10) {
                Ei.a aVar2 = k.f45574b;
                aVar2.c("Skipping non-websocket response from " + ((C3418c) obj3).c().O() + ": " + obj2);
                return yVar;
            }
            C6398C c6398c = C6398C.f49826h0;
            if (AbstractC3557B.K(f6, c6398c)) {
                if (obj2 instanceof z) {
                    Ei.a aVar3 = k.f45574b;
                    StringBuilder sb2 = new StringBuilder("Receive websocket session from ");
                    C3418c c3418c = (C3418c) obj3;
                    sb2.append(c3418c.c().O());
                    sb2.append(": ");
                    sb2.append(obj2);
                    aVar3.c(sb2.toString());
                    if (AbstractC3557B.K(aVar.f9097a, C.f37623a.b(C5621c.class))) {
                        z zVar = (z) obj2;
                        j jVar = this.f45566i0;
                        jVar.getClass();
                        AbstractC3557B.c0(ParameterNames.SESSION, zVar);
                        boolean z11 = zVar instanceof io.ktor.websocket.c;
                        if (z11) {
                            cVar = (io.ktor.websocket.c) zVar;
                        } else {
                            long j6 = jVar.f45570a;
                            long j10 = j6 * 2;
                            Ei.a aVar4 = io.ktor.websocket.k.f33661a;
                            if (!z11) {
                                io.ktor.websocket.j jVar2 = new io.ktor.websocket.j(zVar, j6, j10);
                                jVar2.F0(jVar.f45571b);
                                cVar = jVar2;
                            } else {
                                throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession".toString());
                            }
                        }
                        ?? c5621c = new C5621c(c3418c, cVar);
                        if (this.f45567j0) {
                            AbstractC6432u a5 = c3418c.d().a();
                            List list2 = AbstractC6435x.f49956a;
                            String e10 = a5.e("Sec-WebSocket-Extensions");
                            if (e10 != null) {
                                List<String> G22 = n.G2(e10, new String[]{Separators.COMMA});
                                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(G22, 10));
                                for (String str : G22) {
                                    List G23 = n.G2(str, new String[]{Separators.SEMICOLON});
                                    String obj4 = n.U2((String) t.f2(G23)).toString();
                                    List<String> Z12 = t.Z1(G23, 1);
                                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(Z12, 10));
                                    for (String str2 : Z12) {
                                        arrayList2.add(n.U2(str2).toString());
                                    }
                                    arrayList.add(new U3.c(obj4, arrayList2));
                                }
                            }
                            list = new ArrayList();
                            Iterator it = ((List) c3418c.h().b(k.f45573a)).iterator();
                            if (it.hasNext()) {
                                AbstractC2469q0.p(it.next());
                                throw null;
                            }
                        } else {
                            list = v.f37483Y;
                        }
                        c5621c.w0(list);
                        c5622d = c5621c;
                    } else {
                        c5622d = new C5622d(c3418c, (z) obj2);
                    }
                    C6035d c6035d2 = new C6035d(aVar, c5622d);
                    this.f45564Z = null;
                    this.f45563Y = 1;
                    if (eVar.d(c6035d2, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    throw new N7.a("Handshake exception, expected `WebSocketSession` content but was " + obj2, 3);
                }
            } else {
                throw new N7.a("Handshake exception, expected status code " + c6398c.f49834Y + " but was " + f6.f49834Y, 3);
            }
        }
        return yVar;
    }
}
