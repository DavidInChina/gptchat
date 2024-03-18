package Z1;

import com.openai.chatgpt.R;
import e2.C2778j;
import e2.C2782n;
import e2.C2790v;
import io.sentry.android.core.AbstractC3612c;
import j2.C3903e;
import java.util.ArrayList;
import java.util.Iterator;
import jf.C3959i;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final r f23086Z = new r(2);

    /* renamed from: h0  reason: collision with root package name */
    public static final r f23087h0 = new r(3);

    /* renamed from: i0  reason: collision with root package name */
    public static final r f23088i0 = new r(4);

    /* renamed from: j0  reason: collision with root package name */
    public static final r f23089j0 = new r(5);

    /* renamed from: k0  reason: collision with root package name */
    public static final r f23090k0 = new r(6);

    /* renamed from: l0  reason: collision with root package name */
    public static final r f23091l0 = new r(7);

    /* renamed from: m0  reason: collision with root package name */
    public static final r f23092m0 = new r(8);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23093Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10) {
        super(1);
        this.f23093Y = i10;
    }

    public final Boolean a(X1.l lVar) {
        boolean z10;
        switch (this.f23093Y) {
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.valueOf(lVar instanceof Y1.b);
            case 4:
                if (!(lVar instanceof C2790v) && !(lVar instanceof C2782n) && !(lVar instanceof B)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 5:
            default:
                return Boolean.FALSE;
            case 6:
                return Boolean.valueOf(lVar instanceof X1.c);
            case 7:
                return Boolean.valueOf(lVar instanceof Y1.b);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C3959i c3959i;
        C3959i c3959i2;
        X1.i iVar;
        G g10;
        X1.m d10;
        X1.m d11;
        int i10 = this.f23093Y;
        switch (i10) {
            case 0:
                long j6 = ((Z0.g) obj).f22795a;
                switch (i10) {
                    case 0:
                        return Float.valueOf(Z0.g.a(j6) * Z0.g.b(j6));
                    default:
                        return Float.valueOf(Z0.g.b(j6));
                }
            case 1:
                long j10 = ((Z0.g) obj).f22795a;
                switch (i10) {
                    case 0:
                        return Float.valueOf(Z0.g.a(j10) * Z0.g.b(j10));
                    default:
                        return Float.valueOf(Z0.g.b(j10));
                }
            case 2:
                return a((X1.l) obj);
            case 3:
                return a((X1.l) obj);
            case 4:
                return a((X1.l) obj);
            case 5:
                X1.h hVar = (X1.h) obj;
                if (!(hVar instanceof E) && hVar.c().b(new A.X(false, (Object) hVar, 1))) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    X1.m c10 = hVar.c();
                    boolean b10 = c10.b(f23090k0);
                    X1.m mVar = X1.k.f21752b;
                    if (b10) {
                        c3959i = (C3959i) c10.a(new C3959i(null, mVar), m0.f23029v0);
                    } else {
                        c3959i = new C3959i(null, c10);
                    }
                    X1.c cVar = (X1.c) c3959i.f36155Y;
                    X1.m mVar2 = (X1.m) c3959i.f36156Z;
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                    if (((Number) mVar2.a(0, m0.f23031x0)).intValue() > 1) {
                        AbstractC3612c.r("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    if (mVar2.b(f23091l0)) {
                        c3959i2 = (C3959i) mVar2.a(new C3959i(null, mVar), m0.f23030w0);
                    } else {
                        c3959i2 = new C3959i(null, mVar2);
                    }
                    Y1.b bVar = (Y1.b) c3959i2.f36155Y;
                    X1.m mVar3 = (X1.m) c3959i2.f36156Z;
                    arrayList.add(bVar);
                    C3903e c3903e = C3903e.f36006a;
                    if (bVar != null) {
                        X1.a aVar = new X1.a(R.drawable.glance_ripple);
                        iVar = new X1.i();
                        iVar.f21746a = new C2790v(c3903e).d(new C2782n(c3903e));
                        iVar.f21747b = aVar;
                    } else {
                        iVar = null;
                    }
                    if (mVar3.b(f23088i0)) {
                        g10 = (G) mVar3.a(new G((X1.m) null, 3), m0.f23024q0);
                    } else {
                        g10 = new G(mVar3, 1);
                    }
                    arrayList.add(g10.f22831a);
                    arrayList2.add(g10.f22832b.d(new C2790v(c3903e)).d(new C2782n(c3903e)));
                    C2778j c2778j = new C2778j();
                    Iterator it = arrayList.iterator();
                    X1.m mVar4 = mVar;
                    while (it.hasNext()) {
                        X1.m mVar5 = (X1.m) it.next();
                        if (mVar5 != null && (d11 = mVar4.d(mVar5)) != null) {
                            mVar4 = d11;
                        }
                    }
                    c2778j.f28772d = mVar4;
                    ArrayList arrayList3 = c2778j.f21751c;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        X1.m mVar6 = (X1.m) it2.next();
                        if (mVar6 != null && (d10 = mVar.d(mVar6)) != null) {
                            mVar = d10;
                        }
                    }
                    hVar.b(mVar);
                    arrayList3.add(hVar);
                    if (iVar != null) {
                        arrayList3.add(iVar);
                    }
                    return c2778j;
                }
                return hVar;
            case 6:
                return a((X1.l) obj);
            case 7:
                return a((X1.l) obj);
            default:
                return a((X1.l) obj);
        }
    }
}
