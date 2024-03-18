package Gf;

import Df.AbstractC0405d;
import Df.AbstractC0407f;
import Df.AbstractC0408g;
import Mf.AbstractC1013w;
import android.gov.nist.core.Separators;
import fg.C3033a;
import fg.C3056y;
import hg.C3430i;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import jf.C3959i;
import jg.AbstractC3972a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4305d;
import kotlin.jvm.internal.AbstractC4306e;
import lg.C4461f;
import lg.C4464i;

/* loaded from: classes.dex */
public class w0 extends kotlin.jvm.internal.D {
    public static H l(AbstractC4305d abstractC4305d) {
        AbstractC0407f owner = abstractC4305d.getOwner();
        if (owner instanceof H) {
            return (H) owner;
        }
        return C0632f.f6411Z;
    }

    @Override // kotlin.jvm.internal.D
    public final AbstractC0408g a(kotlin.jvm.internal.j jVar) {
        H l10 = l(jVar);
        String name = jVar.getName();
        String signature = jVar.getSignature();
        Object boundReceiver = jVar.getBoundReceiver();
        AbstractC3557B.c0("container", l10);
        AbstractC3557B.c0("name", name);
        AbstractC3557B.c0("signature", signature);
        return new J(l10, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.D
    public final AbstractC0405d b(Class cls) {
        return AbstractC0629c.a(cls);
    }

    @Override // kotlin.jvm.internal.D
    public final AbstractC0407f c(Class cls, String str) {
        C0630d c0630d = AbstractC0629c.f6399a;
        AbstractC3557B.c0("jClass", cls);
        return (AbstractC0407f) AbstractC0629c.f6400b.Z0(cls);
    }

    @Override // kotlin.jvm.internal.D
    public final Df.j d(kotlin.jvm.internal.p pVar) {
        return new L(l(pVar), pVar.getName(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.D
    public final Df.l e(kotlin.jvm.internal.q qVar) {
        return new N(l(qVar), qVar.getName(), qVar.getSignature(), qVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.D
    public final Df.q f(kotlin.jvm.internal.t tVar) {
        return new c0(l(tVar), tVar.getName(), tVar.getSignature(), tVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.D
    public final Df.s g(kotlin.jvm.internal.u uVar) {
        return new f0(l(uVar), uVar.getName(), uVar.getSignature(), uVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.D
    public final Df.u h(kotlin.jvm.internal.v vVar) {
        return new i0(l(vVar), vVar.getName(), vVar.getSignature());
    }

    @Override // kotlin.jvm.internal.D
    public final String i(kotlin.jvm.internal.i iVar) {
        J b10;
        AbstractC3557B.c0("<this>", iVar);
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        J j6 = null;
        if (metadata != null) {
            String[] d12 = metadata.d1();
            if (d12.length == 0) {
                d12 = null;
            }
            if (d12 != null) {
                String[] d22 = metadata.d2();
                C4464i c4464i = jg.i.f36194a;
                AbstractC3557B.c0("strings", d22);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC3972a.b(d12));
                C4464i c4464i2 = jg.i.f36194a;
                jg.h g10 = jg.i.g(byteArrayInputStream, d22);
                C3033a c3033a = C3056y.f30765A0;
                C4464i c4464i3 = jg.i.f36194a;
                c3033a.getClass();
                C4461f c4461f = new C4461f(byteArrayInputStream);
                lg.p b11 = c3033a.b(c4461f, c4464i3);
                boolean z10 = false;
                try {
                    c4461f.a(0);
                    if (b11.isInitialized()) {
                        C3056y c3056y = (C3056y) b11;
                        int[] mv = metadata.mv();
                        if ((metadata.xi() & 8) != 0) {
                            z10 = true;
                        }
                        jg.g gVar = new jg.g(mv, z10);
                        Class<?> cls = iVar.getClass();
                        fg.X x10 = c3056y.f30781u0;
                        AbstractC3557B.b0("getTypeTable(...)", x10);
                        j6 = new J(C0632f.f6411Z, (Pf.T) A0.f(cls, c3056y, g10, new C3430i(x10), gVar, Ff.a.f5369Y));
                    } else {
                        lg.t tVar = new lg.t(new androidx.datastore.preferences.protobuf.n0().getMessage());
                        tVar.f38415Y = b11;
                        throw tVar;
                    }
                } catch (lg.t e10) {
                    e10.f38415Y = b11;
                    throw e10;
                }
            }
        }
        if (j6 != null && (b10 = A0.b(j6)) != null) {
            mg.m mVar = x0.f6498a;
            AbstractC1013w s10 = b10.s();
            StringBuilder sb2 = new StringBuilder();
            x0.a(sb2, s10);
            List S = s10.S();
            AbstractC3557B.b0("getValueParameters(...)", S);
            kf.t.l2(S, sb2, ", ", Separators.LPAREN, Separators.RPAREN, C0627b.f6394q0, 48);
            sb2.append(" -> ");
            Bg.A returnType = s10.getReturnType();
            AbstractC3557B.Z(returnType);
            sb2.append(x0.d(returnType));
            String sb3 = sb2.toString();
            AbstractC3557B.b0("toString(...)", sb3);
            return sb3;
        }
        return super.i(iVar);
    }

    @Override // kotlin.jvm.internal.D
    public final String j(kotlin.jvm.internal.o oVar) {
        return i(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.internal.D
    public final Df.w k(AbstractC0405d abstractC0405d, List list) {
        if (abstractC0405d instanceof AbstractC4306e) {
            Class f6 = ((AbstractC4306e) abstractC0405d).f();
            C0630d c0630d = AbstractC0629c.f6399a;
            AbstractC3557B.c0("jClass", f6);
            AbstractC3557B.c0("arguments", list);
            if (list.isEmpty()) {
                return (Df.w) AbstractC0629c.f6401c.Z0(f6);
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC0629c.f6402d.Z0(f6);
            C3959i c3959i = new C3959i(list, Boolean.FALSE);
            Object obj = concurrentHashMap.get(c3959i);
            Object obj2 = obj;
            if (obj == null) {
                r0 F10 = P4.a.F(AbstractC0629c.a(f6), list, false, kf.v.f37483Y);
                Object putIfAbsent = concurrentHashMap.putIfAbsent(c3959i, F10);
                if (putIfAbsent == null) {
                    obj2 = F10;
                } else {
                    obj2 = putIfAbsent;
                }
            }
            return (Df.w) obj2;
        }
        return P4.a.F(abstractC0405d, list, false, Collections.emptyList());
    }
}
